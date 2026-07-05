package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class tif implements sif {
    public static final y5f l = new y5f(new d6f(8), new qte(0, 10));
    public boolean a;
    public final ArrayList b = new ArrayList();
    public final evb c;
    public final AtomicLong d;
    public uhf e;
    public ci f;
    public bz3 g;
    public rhf h;
    public uhf i;
    public uhf j;
    public final lsc k;

    public tif(long j) {
        evb evbVar = kka.a;
        this.c = new evb();
        this.d = new AtomicLong(j);
        evb evbVar2 = kka.a;
        evbVar2.getClass();
        this.k = mpk.P(evbVar2);
    }

    public final evb a() {
        return (evb) this.k.getValue();
    }

    public final long b() {
        AtomicLong atomicLong = this.d;
        long andIncrement = atomicLong.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = atomicLong.getAndIncrement();
        }
        return andIncrement;
    }

    public final boolean c(cu9 cu9Var, long j, long j2, phf phfVar, boolean z) {
        bz3 bz3Var = this.g;
        if (bz3Var == null) {
            return true;
        }
        mif mifVar = (mif) bz3Var.F;
        long jA = mifVar.a(cu9Var, j);
        long jA2 = mifVar.a(cu9Var, j2);
        mifVar.q(z);
        return mifVar.t(jA, jA2, false, phfVar);
    }

    public final ArrayList d(cu9 cu9Var) {
        boolean z = this.a;
        ArrayList arrayList = this.b;
        if (!z) {
            a54.s0(arrayList, new u84(2, new ska(24, cu9Var)));
            this.a = true;
        }
        return arrayList;
    }

    public final void e(ztb ztbVar) {
        long j = ztbVar.a;
        evb evbVar = this.c;
        if (evbVar.b(j)) {
            this.b.remove(ztbVar);
            evbVar.g(j);
            uhf uhfVar = this.j;
            if (uhfVar != null) {
                uhfVar.invoke(Long.valueOf(j));
            }
        }
    }
}
