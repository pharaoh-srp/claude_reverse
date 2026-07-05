package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ez9 extends hqb implements vd6 {
    public hz9 S;

    @Override // defpackage.vd6
    public final void I0(cv9 cv9Var) {
        ib2 ib2Var = cv9Var.E;
        ArrayList arrayList = this.S.i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bz9 bz9Var = (bz9) arrayList.get(i);
            ja8 ja8Var = bz9Var.n;
            if (ja8Var != null) {
                long j = bz9Var.m;
                long j2 = ja8Var.t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                ((efe) ib2Var.F.E).G(f, f2);
                try {
                    csg.t(cv9Var, ja8Var);
                } finally {
                    ((efe) ib2Var.F.E).G(-f, -f2);
                }
            }
        }
        cv9Var.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez9) && x44.r(this.S, ((ez9) obj).S);
    }

    @Override // defpackage.hqb
    public final void h1() {
        this.S.j = this;
    }

    public final int hashCode() {
        return this.S.hashCode();
    }

    @Override // defpackage.hqb
    public final void i1() {
        hz9 hz9Var = this.S;
        hz9Var.e();
        hz9Var.b = null;
        hz9Var.c = -1;
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.S + ')';
    }
}
