package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionOutcome;
import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionOutcomeType;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class c4c {
    public final qi3 a;
    public final String b;
    public final l14 c;
    public final boolean d;
    public final y14 e;
    public final lsc f;
    public Long g;
    public y3c h;
    public int i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;

    public c4c(qi3 qi3Var, String str, l14 l14Var, boolean z, y14 y14Var) {
        str.getClass();
        this.a = qi3Var;
        this.b = str;
        this.c = l14Var;
        this.d = z;
        this.e = y14Var;
        this.f = mpk.P(null);
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(CodeEvents$CodePromptSuggestionOutcomeType codeEvents$CodePromptSuggestionOutcomeType) {
        this.f.setValue(null);
        Long l = this.g;
        if (l != null) {
            long jLongValue = l.longValue();
            this.g = null;
            String str = (String) this.c.a();
            if (str == null) {
                str = "";
            }
            this.a.e(new CodeEvents$CodePromptSuggestionOutcome(this.b, str, codeEvents$CodePromptSuggestionOutcomeType, ((Number) this.e.a()).longValue() - jLongValue), CodeEvents$CodePromptSuggestionOutcome.Companion.serializer());
        }
    }

    public final x3c b() {
        return (x3c) this.f.getValue();
    }

    public final void c() {
        if (b() == null) {
            return;
        }
        a(CodeEvents$CodePromptSuggestionOutcomeType.DISMISSED);
    }
}
