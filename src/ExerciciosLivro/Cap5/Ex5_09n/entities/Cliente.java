package ExerciciosLivro.Cap5.Ex5_09n.entities;

public class Cliente {

    private Character sexo;
    private Integer idade;
    private Escolaridade escolaridade;

    public Cliente(Character sexo, Integer idade, Escolaridade escolaridade) {
        this.sexo = sexo;
        this.idade = idade;
        this.escolaridade = escolaridade;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
}
