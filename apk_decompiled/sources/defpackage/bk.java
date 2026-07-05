package defpackage;

import com.anthropic.claude.sessions.api.b;

/* JADX INFO: loaded from: classes3.dex */
public final class bk extends vp4 {
    public String E;
    public /* synthetic */ Object F;
    public final /* synthetic */ b G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.t(null, null, null, this);
    }
}
