package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.chat.UpdatableChatConversationSettings;
import com.anthropic.claude.types.strings.McpToolKey;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t8 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Map F;

    public /* synthetic */ t8(int i, Map map) {
        this.E = i;
        this.F = map;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        Map mapL0 = this.F;
        switch (i) {
            case 0:
                AccountSettings accountSettings = (AccountSettings) obj;
                accountSettings.getClass();
                Map<McpToolKey, Boolean> enabled_mcp_tools = accountSettings.getEnabled_mcp_tools();
                if (enabled_mcp_tools != null) {
                    mapL0 = sta.l0(enabled_mcp_tools, mapL0);
                }
                return AccountSettings.m107copyNcesMF4$default(accountSettings, null, null, null, null, null, null, mapL0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435391, null);
            case 1:
                AccountSettings accountSettings2 = (AccountSettings) obj;
                accountSettings2.getClass();
                return AccountSettings.m107copyNcesMF4$default(accountSettings2, null, null, null, null, null, null, this.F, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435391, null);
            case 2:
                UpdatableChatConversationSettings updatableChatConversationSettings = (UpdatableChatConversationSettings) obj;
                updatableChatConversationSettings.getClass();
                return UpdatableChatConversationSettings.m272copyCme3KxY$default(updatableChatConversationSettings, this.F, null, null, null, null, null, null, null, 254, null);
            case 3:
                UpdatableChatConversationSettings updatableChatConversationSettings2 = (UpdatableChatConversationSettings) obj;
                updatableChatConversationSettings2.getClass();
                Map<McpToolKey, Boolean> enabled_mcp_tools2 = updatableChatConversationSettings2.getEnabled_mcp_tools();
                if (enabled_mcp_tools2 != null) {
                    mapL0 = sta.l0(enabled_mcp_tools2, mapL0);
                }
                return UpdatableChatConversationSettings.m272copyCme3KxY$default(updatableChatConversationSettings2, mapL0, null, null, null, null, null, null, null, 254, null);
            case 4:
                rh9 rh9Var = (rh9) obj;
                rh9Var.getClass();
                for (Map.Entry entry : mapL0.entrySet()) {
                    String str = (String) entry.getKey();
                    h15 h15Var = (h15) entry.getValue();
                    str.getClass();
                    rh9 rh9Var2 = new rh9();
                    if (!(h15Var instanceof h15)) {
                        wg6.i();
                        return null;
                    }
                    mpk.U(rh9Var2, "type", h15Var.a);
                    List list = h15Var.b;
                    if (list != null) {
                        hj2 hj2Var = new hj2(list, 6);
                        jg9 jg9Var = new jg9();
                        hj2Var.invoke(jg9Var);
                        rh9Var2.b("enum", jg9Var.b());
                    }
                    rh9Var.b(str, rh9Var2.a());
                }
                return iei.a;
            default:
                yb0 yb0Var = (yb0) obj;
                yb0Var.getClass();
                String str2 = lte.b;
                lte lteVarD = ksk.d((String) yb0Var.a, mapL0);
                if (lteVarD instanceof gte) {
                    return (gte) lteVarD;
                }
                return null;
        }
    }
}
