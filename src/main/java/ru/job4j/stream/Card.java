package ru.job4j.stream;

import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

      public enum Suit {
        Diamonds, Hearts, Spades, Clubs
    }

    public enum Value {
        V_6, V_7, V_8
    }

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit
                + ", value=" + value + '}';
    }

    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(a -> Stream.of(Value.values())
                        .map(b -> new Card(a, b)))
                .forEach(System.out::println);
    }
}