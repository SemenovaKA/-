/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.hw1plant;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class HW1Plant {

    public static void main(String[] args) {
        System.out.println("Вариант№4 РИБО-03-21 Семенова Ксения Александровна");
        Scanner in = new Scanner(System.in);
        System.out.println("Plant, trees, coniferous or deciduous? ");
        String plantType= in.nextLine();
        System.out.println("What title? ");
        String title= in.nextLine();
        System.out.println("What width? ");
        int width=in.nextInt();
        System.out.println("size in sm");
        int sizeInSm=in.nextInt();
        if (plantType.equals("Plant")){
             Plant firstPlant = new Plant(title,width,sizeInSm);
             System.out.println(firstPlant.toString());
        }
        else if(plantType.equals("trees")){
            System.out.println("What bark color? ");
             String barkColor= in.nextLine();
             System.out.println("What nomber of hollow? ");
             int nomberOfHollow=in.nextInt();
             System.out.println("What nomber of twig");
             int nomberTwig=in.nextInt();
             trees firstTrees = new trees(barkColor,nomberOfHollow,nomberTwig);
             System.out.println(firstTrees.toString());
        }
        else if(plantType.equals("coniferous")){
            System.out.println("What needle color? ");
             String needleСolor= in.nextLine();
             System.out.println("What lenght of needles? ");
             int lenghtOfNeedles=in.nextInt();
             System.out.println("What power of the smell of needles from 1 to 10?");
             int powerOfTheSmellOfNeedles=in.nextInt();
             coniferous firstConiferous = new coniferous(needleСolor,lenghtOfNeedles,powerOfTheSmellOfNeedles);
             System.out.println(firstConiferous.toString());
        }
        else if(plantType.equals("deciduos")){
            System.out.println("What color of leaves? ");
             String colorOfLeaves= in.nextLine();
             System.out.println("What nomber of leaves? ");
             int nomberOfLeaves=in.nextInt();
             System.out.println("What leaf size?");
             int leafSize=in.nextInt();
             deciduous firstDeciduous = new deciduous(colorOfLeaves,nomberOfLeaves,leafSize);
             System.out.println(firstDeciduous.toString());
        }
        
    
    
    
    
    
    }
       
        
    
    
}
