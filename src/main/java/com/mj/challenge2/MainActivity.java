package com.mj.challenge2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edittext1,edittext2,edittext3,edittext4;
    Spinner spinner;
    TextView textview1,textview2;
    RadioButton button1,button2,button3;
    ImageView shoppingimage,timerimage,soundimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1=findViewById(R.id.editTextName);
        edittext2=findViewById(R.id.editTextemail);
        edittext3=findViewById(R.id.editText3);
        edittext4=findViewById(R.id.editText4);
        spinner=findViewById(R.id.spinner);
        shoppingimage=findViewById(R.id.shoppingimage);
        timerimage=findViewById(R.id.timerimage);
        soundimage=findViewById(R.id.soundimage);
        ArrayList<String> country= new ArrayList<>();
        country.add("India");
        country.add("USA");
        country.add("China");
        country.add("Pakistan");
        country.add("UK");

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
               this,android.R.layout.simple_spinner_dropdown_item,country
        );
        spinner.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(this,"Settings",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"Back",Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }

    public void onButtonClicked(View view)
    {
        boolean checked=((RadioButton)view).isChecked();
        switch(view.getId())
        {
            case R.id.male:
                if(checked)
                {
                    System.out.println("Gender is male");
                    break;
                }
            case R.id.female:
                if(checked)
                {
                    System.out.println("Gender is female");
                    break;
                }
            case R.id.other:
                if(checked)
                {
                    System.out.println("Gender is Other");
                    break;
                }
        }
    }
    public void finishbutton(View view)
    {
        Context context = getApplicationContext();
        CharSequence text="Your details are submitted ,"+edittext1.getText()+"!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast= Toast.makeText(context,text,duration);
        toast.show();
    }
    public void onItemClick(View view)
    {
        switch(view.getId())
        {
            case R.id.shoppingimage:
                Toast.makeText(this,"Shopping Cart",Toast.LENGTH_SHORT).show();
                break;
            case R.id.soundimage:
                Toast.makeText(this,"Record",Toast.LENGTH_SHORT).show();
                break;
            case R.id.timerimage:
                Toast.makeText(this,"History",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
