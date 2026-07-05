package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ld2 extends vp4 {
    public ed2 E;
    public xd2 F;
    public id2 G;
    public float H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ od2 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld2(od2 od2Var, vp4 vp4Var) {
        super(vp4Var);
        this.K = od2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return od2.a(this.K, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, this);
    }
}
