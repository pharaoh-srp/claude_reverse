package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class un9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ vn9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un9(vn9 vn9Var, int i) {
        super(0);
        this.F = i;
        this.G = vn9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        vn9 vn9Var = this.G;
        switch (i) {
            case 0:
                return new tn9(vn9Var);
            default:
                return vn9Var.w();
        }
    }
}
