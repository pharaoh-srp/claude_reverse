package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cui extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ dui F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cui(dui duiVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = duiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, null, this);
    }
}
