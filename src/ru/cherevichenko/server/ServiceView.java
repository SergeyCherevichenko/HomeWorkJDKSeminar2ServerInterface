package ru.cherevichenko.server;

import ru.cherevichenko.client.ClientView;

public interface ServiceView {
    boolean serverConnected();
    void clientConnected(ClientView client);
    void sendMessage(String message);
    boolean validateUser(String userName, String password);
    String getChatHistory();
    void clientDisconnected(ClientView client);
}

