package defpackage;

import android.os.Handler;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchOutcome;
import com.anthropic.claude.analytics.events.CodeEvents$SessionBackgrounded;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.sessions.types.SessionResource;

/* JADX INFO: loaded from: classes2.dex */
public final class ev implements n4a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ev(r4a r4aVar, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.n4a
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((lu) obj).P(ChatListEvents$ConversationSearchOutcome.ABANDONED);
                break;
            case 1:
                l51 l51Var = ((p61) obj).F;
                ((Handler) l51Var.i).removeCallbacks((k51) l51Var.j);
                break;
            case 2:
                i iVar = (i) obj;
                String strE0 = iVar.E0();
                if (strE0 != null) {
                    qi3 qi3Var = iVar.l;
                    String str = iVar.m;
                    SessionResource sessionResourceD0 = iVar.D0();
                    qi3Var.e(new CodeEvents$SessionBackgrounded(str, strE0, sessionResourceD0 != null ? sessionResourceD0.getEnvironment_id() : null, iVar.U0()), CodeEvents$SessionBackgrounded.Companion.serializer());
                    break;
                }
                break;
            default:
                ((fkg) obj).d(null);
                break;
        }
    }
}
