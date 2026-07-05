package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ghi extends vp4 {
    public qz7 E;
    public zy7 F;
    public float G;
    public /* synthetic */ Object H;
    public final /* synthetic */ hhi I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghi(hhi hhiVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = hhiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.a(null, null, this);
    }
}
