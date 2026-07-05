package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ckb extends vp4 {
    public short[] E;
    public /* synthetic */ Object F;
    public final /* synthetic */ um G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckb(um umVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = umVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.c(null, this);
    }
}
