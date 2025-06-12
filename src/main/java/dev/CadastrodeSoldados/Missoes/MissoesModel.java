package dev.CadastrodeSoldados.Missoes;

import dev.CadastrodeSoldados.Soldados.SoldadoModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome_missao;
    private String nivel_missao;
    private Long Id_missoes;


    // Uma missão pode ter vários soldados
    @OneToMany(mappedBy = "missoes")
    private List<SoldadoModel> soldados;

}
