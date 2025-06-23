package dev.CadastrodeSoldados.Soldados;

import dev.CadastrodeSoldados.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity transforma uma classe em entidade no DB
@Entity
//tabela de cadastro dos soldados
@Table(name ="tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SoldadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;

    @Column( unique = true)
    String email;
    Integer idade;

    //Um Soldado só poderá realizar uma única missão
    @ManyToOne
    @JoinColumn(name = "id_missoes") //Foreign Key
    private MissoesModel missoes;


}
