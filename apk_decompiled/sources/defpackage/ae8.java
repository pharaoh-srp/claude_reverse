package defpackage;

import android.content.Context;
import android.content.Intent;
import com.anthropic.claude.analytics.events.ReferralEvents$GuestPassReferralShareTapped;
import com.anthropic.claude.api.account.FeatureAccessStatus;
import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.api.feature.PermissionModePolicy;
import com.anthropic.claude.api.referral.ReferralEligibility;
import com.anthropic.claude.code.remote.c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ae8 implements zy7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ koi F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ ae8(wlg wlgVar, wlg wlgVar2, wlg wlgVar3, fk0 fk0Var, koi koiVar, c cVar, u3c u3cVar, wlg wlgVar4) {
        this.G = wlgVar;
        this.H = wlgVar2;
        this.I = wlgVar3;
        this.J = fk0Var;
        this.F = koiVar;
        this.K = cVar;
        this.L = u3cVar;
        this.M = wlgVar4;
    }

    @Override // defpackage.zy7
    public final Object a() {
        String share_link;
        Boolean boolValueOf;
        PermissionModePolicy.ModePolicy autoPermissions;
        int i = this.E;
        Object obj = this.M;
        Object obj2 = this.L;
        Object obj3 = this.K;
        koi koiVar = this.F;
        Object obj4 = this.J;
        Object obj5 = this.I;
        Object obj6 = this.H;
        Object obj7 = this.G;
        switch (i) {
            case 0:
                ReferralEligibility referralEligibility = (ReferralEligibility) obj7;
                qi3 qi3Var = (qi3) obj6;
                ce8 ce8Var = (ce8) obj5;
                Context context = (Context) obj4;
                String str = (String) obj3;
                l45 l45Var = (l45) obj2;
                kae kaeVar = (kae) obj;
                if (referralEligibility != null && (share_link = referralEligibility.getShare_link()) != null) {
                    qi3Var.e(new ReferralEvents$GuestPassReferralShareTapped(ce8Var.E), ReferralEvents$GuestPassReferralShareTapped.Companion.serializer());
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", share_link);
                    intent.putExtra("android.intent.extra.SUBJECT", str);
                    context.startActivity(Intent.createChooser(intent, str));
                    gb9.D(l45Var, null, null, new ix5(kaeVar, koiVar, null, 15), 3);
                }
                return iei.a;
            default:
                wlg wlgVar = (wlg) obj5;
                fk0 fk0Var = (fk0) obj4;
                c cVar = (c) obj3;
                u3c u3cVar = (u3c) obj2;
                wlg wlgVar2 = (wlg) obj;
                o71 o71Var = s71.a;
                boolean zBooleanValue = ((Boolean) ((wlg) obj7).getValue()).booleanValue();
                PermissionModePolicy permissionModePolicy = (PermissionModePolicy) ((wlg) obj6).getValue();
                if (permissionModePolicy == null || (autoPermissions = permissionModePolicy.getAutoPermissions()) == null) {
                    FeatureAccessStatus featureAccessStatus = (FeatureAccessStatus) wlgVar.getValue();
                    if (featureAccessStatus != null) {
                        boolValueOf = Boolean.valueOf(featureAccessStatus == FeatureAccessStatus.AVAILABLE);
                    } else {
                        boolValueOf = null;
                    }
                } else {
                    boolValueOf = Boolean.valueOf(autoPermissions.getAllowed());
                }
                boolean zM = fk0Var.m();
                RavenType raven_type = koiVar.e().getRaven_type();
                boolean z = raven_type == RavenType.TEAM || raven_type == RavenType.ENTERPRISE;
                boolean zBooleanValue2 = ((Boolean) cVar.i.h.getValue()).booleanValue();
                String strS = u3cVar.p.s();
                String str2 = strS == null ? null : strS;
                boolean zBooleanValue3 = ((Boolean) wlgVar2.getValue()).booleanValue();
                o71Var.getClass();
                return o71.a(zBooleanValue, boolValueOf, zM, z, zBooleanValue2, str2, zBooleanValue3);
        }
    }

    public /* synthetic */ ae8(ReferralEligibility referralEligibility, qi3 qi3Var, ce8 ce8Var, Context context, String str, l45 l45Var, kae kaeVar, koi koiVar) {
        this.G = referralEligibility;
        this.H = qi3Var;
        this.I = ce8Var;
        this.J = context;
        this.K = str;
        this.L = l45Var;
        this.M = kaeVar;
        this.F = koiVar;
    }
}
