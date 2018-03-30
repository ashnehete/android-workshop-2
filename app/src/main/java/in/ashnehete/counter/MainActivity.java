package in.ashnehete.counter;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String TAG = "MainActivity";
    TextView tvCounter;
    Button btnUp;
    Button btnDown;
    EditText etName;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int b = 0;

        tvCounter = findViewById(R.id.tv_counter);
        btnUp = findViewById(R.id.btn_up);
        btnDown = findViewById(R.id.btn_down);
        etName = findViewById(R.id.et_name);

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                Log.i(TAG, "Counter: " + counter);
                tvCounter.setText(String.valueOf(counter));
                showSnackbar();


                String name = etName.getText().toString();
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();

            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                Log.i(TAG, "Counter: " + counter);
                tvCounter.setText(String.valueOf(counter));
                showSnackbar();
            }
        });

        showSnackbar();
    }

    public void showSnackbar() {
        Toast.makeText(this, "Counter: " + counter, Toast.LENGTH_SHORT).show();
        Snackbar.make(new CoordinatorLayout(this), "Counter: " + counter, Snackbar.LENGTH_SHORT)
                .show();
    }
}
