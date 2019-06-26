package br.com.lapaz.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lapaz.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
