package com.univesp.laboratorio.repository;

import com.univesp.laboratorio.model.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlunoRepository extends JpaRepository< AlunoEntity,Long> {

}
