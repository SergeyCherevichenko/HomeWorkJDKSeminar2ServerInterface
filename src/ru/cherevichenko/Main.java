package ru.cherevichenko;

import ru.cherevichenko.client.ClientController;
import ru.cherevichenko.client.ClientGUI;
import ru.cherevichenko.data_base_client.DataBaseClients;
import ru.cherevichenko.data_base_client.Repository;
import ru.cherevichenko.server.ServerWindow;
import ru.cherevichenko.server.ServiceServer;

public class Main {
    public static void main(String[] args) {
        Repository database = new DataBaseClients();
        ServerWindow serverWindow = new ServerWindow();
        ServiceServer serviceServer = new ServiceServer(database, serverWindow);

        database.addClient("user", "password");

        ClientController clientController1 = new ClientController(serverWindow);
        new ClientGUI(clientController1);

        ClientController clientController2 = new ClientController(serverWindow);
        new ClientGUI(clientController2);
    }
}

