package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tk extends vp4 {
    public boolean E;
    public List F;
    public String G;
    public bae H;
    public /* synthetic */ Object I;
    public final /* synthetic */ wk J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(wk wkVar, vp4 vp4Var) {
        super(vp4Var);
        this.J = wkVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.d(false, this);
    }
}
