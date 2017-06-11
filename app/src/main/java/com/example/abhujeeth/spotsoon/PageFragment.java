package com.example.abhujeeth.spotsoon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;


public class PageFragment extends Fragment {

    private int mPage;
    private RecyclerView recyclerView;
    private List<ModelClass> cards;

    public PageFragment()
    {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(llm);


        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cards=new ArrayList<>();
        ModelClass obj=new ModelClass(textValues(R.string.text_one),textValues(R.string.text_five),textValues(R.string.play),R.drawable.shirt,R.drawable.ic_schedule_black_24dp);
        cards.add(obj);
        ModelClass obj1=new ModelClass(textValues(R.string.text_two),textValues(R.string.text_six),textValues(R.string.play),R.drawable.shirt,R.drawable.ic_schedule_black_24dp);
        cards.add(obj1);
        ModelClass obj2=new ModelClass(textValues(R.string.text_three),textValues(R.string.text_five),textValues(R.string.play),R.drawable.shirt,R.drawable.ic_schedule_black_24dp);
        cards.add(obj2);
        ModelClass obj3=new ModelClass(textValues(R.string.text_four),textValues(R.string.text_six),textValues(R.string.play),R.drawable.shirt,R.drawable.ic_schedule_black_24dp);
        cards.add(obj3);
        RecyclerView.Adapter adapter = new RecyclerAdapter(getContext(),cards);
        recyclerView.setAdapter(adapter);


    }

    public String textValues(int id)
    {
        return getResources().getString(id);
    }

}
