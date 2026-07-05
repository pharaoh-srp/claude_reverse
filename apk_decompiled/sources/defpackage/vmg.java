package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vmg extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ wmg G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmg(wmg wmgVar, int i) {
        super(0);
        this.F = i;
        this.G = wmgVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        wmg wmgVar = this.G;
        switch (i) {
            case 0:
                c16 c16Var = wmgVar.b;
                return x44.X(xzk.s(c16Var), xzk.t(c16Var));
            default:
                return x44.Y(xzk.r(wmgVar.b));
        }
    }
}
