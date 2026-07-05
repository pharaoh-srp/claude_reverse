package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class ftj extends SQLiteOpenHelper {
    public final /* synthetic */ int E;
    public final /* synthetic */ rok F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftj(Context context, String str) {
        super(context, str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
        int i = uzj.c;
    }

    private final void c(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void d(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void e(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void f(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i = this.E;
        rok rokVar = this.F;
        switch (i) {
            case 0:
                wrj wrjVar = (wrj) rokVar;
                g0l g0lVar = wrjVar.I;
                if (g0lVar.b != 0) {
                    g0lVar.a.getClass();
                    if (SystemClock.elapsedRealtime() - g0lVar.b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    g0lVar.a.getClass();
                    g0lVar.b = SystemClock.elapsedRealtime();
                    wrjVar.b0().J.b("Opening the database failed, dropping and recreating it");
                    if (!((umk) wrjVar.E).E.getDatabasePath("google_app_measurement.db").delete()) {
                        wrjVar.b0().J.c("Failed to delete corrupted db file", "google_app_measurement.db");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        g0lVar.b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        wrjVar.b0().J.c("Failed to open freshly created database", e);
                        throw e;
                    }
                }
            default:
                ggk ggkVar = (ggk) rokVar;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    ggkVar.b0().J.b("Opening the local database failed, dropping and recreating it");
                    if (!((umk) ggkVar.E).E.getDatabasePath("google_app_measurement_local.db").delete()) {
                        ggkVar.b0().J.c("Failed to delete corrupted local db file", "google_app_measurement_local.db");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        ggkVar.b0().J.c("Failed to open local database. Events will bypass local storage", e3);
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.E;
        rok rokVar = this.F;
        switch (i) {
            case 0:
                btj.c(((wrj) rokVar).b0(), sQLiteDatabase);
                break;
            default:
                btj.c(((ggk) rokVar).b0(), sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.E;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        int i = this.E;
        rok rokVar = this.F;
        switch (i) {
            case 0:
                wrj wrjVar = (wrj) rokVar;
                btj.d(wrjVar.b0(), sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", wrj.J);
                btj.d(wrjVar.b0(), sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                btj.d(wrjVar.b0(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                btj.d(wrjVar.b0(), sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", wrj.K);
                btj.d(wrjVar.b0(), sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", wrj.L);
                btj.d(wrjVar.b0(), sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", wrj.N);
                btj.d(wrjVar.b0(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                btj.d(wrjVar.b0(), sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", wrj.M);
                btj.d(wrjVar.b0(), sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", wrj.O);
                btj.d(wrjVar.b0(), sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", wrj.P);
                btj.d(wrjVar.b0(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                btj.d(wrjVar.b0(), sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", wrj.Q);
                btj.d(wrjVar.b0(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                btj.d(wrjVar.b0(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                btj.d(wrjVar.b0(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", wrj.R);
                b4l.a();
                btj.d(wrjVar.b0(), sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", wrj.S);
                btj.d(wrjVar.b0(), sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", null);
                break;
            default:
                btj.d(((ggk) rokVar).b0(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.E;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ftj(ggk ggkVar, Context context) {
        this(context, "google_app_measurement_local.db");
        this.E = 1;
        this.F = ggkVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ftj(wrj wrjVar, Context context) {
        this(context, "google_app_measurement.db");
        this.E = 0;
        this.F = wrjVar;
    }
}
