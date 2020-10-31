package com.example.a2coderslist.vista.detail;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a2coderslist.Mediador;
import com.example.a2coderslist.R;
import com.example.a2coderslist.favoritos.vista.VistaFavoritos;
import com.example.a2coderslist.modelo.master.ContenidoListaMaster;
import com.example.a2coderslist.presentador.detail.IPresentadorDetail;
import com.example.a2coderslist.vista.master.VistaMaster;

public class VistaDetail extends AppCompatActivity implements IVistaDetail {
    private TextView tvTitle,tvDetail;
    private ImageView imageViewAnime;
    private ImageButton buttonFavourite;
    private Mediador mediador;
    private IPresentadorDetail presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvTitle= this.findViewById(R.id.tvTitle);
        tvDetail = this.findViewById(R.id.tvDetail);
        mediador= (Mediador) this.getApplication();
        presentador = mediador.getPresentadorDetail();
        mediador.setVistaDetail(this);
        imageViewAnime = this.findViewById(R.id.imageViewAnime);
        setInformation();
        buttonFavourite = this.findViewById(R.id.buttonFavourite);
        buttonFavourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presentador.onButtonFavouriteClicked();
                mediador.launchActivityForResult(VistaFavoritos.class, VistaDetail.this,0);
                Toast.makeText(getApplicationContext(), "you have added this anime to favourites", Toast.LENGTH_LONG).show();
            }
        });
        Log.d("positionis here", String.valueOf(presentador.getPosition()));

    }
@Override
    public void setInformation(){
    tvTitle.setText(presentador.getItem().getTitle());
    tvDetail.setText(presentador.getDescription());
    imageViewAnime.setImageResource(presentador.getItem().getIcon());
}



}
