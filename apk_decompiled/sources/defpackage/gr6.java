package defpackage;

import com.anthropic.claude.code.remote.stores.b;

/* JADX INFO: loaded from: classes2.dex */
public final class gr6 extends vp4 {
    public of0 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ b G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr6(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, null, this);
    }
}
