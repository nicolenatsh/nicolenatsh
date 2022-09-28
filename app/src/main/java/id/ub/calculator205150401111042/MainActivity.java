package id.ub.calculator205150401111042;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    Button bp, bm, bk, bb, bs, bc;

    public static double x = 0;
    public static String opt = "";
    public static double y = 0;
    public static String input;
    public static String hasil=input+String.valueOf(y);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    void init() {
        et = (EditText) findViewById(R.id.et);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6 = (Button) findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7 = (Button) findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8 = (Button) findViewById(R.id.b8);
        b8.setOnClickListener(this);
        b9 = (Button) findViewById(R.id.b9);
        b9.setOnClickListener(this);
        b0 = (Button) findViewById(R.id.b0);
        b0.setOnClickListener(this);

        bp = (Button) findViewById(R.id.bp);
        bp.setOnClickListener(this);
        bm = (Button) findViewById(R.id.bm);
        bm.setOnClickListener(this);
        bk = (Button) findViewById(R.id.bk);
        bk.setOnClickListener(this);
        bb = (Button) findViewById(R.id.bb);
        bb.setOnClickListener(this);
        bs = (Button) findViewById(R.id.bs);
        bs.setOnClickListener(this);
        bc = (Button) findViewById(R.id.bc);
        bc.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.b1:
                et.setText(et.getText().toString().trim() + "1");
                input = et.getText().toString();
                break;
            case R.id.b2:
                et.setText(et.getText().toString().trim() + "2");
                input = et.getText().toString();
                break;
            case R.id.b3:
                et.setText(et.getText().toString().trim() + "3");
                input = et.getText().toString();
                break;
            case R.id.b4:
                et.setText(et.getText().toString().trim() + "4");
                input = et.getText().toString();
                break;
            case R.id.b5:
                et.setText(et.getText().toString().trim() + "5");
                input = et.getText().toString();
                break;
            case R.id.b6:
                et.setText(et.getText().toString().trim() + "6");
                input = et.getText().toString();
                break;
            case R.id.b7:
                et.setText(et.getText().toString().trim() + "7");
                input = et.getText().toString();
                break;
            case R.id.b8:
                et.setText(et.getText().toString().trim() + "8");
                input = et.getText().toString();
                break;
            case R.id.b9:
                et.setText(et.getText().toString().trim() + "9");
                input = et.getText().toString();
                break;
            case R.id.b0:
                et.setText(et.getText().toString().trim() + "0");
                input = et.getText().toString();
                break;

            case R.id.bp:
                if (et.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    return;
                }
                opt = "tambah";
                x = Double.parseDouble(et.getText().toString());
                input += " + ";
                et.setText("");
                break;

            case R.id.bm:
                if (et.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    return;
                }
                opt = "kurang";
                x = Double.parseDouble(et.getText().toString());
                input += " - ";
                et.setText("");
                break;

            case R.id.bk:
                if (et.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    return;
                }
                opt = "kali";
                x = Double.parseDouble(et.getText().toString());
                input += " x ";
                et.setText("");
                break;

            case R.id.bb:
                if (et.getText().toString().trim().equals("")) {
                    Toast.makeText(MainActivity.this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    return;
                }
                opt = "bagi";
                x = Double.parseDouble(et.getText().toString());
                input += " / ";
                et.setText("");
                break;

            case R.id.bc:
                x = 0;
                et.setText("");
                break;

            case R.id.bs:
                if (opt.equals("tambah")) {
                    y = x + Double.parseDouble(et.getText().toString().trim());
                    et.setText(String.valueOf(y));
                }
                if (opt.equals("kurang")) {
                    y = x - Double.parseDouble(et.getText().toString().trim());
                    et.setText(String.valueOf(y));
                }
                if (opt.equals("kali")) {
                    y = x * Double.parseDouble(et.getText().toString().trim());
                    et.setText(String.valueOf(y));
                }
                if (opt.equals("bagi")) {
                    y = x / Double.parseDouble(et.getText().toString().trim());
                    et.setText(String.valueOf(y));
                }
                int yTemp = (int) y;
                if (yTemp == y) {
                    et.setText(String.valueOf((int) y));
                } else {
                    et.setText(String.valueOf(y));
                }
                bs.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in = new Intent(MainActivity.this,MainActivity2.class);
                        in.putExtra("hasil", hasil);
                        startActivity(in);
                    }
                });
                break;
        }
    }
}
