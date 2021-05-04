package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String word = "Неизвестное слово. " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String engg = dic.engToRus("world");
        System.out.println(engg);
    }
}
