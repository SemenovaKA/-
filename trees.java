/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw1plant;

/**
 *
 * @author Home
 */
public class trees extends Plant{
    private String barkColor;
    private int nomberOfHollow;
    private int nomberTwig;
    public void photosynthesize(int hours){
        System.out.println("Деревья могут делать это только днем");
    }
    public void  shedLeaves(int nomberOfLeaves){
        System.out.println("Деревья сбрасывают листья каждый день,но перед зимой они сбрасыват всю листву");
    }

    public String getBarkColor() {
        return barkColor;
    }

    public int getNomberOfHollow() {
        return nomberOfHollow;
    }

    public int getNomberOfTwig() {
        return nomberTwig;
    }
    public void setNomberOfHollow(int nomberOfHollow){
        this.nomberOfHollow = nomberOfHollow;
        if (nomberOfHollow<0){
           this.nomberOfHollow=0;
        }
    }
    public void setNomberOfTwig(int nomberOfTwig){
        this.nomberTwig = nomberOfTwig;
        if (nomberOfTwig<0){
           this.nomberTwig=0;
        }
    }
     public trees(String title, int nomberOfLeaves, int sizeInSm){
        super(title, nomberOfLeaves, sizeInSm);
        this.barkColor=barkColor;
        this.nomberOfHollow=nomberOfHollow;
        this.nomberTwig=nomberTwig;
        
    }
     @Override
    public String toString() {
        String str = "Title ="+ getTitle() + ", Width = "+ getWidth() + ", Size In Sm= "+ getSizeInSm() + ", Bark Color = "+ getBarkColor() + ", Nomber Of Hollow" + getNomberOfHollow();
        return str;
    }
    
}
