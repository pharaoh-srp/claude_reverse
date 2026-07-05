package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rs8 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ts8 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs8(ts8 ts8Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = ts8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(null, this);
    }
}
