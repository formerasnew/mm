package com.chz.myjetpack.ui.publish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chz.libnavannotation.ActivityDestination;
import com.chz.myjetpack.R;
@ActivityDestination(pageUrl = "main/tabs/publish", asStarter = false)
public class PublishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish);
    }
}