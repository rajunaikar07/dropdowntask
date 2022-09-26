package com.example.dropdowntask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    PlaceAdapter placeAdapter;
    PlaceModel placeModel;
    List<PlaceModel>placeModelList=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclar1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        placeAdapter=new PlaceAdapter(getApplicationContext(),placeModelList);
        recyclerView.setAdapter(placeAdapter);

       itemdata();
    }

    private void itemdata() {
        placeModel=new PlaceModel("Budangiri",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_2,17.42863720495493,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Mudbidari",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_3,17.43570774179716,78.44453233909633);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Kemmangundi",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_4,17.42863720495493,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Golgummata",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_5,17.43570774179716,78.44453233909633);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Kadur",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_7,17.42863720495493,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Yana",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_6,17.43570774179716,78.44453233909633);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Kadaramandalagi",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_8,17.42863720495493,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Chandragutti",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_9,17.43570774179716,78.44453233909633);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Joga",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_10,17.42863720495493,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Karignur ",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_11,17.43570774179716,78.44453233909633);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Kallathgiri",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_12,17.42863720495493,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Budangiri",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_2,17.43570774179716,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Mudbidari",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_3,17.42863720495493,78.44453233909633);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Kemmangundi",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_4,17.43570774179716,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Golgummata",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_5,17.42863720495493,78.44453233909633);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Kadur",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_7,17.43570774179716,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Yana",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_6,17.42863720495493,78.44453233909633);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Kadaramandalagi",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_8,17.43570774179716,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Chandragutti",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_9,17.42863720495493,78.44453233909633);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Joga",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_10,17.43570774179716,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Karignur ",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_11,17.42863720495493,78.44453233909633);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Kallathgiri",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_12,17.43570774179716,78.45117119676694);
        placeModelList.add(placeModel);
        placeModel=new PlaceModel("Sulekere",R.drawable.ic_baseline_arrow_drop_down_circle_24,R.drawable.ic_baseline_call_24,R.drawable.img,R.drawable.ic_baseline_open_in_browser_24,R.drawable.img_13,17.42863720495493,78.44453233909633);
        placeModelList.add(placeModel);
    }
}