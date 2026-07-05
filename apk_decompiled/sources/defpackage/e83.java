package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked;
import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes.dex */
public final class e83 implements pz7 {
    public final /* synthetic */ rwe E;
    public final /* synthetic */ ChatScreenParams F;
    public final /* synthetic */ t53 G;
    public final /* synthetic */ qi3 H;

    public e83(rwe rweVar, ChatScreenParams chatScreenParams, t53 t53Var, qi3 qi3Var) {
        this.E = rweVar;
        this.F = chatScreenParams;
        this.G = t53Var;
        this.H = qi3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource = (ChatMessageActionEvents$ActionSource) obj;
        String strM1057unboximpl = ((MessageId) obj2).m1057unboximpl();
        chatMessageActionEvents$ActionSource.getClass();
        strM1057unboximpl.getClass();
        String strM591getChatIdRjYBDck = this.F.m591getChatIdRjYBDck();
        t53 t53Var = this.G;
        this.E.E.m(new fv(20, new ChatScreenModalBottomSheetDestination[]{new ChatScreenModalBottomSheetDestination.Share(strM591getChatIdRjYBDck, t53Var.X0.size(), null)}), new p23(21));
        this.H.e(new ChatMessageActionEvents$ChatMessageActionClicked(t53Var.d.e, t53Var.L0, strM1057unboximpl, chatMessageActionEvents$ActionSource, ChatMessageActionEvents$ChatMessageAction.SHARE, (String) null, 32, (mq5) null), ChatMessageActionEvents$ChatMessageActionClicked.Companion.serializer());
        return iei.a;
    }
}
