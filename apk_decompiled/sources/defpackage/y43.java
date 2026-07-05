package defpackage;

import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.chat.input.draft.DraftMessage;
import com.anthropic.claude.chat.input.draft.QueuedSendRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class y43 extends vp4 {
    public DraftMessage E;
    public QueuedSendRequest F;
    public InputMode G;
    public /* synthetic */ Object H;
    public final /* synthetic */ t53 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y43(t53 t53Var, tp4 tp4Var) {
        super(tp4Var);
        this.I = t53Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return t53.f0(this.I, this);
    }
}
