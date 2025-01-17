package com.example.shaml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AddlistActivity extends AppCompatActivity {

    List<String> addList;
    ArrayAdapter<String> arrayAdapter;
    ListView listView ;

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addlist);
        addList = new ArrayList<>();
        arrayAdapter = new ArrayAdapter<>(this,R.layout.list_view_layout,addList);
        listView = findViewById(R.id.id_list_view);

        listView.setAdapter(arrayAdapter);
        editText = findViewById(R.id.id_edit_text);

    }

    public void addItemToList(View view){
        addList.add(editText.getText().toString());
        arrayAdapter.notifyDataSetChanged();

        editText.setText("");
    }

}