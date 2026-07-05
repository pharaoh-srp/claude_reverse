package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wo0 extends v09 {
    public final /* synthetic */ int H;
    public final /* synthetic */ bp0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(bp0 bp0Var, int i) {
        super(bp0Var.G);
        this.H = i;
        switch (i) {
            case 1:
                this.I = bp0Var;
                super(bp0Var.G);
                break;
            default:
                this.I = bp0Var;
                break;
        }
    }

    @Override // defpackage.v09
    public final Object a(int i) {
        int i2 = this.H;
        bp0 bp0Var = this.I;
        switch (i2) {
            case 0:
                return bp0Var.f(i);
            default:
                return bp0Var.i(i);
        }
    }

    @Override // defpackage.v09
    public final void c(int i) {
        int i2 = this.H;
        bp0 bp0Var = this.I;
        switch (i2) {
            case 0:
                bp0Var.g(i);
                break;
            default:
                bp0Var.g(i);
                break;
        }
    }
}
