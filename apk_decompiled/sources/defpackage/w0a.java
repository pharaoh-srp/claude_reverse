package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w0a extends vp4 {
    public zwb E;
    public xzg F;
    public /* synthetic */ Object G;
    public final /* synthetic */ x0a H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0a(x0a x0aVar, tp4 tp4Var) {
        super(tp4Var);
        this.H = x0aVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.c(null, null, this);
    }
}
