package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class f1h implements ComponentCallbacks2 {
    public final Context E;
    public final WeakReference F;
    public final i1c G;
    public volatile boolean H;
    public final AtomicBoolean I;

    public f1h(s4e s4eVar, Context context, boolean z) {
        i1c cm4Var;
        ConnectivityManager connectivityManager;
        this.E = context;
        this.F = new WeakReference(s4eVar);
        if (z && (connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class)) != null && x44.x(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                cm4Var = new lrb(connectivityManager, this);
            } catch (Exception unused) {
                cm4Var = new cm4();
            }
        } else {
            cm4Var = new cm4();
        }
        this.G = cm4Var;
        this.H = cm4Var.b();
        this.I = new AtomicBoolean(false);
    }

    public final void a() {
        if (this.I.getAndSet(true)) {
            return;
        }
        this.E.unregisterComponentCallbacks(this);
        this.G.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (((s4e) this.F.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        iei ieiVar;
        s4e s4eVar = (s4e) this.F.get();
        if (s4eVar != null) {
            x4e x4eVar = (x4e) s4eVar.b.getValue();
            if (x4eVar != null) {
                x4eVar.a.z(i);
                at atVar = x4eVar.b;
                synchronized (atVar) {
                    if (i >= 10 && i != 20) {
                        atVar.g();
                    }
                }
            }
            ieiVar = iei.a;
        } else {
            ieiVar = null;
        }
        if (ieiVar == null) {
            a();
        }
    }
}
