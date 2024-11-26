package com.example.p2apli;

import java.io.Serializable;

public class Produto implements Serializable {
    private String nome;
    private String preco;
    private int imagem;
    private String descricao;
    private String avaliacao;

    public Produto(String nome, String preco, int imagem, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
        this.descricao = descricao;
        this.avaliacao = "⭐⭐⭐⭐☆";
    }

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return preco;
    }

    public int getImagem() {
        return imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAvaliacao() {
        return avaliacao;
    }
}

