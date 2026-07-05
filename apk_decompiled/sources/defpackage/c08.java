package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c08 extends i0 {
    public static final gh3 P = new gh3(pkg.j, sxb.e("Function"));
    public static final gh3 Q = new gh3(pkg.h, sxb.e("KFunction"));
    public final gfa I;
    public final wmc J;
    public final e08 K;
    public final int L;
    public final b08 M;
    public final f08 N;
    public final List O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c08(gfa gfaVar, vz1 vz1Var, e08 e08Var, int i) {
        super(gfaVar, e08Var.a(i));
        vz1Var.getClass();
        e08Var.getClass();
        this.I = gfaVar;
        this.J = vz1Var;
        this.K = e08Var;
        this.L = i;
        this.M = new b08(this);
        this.N = new f08(gfaVar, this);
        ArrayList arrayList = new ArrayList();
        b79 b79Var = new b79(1, i, 1);
        ArrayList arrayList2 = new ArrayList(x44.y(b79Var, 10));
        Iterator it = b79Var.iterator();
        while (true) {
            a79 a79Var = (a79) it;
            if (!a79Var.G) {
                arrayList.add(rai.Q0(this, 3, sxb.e("R"), arrayList.size(), this.I));
                this.O = w44.p1(arrayList);
                return;
            } else {
                arrayList.add(rai.Q0(this, 2, sxb.e("P" + a79Var.nextInt()), arrayList.size(), this.I));
                arrayList2.add(iei.a);
            }
        }
    }

    @Override // defpackage.qqb
    public final /* bridge */ /* synthetic */ Collection O() {
        return lm6.E;
    }

    @Override // defpackage.qqb
    public final /* bridge */ /* synthetic */ fab b0() {
        return eab.b;
    }

    @Override // defpackage.do5
    public final neg d() {
        return neg.n;
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

    @Override // defpackage.bo5
    public final bo5 h() {
        return this.J;
    }

    @Override // defpackage.qqb, defpackage.yh3
    public final List i0() {
        return this.O;
    }

    @Override // defpackage.w9b
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.qqb
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.qqb
    public final /* bridge */ /* synthetic */ Collection j() {
        return lm6.E;
    }

    @Override // defpackage.qqb
    public final int m() {
        return 2;
    }

    @Override // defpackage.qqb
    public final fab m0(es9 es9Var) {
        return this.N;
    }

    @Override // defpackage.qqb
    public final /* bridge */ /* synthetic */ tg3 n0() {
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
        return 4;
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
        String strB = getName().b();
        strB.getClass();
        return strB;
    }

    @Override // defpackage.w9b
    public final boolean x() {
        return false;
    }

    @Override // defpackage.yh3
    public final boolean y() {
        return false;
    }
}
