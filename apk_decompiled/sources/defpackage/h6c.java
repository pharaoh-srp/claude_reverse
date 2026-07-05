package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h6c extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ i6c F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6c(i6c i6cVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = i6cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(null, this);
    }
}
