package dev.CadastrodeSoldados.Services;

import dev.CadastrodeSoldados.Models.SoldadoModel;
import dev.CadastrodeSoldados.Repositories.SoldadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldadoService {

    private SoldadoRepository soldadoRepository;


    public SoldadoService(SoldadoRepository soldadoRepository) {
        this.soldadoRepository = soldadoRepository;
    }

//Listar todos soldados
    public List<SoldadoModel> listarSoldados(){
        return soldadoRepository.findAll();
    }
}
