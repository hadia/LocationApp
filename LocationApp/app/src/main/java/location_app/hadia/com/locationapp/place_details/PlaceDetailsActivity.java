package location_app.hadia.com.locationapp.place_details;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import location_app.hadia.com.locationapp.R;
import nucleus.factory.RequiresPresenter;
import nucleus.view.NucleusAppCompatActivity;

/**
 * Created by Hadia .
 * IBM
 *
 * @author Hadia
 *         on 6/12/17.
 */
@RequiresPresenter(PlaceDetailsPresenterImpl.class)
public class PlaceDetailsActivity extends NucleusAppCompatActivity<PlaceDetailsPresenterImpl> {
    @BindView(R.id.place_details_name)
    TextView placeNameTv;
    @BindView(R.id.place_details_Address)
    TextView placeAddressTv;
    @BindView(R.id.category)
    TextView categoryTv;
    @BindView(R.id.sub_category)
    TextView sub_category_tv;
    @BindView(R.id.rate)
    TextView rateTv;
    @BindView(R.id.phone)
    TextView phoneTv;
    ProgressDialog progress;
    @BindView(R.id.place_details_photo)
    ImageView placePhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        //Log.d("onClick", getIntent().getStringExtra("placeId"));

        getPresenter().requetGoogleRestaurant(getIntent().getStringExtra("reference"));
        showProgressDiolag();
    }
    public void showProgressDiolag() {
        progress = new ProgressDialog(this);
        progress.setTitle("Loading");
        progress.setMessage("Wait while loading...");
        progress.setCancelable(false); // disable dismiss by tapping outside of the dialog
        progress.show();

    }

    public void dismssProgressDiolag() {
        progress.dismiss();
    }
    public void bindPhone(String phone) {
        phoneTv.setText(phone);
    }

    public void bindName(String name) {
        placeNameTv.setText(name);
    }

    public void bindAddress(String address) {
        placeAddressTv.setText(address);
    }

    @OnClick(R.id.place_details_Address)
    void onClick(View v) {
        getPresenter().openMap();
    }

    public void bindCategory(String category) {
        categoryTv.setText(category);
    }

    public void bindphoto(String url) {
        if (!url.isEmpty()) {
            Picasso.with(this)
                    .load(url)
                    .into(placePhoto);
        }
    }

    public void bindSubCategory(String subCategory) {
        sub_category_tv.setText(subCategory);
    }

    public void bindRate(String rate) {
        rateTv.setText(rate);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
