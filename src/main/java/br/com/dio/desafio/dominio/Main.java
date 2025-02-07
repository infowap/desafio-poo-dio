package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Java Básico");
        curso.setDescricao("Aprenda os conceitos básicos de Java");
        curso.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java Intermediário");
        curso2.setDescricao("Aprenda os conceitos intermediários de Java");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java Avançado");
        mentoria.setDescricao("Aprenda os conceitos avançados de Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Java Avançado");
        mentoria2.setDescricao("Aprenda os conceitos avançados de Java");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(mentoria2);
    }
}