
package com.example.luiz.signoszodiac;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.List;

import static android.R.color.black;

public class MainActivity extends AppCompatActivity {

private ImageView imageAndro;

    private ImageView imageMu;
        private AlertDialog.Builder dialog;
    private Button botaologo;
    private Button botaoMu;
    private Button botaoAlde;
    private Button botaoGemini;
    private Button botaoCancer;
    private Button botaoLeao;
    private Button botaoVirgem;
    private Button botaoLibra;
    private Button botaoEscorpiao;
    private Button botaoSargitario;
    private Button botaoCapricornio;
    private Button botaoAquario;
    private Button botaoPeixes;


        private ListView listaSigno;
        private String[] signos={"Áries","Touro","Gêmeos","Cancêr","Leão","Virgem","Libra","Escorpião","Sargitário","Capricórnio","Aquario","Peixes"};
        private int[] fotos={R.drawable.mu,R.drawable.alderbaran};
        private String[] ataques={"Extinção Estelar!","Grande Chifre!","Outra Dimensão!","Ondas do Inferno!","Relâmpago de plasma!","Tesouro do céu","Cólera dos cem Dragões!","Agulha Escarlate!","Trovão Atomico!","Excalibur!","Execução Aurora!","Rosa Sangrenta!"};
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);



            imageAndro =(ImageView) findViewById(R.id.imagemAndroId);

            botaologo = (Button) findViewById(R.id.botaologoId);
            botaologo.setVisibility(View.VISIBLE);
            botaologo.setBackgroundColor(Color.TRANSPARENT);
            botaologo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.logosom);
                    mp.start();
                }
            });


            //////////////////////MU///////////////////////////////////////////
botaoMu = (Button) findViewById(R.id.buttonMuId);
            botaoMu.setVisibility(View.VISIBLE);
            botaoMu.setBackgroundColor(Color.TRANSPARENT);
botaoMu.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

                ImageView image = new ImageView(MainActivity.this);

        image.setImageResource(R.drawable.mu);
        image.setBackgroundColor(getResources().getColor(black));
        AlertDialog.Builder builder =
                new AlertDialog.Builder(MainActivity.this).
                        setMessage("                      Mu de Áries").
                        setView(image);


        builder.create().show();

        Toast.makeText(getApplicationContext(),ataques[0],Toast.LENGTH_SHORT).show();
        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.extincaoestelar);
        mp.start();
    }
});

            //////////////////////////ALDEBARAN///////////////////////
            botaoAlde = (Button)findViewById(R.id.botaoAldeId);
            botaoAlde.setVisibility(View.VISIBLE);
            botaoAlde.setBackgroundColor(Color.TRANSPARENT);
            botaoAlde.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView image = new ImageView(MainActivity.this);
                    image.setImageResource(R.drawable.alderbaran);
                    image.setBackgroundColor(getResources().getColor(black));

                    AlertDialog.Builder builder =
                            new AlertDialog.Builder(MainActivity.this).
                                    setMessage("                 Aldebaran de Touro").
                                    setView(image);
                    builder.create().show();
                    Toast.makeText(getApplicationContext(),ataques[1],Toast.LENGTH_SHORT).show();

                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.grandechifre);



                    mp.start();
                }
            });

            ////////////////////////////GEMINI///////////////////////////////////////
            botaoGemini = (Button)findViewById(R.id.botaoGeminiId);
            botaoGemini.setVisibility(View.VISIBLE);
            botaoGemini.setBackgroundColor(Color.TRANSPARENT);
            botaoGemini.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView image = new ImageView(MainActivity.this);
                    image.setImageResource(R.drawable.gemini);
                    image.setBackgroundColor(getResources().getColor(black));
                    AlertDialog.Builder builder =
                            new AlertDialog.Builder(MainActivity.this).
                                    setMessage("                     Gemini Saga").
                                    setView(image);
                    builder.create().show();
                    Toast.makeText(getApplicationContext(),ataques[2],Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.outradimensao);



                    mp.start();
                }
            });
            /////////////////////////CANCER////////////////////////////////////////
          botaoCancer = (Button) findViewById(R.id.botaoCancerId);
            botaoCancer.setVisibility(View.VISIBLE);
            botaoCancer.setBackgroundColor(Color.TRANSPARENT);
            botaoCancer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView image = new ImageView(MainActivity.this);
                    image.setImageResource(R.drawable.cancer);
                    image.setBackgroundColor(getResources().getColor(black));
                    AlertDialog.Builder builder =
                            new AlertDialog.Builder(MainActivity.this).
                                    setMessage("        Máscara da Morte de Câncer").
                                    setView(image);
                    builder.create().show();
                    Toast.makeText(getApplicationContext(),ataques[3],Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.ondasinferno);



                    mp.start();
                }
            });
///////////////////////////////////AIORIA//////////////////////////////////////////////////////
            botaoLeao =(Button) findViewById(R.id.botaoLeaoId);
            botaoLeao.setVisibility(View.VISIBLE);
            botaoLeao.setBackgroundColor(Color.TRANSPARENT);
            botaoLeao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView image = new ImageView(MainActivity.this);
                    image.setImageResource(R.drawable.leao);
                    image.setBackgroundColor(getResources().getColor(black));
                    AlertDialog.Builder builder =
                            new AlertDialog.Builder(MainActivity.this).
                                    setMessage("                    Aioria de Leão").
                                    setView(image);
                    builder.create().show();
                    Toast.makeText(getApplicationContext(),ataques[4],Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.relampagoplasma);



                    mp.start();
                }
            });
            //////////////////////////////SHAKA////////////////////////////////////////////////////////
botaoVirgem =(Button) findViewById(R.id.botaoVirgemId);
            botaoVirgem.setVisibility(View.VISIBLE);
            botaoVirgem.setBackgroundColor(Color.TRANSPARENT);
            botaoVirgem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView image = new ImageView(MainActivity.this);
                    image.setImageResource(R.drawable.virgem);
                    image.setBackgroundColor(getResources().getColor(black));
                    AlertDialog.Builder builder =
                            new AlertDialog.Builder(MainActivity.this).
                                    setMessage("                  Shaka de Virgem").
                                    setView(image);
                    builder.create().show();
                    Toast.makeText(getApplicationContext(),ataques[5],Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.tesouroceu);



                    mp.start();
                }
            });
////////////////////////////////////////DOHKO////////////////////////////////////////////////////
            botaoLibra =(Button) findViewById(R.id.botaoLibraId);
            botaoLibra.setVisibility(View.VISIBLE);
            botaoLibra.setBackgroundColor(Color.TRANSPARENT);
            botaoLibra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView image = new ImageView(MainActivity.this);
                    image.setImageResource(R.drawable.libra);
                    image.setBackgroundColor(getResources().getColor(black));
                    AlertDialog.Builder builder =
                            new AlertDialog.Builder(MainActivity.this).
                                    setMessage("                   Dohko de Libra").
                                    setView(image);
                    builder.create().show();
                    Toast.makeText(getApplicationContext(),ataques[6],Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.coleracemdragoes);



                    mp.start();
                }
            });
///////////////////////////////////////////ESCORPIAO////////////////////////////////////////////
            botaoEscorpiao = (Button)findViewById(R.id.botaoEscorpiaoId);
            botaoEscorpiao.setVisibility(View.VISIBLE);
            botaoEscorpiao.setBackgroundColor(Color.TRANSPARENT);
            botaoEscorpiao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView image = new ImageView(MainActivity.this);
                    image.setImageResource(R.drawable.scorpio);
                    image.setBackgroundColor(getResources().getColor(black));
                    AlertDialog.Builder builder =
                            new AlertDialog.Builder(MainActivity.this).
                                    setMessage("                  Milo de Escorpião").
                                    setView(image);
                    builder.create().show();
                    Toast.makeText(getApplicationContext(),ataques[7],Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.agulhaescarlate);



                    mp.start();
                }
            });
            //////////////////////////////SARGITARIO//////////////////////////////////////////////////
botaoSargitario = (Button) findViewById(R.id.botaoSargitarioId);
botaoSargitario.setVisibility(View.VISIBLE);
            botaoSargitario.setBackgroundColor(Color.TRANSPARENT);
            botaoSargitario.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView image = new ImageView(MainActivity.this);
                    image.setImageResource(R.drawable.sargitario);
                    image.setBackgroundColor(getResources().getColor(black));
                    AlertDialog.Builder builder =
                            new AlertDialog.Builder(MainActivity.this).
                                    setMessage("               Aioros De Sargitario").
                                    setView(image);
                    builder.create().show();
                    Toast.makeText(getApplicationContext(),ataques[8],Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.trovaoatomico);



                    mp.start();
                }
            });
////////////////////////////////////CAPRICORNIO///////////////////////////////////////
            botaoCapricornio = (Button)findViewById(R.id.botaoCapricornioId);
            botaoCapricornio.setVisibility(View.VISIBLE);
            botaoCapricornio.setBackgroundColor(Color.TRANSPARENT);
            botaoCapricornio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView image = new ImageView(MainActivity.this);
                    image.setImageResource(R.drawable.capricornio);
                    image.setBackgroundColor(getResources().getColor(black));
                    AlertDialog.Builder builder =
                            new AlertDialog.Builder(MainActivity.this).
                                    setMessage("               Shura de Capricórnio").
                                    setView(image);
                    builder.create().show();
                    Toast.makeText(getApplicationContext(),ataques[9],Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.excalibur);



                    mp.start();
                }
            });
 ///////////////////////////////////////AQUARIO///////////////////////////////////////////////////////
            botaoAquario = (Button) findViewById(R.id.botaoAquarioId);
            botaoAquario.setVisibility(View.VISIBLE);
            botaoAquario.setBackgroundColor(Color.TRANSPARENT);
            botaoAquario.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView image = new ImageView(MainActivity.this);
                    image.setImageResource(R.drawable.aquario);
                    image.setBackgroundColor(getResources().getColor(black));
                    AlertDialog.Builder builder =
                            new AlertDialog.Builder(MainActivity.this).
                                    setMessage("                Camus de Aquário").
                                    setView(image);
                    builder.create().show();

                    Toast.makeText(getApplicationContext(),ataques[10],Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.execucaoaurora);



                    mp.start();
                }
            });
////////////////////////////PEIXES//////////////////////////////////////////////////////////////////
               botaoPeixes = (Button) findViewById(R.id.botaoPeixesId);
               botaoPeixes.setVisibility(View.VISIBLE);
            botaoPeixes.setBackgroundColor(Color.TRANSPARENT);
            botaoPeixes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ImageView image = new ImageView(MainActivity.this);
                    image.setImageResource(R.drawable.peixes);
                    image.setBackgroundColor(getResources().getColor(black));
                    AlertDialog.Builder builder =
                            new AlertDialog.Builder(MainActivity.this).
                                    setMessage("                Albafica de Peixes").
                                    setView(image);
                    builder.create().show();
                    Toast.makeText(getApplicationContext(),ataques[11],Toast.LENGTH_SHORT).show();
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.rosasangrenta);



                    mp.start();
                }
            });

   ///////////////////////////////////////////////////////////////////////////////////////////////////
            imageAndro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.samigoo);
                      Toast.makeText(getApplicationContext(),"Shiryu Amigo!",Toast.LENGTH_LONG).show();


                    mp.start();
                             }
            });

            listaSigno =(ListView) findViewById(R.id.listViewId);
            final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,android.R.id.text1,signos);
            listaSigno.setAdapter(adaptador);



                }




        }



