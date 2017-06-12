package location_app.hadia.com.locationapp.list_feature;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import location_app.hadia.com.locationapp.R;
import location_app.hadia.com.locationapp.model.GooglePlace;
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
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);

        rv.setHasFixedSize(true);


    }
    public void bindLocations(List<GooglePlace> nearbyPlacesList)
    {
        LocationListAdapter adapter = new LocationListAdapter(nearbyPlacesList);

        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        rv.requestFocus();
        rv.setVisibility(View.VISIBLE);

    }
}
