package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ipf extends vp4 {
    public m7f E;
    public String F;
    public tl0 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ pyk I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipf(pyk pykVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = pykVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.p0(null, null, this);
    }
}
