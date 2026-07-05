package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class te2 extends vp4 {
    public String E;
    public Closeable F;
    public /* synthetic */ Object G;
    public final /* synthetic */ ue2 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te2(ue2 ue2Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = ue2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.a(null, this);
    }
}
