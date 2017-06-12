package location_app.hadia.com.locationapp.list_feature;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import location_app.hadia.com.locationapp.R;
import location_app.hadia.com.locationapp.model.GooglePlace;

/**
 * Created by Hadia .
 * IBM
 *
 * @author Hadia
 *         on 6/12/17.
 */

public class LocationListAdapter extends RecyclerView.Adapter <LocationListAdapter.LocationViewHolder>{

    List<GooglePlace> location;
    public LocationListAdapter(List<GooglePlace> location) {

        
            this.location = location;
        
    }

    @Override
    public LocationViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        LocationViewHolder lvh = new LocationViewHolder(v);
        return lvh;
    }

    @Override
    public void onBindViewHolder(LocationViewHolder holder, int position) {
        holder.locatonName.setText(location.get(position).getName());
        holder.locatonAdress.setText(location.get(position).getName());

        if (!location.get(position).getIconURL().isEmpty()) {
            Picasso.with(holder.itemView.getContext())
                    .load(location.get(position).getIconURL())
                    .into(holder.locatonPhoto);
        }
    }

    @Override
    public int getItemCount() {
        return location.size();
    }

    public static class LocationViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.place_name)
        TextView locatonName;
        @BindView(R.id.place_Adress)
        TextView locatonAdress;
        @BindView(R.id.place_photo)
        ImageView locatonPhoto;

        LocationViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);


        }
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
