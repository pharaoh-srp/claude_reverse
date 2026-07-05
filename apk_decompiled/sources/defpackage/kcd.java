package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public final class kcd implements wz9 {
    public final int a;
    public final w3c b;
    public final bz7 c;
    public final rl4 d;
    public dvg e;
    public cvg f;
    public boolean g;
    public boolean h;
    public boolean i;
    public Object j;
    public boolean k;
    public jcd l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ bm7 r;

    public kcd(bm7 bm7Var, int i, w3c w3cVar, bz7 bz7Var) {
        this.r = bm7Var;
        this.a = i;
        this.b = w3cVar;
        this.c = bz7Var;
        this.p = brb.a();
    }

    @Override // defpackage.wz9
    public final void a() {
        this.m = true;
    }

    public final void b() {
        cvg cvgVar = this.f;
        if (cvgVar != null) {
            cvgVar.cancel();
        }
        this.f = null;
        dvg dvgVar = this.e;
        if (dvgVar != null) {
            dvgVar.a();
        }
        this.e = null;
        this.l = null;
    }

    public final boolean c(g50 g50Var) {
        boolean zD;
        if (!this.r.a) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(g50Var);
            } finally {
                Trace.endSection();
            }
        } else {
            zD = d(g50Var);
        }
        dgj.U(-1L, "compose:lazy:prefetch:execute:item");
        return zD;
    }

    @Override // defpackage.wz9
    public final void cancel() {
        if (this.h) {
            return;
        }
        this.h = true;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.g50 r20) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcd.d(g50):boolean");
    }

    public final long e(int i) {
        dvg dvgVar = this.e;
        if (dvgVar != null) {
            return dvgVar.b(i);
        }
        return 0L;
    }

    public final boolean f() {
        cvg cvgVar;
        return this.i || ((cvgVar = this.f) != null && cvgVar.isComplete());
    }

    public final void g(Object obj, Object obj2, w91 w91Var) {
        cvg i49Var;
        cvg cvgVar = this.f;
        boolean z = false;
        if (cvgVar == null) {
            bm7 bm7Var = this.r;
            pz7 pz7VarA = ((jz9) bm7Var.b).a(obj, this.a, obj2);
            nv9 nv9VarA = ((fvg) bm7Var.c).a();
            if (nv9VarA.E.X()) {
                nv9VarA.l(obj, pz7VarA, true);
                i49Var = new i49(nv9VarA, 22, obj);
            } else {
                i49Var = new qb5(nv9VarA, obj, z);
            }
            cvgVar = i49Var;
            this.f = cvgVar;
            this.j = obj;
        }
        this.q = false;
        while (!cvgVar.isComplete() && !this.q) {
            cvgVar.H(new u95(this, 10, w91Var));
        }
        i();
        boolean z2 = this.q;
        long j = this.o;
        if (z2) {
            w91Var.b = w91.a(j, w91Var.b);
        } else {
            w91Var.a = w91.a(j, w91Var.a);
        }
    }

    public final boolean h(long j, long j2) {
        if (this.m) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void i() {
        long jA = brb.a();
        long jG = uh6.g(dqh.b(jA, this.p));
        this.o = jG;
        long j = this.n - jG;
        this.n = j;
        this.p = jA;
        dgj.U(j, "compose:lazy:prefetch:available_time_nanos");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.a);
        sb.append(", constraints = ");
        sb.append(this.d);
        sb.append(", isComposed = ");
        sb.append(f());
        sb.append(", isMeasured = ");
        sb.append(this.g);
        sb.append(", isCanceled = ");
        return sq6.v(" }", sb, this.h);
    }

    public kcd(bm7 bm7Var, int i, long j, w3c w3cVar, bz7 bz7Var) {
        this(bm7Var, i, w3cVar, bz7Var);
        this.d = new rl4(j);
    }
}
