package location_app.hadia.com.locationapp.common;

import android.os.AsyncTask;

public interface InteractorListener<R> {
    void onInteractorSuccess(Interactor interactor, R result);
}
