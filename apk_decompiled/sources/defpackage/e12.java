package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e12 implements h12 {
    public static final e12 a = new e12();

    @Override // defpackage.h12
    public final d54 a(a12 a12Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(414012304);
        e18Var.p(false);
        return null;
    }

    @Override // defpackage.h12
    public final d54 b(a12 a12Var, ld4 ld4Var) {
        d54 d54Var;
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1868892937);
        int iOrdinal = a12Var.ordinal();
        if (iOrdinal == 0) {
            e18Var.a0(709786512);
            long j2 = gm3.a(e18Var).M;
            e18Var.p(false);
            d54Var = new d54(j2);
        } else if (iOrdinal == 1) {
            e18Var.a0(709788464);
            long j3 = gm3.a(e18Var).O;
            e18Var.p(false);
            d54Var = new d54(j3);
        } else {
            if (iOrdinal != 2) {
                throw ebh.u(e18Var, 709784658, false);
            }
            e18Var.a0(709790042);
            if (v40.F(e18Var)) {
                e18Var.a0(528678353);
                gm3.a(e18Var).P.getClass();
                dx1.b.getClass();
                j = cx1.e;
                e18Var.p(false);
            } else {
                e18Var.a0(528755729);
                gm3.a(e18Var).P.getClass();
                dx1.b.getClass();
                j = cx1.c;
                e18Var.p(false);
            }
            e18Var.p(false);
            d54Var = new d54(j);
        }
        e18Var.p(false);
        return d54Var;
    }

    @Override // defpackage.h12
    public final long c(a12 a12Var, ld4 ld4Var, int i) {
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(508364673);
        int iOrdinal = a12Var.ordinal();
        if (iOrdinal == 0) {
            e18Var.a0(-1087817306);
            j = gm3.a(e18Var).n;
            e18Var.p(false);
        } else if (iOrdinal == 1) {
            e18Var.a0(-1087815418);
            j = gm3.a(e18Var).n;
            e18Var.p(false);
        } else {
            if (iOrdinal != 2) {
                throw ebh.u(e18Var, -1087819310, false);
            }
            e18Var.a0(-1087813461);
            j = gm3.a(e18Var).G;
            e18Var.p(false);
        }
        e18Var.p(false);
        return j;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e12);
    }

    public final int hashCode() {
        return -367317939;
    }

    public final String toString() {
        return "Primary";
    }
}
