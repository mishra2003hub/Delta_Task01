package com.example.wordjumble;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Collection;
import java.util.Set;
public class Jumbled extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;
    TextView txtanswer;
    TextView txthint;
    int remaningLives = 3;
    private String wordToGuess;
    private StringBuilder guessedWord;
    private Random random = new Random();
    private int remainingLives = 3;
    private List<String> words = Arrays.asList("HELLO", "COW", "LION", "PEN");
    private List<String> clues = Arrays.asList("Greeting", "Pet animal", "King of Jungle", "Writing");





    private void Delay(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                reStart();
            }
        } , 8000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jumbled);
        init();
        randmise();
        startNewGame();



    }

    private void startNewGame() {
        int randomIndex = random.nextInt(words.size());
        wordToGuess = words.get(randomIndex);
        String clue = clues.get(randomIndex);
        guessedWord = new StringBuilder();
        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedWord.append("_");
        }
        txtanswer.setText(guessedWord.toString());
        txthint.setText("Clue: " + clue);
    }
    public void checkGuess(String s) {
        char upperletter = Character.toUpperCase(s.charAt(0));
        boolean correct = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (Character.toUpperCase(wordToGuess.charAt(i)) == upperletter) {
                guessedWord.setCharAt(i, upperletter);
                correct = true;
            }
        }
        if (correct) {
            Toast.makeText(this, "Correct guess!!", Toast.LENGTH_SHORT).show();


        } else {
            remainingLives--;
            Toast.makeText(this, "Worng guess!! Remaining lives are " + remainingLives, Toast.LENGTH_SHORT).show();
            if (remainingLives <= 0) {
                Toast.makeText(this,"The correct Answer is " + wordToGuess, Toast.LENGTH_SHORT).show();
                Gameover();
            }
        }
        txtanswer.setText(guessedWord.toString());
        if(guessedWord.toString().equals(wordToGuess)){
            Toast.makeText(this,"Congratulations You have guessed the word !! ", Toast.LENGTH_LONG).show();
            reStart();
            Delay();
        }

    }
    public void init() {
        txtanswer = findViewById(R.id.txtanswer);
        txthint = findViewById(R.id.txthint);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        btn16 = findViewById(R.id.btn16);
    }
    private void randmise() {
        List<Character> letters = new ArrayList<>();
        letters.add('H');
        letters.add('L');
        letters.add('L');
        letters.add('L');
        letters.add('C');
        letters.add('W');
        letters.add('I');
        letters.add('N');
        letters.add('N');
        letters.add('E');
        letters.add('E');
        letters.add('O');
        letters.add('O');
        letters.add('O');
        letters.add('P');
        letters.add('A');
        Collections.shuffle(letters);
        List<Character> finallet = new ArrayList<>();
        for (Character rndmcharacter : letters) {
            finallet.add(rndmcharacter);
        }
        btn1.setText(String.valueOf(finallet.get(0)));
        btn2.setText(String.valueOf(finallet.get(1)));
        btn3.setText(String.valueOf(finallet.get(2)));
        btn4.setText(String.valueOf(finallet.get(3)));
        btn5.setText(String.valueOf(finallet.get(4)));
        btn6.setText(String.valueOf(finallet.get(5)));
        btn7.setText(String.valueOf(finallet.get(6)));
        btn8.setText(String.valueOf(finallet.get(7)));
        btn9.setText(String.valueOf(finallet.get(8)));
        btn10.setText(String.valueOf(finallet.get(9)));
        btn11.setText(String.valueOf(finallet.get(10)));
        btn12.setText(String.valueOf(finallet.get(11)));
        btn13.setText(String.valueOf(finallet.get(12)));
        btn14.setText(String.valueOf(finallet.get(13)));
        btn15.setText(String.valueOf(finallet.get(14)));
        btn16.setText(String.valueOf(finallet.get(15)));
    }
    public void Check1(View view) {
        Button currentbtn = (Button) view;
        currentbtn.setEnabled(false);
        String b1 = btn1.getText().toString();
        checkGuess(b1);
    }
    public void Check2(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b2 = btn2.getText().toString();
        checkGuess(b2);
    }
    public void Check3(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b3 = btn3.getText().toString();
        checkGuess(b3);
    }
    public void Check4(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b4 = btn4.getText().toString();
        checkGuess(b4);
    }
    public void Check5(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b5 = btn5.getText().toString();
        checkGuess(b5);
    }
    public void Check6(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b6 = btn6.getText().toString();
        checkGuess(b6);
    }
    public void Check7(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b7 = btn7.getText().toString();
        checkGuess(b7);
    }
    public void Check8(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b8 = btn8.getText().toString();
        checkGuess(b8);
    }
    public void Check9(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b9 = btn9.getText().toString();
        checkGuess(b9);
    }
    public void Check10(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b10 = btn10.getText().toString();
        checkGuess(b10);
    }
    public void Check11(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b11 = btn11.getText().toString();
        checkGuess(b11);
    }
    public void Check12(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b12 = btn12.getText().toString();
        checkGuess(b12);
    }
    public void Check13(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b13 = btn13.getText().toString();
        checkGuess(b13);
    }
    public void Check14(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b14 = btn14.getText().toString();
        checkGuess(b14);
    }
    public void Check15(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b15 = btn15.getText().toString();
        checkGuess(b15);
    }
    public void Check16(View view) {
        Button cur2 = (Button) view;
        cur2.setEnabled(false);
        String b16 = btn16.getText().toString();
        checkGuess(b16);
    }

    public void Gameover(){
        Toast.makeText(this,"Game Over you ran out of lives", Toast.LENGTH_LONG).show();
        reStart();
        Delay();
    }
    public void reStart(){
        remainingLives = 3;
        startNewGame();
        randmise();
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
    }
}