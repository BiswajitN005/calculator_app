package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.sun.script.javascript.RhinoScriptEngine;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Locale;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    TextView inputText, outputText, clearAll;
    TextToSpeech textToSpeech;
    String workings = "";
    String formula = "";
    String tempFormula;
    Boolean onDeleted = false;
    Boolean isPressed = true;
    Boolean isMinPressed= true;
    Boolean isDelPressed = true;
    Boolean isEqualsPressed = true;
    Boolean isIntoPressed = true;
    TextView button0, button1, button2 , button3,button4, button5, button6, button7 , button8,
    button9, buttonPoint, buttonAdd, buttonSub, buttonMulti,buttonDiv, buttonEquals, buttonClear, buttonPower, buttonPercent,buttonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        initTextViews();
//        Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake_anim);
//
        button9 = findViewById(R.id.button9);
        button8 = findViewById(R.id.button8);
        button7 = findViewById(R.id.button7);
        button6 = findViewById(R.id.button6);
        button5 = findViewById(R.id.button5);
        button4 = findViewById(R.id.button4);
        button3 = findViewById(R.id.button3);
        button2 = findViewById(R.id.button2);
        button1 = findViewById(R.id.button1);
        button0 = findViewById(R.id.button0);

//        clearAll.setAnimation(shake);
//
//        clearAll.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                view.startAnimation(shake);
//            }
//        });

//        buttonBack = findViewById(R.id.back_button);
//        buttonBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                    if (i != TextToSpeech.ERROR){
                        textToSpeech.setLanguage(Locale.UK);
                    }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(button9.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.setSpeechRate(2f);
                onDeleted = false;
                setWorking("9");
                isPressed = true;
                isMinPressed = true;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(button8.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.setSpeechRate(2f);
                onDeleted = false;
                setWorking("8");
                isPressed = true;
                isMinPressed = true;
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(button7.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.setSpeechRate(2f);
                onDeleted = false;
                setWorking("7");
                isPressed = true;
                isMinPressed = true;
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(button6.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.setSpeechRate(2f);
                onDeleted = false;
                setWorking("6");
                isPressed = true;
                isMinPressed = true;
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(button5.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.setSpeechRate(2f);
                onDeleted = false;
                setWorking("5");
                isPressed = true;
                isMinPressed = true;
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(button4.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.setSpeechRate(2f);
                onDeleted = false;
                setWorking("4");
                isPressed = true;
                isMinPressed = true;
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(button3.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.setSpeechRate(2f);
                onDeleted = false;
                setWorking("3");
                isPressed = true;
                isMinPressed = true;
            }
        });button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(button2.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.setSpeechRate(2f);
                onDeleted = false;
                setWorking("2");
                isPressed = true;
                isMinPressed = true;
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(button1.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.setSpeechRate(2f);
                onDeleted = false;
                setWorking("1");
                isPressed = true;
                isMinPressed = true;
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(button0.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
                textToSpeech.setSpeechRate(2f);
                onDeleted = false;
                setWorking("0");
                isPressed = true;
                isMinPressed = true;
            }
        });


    }
//
//    static boolean isEmpty=true;
//    public void del(View view){
//    Button backButton = (Button) view;
//
//    if (view.getId()==R.id.back_button){
//        String s = inputText.getText().toString();
//        s =s.substring(0,s.length()-1);
//        inputText.setText(s);
//        return;
//    }
//    if(isEmpty){
//        inputText.setText(backButton.getText());
//        isEmpty = false;
//    }else {
//        inputText.append(backButton.getText().toString());
//    }
//    }

    private  void runAnimation(){
        Animation scale = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
        scale.reset();
        clearAll.clearAnimation();
        clearAll.startAnimation(scale);
    }

    private  void initTextViews(){
        inputText = findViewById(R.id.input_text);
        outputText = findViewById(R.id.output_text);
    }

    private void setWorking(String givenValue){
        if(onDeleted){
            inputText.setText(workings+givenValue);
        }else{
            workings = workings+givenValue;
            inputText.setText(workings);
        }


    }
    public void equalsOnClick(View view){
        textToSpeech.speak("Equals",TextToSpeech.QUEUE_FLUSH,null);
        textToSpeech.setSpeechRate(2f);
        Double result = null;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
       checkForPowerOf();
       isPressed = true;
       isMinPressed = true;

       if (inputText.getText().equals("0")){
           isEqualsPressed = false;
       }else if (inputText.getText().equals("")) {
           isEqualsPressed = false;
       }
          else{
              try {
               result = (double)engine.eval(formula);
               String outPut = Double.toString(result);
               String newOutPut = cutDecimal(outPut);
               outputText.setText(newOutPut);
               textToSpeech.speak(outputText.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);
           } catch (ScriptException e) {
//            Toast.makeText(this,"Invalid Expression", Toast.LENGTH_SHORT).show();
               outputText.setText("Expression Error");
           }
       }
          inputText.setText("");

//        if (result!=null)
//            outputText.setText(String.valueOf(result.doubleValue()));
    }

    private void checkForPowerOf()
    {
        ArrayList<Integer> indexOfPowers = new ArrayList<>();
        for(int i = 0; i < workings.length(); i++)
        {
            if (workings.charAt(i) == '^')
                indexOfPowers.add(i);
        }

        formula = workings;
        tempFormula = workings;
        for(Integer index: indexOfPowers)
        {
            changeFormula(index);
        }
        formula = tempFormula;
    }

    private void  changeFormula(Integer index)
    {
        String numberLeft = "";
        String numberRight = "";

        for(int i = index + 1; i< workings.length(); i++)
        {
            if(isNumeric(workings.charAt(i)))
                numberRight = numberRight + workings.charAt(i);
            else
                break;
        }

        for(int i = index - 1; i >= 0; i--)
        {
            if(isNumeric(workings.charAt(i)))
                numberLeft = numberLeft + workings.charAt(i);
            else
                break;
        }

        String original = numberLeft + "^" + numberRight;
        String changed = "Math.pow("+numberLeft+","+numberRight+")";
        tempFormula = tempFormula.replace(original,changed);
    }

    private boolean isNumeric(char c)
    {
        if((c <= '9' && c >= '0') || c == '.')
            return true;

        return false;
    }


    public void deleteOnClick(View view){

        if (inputText.getText().equals("")){
            isDelPressed = false;
        }else {
            String s = inputText.getText().toString();
            s = s.substring(0, s.length() - 1);
            workings = s;
            inputText.setText(s);
        }
        textToSpeech.speak("Delete",TextToSpeech.QUEUE_FLUSH,null);
        textToSpeech.setSpeechRate(2f);
        onDeleted = true;
        isPressed = true;
        isMinPressed = true;

    }


    public void clearOnClick(View view){
        textToSpeech.speak("Clear",TextToSpeech.QUEUE_FLUSH,null);
        textToSpeech.setSpeechRate(2f);
        inputText.setText("0");
        workings = "";
        outputText.setText("");
        leftBracket = true;
        isPressed = true;
        isMinPressed = true;
    }

    public void powerOnClick(View view){
        setWorking("^");
    }
    boolean leftBracket = true;
    public void bracketOnClick(View view){
        onDeleted = false;
        if(leftBracket)
        {
            setWorking("(");
            leftBracket = false;
        }
        else
        {
            setWorking(")");
            leftBracket = true;
        }
    }
    public void divisionOnClick(View view){
        textToSpeech.speak("divide",TextToSpeech.QUEUE_FLUSH,null);
        onDeleted = false;
        if (isPressed){
            setWorking("/");
            isPressed = false;
        }
    }
    public void multiplyOnClick(View view){
        textToSpeech.speak("multiply",TextToSpeech.QUEUE_FLUSH,null);
        onDeleted = false;
        if (isPressed){
            setWorking("*");
            isPressed = false;
        }
    }
    public void additionOnClick(View view){
        textToSpeech.speak("plus",TextToSpeech.QUEUE_FLUSH,null);
        if (isPressed){
            setWorking("+");
            isPressed = false;
        }

    }
    public void subtractionOnClick(View view) {
        textToSpeech.speak("minus",TextToSpeech.QUEUE_FLUSH,null);
        if (isMinPressed) {
            setWorking("-");
            isMinPressed = false;
        }
    }


//    public void sevenOnClick(View view){
//        onDeleted = false;
//        setWorking("7");
//        isPressed = true;
//        isMinPressed = true;
//    }
//    public void eightOnClick(View view){
//        onDeleted = false;
//        setWorking("8");
//        isPressed = true;
//        isMinPressed = true;
//    }
//    public void nineOnClick(View view){
//
//    }
//    public void fourOnClick(View view){
//        onDeleted = false;
//        setWorking("4");
//        isPressed = true;
//        isMinPressed = true;
//    }
//    public void fiveOnClick(View view){
//        onDeleted = false;
//        setWorking("5");
//        isPressed = true;
//        isMinPressed = true;
//    }
//    public void sixOnClick(View view){
//        onDeleted = false;
//        setWorking("6");
//        isPressed = true;
//        isMinPressed = true;
//    }
//    public void oneOnClick(View view){
//        onDeleted = false;
//        setWorking("1");
//        isPressed = true;
//        isMinPressed = true;
//    }
//    public void twoOnClick(View view){
//        onDeleted = false;
//        setWorking("2");
//        isPressed = true;
//        isMinPressed = true;
//    }
//    public void threeOnClick(View view){
//        onDeleted = false;
//        setWorking("3");
//        isPressed = true;
//        isMinPressed = true;
//    }

//    public void zeroOnClick(View view){
//        onDeleted = false;
//        setWorking("0");
//    }
    public void pointOnClick(View view) {
        textToSpeech.speak("point", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setSpeechRate(2f);
        onDeleted = false;
        if (isPressed) {
            setWorking(".");
            isPressed = false;
        }
    }

    private String cutDecimal(String number){
        String n[]= number.split("\\.");
        if (n.length>1){
            if(n[1].equals("0")){
                number = n[0];
            }
        }
        return number;
    }




//    public void onButtonClicked(View view){
//        Button button = (Button) view;
//        String data = button.getText().toString();
//
//        switch (data){
//
//            case "C":
//                input = null;
//                output = null;
//                outputText.setText("");
//                break;
//
//            case "^":
//                input+="^";
//                solve();
//                break;
//            case "*":
//                input+="*";
//                solve();
//                break;
//
//            case "=":
//                solve();
//                break;
//
//            case "%":
//                input+="%";
//                double d = Double.parseDouble(inputText.getText().toString())/100;
//                outputText.setText(String.valueOf(d));
//                break;
//
//            default:
//                if(input == null){
//                    input= "";
//                }if (data.equals("+")|| data.equals("/")|| data.equals("-")){
//                    solve();
//            }
//
//                input += data;
//        }
//        inputText.setText(input);
//    }
//
//    private void solve(){
//                        if(input.split("\\+").length == 2){
//                            String number[] = input.split("\\+");
//
//                            try {
//                                double d = Double.parseDouble(number[0])+ Double.parseDouble(number[1]);
//                                output = Double.toString(d);
//                                outputText.setText(output);
//                                input = d + "";
//                            }catch (Exception e){
//                                outputText.setError(e.getMessage().toString());
//                            }
//                        }
//    }

}