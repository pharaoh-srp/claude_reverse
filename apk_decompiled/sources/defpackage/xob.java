package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.model.ThinkingOption;
import com.anthropic.claude.types.strings._ServerLocalizedString;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xob implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ThinkingOption F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ bz7 J;
    public final /* synthetic */ qnc K;
    public final /* synthetic */ pl3 L;

    public /* synthetic */ xob(ThinkingOption thinkingOption, boolean z, boolean z2, boolean z3, bz7 bz7Var, qnc qncVar, pl3 pl3Var, int i) {
        this.E = i;
        this.F = thinkingOption;
        this.G = z;
        this.H = z2;
        this.I = z3;
        this.J = bz7Var;
        this.K = qncVar;
        this.L = pl3Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        _ServerLocalizedString description;
        String localizedText;
        _ServerLocalizedString name;
        _ServerLocalizedString description2;
        String localizedText2;
        _ServerLocalizedString name2;
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        zb0 zb0Var = null;
        boolean z = this.H;
        boolean z2 = this.G;
        ThinkingOption thinkingOption = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iH & 1, (iH & 129) != 128)) {
                    e18Var.T();
                } else {
                    String localizedText3 = (thinkingOption == null || (name = thinkingOption.getName()) == null) ? null : name.getLocalizedText();
                    if (localizedText3 == null) {
                        localizedText3 = vb7.n(e18Var, 642205016, R.string.model_selector_extended_thinking, e18Var, false);
                    } else {
                        e18Var.a0(642203063);
                        e18Var.p(false);
                    }
                    if (z2) {
                        e18Var.a0(-1566365972);
                        zb0Var = new zb0(d4c.j0(R.string.model_selector_thinking_not_supported, e18Var));
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-1566122808);
                        e18Var.p(false);
                        if (thinkingOption != null && (description = thinkingOption.getDescription()) != null && (localizedText = description.getLocalizedText()) != null) {
                            if (localizedText.length() <= 0) {
                                localizedText = null;
                            }
                            if (localizedText != null) {
                                zb0Var = new zb0(localizedText);
                            }
                        }
                    }
                    rkj.c(null, localizedText3, this.I, this.J, b.c(fqbVar, 1.0f), null, zb0Var, thinkingOption != null && z, null, null, this.K, MTTypesetterKt.kLineSkipLimitMultiplier, lja.Q, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, ysk.d(0L, gm3.a(e18Var).k, e18Var, 253), this.L, e18Var, 24582, 384, 0, 1043232);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj3;
                int iH2 = ebh.h((Integer) obj4, (s64) obj, (mnc) obj2);
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iH2 & 1, (iH2 & 129) != 128)) {
                    e18Var2.T();
                } else {
                    String localizedText4 = (thinkingOption == null || (name2 = thinkingOption.getName()) == null) ? null : name2.getLocalizedText();
                    if (localizedText4 == null) {
                        localizedText4 = vb7.n(e18Var2, -153392197, R.string.chat_options_extended_thinking, e18Var2, false);
                    } else {
                        e18Var2.a0(-153394150);
                        e18Var2.p(false);
                    }
                    if (z2) {
                        e18Var2.a0(-460078031);
                        zb0Var = new zb0(d4c.j0(R.string.chat_thinking_not_supported, e18Var2));
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-459844477);
                        e18Var2.p(false);
                        if (thinkingOption != null && (description2 = thinkingOption.getDescription()) != null && (localizedText2 = description2.getLocalizedText()) != null) {
                            if (localizedText2.length() <= 0) {
                                localizedText2 = null;
                            }
                            if (localizedText2 != null) {
                                zb0Var = new zb0(localizedText2);
                            }
                        }
                    }
                    rkj.c(null, localizedText4, this.I, this.J, b.c(fqbVar, 1.0f), null, zb0Var, thinkingOption != null && z, null, null, this.K, MTTypesetterKt.kLineSkipLimitMultiplier, lja.Q, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, 0, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, ysk.d(0L, gm3.a(e18Var2).k, e18Var2, 253), this.L, e18Var2, 24582, 384, 0, 1043232);
                }
                break;
        }
        return ieiVar;
    }
}
