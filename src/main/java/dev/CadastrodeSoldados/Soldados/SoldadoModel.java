package dev.CadastrodeSoldados.Soldados;

import jakarta.persistence.*;

//Entity transforma uma classe em entidade no DB
@Entity
//
@Table(name ="tb_cadastro")
public class SoldadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    Integer idade;

    public SoldadoModel(){

    }

    public SoldadoModel(String nome, String email, Integer idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
