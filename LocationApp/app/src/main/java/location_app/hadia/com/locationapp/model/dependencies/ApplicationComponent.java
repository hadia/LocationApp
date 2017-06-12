package location_app.hadia.com.locationapp.model.dependencies;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import location_app.hadia.com.locationapp.model.AppCache.AppCache;


@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    Context getContext();

    AppCache getAppCache();


}
