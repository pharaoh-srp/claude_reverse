package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.VillageWeaverConsentState;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.app.m1;
import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.chat.dialogs.ChatScreenDialog;
import com.anthropic.claude.chat.f;
import com.anthropic.router.panes.Panes;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s63 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ s63(q7 q7Var, nwb nwbVar, j1j j1jVar, loi loiVar, nwb nwbVar2, f9 f9Var) {
        this.E = 1;
        this.G = q7Var;
        this.F = nwbVar;
        this.H = j1jVar;
        this.I = loiVar;
        this.J = nwbVar2;
        this.K = f9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        AccountSettings settings;
        Panes panes;
        uf6 uf6Var;
        pf6 pf6Var;
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = true;
        Object village_weaver_consent_state = null;
        Object obj = this.F;
        Object obj2 = this.K;
        Object obj3 = this.J;
        Object obj4 = this.I;
        Object obj5 = this.H;
        Object obj6 = this.G;
        switch (i) {
            case 0:
                rwe rweVar = (rwe) obj4;
                fk0 fk0Var = (fk0) obj3;
                hw2 hw2Var = (hw2) obj2;
                nwb nwbVar = (nwb) obj;
                ((t4g) obj6).a();
                if (!((Boolean) ((t53) obj5).y.s.getValue()).booleanValue()) {
                    rweVar.E.m(new jx2(3, ChatScreenDialog.VoiceShortcut.INSTANCE), new p23(22));
                } else if (fk0Var.g()) {
                    ((zy7) nwbVar.getValue()).a();
                } else {
                    hw2Var.m0(true);
                }
                return ieiVar;
            case 1:
                q7 q7Var = (q7) obj6;
                nwb nwbVar2 = (nwb) obj;
                j1j j1jVar = (j1j) obj5;
                loi loiVar = (loi) obj4;
                nwb nwbVar3 = (nwb) obj3;
                f9 f9Var = (f9) obj2;
                q7 q7Var2 = q7Var.b() ? q7Var : null;
                if (q7Var2 != null && (settings = q7Var2.a().getSettings()) != null) {
                    village_weaver_consent_state = settings.getVillage_weaver_consent_state();
                }
                z = village_weaver_consent_state == null;
                if (!((Boolean) nwbVar2.getValue()).booleanValue() && z) {
                    f.c(j1jVar, q7Var, loiVar, f9Var, VillageWeaverConsentState.DECLINED);
                }
                nwbVar3.setValue(Boolean.FALSE);
                return ieiVar;
            case 2:
                oe6 oe6Var = (oe6) obj6;
                qzb qzbVar = (qzb) obj5;
                nf7 nf7Var = (nf7) obj4;
                rc8 rc8Var = (rc8) obj3;
                ye3 ye3Var = (ye3) obj2;
                ChatScreenParams chatScreenParamsB = z93.b((z93) obj, null, null, null, 7);
                nf7Var.getClass();
                rc8Var.getClass();
                nf1 nf1Var = new nf1(nf7Var, qzbVar, rc8Var, 13);
                if ((oe6Var instanceof ne6) && (pf6Var = (uf6Var = ((ne6) oe6Var).a).c) != pf6.I && !uf6Var.b.contains(pf6Var) && ((Boolean) nf1Var.invoke(pf6Var)).booleanValue()) {
                    switch (pf6Var.ordinal()) {
                        case 0:
                            village_weaver_consent_state = ClaudeAppDestination.List.AllChatsList.INSTANCE;
                            break;
                        case 1:
                            village_weaver_consent_state = ClaudeAppDestination.List.AgentChat.INSTANCE;
                            break;
                        case 2:
                            village_weaver_consent_state = ClaudeAppDestination.List.Tasks.INSTANCE;
                            break;
                        case 3:
                            village_weaver_consent_state = ClaudeAppDestination.List.AllProjectsList.INSTANCE;
                            break;
                        case 4:
                            village_weaver_consent_state = ClaudeAppDestination.List.ArtifactGallery.INSTANCE;
                            break;
                        case 5:
                            village_weaver_consent_state = ClaudeAppDestination.List.CodeRemote.INSTANCE;
                            break;
                        case 6:
                            village_weaver_consent_state = ClaudeAppDestination.List.CoworkRemote.INSTANCE;
                            break;
                        case 7:
                            village_weaver_consent_state = ClaudeAppDestination.List.Conway.INSTANCE;
                            break;
                        default:
                            mr9.b();
                            return null;
                    }
                }
                if (village_weaver_consent_state == null) {
                    village_weaver_consent_state = m1.a(nf7Var, qzbVar);
                }
                boolean zR = x44.r(village_weaver_consent_state, ClaudeAppDestination.List.AllChatsList.INSTANCE);
                List listW = lm6.E;
                if (zR) {
                    if (ye3Var != ye3.E) {
                        listW = x44.W(village_weaver_consent_state);
                    }
                    panes = new Panes(listW, x44.W(new ClaudeAppDestination.Detail.Chat(chatScreenParamsB)), (List) null, ye3Var, 4, (mq5) null);
                } else {
                    panes = new Panes(x44.W(village_weaver_consent_state), listW, (List) null, ye3Var, 4, (mq5) null);
                }
                return panes;
            default:
                y4f y4fVar = (y4f) obj6;
                x5f x5fVar = (x5f) obj5;
                c5f c5fVar = (c5f) obj4;
                String str = (String) obj3;
                Object[] objArr = (Object[]) obj;
                if (y4fVar.F != c5fVar) {
                    y4fVar.F = c5fVar;
                    z = true;
                }
                if (x44.r(y4fVar.G, str)) {
                    z = z;
                } else {
                    y4fVar.G = str;
                }
                y4fVar.E = x5fVar;
                y4fVar.H = obj2;
                y4fVar.I = objArr;
                b5f b5fVar = y4fVar.J;
                if (b5fVar != null && z) {
                    ((w3c) b5fVar).f();
                    y4fVar.J = null;
                    y4fVar.c();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ s63(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.J = obj4;
        this.K = obj5;
        this.F = obj6;
    }
}
