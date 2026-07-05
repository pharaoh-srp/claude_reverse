package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pp8 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ rp8 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp8(rp8 rp8Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = rp8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return rp8.q1(this.F, this);
    }
}
