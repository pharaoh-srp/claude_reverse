package defpackage;

import com.anthropic.claude.chat.SseKeepaliveWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class kjg extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ SseKeepaliveWorker F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjg(SseKeepaliveWorker sseKeepaliveWorker, vp4 vp4Var) {
        super(vp4Var);
        this.F = sseKeepaliveWorker;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(this);
    }
}
