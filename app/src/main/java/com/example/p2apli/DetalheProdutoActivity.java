package com.example.p2apli;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetalheProdutoActivity extends AppCompatActivity {

    private ImageView imageViewDetalheProduto;
    private TextView textViewNomeDetalheProduto;
    private TextView textViewDescricaoProduto;
    private TextView textViewPrecoDetalheProduto;
    private Button buttonAdicionarCarrinho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_produto);

        imageViewDetalheProduto = findViewById(R.id.imageViewDetalheProduto);
        textViewNomeDetalheProduto = findViewById(R.id.textViewNomeDetalheProduto);
        textViewDescricaoProduto = findViewById(R.id.textViewDescricaoProduto);
        textViewPrecoDetalheProduto = findViewById(R.id.textViewPrecoDetalheProduto);
        buttonAdicionarCarrinho = findViewById(R.id.buttonAdicionarCarrinho);

        Produto produto = (Produto) getIntent().getSerializableExtra("produto");

        if (produto != null) {
            imageViewDetalheProduto.setImageResource(produto.getImagem());
            textViewNomeDetalheProduto.setText(produto.getNome());
            textViewDescricaoProduto.setText(produto.getDescricao());
            textViewPrecoDetalheProduto.setText(produto.getPreco());
        }

        Button buttonVoltar = findViewById(R.id.buttonVoltar);
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

