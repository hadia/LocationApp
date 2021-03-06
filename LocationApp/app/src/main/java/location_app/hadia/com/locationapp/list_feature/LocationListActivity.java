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
import location_app.hadia.com.locationapp.model.FourSquarePlace;
import location_app.hadia.com.locationapp.model.GooglePlace;
import location_app.hadia.com.locationapp.model.PlaceModel;
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
    RecyclerView rv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);

        rv.setLayoutManager(new LinearLayoutManager(this));

    }

    public void bindLocations(List<GooglePlace> nearbyPlacesList, List<FourSquarePlace> fourSquarePlaceList) {
        LocationListAdapter adapter = new LocationListAdapter(nearbyPlacesList, fourSquarePlaceList, new OnItemClickListener() {
            @Override
            public void onItemClick(PlaceModel item) {
                if (item instanceof GooglePlace)
                    openDetails("" + item.getId(), true);
                else
                    openDetails("" + ((FourSquarePlace) item).getIndex(), false);
            }


        });

        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        rv.requestFocus();
        rv.setVisibility(View.VISIBLE);

    }

    private void openDetails(String key, boolean isGoogle) {
        Intent intent = new Intent(getBaseContext(), PlaceDetailsActivity.class);

        Log.d("onClick", key);
        intent.putExtra("reference", key);
        intent.putExtra("isGoogle", isGoogle);
        // Starting the Place Details Activity
        startActivity(intent);
    }
}
