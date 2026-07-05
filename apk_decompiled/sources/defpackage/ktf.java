package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.types.strings.ChatId;
import java.text.SimpleDateFormat;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ktf implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ ktf(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                ((bz7) obj2).invoke(((jtf) obj).e);
                break;
            case 1:
                ((s2g) obj2).m.setValue((ChatSnapshotSummaryWithChatId) obj);
                break;
            case 2:
                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj;
                ((pz7) obj2).invoke(ChatId.m978boximpl(chatConversationWithProjectReference.m209getUuidRjYBDck()), chatConversationWithProjectReference.getName());
                break;
            case 3:
                ((bz7) obj2).invoke((ChatConversationWithProjectReference) obj);
                break;
            case 4:
                nwb nwbVar = (nwb) obj;
                SimpleDateFormat simpleDateFormat = p5h.a;
                Set set = (Set) nwbVar.getValue();
                long j = ((u7h) obj2).a;
                nwbVar.setValue(set.contains(Long.valueOf(j)) ? dxf.n0((Set) nwbVar.getValue(), Long.valueOf(j)) : dxf.q0((Set) nwbVar.getValue(), Long.valueOf(j)));
                break;
            default:
                ((bz7) obj2).invoke((TaskResponse) obj);
                break;
        }
        return ieiVar;
    }
}
