package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class x62 extends vp4 {
    public Context E;
    public /* synthetic */ Object F;
    public final /* synthetic */ z62 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x62(z62 z62Var, vp4 vp4Var) {
        super(vp4Var);
        this.G = z62Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.m(this, null, null);
    }
}
