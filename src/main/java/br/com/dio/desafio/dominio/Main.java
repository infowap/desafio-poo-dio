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

        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(mentoria2);*/

        BootCanp bootcamp = new BootCanp();
        bootcamp.setNome("GFT START #2 Java");
        bootcamp.setDescricao("Bootcamp para formação de desenvolvedores Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Lucas");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos inscritos Lucas: " + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println("\n");
        System.out.println("Conteúdos inscritos Lucas: " + dev.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Lucas: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("\n-------\n");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("\n");
        System.out.println("Conteúdos inscritos João: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());



    }
}