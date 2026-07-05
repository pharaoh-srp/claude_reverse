package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a96 extends ts9 implements zy7 {
    public final /* synthetic */ boolean F;
    public final /* synthetic */ q28 G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a96(boolean z, q28 q28Var, String str) {
        super(0);
        this.F = z;
        this.G = q28Var;
        this.H = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        if (this.F) {
            q28 q28Var = this.G;
            String str = this.H;
            t5f t5fVar = (t5f) q28Var.F;
            synchronized (t5fVar.c) {
            }
        }
        return iei.a;
    }
}
