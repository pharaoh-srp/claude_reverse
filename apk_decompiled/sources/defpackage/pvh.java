package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.api.chat.tool.CodeBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.JsonBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.TextDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pvh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ToolDisplayContent F;

    public /* synthetic */ pvh(ToolDisplayContent toolDisplayContent, int i) {
        this.E = i;
        this.F = toolDisplayContent;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        ToolDisplayContent toolDisplayContent = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    htk.d(toolDisplayContent, b.c(fqbVar, 1.0f), e18Var, 48);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    ytk.e(((JsonBlockDisplayContent) toolDisplayContent).getJson_block(), b.c(fqbVar, 1.0f), e18Var2, 48);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    CodeBlockDisplayContent codeBlockDisplayContent = (CodeBlockDisplayContent) toolDisplayContent;
                    rtk.c(codeBlockDisplayContent.getCode(), codeBlockDisplayContent.getLanguage(), b.c(fqbVar, 1.0f), false, e18Var3, 384);
                }
                break;
            default:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    puk.d(((TextDisplayContent) toolDisplayContent).getText(), b.c(fqbVar, 1.0f), e18Var4, 48);
                }
                break;
        }
        return ieiVar;
    }
}
