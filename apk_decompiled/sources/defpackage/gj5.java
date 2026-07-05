package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gj5 extends vp4 {
    public kmd E;
    public List F;
    public /* synthetic */ Object G;
    public final /* synthetic */ jj5 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj5(jj5 jj5Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = jj5Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.e(null, null, this);
    }
}
