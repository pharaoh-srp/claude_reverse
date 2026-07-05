package defpackage;

import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.f;
import com.anthropic.claude.chat.dialogs.ChatScreenDialog;
import com.anthropic.claude.chat.dialogs.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h13 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;
    public final /* synthetic */ rwe G;

    public /* synthetic */ h13(rwe rweVar, t53 t53Var) {
        this.E = 2;
        this.G = rweVar;
        this.F = t53Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        rwe rweVar = this.G;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                t53Var.j0.r(new tt6());
                f.c(rweVar);
                break;
            case 1:
                if (!t53Var.F1.isEmpty()) {
                    gb9.D(t53Var.a, null, null, new cm(t53Var, null, 21), 3);
                }
                d.b(rweVar);
                break;
            case 2:
                zsk.g(rweVar, t53Var.f1() ? ChatScreenModalBottomSheetDestination.ViewAllWiggleArtifacts.INSTANCE : ChatScreenModalBottomSheetDestination.ViewAllChatArtifacts.INSTANCE);
                break;
            case 3:
                if (!t53Var.e1()) {
                    gb9.D(t53Var.a, null, null, new nn1(t53Var, null, 26), 3);
                } else {
                    zsk.g(rweVar, ChatScreenDialog.StopResearch.INSTANCE);
                }
                break;
            default:
                whd whdVar = (whd) w44.V0(t53Var.X0);
                if (whdVar != null) {
                    rweVar.E.m(new fv(21, new ChatScreenModalBottomSheetDestination[]{new ChatScreenModalBottomSheetDestination.Feedback(whdVar.c(), whdVar.getIndex(), ChatFeedbackType.FLAG_SAFETY_CLASSIFIER_FALSE_POSITIVE, false, null)}), new p23(27));
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ h13(t53 t53Var, rwe rweVar, int i) {
        this.E = i;
        this.F = t53Var;
        this.G = rweVar;
    }
}
