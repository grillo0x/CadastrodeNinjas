package dev.CadastrodeSoldados.Repositories;

import dev.CadastrodeSoldados.Models.SoldadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoldadoRepository extends JpaRepository<SoldadoModel,Long> {
}
