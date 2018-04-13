package com.example.uriel.fragmentsejercicio;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentColores extends Fragment {

    public static final String CLAVE_COLOR="color";

    public FragmentColores() {
        // Required empty public constructor
    }

    public static FragmentColores fabricaDeFragments (Integer color){
        FragmentColores fragmentColores = new FragmentColores();
        Bundle bundle=new Bundle();
        bundle.putInt(CLAVE_COLOR,color);
        fragmentColores.setArguments(bundle);
        return fragmentColores;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle=getArguments();
        Integer color=bundle.getInt(CLAVE_COLOR);

        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        TextView textView=view.findViewById(R.id.fragment_activity_textview);
        View root=view.findViewById(R.id.root);

        Integer colorColorido= ContextCompat.getColor(getContext(),color);
        root.setBackgroundColor(colorColorido);
        return view;
    }

}
