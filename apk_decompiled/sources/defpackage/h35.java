package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h35 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ k99 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h35(k99 k99Var, int i) {
        super(0);
        this.F = i;
        this.G = k99Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        k99 k99Var = this.G;
        switch (i) {
            case 0:
            case 1:
                return k99Var;
            case 2:
                long jL = k99Var.l();
                return new jph(((jL - System.nanoTime()) / 1000000) + System.currentTimeMillis(), jL);
            default:
                k99Var.y().getClass();
                return Long.valueOf(System.nanoTime());
        }
    }
}
