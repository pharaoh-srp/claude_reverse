package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class u5l {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final sqb b;
    public boolean g;
    public final Intent h;
    public lj1 l;
    public abk m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final bmj j = new bmj(3, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public u5l(Context context, sqb sqbVar, Intent intent) {
        this.a = context;
        this.b = sqbVar;
        this.h = intent;
    }

    public static void b(u5l u5lVar, qzk qzkVar) {
        abk abkVar = u5lVar.m;
        sqb sqbVar = u5lVar.b;
        ArrayList<qzk> arrayList = u5lVar.d;
        if (abkVar != null || u5lVar.g) {
            if (!u5lVar.g) {
                qzkVar.run();
                return;
            } else {
                sqbVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(qzkVar);
                return;
            }
        }
        sqbVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(qzkVar);
        lj1 lj1Var = new lj1(6, u5lVar);
        u5lVar.l = lj1Var;
        u5lVar.g = true;
        if (u5lVar.a.bindService(u5lVar.h, lj1Var, 1)) {
            return;
        }
        sqbVar.c("Failed to bind to the service.", new Object[0]);
        u5lVar.g = false;
        for (qzk qzkVar2 : arrayList) {
            zzy zzyVar = new zzy("Failed to bind to the service.");
            j5h j5hVar = qzkVar2.E;
            if (j5hVar != null) {
                j5hVar.c(zzyVar);
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

    public final void c(qzk qzkVar, j5h j5hVar) {
        a().post(new vyk(this, qzkVar.E, j5hVar, qzkVar, 2));
    }

    public final void d(j5h j5hVar) {
        synchronized (this.f) {
            this.e.remove(j5hVar);
        }
        a().post(new n3l(0, this));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((j5h) it.next()).c(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
