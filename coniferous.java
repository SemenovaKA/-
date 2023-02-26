/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw1plant;

/**
 *
 * @author Home
 */
public class coniferous extends trees {
    private String needleСolor;
    private int lenghtOfNeedles;
    private int powerOfTheSmellOfNeedles;
    public void growNeedles(int nomberOfNeedles){
        System.out.println("У хвойных деревьев вместо листьев иголки");
    }
    public void beAlwaysGreen(String season){
        System.out.println("Хвойные деревья не сбрасывают иглы зимой");
    }

    public String getNeedleСolor() {
        return needleСolor;
    }

    public int getLenghtOfNeedles() {
        return lenghtOfNeedles;
    }

    public int getPowerOfTheSmellOfNeedles() {
        return powerOfTheSmellOfNeedles;
    }
    public void setLenghtOfNeedles(int lenghtOfNeedles){
        this.lenghtOfNeedles = lenghtOfNeedles;
        if (lenghtOfNeedles<0){
           this.lenghtOfNeedles=0;
        }
    }
    public void setPowerOfTheSmellOfNeedles(int powerOfTheSmellOfNeedles){
        this.powerOfTheSmellOfNeedles = powerOfTheSmellOfNeedles;
        if (powerOfTheSmellOfNeedles<0){
           this.powerOfTheSmellOfNeedles=0;
        }
    }
     public coniferous(String barkColor, int nomberOfHollow, int nomberOfTwig){
        super(barkColor, nomberOfHollow, nomberOfTwig);
        this.powerOfTheSmellOfNeedles=powerOfTheSmellOfNeedles;
        this.needleСolor=needleСolor;
        this.lenghtOfNeedles=lenghtOfNeedles;
    }
     @Override
    public String toString() {
        String str = "Title ="+ getTitle() + ", Width = "+ getWidth() + ", Size In Sm= "+ getSizeInSm() + ", Bark Color = "+ getBarkColor() + ", Nomber Of Hollow" + getNomberOfHollow() + ", Needle Сolor" + getNeedleСolor() + ", Lenght Of Needles " + getLenghtOfNeedles() + ", Power Of The Smell Of Needles " + getPowerOfTheSmellOfNeedles();
        return str;
    }
    
}
