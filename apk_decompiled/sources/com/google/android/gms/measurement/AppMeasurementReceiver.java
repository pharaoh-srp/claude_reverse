package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import defpackage.c6k;
import defpackage.e6j;
import defpackage.qgk;
import defpackage.umk;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends e6j {
    public c6k c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new c6k(this);
        }
        c6k c6kVar = this.c;
        c6kVar.getClass();
        qgk qgkVar = umk.a(context, null, null).M;
        umk.d(qgkVar);
        if (intent == null) {
            qgkVar.M.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        qgkVar.R.c("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                qgkVar.M.b("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        qgkVar.R.b("Starting wakeful intent.");
        ((AppMeasurementReceiver) c6kVar.E).getClass();
        SparseArray sparseArray = e6j.a;
        synchronized (sparseArray) {
            try {
                int i = e6j.b;
                int i2 = i + 1;
                e6j.b = i2;
                if (i2 <= 0) {
                    e6j.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
