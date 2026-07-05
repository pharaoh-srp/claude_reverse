package defpackage;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public final class q16 extends eo5 implements g16, yh3 {
    public final ow5 I;
    public List J;
    public final j4 K;
    public final gfa L;
    public final ptd M;
    public final txb N;
    public final cbi O;
    public final zp3 P;
    public final d16 Q;
    public j7g R;
    public j7g S;
    public List T;
    public j7g U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q16(gfa gfaVar, bo5 bo5Var, wc0 wc0Var, sxb sxbVar, ow5 ow5Var, ptd ptdVar, txb txbVar, cbi cbiVar, zp3 zp3Var, d16 d16Var) {
        super(bo5Var, wc0Var, sxbVar, neg.n);
        gfaVar.getClass();
        bo5Var.getClass();
        ow5Var.getClass();
        ptdVar.getClass();
        txbVar.getClass();
        cbiVar.getClass();
        zp3Var.getClass();
        this.I = ow5Var;
        this.K = new j4(this);
        this.L = gfaVar;
        this.M = ptdVar;
        this.N = txbVar;
        this.O = cbiVar;
        this.P = zp3Var;
        this.Q = d16Var;
    }

    @Override // defpackage.g16
    public final cbi C() {
        throw null;
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.p(this, obj);
    }

    @Override // defpackage.g16
    public final txb J() {
        throw null;
    }

    @Override // defpackage.g16
    public final d16 L() {
        return this.Q;
    }

    @Override // defpackage.eo5
    /* JADX INFO: renamed from: M0 */
    public final do5 a() {
        return this;
    }

    public final qqb N0() {
        if (ttj.j(O0())) {
            return null;
        }
        xh3 xh3VarA = O0().O().a();
        if (xh3VarA instanceof qqb) {
            return (qqb) xh3VarA;
        }
        return null;
    }

    public final j7g O0() {
        j7g j7gVar = this.S;
        if (j7gVar != null) {
            return j7gVar;
        }
        x44.o0("expandedType");
        throw null;
    }

    public final j7g P0() {
        j7g j7gVar = this.R;
        if (j7gVar != null) {
            return j7gVar;
        }
        x44.o0("underlyingType");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(java.util.List r24, defpackage.j7g r25, defpackage.j7g r26) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q16.Q0(java.util.List, j7g, j7g):void");
    }

    @Override // defpackage.xh3
    public final j7g W() {
        j7g j7gVar = this.U;
        if (j7gVar != null) {
            return j7gVar;
        }
        x44.o0("defaultTypeImpl");
        throw null;
    }

    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    public final bo5 a() {
        return this;
    }

    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    public final xh3 a() {
        return this;
    }

    @Override // defpackage.vwg
    public final do5 e(a aVar) {
        aVar.getClass();
        if (aVar.a.f()) {
            return this;
        }
        bo5 bo5VarH = h();
        bo5VarH.getClass();
        wc0 annotations = getAnnotations();
        annotations.getClass();
        sxb name = getName();
        name.getClass();
        q16 q16Var = new q16(this.L, bo5VarH, annotations, name, this.I, this.M, this.N, this.O, this.P, this.Q);
        q16Var.Q0(i0(), dwk.e(aVar.i(1, P0())), dwk.e(aVar.i(1, O0())));
        return q16Var;
    }

    @Override // defpackage.w9b
    public final boolean g0() {
        return false;
    }

    @Override // defpackage.w9b
    public final ow5 getVisibility() {
        return this.I;
    }

    @Override // defpackage.yh3
    public final List i0() {
        List list = this.J;
        if (list != null) {
            return list;
        }
        x44.o0("declaredTypeParametersImpl");
        throw null;
    }

    @Override // defpackage.w9b
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.xh3
    public final u9i p() {
        return this.K;
    }

    @Override // defpackage.co5
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // defpackage.w9b
    public final boolean x() {
        return false;
    }

    @Override // defpackage.yh3
    public final boolean y() {
        return fbi.c(P0(), new h4(1, this), null);
    }
}
