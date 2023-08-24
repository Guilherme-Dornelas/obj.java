package br.senai.sp;

import java.util.Scanner;

public class Register  {

    // instanciar scanner

    Scanner teclado = new Scanner(System.in);
    void Register(){

        // instanciar aluno
        aluno objAluno = new aluno();

        System.out.println("qual a nome do aluno");
        objAluno.nome = teclado.next();
        System.out.println("o nome do aluno e: " + objAluno.nome);
        System.out.println("---------------------------------------");
        System.out.println("qual idade do aluno?");
        objAluno.idade = teclado.nextInt();
        System.out.println(" a idade do aluno " + objAluno.idade);
        System.out.println("---------------------------------------");
        System.out.println("qual sua disciplina?");
        objAluno.disciplina = teclado.next();
        System.out.println("Disciplina: " +  objAluno.disciplina);
        System.out.println("---------------------------------------");
        System.out.println("digite sua media1!");
        objAluno.media1 = teclado.nextInt();
        System.out.println("media' do Aluno: " +  objAluno.media1);
        System.out.println("---------------------------------------");
        System.out.println("digite a media2");
        objAluno.media2 = teclado.nextInt();
        System.out.println("a segunda media do aluno e: " + objAluno.media2);
    }

    void prof(){
        // instanciar scanner
        Scanner tecaldo = new Scanner(System.in);

        // instaciar Professor
        Professor objProfessor = new Professor();

        System.out.println("qual o nome do prof");
        objProfessor.nome = tecaldo.next();
        System.out.println("seu nome e:" + objProfessor.nome);
        System.out.println("---------------------------------");
        System.out.println("qual sua idade?");
        objProfessor.idade = tecaldo.nextInt();
        System.out.println("sua idade e: " + objProfessor.idade);
        System.out.println("--------------------------------");
        System.out.println("qual sua disciplina?");
        objProfessor.disciplina = tecaldo.next();
        System.out.println("sua disciplina e: " + objProfessor.disciplina);
        System.out.println("------------------------------------");
        System.out.println("qual seu telefone?");
        objProfessor.telefone = tecaldo.nextInt();
        System.out.println("confirme seu telefone! " + objProfessor.telefone);
        System.out.println("fim dos dados so prof");

        System.out.println("------------------------------------");
    }

    void register2(){
        this.prof();
        this.Register();
    }





}
