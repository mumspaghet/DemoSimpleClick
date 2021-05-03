package sg.edu.rp.c346.id20024313.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    //Step 1: Declare the field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2: Link the field variables to UI components in layout
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay= findViewById(R.id.button);
        etInput= findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.radioGroupGender);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                etInput.getText().toString();
                String stringResponse= etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderMale) {
                    stringResponse = "He says "+stringResponse;
                }else{
                    stringResponse= "She says "+stringResponse;
                }
                    tvDisplay.setText(stringResponse);
            }
        });
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                tbtn.getText().toString();
                String response=tbtn.getText().toString();
                if(!tbtn.isChecked()) {
                    btnDisplay.setEnabled(false);
                    etInput.setEnabled(false);
                }
                else {
                    btnDisplay.setEnabled(true);
                    etInput.setEnabled(true);
                }
            }
        });
    }
}