import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("JavaScript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Java Avançado");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java DevPro");
        bootcamp.setDescricao("Descrição DevPro");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTiele = new Dev();
        devTiele.setNome("Tiele");
        devTiele.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devTiele.getConteudosInscritos());
        devTiele.progredir();
        System.out.println("Conteudos Concluidos" + devTiele.getConteudosConcluidos());
        System.out.println("XP:" + devTiele.calcularXP());
        System.out.println();
        System.out.println("==================================================");

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devTiele.inscreverBootCamp(bootcamp);
        System.out.println("Conteudo Inscrito" + devTiele.getConteudosInscritos());
        devTiele.progredir();
        System.out.println("Conteudos Concluidos" + devTiele.getConteudosConcluidos());
        System.out.println("XP:" + devPaula.calcularXP());
        System.out.println();
        System.out.println("===================================================");

    }
}
