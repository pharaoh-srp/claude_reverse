package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.api.conway.WebhookRecord;
import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeScreenParams;
import com.anthropic.claude.project.knowledge.l;
import com.anthropic.claude.sessions.types.EnvironmentResource;
import com.anthropic.claude.sessions.types.PermissionMode;
import java.util.List;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pk implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ pk(zb0 zb0Var, iqb iqbVar, zt6 zt6Var, String str, zy7 zy7Var, int i) {
        this.E = 14;
        this.H = zb0Var;
        this.F = iqbVar;
        this.I = zt6Var;
        this.J = str;
        this.K = zy7Var;
        this.G = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        Object obj3 = this.F;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        iei ieiVar = iei.a;
        int i2 = this.G;
        Object obj7 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qk.b((List) obj7, (bz7) obj6, (bz7) obj5, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                iuj.j((m9j) obj7, (kja) obj6, (WelcomeNotice) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                htk.a((ml3) obj7, (bz7) obj6, (iqb) obj3, (qi3) obj5, (gr0) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                dwk.a((u9d) obj7, (ta4) obj6, (l2i) obj5, (iqb) obj3, (ta4) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                quj.a((String) obj7, (bz7) obj6, (pz7) obj5, (iqb) obj3, (wsg) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                a.s((EnvironmentResource) obj6, (List) obj7, (pz7) obj5, (zy7) obj4, (i4g) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2) | 1;
                ((ta4) obj7).n(this.I, this.J, this.K, this.F, (ld4) obj, iP0);
                break;
            case 7:
                ((Integer) obj2).getClass();
                qk4.a((t53) obj7, (f03) obj6, (t4g) obj5, (hi4) obj4, (i4g) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                com.anthropic.claude.conway.a.a((iqb) obj3, (us4) obj7, (dx4) obj6, (zy7) obj5, (zy7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                kr4.b((List) obj7, (ConwayAppScreen.Extension) obj5, (bz7) obj6, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ktk.b((WebhookRecord) obj7, (bz7) obj6, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                euk.d((String) obj7, (String) obj6, (String) obj5, (pz7) obj4, (qi3) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                euk.m((String) obj7, (ApiHelpline) obj6, (pz7) obj5, (pz7) obj4, (qi3) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                puk.b((String) obj7, (String) obj6, (String) obj5, (String) obj4, (qi3) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                uik.b((zb0) obj7, (iqb) obj3, (zt6) obj6, (String) obj5, (zy7) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                rrk.c((ce8) obj7, (zy7) obj6, (kae) obj5, (koi) obj4, (qi3) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                tw8.a((koc) obj6, (List) obj7, (String) obj5, (yw8) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                com.anthropic.claude.chat.input.images.a.a((rw2) obj7, (iqb) obj3, (zy7) obj5, (bz7) obj6, (va6) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                c4b.c((McpServer) obj7, (bz7) obj6, (bz7) obj5, (i4g) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Integer) obj2).getClass();
                kpk.b((String) obj7, (z4b) obj5, (bz7) obj6, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((Integer) obj2).getClass();
                kpb.d((String) obj7, (String) obj6, (zy7) obj5, (qnc) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).intValue();
                krb.b((List) obj7, (String) obj5, (bz7) obj6, (zy7) obj4, (i4g) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).intValue();
                etj.g((PermissionMode) obj7, (s71) obj5, (bz7) obj6, (zy7) obj4, (i4g) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                ttj.d((String) obj7, (l1d) obj6, (zy7) obj5, (iqb) obj3, (Integer) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                lwj.i((MessageFile) obj7, (String) obj6, (ej7) obj5, (zy7) obj4, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).getClass();
                l.a((ProjectKnowledgeScreenParams) obj7, (zy7) obj6, (iqb) obj3, (wmd) obj5, (qi3) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                zqd.a((Experience) obj7, (zy7) obj6, (zy7) obj5, (pz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                tlk.c((String) obj7, (String) obj6, (iqb) obj3, (e0g) obj5, (yw8) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                bte.b((cte) obj7, (zb0) obj5, (iqb) obj3, (bz7) obj6, (Map) obj4, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                stj.h((i4g) obj7, (a5g) obj6, (pz7) obj5, (rz7) obj4, (ta4) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ pk(rw2 rw2Var, iqb iqbVar, zy7 zy7Var, bz7 bz7Var, va6 va6Var, int i) {
        this.E = 17;
        this.H = rw2Var;
        this.F = iqbVar;
        this.J = zy7Var;
        this.I = bz7Var;
        this.K = va6Var;
        this.G = i;
    }

    public /* synthetic */ pk(iqb iqbVar, us4 us4Var, dx4 dx4Var, zy7 zy7Var, zy7 zy7Var2, int i) {
        this.E = 8;
        this.F = iqbVar;
        this.H = us4Var;
        this.I = dx4Var;
        this.J = zy7Var;
        this.K = zy7Var2;
        this.G = i;
    }

    public /* synthetic */ pk(cte cteVar, zb0 zb0Var, iqb iqbVar, bz7 bz7Var, Map map, int i) {
        this.E = 28;
        this.H = cteVar;
        this.J = zb0Var;
        this.F = iqbVar;
        this.I = bz7Var;
        this.K = map;
        this.G = i;
    }

    public /* synthetic */ pk(Object obj, Object obj2, bz7 bz7Var, zy7 zy7Var, Object obj3, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.J = obj2;
        this.I = bz7Var;
        this.K = zy7Var;
        this.F = obj3;
        this.G = i;
    }

    public /* synthetic */ pk(Object obj, Object obj2, iqb iqbVar, Object obj3, Object obj4, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.F = iqbVar;
        this.J = obj3;
        this.K = obj4;
        this.G = i;
    }

    public /* synthetic */ pk(Object obj, Object obj2, Object obj3, iqb iqbVar, Object obj4, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.F = iqbVar;
        this.K = obj4;
        this.G = i;
    }

    public /* synthetic */ pk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.I = obj2;
        this.J = obj3;
        this.K = obj4;
        this.F = obj5;
        this.G = i;
    }

    public /* synthetic */ pk(Object obj, List list, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.E = i2;
        this.I = obj;
        this.H = list;
        this.J = obj2;
        this.K = obj3;
        this.F = obj4;
        this.G = i;
    }
}
