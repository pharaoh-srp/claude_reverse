package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zsf extends vp4 {
    public Context E;
    public /* synthetic */ Object F;
    public final /* synthetic */ atf G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsf(atf atfVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = atfVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, null, this);
    }
}
