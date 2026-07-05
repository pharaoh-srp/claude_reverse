package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.analytics.events.McpEvents$SuggestionOptInAction;
import com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.c;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ck4 implements zy7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ ck4(fk0 fk0Var, um1 um1Var, a aVar, ca9 ca9Var, l45 l45Var, ybg ybgVar) {
        this.H = fk0Var;
        this.I = um1Var;
        this.G = aVar;
        this.K = ca9Var;
        this.J = l45Var;
        this.F = ybgVar;
    }

    @Override // defpackage.zy7
    public final Object a() throws Throwable {
        Object hreVar;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj = this.F;
        Object obj2 = this.G;
        Object obj3 = this.H;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                nwb nwbVar = (nwb) obj2;
                ((bz7) obj3).invoke(McpEvents$SuggestionOptInAction.TURN_ON);
                nwbVar.setValue(dk4.F);
                gb9.D((l45) obj5, null, null, new w14((pz7) obj4, (bz7) obj6, (zy7) obj, nwbVar, null, 10), 3);
                return ieiVar;
            case 1:
                zy7 zy7Var = (zy7) obj;
                nwb nwbVar2 = (nwb) obj2;
                xpa xpaVar = (xpa) obj6;
                String str = (String) obj5;
                zy7 zy7Var2 = (zy7) obj4;
                nwbVar2.setValue((String) obj3);
                try {
                    xpaVar.t(str);
                    hreVar = ieiVar;
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                Throwable thA = jre.a(hreVar);
                if (thA != null) {
                    if (thA instanceof CancellationException) {
                        throw thA;
                    }
                    nwbVar2.setValue(null);
                    List list = xah.a;
                    xah.f(thA, "Failed to launch SAF save picker", ozf.F, null, 24);
                    zy7Var2.a();
                }
                zy7Var.a();
                return ieiVar;
            case 2:
                fk0 fk0Var = (fk0) obj3;
                um1 um1Var = (um1) obj6;
                a aVar = (a) obj2;
                ca9 ca9Var = (ca9) obj4;
                l45 l45Var = (l45) obj5;
                ybg ybgVar = (ybg) obj;
                fk0Var.t(false);
                fk0Var.s.setValue(Boolean.FALSE);
                SharedPreferences.Editor editorEdit = fk0Var.a.edit();
                editorEdit.putBoolean("voice_shortcut_dialog_shown", false);
                editorEdit.apply();
                um1Var.g(false);
                um1Var.e(false);
                if (aVar != null) {
                    vb7.B(aVar.a, "notification_prompt_seen", false);
                }
                ca9Var.O();
                gb9.D(l45Var, null, null, new y99(ybgVar, null, 5), 3);
                return ieiVar;
            case 3:
                gb9.D((l45) obj5, null, null, new mt4(obj3, obj6, obj4, obj2, obj, (tp4) null, 14), 3);
                return ieiVar;
            case 4:
                gb9.D((l45) obj5, null, null, new c((mc) obj3, (zvc) obj6, (t4g) obj4, (zy7) obj, (nwb) obj2, null), 3);
                return ieiVar;
            default:
                SttSupportedLanguage sttSupportedLanguage = (SttSupportedLanguage) obj6;
                ptg ptgVar = (ptg) obj5;
                ysg ysgVar = (ysg) obj4;
                bz7 bz7Var = (bz7) obj3;
                nwb nwbVar3 = (nwb) obj;
                ((nwb) obj2).setValue(sttSupportedLanguage);
                String code = sttSupportedLanguage.getCode();
                ptgVar.getClass();
                code.getClass();
                fk0 fk0Var2 = ptgVar.a;
                if (!code.equals(fk0Var2.f())) {
                    fk0Var2.s(code);
                    fk0Var2.u(true);
                    fk0Var2.v(true);
                    gb9.D(ptgVar.c, null, null, new lza(ptgVar, code, tp4Var, 19), 3);
                }
                String strA = ysg.a();
                if (strA != null && ysgVar.b(strA) == null) {
                    fk0 fk0Var3 = ysgVar.b;
                    fk0Var3.n.setValue(strA);
                    kgh.t(fk0Var3.a, "voice_device_locale_seen_unsupported", strA);
                }
                bz7Var.invoke(sttSupportedLanguage.getCode());
                nwbVar3.setValue(Boolean.FALSE);
                return ieiVar;
        }
    }

    public /* synthetic */ ck4(l45 l45Var, mc mcVar, zvc zvcVar, t4g t4gVar, zy7 zy7Var, nwb nwbVar) {
        this.J = l45Var;
        this.H = mcVar;
        this.I = zvcVar;
        this.K = t4gVar;
        this.F = zy7Var;
        this.G = nwbVar;
    }

    public /* synthetic */ ck4(l45 l45Var, b bVar, a aVar, ybg ybgVar, nwb nwbVar, nwb nwbVar2) {
        this.J = l45Var;
        this.H = bVar;
        this.I = aVar;
        this.K = ybgVar;
        this.G = nwbVar;
        this.F = nwbVar2;
    }

    public /* synthetic */ ck4(bz7 bz7Var, l45 l45Var, nwb nwbVar, pz7 pz7Var, bz7 bz7Var2, zy7 zy7Var) {
        this.H = bz7Var;
        this.J = l45Var;
        this.G = nwbVar;
        this.K = pz7Var;
        this.I = bz7Var2;
        this.F = zy7Var;
    }

    public /* synthetic */ ck4(SttSupportedLanguage sttSupportedLanguage, ptg ptgVar, ysg ysgVar, bz7 bz7Var, nwb nwbVar, nwb nwbVar2) {
        this.I = sttSupportedLanguage;
        this.J = ptgVar;
        this.K = ysgVar;
        this.H = bz7Var;
        this.G = nwbVar;
        this.F = nwbVar2;
    }

    public /* synthetic */ ck4(String str, s64 s64Var, zy7 zy7Var, nwb nwbVar, xpa xpaVar, String str2, zy7 zy7Var2) {
        this.H = str;
        this.F = zy7Var;
        this.G = nwbVar;
        this.I = xpaVar;
        this.J = str2;
        this.K = zy7Var2;
    }
}
