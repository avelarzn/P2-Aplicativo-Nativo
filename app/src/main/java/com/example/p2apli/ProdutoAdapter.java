package com.example.p2apli;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ProdutoAdapter extends ArrayAdapter<Produto> {

    private Context context;
    private ArrayList<Produto> produtos;

    public ProdutoAdapter(Context context, ArrayList<Produto> produtos) {
        super(context, R.layout.item_produto, produtos);
        this.context = context;
        this.produtos = produtos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.item_produto, parent, false);
        }

        Produto produto = produtos.get(position);

        ImageView imageViewProduto = view.findViewById(R.id.imageViewProduto);
        TextView textViewNomeProduto = view.findViewById(R.id.textViewNomeProduto);
        TextView textViewPreco = view.findViewById(R.id.textViewPreco);
        TextView textViewAvaliacao = view.findViewById(R.id.textViewAvaliacao);

        imageViewProduto.setImageResource(produto.getImagem());
        textViewNomeProduto.setText(produto.getNome());
        textViewPreco.setText(produto.getPreco());
        textViewAvaliacao.setText(produto.getAvaliacao() + "\nMais de 2 mil compras no mês passado");

        return view;
    }
}
