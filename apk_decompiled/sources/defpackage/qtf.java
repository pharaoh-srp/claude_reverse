package defpackage;

import com.anthropic.claude.code.remote.notification.SessionReplyActionWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class qtf extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ SessionReplyActionWorker F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtf(SessionReplyActionWorker sessionReplyActionWorker, vp4 vp4Var) {
        super(vp4Var);
        this.F = sessionReplyActionWorker;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.d(this);
    }
}
