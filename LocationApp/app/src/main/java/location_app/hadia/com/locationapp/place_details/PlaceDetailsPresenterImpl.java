package location_app.hadia.com.locationapp.place_details;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import location_app.hadia.com.locationapp.common.Interactor;
import location_app.hadia.com.locationapp.common.InteractorSuccessListener;
import location_app.hadia.com.locationapp.get_places_details_response.GetplaceDetailsResponse;
import nucleus.presenter.Presenter;

/**
 * Created by Hadia .
 * IBM
 *
 * @author Hadia
 *         on 6/12/17.
 */

public class PlaceDetailsPresenterImpl extends Presenter<PlaceDetailsActivity> implements PlaceDetailsPresenter {

    GetplaceDetailsResponse place;

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    @Override
    protected void onTakeView(PlaceDetailsActivity placeDetailsActivity) {
        super.onTakeView(placeDetailsActivity);
    }

    @Override
    public void create(Bundle bundle) {
        super.create(bundle);
        place = new GetplaceDetailsResponse();
    }

    @Override
    public void requetGoogleRestaurant(String placeID) {

        new GetPlaceDetailsData(placeID).setSuccessListener(new InteractorSuccessListener<GetplaceDetailsResponse>() {
            @Override
            public void onSuccess(Interactor interactor, GetplaceDetailsResponse result) {
                if (result != null) {
                    place = result;
                    if (getView() != null)

                    {
                        if (result.getResult().getName() != null)
                            getView().bindName(result.getResult().getName());
                        if (result.getResult().getFormattedPhoneNumber() != null)
                            getView().bindPhone(result.getResult().getFormattedPhoneNumber());
                        if (result.getResult().getFormattedAddress() != null)
                            getView().bindAddress(result.getResult().getFormattedAddress());
                        if (result.getResult().getTypes() != null && !result.getResult().getTypes().isEmpty())
                            getView().bindCategory(result.getResult().getTypes().get(0));
                        if (result.getResult().getTypes() != null && result.getResult().getTypes().size() > 1)
                            getView().bindSubCategory(result.getResult().getTypes().get(1));
                        if (result.getResult().getIcon() != null)
                            getView().bindphoto(result.getResult().getIcon());
                        getView().bindRate("" + result.getResult().getRating());
                        getView().dismssProgressDiolag();
                    }
                }
            }
        }).execute();


    }

    @Override
    public void openMap() {
        String strUri = "http://maps.google.com/maps?q=loc:" + place.getResult().getGeometry().getLocation().getLat() + "," + place.getResult().getGeometry().getLocation().getLng() + " (" + "Label which you want" + ")";
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));

        intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        if (getView() != null)
            getView().startActivity(intent);
    }
}
