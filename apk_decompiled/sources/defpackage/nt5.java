package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class nt5 implements iy7 {
    public final ov5 E;
    public final lja F;
    public volatile String G;
    public volatile long H;
    public final ConcurrentHashMap I;

    public nt5(ov5 ov5Var, lja ljaVar, iuj iujVar) {
        ljaVar.getClass();
        iujVar.getClass();
        this.E = ov5Var;
        this.F = ljaVar;
        this.H = System.nanoTime();
        this.I = new ConcurrentHashMap();
    }

    @Override // defpackage.bd9
    public final void a(ey7 ey7Var) {
        nv5 nv5Var;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        AtomicInteger atomicInteger3;
        String str = this.G;
        if (str == null || ey7Var.b < this.H) {
            if (str == null || (nv5Var = (nv5) this.E.b.get(str)) == null || (atomicInteger = nv5Var.c) == null) {
                return;
            }
            atomicInteger.incrementAndGet();
            return;
        }
        long j = ey7Var.c;
        long j2 = ey7Var.b;
        Object objComputeIfAbsent = this.I.computeIfAbsent(str, new mt5(0, new h4(14, new v01(11, this))));
        objComputeIfAbsent.getClass();
        uyi uyiVar = (uyi) objComputeIfAbsent;
        synchronized (uyiVar) {
            try {
                uyiVar.c += j;
                if (j <= 700000000 && ey7Var.d) {
                    uyiVar.d += j;
                    nv5 nv5Var2 = (nv5) this.E.b.get(str);
                    if (nv5Var2 != null && (atomicInteger3 = nv5Var2.a) != null) {
                        atomicInteger3.incrementAndGet();
                    }
                    wag wagVar = (wag) uyiVar.b.a();
                    long j3 = j2 - (wagVar != null ? wagVar.a : j2);
                    if (wagVar != null && j3 <= 16666666) {
                        wagVar.b = Math.min(wagVar.b + j, 699999999L);
                        this.F.getClass();
                    } else if (j > 0) {
                        uyiVar.b.add(new wag(j2, j));
                        this.F.getClass();
                    }
                    return;
                }
                nv5 nv5Var3 = (nv5) this.E.b.get(str);
                if (nv5Var3 != null && (atomicInteger2 = nv5Var3.b) != null) {
                    atomicInteger2.incrementAndGet();
                }
            } finally {
            }
        }
    }

    @Override // defpackage.iy7
    public final void b(hy7 hy7Var) {
        hy7Var.getClass();
    }
}
