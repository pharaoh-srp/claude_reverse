package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m40 extends ts9 implements pz7 {
    public final /* synthetic */ xo1 F;
    public final /* synthetic */ long G;
    public final /* synthetic */ v9d H;
    public final /* synthetic */ ta4 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m40(xo1 xo1Var, long j, v9d v9dVar, ta4 ta4Var, int i) {
        super(2);
        this.F = xo1Var;
        this.G = j;
        this.H = v9dVar;
        this.I = ta4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP0 = x44.p0(24583);
        u40.b(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
        return iei.a;
    }
}
