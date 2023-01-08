package com.example.nepalairlink;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class HistoryFragment extends Fragment {

    private View mainView;
    private TextView txtHistory;
    private EditText edtEmailAddress;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mainView = inflater.inflate(R.layout.fragment_history, container, false);
        findView();
        return  mainView;
    }

    private void findView(){
        txtHistory = mainView.findViewById(R.id.txtHistory);
//        edtEmailAddress = mainView.findViewById(R.id.edtEmailAddress);
    }
}