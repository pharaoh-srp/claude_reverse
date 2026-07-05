package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class gee extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ so8 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gee(so8 so8Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = so8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.b(MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
