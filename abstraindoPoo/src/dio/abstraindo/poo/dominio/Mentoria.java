package dio.abstraindo.poo.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;  //localdate uma das classes que trabalha com data (LocalDate e LocalDateTime)

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //toString


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
