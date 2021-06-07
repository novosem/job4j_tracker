package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает создание клинта User
 * @author Alexey Semin
 * @version 1.0
 */
public class User {
    /**
     * Поле passport содержит данные паспорта клиента
     */
    private String passport;
    /**
     * Поле username содержит имя клиента
     */
    private String username;

    /**
     * Конструктор создания клиента
     * @param passport
     * @param username
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     *
     * @return возвращает номер паспорта клиента
     */
    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     *
     * @return возвращает имя клиента
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод описывает сравнение объектов User по номеру паспорта
     * @param o
     * @return возвращает true если номер паспорта одинаков
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
