package com.example.p2apli;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listViewProdutos;
    private ArrayList<Produto> listaProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewProdutos = findViewById(R.id.listViewProdutos);

        listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("Apple iPhone 15 (128 GB) — Branco\n", "R$ 4.548,00 \nem até 10x de R$859,90 sem juros\n", R.drawable.celular, "Sobre este item\n" +
                "Marca - Apple\n\n" +
                "Sistema operacional - iOS 16\n\n" +
                "Capacidade de armazenamento da memória - 128 GB\n\n" +
                "Tamanho da tela - 6,1 Polegadas\n\n" +
                "Nome do modelo - iPhone 15"));
        listaProdutos.add(new Produto("Notebook Lenovo IdeaPad 1i i5-1235U 8GB 256GB 15.6 W11\n", "R$2.459,00 De: R$3.099,00 \nem até 10x de R$245,90 sem juros\n", R.drawable.notebook, "Sobre este item\n" +
                "Processador - i5-1235U\n\n" +
                "Tela - 15.6 HD (1366x768) Antirreflexo\n\n" +
                "Sistema Operacional - Windows11\n\n" +
                "Memória RAM - 8GB\n\n" +
                "Armazenamento - 256GB SSD\n\n" +
                "Bluetooth - 5.0\n\n" +
                "Placa de Vídeo - Intel Iris Xe configurada como Intel UHD Graphics\n\n" +
                "Expansível até 24GB (8GB soldado + 16GB SO-DIMM DDR4-3200)"));
        listaProdutos.add(new Produto("Samsung Smart TV 50 Crystal UHD 4K 50DU8000 - Painel Dynamic Crystal Color, Gaming Hub\n", "R$2.446,98 \nem até 12x de R$203,97 sem juros\n", R.drawable.tv, "Sobre este item\n" +
                "Tamanho da tela -50 Polegadas\n" +
                "Marca - SAMSUNG\n\n" +
                "Tecnologia do visor - 4k\n\n" +
                "Resolução - 4K\n\n" +
                "Taxa de atualização - 60 Hz\n\n" +
                "Características especiais - Plana\n\n" +
                "Componentes incluídos - Power Cable, Remote Control, Stand\n\n" +
                "Tecnologia de conectividade - Bluetooth, wireless, usb, hdmi\n\n" +
                "Dimensões do produto - 22,6P x 111,8L x 68,5A centímetros\n\n" +
                "Serviços de Internet compatíveis - [IN] Netflix, Hulu, Amazon Prime Video, Gaming Hub, Steam, Stadia"));
        listaProdutos.add(new Produto("Mouse Gamer Sem Fio Logitech G305 LIGHTSPEED com 6 Botões Programáveis e Até 12.000 DPI - Branco\n", "R$229,90 De:R$304,90 \nem até 3x de R$66,64 sem juros\n", R.drawable.mouse, "Sobre este item\n" +
                "Marca - Logitech G\n\n" +
                "Cor - White\n\n" +
                "Tecnologia de conectividade - Sem fio\n\n" +
                "Características especiais - Portátil, Sem fio\n\n" +
                "Tecnologia de detecção de movimento - Óptico"));
        listaProdutos.add(new Produto("Redragon TECLADO MECANICO GAMER FIZZ RGB PRETO SWITCH MARROM\n", "R$199,90 \nem até 3x R$ 66,64 sem juros\n", R.drawable.teclado, "Sobre este item \nMarca - Redragon\n\n" +
                "Dispositivos compatíveis - PC, Notebook\n\n" +
                "Tecnologia de conectividade - USB-A, USB-C\n\n" +
                "Descrição do teclado - Mecânico\n\n" +
                "Adequação do controle por rádio - Jogo\n\n"));
        ProdutoAdapter adapter = new ProdutoAdapter(this, listaProdutos);
        listViewProdutos.setAdapter(adapter);

        listViewProdutos.setOnItemClickListener((parent, view, position, id) -> {
            Produto produtoSelecionado = listaProdutos.get(position);
            Intent intent = new Intent(MainActivity.this, DetalheProdutoActivity.class);
            intent.putExtra("produto", produtoSelecionado);
            startActivity(intent);
        });
    }
}

