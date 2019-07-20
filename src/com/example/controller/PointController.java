package com.example.controller;

import com.example.model.Point;

public class PointController {

    UserInputController userInput;

    public String whatQuarter(Point[] points) {
        if (isFirstQuarter(points[0], points[1])) {
            return "Punkt (" + points[0].getPositionX() + "," + points[1].getPositionY() + ") lezy w I cwiartce ukladu wspolrzednych";
        } else if (isSecondQuarter(points[0], points[1])) {
            return "Punkt (" + points[0].getPositionX() + "," + points[1].getPositionY() + ") lezy w II cwiartce ukladu wspolrzednych";
        } else if (isThirdQuarter(points[0], points[1])) {
            return "Punkt (" + points[0].getPositionX() + "," + points[1].getPositionY() + ") lezy w III cwiartce ukladu wspolrzednych";
        } else if (isFourthQuarter(points[0], points[1])) {
            return "Punkt (" + points[0].getPositionX() + "," + points[1].getPositionY() + ") lezy w IV cwiartce ukladu wspolrzednych";
        } else {
            return "Sprobuj jeszcze raz" + userInput.getNumber();
        }
    }

    public boolean isFirstQuarter(Point x, Point y) {
        return x.getPositionX() > 0 && y.getPositionY() > 0;
    }

    public boolean isSecondQuarter(Point x, Point y) {
        return x.getPositionX() < 0 && y.getPositionY() > 0;
    }

    public boolean isThirdQuarter(Point x, Point y) {
        return x.getPositionX() < 0 && y.getPositionY() < 0;
    }

    public boolean isFourthQuarter(Point x, Point y) {
        return x.getPositionX() > 0 && y.getPositionY() < 0;
    }
}
