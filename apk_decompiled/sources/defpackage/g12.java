package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g12 implements h12 {
    public static final g12 a = new g12();

    @Override // defpackage.h12
    public final d54 a(a12 a12Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1525590500);
        long j = gm3.a(e18Var).v;
        e18Var.p(false);
        return new d54(j);
    }

    @Override // defpackage.h12
    public final d54 b(a12 a12Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-921329845);
        int iOrdinal = a12Var.ordinal();
        d54 d54Var = null;
        if (iOrdinal == 0) {
            e18Var.a0(1798674674);
            e18Var.p(false);
        } else if (iOrdinal == 1) {
            e18Var.a0(-634713040);
            long j = gm3.a(e18Var).q;
            e18Var.p(false);
            d54Var = new d54(j);
        } else {
            if (iOrdinal != 2) {
                throw ebh.u(e18Var, -634716337, false);
            }
            e18Var.a0(1798773874);
            e18Var.p(false);
        }
        e18Var.p(false);
        return d54Var;
    }

    @Override // defpackage.h12
    public final long c(a12 a12Var, ld4 ld4Var, int i) {
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-411028525);
        int iOrdinal = a12Var.ordinal();
        if (iOrdinal == 0) {
            e18Var.a0(138582405);
            j = gm3.a(e18Var).k;
            e18Var.p(false);
        } else if (iOrdinal == 1) {
            e18Var.a0(138584709);
            j = gm3.a(e18Var).k;
            e18Var.p(false);
        } else {
            if (iOrdinal != 2) {
                throw ebh.u(e18Var, 138580422, false);
            }
            e18Var.a0(138587077);
            j = gm3.a(e18Var).m;
            e18Var.p(false);
        }
        e18Var.p(false);
        return j;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof g12);
    }

    public final int hashCode() {
        return 1895627055;
    }

    public final String toString() {
        return "Tinted";
    }
}
