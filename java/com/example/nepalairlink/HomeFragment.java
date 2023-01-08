package com.example.nepalairlink;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private View mainView;
    private Button btnCreateVoucher;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainView = inflater.inflate(R.layout.fragment_home, container, false);
        findViews();
        setOnClick();
        return mainView;
    }


    void setOnClick() {
        btnCreateVoucher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PrintActivity.class);
                startActivity(intent);
            }
        });
    }

    private void findViews() {
        btnCreateVoucher = mainView.findViewById(R.id.btnCreateVoucher);
    }


}