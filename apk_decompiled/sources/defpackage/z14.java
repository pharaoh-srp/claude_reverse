package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionOutcomeType;
import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final class z14 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ z9e F;
    public final /* synthetic */ i G;

    public /* synthetic */ z14(z9e z9eVar, i iVar, int i) {
        this.E = i;
        this.F = z9eVar;
        this.G = iVar;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        i iVar = this.G;
        z9e z9eVar = this.F;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (z9eVar.E && !zBooleanValue) {
                    c4c c4cVar = iVar.B0;
                    if (c4cVar.b() != null) {
                        c4cVar.a(CodeEvents$CodePromptSuggestionOutcomeType.IGNORED);
                    }
                }
                z9eVar.E = zBooleanValue;
                break;
            default:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                if (!z9eVar.E && zBooleanValue2) {
                    iVar.B0.c();
                }
                z9eVar.E = zBooleanValue2;
                break;
        }
        return ieiVar;
    }
}
