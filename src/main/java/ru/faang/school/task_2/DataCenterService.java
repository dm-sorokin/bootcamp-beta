package ru.faang.school.task_2;

import java.util.List;

public class DataCenterService extends DataCenter {
    public void addServer(Server server) {
        serverList.add(server);
    }

    public void removeServer(Server server) {
        serverList.remove(server);
    }

    public double getTotalEnergyConsumption() {
        double totalEnergy = 0.0;
        for (Server servers: serverList) {
            totalEnergy += servers.getEnergyConsumption();
        }
        return totalEnergy;
    }

    public void printServers() {
        System.out.println("Информация о серверах:");
        for (Server servers: serverList) {
            System.out.println("Нагрузка на сервер: " + servers.getLoad() +
                    "; Максимальная нагрузка: " + servers.getMaxLoad() +
                    "; Энергозатраты сервера: " + servers.getEnergyConsumption());
        }
    }
}
