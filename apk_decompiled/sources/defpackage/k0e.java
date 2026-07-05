package defpackage;

import com.anthropic.claude.chat.queue.QueuedMessageWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class k0e extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ QueuedMessageWorker F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0e(QueuedMessageWorker queuedMessageWorker, vp4 vp4Var) {
        super(vp4Var);
        this.F = queuedMessageWorker;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(this);
    }
}
