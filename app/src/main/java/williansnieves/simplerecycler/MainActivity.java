package williansnieves.simplerecycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import williansnieves.simplerecycler.adapters.ApartmentAdapter;
import williansnieves.simplerecycler.models.Apartment;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    public static String title = "testing title";
    public static int imageFile1 = R.drawable.apartment;
    public static String description = "description";
    public static String place = "Barcelona";
    public static int price = 12000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Apartment> items = new ArrayList<>();

        items.add(new Apartment(imageFile1, title, description, place, price));
        items.add(new Apartment(imageFile1, title, description, place, price));
        items.add(new Apartment(imageFile1, title, description, place, price));
        items.add(new Apartment(imageFile1, title, description, place, price));

        recycler = (RecyclerView) findViewById(R.id.mainRecycler);
        recycler.setHasFixedSize(true);


        lManager = new LinearLayoutManager(this);

        recycler.setLayoutManager(lManager);

        //Crear un nuevo adaptador
        adapter = new ApartmentAdapter(items);
        recycler.setAdapter(adapter);


    }
}
