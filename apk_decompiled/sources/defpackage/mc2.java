package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mc2 implements qai {
    public final qai E;
    public final yh3 F;
    public final int G;

    public mc2(qai qaiVar, yh3 yh3Var, int i) {
        this.E = qaiVar;
        this.F = yh3Var;
        this.G = i;
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return this.E.E(fo5Var, obj);
    }

    @Override // defpackage.qai
    public final gfa Q() {
        return this.E.Q();
    }

    @Override // defpackage.qai
    public final boolean U() {
        return true;
    }

    @Override // defpackage.xh3
    public final j7g W() {
        return this.E.W();
    }

    @Override // defpackage.xh3, defpackage.bo5
    public final xh3 a() {
        return this.E.a();
    }

    @Override // defpackage.do5
    public final neg d() {
        return this.E.d();
    }

    @Override // defpackage.ub0
    public final wc0 getAnnotations() {
        return this.E.getAnnotations();
    }

    @Override // defpackage.qai
    public final int getIndex() {
        return this.E.getIndex() + this.G;
    }

    @Override // defpackage.bo5
    public final sxb getName() {
        return this.E.getName();
    }

    @Override // defpackage.qai
    public final List getUpperBounds() {
        return this.E.getUpperBounds();
    }

    @Override // defpackage.bo5
    public final bo5 h() {
        return this.F;
    }

    @Override // defpackage.xh3
    public final u9i p() {
        return this.E.p();
    }

    public final String toString() {
        return this.E + "[inner-copy]";
    }

    @Override // defpackage.qai
    public final boolean u() {
        return this.E.u();
    }

    @Override // defpackage.qai
    public final int z() {
        return this.E.z();
    }

    @Override // defpackage.bo5
    public final bo5 a() {
        return this.E.a();
    }

    @Override // defpackage.qai, defpackage.xh3, defpackage.bo5
    public final qai a() {
        return this.E.a();
    }
}
