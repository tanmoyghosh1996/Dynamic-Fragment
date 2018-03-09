package com.example.tanmoy.dynamic_fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DynamicFragment extends android.app.Fragment {

    EditText et1, et2;
    Button b1;

    public DynamicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dynamic, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {  //Called when the fragment's activity has been created
        super.onActivityCreated(savedInstanceState);

        et1=(EditText)getActivity().findViewById(R.id.et1);
        et2=(EditText)getActivity().findViewById(R.id.et2);
        b1=(Button)getActivity().findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et1.getText().toString();
                Toast.makeText(getActivity(), "Your Name is "+name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*@Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        et1=(EditText)view.findViewById(R.id.et1);
        et2=(EditText)view.findViewById(R.id.et2);
        b1=(Button)view.findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et1.getText().toString();
                Toast.makeText(getActivity(), "Your Name is "+name, Toast.LENGTH_SHORT).show();
            }
        });

    }*/

}
