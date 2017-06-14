package location_app.hadia.com.locationapp.list_feature;

        import android.content.Intent;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.RelativeLayout;
        import android.widget.TextView;

        import com.squareup.picasso.Picasso;

        import java.util.ArrayList;
        import java.util.List;

        import butterknife.BindView;
        import butterknife.ButterKnife;
        import butterknife.OnClick;
        import location_app.hadia.com.locationapp.R;
        import location_app.hadia.com.locationapp.model.FourSquarePlace;
        import location_app.hadia.com.locationapp.model.GooglePlace;
        import location_app.hadia.com.locationapp.model.PlaceModel;

/**
 * Created by Hadia .
 * IBM
 *
 * @author Hadia
 *         on 6/12/17.
 */

public class LocationListAdapter extends RecyclerView.Adapter <LocationListAdapter.LocationViewHolder>{

    ArrayList<PlaceModel> locationList;
    private final OnItemClickListener listener;


    public LocationListAdapter(List<GooglePlace> location, List<FourSquarePlace> fourSquarePlacesList, OnItemClickListener listener) {

        this.listener = listener;

        this.locationList =new ArrayList<>();
        locationList.addAll(location);
        locationList.addAll(fourSquarePlacesList);



    }

    @Override
    public LocationViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        LocationViewHolder lvh = new LocationViewHolder(v);
        return lvh;
    }

    @Override
    public void onBindViewHolder(LocationViewHolder holder, int position) {

        holder.locatonName.setText(locationList.get(position).getName());
        holder.locatonAdress.setText(locationList.get(position).getVicinity());

        holder.bind( locationList.get(position), listener);

        if (!locationList.get(position).getIconURL().isEmpty()) {
            Picasso.with(holder.itemView.getContext())
                    .load(locationList.get(position).getIconURL())
                    .into(holder.locatonPhoto);
        }

    }

    @Override
    public int getItemCount() {
        return (locationList.size());
    }

    public static class LocationViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.place_name)
        TextView locatonName;
        @BindView(R.id.place_Adress)
        TextView locatonAdress;
        @BindView(R.id.place_photo)
        ImageView locatonPhoto;

        @BindView(R.id.list_layout)
        RelativeLayout layout;
        LocationViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);


        }

        public void bind(final PlaceModel item, final OnItemClickListener listener) {

            layout.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}

