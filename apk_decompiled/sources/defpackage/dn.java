package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.McpEvents$SuggestionOptInAction;
import com.anthropic.claude.analytics.events.MemoryEvents$MemoryEditOnWeb;
import com.anthropic.claude.analytics.events.SelfHarmBannerEvents$SelfHarmBannerBrowseResources;
import com.anthropic.claude.api.mcp.McpPrompt;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.sessions.types.PermissionMode;
import com.anthropic.claude.tool.model.ChartDisplayV0Input;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dn implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ dn(l45 l45Var, nwb nwbVar, pz7 pz7Var, String str, nwb nwbVar2) {
        this.E = 17;
        this.H = l45Var;
        this.F = nwbVar;
        this.I = pz7Var;
        this.G = str;
        this.J = nwbVar2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        String str;
        int i = this.E;
        int i2 = 2;
        tp4 tp4Var = null;
        iei ieiVar = iei.a;
        Object obj = this.J;
        Object obj2 = this.G;
        Object obj3 = this.I;
        Object obj4 = this.F;
        Object obj5 = this.H;
        switch (i) {
            case 0:
                wxc wxcVar = (wxc) obj5;
                an anVar = (an) obj3;
                Context context = (Context) obj2;
                nwb nwbVar = (nwb) obj;
                ((nwb) obj4).setValue(Boolean.FALSE);
                if (!x44.r(wxcVar.e(), yxc.a)) {
                    nwbVar.setValue(Boolean.TRUE);
                    oq5.K(context, wxcVar);
                } else {
                    wk wkVar = ((vm) anVar.b).t;
                    gb9.D((mp4) wkVar.d, null, null, new cj(wkVar, tp4Var, i2), 3);
                }
                break;
            case 1:
                l45 l45Var = (l45) obj5;
                nwb nwbVar2 = (nwb) obj4;
                Context context2 = (Context) obj2;
                lgb lgbVar = (lgb) obj3;
                i iVar = (i) obj;
                fk fkVar = (fk) nwbVar2.getValue();
                if (fkVar != null && (str = fkVar.e) != null) {
                    nwbVar2.setValue(null);
                    gb9.D(l45Var, null, null, new tm((Object) context2, (Object) lgbVar, (Object) iVar, str, (Object) fkVar, (tp4) null, 7), 3);
                }
                break;
            case 2:
                ((pl3) obj5).i((View) obj3);
                ((zy7) obj2).a();
                ((bz7) obj4).invoke((hcb) obj);
                break;
            case 3:
                dae daeVar = (dae) obj3;
                dae daeVar2 = (dae) obj2;
                od2 od2Var = (od2) obj4;
                gri griVar = (gri) obj;
                lf9 lf9Var = (lf9) ((dae) obj5).E;
                if (lf9Var != null) {
                    lf9Var.d(null);
                }
                lf9 lf9Var2 = (lf9) daeVar.E;
                if (lf9Var2 != null) {
                    lf9Var2.d(null);
                }
                lf9 lf9Var3 = (lf9) daeVar2.E;
                if (lf9Var3 != null) {
                    lf9Var3.d(null);
                }
                UUID uuid = ((vc2) griVar.a).e;
                od2Var.getClass();
                od2Var.f.remove(uuid);
                break;
            case 4:
                gb9.D((l45) obj5, null, null, new cm((ja8) obj3, (Context) obj2, (ChartDisplayV0Input) obj4, (qi3) obj, null, 12), 3);
                break;
            case 5:
                gb9.D((l45) obj5, null, null, new w14((String) obj3, (op3) obj4, (ybg) obj, (Context) obj2, (tp4) null), 3);
                break;
            case 6:
                nwb nwbVar3 = (nwb) obj4;
                ((bz7) obj5).invoke(McpEvents$SuggestionOptInAction.NOT_NOW);
                nwbVar3.setValue(dk4.G);
                gb9.D((l45) obj3, null, null, new t74((pz7) obj2, (zy7) obj, nwbVar3, (tp4) null), 3);
                break;
            case 7:
                Locale locale = (Locale) obj;
                nwb nwbVar4 = (nwb) obj4;
                break;
            case 8:
                break;
            case 9:
                f03 f03Var = (f03) obj4;
                ((hw2) obj5).S((String) obj3, ((McpPrompt) obj2).getName(), (Map) f03Var.y.getValue(), new yz2(f03Var, 2));
                ((t4g) obj).a();
                break;
            case 10:
                String str2 = (String) obj3;
                ze0 ze0Var = (ze0) obj2;
                eli eliVar = (eli) obj4;
                zy7 zy7Var = (zy7) obj;
                ((qi3) obj5).e(new MemoryEvents$MemoryEditOnWeb(), MemoryEvents$MemoryEditOnWeb.Companion.serializer());
                eliVar.a(str2 != null ? kgh.p(ze0Var.a(), "/project/", str2, "?modal=memory") : kgh.o(ze0Var.a(), "/settings/features?modal=memory"));
                zy7Var.a();
                break;
            case 11:
                w1i w1iVar = (w1i) obj5;
                zy7 zy7Var2 = (zy7) obj3;
                bz7 bz7Var = (bz7) obj2;
                bz7 bz7Var2 = (bz7) obj;
                ((nwb) obj4).setValue(Boolean.FALSE);
                y1i y1iVar = w1iVar.d;
                int i3 = y1iVar == null ? -1 : fob.a[y1iVar.ordinal()];
                if (i3 == -1) {
                    bz7Var2.invoke(w1iVar);
                } else if (i3 != 1) {
                    if (i3 != 2) {
                        wg6.i();
                    }
                    bz7Var2.invoke(w1iVar);
                } else {
                    zy7Var2.a();
                    bz7Var.invoke(w1iVar);
                }
                break;
            case 12:
                u3c u3cVar = (u3c) obj3;
                r4g r4gVar = (r4g) obj2;
                a aVar = ((c) obj5).i;
                lsc lscVar = aVar.h;
                Boolean bool = Boolean.TRUE;
                lscVar.setValue(bool);
                vb7.B(aVar.a, "auto_mode_opted_in", true);
                ((nwb) obj4).setValue(Boolean.FALSE);
                if (x44.r((s71) ((wlg) obj).getValue(), n71.b)) {
                    PermissionMode permissionMode = PermissionMode.Auto;
                    permissionMode.getClass();
                    u3cVar.h.setValue(permissionMode);
                    u3cVar.i.setValue(bool);
                    r4gVar.a();
                }
                break;
            case 13:
                Context context3 = (Context) obj2;
                zy7 zy7Var3 = (zy7) obj;
                ((qi3) obj5).e(new SelfHarmBannerEvents$SelfHarmBannerBrowseResources((String) obj3, (String) obj4), iv1.J(jce.b(SelfHarmBannerEvents$SelfHarmBannerBrowseResources.class)));
                try {
                    context3.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(tyg.SUICIDE_AND_SELF_HARM.a())));
                    break;
                } catch (ActivityNotFoundException unused) {
                }
                zy7Var3.a();
                break;
            case 14:
                ((iqf) obj5).d((String) obj3, (String) obj4, (String) obj, (List) obj2);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                String str3 = (String) obj5;
                l45 l45Var2 = (l45) obj3;
                nfb nfbVar = (nfb) obj2;
                nwb nwbVar5 = (nwb) obj4;
                lvh lvhVar = (lvh) obj;
                if (str3 != null) {
                    gb9.D(l45Var2, null, null, new lza(nfbVar, str3, nwbVar5, lvhVar, (tp4) null, 21), 3);
                }
                break;
            case 16:
                l45 l45Var3 = (l45) obj5;
                nwb nwbVar6 = (nwb) obj4;
                nwb nwbVar7 = (nwb) obj;
                pz7 pz7Var = (pz7) obj3;
                nwb nwbVar8 = (nwb) obj2;
                if (!((Boolean) nwbVar6.getValue()).booleanValue()) {
                    nwbVar6.setValue(Boolean.TRUE);
                    nwbVar7.setValue(Boolean.FALSE);
                    gb9.D(l45Var3, null, null, new lza(pz7Var, (Object) nwbVar8, nwbVar6, nwbVar7, (tp4) null, 22), 3);
                }
                break;
            default:
                nwb nwbVar9 = (nwb) obj4;
                nwbVar9.setValue(r3e.a);
                gb9.D((l45) obj5, null, null, new lza((pz7) obj3, obj2, (nwb) obj, nwbVar9, (tp4) null, 25), 3);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ dn(l45 l45Var, nwb nwbVar, nwb nwbVar2, pz7 pz7Var, nwb nwbVar3) {
        this.E = 16;
        this.H = l45Var;
        this.F = nwbVar;
        this.J = nwbVar2;
        this.I = pz7Var;
        this.G = nwbVar3;
    }

    public /* synthetic */ dn(l45 l45Var, nwb nwbVar, Context context, lgb lgbVar, i iVar) {
        this.E = 1;
        this.H = l45Var;
        this.F = nwbVar;
        this.G = context;
        this.I = lgbVar;
        this.J = iVar;
    }

    public /* synthetic */ dn(l45 l45Var, String str, op3 op3Var, ybg ybgVar, Context context) {
        this.E = 5;
        this.H = l45Var;
        this.I = str;
        this.F = op3Var;
        this.J = ybgVar;
        this.G = context;
    }

    public /* synthetic */ dn(Object obj, Object obj2, Object obj3, Object obj4, zy7 zy7Var, int i) {
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.F = obj3;
        this.G = obj4;
        this.J = zy7Var;
    }

    public /* synthetic */ dn(Object obj, Object obj2, Object obj3, Object obj4, nwb nwbVar, int i) {
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.G = obj3;
        this.J = obj4;
        this.F = nwbVar;
    }

    public /* synthetic */ dn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.G = obj3;
        this.F = obj4;
        this.J = obj5;
    }
}
