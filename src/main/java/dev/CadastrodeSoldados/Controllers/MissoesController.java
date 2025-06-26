package dev.CadastrodeSoldados.Controllers;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("missoes")
public class MissoesController {
    //Adicionar missão
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso!";
    }

    //Procurar missões
    @GetMapping("/todas")
    public String todasMissoes(){
        return "Todos as missões!";
    }

    // Alterar missoes
    @PutMapping("/alterarMissão")
    public String alterarMissao(){
        return "Alterar Missão!";
    }
    // Deletar soldado por Missão
    @DeleteMapping("/deletarMissao")
    public String deletarMissao(){
        return "Deletar Missão!";
    }


}
