package com.example.dropdowntask;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceHolder> {
    Context context;
    List<PlaceModel> placeModelList = new ArrayList<>();

    public PlaceAdapter(Context context, List<PlaceModel> placeModelList) {
        this.context = context;
        this.placeModelList = placeModelList;
    }

    @NonNull
    @Override
    public PlaceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.place, parent, false);

        return new PlaceHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceHolder holder, int position) {
//        PlaceModel placeModel=placeModelList.get(position);
        holder.placeimage.setImageResource(placeModelList.get(position).getImage());
        holder.placename.setText(placeModelList.get(position).getPalcename());
        holder.callimage.setImageResource(placeModelList.get(position).getCall());
        holder.downarrowimage.setImageResource(placeModelList.get(position).getDownArrow());
        holder.mapimage.setImageResource(placeModelList.get(position).getMap());
        holder.browserimage.setImageResource(placeModelList.get(position).getBrowser());

        boolean isExpanded = placeModelList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

        holder.callimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + placeModelList.get(holder.getAdapterPosition()).getCall()));
                    intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    context.startActivity(intent);
                    Toast.makeText(context.getApplicationContext(), "colling", Toast.LENGTH_SHORT).show();
                } catch (android.content.ActivityNotFoundException e) {
                    Toast.makeText(context.getApplicationContext(), "Fai", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    @Override
    public int getItemCount() {
        return placeModelList.size();
    }

    public class PlaceHolder extends RecyclerView.ViewHolder {
        TextView placename;
        ImageView placeimage, downarrowimage, callimage, mapimage, browserimage;
        LinearLayout expandableLayout;

        public PlaceHolder(@NonNull View itemView) {
            super(itemView);
            placeimage = itemView.findViewById(R.id.tImage);
            placename = itemView.findViewById(R.id.tname);
            downarrowimage = itemView.findViewById(R.id.downArrow);
            callimage = itemView.findViewById(R.id.call1);
            mapimage = itemView.findViewById(R.id.map1);
            browserimage = itemView.findViewById(R.id.brose1);
            expandableLayout = itemView.findViewById(R.id.expandablelayout);

            downarrowimage.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    PlaceModel placeModel = placeModelList.get(getAdapterPosition());
                    placeModel.setExpanded(!placeModel.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });



            mapimage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try {

                    String label = placeModelList.get(getAdapterPosition()).getPalcename();

                    String uriBegin = "geo:" + placeModelList.get(getAdapterPosition()).getLattitude() + "," + placeModelList.get(getAdapterPosition()).getLongitude();

                    String query = placeModelList.get(getAdapterPosition()).getLattitude() + "," + placeModelList.get(getAdapterPosition()).getLongitude() + "(" + label + ")";

                    String encodedQuery = Uri.encode(query);

                    String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";


                    Uri uri = Uri.parse(uriString);
                    Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri);

                        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                        context.startActivity(intent);
                }catch (Exception e) {
                        e.printStackTrace();
                    }
                    }
            });

            browserimage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    try{
                        Intent intent=new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://www.google.com"));

                        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                        context.startActivity(intent);


                    }catch (Exception e)
                    {
                        e.printStackTrace();
                        Toast.makeText(context, ""+e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }

    }
}
