package com.example.nepalairlink;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class DetailsFragment extends Fragment {

    private View mainView;
    private TextView txtSetUsername, txtSetContact, txtPreview;
    private Button btnLogout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mainView = inflater.inflate(R.layout.fragment_details, container, false);
        findViews();
        setOnClick();
        return mainView;
    }

    void setOnClick() {
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void findViews() {
        btnLogout = mainView.findViewById(R.id.btnLogout);
        txtPreview = mainView.findViewById(R.id.txtPreview);
        txtSetUsername = mainView.findViewById(R.id.txtSetUsername);
        txtSetContact = mainView.findViewById(R.id.txtSetContact);
    }
}