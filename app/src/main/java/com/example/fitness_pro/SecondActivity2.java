package com.example.fitness_pro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class SecondActivity2 extends AppCompatActivity {

    int[] newArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        newArray = new int[]{


                R.id.bow_pose,R.id.bridge_pose,R.id.chair_pose,R.id.child_pose,R.id.cobbler_pose,R.id.cow_pose,R.id.plaji_pose,R.id.powseji_pose,R.id.plaji_pose,R.id.situp_pose,R.id.rotation_pose,R.id.twist_pose,R.id.windmill_pose,R.id.legup_pose,

        };
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.id_privacy){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://iotexpert1.blogspot.com/2020/10/weight-loss-privacy-ploicy-page.html"));
            startActivity(intent);
            return true;
        }
        if (id==R.id.id_terms){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://iotexpert1.blogspot.com/2020/10/weight-loss-terms-and-conditions-page.html"));
            startActivity(intent);
            return true;
        }
        if (id==R.id.id_rate){
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id="+ getPackageName())));
            }catch (Exception ex){
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=" +getPackageName())));

            }

            return true;
        }
        if (id==R.id.more){
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.example.fitness_pro&hl=en"));
            startActivity(intent);
            return true;
        }
        if (id==R.id.share){
            Intent myIntent = new Intent(Intent.ACTION_VIEW);
            myIntent.setType("text/play");
            String sharebody="This is the best app for Fitness\n By this you can have multiple benefits.\n This is a free app download now.\n" +"https://play.google.com/store/apps/dev?id=5383214981341794561";
            String sharehub ="Fitness_pro app";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,sharehub);
            myIntent.putExtra(Intent.EXTRA_SUBJECT,sharebody);
            startActivity(Intent.createChooser(myIntent,"share using"));
            return true;
        }

        return true;
    }

    public void Imagebuttonclicked(View view) {

        for (int i=0;i< newArray.length;i++){

            if (view.getId()==newArray[i]) {
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity2.this,ThirdActivity2.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }


    }
}
