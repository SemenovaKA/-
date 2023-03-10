/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw1plant;

/**
 *
 * @author Home
 */
public class deciduous extends trees {
    private String colorOfLeaves;
    private int nomberOfLeaves;
    private int leafSize;
    public void growLeaves(int nomberOfNeedles){
        System.out.println("Удивительно, но у лиственных деревьев есть листья");
    }
    public void throwOffTheLeaves(String season){
        System.out.println("Сбрасываю листья осенью");
    }
    public String getColorOfLeaves() {
        return colorOfLeaves;
    }

    public int getNomberOfLeaves() {
        return nomberOfLeaves;
    }

    public int getLeafSize() {
        return leafSize;
    }
    public void setNomberOfLeaves(int nomberOfLeaves){
        this.nomberOfLeaves = nomberOfLeaves;
        if (nomberOfLeaves<0){
           this.nomberOfLeaves=0;
        }
    }
    public void setLeafSize(int leafSize){
        this.leafSize = leafSize;
        if (leafSize<0){
           this.leafSize=0;
        }
    }
     public deciduous(String barkColor, int nomberOfHollow, int nomberOfTwig){
        super(barkColor, nomberOfHollow, nomberOfTwig);
        this.colorOfLeaves=colorOfLeaves;
        this.leafSize=leafSize;
        this.nomberOfLeaves=nomberOfLeaves;
    }
     @Override
    public String toString() {
        String str = "Title ="+ getTitle() + ", Width = "+ getWidth() + ", Size In Sm= "+ getSizeInSm() + ", Bark Color = "+ getBarkColor() + ", Nomber Of Hollow" + getNomberOfHollow() + ", Color Of Leaves" + getColorOfLeaves() + ", Leaf Size " + getLeafSize() + ", Nomber Of Leaves " + getNomberOfLeaves();
        return str;
    }
    
}
