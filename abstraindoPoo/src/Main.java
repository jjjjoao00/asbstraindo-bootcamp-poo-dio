import dio.abstraindo.poo.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //instanciando os objetos
        Curso curso1 = new Curso();
        curso1.setTitulo("JAVA");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("JAVASCRIPT");
        curso1.setDescricao("Curso JavaScript");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now()); //.now atribui a data da criação do metodo
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição");


        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devMario = new Dev();
        devMario.setNome("Mario");
        devMario.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Mario: " + devMario.getConteudosInscritos());
        devMario.progredir();
        System.out.println("Conteudos inscritos Mario: " + devMario.getConteudosInscritos());
        System.out.println("Conteudos concluidos Mario: " + devMario.getConteudosConcluidos());
        System.out.println("XP: " + devMario.calcularTotalXp());


        Dev devJosefina = new Dev();
        devJosefina.setNome("Josefina");
        devJosefina.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Josefina: " + devJosefina.getConteudosInscritos());
        //devJosefina.progredir();
        System.out.println("Conteudos inscritos Josefina: " + devJosefina.getConteudosInscritos());
        System.out.println("Conteudos concluidos Josefina: " + devJosefina.getConteudosConcluidos());
        System.out.println("XP: " + devJosefina.calcularTotalXp());


    /*
        System.out.println(curso1);
        System.out.println(mentoria1);*/




    }
}