package example.com.prince.fragment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected{

    TextView tvDescription;
    ArrayList<String> descriptions = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDescription = findViewById(R.id.tvDescripton);

        descriptions.add("Description for item 1.");
        descriptions.add("Description for item 2.");
        descriptions.add("Description for item 3.");
    }

    @Override
    public void onItemSelected(int index) {
        tvDescription.setText(descriptions.get(index));
    }
}
