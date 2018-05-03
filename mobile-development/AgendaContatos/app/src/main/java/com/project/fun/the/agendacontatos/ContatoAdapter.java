package com.project.fun.the.agendacontatos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Filipe Natanael on 03/05/2018.
 */

public class ContatoAdapter extends ArrayAdapter<Contato> {

    private final Context context;
    private final ArrayList<Contato> elementos;

    public ContatoAdapter(Context context, ArrayList<Contato> elementos) {
        super(context, R.layout.linhas, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linhas, parent, false);

        TextView nome = (TextView) rowView.findViewById(R.id.textViewNome);
        TextView telefone = (TextView) rowView.findViewById(R.id.textViewTelefone);
        ImageView imgViewProfile = (ImageView) rowView.findViewById(R.id.imgViewProfile);

        nome.setText(elementos.get(position).getNome());
        telefone.setText(elementos.get(position).getTelefone());
        
        imgViewProfile.setImageResource(R.drawable.profile);

        return rowView;
    }
}