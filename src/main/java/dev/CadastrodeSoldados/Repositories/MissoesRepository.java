package dev.CadastrodeSoldados.Repositories;

import dev.CadastrodeSoldados.Models.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
