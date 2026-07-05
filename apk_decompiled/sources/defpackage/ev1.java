package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ev1 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ fv1 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev1(fv1 fv1Var, vp4 vp4Var) {
        super(vp4Var);
        this.F = fv1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
