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
    private final String barkColor;
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

    public int getNomberTwig() {
        return nomberTwig;
    }
    public void setNomberOfHollow(int nomberOfHollow){
        this.nomberOfHollow = nomberOfHollow;
        if (nomberOfHollow<0){
           this.nomberOfHollow=0;
        }
    }
    public void setNomberTwig(int nomberTwig){
        this.nomberTwig = nomberTwig;
        if (nomberTwig<0){
           this.nomberTwig=0;
        }
    }
     public trees(String title, int width, int sizeInSm, String barkColor,int nomberOfHollow,int nomberTwig){
        super(title, width, sizeInSm);
        this.barkColor=barkColor;
        this.nomberOfHollow=nomberOfHollow;
        this.nomberTwig=nomberTwig;
        
    }
     @Override
    public String toString() {
        String str = "Title ="+ getTitle() + ", Width = "+ getWidth() + ", Size In Sm= "+ getSizeInSm() + ", Bark Color = "+ getBarkColor() + ", Nomber Of Hollow= " + getNomberOfHollow()+", Nomber of twig= "+getNomberTwig();
        return str;
    }
    
}
