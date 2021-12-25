package com.developer.mae.advancedcalculator;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Button oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn, zeroBtn, plusBtn, minusBtn, multiplyBtn, divideBtn, equalBtn, dotBtn,/*bracketBtn,*/
            percentageBtn, clearBtn;
    TextView tvInput, tvOutput;
    String process;
    boolean /*checkBracket=false,isFirst=true,*/isAddition,isSubtraction,isMultiplication,isDivision,isPercentage,isFirst=true;
    Float value1,value2,answer;

    private void performOperations()
    {
        if(isAddition){
            performAddition();
            isAddition=false;
        }else if(isSubtraction){
            performSubtraction();
            isSubtraction=false;
        }else if(isMultiplication){
            performMultiplication();
            isMultiplication=false;
        }else if(isDivision){
            isDivision=false;
            performDivision();
        } else if (isPercentage) {
            performPercentage();
            isPercentage=false;
        }
    }

    private void performAddition() {
        if(value2!=null){
            answer=value1+value2;
            value1=answer;
        }
    }


    private void performSubtraction() {
        if(value2!=null){
            answer=value1-value2;
            value1=answer;
        }
    }


    private void performMultiplication() {
        if(value2!=null){
            answer=value1*value2;
            value1=answer;
        }
    }


    private void performDivision() {
        if(value2!=null){
            answer=value1/value2;
            value1=answer;
        }
    }


    private void performPercentage() {
        if(value2!=null){
            answer=(value1/100)*value2;
            value1=answer;
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oneBtn = findViewById(R.id.oneBtn);
        twoBtn = findViewById(R.id.twoBtn);
        threeBtn = findViewById(R.id.threeBtn);
        fourBtn = findViewById(R.id.fourBtn);
        fiveBtn = findViewById(R.id.fiveBtn);
        sixBtn = findViewById(R.id.sixBtn);
        sevenBtn = findViewById(R.id.sevenBtn);
        eightBtn = findViewById(R.id.eightBtn);
        nineBtn = findViewById(R.id.nineBtn);
        zeroBtn = findViewById(R.id.zeroBtn);

        plusBtn = findViewById(R.id.plusBtn);
        minusBtn = findViewById(R.id.minusBtn);
        multiplyBtn = findViewById(R.id.multiplyBtn);
        divideBtn = findViewById(R.id.divideBtn);
        percentageBtn = findViewById(R.id.percentageBtn);

        /* bracketBtn=findViewById(R.id.bracketBtn);*/
        dotBtn = findViewById(R.id.dotBtn);
        equalBtn = findViewById(R.id.equalBtn);


        clearBtn = findViewById(R.id.clearBtn);

        tvInput = findViewById(R.id.tv_input);
        tvOutput = findViewById(R.id.tv_output);

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
                value1=null;value2=null;answer=null;
                isFirst=true;
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "0");
                if(isFirst){
                    value1=0f;
                    isFirst=false;
                }else{
                    value2=0f;
                    performOperations();
                }
            }

        });
        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "1");
                if(isFirst){
                    value1=1f;
                    isFirst=false;
                }else{
                    value2=1f;
                    performOperations();
                }
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "2");
                if(isFirst){
                    value1=2f;
                    isFirst=false;
                }else{
                    value2=2f;
                    performOperations();
                }
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "3");
                if(isFirst){
                    value1=3f;
                    isFirst=false;
                }else{
                    value2=3f;
                    performOperations();
                }
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "4");
                if(isFirst){
                    value1=4f;
                    isFirst=false;
                }else{
                    value2=4f;
                    performOperations();
                }
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "5");
                if(isFirst){
                    value1=5f;
                    isFirst=false;
                }else{
                    value2=5f;
                    performOperations();
                }

            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "6");
                if(isFirst){
                    value1=6f;
                    isFirst=false;
                }else{
                    value2=6f;
                    performOperations();

                }
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "7");
                if(isFirst){
                    value1=7f;
                    isFirst=false;
                }else{
                    value2=7f;
                    performOperations();
                }
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "8");
                if(isFirst){
                    value1=8f;
                    isFirst=false;
                }else{
                    value2=8f;
                    performOperations();

                }
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + "9");
                if(isFirst){
                    value1=9f;
                    isFirst=false;
                }else{
                    value2=9f;
                    performOperations();
                }
            }
        });
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                 tvInput.setText(process+"+");
                 isAddition=true;

            }


        });
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"-");
                isSubtraction=true;

            }


        });
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 process=tvInput.getText().toString();
                 tvInput.setText(process+"x");
                 isMultiplication=true;


            }


        });
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
               tvInput.setText(process+"÷");
               isDivision=true;


            }
        });
        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process + ".");

            }
        });
        percentageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"%");
                isPercentage=true;

            }
        });


        /*bracketBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBracket==true){
                    process=tvInput.getText().toString();
                    tvInput.setText(process+")");
                    checkBracket=false;
                }
                else{
                    process=tvInput.getText().toString();
                    tvInput.setText(process+"(");
                    checkBracket=true;
                }
            }
        });*/


        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result= "";
                process=tvInput.getText().toString();
                tvInput.setText(process);
                if(answer!=null){
                    result=answer.toString();
                }
                tvOutput.setText(result);


                }



            
        });
    }
}
