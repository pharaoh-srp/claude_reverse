package defpackage;

import com.anthropic.claude.api.chat.ChatConversationSettings;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.McpToolKey;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a0i extends xzg implements rz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ String G;
    public /* synthetic */ Map H;
    public final /* synthetic */ q0i I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0i(q0i q0iVar, tp4 tp4Var, int i) {
        super(3, tp4Var);
        this.E = i;
        this.I = q0iVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        q0i q0iVar = this.I;
        String strM984unboximpl = ((ChatId) obj).m984unboximpl();
        Map map = (Map) obj2;
        tp4 tp4Var = (tp4) obj3;
        switch (i) {
            case 0:
                a0i a0iVar = new a0i(q0iVar, tp4Var, 0);
                a0iVar.G = strM984unboximpl;
                a0iVar.H = map;
                return a0iVar.invokeSuspend(ieiVar);
            default:
                a0i a0iVar2 = new a0i(q0iVar, tp4Var, 1);
                a0iVar2.G = strM984unboximpl;
                a0iVar2.H = map;
                return a0iVar2.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        ChatConversationSettings settings;
        int i = this.E;
        iei ieiVar = iei.a;
        q0i q0iVar = this.I;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                Map<McpToolKey, Boolean> enabled_mcp_tools = null;
                String str = this.G;
                Map map = this.H;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    xa3 xa3Var = q0iVar.e;
                    this.G = null;
                    this.H = null;
                    this.F = 1;
                    ChatConversationWithProjectReference chatConversationWithProjectReferenceI = xa3Var.b.i(str);
                    if (chatConversationWithProjectReferenceI != null && (settings = chatConversationWithProjectReferenceI.getSettings()) != null) {
                        enabled_mcp_tools = settings.getEnabled_mcp_tools();
                    }
                    if (xa3Var.b(str, new u8(enabled_mcp_tools, map, 1), new t8(2, enabled_mcp_tools), new te(17), this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                String str2 = this.G;
                Map map2 = this.H;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    xa3 xa3Var2 = q0iVar.e;
                    this.G = null;
                    this.H = null;
                    this.F = 1;
                    if (xa3Var2.a(str2, new t8(3, map2), new te(21), this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
