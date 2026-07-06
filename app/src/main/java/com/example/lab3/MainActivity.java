package com.example.lab3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Note noteA = new Note();
        Note noteB = new Note();
        Note note1 = new Note();

        noteA.title = "dfdsfsg";
        noteA.content = "dsfsg";
        noteA.creatdData = "6 July 2026";
        noteA.getSummary();

        noteB.title = "";
        noteB.content = "";
        noteB.creatdData ="6 July 2026";
        noteB.getSummary();

        User user1 = new User();
        user1.userId = (int) '1';
        user1.username = "THOFUN";
        user1.password = (int) '1';
        user1.email = "thofun@gmail.com";

    }
}