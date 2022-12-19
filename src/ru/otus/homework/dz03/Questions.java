package ru.otus.homework.dz03;


import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String[] testQuestions = new String [3];
        testQuestions [0] = "В файл с каким расширением копируется java-файл";
        testQuestions [1] = "C помощью какой команты git можно получить полную копию удаленного репозитория?";
        testQuestions [2] = "Какой цикл применяется,когда не известно количество итераций";

        String[][] answerQuestion = new String[3][4];
        answerQuestion [0][0] = "1) cs";
        answerQuestion [0][1] = "2) java";
        answerQuestion [0][2] = "3) class";
        answerQuestion [0][3] = "4) exe";
        answerQuestion [1][0] = "1) commit";
        answerQuestion [1][1] = "2) push";
        answerQuestion [1][2] = "3) clone";
        answerQuestion [1][3] = "4) copy";
        answerQuestion [2][0] = "1) while";
        answerQuestion [2][1] = "2) for";
        answerQuestion [2][2] = "3) loop";
        answerQuestion [2][3] = "4) if else";
        int [] correctAnswers = {3,3,1};

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < testQuestions.length; i++) {
            System.out.println(testQuestions[i]);
            for (int j = 0; j < answerQuestion[i].length; j++) {
                System.out.println(answerQuestion[i][j] + " ");
            }
            int answer = scanner.nextInt();
            if (answer == correctAnswers [i]){
                System.out.println("Правильно!");
                correctCount = correctCount + 1;
            } else {
                System.out.println("Не правильно!");
                wrongCount = wrongCount + 1;}
            System.out.println("Ваш ответ: " + answer);
            System.out.println();}
        System.out.println();
        System.out.println("Правильно: " + correctCount + ", неправильно " +
                wrongCount);
    }
        }

