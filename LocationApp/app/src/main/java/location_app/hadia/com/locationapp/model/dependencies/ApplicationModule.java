package location_app.hadia.com.locationapp.model.dependencies;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import location_app.hadia.com.locationapp.model.AppCache.AppCache;
import location_app.hadia.com.locationapp.model.AppCache.AppCacheImpl;
import location_app.hadia.com.locationapp.model.AppCache.AppManagerImpl;


@Module
public class ApplicationModule {

    private Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @Singleton
    @Provides
    Context provideContext() {
        return context;
    }

    @Singleton
    @Provides
    AppCache provideAppCash() {
        return new AppCacheImpl();
    }

    @Singleton
    @Provides
    AppManagerImpl provideAppManager(AppCache appCache, Context context) {
        return new AppManagerImpl(appCache, context);
    }


}
