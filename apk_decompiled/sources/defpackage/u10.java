package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u10 extends ts9 implements pz7 {
    public final /* synthetic */ iqb F;
    public final /* synthetic */ pz7 G;
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u10(iqb iqbVar, pz7 pz7Var, int i) {
        super(2);
        this.F = iqbVar;
        this.G = pz7Var;
        this.H = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP0 = x44.p0(this.H | 1);
        wpk.b(this.F, this.G, (ld4) obj, iP0);
        return iei.a;
    }
}
