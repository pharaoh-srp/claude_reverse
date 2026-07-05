package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fp6 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ bz7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp6(int i, bz7 bz7Var) {
        super(1);
        this.F = i;
        this.G = bz7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        bz7 bz7Var = this.G;
        switch (i) {
            case 0:
                return new y69(((long) ((Number) bz7Var.invoke(Integer.valueOf((int) (((g79) obj).a >> 32)))).intValue()) << 32);
            case 1:
                return new y69(((long) ((Number) bz7Var.invoke(Integer.valueOf((int) (((g79) obj).a >> 32)))).intValue()) << 32);
            default:
                yr9 yr9Var = (yr9) obj;
                yr9Var.getClass();
                return bz7Var.invoke(yr9Var).toString();
        }
    }
}
