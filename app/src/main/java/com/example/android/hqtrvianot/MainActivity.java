package com.example.android.hqtrvianot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.q6_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.choices_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        SeekBar seekq2 = (SeekBar) findViewById(R.id.q2_seekbar);
        seekq2.incrementProgressBy(5);
    }

   public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
       Log.v("seekbar", "progress" + progress);
   }

    private void checkAnswers() {
        RadioButton q1 = (RadioButton) findViewById(R.id.q1_3);
        SeekBar q2 = (SeekBar) findViewById(R.id.q2_seekbar);
        RadioButton q3 = (RadioButton) findViewById(R.id.q3_4);
        RadioButton q5 = (RadioButton) findViewById(R.id.q5_2);
        Spinner q6 =(Spinner) findViewById(R.id.q6_spinner);
        String text = q6.getSelectedItem().toString();
        RadioButton q7 = (RadioButton) findViewById(R.id.q7_3);
        Log.v("answers", "1: " + q1 + " 2: " + q2 + " 3: " + q3 + " 5: " + q5);
    }

    private void checkBLTq() {
        CheckBox lettuce = (CheckBox) findViewById(R.id.q4_2);
        CheckBox tomato = (CheckBox) findViewById(R.id.q4_3);
        CheckBox bacon = (CheckBox) findViewById(R.id.q4_4);
    }

    public void submitButton(View view) {
        checkAnswers();
    }
}
