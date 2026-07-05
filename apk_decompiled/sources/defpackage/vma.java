package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vma extends ts9 implements pz7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ bna G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ iqb I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vma(bna bnaVar, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        super(2);
        this.F = i2;
        this.G = bnaVar;
        this.H = zy7Var;
        this.I = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        iqb iqbVar = this.I;
        zy7 zy7Var = this.H;
        bna bnaVar = this.G;
        ld4 ld4Var = (ld4) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                mkk.c(bnaVar, zy7Var, iqbVar, ld4Var, x44.p0(1));
                break;
            default:
                mkk.c(bnaVar, zy7Var, iqbVar, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }
}
