package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c0h extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ d0h F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0h(d0h d0hVar, vd1 vd1Var) {
        super(vd1Var);
        this.F = d0hVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.e(0L, null, this);
    }
}
