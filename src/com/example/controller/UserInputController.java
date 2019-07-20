package com.example.controller;

import com.example.model.Point;

import java.util.Scanner;

public class UserInputController {

    public Point[] getNumber() {
        Scanner userInput = new Scanner(System.in);
        Point[] numbersFromUser = new Point[2];

        System.out.println("Podaj wspolrzedna X");
        numbersFromUser[0] = new Point();
        numbersFromUser[0].setPositionX(userInput.nextDouble());
        //userInput.nextLine();

        System.out.println("Podaj wspolrzedna Y");
        numbersFromUser[1] = new Point();
        numbersFromUser[1].setPositionY(userInput.nextDouble());
        userInput.nextLine();

        userInput.close();
        return numbersFromUser;
    }
}
