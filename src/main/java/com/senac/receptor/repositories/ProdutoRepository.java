package com.senac.receptor.repositories;

import com.senac.receptor.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository <Produto, Integer>{
}
