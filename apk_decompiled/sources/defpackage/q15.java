package defpackage;

import com.anthropic.claude.conway.protocol.StreamMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class q15 extends vp4 {
    public StreamMessage.ToolCall E;
    public /* synthetic */ Object F;
    public final /* synthetic */ r15 G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q15(r15 r15Var, tp4 tp4Var) {
        super(tp4Var);
        this.G = r15Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
