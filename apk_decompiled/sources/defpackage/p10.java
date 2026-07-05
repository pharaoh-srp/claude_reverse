package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p10 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ f36 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p10(f36 f36Var, int i) {
        super(1);
        this.F = i;
        this.G = f36Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        f36 f36Var = this.G;
        switch (i) {
            case 0:
                f36Var.show();
                return new o10(0, f36Var);
            default:
                if (f36Var.J.a) {
                    f36Var.I.a();
                }
                return iei.a;
        }
    }
}
