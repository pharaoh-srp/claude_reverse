package defpackage;

import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchOutcome;
import com.anthropic.claude.api.chat.ChatConversation;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zu implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lu F;

    public /* synthetic */ zu(lu luVar, int i) {
        this.E = i;
        this.F = luVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        lu luVar = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                by2 by2Var = (by2) obj;
                by2Var.getClass();
                luVar.getClass();
                luVar.n.setValue(by2Var);
                return ieiVar;
            case 1:
                r4a r4aVar = (r4a) obj;
                r4aVar.getClass();
                luVar.getClass();
                luVar.m.setValue(new Date());
                luVar.R();
                if (luVar.w.d().G.length() > 0 && luVar.x == null && luVar.y == ChatListEvents$ConversationSearchOutcome.ABANDONED) {
                    luVar.x = Long.valueOf(luVar.j.b());
                }
                return new ev(r4aVar, luVar, 0);
            default:
                ChatConversation chatConversation = (ChatConversation) obj;
                chatConversation.getClass();
                String strM176getUuidRjYBDck = chatConversation.m176getUuidRjYBDck();
                boolean z = !chatConversation.is_starred();
                lu luVar2 = this.F;
                luVar2.getClass();
                strM176getUuidRjYBDck.getClass();
                gb9.D(luVar2.a, null, null, new ku(luVar2, strM176getUuidRjYBDck, z, (tp4) null, 0), 3);
                return ieiVar;
        }
    }
}
