package com.everymind.desafio.nunes_sports.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "cod_produto", nullable = false)
    private long codProduto;
    @Column(name = "nome_produto", nullable = false)
    private String NomeProduto;
    @Column(name = "desc_produto")
    private String DescProduto;
    @Column(name = "preco_produto", nullable = false)
    private float PrecoProduto;

    public long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(long codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        NomeProduto = nomeProduto;
    }

    public String getDescProduto() {
        return DescProduto;
    }

    public void setDescProduto(String descProduto) {
        DescProduto = descProduto;
    }

    public float getPrecoProduto() {
        return PrecoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        PrecoProduto = precoProduto;
    }

}
