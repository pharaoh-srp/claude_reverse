package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l16 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ zy7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l16(int i, zy7 zy7Var) {
        super(0);
        this.F = i;
        this.G = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        zy7 zy7Var = this.G;
        switch (i) {
            case 0:
                return w44.t1((Iterable) zy7Var.a());
            default:
                fab fabVar = (fab) zy7Var.a();
                return fabVar instanceof b4 ? ((b4) fabVar).h() : fabVar;
        }
    }
}
