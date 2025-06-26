package dev.CadastrodeSoldados.Controllers;

import dev.CadastrodeSoldados.Models.SoldadoModel;
import dev.CadastrodeSoldados.Repositories.SoldadoRepository;
import dev.CadastrodeSoldados.Services.SoldadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class SoldadoController {

    private SoldadoService soldadoService;

    public SoldadoController(SoldadoService soldadoService) {
        this.soldadoService = soldadoService;
    }

    //Adicionar soldado
@PostMapping("/criar")
    public String criarSoldado(){
    return "Soldado criado!";
}

//Procurar todos os soldado
@GetMapping("/todos")
    public List<SoldadoModel> listarSoldados(){
    return soldadoService.listarSoldados();
}
//Mostrar  os soldados por ID
@GetMapping("/todosID")
public String todosSoldadosID(){
    return "";
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
