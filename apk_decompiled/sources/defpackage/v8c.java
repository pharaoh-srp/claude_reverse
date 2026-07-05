package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v8c extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ z8c F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8c(z8c z8cVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = z8cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(this);
    }
}
