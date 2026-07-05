package androidx.health.platform.client.impl.sdkservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import defpackage.pe9;
import defpackage.rk8;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class HealthDataSdkService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if ("androidx.health.platform.client.ACTION_BIND_SDK_SERVICE".equals(action)) {
            Locale locale = Locale.ROOT;
            return new rk8(getApplicationContext(), Executors.newSingleThreadExecutor(new pe9(Executors.defaultThreadFactory(), new AtomicLong(0L))));
        }
        Log.i("HealthDataSdkService", "Bind request with an invalid action [" + action + "]");
        return null;
    }
}
