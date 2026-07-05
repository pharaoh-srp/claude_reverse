package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jpf extends vp4 {
    public ql3 E;
    public r7f F;
    public /* synthetic */ Object G;
    public final /* synthetic */ pyk H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jpf(pyk pykVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = pykVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        Object objD0 = this.H.D0(null, null, null, this);
        if (objD0 == m45.E) {
            return objD0;
        }
        m7f m7fVar = (m7f) objD0;
        if (m7fVar != null) {
            return new o7f(m7fVar);
        }
        return null;
    }
}
