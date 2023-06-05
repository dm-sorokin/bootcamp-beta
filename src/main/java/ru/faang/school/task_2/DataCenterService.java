package ru.faang.school.task_2;

import java.util.List;

public class DataCenterService {
    DataCenter dataCenter;
    public DataCenterService(DataCenter dataCenter) {
        this.dataCenter = dataCenter;
    }
    public void addServer(Server server) {
        dataCenter.getServerList().add(server);
    }

    public void removeServer(Server server) {
        dataCenter.getServerList().remove(server);
    }

    public double getTotalEnergyConsumption() {
        double totalEnergy = 0.0;
        for (Server servers: dataCenter.getServerList()) {
            totalEnergy += servers.getEnergyConsumption();
        }
        return totalEnergy;
    }



    public void printServers() {
        System.out.println("Информация о серверах:");
        for (Server servers: dataCenter.getServerList()) {
            System.out.println("Нагрузка на сервер: " + servers.getLoad() +
                    "; Максимальная нагрузка: " + servers.getMaxLoad() +
                    "; Энергозатраты сервера: " + servers.getEnergyConsumption());
        }
    }
}
