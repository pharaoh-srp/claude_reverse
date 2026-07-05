package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gg2 extends so5 implements xwg {
    public xwg I;
    public long J;
    public final /* synthetic */ int K = 0;
    public Object L;

    public gg2(gx5 gx5Var) {
        this.L = gx5Var;
    }

    @Override // defpackage.xwg
    public final int d(long j) {
        xwg xwgVar = this.I;
        xwgVar.getClass();
        return xwgVar.d(j - this.J);
    }

    @Override // defpackage.so5
    public final void e() {
        this.F = 0;
        this.G = 0L;
        this.H = false;
        this.I = null;
    }

    @Override // defpackage.so5
    public final void f() {
        switch (this.K) {
            case 0:
                hg2 hg2Var = (hg2) ((do0) this.L).F;
                e();
                hg2Var.b.add(this);
                break;
            default:
                ((gx5) this.L).n(this);
                break;
        }
    }

    @Override // defpackage.xwg
    public final long g(int i) {
        xwg xwgVar = this.I;
        xwgVar.getClass();
        return xwgVar.g(i) + this.J;
    }

    @Override // defpackage.xwg
    public final List i(long j) {
        xwg xwgVar = this.I;
        xwgVar.getClass();
        return xwgVar.i(j - this.J);
    }

    @Override // defpackage.xwg
    public final int l() {
        xwg xwgVar = this.I;
        xwgVar.getClass();
        return xwgVar.l();
    }

    public /* synthetic */ gg2() {
    }
}
