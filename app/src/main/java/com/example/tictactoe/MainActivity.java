package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btnClear;
    TextView winnerInfo;
    String krest = "x", nolik = "o";
    int step = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnClear = (Button) findViewById(R.id.btnClear);

        winnerInfo = (TextView) findViewById(R.id.winnerInfo);
    }


    public void clcBtn1 (View view) {
        if (btn1.getText() == "") {
            if(step % 2 == 0 ) {
                btn1.setText(krest);
                firstPlayerWinner();
                step++;
            } else {
                btn1.setText(nolik);
                secondPlayerWinner();
                step++;
            }
        }
    }
    public void clcBtn2 (View view) {
        if (btn2.getText() == "") {
            if(step % 2 == 0 ) {
                btn2.setText(krest);
                firstPlayerWinner();
                step++;
            } else {
                btn2.setText(nolik);
                secondPlayerWinner();
                step++;
            }
        }
    }
    public void clcBtn3 (View view) {
        if (btn3.getText() == "") {
            if(step % 2 == 0 ) {
                btn3.setText(krest);
                firstPlayerWinner();
                step++;
            } else {
                btn3.setText(nolik);
                secondPlayerWinner();
                step++;
            }
        }
    }
    public void clcBtn4 (View view) {
        if (btn4.getText() == "") {
            if(step % 2 == 0 ) {
                btn4.setText(krest);
                firstPlayerWinner();
                step++;
            } else {
                btn4.setText(nolik);
                secondPlayerWinner();
                step++;
            }
        }
    }
    public void clcBtn5 (View view) {
        if (btn5.getText() == "") {
            if(step % 2 == 0 ) {
                btn5.setText(krest);
                firstPlayerWinner();
                step++;
            } else {
                btn5.setText(nolik);
                secondPlayerWinner();
                step++;
            }
        }
    }
    public void clcBtn6 (View view) {
        if (btn6.getText() == "") {
            if(step % 2 == 0 ) {
                btn6.setText(krest);
                firstPlayerWinner();
                step++;
            } else {
                btn6.setText(nolik);
                secondPlayerWinner();
                step++;
            }
        }
    }
    public void clcBtn7 (View view) {
        if (btn7.getText() == "") {
            if(step % 2 == 0 ) {
                btn7.setText(krest);
                firstPlayerWinner();
                step++;
            } else {
                btn7.setText(nolik);
                secondPlayerWinner();
                step++;
            }
        }
    }
    public void clcBtn8 (View view) {
        if (btn8.getText() == "") {
            if(step % 2 == 0 ) {
                btn8.setText(krest);
                firstPlayerWinner();
                step++;
            } else {
                btn8.setText(nolik);
                secondPlayerWinner();
                step++;
            }
        }
    }
    public void clcBtn9 (View view) {
        if (btn9.getText() == "") {
            if(step % 2 == 0 ) {
                btn9.setText(krest);
                firstPlayerWinner();
                step++;
            } else {
                btn9.setText(nolik);
                secondPlayerWinner();
                step++;
            }
        }
    }

    public  void clcBtnClear (View view) {
        step = 0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }

    public void firstPlayerWinner() {
        if (btn1.getText() == krest && btn2.getText() == krest && btn3.getText() == krest) {
            winnerInfo.setText(R.string.playerOne);
        }
        if (btn4.getText() == krest && btn5.getText() == krest && btn6.getText() == krest) {
            winnerInfo.setText(R.string.playerOne);
        }
        if (btn7.getText() == krest && btn8.getText() == krest && btn9.getText() == krest) {
            winnerInfo.setText(R.string.playerOne);
        }


        if (btn1.getText() == krest && btn4.getText() == krest && btn7.getText() == krest) {
            winnerInfo.setText(R.string.playerOne);
        }
        if (btn2.getText() == krest && btn5.getText() == krest && btn8.getText() == krest) {
            winnerInfo.setText(R.string.playerOne);
        }
        if (btn3.getText() == krest && btn6.getText() == krest && btn9.getText() == krest) {
            winnerInfo.setText(R.string.playerOne);
        }

        if (btn1.getText() == krest && btn5.getText() == krest && btn9.getText() == krest) {
            winnerInfo.setText(R.string.playerOne);
        }
        if (btn3.getText() == krest && btn5.getText() == krest && btn7.getText() == krest) {
            winnerInfo.setText(R.string.playerOne);
        }
    }

    public void secondPlayerWinner() {
        if (btn1.getText() == nolik && btn2.getText() == nolik && btn3.getText() == nolik) {
            winnerInfo.setText(R.string.playerTwo);
        }
        if (btn4.getText() == nolik && btn5.getText() == nolik && btn6.getText() == nolik) {
            winnerInfo.setText(R.string.playerTwo);
        }
        if (btn7.getText() == nolik && btn8.getText() == nolik && btn9.getText() == nolik) {
            winnerInfo.setText(R.string.playerTwo);
        }


        if (btn1.getText() == nolik && btn4.getText() == nolik && btn7.getText() == nolik) {
            winnerInfo.setText(R.string.playerTwo);
        }
        if (btn2.getText() == nolik && btn5.getText() == nolik && btn8.getText() == nolik) {
            winnerInfo.setText(R.string.playerTwo);
        }
        if (btn3.getText() == nolik && btn6.getText() == nolik && btn9.getText() == nolik) {
            winnerInfo.setText(R.string.playerTwo);
        }

        if (btn1.getText() == nolik && btn5.getText() == nolik && btn9.getText() == nolik) {
            winnerInfo.setText(R.string.playerTwo);
        }
        if (btn3.getText() == nolik && btn5.getText() == nolik && btn7.getText() == nolik) {
            winnerInfo.setText(R.string.playerTwo);
        }
    }
}