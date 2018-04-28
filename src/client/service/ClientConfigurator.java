package client.service;

import javax.websocket.HandshakeResponse;
import javax.websocket.ClientEndpointConfig.Configurator;

import java.util.List;
import java.util.Map;

/**
 * @author Group10
 * @version 1.0
 * ClientConfigurator class : Put hooks in configuration of client
 */
public class ClientConfigurator extends Configurator {
   
    /**
      * beforeRequest Method
      * @param headers: Configuration headers for client
      */
    @Override
    public void beforeRequest(Map<String, List<String>> headers) {
        super.beforeRequest(headers);
    }

    /**
      * afterRequest Method
      * @param handshakeResponse : Response for TCP handshake
      */
    @Override
    public void afterResponse(HandshakeResponse handshakeResponse) {
        System.out.println(handshakeResponse);
    }
}