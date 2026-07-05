package defpackage;

import com.anthropic.claude.chat.queue.d;

/* JADX INFO: loaded from: classes2.dex */
public final class i0e extends vp4 {
    public fb6 E;
    public /* synthetic */ Object F;
    public final /* synthetic */ d G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0e(d dVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, null, null, this);
    }
}
