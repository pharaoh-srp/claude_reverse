package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes.dex */
public final class b83 implements pz7 {
    public final /* synthetic */ rwe E;
    public final /* synthetic */ qi3 F;
    public final /* synthetic */ t53 G;

    public b83(rwe rweVar, qi3 qi3Var, t53 t53Var) {
        this.E = rweVar;
        this.F = qi3Var;
        this.G = t53Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource = (ChatMessageActionEvents$ActionSource) obj;
        String strM1057unboximpl = ((MessageId) obj2).m1057unboximpl();
        chatMessageActionEvents$ActionSource.getClass();
        strM1057unboximpl.getClass();
        this.E.E.m(new fv(17, new ChatScreenModalBottomSheetDestination[]{new ChatScreenModalBottomSheetDestination.SelectText(strM1057unboximpl, null)}), new p23(18));
        t53 t53Var = this.G;
        this.F.e(new ChatMessageActionEvents$ChatMessageActionClicked(t53Var.d.e, t53Var.L0, strM1057unboximpl, chatMessageActionEvents$ActionSource, ChatMessageActionEvents$ChatMessageAction.SELECT, (String) null, 32, (mq5) null), ChatMessageActionEvents$ChatMessageActionClicked.Companion.serializer());
        return iei.a;
    }
}
