package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("Error activity " + active);
        System.out.println("N of error " + status);
        System.out.println("Description " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error1 = new Error();
        error1.printError();
        Error error2 = new Error(true, 2, "System");
        error2.printError();
        Error error3 = new Error(false, 2, "Print");
        error3.printError();
        Error error4 = new Error(false, 237, "Not active");
        error4.printError();
    }
}
