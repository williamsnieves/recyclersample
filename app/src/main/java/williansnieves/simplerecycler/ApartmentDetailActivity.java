package williansnieves.simplerecycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ApartmentDetailActivity extends AppCompatActivity {

    TextView description;
    TextView title;
    TextView price;
    TextView place;
    ImageView contentImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment_detail);

        title = (TextView)findViewById(R.id.title);
        description = (TextView)findViewById(R.id.description);
        price = (TextView)findViewById(R.id.price);
        place = (TextView)findViewById(R.id.place);
        contentImage = (ImageView)findViewById(R.id.idImagen);

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            title.setText(extras.getString("title"));
            description.setText(extras.getString("description"));
            contentImage.setImageResource(extras.getInt("image"));
            price.setText(extras.getString("price"));
            place.setText(extras.getString("place"));
        }
    }
}
