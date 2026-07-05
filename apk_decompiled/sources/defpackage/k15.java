package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class k15 extends vp4 {
    public String E;
    public AtomicReference F;
    public boolean G;
    public /* synthetic */ Object H;
    public final /* synthetic */ c61 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k15(c61 c61Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = c61Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.I(this, null, false);
    }
}
