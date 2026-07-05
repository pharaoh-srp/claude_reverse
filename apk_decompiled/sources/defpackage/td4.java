package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class td4 extends ts9 implements bz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ ww7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td4(ww7 ww7Var, int i) {
        super(1);
        this.F = i;
        this.G = ww7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.F;
        ww7 ww7Var = this.G;
        switch (i) {
            case 0:
                wc0 wc0Var = (wc0) obj;
                wc0Var.getClass();
                return wc0Var.P(ww7Var);
            default:
                ww7 ww7Var2 = (ww7) obj;
                ww7Var2.getClass();
                return Boolean.valueOf(!ww7Var2.d() && ww7Var2.e().equals(ww7Var));
        }
    }
}
