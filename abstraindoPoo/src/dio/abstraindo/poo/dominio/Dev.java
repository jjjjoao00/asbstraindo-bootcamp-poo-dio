package dio.abstraindo.poo.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void InscreverBootcamp(BootCamp bootcamp){
        //quando se inscreve todos os conteudos do bootcamp sao adcionados a lista de conteudos inscritos
        this.conteudosInscritos.addAll(bootcamp.getConteudos());//tudo dentro do parentese vai para a collection fora do parentese
        //adcionar o dev no bootcamp
        bootcamp.getDevsInscritos().add(this);

    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); //pega os elementos na ordem em que foram adcionados no set
        //optional resolve os retornos null
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get()); //adciona conteudos em concluidos
            this.conteudosInscritos.remove(conteudo.get());//remove conteudos de inscritos
        }else {
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }


    //sempre que trabalhar com hash usar equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
