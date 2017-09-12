package com.example.nokukhanya.durbantourguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Nokukhanya on 2017/08/15.
 */

public class TourRecyclerView  extends RecyclerView.Adapter <TourRecyclerView.ViewHolder> {

    Context context;
    //Context context2;

    //creating list
    List<Restuarent> RestuarentList;
   // List<beachClass> BeachList;


    //creating a constructor
    public TourRecyclerView(Context context, List<Restuarent> restuarentList) {
        this.context = context;
        this.RestuarentList = restuarentList;
        //this.BeachList = BeachList;

    }

    @Override
    public TourRecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflation--to pull a  Cardlayout to this layout

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_restuarents, parent, false);


        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TourRecyclerView.ViewHolder holder, int position) {

        final Restuarent restuarent = RestuarentList.get(position);
        //final beachClass beach = BeachList.get(position);

        holder.tvName.setText(restuarent.getName());
        holder.tvDescription.setText(restuarent.getDescrioption());
        holder.tvAbout.setText(restuarent.getAboutRestu());

        //
        //holder.bName.setText(beach.getBcName());
        //holder.bDescription.setText(beach.getBcDescription());

        holder.tvImage.setImageResource(Integer.parseInt(String.valueOf(restuarent.getImage())));
       // holder.bImage.setImageResource(Integer.parseInt(String.valueOf(beach.getBcimage())));

        holder.mcardView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Malls.class);

                intent.putExtra("name", restuarent);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        //shows the number of items
        return RestuarentList.size();
    }

    //inner class that helps you to find references
    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvDescription,tvAbout;
        //TextView bName, bDescription;

        ImageView tvImage;
        //ImageView bImage;

        CardView mcardView;
        //CardView bCardView;

        public ViewHolder(View itemView) {
            super(itemView);

            //origin
            tvName = (TextView) itemView.findViewById(R.id.restName);
            tvDescription = (TextView) itemView.findViewById(R.id.restDescription);
            tvAbout=(TextView) itemView.findViewById(R.id.AboutRestaurant);
            tvImage = (ImageView) itemView.findViewById(R.id.restuarent_image);

            //now
            //bName=(TextView) itemView.findViewById(R.id.beachName);
            //bDescription=(TextView) itemView.findViewById(R.id.beachDescription);

            mcardView = (CardView) itemView.findViewById(R.id.IDcardView);
        }

    }
}




