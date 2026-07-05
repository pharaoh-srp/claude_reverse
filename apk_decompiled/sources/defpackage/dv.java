package defpackage;

import android.content.SharedPreferences;
import androidx.glance.session.SessionWorker;
import com.anthropic.claude.analytics.events.ChatEvents$ChooseProjectSheetSeen;
import com.anthropic.claude.analytics.events.McpEvents$McpPromptsListed;
import com.anthropic.claude.analytics.events.McpEvents$McpResourcesListed;
import com.anthropic.claude.analytics.screens.AnalyticsScreens$ChatListScreen;
import com.anthropic.claude.api.mcp.McpPrompt;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.types.strings.McpServerId;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dv extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dv(iwe iweVar, qi3 qi3Var, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.G = iweVar;
        this.F = qi3Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                return new dv((qi3) obj2, (lu) obj, tp4Var, 0);
            case 1:
                return new dv((qi3) obj2, (jp1) obj, tp4Var, 1);
            case 2:
                return new dv((qi3) obj2, (qb2) obj, tp4Var, 2);
            case 3:
                return new dv((f03) obj2, (String) obj, tp4Var, 3);
            case 4:
                return new dv((iwe) obj, (qi3) obj2, tp4Var, 4);
            case 5:
                return new dv((iwe) obj, (qi3) obj2, tp4Var, 5);
            case 6:
                return new dv((qi3) obj2, (kk4) obj, tp4Var, 6);
            case 7:
                return new dv((qi3) obj2, (id8) obj, tp4Var, 7);
            case 8:
                return new dv((qi3) obj2, (lbb) obj, tp4Var, 8);
            case 9:
                return new dv((qi3) obj2, (pbb) obj, tp4Var, 9);
            default:
                return new dv((drh) obj2, (SessionWorker) obj, tp4Var, 10);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((dv) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((dv) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((dv) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((dv) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 4:
                ((dv) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 5:
                ((dv) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 6:
                ((dv) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 7:
                ((dv) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 8:
                ((dv) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            case 9:
                ((dv) create(tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((dv) create(tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        List<McpPrompt> prompts;
        int i = this.E;
        int i2 = 2;
        int i3 = 1;
        tp4 tp4Var = null;
        int i4 = 3;
        iei ieiVar = iei.a;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                ((qi3) obj3).a(sx.HOME);
                lu luVar = (lu) obj2;
                luVar.h.c(new AnalyticsScreens$ChatListScreen(luVar.c.e));
                am0 am0Var = luVar.i;
                int iH = am0Var.d.h() + 1;
                am0Var.d.i(iH);
                SharedPreferences.Editor editorEdit = am0Var.a.edit();
                editorEdit.putInt("chat_list_views", iH);
                editorEdit.apply();
                luVar.R();
                break;
            case 1:
                sf5.h0(obj);
                ((qi3) obj3).a(sx.BILLING_SETTINGS);
                jp1 jp1Var = (jp1) obj2;
                jp1Var.i.setValue(Boolean.TRUE);
                gb9.D(jp1Var.a, null, null, new cj(jp1Var, tp4Var, 7), 3);
                break;
            case 2:
                sf5.h0(obj);
                ((qi3) obj3).a(sx.CAPABILITIES);
                qb2 qb2Var = (qb2) obj2;
                gb9.D(qb2Var.a, null, null, new nb2(qb2Var, tp4Var, i2), 3);
                break;
            case 3:
                sf5.h0(obj);
                f03 f03Var = (f03) obj3;
                qi3 qi3Var = f03Var.c;
                String str = (String) obj2;
                str.getClass();
                koi koiVar = f03Var.k;
                McpServer mcpServer = (McpServer) koiVar.b().get(McpServerId.m1029boximpl(str));
                int size = (mcpServer == null || (prompts = mcpServer.getPrompts()) == null) ? 0 : prompts.size();
                if (size > 0) {
                    qi3Var.e(new McpEvents$McpPromptsListed(koiVar.e, size), McpEvents$McpPromptsListed.Companion.serializer());
                }
                McpServer mcpServer2 = (McpServer) koiVar.b().get(McpServerId.m1029boximpl(str));
                int size2 = mcpServer2 != null ? qok.i(mcpServer2).size() : 0;
                if (size2 > 0) {
                    qi3Var.e(new McpEvents$McpResourcesListed(koiVar.e, size2), McpEvents$McpResourcesListed.Companion.serializer());
                }
                break;
            case 4:
                sf5.h0(obj);
                f03 f03Var2 = (f03) obj2;
                f03Var2.c.e(new ChatEvents$ChooseProjectSheetSeen(f03Var2.k.e), ChatEvents$ChooseProjectSheetSeen.Companion.serializer());
                ((qi3) obj3).a(sx.MOVE_TO_PROJECT);
                gb9.D(f03Var2.a, null, null, new b03(f03Var2, tp4Var, i2), 3);
                break;
            case 5:
                sf5.h0(obj);
                if (!((i) obj2).M0()) {
                    ((qi3) obj3).a(sx.CODE_SESSION);
                }
                break;
            case 6:
                sf5.h0(obj);
                ((qi3) obj3).a(sx.CONNECTORS);
                kk4 kk4Var = (kk4) obj2;
                gb9.D(kk4Var.a, null, null, new jk4(kk4Var, tp4Var, i3), 3);
                break;
            case 7:
                sf5.h0(obj);
                ((qi3) obj3).a(sx.GROWTHBOOK_OVERRIDE);
                ((id8) obj2).O();
                break;
            case 8:
                sf5.h0(obj);
                ((qi3) obj3).a(sx.MEMORY_FILE_DETAIL);
                lbb lbbVar = (lbb) obj2;
                gb9.D(lbbVar.a, null, null, new kza(lbbVar, tp4Var, i4), 3);
                break;
            case 9:
                sf5.h0(obj);
                ((qi3) obj3).a(sx.MEMORY_FILES_LIST);
                pbb pbbVar = (pbb) obj2;
                gb9.D(pbbVar.a, null, null, new e41(pbbVar, tp4Var, 4), 3);
                break;
            default:
                sf5.h0(obj);
                ((drh) obj3).b(((SessionWorker) obj2).i.c);
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dv(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }
}
