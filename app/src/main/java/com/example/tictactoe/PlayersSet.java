package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayersSet extends AppCompatActivity {
    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_set);

        player1 = findViewById(R.id.player1_edit);
        player2 = findViewById(R.id.player2_edit);
    }
    public void submitButtonClick(View view){
        String player1Name = player1.getText().toString();
        String player2Name = player2.getText().toString();

        Intent intent = new Intent(this,GameDisplay.class);
        intent.putExtra("PLAYERS_NAMES",new String[] {player1Name,player2Name});
        startActivity(intent);
    }
}