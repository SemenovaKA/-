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
    private final String needleСolor;
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
    public coniferous(String title, int width, int sizeInSm, String barkColor, int nomberOfHollow, int nomberTwig, String needleСolor1, int lenghtOfNeedles1, int powerOfTheSmellOfNeedles1){
        super(title, width, sizeInSm,barkColor, nomberOfHollow, nomberTwig);
        this.powerOfTheSmellOfNeedles= powerOfTheSmellOfNeedles1;
        this.needleСolor= needleСolor1;
        this.lenghtOfNeedles=lenghtOfNeedles1;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String str = "Title ="+ getTitle() + ", Width = "+ getWidth() + ", Size In Sm= "+ getSizeInSm() + ", Bark Color = "+ getBarkColor() +", Nomber Of Hollow= " + getNomberOfHollow() +",Nomber of twig= "+ getNomberTwig() + ", Needle Сolor= " + getNeedleСolor() + ", Lenght Of Needles= " + getLenghtOfNeedles() + ", Power Of The Smell Of Needles= " + getPowerOfTheSmellOfNeedles();
        return str;
    }
    
}
