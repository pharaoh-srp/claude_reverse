package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class avg extends ts9 implements pz7 {
    public final /* synthetic */ fvg F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ pz7 H;
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avg(fvg fvgVar, iqb iqbVar, pz7 pz7Var, int i) {
        super(2);
        this.F = fvgVar;
        this.G = iqbVar;
        this.H = pz7Var;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP0 = x44.p0(this.I | 1);
        bvg.b(this.F, this.G, this.H, (ld4) obj, iP0);
        return iei.a;
    }
}
