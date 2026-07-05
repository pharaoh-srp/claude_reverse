package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class yp5 {
    public static final vde p = nz8.t(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final vde q = nz8.t(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final vde r = nz8.t(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final vde s = nz8.t(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final vde t = nz8.t(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final vde u = nz8.t(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static yp5 v;
    public final Context a;
    public final aee b;
    public final poj c;
    public final g1h d;
    public final boolean e;
    public final oag f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public String o;

    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Serializable, nag[]] */
    public yp5(Context context, HashMap map) {
        boolean z;
        g1h g1hVar = g1h.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.b = aee.a(map);
        this.c = new poj(10);
        oag oagVar = new oag();
        oagVar.f = new nag[5];
        oagVar.e = new ArrayList();
        oagVar.a = -1;
        this.f = oagVar;
        this.d = g1hVar;
        this.e = true;
        if (context == null) {
            this.n = 0;
            this.l = 1000000L;
            return;
        }
        w1c w1cVarC = w1c.c(context);
        int iD = w1cVarC.d();
        this.n = iD;
        this.l = a(iD);
        xp5 xp5Var = new xp5(this);
        Executor executorD = ac1.d();
        CopyOnWriteArrayList<v1c> copyOnWriteArrayList = (CopyOnWriteArrayList) w1cVarC.d;
        for (v1c v1cVar : copyOnWriteArrayList) {
            if (v1cVar.a.get() == null) {
                copyOnWriteArrayList.remove(v1cVar);
            }
        }
        v1c v1cVar2 = new v1c(w1cVarC, xp5Var, executorD);
        synchronized (w1cVarC.e) {
            ((CopyOnWriteArrayList) w1cVarC.d).add(v1cVar2);
            z = w1cVarC.b;
        }
        if (z) {
            v1cVar2.b.execute(new pya(2, v1cVar2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:1149:0x1216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(int r15) {
        /*
            Method dump skipped, instruction units count: 8756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yp5.a(int):long");
    }

    public final void b(long j, int i, long j2) {
        final long j3;
        final int i2;
        final long j4;
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        for (final wc1 wc1Var : (CopyOnWriteArrayList) this.c.E) {
            if (wc1Var.c) {
                j3 = j;
                i2 = i;
                j4 = j2;
            } else {
                j3 = j;
                i2 = i;
                j4 = j2;
                wc1Var.a.post(new Runnable() { // from class: vc1
                    @Override // java.lang.Runnable
                    public final void run() {
                        hp5 hp5Var = wc1Var.b;
                        jud judVar = hp5Var.d;
                        kx kxVarD = hp5Var.D(((nz8) judVar.c).isEmpty() ? null : (z7b) qwk.l((nz8) judVar.c));
                        hp5Var.H(kxVarD, 1006, new gp5(kxVarD, i2, j3, j4));
                    }
                });
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }
}
