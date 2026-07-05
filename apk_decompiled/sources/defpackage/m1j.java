package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.VillageWeaverConsentState;

/* JADX INFO: loaded from: classes2.dex */
public final class m1j {
    public final j1j a;
    public final q7 b;
    public final f9 c;
    public final loi d;
    public final wz5 e;
    public final wz5 f;
    public final wz5 g;
    public uwc h;

    public m1j(j1j j1jVar, q7 q7Var, f9 f9Var, loi loiVar) {
        j1jVar.getClass();
        q7Var.getClass();
        f9Var.getClass();
        loiVar.getClass();
        this.a = j1jVar;
        this.b = q7Var;
        this.c = f9Var;
        this.d = loiVar;
        final int i = 0;
        this.e = mpk.w(new zy7(this) { // from class: k1j
            public final /* synthetic */ m1j F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                m1j m1jVar = this.F;
                switch (i2) {
                    case 0:
                        AccountSettings settings = m1jVar.b.a().getSettings();
                        VillageWeaverConsentState village_weaver_consent_state = settings != null ? settings.getVillage_weaver_consent_state() : null;
                        int i3 = village_weaver_consent_state != null ? l1j.a[village_weaver_consent_state.ordinal()] : -1;
                        return Boolean.valueOf(i3 == 1 || i3 == 2);
                    case 1:
                        yl4 yl4Var = uwc.F;
                        AccountSettings settings2 = m1jVar.b.a().getSettings();
                        VillageWeaverConsentState village_weaver_consent_state2 = settings2 != null ? settings2.getVillage_weaver_consent_state() : null;
                        yl4Var.getClass();
                        int i4 = village_weaver_consent_state2 == null ? -1 : twc.a[village_weaver_consent_state2.ordinal()];
                        if (i4 != -1) {
                            if (i4 == 1) {
                                return uwc.G;
                            }
                            if (i4 != 2 && i4 != 3 && i4 != 4) {
                                wg6.i();
                                return null;
                            }
                        }
                        return uwc.H;
                    default:
                        return Boolean.valueOf(((Boolean) m1jVar.a.a.getValue()).booleanValue() || m1jVar.a());
                }
            }
        });
        final int i2 = 1;
        this.f = mpk.w(new zy7(this) { // from class: k1j
            public final /* synthetic */ m1j F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                m1j m1jVar = this.F;
                switch (i22) {
                    case 0:
                        AccountSettings settings = m1jVar.b.a().getSettings();
                        VillageWeaverConsentState village_weaver_consent_state = settings != null ? settings.getVillage_weaver_consent_state() : null;
                        int i3 = village_weaver_consent_state != null ? l1j.a[village_weaver_consent_state.ordinal()] : -1;
                        return Boolean.valueOf(i3 == 1 || i3 == 2);
                    case 1:
                        yl4 yl4Var = uwc.F;
                        AccountSettings settings2 = m1jVar.b.a().getSettings();
                        VillageWeaverConsentState village_weaver_consent_state2 = settings2 != null ? settings2.getVillage_weaver_consent_state() : null;
                        yl4Var.getClass();
                        int i4 = village_weaver_consent_state2 == null ? -1 : twc.a[village_weaver_consent_state2.ordinal()];
                        if (i4 != -1) {
                            if (i4 == 1) {
                                return uwc.G;
                            }
                            if (i4 != 2 && i4 != 3 && i4 != 4) {
                                wg6.i();
                                return null;
                            }
                        }
                        return uwc.H;
                    default:
                        return Boolean.valueOf(((Boolean) m1jVar.a.a.getValue()).booleanValue() || m1jVar.a());
                }
            }
        });
        final int i3 = 2;
        this.g = mpk.w(new zy7(this) { // from class: k1j
            public final /* synthetic */ m1j F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i3;
                m1j m1jVar = this.F;
                switch (i22) {
                    case 0:
                        AccountSettings settings = m1jVar.b.a().getSettings();
                        VillageWeaverConsentState village_weaver_consent_state = settings != null ? settings.getVillage_weaver_consent_state() : null;
                        int i32 = village_weaver_consent_state != null ? l1j.a[village_weaver_consent_state.ordinal()] : -1;
                        return Boolean.valueOf(i32 == 1 || i32 == 2);
                    case 1:
                        yl4 yl4Var = uwc.F;
                        AccountSettings settings2 = m1jVar.b.a().getSettings();
                        VillageWeaverConsentState village_weaver_consent_state2 = settings2 != null ? settings2.getVillage_weaver_consent_state() : null;
                        yl4Var.getClass();
                        int i4 = village_weaver_consent_state2 == null ? -1 : twc.a[village_weaver_consent_state2.ordinal()];
                        if (i4 != -1) {
                            if (i4 == 1) {
                                return uwc.G;
                            }
                            if (i4 != 2 && i4 != 3 && i4 != 4) {
                                wg6.i();
                                return null;
                            }
                        }
                        return uwc.H;
                    default:
                        return Boolean.valueOf(((Boolean) m1jVar.a.a.getValue()).booleanValue() || m1jVar.a());
                }
            }
        });
        this.h = uwc.H;
    }

    public final boolean a() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }
}
