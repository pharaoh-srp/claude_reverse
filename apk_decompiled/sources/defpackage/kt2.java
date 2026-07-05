package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class kt2 extends vp4 {
    public File E;
    public /* synthetic */ Object F;
    public final /* synthetic */ pt2 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt2(pt2 pt2Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = pt2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, null, null, null, null, this);
    }
}
