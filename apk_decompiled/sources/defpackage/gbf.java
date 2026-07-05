package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class gbf {
    public final o25 a;
    public final lp4 b;
    public final if7 c;
    public final h99 d;
    public bh5 e;
    public final AtomicBoolean f;
    public final AtomicReference g;
    public pog h;
    public fi5 i;
    public jki j;
    public wjb k;
    public khd l;
    public final ReentrantReadWriteLock m;
    public final LinkedHashMap n;

    public gbf(o25 o25Var, lp4 lp4Var, if7 if7Var, h99 h99Var) {
        lp4Var.getClass();
        h99Var.getClass();
        this.a = o25Var;
        this.b = lp4Var;
        this.c = if7Var;
        this.d = h99Var;
        int i = 22;
        this.e = new ql8(i);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicReference(null);
        int i2 = 23;
        this.h = new efk(i2);
        this.i = new vz8(i);
        this.j = new a5(24);
        this.k = new dd8(i2);
        this.m = new ReentrantReadWriteLock();
        this.n = new LinkedHashMap();
    }

    public final void a(Object obj) {
        vf7 vf7Var = (vf7) this.g.get();
        if (vf7Var != null) {
            vf7Var.a(obj);
        } else {
            dch.H(this.d, 3, g99.E, new k2c(6, this), null, false, 56);
        }
    }

    public final void b(Set set, pz7 pz7Var) {
        v40.p(this.a.a(), ij0.i("withWriteContext-", this.c.getName()), this.d, new fy1(this, set, pz7Var, 4));
    }
}
