package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qn9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ rn9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qn9(rn9 rn9Var, int i) {
        super(0);
        this.F = i;
        this.G = rn9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        rn9 rn9Var = this.G;
        switch (i) {
            case 0:
                return new pn9(rn9Var);
            default:
                return rn9Var.w();
        }
    }
}
