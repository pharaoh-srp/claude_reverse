package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.playcore_age_signals.zzp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class y0l {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final bnh b;
    public boolean g;
    public final Intent h;
    public lj1 l;
    public it8 m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final bmj j = new bmj(1, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AgeSignalsService";
    public final WeakReference i = new WeakReference(null);

    public y0l(Context context, bnh bnhVar, Intent intent) {
        this.a = context;
        this.b = bnhVar;
        this.h = intent;
    }

    public static /* bridge */ /* synthetic */ void b(y0l y0lVar, d7k d7kVar) {
        it8 it8Var = y0lVar.m;
        ArrayList arrayList = y0lVar.d;
        bnh bnhVar = y0lVar.b;
        if (it8Var != null || y0lVar.g) {
            if (!y0lVar.g) {
                d7kVar.run();
                return;
            } else {
                bnhVar.i("Waiting to bind to the service.", new Object[0]);
                arrayList.add(d7kVar);
                return;
            }
        }
        bnhVar.i("Initiate binding to the service.", new Object[0]);
        arrayList.add(d7kVar);
        lj1 lj1Var = new lj1(y0lVar);
        y0lVar.l = lj1Var;
        y0lVar.g = true;
        if (y0lVar.a.bindService(y0lVar.h, lj1Var, 1)) {
            return;
        }
        bnhVar.i("Failed to bind to the service.", new Object[0]);
        y0lVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a7k) it.next()).a(new zzp());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                String str = this.c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(j5h j5hVar) {
        synchronized (this.f) {
            this.e.remove(j5hVar);
        }
        a().post(new jnk(this));
    }
}
