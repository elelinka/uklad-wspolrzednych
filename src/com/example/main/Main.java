package com.example.main;

import com.example.controller.PointController;
import com.example.controller.UserInputController;
import com.example.model.Point;

public class Main {

    public static void main(String[] args) {
        UserInputController userInput = new UserInputController();
        PointController pointController = new PointController();

        Point[] point = userInput.getNumber();

        System.out.println(pointController.whatQuarter(point));






    }
}
