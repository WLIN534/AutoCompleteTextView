package com.zl.autocompletetextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextViewActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    String[] strings = {"asd","sdada","dbasd","andy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.auto_textview);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(AutoCompleteTextViewActivity.this,R.layout.support_simple_spinner_dropdown_item,strings);
        //通过修改源码实现AutoCompleteTextView模糊查询
        com.zl.autocompletetextview.ArrayAdapter<String> arrayAdapter=new com.zl.autocompletetextview.ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,strings);
        autoCompleteTextView.setAdapter(arrayAdapter);
        autoCompleteTextView.setThreshold(1);

    }
}
