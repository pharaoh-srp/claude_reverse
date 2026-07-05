package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class icg extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ kcg F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icg(kcg kcgVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = kcgVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(null, MTTypesetterKt.kLineSkipLimitMultiplier, null, this);
    }
}
