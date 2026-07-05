package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class nfj implements ServiceConnection {
    public final Context E;
    public final Intent F;
    public final ScheduledThreadPoolExecutor G;
    public final ArrayDeque H;
    public lfj I;
    public boolean J;

    public nfj(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new vk5("Firebase-FirebaseInstanceIdServiceConnection", 1));
        this.H = new ArrayDeque();
        this.J = false;
        Context applicationContext = context.getApplicationContext();
        this.E = applicationContext;
        this.F = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.G = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.H.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                lfj lfjVar = this.I;
                if (lfjVar == null || !lfjVar.isBinderAlive()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (!this.J) {
                        this.J = true;
                        try {
                            if (!n78.K().f(this.E, this.F, this, 65)) {
                                Log.e("FirebaseMessaging", "binding to the service failed");
                            }
                        } catch (SecurityException e) {
                            Log.e("FirebaseMessaging", "Exception while binding the service", e);
                        }
                        this.J = false;
                        ArrayDeque arrayDeque = this.H;
                        while (!arrayDeque.isEmpty()) {
                            ((mfj) arrayDeque.poll()).b.d(null);
                        }
                    }
                    return;
                }
                Log.isLoggable("FirebaseMessaging", 3);
                this.I.a((mfj) this.H.poll());
            }
        } finally {
        }
    }

    public final synchronized r5l b(Intent intent) {
        mfj mfjVar;
        Log.isLoggable("FirebaseMessaging", 3);
        mfjVar = new mfj(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.G;
        mfjVar.b.a.i(scheduledThreadPoolExecutor, new jke(11, scheduledThreadPoolExecutor.schedule(new pya(13, mfjVar), 20L, TimeUnit.SECONDS)));
        this.H.add(mfjVar);
        a();
        return mfjVar.b.a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.J = false;
            if (iBinder instanceof lfj) {
                this.I = (lfj) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.H;
            while (!arrayDeque.isEmpty()) {
                ((mfj) arrayDeque.poll()).b.d(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
