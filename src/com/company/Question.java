package com.company;

import java.util.Scanner;

public abstract class Question {
    private String question;
    private String rightAnswer;
    private ArrayList<String> answerOptions;
    private Integer scoreValue;
    private Boolean rightResponse;

    public Question(String question, String rightAnswer, ArrayList<String> answerOptions, Integer scoreValue){
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.answerOptions = answerOptions;
        this.scoreValue = scoreValue;
    }


    public String askQuestion (){
        return "I asked";
    }
    //record the answer
    public void getUserResponse() {
        Scanner in = new Scanner(System.in);


    }//end of getUserResponse METHOD
    //grade question
    //based on user answer changes correct property to true/false
    // ask question


}
