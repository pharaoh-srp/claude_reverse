package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes.dex */
public final class xzh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ q0i F;

    public /* synthetic */ xzh(q0i q0iVar, int i) {
        this.E = i;
        this.F = q0iVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String strM984unboximpl;
        int i = this.E;
        q0i q0iVar = this.F;
        switch (i) {
            case 0:
                ChatId chatId = (ChatId) obj;
                strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                znb znbVar = (znb) obj2;
                znbVar.getClass();
                return Integer.valueOf(q0iVar.A.c(strM984unboximpl, znbVar) ? 0 : R.string.ai_artifacts_required_disabled_reason);
            case 1:
                ChatId chatId2 = (ChatId) obj;
                strM984unboximpl = chatId2 != null ? chatId2.m984unboximpl() : null;
                znb znbVar2 = (znb) obj2;
                znbVar2.getClass();
                return Integer.valueOf((((Boolean) q0iVar.n.f.getValue()).booleanValue() || q0iVar.F.c(strM984unboximpl, znbVar2)) ? R.string.artifacts_wiggle_enabled_disabled_reason : 0);
            case 2:
                ChatId chatId3 = (ChatId) obj;
                strM984unboximpl = chatId3 != null ? chatId3.m984unboximpl() : null;
                znb znbVar3 = (znb) obj2;
                znbVar3.getClass();
                return Integer.valueOf(q0iVar.A.c(strM984unboximpl, znbVar3) ? 0 : R.string.artifacts_required_disabled_reason);
            default:
                ChatId chatId4 = (ChatId) obj;
                strM984unboximpl = chatId4 != null ? chatId4.m984unboximpl() : null;
                znb znbVar4 = (znb) obj2;
                znbVar4.getClass();
                return Integer.valueOf(q0iVar.z.c(strM984unboximpl, znbVar4) ? 0 : R.string.advanced_research_search_required_disabled_reason);
        }
    }
}
