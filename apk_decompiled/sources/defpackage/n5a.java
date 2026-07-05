package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes3.dex */
public final class n5a extends vp4 {
    public o5a E;
    public uub F;
    public /* synthetic */ Object G;
    public final /* synthetic */ o5a H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5a(o5a o5aVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = o5aVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return o5a.j(this.H, null, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
