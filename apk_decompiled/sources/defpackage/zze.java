package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zze extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public lp7 G;
    public final /* synthetic */ um H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(um umVar, tp4 tp4Var) {
        super(tp4Var);
        this.H = umVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.H.g(null, this);
    }
}
