package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает создание банковского счета клиента
 * @author Aleksey Semin
 * @version 1.0
 */
public class Account {
    /**
     * Хранение номера банковского счета осуществляется в строке String
     */
    private String requisit;
    /**
     * Хранение балланса счета осуществляется в переменной типа double
     */
    private double balance;

    /**
     * Конструктор создания счета
     * @param requisit
     * @param balance
     */
    public Account(String requisit, double balance) {
        this.requisit = requisit;
        this.balance = balance;
    }

    /**
     *
     * @return возвращает номер счета клиента
     */
    public String getRequisit() {
        return requisit;
    }

    public void setRequisit(String requisit) {
        this.requisit = requisit;
    }

    /**
     *
     * @return возвращает балланс счета
     */
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод описывает сравнение объектов Accaount по ноиеру счета
     * @param o
     * @return возвращает true если номер банковского счета одинаков
     */
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
