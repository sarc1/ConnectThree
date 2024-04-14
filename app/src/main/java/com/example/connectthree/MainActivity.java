package com.example.connectthree;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25;
    int check1 = 0;
    int check2 = 0, check3 = 0, check4 = 0, check5 = 0;
    TextView player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button)findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        btn14 = (Button) findViewById(R.id.btn14);
        btn15 = (Button) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);
        btn17 = (Button) findViewById(R.id.btn17);
        btn18 = (Button) findViewById(R.id.btn18);
        btn19 = (Button) findViewById(R.id.btn19);
        btn20 = (Button) findViewById(R.id.btn20);
        btn21 = (Button)findViewById(R.id.btn21);
        btn22 = (Button) findViewById(R.id.btn22);
        btn23 = (Button) findViewById(R.id.btn23);
        btn24 = (Button) findViewById(R.id.btn24);
        btn25 = (Button) findViewById(R.id.btn25);
        player = (TextView) findViewById(R.id.playertext);

        player.setText("Player 1's Turn");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check1 == 0){
                    if(player.getText() == "Player 1's Turn"){
                        btn21.setBackgroundColor(Color.RED);
                        check1++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn21.setBackgroundColor(Color.BLACK);
                        check1++;
                        player.setText("Player 1's Turn");
                    }
                } else if (check1 == 1) {
                    if(player.getText() == "Player 1's Turn"){
                        btn16.setBackgroundColor(Color.RED);
                        check1++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn16.setBackgroundColor(Color.BLACK);
                        check1++;
                        player.setText("Player 1's Turn");
                    }
                } else if (check1 == 2) {
                    if(player.getText() == "Player 1's Turn"){
                        btn11.setBackgroundColor(Color.RED);
                        check1++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn11.setBackgroundColor(Color.BLACK);
                        check1++;
                        player.setText("Player 1's Turn");
                    }
                }
                else if (check1 == 3) {
                    if(player.getText() == "Player 1's Turn"){
                        btn6.setBackgroundColor(Color.RED);
                        check1++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn6.setBackgroundColor(Color.BLACK);
                        check1++;
                        player.setText("Player 1's Turn");
                    }
                }
                else if(check2 == 4){
                    if(player.getText() == "Player 1's Turn"){
                        btn1.setBackgroundColor(Color.RED);
                        check1++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn1.setBackgroundColor(Color.BLACK);
                        check1++;
                        player.setText("Player 1's Turn");
                    }
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check2 == 0){
                    if(player.getText() == "Player 1's Turn"){
                        btn22.setBackgroundColor(Color.RED);
                        check2++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn22.setBackgroundColor(Color.BLACK);
                        check2++;
                        player.setText("Player 1's Turn");
                    }
                } else if (check2 == 1) {
                    if(player.getText() == "Player 1's Turn"){
                        btn17.setBackgroundColor(Color.RED);
                        check2++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn17.setBackgroundColor(Color.BLACK);
                        check2++;
                        player.setText("Player 1's Turn");
                    }
                } else if (check2 == 2) {
                    if(player.getText() == "Player 1's Turn"){
                        btn12.setBackgroundColor(Color.RED);
                        check2++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn12.setBackgroundColor(Color.BLACK);
                        check2++;
                        player.setText("Player 1's Turn");
                    }
                }
                else if (check2 == 3) {
                    if(player.getText() == "Player 1's Turn"){
                        btn7.setBackgroundColor(Color.RED);
                        check2++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn7.setBackgroundColor(Color.BLACK);
                        check2++;
                        player.setText("Player 1's Turn");
                    }
                }
                else if(check2 == 4){
                    if(player.getText() == "Player 1's Turn"){
                        btn2.setBackgroundColor(Color.RED);
                        check2++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn2.setBackgroundColor(Color.BLACK);
                        check2++;
                        player.setText("Player 1's Turn");
                    }
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check3 == 0){
                    if(player.getText() == "Player 1's Turn"){
                        btn23.setBackgroundColor(Color.RED);
                        check3++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn23.setBackgroundColor(Color.BLACK);
                        check3++;
                        player.setText("Player 1's Turn");
                    }
                } else if (check3 == 1) {
                    if(player.getText() == "Player 1's Turn"){
                        btn18.setBackgroundColor(Color.RED);
                        check3++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn18.setBackgroundColor(Color.BLACK);
                        check3++;
                        player.setText("Player 1's Turn");
                    }
                } else if (check3 == 2) {
                    if(player.getText() == "Player 1's Turn"){
                        btn13.setBackgroundColor(Color.RED);
                        check3++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn13.setBackgroundColor(Color.BLACK);
                        check3++;
                        player.setText("Player 1's Turn");
                    }
                }
                else if (check3 == 3) {
                    if(player.getText() == "Player 1's Turn"){
                        btn8.setBackgroundColor(Color.RED);
                        check3++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn8.setBackgroundColor(Color.BLACK);
                        check3++;
                        player.setText("Player 1's Turn");
                    }
                }
                else if(check3 == 4){
                    if(player.getText() == "Player 1's Turn"){
                        btn3.setBackgroundColor(Color.RED);
                        check3++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn3.setBackgroundColor(Color.BLACK);
                        check3++;
                        player.setText("Player 1's Turn");
                    }
                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check4 == 0){
                    if(player.getText() == "Player 1's Turn"){
                        btn24.setBackgroundColor(Color.RED);
                        check4++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn24.setBackgroundColor(Color.BLACK);
                        check4++;
                        player.setText("Player 1's Turn");
                    }
                } else if (check4 == 1) {
                    if(player.getText() == "Player 1's Turn"){
                        btn19.setBackgroundColor(Color.RED);
                        check4++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn19.setBackgroundColor(Color.BLACK);
                        check4++;
                        player.setText("Player 1's Turn");
                    }
                } else if (check4 == 2) {
                    if(player.getText() == "Player 1's Turn"){
                        btn14.setBackgroundColor(Color.RED);
                        check4++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn14.setBackgroundColor(Color.BLACK);
                        check2++;
                        player.setText("Player 1's Turn");
                    }
                }
                else if (check4 == 3) {
                    if(player.getText() == "Player 1's Turn"){
                        btn9.setBackgroundColor(Color.RED);
                        check4++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn9.setBackgroundColor(Color.BLACK);
                        check4++;
                        player.setText("Player 1's Turn");
                    }
                }
                else if(check4 == 4){
                    if(player.getText() == "Player 1's Turn"){
                        btn4.setBackgroundColor(Color.RED);
                        check4++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn4.setBackgroundColor(Color.BLACK);
                        check4++;
                        player.setText("Player 1's Turn");
                    }
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check5 == 0){
                    if(player.getText() == "Player 1's Turn"){
                        btn25.setBackgroundColor(Color.RED);
                        check5++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn25.setBackgroundColor(Color.BLACK);
                        check5++;
                        player.setText("Player 1's Turn");
                    }
                } else if (check5 == 1) {
                    if(player.getText() == "Player 1's Turn"){
                        btn20.setBackgroundColor(Color.RED);
                        check5++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn20.setBackgroundColor(Color.BLACK);
                        check5++;
                        player.setText("Player 1's Turn");
                    }
                } else if (check5 == 2) {
                    if(player.getText() == "Player 1's Turn"){
                        btn15.setBackgroundColor(Color.RED);
                        check5++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn15.setBackgroundColor(Color.BLACK);
                        check5++;
                        player.setText("Player 1's Turn");
                    }
                }
                else if (check5 == 3) {
                    if(player.getText() == "Player 1's Turn"){
                        btn10.setBackgroundColor(Color.RED);
                        check5++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn10.setBackgroundColor(Color.BLACK);
                        check5++;
                        player.setText("Player 1's Turn");
                    }
                }
                else if(check5 == 4){
                    if(player.getText() == "Player 1's Turn"){
                        btn5.setBackgroundColor(Color.RED);
                        check5++;
                        player.setText("Player 2's Turn");
                    }
                    else{
                        btn5.setBackgroundColor(Color.BLACK);
                        check5++;
                        player.setText("Player 1's Turn");
                    }
                }

            }
        });

    }



}