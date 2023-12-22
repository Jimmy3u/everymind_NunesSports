package com.everymind.desafio.nunes_sports.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.everymind.desafio.nunes_sports.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
