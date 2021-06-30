package ru.job4j.stream;

public class Client {
    private String name;
    private String surname;
    private String autoMark;
    private String plateNumber;
    private int mileage;
    private boolean clientIs;

    @Override
    public String toString() {
        return "Client{" + "name='" + name + '\''
                + ", surname='" + surname + '\''
                + ", autoMark='" + autoMark + '\''
                + ", plateNumber='" + plateNumber
                + '\'' + ", mileage=" + mileage
                + ", clientIs=" + clientIs
                + '}';
    }

    static class Builder {
        private String name;
        private String surname;
        private String autoMark;
        private String plateNumber;
        private int mileage;
        private boolean clientIs;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildAutomMark(String autoMark) {
            this.autoMark = autoMark;
            return this;
        }

        Builder buildPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }

        Builder buildMillage(int mileage) {
            this.mileage = mileage;
            return this;
        }

        Builder buildClientIs(boolean clientIs) {
            this.clientIs = clientIs;
            return this;
        }

        Client build() {
            Client client = new Client();
            client.name = name;
            client.surname = surname;
            client.autoMark = autoMark;
            client.plateNumber = plateNumber;
            client.mileage = mileage;
            client.clientIs = clientIs;
            return client;
        }
    }

    public static void main(String[] args) {
        Client client = new Builder().buildName("name")
                .buildSurname("surname")
                .buildAutomMark("VAZ")
                .buildPlateNumber("A555AA96")
                .buildMillage(56742)
                .buildClientIs(true)
                .build();
        System.out.println(client);
    }
}

