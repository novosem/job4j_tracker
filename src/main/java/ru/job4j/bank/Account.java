package ru.job4j.bank;

import java.util.Objects;

public class Account {
    private String requisit;
    private double balance;

    public Account(String requisit, double balance) {
        this.requisit = requisit;
        this.balance = balance;
    }

    public String getRequisit() {
        return requisit;
    }

    public void setRequisit(String requisit) {
        this.requisit = requisit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisit, account.requisit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisit);
    }
}
