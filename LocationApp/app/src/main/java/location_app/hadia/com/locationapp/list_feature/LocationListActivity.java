package location_app.hadia.com.locationapp.list_feature;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import location_app.hadia.com.locationapp.R;
import location_app.hadia.com.locationapp.model.GooglePlace;
import location_app.hadia.com.locationapp.place_details.PlaceDetailsActivity;
import nucleus.factory.RequiresPresenter;
import nucleus.view.NucleusAppCompatActivity;

/**
 * Created by Hadia .
 * IBM
 *
 * @author Hadia
 *         on 6/12/17.
 */
@RequiresPresenter(LocationListPresenter.class)
public class LocationListActivity extends NucleusAppCompatActivity<LocationListPresenter> {
    @BindView(R.id.rv)
    RecyclerView rv ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);

        rv.setLayoutManager(new LinearLayoutManager(this));

    }
    public void bindLocations(List<GooglePlace> nearbyPlacesList)
    {
        LocationListAdapter adapter = new LocationListAdapter(nearbyPlacesList, new OnItemClickListener() {
            @Override
            public void onItemClick(GooglePlace item) {
                Intent intent = new Intent(getBaseContext(), PlaceDetailsActivity.class);
                String reference = item.getId();
                Log.d("onClick", reference);
                intent.putExtra("reference", reference);


                // Starting the Place Details Activity
                startActivity(intent);
            }
        });

        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        rv.requestFocus();
        rv.setVisibility(View.VISIBLE);

    }
}
