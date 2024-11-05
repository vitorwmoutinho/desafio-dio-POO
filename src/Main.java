import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição de Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição de Curso Javascript");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootecampa java developer");
        bootcamp.setDescricao("Descrição Bootecamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootecamp(bootcamp);
        System.out.println("Conteudos Inscritos"+ devCamila.getConteudosInscrito());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos"+ devCamila.getConteudosInscrito());
        System.out.println("Conteudos Concluidos"+ devCamila.getConteudosConcluido());
        System.out.println("Calcular XP"+ devCamila.calcularTotalXp());

        System.out.println("==============================");


        Dev devJoao = new Dev();
        devCamila.setNome("Joao");
        devJoao.inscreverBootecamp(bootcamp);
        System.out.println("Conteudos Inscritos"+ devJoao.getConteudosInscrito());

        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos"+ devJoao.getConteudosInscrito());
        System.out.println("Conteudos Concluidos"+ devJoao.getConteudosConcluido());





    }

}
