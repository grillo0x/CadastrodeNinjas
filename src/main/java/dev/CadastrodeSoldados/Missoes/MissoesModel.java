package dev.CadastrodeSoldados.Missoes;

import dev.CadastrodeSoldados.Soldados.SoldadoModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name ="tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_missoes;


    private String nome_missao;

    private String nivel_missao;

    // Uma missão pode ter vários soldados
    @OneToMany(mappedBy = "missoes")
    private List<SoldadoModel> soldados;

}
