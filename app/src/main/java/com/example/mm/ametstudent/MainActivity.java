package com.example.mm.ametstudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Student> mStudentNameList;
    private RecyclerView mRecyclerView;
    private StudentAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);

        mStudentNameList = new ArrayList<>();

        mAdapter = new StudentAdapter(this, mStudentNameList);
        mRecyclerView.setAdapter(mAdapter);

        //Get the data
        StudentData();


    }

    public void StudentData (){
        String []student_name = Data.getStudentName();
        String []student_address = Data.getStudentAddress();
        int []student_phone = Data.getStudentPhone();
        int []student_section = Data.getStudentSection();

        mStudentNameList.clear();

        for (int i = 0; i < student_name.length; i++) {
            mStudentNameList.add(new Student(student_name[i],
                    student_address[i], student_phone[i], student_section[i]));
        }
        mAdapter.notifyDataSetChanged();
    }




}
