package defpackage;

import com.anthropic.claude.chat.input.draft.DraftMessage;
import com.anthropic.claude.chat.input.draft.QueuedSendRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class g0e extends vp4 {
    public String E;
    public DraftMessage F;
    public QueuedSendRequest G;
    public /* synthetic */ Object H;
    public final /* synthetic */ h0e I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0e(h0e h0eVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = h0eVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.c(null, this);
    }
}
