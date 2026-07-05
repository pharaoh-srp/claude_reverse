package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ej5 extends vp4 {
    public kmd E;
    public String F;
    public /* synthetic */ Object G;
    public final /* synthetic */ jj5 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej5(jj5 jj5Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = jj5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.h(null, null, this);
    }
}
