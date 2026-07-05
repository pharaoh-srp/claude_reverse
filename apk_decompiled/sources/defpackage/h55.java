package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class h55 extends vp4 {
    public UUID E;
    public String F;
    public long G;
    public /* synthetic */ Object H;
    public final /* synthetic */ i55 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h55(i55 i55Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = i55Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return i55.b(this.I, this);
    }
}
