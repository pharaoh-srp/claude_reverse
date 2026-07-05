package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ph8 extends vp4 {
    public Object E;
    public Set F;
    public /* synthetic */ Object G;
    public final /* synthetic */ th8 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph8(th8 th8Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = th8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.e(null, this);
    }
}
