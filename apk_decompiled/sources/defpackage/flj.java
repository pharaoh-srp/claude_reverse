package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.play.integrity.internal.af;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class flj {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final zlj b;
    public boolean g;
    public final Intent h;
    public final yl4 i;
    public lj1 m;
    public ylj n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final bmj k = new bmj(0, this);
    public final AtomicInteger l = new AtomicInteger(0);
    public final String c = "IntegrityService";
    public final WeakReference j = new WeakReference(null);

    public flj(Context context, zlj zljVar, Intent intent, yl4 yl4Var) {
        this.a = context;
        this.b = zljVar;
        this.h = intent;
        this.i = yl4Var;
    }

    public static /* bridge */ /* synthetic */ void b(flj fljVar, jlj jljVar) {
        ylj yljVar = fljVar.n;
        ArrayList arrayList = fljVar.d;
        zlj zljVar = fljVar.b;
        if (yljVar != null || fljVar.g) {
            if (!fljVar.g) {
                jljVar.run();
                return;
            } else {
                zljVar.a("Waiting to bind to the service.", new Object[0]);
                arrayList.add(jljVar);
                return;
            }
        }
        zljVar.a("Initiate binding to the service.", new Object[0]);
        arrayList.add(jljVar);
        lj1 lj1Var = new lj1(fljVar);
        fljVar.m = lj1Var;
        fljVar.g = true;
        if (fljVar.a.bindService(fljVar.h, lj1Var, 1)) {
            return;
        }
        zljVar.a("Failed to bind to the service.", new Object[0]);
        fljVar.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((amj) it.next()).a(new af());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
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
}
