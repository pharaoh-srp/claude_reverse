package defpackage;

import com.anthropic.claude.code.remote.c;

/* JADX INFO: loaded from: classes2.dex */
public final class tz3 extends vp4 {
    public gtf E;
    public /* synthetic */ Object F;
    public final /* synthetic */ c G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz3(c cVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return c.P(this.G, null, this);
    }
}
