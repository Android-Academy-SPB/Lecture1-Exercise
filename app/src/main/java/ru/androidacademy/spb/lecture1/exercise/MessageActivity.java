package ru.androidacademy.spb.lecture1.exercise;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    private static final String KEY_MESSAGE = "KEY_MESSAGE";

    public static void start(Activity activity, String message) {
        Intent intent = new Intent(activity, MessageActivity.class);
        intent.putExtra(KEY_MESSAGE, message);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        TextView textView = findViewById(R.id.messageText);
        String message = getIntent().getStringExtra(KEY_MESSAGE);
        textView.setText(message);
    }
}
