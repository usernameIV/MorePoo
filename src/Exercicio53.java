import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        //53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
        //a) Quantos homens foram cadastrados
        //b) Quantas mulheres foram cadastradas
        //c) A média de idade do grupo
        //d) A média de idade dos homens
        //e) Quantas mulheres tem mais de 20 anos


        //variaveis
        int idade = 0;
        int sexo;
        int contador = 0;
        int qtdDeMulheres = 0;
        int qtdDeHomens = 0;
        int soma = 0;
        int mediaDeIdadeDoGrupo = 0;
        int mediaDeIdadeDosHomens = 0;
        int mulheres = 0;
        int conta = 0;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        while (contador <= 5){
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();

            System.out.println("Digite seu sexo 1 para homem 2 para mulher: ");
            sexo = scanner1.nextInt();
            contador++;

            if (sexo == 1){
                soma = sexo + 1;

            }
            if (sexo == 2){
                soma = sexo + 2;

            }
            if(sexo == 2 && idade >= 20){
                mulheres++;

            }
            if(sexo == 1){
                conta = conta + idade;
                qtdDeHomens++;
            }


        }
        mediaDeIdadeDoGrupo = idade/5;
        mediaDeIdadeDosHomens = conta/ qtdDeHomens;
        System.out.println("Quantidade de mulheres maior que 20 anos " + mulheres);
        System.out.println("Media de idade do grupo:  " + mediaDeIdadeDoGrupo);
        System.out.println("Media de idade dos homens: " + mediaDeIdadeDosHomens);
    }
}
