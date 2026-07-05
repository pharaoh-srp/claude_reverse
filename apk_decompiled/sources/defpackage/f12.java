package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f12 implements h12 {
    public static final f12 a = new f12();

    @Override // defpackage.h12
    public final d54 a(a12 a12Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-1044571554);
        long j = gm3.a(e18Var).v;
        e18Var.p(false);
        return new d54(j);
    }

    @Override // defpackage.h12
    public final d54 b(a12 a12Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1231345559);
        int iOrdinal = a12Var.ordinal();
        d54 d54Var = null;
        if (iOrdinal == 0) {
            e18Var.a0(-300028634);
            e18Var.p(false);
        } else if (iOrdinal == 1) {
            e18Var.a0(-2087886468);
            long j = gm3.a(e18Var).q;
            e18Var.p(false);
            d54Var = new d54(j);
        } else {
            if (iOrdinal != 2) {
                throw ebh.u(e18Var, -2087889765, false);
            }
            e18Var.a0(-299929434);
            e18Var.p(false);
        }
        e18Var.p(false);
        return d54Var;
    }

    @Override // defpackage.h12
    public final long c(a12 a12Var, ld4 ld4Var, int i) {
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-566258161);
        int iOrdinal = a12Var.ordinal();
        if (iOrdinal == 0) {
            e18Var.a0(1286757558);
            j = gm3.a(e18Var).M;
            e18Var.p(false);
        } else if (iOrdinal == 1) {
            e18Var.a0(1286759510);
            j = gm3.a(e18Var).M;
            e18Var.p(false);
        } else {
            if (iOrdinal != 2) {
                throw ebh.u(e18Var, 1286755567, false);
            }
            e18Var.a0(1286761943);
            gm3.a(e18Var).P.getClass();
            dx1.b.getClass();
            j = cx1.d;
            e18Var.p(false);
        }
        e18Var.p(false);
        return j;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f12);
    }

    public final int hashCode() {
        return 219425023;
    }

    public final String toString() {
        return "Secondary";
    }
}
