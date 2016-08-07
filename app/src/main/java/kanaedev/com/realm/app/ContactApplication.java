package kanaedev.com.realm.app;

import android.app.Application;

import org.androidannotations.annotations.EApplication;

import io.realm.Realm;
import io.realm.RealmConfiguration;

@EApplication
public class ContactApplication extends Application {

    public void onCreate() {

        super.onCreate();
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder(this)
                .name(Realm.DEFAULT_REALM_NAME)
                .schemaVersion(0)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);

    }
}
