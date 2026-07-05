package defpackage;

import com.anthropic.claude.analytics.events.McpEvents$McpToolToggled;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.McpToolKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u9g implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ u9g(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        iqb iqbVarH0;
        String strM1047extractServerIdCNqihKI;
        McpServer mcpServerL;
        int i = this.E;
        Object obj5 = this.F;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj4).intValue();
                ((d56) obj2).getClass();
                e18 e18Var = (e18) ((ld4) obj3);
                e18Var.a0(1015774215);
                int iOrdinal = ((ukc) obj5).ordinal();
                fqb fqbVar = fqb.E;
                if (iOrdinal == 0) {
                    iqbVarH0 = fd9.h0(fqbVar, new q72(5, fFloatValue));
                } else {
                    if (iOrdinal != 1) {
                        mr9.b();
                        return obj;
                    }
                    iqbVarH0 = fd9.h0(fqbVar, new q72(6, fFloatValue));
                }
                obj = iqbVarH0;
                e18Var.p(false);
                return obj;
            default:
                ChatId chatId = (ChatId) obj;
                String strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                String strM1035unboximpl = ((McpServerId) obj2).m1035unboximpl();
                List list = (List) obj3;
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                q0i q0iVar = (q0i) obj5;
                strM1035unboximpl.getClass();
                list.getClass();
                McpToolKey mcpToolKey = (McpToolKey) w44.N0(list);
                String strM1050unboximpl = mcpToolKey != null ? mcpToolKey.m1050unboximpl() : null;
                String url = (strM1050unboximpl == null || (strM1047extractServerIdCNqihKI = McpToolKey.m1047extractServerIdCNqihKI(strM1050unboximpl)) == null || (mcpServerL = q0iVar.p.l(strM1047extractServerIdCNqihKI)) == null) ? null : mcpServerL.getUrl();
                qi3 qi3Var = q0iVar.c;
                String str = q0iVar.q;
                if (strM984unboximpl == null) {
                    strM984unboximpl = "";
                }
                String str2 = strM984unboximpl;
                List list2 = list;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((McpToolKey) it.next()).m1050unboximpl());
                }
                qi3Var.e(new McpEvents$McpToolToggled(str, str2, (List) arrayList, zBooleanValue, (String) null, (String) (url != null ? npk.b(url) : null), 16, (mq5) null), iv1.J(jce.b(McpEvents$McpToolToggled.class)));
                return iei.a;
        }
    }
}
