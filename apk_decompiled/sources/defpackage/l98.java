package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l98 extends vp4 {
    public sxd E;
    public Iterator F;
    public /* synthetic */ Object G;
    public final /* synthetic */ m98 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l98(m98 m98Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = m98Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.i(this);
    }
}
