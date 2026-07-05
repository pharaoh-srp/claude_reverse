package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i16 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ k16 G;
    public final /* synthetic */ m16 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i16(k16 k16Var, m16 m16Var, int i) {
        super(0);
        this.F = i;
        this.G = k16Var;
        this.H = m16Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        m16 m16Var = this.H;
        k16 k16Var = this.G;
        switch (i) {
            case 0:
                return dxf.p0(k16Var.a.keySet(), m16Var.o());
            default:
                return dxf.p0(k16Var.b.keySet(), m16Var.p());
        }
    }
}
