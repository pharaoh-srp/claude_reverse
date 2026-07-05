package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class fsb extends vp4 {
    public raf E;
    public aae F;
    public float G;
    public /* synthetic */ Object H;
    public final /* synthetic */ isb I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsb(isb isbVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = isbVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return isb.d(this.I, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
