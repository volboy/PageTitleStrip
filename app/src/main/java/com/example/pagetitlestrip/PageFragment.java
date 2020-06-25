package com.example.pagetitlestrip;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class PageFragment extends Fragment {

    private int pageNumber;

    public static PageFragment newInstance(int page){
        PageFragment fragment=new PageFragment();
        Bundle args=new Bundle();
        args.putInt("num",page);
        fragment.setArguments(args);
        return fragment;
    }

    public PageFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        pageNumber=getArguments()!=null ? getArguments().getInt("num"):1;
    }

    static String getTitle(Context context, int position){
        return "Страница № " + String.valueOf(position+1);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View result=inflater.inflate(R.layout.fragment_page, container, false);
        TextView pageHeader=result.findViewById(R.id.displayText);
        pageHeader.setText("Фрагмент " + String.valueOf(pageNumber+1));
        return result;
    }
}
