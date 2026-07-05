package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s6c extends xg3 {
    public final boolean K;
    public final ArrayList L;
    public final ph3 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6c(gfa gfaVar, lh3 lh3Var, sxb sxbVar, boolean z, int i) {
        super(gfaVar, lh3Var, sxbVar, neg.n);
        lh3Var.getClass();
        this.K = z;
        b79 b79VarH0 = wd6.H0(0, i);
        ArrayList arrayList = new ArrayList(x44.y(b79VarH0, 10));
        Iterator it = b79VarH0.iterator();
        while (true) {
            a79 a79Var = (a79) it;
            if (!a79Var.G) {
                this.L = arrayList;
                List listQ = sf5.q(this);
                int i2 = o06.a;
                tqb tqbVarD = m06.d(this);
                tqbVarD.getClass();
                this.M = new ph3(this, listQ, sf5.f0(tqbVarD.f().e()), gfaVar);
                return;
            }
            int iNextInt = a79Var.nextInt();
            arrayList.add(rai.Q0(this, 1, sxb.e("T" + iNextInt), iNextInt, gfaVar));
        }
    }

    @Override // defpackage.qqb
    public final Collection O() {
        return lm6.E;
    }

    @Override // defpackage.qqb
    public final /* bridge */ /* synthetic */ fab b0() {
        return eab.b;
    }

    @Override // defpackage.w9b
    public final boolean g0() {
        return false;
    }

    @Override // defpackage.ub0
    public final wc0 getAnnotations() {
        return dd8.F;
    }

    @Override // defpackage.qqb, defpackage.go5, defpackage.w9b
    public final ow5 getVisibility() {
        p06 p06Var = q06.e;
        p06Var.getClass();
        return p06Var;
    }

    @Override // defpackage.qqb, defpackage.yh3
    public final List i0() {
        return this.L;
    }

    @Override // defpackage.xg3, defpackage.w9b
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.qqb
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.qqb
    public final Collection j() {
        return um6.E;
    }

    @Override // defpackage.qqb
    public final int m() {
        return 1;
    }

    @Override // defpackage.qqb
    public final fab m0(es9 es9Var) {
        return eab.b;
    }

    @Override // defpackage.qqb
    public final tg3 n0() {
        return null;
    }

    @Override // defpackage.qqb
    public final sqi o0() {
        return null;
    }

    @Override // defpackage.xh3
    public final u9i p() {
        return this.M;
    }

    @Override // defpackage.qqb
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.qqb, defpackage.w9b
    public final int q() {
        return 1;
    }

    @Override // defpackage.qqb
    public final boolean q0() {
        return false;
    }

    @Override // defpackage.qqb
    public final boolean r0() {
        return false;
    }

    @Override // defpackage.qqb
    public final boolean s0() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // defpackage.w9b
    public final boolean x() {
        return false;
    }

    @Override // defpackage.yh3
    public final boolean y() {
        return this.K;
    }
}
