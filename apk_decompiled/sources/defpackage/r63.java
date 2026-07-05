package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r63 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ r63(t53 t53Var, fk0 fk0Var, hw2 hw2Var, nwb nwbVar) {
        this.E = 1;
        this.F = t53Var;
        this.H = fk0Var;
        this.G = hw2Var;
        this.I = nwbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy7
    public final Object a() {
        r93 r93Var;
        ThinkingEffort thinkingEffortM1135boximpl;
        fkg fkgVar;
        int i = this.E;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        iei ieiVar = iei.a;
        Object obj = this.I;
        Object obj2 = this.F;
        Object obj3 = this.G;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                gj1 gj1Var = (gj1) obj4;
                hw2 hw2Var = (hw2) obj3;
                t53 t53Var = (t53) obj2;
                r93 r93Var2 = t53Var.g0;
                mp4 mp4Var = t53Var.a;
                uz7 uz7Var = (uz7) obj;
                int i2 = 5;
                if (!((Boolean) gj1Var.f.getValue()).booleanValue()) {
                    gb9.D(mp4Var, null, null, new h43(t53Var, objArr == true ? 1 : 0, i2), 3);
                    ChatId chatIdM978boximpl = ChatId.m978boximpl(t53Var.L0);
                    skd skdVarQ0 = t53Var.Q0();
                    String str = skdVarQ0 != null ? skdVarQ0.a : null;
                    ProjectId projectIdM1079boximpl = str != null ? ProjectId.m1079boximpl(str) : null;
                    String strE = r93Var2.e();
                    ModelId modelIdM1058boximpl = strE != null ? ModelId.m1058boximpl(strE) : null;
                    String strG = r93Var2.g();
                    if (strG != null) {
                        r93Var = r93Var2;
                        thinkingEffortM1135boximpl = ThinkingEffort.m1135boximpl(strG);
                    } else {
                        r93Var = r93Var2;
                        thinkingEffortM1135boximpl = null;
                    }
                    String strD = r93Var.d();
                    uz7Var.l(chatIdM978boximpl, projectIdM1079boximpl, modelIdM1058boximpl, thinkingEffortM1135boximpl, strD != null ? ThinkingMode.m1142boximpl(strD) : null, Boolean.valueOf(t53Var.a1()));
                } else if (hw2Var.Y() == null && ((Boolean) gj1Var.f.getValue()).booleanValue() && t53Var.L0() == null) {
                    if (!t53Var.I0() || t53Var.b1()) {
                        List list = xah.a;
                        xah.e(6, "startVoiceSession: skipped, hasLoaded=" + t53Var.I0() + " isLoading=" + t53Var.b1(), null, null);
                    } else if (!t53Var.U0().b() && ((fkgVar = t53Var.E1) == null || !fkgVar.c())) {
                        gb9.D(mp4Var, null, null, new h43(t53Var, objArr2 == true ? 1 : 0, i2), 3);
                        fkg fkgVar2 = t53Var.B1;
                        if (fkgVar2 != null) {
                            fkgVar2.d(null);
                        }
                        Context context = t53Var.c;
                        koi koiVar = t53Var.d;
                        String str2 = t53Var.L0;
                        skd skdVarQ02 = t53Var.Q0();
                        xc3 xc3Var = new xc3(context, koiVar, str2, skdVarQ02 != null ? skdVarQ02.a : null, r93Var2.e(), r93Var2.g(), r93Var2.d(), t53Var.a1(), gj1Var, t53Var.X0, t53Var.a, new ub2(8, t53Var), new a33(t53Var, 0), new a33(t53Var, 1), new a33(t53Var, 2));
                        t53Var.a1.setValue(new fx2(xc3Var));
                        t53Var.b1 = gb9.D(mp4Var, null, null, new nn1(t53Var, xc3Var, (tp4) null, 25), 3);
                        xc3Var.f();
                    } else {
                        List list2 = xah.a;
                        xah.e(6, "startVoiceSession: skipped, sendJob active (responseState=" + t53Var.U0() + ")", null, null);
                    }
                }
                break;
            case 1:
                hw2 hw2Var2 = (hw2) obj3;
                nwb nwbVar = (nwb) obj;
                fk0 fk0Var = ((t53) obj2).y;
                fk0Var.s.setValue(Boolean.TRUE);
                SharedPreferences.Editor editorEdit = fk0Var.a.edit();
                editorEdit.putBoolean("voice_shortcut_dialog_shown", true);
                editorEdit.apply();
                if (!((fk0) obj4).g()) {
                    hw2Var2.m0(true);
                } else {
                    ((zy7) nwbVar.getValue()).a();
                }
                break;
            case 2:
                t53 t53Var2 = (t53) obj2;
                qi3 qi3Var = (qi3) obj;
                ((rwe) obj4).E.m(new fv(22, new ChatScreenModalBottomSheetDestination[]{new ChatScreenModalBottomSheetDestination.Share(((ChatScreenParams) obj3).m591getChatIdRjYBDck(), t53Var2.X0.size(), objArr3 == true ? 1 : 0)}), new j83(0));
                String str3 = t53Var2.d.e;
                String str4 = t53Var2.L0;
                uhd uhdVarM0 = t53Var2.M0();
                String strC = uhdVarM0 != null ? uhdVarM0.c() : null;
                if (strC == null) {
                    strC = "";
                }
                qi3Var.e(new ChatMessageActionEvents$ChatMessageActionClicked(str3, str4, strC, ChatMessageActionEvents$ActionSource.OVERFLOW_MENU, ChatMessageActionEvents$ChatMessageAction.SHARE, (String) null, 32, (mq5) null), ChatMessageActionEvents$ChatMessageActionClicked.Companion.serializer());
                break;
            case 3:
                gb9.D((l45) obj4, null, null, new jy2((vd3) obj3, (ChatConversationWithProjectReference) obj2, (zy7) obj, null, 1), 3);
                break;
            case 4:
                Float f = (Float) obj4;
                z19 z19Var = (z19) obj3;
                Float f2 = (Float) obj2;
                y19 y19Var = (y19) obj;
                if (!f.equals(z19Var.E) || !f2.equals(z19Var.F)) {
                    z19Var.E = f;
                    z19Var.F = f2;
                    z19Var.H = new a5h(y19Var, dgj.f, f, f2, null);
                    z19Var.L.b.setValue(Boolean.TRUE);
                    z19Var.I = false;
                    z19Var.J = true;
                }
                break;
            case 5:
                of6 of6Var = (of6) obj4;
                of6Var.c.setValue((cz5) obj3);
                of6Var.d = (yig) obj2;
                of6Var.e = (yig) obj;
                break;
            default:
                wxc wxcVar = (wxc) obj4;
                pl3 pl3Var = (pl3) obj3;
                View view = (View) obj2;
                zy7 zy7Var = (zy7) obj;
                if (!oq5.I(wxcVar.e())) {
                    wxcVar.f();
                } else {
                    pl3Var.g(view);
                    zy7Var.a();
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ r63(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.H = obj;
        this.G = obj2;
        this.F = obj3;
        this.I = obj4;
    }
}
