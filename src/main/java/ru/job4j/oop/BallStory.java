package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Ball ball = new Ball();
        Fox fox = new Fox();
        hare.tryEat(ball);
        ball.runOut();
        wolf.tryEat(ball);
        ball.runOut();
        fox.tryEat(ball);
        fox.eat(ball);
    }
}
