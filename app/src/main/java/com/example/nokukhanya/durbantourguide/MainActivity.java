package com.example.nokukhanya.durbantourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TourRecyclerView adapter;
    RecyclerView recyclerView;

    Restuarent restuarent= new Restuarent();
    Restuarent restuarent2=new Restuarent();
    Restuarent restuarent3=new Restuarent();
    Restuarent restuarent4=new Restuarent();
    Restuarent restuarent5=new Restuarent();


    //Contact contactTwo=new Contact();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.RecyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Restuarent> restuarentArrayList = new ArrayList<>();

        //contact=new Contact();

        restuarent.setName("MOYO RESTAURANT");
        restuarent.setDescrioption("DESCRIPTION");
        restuarent.setAboutRestu("Welcome to moyo – the destination for a unique African dining experience. Inspired by the traditions and values of our ancestors, moyo is a celebration of, and commitment to, the beauty of Africa, and the industry of her people. Our famously warm hospitality and modern African ambiance make the moyo experience an unforgettable one.");
        restuarent.setImage(R.drawable.moyo);

        restuarent2.setName("UNDERWATER RESTAURANT");
        restuarent2.setDescrioption("DESCRIPTION");
        restuarent2.setAboutRestu("What could be more inviting than indulging oneself underwater – drinking fine wine, enjoying haute cuisine or simply relaxing in the lap of luxury – while fish swim past and air bubbles float serenely to the surface? Short of restaurants, bars and hotels ensconced on the surface of the moon, entertainment spaces don’t come much more breathtaking. The magic of architectural brilliance and design ingenuity are certainly on the menu for anyone lucky enough to patronize one of these places.");
        restuarent2.setImage(R.drawable.eatout_res);

        restuarent3.setName("SONDELA BUFFER RESTAURANT");
        restuarent3.setDescrioption("DESCRIPTION");
        restuarent3.setImage(R.drawable.sondela_res);
        restuarent3.setAboutRestu("Sondela restaurant is styled after a South African shabeen and offers traditional South African favourites. In addition to the selection of Shisa Nyama, juicy peri peri chicken, melt in your mouth oxtail; the menu also debuts vegetarian items and a range of platters and snack baskets if you feel like a nibble. With a friendly and interactive atmosphere, enjoy live music on a Saturday night or dinner before going to the Izulu Theatre. Friday nights offer happy hour from 6pm to 7pm.");


        restuarent4.setName("FEATURED RESTAURANT");
        restuarent4.setDescrioption("DESCRIPTION");
        restuarent4.setAboutRestu("Featured offers an unforgettable dining experience with the combination of great food, an extensive wine selection, humidor for cigars and an environment that is relaxing, yet remains up-market. With views overlooking the ocean, excellent meals and attentive staff Havana Grill is a must when visiting Durban, Suncoast Casino. The restaurant specialises in steaks where they proudly offer grain and grass-fed cuts of meat; as well as seafood, lamb, poultry and game dishes.  ");
        restuarent4.setImage(R.drawable.featured);

        restuarent5.setName("CARGO HOLD RESTAURANT");
        restuarent5.setDescrioption("DESCRIPTION");
        restuarent5.setAboutRestu("Cargo hold using the freshest seasonal ingredients will tempt and delight - of course incredible oysters are on the menu - even for breakfast accompanied by Champagne should you wish! Our numerous restaurants and bars offer something for everyone, with fresh seafood, incredible steaks and our famous curry feast. Our delicious and indulgent High Tea is also a firm favourite with plenty of treats to tempt you. Dine together overlooking magnificent views, dine privately with a group of friends or dine at the Chef's table and watch the magic happen first hand - there's so much choice. ");
        restuarent5.setImage(R.drawable.cargo_hold);



        restuarentArrayList.add(restuarent4);
        restuarentArrayList.add(restuarent5);
        restuarentArrayList.add(restuarent2);
        restuarentArrayList.add(restuarent3);
        restuarentArrayList.add(restuarent);

        adapter=new TourRecyclerView(this,restuarentArrayList);
        recyclerView.setAdapter(adapter);

    }
}