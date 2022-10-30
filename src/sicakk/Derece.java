package sicakk;

import java.util.Scanner;

public class Derece {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int sicaklik;
        System.out.println("Hava sıcaklığınızı giriniz:");
        sicaklik = input.nextInt();
        if(sicaklik<=5){
            System.out.println("Bence evde dur donma");
        }
        if((sicaklik>5) && (sicaklik<=15)){
            System.out.println("Sıkı giyin sinemaya git");
        }
        if((sicaklik>15)&&(sicaklik<=25)){
         System.out.println("Pikniğe gitmeyi dene");
        }
        if(sicaklik>25){
            System.out.println("Yüzmeye gidebilirsin");
        }


    }


}
