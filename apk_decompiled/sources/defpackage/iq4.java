package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iq4 extends vp4 {
    public zy7 E;
    public z9e F;
    public /* synthetic */ Object G;
    public final /* synthetic */ kq4 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq4(kq4 kq4Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = kq4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.a(null, null, this);
    }
}
