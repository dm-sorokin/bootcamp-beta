package ru.faang.school.task_2;

public class Server {
    private double load;
    private double maxLoad;
    private double energyConsumption;

    public Server(double load, double maxLoad, double energyConsumption) {
        this.load = load;
        this.maxLoad = maxLoad;
        this.energyConsumption = energyConsumption;
    }

    public double getLoad() {
        return load;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }
}
