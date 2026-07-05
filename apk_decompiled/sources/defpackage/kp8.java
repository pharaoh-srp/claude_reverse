package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class kp8 extends hqb implements p6i, d8d, oe4 {
    public ab6 S;
    public l40 T;
    public boolean U;

    public kp8(l40 l40Var, ab6 ab6Var) {
        this.S = ab6Var;
        this.T = l40Var;
    }

    @Override // defpackage.d8d
    public final void C(t7d t7dVar, u7d u7dVar, long j) {
        if (u7dVar == u7d.F) {
            List list = t7dVar.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (s1(((z7d) list.get(i)).j())) {
                    int i2 = t7dVar.f;
                    if (i2 == 4) {
                        this.U = true;
                        r1();
                        return;
                    } else {
                        if (i2 == 5) {
                            t1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.d8d
    public final void R() {
        t1();
    }

    @Override // defpackage.hqb
    public final void i1() {
        t1();
    }

    public final void p1() {
        l40 l40Var;
        dae daeVar = new dae();
        j8.n0(this, new pgg(21, daeVar));
        kp8 kp8Var = (kp8) daeVar.E;
        if (kp8Var == null || (l40Var = kp8Var.T) == null) {
            l40Var = this.T;
        }
        q1(l40Var);
    }

    @Override // defpackage.d8d
    public final long q() {
        ab6 ab6Var = this.S;
        if (ab6Var != null) {
            return ab6Var.a(yfd.W(this).d0);
        }
        int i = d3i.b;
        return am4.u();
    }

    public abstract void q1(x7d x7dVar);

    public final void r1() {
        z9e z9eVar = new z9e();
        z9eVar.E = true;
        j8.p0(this, new h4(18, z9eVar));
        if (z9eVar.E) {
            p1();
        }
    }

    public abstract boolean s1(int i);

    public final void t1() {
        if (this.U) {
            this.U = false;
            if (this.R) {
                dae daeVar = new dae();
                j8.n0(this, new zz(1, daeVar));
                kp8 kp8Var = (kp8) daeVar.E;
                if (kp8Var != null) {
                    kp8Var.p1();
                } else {
                    q1(null);
                }
            }
        }
    }
}
