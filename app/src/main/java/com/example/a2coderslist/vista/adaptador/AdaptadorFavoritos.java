package com.example.a2coderslist.vista.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.a2coderslist.R;
import com.example.a2coderslist.modelo.master.ContenidoListaMaster;

import java.util.ArrayList;

public class AdaptadorFavoritos extends ArrayAdapter {
    private ArrayList<ContenidoListaMaster> listaFavoritos;
    private Context context;

    public AdaptadorFavoritos(@NonNull Context context,int i, ArrayList lista){
        super(context,i,lista);
        this.context=context;
        this.listaFavoritos=lista;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // En primer lugar "inflamos" una nueva vista, que serÃ¡ la que se
        // mostrarÃ¡ en la celda del ListView. Para ello primero creamos el
        // inflater, y despuÃ©s inflamos la vista.
        LayoutInflater inflater = LayoutInflater.from(context);
        View item = inflater.inflate(R.layout.item_favourites, null);

        // A partir de la vista, recogeremos los controles que contiene para
        // poder manipularlos.
        // Recogemos el ImageView y le asignamos una foto.
        ImageView iconFavourite = (ImageView) item.findViewById(R.id.iconFavourite);
        iconFavourite.setImageResource(listaFavoritos.get(position).getIcon());

        // Recogemos el TextView para mostrar el nombre y establecemos el
        // nombre.
        TextView textTitleFavorites = (TextView) item.findViewById(R.id.textTitleFavourites);
        textTitleFavorites.setText(listaFavoritos.get(position).getTitle());

        //Recogemos el text view para mostrar la descripción del anime
        TextView textDetailFavourites = (TextView) item.findViewById(R.id.textDetailFavourites);
        textDetailFavourites.setText(listaFavoritos.get(position).getDetail());
        return item;
    }


}
