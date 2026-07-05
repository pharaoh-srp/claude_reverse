package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzaf;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class w0l implements ServiceConnection, p3l {
    public final HashMap E = new HashMap();
    public int F = 2;
    public boolean G;
    public IBinder H;
    public final tzk I;
    public ComponentName J;
    public final /* synthetic */ o2l K;

    public w0l(o2l o2lVar, tzk tzkVar) {
        this.K = o2lVar;
        this.I = tzkVar;
    }

    public final void a() {
        tzk tzkVar = this.I;
        o2l o2lVar = this.K;
        o2lVar.c.removeMessages(1, tzkVar);
        o2lVar.d.W(o2lVar.b, this);
        this.G = false;
        this.F = 2;
    }

    public final void b(h7k h7kVar, h7k h7kVar2) {
        this.E.put(h7kVar, h7kVar2);
    }

    public final void c(ServiceConnection serviceConnection) {
        this.E.remove(serviceConnection);
    }

    public final boolean d() {
        return this.G;
    }

    public final int e() {
        return this.F;
    }

    public final boolean f(ServiceConnection serviceConnection) {
        return this.E.containsKey(serviceConnection);
    }

    public final boolean g() {
        return this.E.isEmpty();
    }

    public final IBinder h() {
        return this.H;
    }

    public final ComponentName i() {
        return this.J;
    }

    public final hh4 j(String str, Executor executor) {
        try {
            Intent intentA = wqj.a(this.K.b, this.I);
            this.F = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(uyj.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                o2l o2lVar = this.K;
                n78 n78Var = o2lVar.d;
                Context context = o2lVar.b;
                tzk tzkVar = this.I;
                boolean Z = n78Var.Z(context, str, intentA, this, 4225, executor);
                this.G = Z;
                if (Z) {
                    o2lVar.c.sendMessageDelayed(o2lVar.c.obtainMessage(1, tzkVar), o2lVar.f);
                    hh4 hh4Var = hh4.J;
                    StrictMode.setVmPolicy(vmPolicy);
                    return hh4Var;
                }
                this.F = 2;
                try {
                    o2lVar.d.W(o2lVar.b, this);
                } catch (IllegalArgumentException unused) {
                }
                hh4 hh4Var2 = new hh4(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return hh4Var2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (zzaf e) {
            return e.E;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o2l o2lVar = this.K;
        synchronized (o2lVar.a) {
            try {
                o2lVar.c.removeMessages(1, this.I);
                this.H = iBinder;
                this.J = componentName;
                Iterator it = this.E.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.F = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o2l o2lVar = this.K;
        synchronized (o2lVar.a) {
            try {
                o2lVar.c.removeMessages(1, this.I);
                this.H = null;
                this.J = componentName;
                Iterator it = this.E.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.F = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
