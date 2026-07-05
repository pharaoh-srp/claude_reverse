package defpackage;

import android.content.Context;
import android.content.RestrictionsManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zpa {
    public final Context a;
    public final wlg b;
    public final wz5 c;
    public final wz5 d;

    public zpa(Context context, m78 m78Var) {
        this.a = context;
        this.b = m78Var.a.m("disable_mobile_managed_login_check");
        final int i = 0;
        this.c = mpk.w(new zy7(this) { // from class: ypa
            public final /* synthetic */ zpa F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Bundle applicationRestrictions;
                Bundle applicationRestrictions2;
                int i2 = i;
                boolean z = true;
                zpa zpaVar = this.F;
                switch (i2) {
                    case 0:
                        if (!((Boolean) zpaVar.b.getValue()).booleanValue()) {
                            RestrictionsManager restrictionsManager = (RestrictionsManager) zpaVar.a.getSystemService(RestrictionsManager.class);
                            if (restrictionsManager == null || (applicationRestrictions = restrictionsManager.getApplicationRestrictions()) == null) {
                                applicationRestrictions = Bundle.EMPTY;
                                applicationRestrictions.getClass();
                            }
                            z = applicationRestrictions.getBoolean("isEmailLoginEnabled", true);
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (!((Boolean) zpaVar.b.getValue()).booleanValue()) {
                            RestrictionsManager restrictionsManager2 = (RestrictionsManager) zpaVar.a.getSystemService(RestrictionsManager.class);
                            if (restrictionsManager2 == null || (applicationRestrictions2 = restrictionsManager2.getApplicationRestrictions()) == null) {
                                applicationRestrictions2 = Bundle.EMPTY;
                                applicationRestrictions2.getClass();
                            }
                            z = applicationRestrictions2.getBoolean("isGoogleLoginEnabled", true);
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i2 = 1;
        this.d = mpk.w(new zy7(this) { // from class: ypa
            public final /* synthetic */ zpa F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Bundle applicationRestrictions;
                Bundle applicationRestrictions2;
                int i22 = i2;
                boolean z = true;
                zpa zpaVar = this.F;
                switch (i22) {
                    case 0:
                        if (!((Boolean) zpaVar.b.getValue()).booleanValue()) {
                            RestrictionsManager restrictionsManager = (RestrictionsManager) zpaVar.a.getSystemService(RestrictionsManager.class);
                            if (restrictionsManager == null || (applicationRestrictions = restrictionsManager.getApplicationRestrictions()) == null) {
                                applicationRestrictions = Bundle.EMPTY;
                                applicationRestrictions.getClass();
                            }
                            z = applicationRestrictions.getBoolean("isEmailLoginEnabled", true);
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (!((Boolean) zpaVar.b.getValue()).booleanValue()) {
                            RestrictionsManager restrictionsManager2 = (RestrictionsManager) zpaVar.a.getSystemService(RestrictionsManager.class);
                            if (restrictionsManager2 == null || (applicationRestrictions2 = restrictionsManager2.getApplicationRestrictions()) == null) {
                                applicationRestrictions2 = Bundle.EMPTY;
                                applicationRestrictions2.getClass();
                            }
                            z = applicationRestrictions2.getBoolean("isGoogleLoginEnabled", true);
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
