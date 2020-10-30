package com.example.recuprimerparciallabov;
import android.view.View;

public class AutoListener implements View.OnClickListener {
    private MainActivity mainActivity;
    private AutoViewHolder autoViewHolder;

    public AutoListener(MainActivity mainActivity, AutoViewHolder autoViewHolder) {
        this.mainActivity = mainActivity;
        this.autoViewHolder = autoViewHolder;
    }

    @Override
    public void onClick(View view){
        AutoModel auto = this.autoViewHolder.auto;
    }
}
