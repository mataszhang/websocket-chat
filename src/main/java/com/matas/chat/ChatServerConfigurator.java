package com.matas.chat;

import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;


public class ChatServerConfigurator extends ServerEndpointConfig.Configurator {
    private Transcript transcript;
    
    public ChatServerConfigurator() {
         this.transcript = new Transcript(20);
    }
    
    public Transcript getTranscript() {
        return this.transcript;
    }
    
    @Override
    public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
        System.err.println("Handshake Request headers: " + request.getHeaders());
        System.err.println("Handshake Response headers: " + response.getHeaders());
    }
      
}
