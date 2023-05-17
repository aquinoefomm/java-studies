package massacorporal;

import java.util.Scanner;

public class MassaCorporal {

    public static void main(String[] args) {
        String nome;
        double peso, alt, imc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Digite seu peso: ");
        peso = Double.parseDouble(sc.nextLine());
        System.out.println("Digite seu altura: ");
        alt = Double.parseDouble(sc.nextLine());
        imc = (peso) / alt * alt;
        System.out.println("Oi, " + nome + ". O seu IMC é igual a " + imc);
        sc.close();
    }

}
