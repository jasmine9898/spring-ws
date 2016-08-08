package com.liul.test.spring_ws_test.service;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

@Endpoint
public class SayHelloEndPoint {
	public static final String NAMESPACE_URI = "http://spring-ws/service/liul";
	public static final String REQUEST_LOCAL_NAME = "sayRequest";
	public static final String RESPONSE_LOCAL_NAME = "sayResponse";
	private final SayHello service;
	private final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
			.newInstance();

	@Autowired
	public SayHelloEndPoint(SayHello service) {
		this.service = service;
	}

	@PayloadRoot(localPart = REQUEST_LOCAL_NAME, namespace = NAMESPACE_URI)
	@ResponsePayload
	public Element handleRequest(@RequestPayload Element requestElement)
			throws ParserConfigurationException {
		NodeList children = requestElement.getChildNodes();
		Text requestText = null;
		for (int i = 0; i < children.getLength(); i++) {
			if (children.item(i).getNodeType() == Node.TEXT_NODE) {
				requestText = (Text) children.item(i);
				break;
			}
		}
		if (requestText == null) {
			throw new IllegalArgumentException(
					"Could not find request text node");
		}
		String echo = service.sayHello(requestText.getNodeValue());
		DocumentBuilder documentBuilder = documentBuilderFactory
				.newDocumentBuilder();
		Document document = documentBuilder.newDocument();
		Element responseElement = document.createElementNS(NAMESPACE_URI,
				RESPONSE_LOCAL_NAME);
		Text responseText = document.createTextNode(echo);
		responseElement.appendChild(responseText);
		return responseElement;
	}
}