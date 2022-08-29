package com.example.tictaktow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

        // hello
        Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,rs;
        int x=0;
        TextView tv,clo,clx;
        int sumo=0,sumx=0;

        String a,b,c,d,e,f,g,h,i;

        void restart()
        {
                x=0;
                sumo=0;
                sumx=0;
                btn1.setText("");
                btn1.setClickable(true);
                btn2.setText("");
                btn2.setClickable(true);
                btn3.setText("");
                btn3.setClickable(true);
                btn4.setText("");
                btn4.setClickable(true);
                btn5.setText("");
                btn5.setClickable(true);
                btn6.setText("");
                btn6.setClickable(true);
                btn7.setText("");
                btn7.setClickable(true);
                btn8.setText("");
                btn8.setClickable(true);
                btn9.setText("");
                btn9.setClickable(true);
                tv.setText("Welcome");
        }

        void win()
        {
                a=btn1.getText().toString();
                b=btn2.getText().toString();
                c=btn3.getText().toString();
                d=btn4.getText().toString();
                e=btn5.getText().toString();
                f=btn6.getText().toString();
                g=btn7.getText().toString();
                h=btn8.getText().toString();
                i=btn9.getText().toString();

                if(a.equals("X")&& b.equals("X")&& c.equals("X"))
                {
                        tv.setText("X is win");
                        btn4.setClickable(false);
                        btn5.setClickable(false);
                        btn6.setClickable(false);
                        btn7.setClickable(false);
                        btn8.setClickable(false);
                        btn9.setClickable(false);
                }
                else if(d.equals("X")&& e.equals("X")&& f.equals("X"))
                {
                        tv.setText("X is win");
                        btn1.setClickable(false);
                        btn2.setClickable(false);
                        btn3.setClickable(false);
                        btn7.setClickable(false);
                        btn8.setClickable(false);
                        btn9.setClickable(false);
                }
                else if(g.equals("X")&& h.equals("X")&& i.equals("X"))
                {
                        tv.setText("X is win");
                        btn1.setClickable(false);
                        btn2.setClickable(false);
                        btn3.setClickable(false);
                        btn4.setClickable(false);
                        btn5.setClickable(false);
                        btn6.setClickable(false);
                }
                else if(a.equals("X")&& e.equals("X")&& i.equals("X"))
                {
                        tv.setText("X is win");
                        btn2.setClickable(false);
                        btn3.setClickable(false);
                        btn4.setClickable(false);
                        btn6.setClickable(false);
                        btn7.setClickable(false);
                        btn8.setClickable(false);
                }
                else if(c.equals("X")&& e.equals("X")&& g.equals("X"))
                {
                        tv.setText("X is win");
                        btn1.setClickable(false);
                        btn2.setClickable(false);
                        btn4.setClickable(false);
                        btn6.setClickable(false);
                        btn8.setClickable(false);
                        btn9.setClickable(false);
                }
                else if(a.equals("X")&& d.equals("X")&& g.equals("X"))
                {
                        tv.setText("X is win");
                        btn2.setClickable(false);
                        btn3.setClickable(false);
                        btn5.setClickable(false);
                        btn6.setClickable(false);
                        btn8.setClickable(false);
                        btn9.setClickable(false);
                }
                else if(b.equals("X")&& e.equals("X")&& h.equals("X"))
                {
                        tv.setText("X is win");
                        btn1.setClickable(false);
                        btn3.setClickable(false);
                        btn4.setClickable(false);
                        btn6.setClickable(false);
                        btn7.setClickable(false);
                        btn9.setClickable(false);
                }
                else if(c.equals("X")&& f.equals("X")&& i.equals("X"))
                {
                        tv.setText("X is win");
                        btn1.setClickable(false);
                        btn2.setClickable(false);
                        btn4.setClickable(false);
                        btn5.setClickable(false);
                        btn7.setClickable(false);
                        btn8.setClickable(false);

                }
                else if(a.equals("O")&& b.equals("O")&& c.equals("O"))
                {
                        tv.setText("O is win");
                        btn4.setClickable(false);
                        btn5.setClickable(false);
                        btn6.setClickable(false);
                        btn7.setClickable(false);
                        btn8.setClickable(false);
                        btn9.setClickable(false);

                }
                else if(d.equals("O")&& e.equals("O")&& f.equals("O"))
                {
                        tv.setText("O is win");
                        btn1.setClickable(false);
                        btn2.setClickable(false);
                        btn3.setClickable(false);
                        btn7.setClickable(false);
                        btn8.setClickable(false);
                        btn9.setClickable(false);
                }
                else if(g.equals("O")&& h.equals("O")&& i.equals("O"))
                {
                        tv.setText("O is win");
                        btn1.setClickable(false);
                        btn2.setClickable(false);
                        btn3.setClickable(false);
                        btn4.setClickable(false);
                        btn5.setClickable(false);
                        btn6.setClickable(false);
                }
                else if(a.equals("O")&& e.equals("O")&& i.equals("O"))
                {
                        tv.setText("O is win");
                        btn2.setClickable(false);
                        btn3.setClickable(false);
                        btn4.setClickable(false);
                        btn6.setClickable(false);
                        btn7.setClickable(false);
                        btn8.setClickable(false);
                }
                else if(c.equals("O")&& e.equals("O")&& g.equals("O"))
                {
                        tv.setText("O is win");
                        btn1.setClickable(false);
                        btn2.setClickable(false);
                        btn4.setClickable(false);
                        btn6.setClickable(false);
                        btn8.setClickable(false);
                        btn9.setClickable(false);
                }
                else if(a.equals("O")&& d.equals("O")&& g.equals("O"))
                {
                        tv.setText("O is win");
                        btn2.setClickable(false);
                        btn3.setClickable(false);
                        btn5.setClickable(false);
                        btn6.setClickable(false);
                        btn8.setClickable(false);
                        btn9.setClickable(false);
                }
                else if(b.equals("O")&& e.equals("O")&& h.equals("O"))
                {
                        tv.setText("O is win");
                        btn1.setClickable(false);
                        btn3.setClickable(false);
                        btn4.setClickable(false);
                        btn6.setClickable(false);
                        btn7.setClickable(false);
                        btn9.setClickable(false);
                }
                else if(c.equals("O")&& f.equals("O")&& i.equals("O"))
                {
                        tv.setText("O is win");
                        btn1.setClickable(false);
                        btn2.setClickable(false);
                        btn4.setClickable(false);
                        btn5.setClickable(false);
                        btn7.setClickable(false);
                        btn8.setClickable(false);
                }
                else
                {
                        tv.setText("Match is tie");
                }

        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                btn1=findViewById(R.id.b1);
                btn2=findViewById(R.id.b2);
                btn3=findViewById(R.id.b3);
                btn4=findViewById(R.id.b4);
                btn5=findViewById(R.id.b5);
                btn6=findViewById(R.id.b6);
                btn7=findViewById(R.id.b7);
                btn8=findViewById(R.id.b8);
                btn9=findViewById(R.id.b9);
                tv=findViewById(R.id.tv);
                rs=findViewById(R.id.rs);
                clo=findViewById(R.id.clo);
                clx=findViewById(R.id.clx);



                for(int i=0;i<15;i++)
                {
                        int min=0;
                        int max=9;
                        int random=new Random().nextInt(max-min)+min;


                        }





                btn1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                if(btn1.getText().toString().equals(""))
                                {
                                        if(x%2==0)
                                        {
                                                btn1.setText("O");
                                                sumo++;
                                                clo.setText(""+sumo);


                                        }
                                        else
                                        {
                                                btn1.setText("X");
                                                sumx++;
                                                clx.setText(""+sumx);
                                        }
                                        x++;
                                        win();

                                }

                        }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                if(btn2.getText().toString().equals(""))
                                {
                                        if(x%2==0)
                                        {
                                                btn2.setText("O");
                                                sumo++;
                                                clo.setText(""+sumo);
                                        }
                                        else
                                        {
                                                btn2.setText("X");
                                                sumx++;
                                                clx.setText(""+sumx);
                                        }
                                        x++;
                                        win();

                                }

                        }
                });


                btn3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                if(btn3.getText().toString().equals(""))
                                {
                                        if(x%2==0)
                                        {
                                                btn3.setText("O");
                                                sumo++;
                                                clo.setText(""+sumo);
                                        }
                                        else
                                        {
                                                btn3.setText("X");
                                                sumx++;
                                                clx.setText(""+sumx);
                                        }
                                        x++;
                                        win();

                                }

                        }
                });
                btn4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                if(btn4.getText().toString().equals(""))
                                {
                                        if(x%2==0)
                                        {
                                                btn4.setText("O");
                                                sumo++;
                                                clo.setText(""+sumo);
                                        }
                                        else
                                        {
                                                btn4.setText("X");
                                                sumx++;
                                                clx.setText(""+sumx);
                                        }
                                        x++;
                                        win();

                                }

                        }
                });

                btn5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                if(btn5.getText().toString().equals(""))
                                {
                                        if(x%2==0)
                                        {
                                                btn5.setText("O");
                                                sumo++;
                                                clo.setText(""+sumo);
                                        }
                                        else
                                        {
                                                btn5.setText("X");
                                                sumx++;
                                                clx.setText(""+sumx);
                                        }
                                        x++;
                                        win();

                                }

                        }
                });

                btn6.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                if(btn6.getText().toString().equals(""))
                                {
                                        if(x%2==0)
                                        {
                                                btn6.setText("O");
                                                sumo++;
                                                clo.setText(""+sumo);
                                        }
                                        else
                                        {
                                                btn6.setText("X");
                                                sumx++;
                                                clx.setText(""+sumx);
                                        }
                                        x++;
                                        win();

                                }

                        }
                });

                btn7.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                if(btn7.getText().toString().equals(""))
                                {
                                        if(x%2==0)
                                        {
                                                btn7.setText("O");
                                                sumo++;
                                                clo.setText(""+sumo);
                                        }
                                        else
                                        {
                                                btn7.setText("X");
                                                sumx++;
                                                clx.setText(""+sumx);
                                        }
                                        x++;
                                        win();

                                }

                        }
                });

                btn8.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                if(btn8.getText().toString().equals(""))
                                {
                                        if(x%2==0)
                                        {
                                                btn8.setText("O");
                                                sumo++;
                                                clo.setText(""+sumo);
                                        }
                                        else
                                        {
                                                btn8.setText("X");
                                                sumx++;
                                                clx.setText(""+sumx);
                                        }
                                        x++;
                                        win();

                                }

                        }
                });

                btn9.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                if(btn9.getText().toString().equals(""))
                                {
                                        if(x%2==0)
                                        {
                                                btn9.setText("O");
                                                sumo++;
                                                clo.setText(""+sumo);
                                        }
                                        else
                                        {
                                                btn9.setText("X");
                                                sumx++;
                                                clx.setText(""+sumx);
                                        }
                                        x++;
                                        win();

                                }

                        }
                });

                rs.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                restart();
                        }
                });





        }
}


