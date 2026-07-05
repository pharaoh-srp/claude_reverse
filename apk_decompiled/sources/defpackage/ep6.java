package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ep6 extends ts9 implements bz7 {
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep6(zy7 zy7Var, boolean z) {
        super(1);
        this.F = z;
        this.G = zy7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        ((xre) obj).d(!this.F && ((Boolean) this.G.a()).booleanValue());
        return iei.a;
    }
}
