// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:. imprime um texto de Saída (Output) e pulando um linha.

import java.util.Scanner;
public class Desafio {

    /**
     * @param args
     */
    public static void main(String[] args){
        //Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            //Atribuiu a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        }
        
        if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            //Atribuiu a aliquota de 10% mediante o salário:
            valorImposto = 0.10F * valorSalario;
        }

        if (valorSalario > 2500.00) {
            //Atribuiu a aliquota de 15% mediante o salário:
            valorImposto = 0.15F * valorSalario;
        }

        //REFATORANDO COD
       '<!--
       float valorImposto = 0;

       if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F * valorSalario;
        } else {valorImposto = 0.15F * valorSalario;
        }
        -->'

        //Calcula e imprime a Saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }


}