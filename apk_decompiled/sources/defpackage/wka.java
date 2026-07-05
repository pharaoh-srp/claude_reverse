package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class wka {
    public final il8 a;
    public long b;
    public final int c;
    public final int d;
    public final ArrayList e;

    public wka(vf4 vf4Var) {
        il8 il8Var = il8.F;
        this.b = 0L;
        this.e = new ArrayList(16);
        this.c = FreeTypeConstants.FT_LOAD_MONOCHROME;
        this.d = (int) TimeUnit.SECONDS.toMillis(vf4Var.G1);
        this.a = il8Var;
    }

    public final void a(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size() - 1;
        arrayList.set(i, (nwc) arrayList.get(size));
        arrayList.remove(size);
    }

    public final void b(long j) {
        if (j < this.b + 1000) {
            return;
        }
        int i = 0;
        while (i < this.e.size()) {
            nwc nwcVar = (nwc) this.e.get(i);
            if (nwcVar == null) {
                a(i);
            } else {
                if (nwc.s.get(nwcVar) + nwc.r.get(nwcVar) <= 0) {
                    nwc.u.compareAndSet(nwcVar, 3, -1);
                    a(i);
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater = nwc.v;
                    if (j - (atomicLongFieldUpdater.get(nwcVar) / 1000000) > 43200000) {
                        nwc.u.compareAndSet(nwcVar, 3, 4);
                        a(i);
                    } else {
                        if (j - (Math.max(atomicLongFieldUpdater.get(nwcVar), nwc.w.get(nwcVar)) / 1000000) > this.d) {
                            cf5 cf5Var = (cf5) nwcVar.f.peek();
                            Integer numC = null;
                            if (cf5Var != null) {
                                Integer numC2 = cf5Var.c();
                                if (numC2 == null) {
                                    nwc nwcVar2 = cf5Var.c.E;
                                    cf5 cf5Var2 = nwcVar2.m;
                                    nwcVar2.j();
                                    if (cf5Var2 != null) {
                                        numC = cf5Var2.c();
                                    }
                                } else {
                                    numC = numC2;
                                }
                            }
                            if (numC == null || numC.intValue() <= 0) {
                                nwc.u.compareAndSet(nwcVar, 2, -1);
                                a(i);
                            } else {
                                nwc.u.compareAndSet(nwcVar, 2, 3);
                                nwcVar.k(false);
                            }
                        }
                        i++;
                    }
                }
            }
        }
        this.b = j;
        this.a.getClass();
    }
}
