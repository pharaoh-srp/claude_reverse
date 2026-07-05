package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hp0 extends v09 {
    public final /* synthetic */ ip0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(ip0 ip0Var) {
        super(ip0Var.G);
        this.H = ip0Var;
    }

    @Override // defpackage.v09
    public final Object a(int i) {
        return this.H.F[i];
    }

    @Override // defpackage.v09
    public final void c(int i) {
        this.H.a(i);
    }
}
