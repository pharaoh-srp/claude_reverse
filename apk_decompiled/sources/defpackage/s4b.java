package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s4b implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ParsedContentBlock$McpToolInvocation F;

    public /* synthetic */ s4b(ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation, int i) {
        this.E = 1;
        this.F = parsedContentBlock$McpToolInvocation;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    u4b.d(parsedContentBlock$McpToolInvocation, e18Var, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                u4b.d(parsedContentBlock$McpToolInvocation, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    ud0 ud0Var = ud0.u0;
                    String integrationName = parsedContentBlock$McpToolInvocation.getIntegrationName();
                    if (integrationName == null) {
                        integrationName = vb7.n(e18Var2, -388642675, R.string.web_fetch, e18Var2, false);
                    } else {
                        e18Var2.a0(-388643264);
                        e18Var2.p(false);
                    }
                    iv1.b(ud0Var, integrationName, null, ef2.F, 0L, e18Var2, 3072, 20);
                }
                break;
            case 3:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    ud0 ud0Var2 = ud0.e1;
                    String integrationName2 = parsedContentBlock$McpToolInvocation.getIntegrationName();
                    if (integrationName2 == null) {
                        integrationName2 = vb7.n(e18Var3, -1709239323, R.string.project_knowledge_search, e18Var3, false);
                    } else {
                        e18Var3.a0(-1709239912);
                        e18Var3.p(false);
                    }
                    iv1.b(ud0Var2, integrationName2, null, ef2.F, 0L, e18Var3, 3072, 20);
                }
                break;
            default:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    wtk.d(parsedContentBlock$McpToolInvocation.getIntegrationIconUrl(), parsedContentBlock$McpToolInvocation.getIntegrationName(), null, parsedContentBlock$McpToolInvocation.getIconName(), 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var4, 0, 52);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ s4b(ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation, int i, byte b) {
        this.E = i;
        this.F = parsedContentBlock$McpToolInvocation;
    }
}
