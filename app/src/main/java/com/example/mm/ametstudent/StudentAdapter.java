package com.example.mm.ametstudent;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter <StudentAdapter.ViewHolder>{

    public static final String S_NAME = "name";
    public static final String S_ADDRESS = "sddress";
    public static final String S_PHONE = "phone";
    public static final String S_SECTION = "section";


    private Context mContext;
    private ArrayList<Student> mStudentList;

    public StudentAdapter(Context mContext, ArrayList<Student> mStudentList) {
        this.mContext = mContext;
        this.mStudentList = mStudentList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.recycler_item, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Student student = mStudentList.get(position);
        holder.studentName.setText(student.getmName());
    }

    @Override
    public int getItemCount() {
        return mStudentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView studentName;

        public ViewHolder(View itemView) {
            super(itemView);
            studentName = (TextView)itemView.findViewById(R.id.name_text_view);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Student studentDetail = mStudentList.get(getAdapterPosition());

            Intent intent = new Intent(mContext, DetailActivity.class);
            intent.putExtra(S_NAME, studentDetail.getmName());
            intent.putExtra(S_ADDRESS, studentDetail.getmAddress());
            intent.putExtra(S_PHONE, studentDetail.getmPhone());
            intent.putExtra(S_SECTION, studentDetail.getmSection());

            mContext.startActivity(intent);

        }
    }
}
