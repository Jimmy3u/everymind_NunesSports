package com.everymind.desafio.nunes_sports.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produtos")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_produto")
    private long codProduto;
    @Column(name = "nome_produto", nullable = false)
    private String nomeProduto;
    @Column(name = "desc_produto")
    private String descProduto;
    @Column(name = "preco_produto")
    private float precoProduto;

    public Product() {
    }

    public Product(String nomeProduto, String descProduto, float precoProduto) {
        this.nomeProduto = nomeProduto;
        this.descProduto = descProduto;
        this.precoProduto = precoProduto;
    }

    public long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(long codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public float getPrecoProduto() {
        return precoProduto+1;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }

  

}
