package williansnieves.simplerecycler.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.util.ArrayList;

import williansnieves.simplerecycler.ApartmentDetailActivity;
import williansnieves.simplerecycler.R;
import williansnieves.simplerecycler.models.Apartment;
import williansnieves.simplerecycler.models.details.DetailApartment;

/**
 * Created by willians on 17/8/17.
 */

public class ApartmentAdapter extends RecyclerView.Adapter<ApartmentAdapter.ApartmentViewHolder> {
    private ArrayList<Apartment> items;
    Context context;
    private Intent intent;;

    public String title;
    public String description;
    public String place;
    public int price;
    public int image;

    public class ApartmentViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // campos respectivos de un item
        public ImageView idImagen;
        public TextView titleApartment;
        public TextView descriptionApartment;
        AppCompatActivity activity;

        public ApartmentViewHolder (View v){
            super(v);
            context = v.getContext();
            itemView.setOnClickListener(this);

            titleApartment = (TextView) v.findViewById(R.id.titleApartment);
            descriptionApartment = (TextView) v.findViewById(R.id.description);
            idImagen = (ImageView) v.findViewById(R.id.apartmentImage);

        }

        @Override
        public void onClick(View v) {
            switch (getLayoutPosition()){
                case 0:
                    try {
                        title = (String) DetailApartment.getDetailApartment().getJSONObject("item1").get("title");
                        description = (String) DetailApartment.getDetailApartment().getJSONObject("item1").get("description");
                        place = (String) DetailApartment.getDetailApartment().getJSONObject("item1").get("place");
                        price = (int) DetailApartment.getDetailApartment().getJSONObject("item1").get("price");
                        image = (int) DetailApartment.getDetailApartment().getJSONObject("item1").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ApartmentDetailActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("place", place);
                    intent.putExtra("price", price);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
                case 1:
                    try {
                        title = (String) DetailApartment.getDetailApartment().getJSONObject("item2").get("title");
                        description = (String) DetailApartment.getDetailApartment().getJSONObject("item2").get("description");
                        place = (String) DetailApartment.getDetailApartment().getJSONObject("item2").get("place");
                        price = (int) DetailApartment.getDetailApartment().getJSONObject("item2").get("price");
                        image = (int) DetailApartment.getDetailApartment().getJSONObject("item1").get("image");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    //Toast.makeText(v.getContext(), "CLIKC Alianza items", Toast.LENGTH_SHORT).show();
                    intent = new Intent(context, ApartmentDetailActivity.class);
                    intent.putExtra("title", title);
                    intent.putExtra("description", description);
                    intent.putExtra("phone", place);
                    intent.putExtra("email", price);
                    intent.putExtra("image", image);
                    context.startActivity(intent);
                    break;
            }
        }


        public void setTitle(String title){
            titleApartment.setText(title);
        }

        public void setDescription(String benefit){
            descriptionApartment.setText(benefit);
        }

        public void setImage(int urlImg){
            Picasso.with(context)
                    .load(urlImg)
                    .fit()
                    .centerCrop()
                    .into(idImagen);
        }
    }

    public ApartmentAdapter(ArrayList<Apartment> items){
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public ApartmentAdapter.ApartmentViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.apartment_card, viewGroup, false);
        return new ApartmentAdapter.ApartmentViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ApartmentAdapter.ApartmentViewHolder viewHolder, int i) {
        Apartment currentItem = items.get(i);
        viewHolder.setTitle(currentItem.getTitle());
        viewHolder.setDescription(currentItem.getDescription());
        viewHolder.setImage(currentItem.getIdImagen());
    }
}
