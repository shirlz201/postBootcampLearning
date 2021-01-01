/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ss.javapractice;

/**
 *
 * @author shirl
 */
public class App {

    public static void main(String[] args) {

        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterest, years);
        
        var payment = new MortgageReport(calculator);
        payment.printMortgage();
        payment.printPaymentSchedule();
    }

}
