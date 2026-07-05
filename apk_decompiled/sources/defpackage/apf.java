package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class apf implements ServiceConnection {
    public final Context E;
    public final qb5 G;
    public final poj H;
    public final ch4 J;
    public IBinder K;
    public volatile boolean L;
    public int M;
    public final zof N;
    public final ConcurrentLinkedQueue F = new ConcurrentLinkedQueue();
    public final HashMap I = new HashMap();

    /* JADX WARN: Type inference failed for: r2v1, types: [zof] */
    public apf(Context context, qb5 qb5Var, poj pojVar, ch4 ch4Var) {
        context.getClass();
        this.E = context;
        qb5Var.getClass();
        this.G = qb5Var;
        this.H = pojVar;
        this.J = ch4Var;
        this.N = new IBinder.DeathRecipient() { // from class: zof
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                apf apfVar = this.a;
                apfVar.G.getClass();
                if (Log.isLoggable("ServiceConnection", 5)) {
                    Log.w("ServiceConnection", "Binder died for client:HealthData");
                }
                apfVar.d(new RemoteException("Binder died"));
            }
        };
    }

    public final void a(RemoteException remoteException) {
        HashSet hashSet;
        e();
        poj pojVar = this.H;
        synchronized (((HashSet) pojVar.E)) {
            hashSet = new HashSet((HashSet) pojVar.E);
            ((HashSet) pojVar.E).clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((exf) it.next()).m(remoteException);
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = this.F;
        for (oe1 oe1Var : new ArrayList(concurrentLinkedQueue)) {
            if (concurrentLinkedQueue.remove(oe1Var)) {
                oe1Var.c(remoteException);
            }
        }
    }

    public final void b() {
        if (this.L) {
            return;
        }
        try {
            Context context = this.E;
            Intent intent = new Intent();
            this.J.getClass();
            Intent intent2 = intent.setPackage((String) this.G.E);
            this.G.getClass();
            this.L = context.bindService(intent2.setAction("androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE"), this, 129);
            if (this.L) {
                return;
            }
            this.G.getClass();
            uhk.e("Connection to service is not available for package '" + ((String) this.G.E) + "' and action 'androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE'.");
            RemoteException remoteException = new RemoteException("Binding to service failed");
            this.M = 10;
            d(remoteException);
        } catch (SecurityException e) {
            uhk.k("Failed to bind connection '" + this.G.o() + "', no permission or service not found.", e);
            this.L = false;
            this.K = null;
            throw e;
        }
    }

    public final void c(oe1 oe1Var) {
        try {
            oe1Var.f(this.H);
            IBinder iBinder = this.K;
            iBinder.getClass();
            oe1Var.a(iBinder);
        } catch (DeadObjectException e) {
            d(e);
        } catch (RemoteException e2) {
            e = e2;
            oe1Var.c(e);
        } catch (RuntimeException e3) {
            e = e3;
            oe1Var.c(e);
        }
    }

    public final synchronized void d(RemoteException remoteException) {
        IBinder iBinder = this.K;
        if (iBinder != null && iBinder.isBinderAlive()) {
            if (Log.isLoggable("ServiceConnection", 5)) {
                Log.w("ServiceConnection", "Connection is already re-established. No need to reconnect again");
            }
            return;
        }
        a(remoteException);
        if (this.M < 10) {
            StringBuilder sb = new StringBuilder("WCS SDK Client 'HealthData' disconnected, retrying connection. Retry attempt: ");
            this.G.getClass();
            sb.append(this.M);
            uhk.k(sb.toString(), remoteException);
            ch4 ch4Var = this.J;
            long j = 200 << this.M;
            Handler handler = ch4Var.F;
            handler.sendMessageDelayed(handler.obtainMessage(2, this), j);
        } else {
            uhk.f("Connection disconnected and maximum number of retries reached.", remoteException);
        }
    }

    public final void e() {
        if (this.L) {
            try {
                this.E.unbindService(this);
            } catch (IllegalArgumentException e) {
                uhk.f("Failed to unbind the service. Ignoring and continuing", e);
            }
            this.L = false;
        }
        IBinder iBinder = this.K;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.N, 0);
            } catch (NoSuchElementException e2) {
                uhk.f("mDeathRecipient not linked", e2);
            }
            this.K = null;
        }
        Log.isLoggable("ServiceConnection", 3);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.G.getClass();
        uhk.e("Binding died for client 'HealthData'.");
        d(new RemoteException("Binding died"));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.G.getClass();
        uhk.e("Cannot bind client 'HealthData', binder is null");
        d(new RemoteException("Null binding"));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Objects.toString(componentName);
        Log.isLoggable("ServiceConnection", 3);
        if (iBinder == null) {
            uhk.e("Service connected but binder is null.");
            return;
        }
        this.M = 0;
        try {
            iBinder.linkToDeath(this.N, 0);
        } catch (RemoteException e) {
            uhk.k("Cannot link to death, binder already died. Cleaning operations.", e);
            d(e);
        }
        this.K = iBinder;
        Handler handler = this.J.F;
        handler.sendMessage(handler.obtainMessage(1, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        new StringBuilder("onServiceDisconnected(), componentName = ").append(componentName);
        Log.isLoggable("ServiceConnection", 3);
    }
}
