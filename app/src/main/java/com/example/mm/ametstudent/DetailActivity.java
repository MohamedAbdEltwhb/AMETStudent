package com.example.mm.ametstudent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.mm.ametstudent.StudentAdapter.S_ADDRESS;
import static com.example.mm.ametstudent.StudentAdapter.S_NAME;
import static com.example.mm.ametstudent.StudentAdapter.S_PHONE;
import static com.example.mm.ametstudent.StudentAdapter.S_SECTION;

public class DetailActivity extends AppCompatActivity {

    TextView mName, mAddress, mPhone, mSection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mName = (TextView)findViewById(R.id.name);
        mAddress = (TextView)findViewById(R.id.address);
        mPhone = (TextView)findViewById(R.id.phone);
        mSection = (TextView)findViewById(R.id.section);

        Intent intent = getIntent();
        mName.setText("Student Name: " + intent.getStringExtra(S_NAME));
        mAddress.setText("Student Address: " + intent.getStringExtra(S_ADDRESS));
        mPhone.setText("Student Phone: " + String.valueOf(intent.getIntExtra(S_PHONE, 0)));
        mSection.setText("Student Section: " + String.valueOf(intent.getIntExtra(S_SECTION, 0)));

    }
}
