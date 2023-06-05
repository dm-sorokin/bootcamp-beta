package ru.faang.school.task_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(5.5, 10, 2.3);
        Server server1 = new Server(6.21, 15, 3.5);

        DataCenterService dataCenterService = new DataCenterService();
        dataCenterService.addServer(server);
        dataCenterService.addServer(server1);

        dataCenterService.printServers();

        System.out.println("\nОбщее потребление электроэнергии серверов: "
                + dataCenterService.getTotalEnergyConsumption());
    }
}
