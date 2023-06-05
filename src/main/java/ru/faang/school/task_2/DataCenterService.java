package ru.faang.school.task_2;

public class DataCenterService extends DataCenter {
    public void addServer(Server server) {
        serverList.add(server);
    }

    public void removeServer(Server server) {
        serverList.remove(server);
    }
}
