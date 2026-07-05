package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.api.chat.messages.MessageFlag;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes.dex */
public final class z73 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ z73(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                String strM1057unboximpl = ((MessageId) obj).m1057unboximpl();
                MessageFlag messageFlag = (MessageFlag) obj2;
                strM1057unboximpl.getClass();
                messageFlag.getClass();
                t53 t53Var = (t53) obj3;
                gb9.D(t53Var.a, null, null, new pb2(t53Var, strM1057unboximpl, messageFlag, null, 14), 3);
                break;
            default:
                String str = (String) obj;
                String strM1057unboximpl2 = ((MessageId) obj2).m1057unboximpl();
                str.getClass();
                strM1057unboximpl2.getClass();
                ((bl2) obj3).c.invoke(ChatMessageActionEvents$ActionSource.TOOL_USE, MessageId.m1051boximpl(strM1057unboximpl2), str);
                break;
        }
        return ieiVar;
    }
}
