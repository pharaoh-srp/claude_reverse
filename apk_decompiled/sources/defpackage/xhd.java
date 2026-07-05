package defpackage;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class xhd {
    public static final String l = nga.e("Processor");
    public final Context b;
    public final fg4 c;
    public final ggj d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public xhd(Context context, fg4 fg4Var, ggj ggjVar, WorkDatabase workDatabase) {
        this.b = context;
        this.c = fg4Var;
        this.d = ggjVar;
        this.e = workDatabase;
    }

    public static boolean d(qhj qhjVar, int i) {
        if (qhjVar == null) {
            nga.c().getClass();
            return false;
        }
        qhjVar.b(i);
        nga.c().getClass();
        return true;
    }

    public final void a(h57 h57Var) {
        synchronized (this.k) {
            this.j.add(h57Var);
        }
    }

    public final qhj b(String str) {
        qhj qhjVar = (qhj) this.f.remove(str);
        boolean z = qhjVar != null;
        if (!z) {
            qhjVar = (qhj) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        try {
                            this.b.startService(i1h.d(this.b));
                        } catch (Throwable th) {
                            nga.c().b(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return qhjVar;
    }

    public final qhj c(String str) {
        qhj qhjVar = (qhj) this.f.get(str);
        return qhjVar == null ? (qhj) this.g.get(str) : qhjVar;
    }
}
