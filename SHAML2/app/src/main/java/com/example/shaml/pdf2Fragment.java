package com.example.shaml;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;


public class pdf2Fragment extends Fragment {

    PDFView pdfView ;

 public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
  View view = inflater.inflate(R.layout.fragment_pdf2, container, false);
       return view;
 }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pdfView =view.findViewById(R.id.pdfView);

pdfView.fromAsset("medicinepdf.pdf").load();
    }
}