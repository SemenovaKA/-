/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.hw1plant;

/**
 *
 * @author Home
 */
public class Plant {
    private String title;
    private int width;
    private int sizeInSm;
    public void grow(int day, int sm){
        System.out.println("Как правило чем старше растение, тем оно больше");
    }
    public void bloom(String flowerColor){
        System.out.println("Большая часть растений цветет для продолжения рода");
    }

    public String getTitle() {
        return title;
    }

    public int getWidth() {
        return width;
    }

    public int getSizeInSm() {
        return sizeInSm;
    }
    public void setWidth(int width){
        this.width = width;
        if (width<0){
           this.width=0;
        }
    }
    public void setSizeInSm(int sizeInSm){
        this.sizeInSm = sizeInSm;
        if (sizeInSm<0){
           this.sizeInSm=0;
        }
    }
    public Plant(String title, int nomberOfLeaves, int sizeInSm){
        this.width=width;
        this.sizeInSm=sizeInSm;
        this.title=title;
    }
    @Override
    public String toString() {
        String str = "Title = "+ getTitle() + ", Width = "+ getWidth() + ", Size In Sm= "+ getSizeInSm();
        return str;
    }
}
