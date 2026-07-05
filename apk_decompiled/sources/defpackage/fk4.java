package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class fk4 {
    public static final xub a;

    static {
        rse rseVar = t54.e;
        int i = rseVar.c;
        ai4 ai4Var = new ai4(rseVar, rseVar, 1);
        int i2 = rseVar.c;
        kdc kdcVar = t54.x;
        int i3 = (kdcVar.c << 6) | i2;
        ei4 ei4Var = new ei4(rseVar, kdcVar, 0);
        int i4 = (i2 << 6) | kdcVar.c;
        ei4 ei4Var2 = new ei4(kdcVar, rseVar, 0);
        xub xubVar = x69.a;
        xub xubVar2 = new xub();
        xubVar2.i(i | (i << 6), ai4Var);
        xubVar2.i(i3, ei4Var);
        xubVar2.i(i4, ei4Var2);
        a = xubVar2;
    }
}
