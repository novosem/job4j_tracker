package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банкоского сервиса
 * @author Aleksey Semin
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение всей информации о клиенте и его счетах осуществляется в коллекции типа Map
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод описывает добавление всей информации нового клиента, принимает
     * @param user и если клиента с таким номером паспорта еще нет, добавляет его в коллекцию
     */
    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    /**
     * Метод описывает добавление нового счета клиента, принимает
     * @param passport проверяет существование клиента по номеру паспорта
     * @param account проверяет наличие данного счета у клиента
     */
    public void addAccount(String passport, Account account) {
        User userAddAcc = findByPassport(passport);
        if (userAddAcc != null) {
            List<Account> accounts = users.get(userAddAcc);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод описывает  поиск клиента в коллекции по номеру паспорта
     * @param passport если номер присутствует в коллекции
     * @return возвращает клиента User
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод описывает поиск счета клиента по номеру счета
     * @param passport принимает параметр и вызывает класс findByPassport, затем
     * @param requisite принимает номер счета и проверяет у найденного клиента его счета
     * @return возвращает список счетов
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(s -> s.getRequisit().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Класс описывает процесс перевода денежных средств
     * @param srcPassport номер паспорта клиента отправителя
     * @param srcRequisite номер счета клиента отправителя
     * @param destPassport номер паспорта клиента получателя
     * @param destRequisite номер счета клиента получателя
     * @param amount сумма перевода
     * @return возвращает true если клиенты существуют и имеют счета и у отправителя
     * имеется достаточная сумма на счету
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            rsl = true;
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
        }
        return rsl;
    }
}
