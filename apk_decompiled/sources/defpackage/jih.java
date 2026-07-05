package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jih extends vp4 {
    public cae E;
    public cae F;
    public te8 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ sih I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jih(sih sihVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = sihVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return sih.b(this.I, null, false, this);
    }
}
