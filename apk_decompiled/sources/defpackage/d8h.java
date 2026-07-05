package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d8h extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ e8h F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8h(e8h e8hVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = e8hVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(null, this);
    }
}
