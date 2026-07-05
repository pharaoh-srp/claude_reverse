package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ua3 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ xa3 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua3(xa3 xa3Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = xa3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, null, null, this);
    }
}
