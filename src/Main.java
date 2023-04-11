import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Bruno:" + devBruno.getConteudosInscritos());


        devBruno.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Bruno:" + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Bruno:" + devBruno.getConteudosConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXp());

        System.out.println("-----------------------------------------------------------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Carlos:" + devCarlos.getConteudosInscritos());


        devCarlos.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Carlos:" + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Carlos:" + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());





    }
}
