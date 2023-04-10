package com.goobras_.prod.entity;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private String cliente;

    @ManyToOne
    @JoinColumn(name = "id_prestador")
    private Number prestador;

    @ManyToOne
    @JoinColumn(name = "id_servico")
    private String servico;

    @Column(name = "data_hora")
    private LocalDateTime dataHora;

    @Column(name = "preco")
    private DecimalFormat preco;

    @Column(name = "status")
    private String status;

    @Column(name = "descricao")
    private String descricao;

    // getters e setters
}
