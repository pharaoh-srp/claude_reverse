package defpackage;

import com.anthropic.claude.sessions.api.h;

/* JADX INFO: loaded from: classes3.dex */
public final class svf extends vp4 {
    public /* synthetic */ Object E;
    public int F;
    public final /* synthetic */ h G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svf(h hVar, tp4 tp4Var) {
        super(tp4Var);
        this.G = hVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.F |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
