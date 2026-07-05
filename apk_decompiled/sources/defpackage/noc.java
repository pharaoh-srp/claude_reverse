package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class noc extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ ooc F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public noc(ooc oocVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = oocVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(null, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
