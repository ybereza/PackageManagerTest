package ru.mail.technotrack.packagemanagertest;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView v = (TextView)findViewById(R.id.textView);
        PackageManager pm = getPackageManager();
        if (pm.checkPermission("android.permission.INTERNET", "ru.mail.technotrack.packagemanagertest") == PackageManager.PERMISSION_GRANTED) {
            v.setText("Permission granted");
        }
        else {
            v.setText("Permission not granted");
        }
    }
}
