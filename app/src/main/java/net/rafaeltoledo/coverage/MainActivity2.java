package net.rafaeltoledo.coverage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private TextView text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.hide).setOnClickListener(this);
        text = (TextView) findViewById(R.id.text);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button) {
            v.setVisibility(View.GONE);
        } else {
            text.setText("Hello World! 2");
        }
    }
}
