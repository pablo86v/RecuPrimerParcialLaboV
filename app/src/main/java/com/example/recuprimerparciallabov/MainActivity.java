package com.example.recuprimerparciallabov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public List<AutoModel> listaAutos = new ArrayList<>();
    private AutoAdapter autoAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.listaAutos = new ArrayList<>();
        this.listaAutos.add(new AutoModel(1,"BMW", "7 Series", 2000));
        this.listaAutos.add(new AutoModel(1,"BMW", "7 Series", 2000));
        this.listaAutos.add(new AutoModel(1,"BMW", "7 Series", 2000));

        setRecyclerView();
    }

    /***
     * Crea el recyclerView, le setea un layout manager y un adapter
     */
    private void setRecyclerView(){
        RecyclerView rv = (RecyclerView)findViewById(R.id.recycler);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        autoAdapter = new AutoAdapter(this.listaAutos, this);
        rv.setAdapter(autoAdapter);
    }

}

