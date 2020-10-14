package com.example.webinar.Fragment;

import android.content.ReceiverCallNotAllowedException;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.webinar.Buah;
import com.example.webinar.BuahAdapter;
import com.example.webinar.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private RecyclerView rvBuah;
    private BuahAdapter adapter;
    private ArrayList<Buah> buahArrayList;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        adapter = new BuahAdapter(buahArrayList, getContext());
        rvBuah = view.findViewById(R.id.rvBuah);
        rvBuah.setHasFixedSize(true);
        rvBuah.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvBuah.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buahArrayList = new ArrayList<>();
        buahArrayList.add(new Buah(R.drawable.jeruk, "Ini adalah Jeruk"));
        buahArrayList.add(new Buah(R.drawable.apel, "Ini adalah Apel"));
        buahArrayList.add(new Buah(R.drawable.pepaya, "Ini adalah Pepaya"));
        buahArrayList.add(new Buah(R.drawable.semangka, "Ini adalah Semangka"));
        buahArrayList.add(new Buah(R.drawable.mangga, "Ini adalah Mangga"));
        buahArrayList.add(new Buah(R.drawable.alpukat, "Ini adalah Alpukat"));
    }
}