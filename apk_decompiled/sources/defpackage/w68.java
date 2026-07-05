package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w68 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ y68 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w68(y68 y68Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = y68Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(null, null, null, this);
    }
}
