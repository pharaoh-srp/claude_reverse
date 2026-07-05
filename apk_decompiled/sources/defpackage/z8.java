package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class z8 extends vp4 {
    public boolean E;
    public p8 F;
    public CancellationException G;
    public /* synthetic */ Object H;
    public final /* synthetic */ f9 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(f9 f9Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = f9Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.g(false, this);
    }
}
