package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ec implements DefaultLifecycleObserver {
    public final LinkedHashMap E;
    public boolean F;
    public final amg G;
    public final a4e H;

    public ec(c4a c4aVar) {
        c4aVar.getClass();
        this.E = new LinkedHashMap();
        amg amgVarA = bmg.a(null);
        this.G = amgVarA;
        this.H = j8.k(amgVarA);
        c4aVar.a(this);
    }

    public final synchronized void a(Object obj, dc dcVar) {
        try {
            obj.getClass();
            if (dcVar != null) {
                this.E.remove(obj);
            }
            this.E.put(obj, dcVar);
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        Object obj = null;
        if (!this.F) {
            Collection collectionValues = this.E.values();
            collectionValues.getClass();
            for (Object obj2 : collectionValues) {
                if (((dc) obj2) != null) {
                    obj = obj2;
                }
            }
            obj = (dc) obj;
        }
        this.G.m(obj);
    }

    public final synchronized void c(Object obj) {
        obj.getClass();
        this.E.remove(obj);
        b();
    }

    public final synchronized void e(Object obj, dc dcVar) {
        try {
            obj.getClass();
            if (dcVar != null && this.E.get(obj) == null) {
                this.E.remove(obj);
            }
            this.E.put(obj, dcVar);
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(m4a m4aVar) {
        m4aVar.getClass();
        synchronized (this) {
            this.F = false;
            b();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(m4a m4aVar) {
        m4aVar.getClass();
        synchronized (this) {
            this.F = true;
            b();
        }
    }
}
