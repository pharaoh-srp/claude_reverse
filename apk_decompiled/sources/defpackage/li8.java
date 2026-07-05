package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class li8 extends vp4 {
    public sk8 E;
    public bqh F;
    public List G;
    public /* synthetic */ Object H;
    public final /* synthetic */ oi8 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li8(oi8 oi8Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = oi8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.f(null, null, null, null, this);
    }
}
