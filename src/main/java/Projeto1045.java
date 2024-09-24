/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Projeto1045 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double A, B, C, maior, A2, BC;

        A = leitor.nextFloat();
        B = leitor.nextFloat();
        C = leitor.nextFloat();
        

        if (B > A) {
            maior = A;
            A = B;
            B = maior;
        }
        if (C > A) {
            maior = A;
            A = C;
            C = maior;
        }

        A2 = Math.pow(A, 2);
        BC = Math.pow(B, 2) + Math.pow(C, 2);
        
        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (A2 == BC) {
                System.out.println("TRIANGULO RETANGULO");
            } else {
                if (A2 > BC) {
                    System.out.println("TRIANGULO OBTUSANGULO");
                } else {
                    if (A2 < BC) {
                        System.out.println("TRIANGULO ACUTANGULO");
                    }
                }
            }
        }

        if (A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
        } else if (A == B || A == C || B == C) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
