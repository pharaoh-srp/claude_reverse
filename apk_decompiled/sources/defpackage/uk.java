package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uk extends vp4 {
    public List E;
    public /* synthetic */ Object F;
    public final /* synthetic */ wk G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(wk wkVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = wkVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.g(this);
    }
}
