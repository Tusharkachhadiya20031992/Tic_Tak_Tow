package com.example.tictaktow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class loop_tictactoe extends AppCompatActivity implements View.OnClickListener {

    Button btn[];
    Button rs;
    int t=0;
    ArrayList arr=new ArrayList();
    TextView tv;
    String a,b,c,d,e,f,g,h,i;

    void restart()
    {
        arr.clear();
        t=0;
        tv.setText("Welcome");
        for(int i=0;i<9;i++)
        {
            btn[i].setText("");
            btn[i].setClickable(true);
        }

    }

    void win()
    {

        a=btn[0].getText().toString();
        b=btn[1].getText().toString();
        c=btn[2].getText().toString();
        d=btn[3].getText().toString();
        e=btn[4].getText().toString();
        f=btn[5].getText().toString();
        g=btn[6].getText().toString();
        h=btn[7].getText().toString();
        i=btn[8].getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            tv.setText("X is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }

        }
        else if(d.equals("X")&& e.equals("X")&& f.equals("X"))
        {
            tv.setText("X is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(g.equals("X")&& h.equals("X")&& i.equals("X"))
        {
            tv.setText("X is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(a.equals("X")&& e.equals("X")&& i.equals("X"))
        {
            tv.setText("X is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(c.equals("X")&& e.equals("X")&& g.equals("X"))
        {
            tv.setText("X is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(a.equals("X")&& d.equals("X")&& g.equals("X"))
        {
            tv.setText("X is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(b.equals("X")&& e.equals("X")&& h.equals("X"))
        {
            tv.setText("X is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(c.equals("X")&& f.equals("X")&& i.equals("X"))
        {
            tv.setText("X is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }

        }
        else if(a.equals("O")&& b.equals("O")&& c.equals("O"))
        {
            tv.setText("O is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }

        }
        else if(d.equals("O")&& e.equals("O")&& f.equals("O"))
        {
            tv.setText("O is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(g.equals("O")&& h.equals("O")&& i.equals("O"))
        {
            tv.setText("O is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(a.equals("O")&& e.equals("O")&& i.equals("O"))
        {
            tv.setText("O is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(c.equals("O")&& e.equals("O")&& g.equals("O"))
        {
            tv.setText("O is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(a.equals("O")&& d.equals("O")&& g.equals("O"))
        {
            tv.setText("O is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(b.equals("O")&& e.equals("O")&& h.equals("O"))
        {
            tv.setText("O is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else if(c.equals("O")&& f.equals("O")&& i.equals("O"))
        {
            tv.setText("O is win");
            for(int i=0;i<9;i++)
            {
                btn[i].setClickable(false);
            }
        }
        else
        {
            tv.setText("Match is tie");
        }
    }
    void winstr()
    {
        a=btn[0].getText().toString();
        b=btn[1].getText().toString();
        c=btn[2].getText().toString();
        d=btn[3].getText().toString();
        e=btn[4].getText().toString();
        f=btn[5].getText().toString();
        g=btn[6].getText().toString();
        h=btn[7].getText().toString();
        i=btn[8].getText().toString();

        if(a.equals("O")&&b.equals("O")&&c.equals(""))
        {
            btn[2].setText("O");
            win();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop_tictactoe);

        tv=findViewById(R.id.tv);
        rs=findViewById(R.id.rs);

        btn = new Button[9];

        for(int i=0;i<9;i++)
        {
            int id=getResources().getIdentifier("b"+(i+1),"id",getPackageName());
            btn[i]=findViewById(id);
        }

        for(int i=0;i<9;i++)
        {
            btn[i].setOnClickListener(this);
        }
        rs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restart();
            }
        });
    }

    @Override
    public void onClick(View view) {

        for(int i=0;i<9;i++)
        {
            if(btn[i].getId()==view.getId())
            {
                btn[i].setText("X");
                arr.add(i);
                btn[i].setClickable(false);
                t=t+1;
                win();

                if(t<=4)
                {
                    while(true)
                    {
                        int random=new Random().nextInt(9);
                        if(!arr.contains(random))
                        {
                            arr.add(random);
                            btn[random].setText("O");
                            btn[random].setClickable(false);

                            break;
                        }
                    }
                }
                winstr();
                win();

            }
        }



    }





    
}