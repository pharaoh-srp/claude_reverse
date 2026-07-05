package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j3d extends vp4 {
    public List E;
    public /* synthetic */ Object F;
    public final /* synthetic */ tv0 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3d(tv0 tv0Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = tv0Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.i(null, null, this);
    }
}
