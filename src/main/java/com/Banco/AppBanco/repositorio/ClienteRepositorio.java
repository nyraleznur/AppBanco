package com.Banco.AppBanco.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Banco.AppBanco.entidades.ClienteBanco;

@Repository
public interface ClienteRepositorio extends JpaRepository<ClienteBanco,Long> {
}
