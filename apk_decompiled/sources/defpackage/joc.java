package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class joc extends vp4 {
    public koc E;
    public zwb F;
    public xzg G;
    public /* synthetic */ Object H;
    public final /* synthetic */ koc I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joc(koc kocVar, tp4 tp4Var) {
        super(tp4Var);
        this.I = kocVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return koc.q(this.I, null, null, this);
    }
}
