package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jbc extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ efe F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbc(efe efeVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = efeVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        this.F.l(null, this);
        return m45.E;
    }
}
