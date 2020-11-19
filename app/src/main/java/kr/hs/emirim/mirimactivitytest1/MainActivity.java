package kr.hs.emirim.mirimactivitytest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNew = findViewById(R.id.btn);
        btnNew.setOnClickListener(btnNewListener);
        rg = findViewById(R.id.rg);
    }
    View.OnClickListener btnNewListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            switch (rg.getCheckedRadioButtonId()):
            case R.id.rb:
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                break;
            case R.id.rb:
                Intent intent = new Intent(getApplicationContext(), ThridActivity.class);
                break;
        }
    } ;
}