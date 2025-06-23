package dev.CadastrodeSoldados.Soldados;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class SoldadoController {

//Adicionar soldado
@PostMapping("/criar")
    public String criarSoldado(){
    return "Soldado criado!";
}

//Procurar todos os soldado
@GetMapping("/todos")
    public String todosSoldados(){
    return "Todos os soldados!";
}
//Mostrar  os soldados por ID
@GetMapping("/todosID")
public String todosSoldadosID(){
    return "Todos os soldados por ID!";
}
// Alterar dados do soldado por id
@PutMapping("/alterarsoldado")
public String alterarsoldadoID(){
    return "Alterar soldado!";
}
// Deletar soldado por ID
@DeleteMapping("/deletarID")
public String deletarSoldadosID(){
    return "Deletar soldado por ID!";
}



}
