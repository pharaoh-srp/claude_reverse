package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d12 implements h12 {
    public static final d12 a = new d12();

    @Override // defpackage.h12
    public final d54 a(a12 a12Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1153992464);
        e18Var.p(false);
        return null;
    }

    @Override // defpackage.h12
    public final d54 b(a12 a12Var, ld4 ld4Var) {
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-2122982903);
        int iOrdinal = a12Var.ordinal();
        if (iOrdinal == 0) {
            e18Var.a0(-77100430);
            j = gm3.a(e18Var).y;
            e18Var.p(false);
        } else if (iOrdinal == 1) {
            e18Var.a0(-77098414);
            j = gm3.a(e18Var).x;
            e18Var.p(false);
        } else {
            if (iOrdinal != 2) {
                throw ebh.u(e18Var, -77102282, false);
            }
            e18Var.a0(-77096774);
            if (v40.F(e18Var)) {
                e18Var.a0(1904990833);
                gm3.a(e18Var).P.getClass();
                dx1.b.getClass();
                j = cx1.e;
                e18Var.p(false);
            } else {
                e18Var.a0(1905068209);
                gm3.a(e18Var).P.getClass();
                dx1.b.getClass();
                j = cx1.c;
                e18Var.p(false);
            }
            e18Var.p(false);
        }
        e18Var.p(false);
        return new d54(j);
    }

    @Override // defpackage.h12
    public final long c(a12 a12Var, ld4 ld4Var, int i) {
        long j;
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(1251662465);
        int iOrdinal = a12Var.ordinal();
        if (iOrdinal == 0) {
            e18Var.a0(256789675);
            j = gm3.a(e18Var).F;
            e18Var.p(false);
        } else if (iOrdinal == 1) {
            e18Var.a0(256791723);
            j = gm3.a(e18Var).F;
            e18Var.p(false);
        } else {
            if (iOrdinal != 2) {
                throw ebh.u(e18Var, 256787676, false);
            }
            e18Var.a0(256793835);
            j = gm3.a(e18Var).G;
            e18Var.p(false);
        }
        e18Var.p(false);
        return j;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d12);
    }

    public final int hashCode() {
        return -1683196339;
    }

    public final String toString() {
        return "Destructive";
    }
}
