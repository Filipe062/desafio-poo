import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1.toString());

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(15);
        System.out.println(curso2.toString());

        Mentoria  mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1.toString());

        Bootcamp bootcamp = new  Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        System.out.println(bootcamp.getConteudos());

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Luiz" + devLuiz.getConteudosInscrito());

        Dev devFilipe = new Dev();
        devFilipe.setNome("Filipe");
        devFilipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Filipe" + devFilipe.getConteudosInscrito());
        devFilipe.progredir();





    }
}
