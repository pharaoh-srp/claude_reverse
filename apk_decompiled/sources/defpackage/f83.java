package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes.dex */
public final class f83 implements pz7 {
    public final /* synthetic */ t53 E;
    public final /* synthetic */ qi3 F;

    public f83(t53 t53Var, qi3 qi3Var) {
        this.E = t53Var;
        this.F = qi3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource = (ChatMessageActionEvents$ActionSource) obj;
        String strM1057unboximpl = ((MessageId) obj2).m1057unboximpl();
        chatMessageActionEvents$ActionSource.getClass();
        strM1057unboximpl.getClass();
        t53 t53Var = this.E;
        gb9.D(t53Var.a, null, null, new m33(t53Var, null, strM1057unboximpl), 3);
        this.F.e(new ChatMessageActionEvents$ChatMessageActionClicked(t53Var.d.e, t53Var.L0, strM1057unboximpl, chatMessageActionEvents$ActionSource, ChatMessageActionEvents$ChatMessageAction.SPEAK, (String) null, 32, (mq5) null), ChatMessageActionEvents$ChatMessageActionClicked.Companion.serializer());
        return iei.a;
    }
}
