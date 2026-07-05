package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yob implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ qnc G;

    public /* synthetic */ yob(zy7 zy7Var, qnc qncVar, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = qncVar;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iH & 1, (iH & 129) != 128)) {
                    e18Var.T();
                } else {
                    kpb.d(d4c.j0(R.string.model_selector_more_models_title, e18Var), null, this.F, this.G, b.c(fqbVar, 1.0f), e18Var, 197040);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj3;
                int iH2 = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iH2 & 1, (iH2 & 129) != 128)) {
                    e18Var2.T();
                } else {
                    com.anthropic.claude.chat.bottomsheet.model.b.d(d4c.j0(R.string.chat_options_more_models, e18Var2), null, this.F, this.G, b.c(fqbVar, 1.0f), null, e18Var2, 197040);
                }
                break;
        }
        return ieiVar;
    }
}
