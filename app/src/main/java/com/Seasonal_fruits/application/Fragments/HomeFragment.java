package com.Seasonal_fruits.application.Fragments;

import android.os.Bundle;
import android.os.Handler;
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
    TextView tv_spring,tv_summer,tv_winter,tv_autumn;

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
        tv_spring=view.findViewById(R.id.spring);
        tv_summer=view.findViewById(R.id.summer);
        tv_autumn=view.findViewById(R.id.autumn);
        tv_winter=view.findViewById(R.id.winter);
        if (getActivity() != null) {
            getActivity().setTitle("Spring Fruits");
        }
        spring();
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        MainAdapter mainAdapter=new MainAdapter(list, getContext());
        recyclerView.setAdapter(mainAdapter);

        tv_spring.setOnClickListener(v->{
            if (getActivity() != null) {
                getActivity().setTitle("Spring Fruits");
            }
            spring();
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
        tv_autumn.setOnClickListener(v->{
            if (getActivity() != null) {
                getActivity().setTitle("Autumn Fruits");
            }
            autumn();
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setHasFixedSize(true);
            MainAdapter autumnAdapter=new MainAdapter(list, getContext());
            recyclerView.setAdapter(autumnAdapter);
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
        list.add(new MainModel(R.drawable.northern_meal,"Winter","40","Northern Indian cuisine is characterized by the use of rich and creamy gravies, flatbread like naan and roti, and a variety of vegetarian dishes."));
        list.add(new MainModel(R.drawable.dosa,"Dosa","40","Dosa is a popular South Indian dish made from a fermented batter of rice and lentils, typically served with sambar and chutney."));
        list.add(new MainModel(R.drawable.idly,"Idly","30","Idly is a traditional South Indian breakfast dish made from fermented rice and lentil batter, typically served with sambar and coconut chutney."));
        list.add(new MainModel(R.drawable.pokora,"Pakora","20","Pakora is a popular Indian snack made by deep-frying batter-coated vegetables, paneer, or meat, often served with chutney."));
        list.add(new MainModel(R.drawable.shrimp_curry,"Shrimp Curry","100","Shrimp curry is a flavorful Indian dish made with succulent shrimp cooked in a spicy and aromatic sauce typically served with rice or bread."));
        list.add(new MainModel(R.drawable.veg_pulau,"Veg Pulau","60","Veg pulao is a fragrant Indian rice dish made with basmati rice, mixed vegetables, and aromatic spices, typically served with raita or curry."));

    }

    private void autumn() {
        list =new ArrayList<>();
        list.add(new MainModel(R.drawable.northern_meal,"Autumn","40","Northern Indian cuisine is characterized by the use of rich and creamy gravies, flatbread like naan and roti, and a variety of vegetarian dishes."));
        list.add(new MainModel(R.drawable.dosa,"Dosa","40","Dosa is a popular South Indian dish made from a fermented batter of rice and lentils, typically served with sambar and chutney."));
        list.add(new MainModel(R.drawable.idly,"Idly","30","Idly is a traditional South Indian breakfast dish made from fermented rice and lentil batter, typically served with sambar and coconut chutney."));
        list.add(new MainModel(R.drawable.pokora,"Pakora","20","Pakora is a popular Indian snack made by deep-frying batter-coated vegetables, paneer, or meat, often served with chutney."));
        list.add(new MainModel(R.drawable.shrimp_curry,"Shrimp Curry","100","Shrimp curry is a flavorful Indian dish made with succulent shrimp cooked in a spicy and aromatic sauce typically served with rice or bread."));
        list.add(new MainModel(R.drawable.veg_pulau,"Veg Pulau","60","Veg pulao is a fragrant Indian rice dish made with basmati rice, mixed vegetables, and aromatic spices, typically served with raita or curry."));


    }

    private void summer() {
        list =new ArrayList<>();
        list.add(new MainModel(R.drawable.northern_meal,"Summer","40","Northern Indian cuisine is characterized by the use of rich and creamy gravies, flatbread like naan and roti, and a variety of vegetarian dishes."));
        list.add(new MainModel(R.drawable.dosa,"Dosa","40","Dosa is a popular South Indian dish made from a fermented batter of rice and lentils, typically served with sambar and chutney."));
        list.add(new MainModel(R.drawable.idly,"Idly","30","Idly is a traditional South Indian breakfast dish made from fermented rice and lentil batter, typically served with sambar and coconut chutney."));
        list.add(new MainModel(R.drawable.pokora,"Pakora","20","Pakora is a popular Indian snack made by deep-frying batter-coated vegetables, paneer, or meat, often served with chutney."));
        list.add(new MainModel(R.drawable.shrimp_curry,"Shrimp Curry","100","Shrimp curry is a flavorful Indian dish made with succulent shrimp cooked in a spicy and aromatic sauce typically served with rice or bread."));
        list.add(new MainModel(R.drawable.veg_pulau,"Veg Pulau","60","Veg pulao is a fragrant Indian rice dish made with basmati rice, mixed vegetables, and aromatic spices, typically served with raita or curry."));

    }

    private void spring() {
        list =new ArrayList<>();
        list.add(new MainModel(R.drawable.northern_meal,"Spring","40","Northern Indian cuisine is characterized by the use of rich and creamy gravies, flatbread like naan and roti, and a variety of vegetarian dishes."));
        list.add(new MainModel(R.drawable.dosa,"Dosa","40","Dosa is a popular South Indian dish made from a fermented batter of rice and lentils, typically served with sambar and chutney."));
        list.add(new MainModel(R.drawable.idly,"Idly","30","Idly is a traditional South Indian breakfast dish made from fermented rice and lentil batter, typically served with sambar and coconut chutney."));
        list.add(new MainModel(R.drawable.pokora,"Pakora","20","Pakora is a popular Indian snack made by deep-frying batter-coated vegetables, paneer, or meat, often served with chutney."));
        list.add(new MainModel(R.drawable.shrimp_curry,"Shrimp Curry","100","Shrimp curry is a flavorful Indian dish made with succulent shrimp cooked in a spicy and aromatic sauce typically served with rice or bread."));
        list.add(new MainModel(R.drawable.veg_pulau,"Veg Pulau","60","Veg pulao is a fragrant Indian rice dish made with basmati rice, mixed vegetables, and aromatic spices, typically served with raita or curry."));

    }

}