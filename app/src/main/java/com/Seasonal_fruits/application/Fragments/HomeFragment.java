package com.Seasonal_fruits.application.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.Seasonal_fruits.application.Adapters.MainAdapter;
import com.Seasonal_fruits.application.Models.MainModel;
import com.Seasonal_fruits.application.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {
    ArrayList<MainModel> list;
    TextView tv_monsoon,tv_summer,tv_winter;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: Rename and change types of parameters

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tv_monsoon=view.findViewById(R.id.monsoon);
        tv_summer=view.findViewById(R.id.summer);
        tv_winter=view.findViewById(R.id.winter);
        if (getActivity() != null) {
            getActivity().setTitle("Monsoon Fruits");
        }
        monsoon();
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        MainAdapter mainAdapter=new MainAdapter(list, getContext());
        recyclerView.setAdapter(mainAdapter);

        tv_monsoon.setOnClickListener(v->{
            if (getActivity() != null) {
                getActivity().setTitle("Monsoon Fruits");
            }
            monsoon();
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setHasFixedSize(true);
            MainAdapter springAdapter=new MainAdapter(list, getContext());
            recyclerView.setAdapter(springAdapter);
        });
        tv_summer.setOnClickListener(v->{
            if (getActivity() != null) {
                getActivity().setTitle("Summer Fruits");
            }
            summer();
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setHasFixedSize(true);
            MainAdapter summerAdapter=new MainAdapter(list, getContext());
            recyclerView.setAdapter(summerAdapter);
        });
        tv_winter.setOnClickListener(v->{
            if (getActivity() != null) {
                getActivity().setTitle("Winter Fruits");
            }
            winter();
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setHasFixedSize(true);
            MainAdapter winterAdapter=new MainAdapter(list, getContext());
            recyclerView.setAdapter(winterAdapter);
        });

//        mainAdapter.notifyDataSetChanged();
    }


    private void winter() {
        list =new ArrayList<>();
        list.add(new MainModel(R.drawable.dates,"Dates","40","Dates are sweet, chewy fruits with a rich flavor, known for their natural sweetness and high nutritional value."));
        list.add(new MainModel(R.drawable.fig,"Fig","40","The fig fruit is a sweet and soft, pear-shaped fruit with a unique texture and rich flavor, often enjoyed fresh or dried."));
        list.add(new MainModel(R.drawable.grapes,"Grapes","40","Grapes are small, round, and juicy fruits that grow in clusters on vines, known for their sweet and tart flavors."));
        list.add(new MainModel(R.drawable.orange,"Orange","40","The orange fruit is a citrus fruit known for its vibrant orange color, sweet and tangy flavor, and high vitamin C content."));
        list.add(new MainModel(R.drawable.strawberry,"Strawberry","40","Strawberry fruit is a vibrant red, sweet and juicy berry known for its distinct flavor and small seeds, often enjoyed fresh or used in various culinary delights."));
        list.add(new MainModel(R.drawable.sweet_lime,"Sweet Lime","40","Sweet lime is a citrus fruit with a mild, sweet flavor and a refreshing, juicy pulp, resembling a cross between a lemon and an orange."));
    }


    private void summer() {
        list =new ArrayList<>();
        list.add(new MainModel(R.drawable.jack_fruit,"Jack Fruit","40","The jackfruit is a large tropical fruit known for its distinctive size, spiky exterior, and sweet, aromatic flesh that has a unique combination of flavors reminiscent of pineapple, banana, and mango."));
        list.add(new MainModel(R.drawable.lychee,"Lychee","40","Lychee fruit is a sweet and fragrant tropical fruit with a rough, reddish-pink peel and a juicy, translucent white flesh."));
        list.add(new MainModel(R.drawable.mango,"Mango","40","Mango fruit is a delicious tropical delight known for its juicy flesh, vibrant flavor, and rich aroma."));
        list.add(new MainModel(R.drawable.musk_melon,"Musk Melon","40","Musk melon is a juicy and aromatic fruit with a sweet flavor, known for its refreshing and hydrating qualities."));
        list.add(new MainModel(R.drawable.watermelon,"Water melon","40","Watermelon is a refreshing and juicy fruit with a sweet, hydrating flesh and a green rind, perfect for summertime enjoyment."));
    }

    private void monsoon() {
        list =new ArrayList<>();
        list.add(new MainModel(R.drawable.blueberry,"Blueberry","40","Blueberry fruit is small, round, and packed with antioxidants, offering a delicious combination of sweet and tangy flavors."));
        list.add(new MainModel(R.drawable.custard_apple,"Custard Apple","40","Custard Apple fruit is a tropical delicacy with a creamy texture and sweet, aromatic flavor, known for its green scaly skin and soft, white, custard-like flesh containing black seeds."));
        list.add(new MainModel(R.drawable.peach,"Peach","40","Peach fruit is a juicy and sweet stone fruit with a fuzzy skin, known for its vibrant colors and refreshing taste."));
        list.add(new MainModel(R.drawable.pear,"Pear","40","A sweet and juicy fruit with a distinctive shape, known for its smooth skin and crisp flesh."));
        list.add(new MainModel(R.drawable.pomogranate,"Pomegranate","40","A vibrant and nutrient-rich fruit with a ruby-red aril-filled interior, known for its sweet-tart flavor and potential health benefits."));

    }

}