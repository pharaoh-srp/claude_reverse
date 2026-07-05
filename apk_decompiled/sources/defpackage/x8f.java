package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class x8f extends vp4 {
    public aae E;
    public /* synthetic */ Object F;
    public int G;

    public x8f(vp4 vp4Var) {
        super(vp4Var);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.G |= Integer.MIN_VALUE;
        return eve.k(null, MTTypesetterKt.kLineSkipLimitMultiplier, null, this);
    }
}
