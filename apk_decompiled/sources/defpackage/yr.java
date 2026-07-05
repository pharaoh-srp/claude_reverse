package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yr implements k0j {
    public volatile double E = Double.NaN;
    public final ConcurrentHashMap F = new ConcurrentHashMap();

    @Override // defpackage.k0j
    public final void a(j0j j0jVar) {
        double d = this.E;
        synchronized (this.F) {
            this.F.put(j0jVar, i0j.e);
        }
        if (Double.isNaN(d)) {
            return;
        }
        c(j0jVar, d);
    }

    @Override // defpackage.k0j
    public final void b(j0j j0jVar) {
        j0jVar.getClass();
        synchronized (this.F) {
        }
    }

    public final void c(j0j j0jVar, double d) {
        i0j i0jVar = (i0j) this.F.get(j0jVar);
        if (i0jVar == null) {
            i0jVar = i0j.e;
        }
        int i = i0jVar.a;
        int i2 = i + 1;
        i0j i0jVar2 = new i0j(i2, Math.min(d, i0jVar.b), Math.max(d, i0jVar.c), ((((double) i) * i0jVar.d) + d) / ((double) i2));
        j0jVar.a(i0jVar2);
        synchronized (this.F) {
            this.F.put(j0jVar, i0jVar2);
        }
    }

    @Override // defpackage.k0j
    public final void l(double d) {
        this.E = d;
        synchronized (this.F) {
            Iterator it = this.F.keySet().iterator();
            while (it.hasNext()) {
                c((j0j) it.next(), d);
            }
        }
    }
}
