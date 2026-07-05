package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wz6 extends yz6 {
    public final ua2 G;
    public final /* synthetic */ a07 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz6(a07 a07Var, long j, ua2 ua2Var) {
        super(j);
        this.H = a07Var;
        this.G = ua2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.G.F(this.H, iei.a);
    }

    @Override // defpackage.yz6
    public final String toString() {
        return super.toString() + this.G;
    }
}
