package siftscience.android;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Looper;
import android.os.WorkSource;
import android.provider.Settings;
import android.util.Log;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.sift.api.representations.AndroidAppStateJson;
import com.sift.api.representations.AndroidDeviceLocationJson;
import com.sift.api.representations.MobileEventJson;
import defpackage.bsj;
import defpackage.cec;
import defpackage.cm4;
import defpackage.d5h;
import defpackage.d88;
import defpackage.dba;
import defpackage.dgj;
import defpackage.dke;
import defpackage.ee0;
import defpackage.fba;
import defpackage.fe0;
import defpackage.fnf;
import defpackage.gfe;
import defpackage.hnj;
import defpackage.ire;
import defpackage.iyf;
import defpackage.j3f;
import defpackage.j5h;
import defpackage.j88;
import defpackage.l7k;
import defpackage.m11;
import defpackage.mec;
import defpackage.nyj;
import defpackage.pea;
import defpackage.q08;
import defpackage.r5l;
import defpackage.rea;
import defpackage.sea;
import defpackage.snj;
import defpackage.tea;
import defpackage.umj;
import defpackage.vmj;
import defpackage.w19;
import defpackage.w1c;
import defpackage.x44;
import defpackage.xnj;
import defpackage.xwj;
import defpackage.y5h;
import defpackage.yl4;
import defpackage.zdc;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class AppStateCollector {
    private static final String TAG = "AppStateCollector";
    private boolean acquiredNewLocation;
    private String activityClassName;
    private final Context context;
    private Location lastLocation;
    private Location location;
    private LocationRequest locationRequest;
    private q08 mFusedLocationClient;
    private pea mLocationCallback;
    private sea mLocationSettingsRequest;
    private boolean mRequestingLocationUpdates = false;
    private iyf mSettingsClient;
    private final SiftImpl sift;

    public AppStateCollector(SiftImpl siftImpl, Context context) {
        this.sift = siftImpl;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.acquiredNewLocation = false;
        if (siftImpl.getConfig().disallowLocationCollection) {
            return;
        }
        int i = rea.a;
        nyj nyjVar = snj.l;
        d88 d88Var = d88.c;
        ee0 ee0Var = fe0.a;
        this.mFusedLocationClient = new snj(applicationContext, nyjVar, ee0Var, d88Var);
        this.mSettingsClient = new snj(applicationContext, nyjVar, ee0Var, d88Var);
        createLocationCallback();
        createLocationRequest();
        buildLocationSettingsRequest();
    }

    private void buildLocationSettingsRequest() {
        ArrayList arrayList = new ArrayList();
        LocationRequest locationRequest = this.locationRequest;
        if (locationRequest != null) {
            arrayList.add(locationRequest);
        }
        this.mLocationSettingsRequest = new sea(arrayList, false, false);
    }

    private boolean checkPermissions() {
        return x44.x(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0 && x44.x(this.context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    private void createLocationCallback() {
        this.mLocationCallback = new pea() { // from class: siftscience.android.AppStateCollector.1
            @Override // defpackage.pea
            public void onLocationResult(LocationResult locationResult) {
                if (locationResult == null) {
                    return;
                }
                String unused = AppStateCollector.TAG;
                AppStateCollector.this.acquiredNewLocation = true;
                AppStateCollector.this.location = locationResult.l0();
                AppStateCollector.this.doCollect();
                try {
                    if (AppStateCollector.this.sift.getConfig().disallowLocationCollection || AppStateCollector.this.mFusedLocationClient == null) {
                        return;
                    }
                    AppStateCollector.this.disconnectLocationServices();
                } catch (Exception e) {
                    Log.e(AppStateCollector.TAG, "Encountered exception in onLocationChanged", e);
                }
            }
        };
    }

    private void createLocationRequest() {
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, SignalCredentialStateController.MAX_RETRY_TIME, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, MTTypesetterKt.kLineSkipLimitMultiplier, true, 3600000L, 0, 0, false, new WorkSource(), null);
        bsj.b(100);
        locationRequest.E = 100;
        long j = locationRequest.G;
        long j2 = locationRequest.F;
        if (j == j2 / 6) {
            locationRequest.G = 10000L;
        }
        if (locationRequest.M == j2) {
            locationRequest.M = 60000L;
        }
        locationRequest.F = 60000L;
        locationRequest.G = 10000L;
        this.locationRequest = locationRequest;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doCollect() {
        this.sift.appendAppStateEvent(new MobileEventJson().withAndroidAppState(get()).withInstallationId(Settings.Secure.getString(this.context.getContentResolver(), "android_id")).withTime(Long.valueOf(Time.now())));
    }

    private AndroidAppStateJson get() {
        Intent intentRegisterReceiver = this.context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("scale", -1) : -1;
        AndroidAppStateJson androidAppStateJsonWithSdkVersion = new AndroidAppStateJson().withActivityClassName(this.activityClassName).withBatteryLevel(Double.valueOf((intExtra == -1 || intExtra2 == -1) ? -1.0d : ((double) intExtra) / ((double) intExtra2))).withBatteryState(Long.valueOf(intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("status", -1) : -1)).withBatteryHealth(Long.valueOf(intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("health", -1) : -1)).withPlugState(Long.valueOf(intentRegisterReceiver != null ? intentRegisterReceiver.getIntExtra("plugged", -1) : -1)).withNetworkAddresses(getIpAddresses()).withSdkVersion(BuildConfig.VERSION_NAME);
        if (hasLocation()) {
            androidAppStateJsonWithSdkVersion.withLocation(getLocation());
        }
        return androidAppStateJsonWithSdkVersion;
    }

    private List<String> getIpAddresses() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces != null) {
                if (!networkInterfaces.hasMoreElements()) {
                    break;
                }
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress()) {
                        String lowerCase = inetAddressNextElement.getHostAddress().toLowerCase(Locale.US);
                        if (lowerCase.indexOf(37) > -1) {
                            lowerCase = lowerCase.substring(0, lowerCase.indexOf(37));
                        }
                        arrayList.add(lowerCase);
                    }
                }
            }
            return arrayList;
        } catch (SocketException e) {
            Log.e(TAG, e.toString());
            return arrayList;
        }
    }

    private AndroidDeviceLocationJson getLocation() {
        Location location = this.acquiredNewLocation ? this.location : this.lastLocation;
        return new AndroidDeviceLocationJson().withLatitude(Double.valueOf(location.getLatitude())).withLongitude(Double.valueOf(location.getLongitude()));
    }

    private boolean hasLocation() {
        return (this.location == null && this.lastLocation == null) ? false : true;
    }

    private void startLocationUpdates() {
        if (!checkPermissions()) {
            doCollect();
            return;
        }
        snj snjVar = (snj) this.mFusedLocationClient;
        snjVar.getClass();
        w19 w19VarB = w19.b();
        w19VarB.c = yl4.F;
        w19VarB.b = 2414;
        r5l r5lVarC = snjVar.c(0, w19VarB.a());
        mec mecVar = new mec() { // from class: siftscience.android.AppStateCollector.3
            @Override // defpackage.mec
            public void onSuccess(Location location) {
                String unused = AppStateCollector.TAG;
                Objects.toString(location);
                if (location != null) {
                    AppStateCollector.this.lastLocation = location;
                }
            }
        };
        r5lVarC.getClass();
        j3f j3fVar = y5h.a;
        r5lVarC.c(j3fVar, mecVar);
        this.mRequestingLocationUpdates = true;
        iyf iyfVar = this.mSettingsClient;
        sea seaVar = this.mLocationSettingsRequest;
        snj snjVar2 = (snj) iyfVar;
        snjVar2.getClass();
        w19 w19VarB2 = w19.b();
        w19VarB2.c = new fnf(21, seaVar);
        w19VarB2.b = 2426;
        r5l r5lVarC2 = snjVar2.c(0, w19VarB2.a());
        mec mecVar2 = new mec() { // from class: siftscience.android.AppStateCollector.5
            @Override // defpackage.mec
            public void onSuccess(tea teaVar) {
                Log.i(AppStateCollector.TAG, "All location settings are satisfied.");
                q08 q08Var = AppStateCollector.this.mFusedLocationClient;
                LocationRequest locationRequest = AppStateCollector.this.locationRequest;
                pea peaVar = AppStateCollector.this.mLocationCallback;
                Looper looperMyLooper = Looper.myLooper();
                snj snjVar3 = (snj) q08Var;
                snjVar3.getClass();
                if (looperMyLooper == null) {
                    looperMyLooper = Looper.myLooper();
                    dgj.w("invalid null looper", looperMyLooper);
                }
                String simpleName = pea.class.getSimpleName();
                dgj.w("Listener must not be null", peaVar);
                fba fbaVar = new fba(looperMyLooper, peaVar, simpleName);
                m11 m11Var = new m11();
                m11Var.G = snjVar3;
                m11Var.E = true;
                m11Var.F = fbaVar;
                dke dkeVar = new dke(m11Var, locationRequest);
                w1c w1cVar = new w1c();
                w1cVar.b = true;
                w1cVar.c = dkeVar;
                w1cVar.d = m11Var;
                w1cVar.e = fbaVar;
                w1cVar.a = 2436;
                boolean z = false;
                dgj.n("Must set unregister function", ((m11) w1cVar.d) != null);
                dgj.n("Must set holder", ((fba) w1cVar.e) != null);
                dba dbaVar = ((fba) w1cVar.e).c;
                dgj.w("Key must not be null", dbaVar);
                gfe gfeVar = new gfe(w1cVar, (fba) w1cVar.e, w1cVar.b, w1cVar.a);
                ire ireVar = new ire(w1cVar, dbaVar, z, 7);
                dgj.w("Listener has already been released.", ((fba) gfeVar.c).c);
                dgj.w("Listener has already been released.", (dba) ireVar.F);
                j88 j88Var = snjVar3.j;
                j88Var.getClass();
                j5h j5hVar = new j5h();
                j88Var.f(j5hVar, gfeVar.b, snjVar3);
                umj umjVar = new umj(new hnj(new vmj(gfeVar, ireVar), j5hVar), j88Var.M.get(), snjVar3);
                xnj xnjVar = j88Var.Q;
                xnjVar.sendMessage(xnjVar.obtainMessage(8, umjVar));
            }
        };
        r5lVarC2.getClass();
        r5lVarC2.c(j3fVar, mecVar2);
        r5lVarC2.a(new cec() { // from class: siftscience.android.AppStateCollector.4
            @Override // defpackage.cec
            public void onFailure(Exception exc) {
                if (!(exc instanceof ApiException)) {
                    String unused = AppStateCollector.TAG;
                    AppStateCollector.this.mRequestingLocationUpdates = false;
                    return;
                }
                int i = ((ApiException) exc).E.E;
                if (i == 6) {
                    Log.i(AppStateCollector.TAG, "Location settings are not satisfied. Try to attempt upgrade location settings");
                } else {
                    if (i != 8502) {
                        return;
                    }
                    Log.i(AppStateCollector.TAG, "Location settings are inadequate, and cannot be fixed here. Fix in Settings.");
                    AppStateCollector.this.mRequestingLocationUpdates = false;
                }
            }
        });
    }

    public void collect() {
        if (this.sift.getConfig().disallowLocationCollection || this.mFusedLocationClient == null || this.mRequestingLocationUpdates) {
            doCollect();
        } else {
            startLocationUpdates();
        }
    }

    public void disconnectLocationServices() {
        q08 q08Var;
        try {
            if (this.sift.getConfig().disallowLocationCollection || (q08Var = this.mFusedLocationClient) == null || !this.mRequestingLocationUpdates) {
                return;
            }
            ((snj) q08Var).b(xwj.b(pea.class.getSimpleName(), this.mLocationCallback), 2418).j(l7k.G, cm4.E).h(new zdc() { // from class: siftscience.android.AppStateCollector.2
                @Override // defpackage.zdc
                public void onComplete(d5h d5hVar) {
                    AppStateCollector.this.mRequestingLocationUpdates = false;
                }
            });
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }
    }

    public void reconnectLocationServices() {
        try {
            if (this.sift.getConfig().disallowLocationCollection || this.mFusedLocationClient == null || this.mRequestingLocationUpdates) {
                return;
            }
            startLocationUpdates();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }
    }

    public void setActivityName(String str) {
        this.activityClassName = str;
    }
}
