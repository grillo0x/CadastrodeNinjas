package dev.CadastrodeSoldados.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private List<SoldadoModel> soldados;

}
