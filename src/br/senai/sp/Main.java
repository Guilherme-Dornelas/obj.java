package br.senai.sp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Register obj = new Register();

        Scanner batata = new Scanner(System.in);
        System.out.println("quem voce pretende casdastar?");
        String resposta = batata.next();

        if (resposta.equals("aluno")){
            obj.Register();
        }else if (resposta.equals("ambos")){
            obj.register2();
        } else if(resposta.equals("professor")){
            obj.prof();
        }else {
            System.out.println("escolha invalida");
        }

    }
}
