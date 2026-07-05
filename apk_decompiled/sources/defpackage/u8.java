package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.chat.UpdatableChatConversationSettings;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Map F;
    public final /* synthetic */ Map G;

    public /* synthetic */ u8(Map map, Map map2, int i) {
        this.E = i;
        this.F = map;
        this.G = map2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        Map mapL0 = this.G;
        Map map = this.F;
        switch (i) {
            case 0:
                AccountSettings accountSettings = (AccountSettings) obj;
                accountSettings.getClass();
                if (map != null) {
                    mapL0 = sta.l0(map, mapL0);
                }
                return AccountSettings.m107copyNcesMF4$default(accountSettings, null, null, null, null, null, null, mapL0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435391, null);
            default:
                UpdatableChatConversationSettings updatableChatConversationSettings = (UpdatableChatConversationSettings) obj;
                updatableChatConversationSettings.getClass();
                if (map != null) {
                    mapL0 = sta.l0(map, mapL0);
                }
                return UpdatableChatConversationSettings.m272copyCme3KxY$default(updatableChatConversationSettings, mapL0, null, null, null, null, null, null, null, 254, null);
        }
    }
}
