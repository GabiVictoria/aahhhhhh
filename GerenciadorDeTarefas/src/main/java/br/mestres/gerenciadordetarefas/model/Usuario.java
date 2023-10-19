package br.mestres.gerenciadordetarefas.model;

import jakarta.persistence.*;

@Table
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
}
