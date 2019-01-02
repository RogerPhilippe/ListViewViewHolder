package com.example.rpereira.listviewviewholder.model;

public class Items {

    private int mId;
    private String mNome;
    private String mDescricao;

    private Items(int mId, String mNome, String mDescricao) {
        this.mId = mId;
        this.mNome = mNome;
        this.mDescricao = mDescricao;
    }

    public static class Builder {

        private int id;
        private String nome;
        private String descricao;

        public Builder setID(int id) {
            this.id = id;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Items build() {
            return new Items(id, nome, descricao);
        }

    }

    // Getters

    public int getmId() {
        return mId;
    }

    public String getmNome() {
        return mNome;
    }

    public String getmDescricao() {
        return mDescricao;
    }

}
