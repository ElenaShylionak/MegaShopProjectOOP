package by.itstep.elena.megachopproject.controller;

import by.itstep.elena.megachopproject.model.entity.Milk;
import by.itstep.elena.megachopproject.model.entity.Orange;

public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange(200, 3000, 3600);
        Milk milk = new Milk(100, 20, 369);
        System.out.println(milk);

        // тест метода append
        //  StringBuffer sb = new StringBuffer("Тест");
        //    sb.append(" StringBuffer");
        //   System.out.println(sb);
    }
}



