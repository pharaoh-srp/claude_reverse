package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class s4l {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final zf b;
    public boolean g;
    public final Intent h;
    public lj1 l;
    public cbk m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final bmj j = new bmj(2, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public s4l(Context context, zf zfVar, Intent intent) {
        this.a = context;
        this.b = zfVar;
        this.h = intent;
    }

    public static void b(s4l s4lVar, bbk bbkVar) {
        cbk cbkVar = s4lVar.m;
        zf zfVar = s4lVar.b;
        ArrayList<brk> arrayList = s4lVar.d;
        if (cbkVar != null || s4lVar.g) {
            if (!s4lVar.g) {
                bbkVar.run();
                return;
            } else {
                zfVar.f("Waiting to bind to the service.", new Object[0]);
                arrayList.add(bbkVar);
                return;
            }
        }
        zfVar.f("Initiate binding to the service.", new Object[0]);
        arrayList.add(bbkVar);
        lj1 lj1Var = new lj1(5, s4lVar);
        s4lVar.l = lj1Var;
        s4lVar.g = true;
        if (s4lVar.a.bindService(s4lVar.h, lj1Var, 1)) {
            return;
        }
        zfVar.f("Failed to bind to the service.", new Object[0]);
        s4lVar.g = false;
        for (brk brkVar : arrayList) {
            zzu zzuVar = new zzu("Failed to bind to the service.");
            j5h j5hVar = brkVar.E;
            if (j5hVar != null) {
                j5hVar.c(zzuVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((j5h) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
