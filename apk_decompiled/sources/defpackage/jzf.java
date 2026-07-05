package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.models.organization.configtypes.OctopusConfig;
import com.anthropic.claude.types.strings._ServerLocalizedString;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jzf implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ izf F;
    public final /* synthetic */ rwe G;

    public /* synthetic */ jzf(rwe rweVar, izf izfVar) {
        this.E = 0;
        this.G = rweVar;
        this.F = izfVar;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        String str;
        _ServerLocalizedString setting_title;
        String str2;
        String str3;
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        rwe rweVar = this.G;
        izf izfVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((s64) obj).getClass();
                ((mnc) obj2).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 129) != 128)) {
                    e18Var.T();
                } else {
                    bpc bpcVarA = a.a(ud0.F1, e18Var);
                    String strJ0 = d4c.j0(R.string.title_profile, e18Var);
                    boolean zH = e18Var.h(rweVar);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new eyf(rweVar, 28);
                        e18Var.k0(objN);
                    }
                    yhk.c(bpcVarA, strJ0, (zy7) objN, b.c(fqbVar, 1.0f), null, null, null, null, 0L, e18Var, 3080, 496);
                    bpc bpcVarA2 = a.a(ud0.b0, e18Var);
                    String strJ02 = d4c.j0(R.string.title_billing, e18Var);
                    boolean zH2 = e18Var.h(rweVar) | e18Var.f(izfVar);
                    Object objN2 = e18Var.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new ytf(rweVar, 2, izfVar);
                        e18Var.k0(objN2);
                    }
                    yhk.c(bpcVarA2, strJ02, (zy7) objN2, b.c(fqbVar, 1.0f), null, null, null, null, 0L, e18Var, 3080, 496);
                    if (!((Boolean) izfVar.u.getValue()).booleanValue()) {
                        e18Var.a0(-1595331264);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-1595705093);
                        bpc bpcVarA3 = a.a(ud0.G, e18Var);
                        String strJ03 = d4c.j0(R.string.usage_title, e18Var);
                        boolean zH3 = e18Var.h(rweVar);
                        Object objN3 = e18Var.N();
                        if (zH3 || objN3 == lz1Var) {
                            objN3 = new eyf(rweVar, 29);
                            e18Var.k0(objN3);
                        }
                        yhk.c(bpcVarA3, strJ03, (zy7) objN3, b.c(fqbVar, 1.0f), null, null, null, null, 0L, e18Var, 3080, 496);
                        e18Var.p(false);
                    }
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((s64) obj).getClass();
                ((mnc) obj2).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    e18Var2.T();
                } else {
                    wz5 wz5Var = izfVar.y;
                    wlg wlgVar = izfVar.A;
                    dnh dnhVar = izfVar.m;
                    String strF0 = null;
                    if (((Boolean) wz5Var.getValue()).booleanValue()) {
                        e18Var2.a0(-891589163);
                        bpc bpcVarA4 = a.a(ud0.p0, e18Var2);
                        String strJ04 = d4c.j0(R.string.capabilities_setting_title, e18Var2);
                        if (izfVar.Q() == 0) {
                            e18Var2.a0(-891360383);
                            e18Var2.p(false);
                            str3 = null;
                        } else {
                            e18Var2.a0(-891277799);
                            String strF02 = d4c.f0(R.plurals.capabilities_enabled_count, izfVar.Q(), new Object[]{Integer.valueOf(izfVar.Q())}, e18Var2);
                            e18Var2.p(false);
                            str3 = strF02;
                        }
                        iqb iqbVarC = b.c(fqbVar, 1.0f);
                        boolean zH4 = e18Var2.h(rweVar);
                        Object objN4 = e18Var2.N();
                        if (zH4 || objN4 == lz1Var) {
                            objN4 = new eyf(rweVar, 24);
                            e18Var2.k0(objN4);
                        }
                        yhk.c(bpcVarA4, strJ04, (zy7) objN4, iqbVarC, null, str3, null, null, 0L, e18Var2, 3080, 464);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-890721659);
                        e18Var2.p(false);
                    }
                    if (((Boolean) izfVar.z.getValue()).booleanValue()) {
                        e18Var2.a0(-890616910);
                        bpc bpcVarA5 = a.a(ud0.X, e18Var2);
                        String strJ05 = d4c.j0(R.string.connectors_setting_title, e18Var2);
                        if (izfVar.O() == 0) {
                            e18Var2.a0(-890387231);
                            e18Var2.p(false);
                            str2 = null;
                        } else {
                            e18Var2.a0(-890304523);
                            String strF03 = d4c.f0(R.plurals.connectors_connected_count, izfVar.O(), new Object[]{Integer.valueOf(izfVar.O())}, e18Var2);
                            e18Var2.p(false);
                            str2 = strF03;
                        }
                        iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                        boolean zH5 = e18Var2.h(rweVar);
                        Object objN5 = e18Var2.N();
                        if (zH5 || objN5 == lz1Var) {
                            objN5 = new eyf(rweVar, 25);
                            e18Var2.k0(objN5);
                        }
                        yhk.c(bpcVarA5, strJ05, (zy7) objN5, iqbVarC2, null, str2, null, null, 0L, e18Var2, 3080, 464);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-889746523);
                        e18Var2.p(false);
                    }
                    if (!((Boolean) dnhVar.j.getValue()).booleanValue() || wlgVar.getValue() == null) {
                        e18Var2.a0(-888727739);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-889637527);
                        bpc bpcVarA6 = a.a(ud0.w0, e18Var2);
                        OctopusConfig octopusConfig = (OctopusConfig) wlgVar.getValue();
                        String localizedText = (octopusConfig == null || (setting_title = octopusConfig.getSetting_title()) == null) ? null : setting_title.getLocalizedText();
                        if (localizedText == null) {
                            localizedText = "";
                        }
                        String str4 = localizedText;
                        if (((Number) dnhVar.o.getValue()).intValue() == 0) {
                            e18Var2.a0(-889369439);
                            e18Var2.p(false);
                            str = null;
                        } else {
                            e18Var2.a0(-889286793);
                            String strF04 = d4c.f0(R.plurals.connected_apps_enabled_count, ((Number) dnhVar.o.getValue()).intValue(), new Object[]{Integer.valueOf(((Number) dnhVar.o.getValue()).intValue())}, e18Var2);
                            e18Var2.p(false);
                            str = strF04;
                        }
                        iqb iqbVarC3 = b.c(fqbVar, 1.0f);
                        boolean zH6 = e18Var2.h(rweVar);
                        Object objN6 = e18Var2.N();
                        if (zH6 || objN6 == lz1Var) {
                            objN6 = new eyf(rweVar, 26);
                            e18Var2.k0(objN6);
                        }
                        yhk.c(bpcVarA6, str4, (zy7) objN6, iqbVarC3, stk.c, str, null, null, 0L, e18Var2, 27656, 448);
                        e18Var2.p(false);
                    }
                    if (!izfVar.d.j()) {
                        e18Var2.a0(-887762523);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-888622339);
                        bpc bpcVarA7 = a.a(ud0.f, e18Var2);
                        String strJ06 = d4c.j0(R.string.permissions_setting_title, e18Var2);
                        if (izfVar.P() == 0) {
                            e18Var2.a0(-888395295);
                        } else {
                            e18Var2.a0(-888312866);
                            strF0 = d4c.f0(R.plurals.permissions_enabled_count, izfVar.P(), new Object[]{Integer.valueOf(izfVar.P())}, e18Var2);
                        }
                        e18Var2.p(false);
                        String str5 = strF0;
                        iqb iqbVarC4 = b.c(fqbVar, 1.0f);
                        boolean zH7 = e18Var2.h(rweVar);
                        Object objN7 = e18Var2.N();
                        if (zH7 || objN7 == lz1Var) {
                            objN7 = new eyf(rweVar, 27);
                            e18Var2.k0(objN7);
                        }
                        yhk.c(bpcVarA7, strJ06, (zy7) objN7, iqbVarC4, null, str5, null, null, 0L, e18Var2, 3080, 464);
                        e18Var2.p(false);
                    }
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                ((s64) obj).getClass();
                ((mnc) obj2).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 129) != 128)) {
                    e18Var3.T();
                } else {
                    bpc bpcVarA8 = a.a(ud0.y0, e18Var3);
                    String strJ07 = d4c.j0(R.string.haptic_feedback_setting_title, e18Var3);
                    boolean zN = izfVar.c.n();
                    boolean zF = e18Var3.f(izfVar);
                    Object objN8 = e18Var3.N();
                    if (zF || objN8 == lz1Var) {
                        objN8 = new lzf(izfVar, 0);
                        e18Var3.k0(objN8);
                    }
                    yhk.d(bpcVarA8, strJ07, zN, (bz7) objN8, b.c(fqbVar, 1.0f), null, false, e18Var3, 24584, 224);
                    if (((Boolean) izfVar.s.getValue()).booleanValue()) {
                        e18Var3.a0(-592111935);
                        bpc bpcVarA9 = a.a(ud0.S0, e18Var3);
                        String strJ08 = d4c.j0(R.string.notifications_section_title, e18Var3);
                        boolean zH8 = e18Var3.h(rweVar);
                        Object objN9 = e18Var3.N();
                        if (zH8 || objN9 == lz1Var) {
                            objN9 = new kzf(rweVar, 1);
                            e18Var3.k0(objN9);
                        }
                        yhk.c(bpcVarA9, strJ08, (zy7) objN9, b.c(fqbVar, 1.0f), null, null, null, null, 0L, e18Var3, 3080, 496);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-591705432);
                        e18Var3.p(false);
                    }
                    if (((Boolean) izfVar.t.getValue()).booleanValue()) {
                        e18Var3.a0(-591637604);
                        bpc bpcVarA10 = a.a(ud0.I0, e18Var3);
                        String strJ09 = d4c.j0(R.string.privacy_title, e18Var3);
                        boolean zH9 = e18Var3.h(rweVar);
                        Object objN10 = e18Var3.N();
                        if (zH9 || objN10 == lz1Var) {
                            objN10 = new kzf(rweVar, 2);
                            e18Var3.k0(objN10);
                        }
                        yhk.c(bpcVarA10, strJ09, (zy7) objN10, b.c(fqbVar, 1.0f), null, null, null, null, 0L, e18Var3, 3080, 496);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-591134040);
                        e18Var3.p(false);
                    }
                    bpc bpcVarA11 = a.a(ud0.F0, e18Var3);
                    String strJ010 = d4c.j0(R.string.shared_links, e18Var3);
                    boolean zH10 = e18Var3.h(rweVar);
                    Object objN11 = e18Var3.N();
                    if (zH10 || objN11 == lz1Var) {
                        objN11 = new kzf(rweVar, 3);
                        e18Var3.k0(objN11);
                    }
                    yhk.c(bpcVarA11, strJ010, (zy7) objN11, b.c(fqbVar, 1.0f), null, null, null, null, 0L, e18Var3, 3080, 496);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jzf(izf izfVar, rwe rweVar, int i) {
        this.E = i;
        this.F = izfVar;
        this.G = rweVar;
    }
}
