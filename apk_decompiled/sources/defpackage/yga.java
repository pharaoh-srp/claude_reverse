package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpToolToggled;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.McpToolKey;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final class yga implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ yga(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        McpServer mcpServerL;
        switch (this.E) {
            case 0:
                String strM949unboximpl = ((AccountId) obj).m949unboximpl();
                String strM1071unboximpl = ((OrganizationId) obj2).m1071unboximpl();
                jj jjVar = (jj) obj3;
                strM949unboximpl.getClass();
                strM1071unboximpl.getClass();
                jjVar.getClass();
                synchronized (kja.j) {
                    kja.i = null;
                    kja.k++;
                }
                ((rz7) this.F).invoke(AccountId.m943boximpl(strM949unboximpl), OrganizationId.m1065boximpl(strM1071unboximpl), jjVar);
                return iei.a;
            default:
                ChatId chatId = (ChatId) obj;
                String strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                String strM1050unboximpl = ((McpToolKey) obj2).m1050unboximpl();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                q0i q0iVar = (q0i) this.F;
                strM1050unboximpl.getClass();
                String strM1047extractServerIdCNqihKI = McpToolKey.m1047extractServerIdCNqihKI(strM1050unboximpl);
                String url = (strM1047extractServerIdCNqihKI == null || (mcpServerL = q0iVar.p.l(strM1047extractServerIdCNqihKI)) == null) ? null : mcpServerL.getUrl();
                qi3 qi3Var = q0iVar.c;
                String str = q0iVar.q;
                if (strM984unboximpl == null) {
                    strM984unboximpl = "";
                }
                qi3Var.e(new McpEvents$McpToolToggled(str, strM984unboximpl, x44.W(strM1050unboximpl), zBooleanValue, (String) null, url != null ? npk.b(url) : null, 16, (mq5) null), iv1.J(jce.b(McpEvents$McpToolToggled.class)));
                return iei.a;
        }
    }
}
