package dev.CadastrodeSoldados.Missoes;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    private String nome_missao;
    private String nivel_missao;
    private Long Id_missoes;
}
