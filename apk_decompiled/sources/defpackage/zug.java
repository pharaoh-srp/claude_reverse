package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zug extends ts9 implements pz7 {
    public final /* synthetic */ iqb F;
    public final /* synthetic */ pz7 G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zug(iqb iqbVar, pz7 pz7Var, int i, int i2) {
        super(2);
        this.F = iqbVar;
        this.G = pz7Var;
        this.H = i;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        bvg.a(x44.p0(this.H | 1), this.I, (ld4) obj, this.G, this.F);
        return iei.a;
    }
}
