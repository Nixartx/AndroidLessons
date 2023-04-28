package com.nixart.tasks;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListFragment extends Fragment {

    interface OnFragmentSendDataListener {
        void onSendData(String data);
    }

    private OnFragmentSendDataListener fragmentSendDataListener;
    String[] countries = { "Brazil", "Argentina", "Colombia", "Chile", "Uruguay"};

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            fragmentSendDataListener = (OnFragmentSendDataListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
                    + " must implement interface OnFragmentInteractionListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        ListView countriesList = view.findViewById(R.id.countriesList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, countries);
        countriesList.setAdapter(adapter);

        countriesList.setOnItemClickListener((parent, v, position, id) -> {
            String selectedItem = (String)parent.getItemAtPosition(position);
            // Send data to Activity
            fragmentSendDataListener.onSendData(selectedItem);
        });
        return view;
    }
}