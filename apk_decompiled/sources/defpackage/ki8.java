package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ki8 extends vp4 {
    public sk8 E;
    public List F;
    public /* synthetic */ Object G;
    public final /* synthetic */ oi8 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki8(oi8 oi8Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = oi8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.e(null, null, null, 0, null, this);
    }
}
