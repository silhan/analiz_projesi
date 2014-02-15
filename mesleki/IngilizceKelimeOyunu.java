/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ingilizce.kelime.oyunu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author samet
 */
public class IngilizceKelimeOyunu {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String[][] Array={{"apple","elma"},{"banana","muz"},{"involve","kapsamak"},{"common","yaygin"},{"involve","kapsamak"}
                            ,{"below","altinda"},{"blend","karistirmak"},{"absense","yokluk"},{"above","ustunde"},{"absorbent","emici"}
                            ,{"prefer","tercih etmek"},{"fabulous","inanilmaz"},{"defined","tanimli"},{"pear","armut"}
                            ,{"whether","olup olmadigini"},{"elbow","dirsek"},{"identical","ozdes"},{"silly","aptalca"}
                            ,{"pineapple","ananas"},{"headlight","far"},{"stakeout","gozetleme"},{"curtain","perde"},{"berserk","cilgin"}
                            ,{"plucky","cesur"},{"clue","ipucu"},{"in front of","onunde"},{"substitude","yedek"},{"lay down","baslamak"}
                            ,{"lazy","tembel"},{"figure out","anlamak"},{"observation","gozlem"},{"absense","yokluk"},{"wool","yun"}
                            ,{"a spot of","bir kisim"},{"deviation","sapma"},{"effective","etkili"},{"investment","yatirim"}
                            ,{"concerned","ilgili"},{"roughly","tahminen"},{"budget","butce"},{"recruit","acemi"}
                            ,{"insignificent","yetersiz"},{"invent","icat etmek"},{"viewpoint","bakis acisi"},{"association","isbirligi"}};
        String cevap,kelime;
        int rastgele, puan=0,bilemedi,i,j,k;
        Random rnd=new Random();
        Scanner test = new Scanner(System.in);
        while(1>0){
            bilemedi=0;
            rastgele=rnd.nextInt(Array.length);
            kelime=Array[rastgele][1];
            k=kelime.indexOf(" ");
            
            System.out.println("sıradaki sorumuz: "+Array[rastgele][0]);
            for(i=0;i<kelime.length();i++){
                if(i==k){System.out.print(" ");}else{
                System.out.print("*");}
            }
            System.out.println("");
            cevap=test.nextLine();
            if(cevap.equals("exit"))break;
            while(!cevap.equals(kelime)&& bilemedi<kelime.length()){
                bilemedi++;
                for(i=0;i<bilemedi;i++){
                if(i==k){System.out.print(" ");}else{
                System.out.print(kelime.charAt(i));}
            }
                for(j=i;j<kelime.length();j++){
                if(j==k){System.out.print(" ");}else{
                System.out.print("*");}
            }
                
                System.out.println("");
                cevap=test.nextLine();
                if(cevap.equals("exit"))break;
                
            }
            if(cevap.equals("exit"))break;
            puan=puan+kelime.length()-bilemedi;
            System.out.println("puanın: "+puan);
    }
  
}
}
