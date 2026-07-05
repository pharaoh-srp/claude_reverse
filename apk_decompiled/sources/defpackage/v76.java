package defpackage;

import android.net.Uri;
import android.view.View;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.referral.ReferralEligibility;
import com.anthropic.claude.app.onboarding.OnboardingPage;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.share.j;
import com.anthropic.claude.settings.internal.a;
import com.mikepenz.aboutlibraries.Libs;
import java.util.ArrayList;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v76 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ v76(iqb iqbVar, ta4 ta4Var, pz7 pz7Var, int i) {
        this.E = 11;
        this.I = iqbVar;
        this.G = ta4Var;
        this.H = pz7Var;
        this.F = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.F;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                w76.b((x76) obj5, (String) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                mkk.e((View) obj5, (cz5) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                blk.b((Uri) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                bj7.d((ow2) obj5, (zy7) obj4, (va6) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                bj7.c((mw2) obj5, (zy7) obj4, (va6) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 5:
                ta4 ta4Var = (ta4) obj5;
                cte cteVar = (cte) obj4;
                List list = (List) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ta4Var.i(cteVar, list.get(i2), e18Var, 0);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                rrk.d((ReferralEligibility) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                mvk.b((String) obj4, (iqb) obj3, (ta4) obj5, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                a.b((rwe) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                xvj.d((Libs) obj5, (mnc) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                mwa.h(obj5, (m4a) obj4, (bz7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                mwj.d((iqb) obj3, (ta4) obj5, (pz7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                unk.e((rxa) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                pok.a((zza) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                zok.d((ArrayList) obj5, (pz7) obj4, (i4g) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                u4b.c((ParsedContentBlock$McpToolInvocation) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                cqk.b((zy7) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).intValue();
                dqk.c((mnc) obj5, (String) obj4, (bz7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                yeb.d((seb) obj5, (pz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Integer) obj2).getClass();
                mvk.a((ggc) obj5, (iqb) obj3, (OnboardingPage) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((Integer) obj2).getClass();
                nuj.e((ggc) obj5, (iqb) obj3, (rp6) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                m4d.a((String) obj4, (iqb) obj3, (z74) obj5, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                fwj.b((MessageBlobFile) obj5, (ej7) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).intValue();
                uhk.a((bpc) obj5, (String) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                fik.a((fnd) obj5, (iqb) obj3, (zy7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).intValue();
                kxk.f((nfe) obj5, (bz7) obj4, (zy7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                lnk.c((bz7) obj5, (iqb) obj3, (ta4) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                jvk.c((t53) obj5, (t4g) obj4, (i4g) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                nvk.e((qnd) obj5, (bz7) obj4, (i4g) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                j.a((rwe) obj5, (w1g) obj4, (pz7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ v76(mw2 mw2Var, zy7 zy7Var, va6 va6Var, int i) {
        this.E = 4;
        this.G = mw2Var;
        this.H = zy7Var;
        this.I = va6Var;
        this.F = i;
    }

    public /* synthetic */ v76(ow2 ow2Var, zy7 zy7Var, va6 va6Var, int i) {
        this.E = 3;
        this.G = ow2Var;
        this.H = zy7Var;
        this.I = va6Var;
        this.F = i;
    }

    public /* synthetic */ v76(int i, int i2, iqb iqbVar, Object obj, Object obj2) {
        this.E = i2;
        this.G = obj;
        this.I = iqbVar;
        this.H = obj2;
        this.F = i;
    }

    public /* synthetic */ v76(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.F = i;
    }

    public /* synthetic */ v76(String str, iqb iqbVar, Object obj, int i, int i2) {
        this.E = i2;
        this.H = str;
        this.I = iqbVar;
        this.G = obj;
        this.F = i;
    }
}
