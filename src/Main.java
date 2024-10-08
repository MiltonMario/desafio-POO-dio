import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Milton");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Incritos " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("_____________");

        Dev dev2 = new Dev();
        dev2.setNome("Isa");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("_");
        System.out.println("Conteúdos Incritos " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}