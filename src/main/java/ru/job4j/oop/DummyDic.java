package ru.job4j.oop;

public class DummyDic {

    public String engToRus() {
        String eng = "Ouch!";
        return eng;
    }

    public static void main(String[] args) {
        DummyDic robert = new DummyDic();
        String say = robert.engToRus();
        System.out.println("Неизвестное слово." + say);
    }
}