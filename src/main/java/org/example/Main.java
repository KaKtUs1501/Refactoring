package org.example;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(80,1.52);
        System.out.println(human.getBMICategory());
    }
}
class Human {
    public double weight;
    public double height;
    private double bmi;
    public Human(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBMI();
    }

    private double calculateBMI() {
        return weight / (height * height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.bmi = calculateBMI();
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.bmi = calculateBMI();
    }
    public double getBMI() {
        return bmi;
    }
    public String getBMICategory() {
        if (bmi < 18.5) {
            return "Deficit";
        } else if (bmi >= 18.5 & bmi < 25) {
            return "Norm";
        } else if (bmi >= 25 & bmi < 30) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }
}