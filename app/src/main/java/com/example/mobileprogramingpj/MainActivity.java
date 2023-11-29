package com.example.mobileprogramingpj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button[][] buttons = new Button[9][9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "깃발 꽂기", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "지뢰 찾기", Toast.LENGTH_SHORT).show();
                }
            }
        });

        TableLayout tableLayout = (TableLayout) findViewById(R.id.tableLayout);
        TableRow tableRow = null;
        for (int i = 0; i < 9; i++) {
            tableRow = new TableRow(this);
            TableRow.LayoutParams layoutParams =
                    new TableRow.LayoutParams(
                            TableRow.LayoutParams.WRAP_CONTENT,
                            TableRow.LayoutParams.WRAP_CONTENT,
                            1.0f);

            for (int j = 0; j < 9; j++) {
                buttons[i][j] = new Button(this);

                buttons[i][j].setOnClickListener(v -> {
                    // 버튼이 클릭되었을 때 수행할 작업 추가
                });


                TableRow.LayoutParams layoutParams1 = new TableRow.LayoutParams(
                        TableRow.LayoutParams.MATCH_PARENT,
                        TableRow.LayoutParams.WRAP_CONTENT, 1.0f);

                buttons[i][j].setLayoutParams(layoutParams);

                tableRow.addView(buttons[i][j]);
            }
            tableLayout.addView(tableRow);
        }
    }
}

        /*TextView time=(TextView)findViewById(R.id.time_textview);
        TextView mine=(TextView)findViewById(R.id.mine_textview);
        time.setText("");
        mine.setText("");
    }
}
