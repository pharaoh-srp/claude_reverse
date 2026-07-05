package defpackage;

import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.artifact.details.a;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.login.b;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.anthropic.claude.types.strings.MessageId;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x13 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;

    public /* synthetic */ x13(rwe rweVar, int i) {
        this.E = i;
        this.F = rweVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ArtifactFullScreenParams params;
        int i = this.E;
        lz1 lz1Var = jd4.a;
        String uuidValue = null;
        int i2 = 1;
        iei ieiVar = iei.a;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                String str = (String) obj;
                ApiHelpline apiHelpline = (ApiHelpline) obj2;
                str.getClass();
                apiHelpline.getClass();
                rweVar.E.m(new cv(8, new ChatScreenModalBottomSheetDestination.SshHelplines(MessageId.m1052constructorimpl(str), apiHelpline.getId(), apiHelpline.getName(), apiHelpline.getPhone_number(), apiHelpline.getSms_number(), apiHelpline.getWeb_chat_url(), null)), new p23(0));
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                rweVar.E.m(new cv(9, new ChatScreenModalBottomSheetDestination.ViewCode(str2, (String) obj2)), new p23(1));
                break;
            case 2:
                String str3 = (String) obj;
                List list = (List) obj2;
                str3.getClass();
                list.getClass();
                rweVar.E.m(new o23(new ChatScreenModalBottomSheetDestination.ViewSources(str3, list), 0), new a2g(25));
                break;
            case 3:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                list2.getClass();
                list3.getClass();
                rweVar.E.m(new cv(4, new ChatScreenModalBottomSheetDestination.ViewCombinedSources(list2, list3)), new a2g(26));
                break;
            case 4:
                String str4 = (String) obj;
                List list4 = (List) obj2;
                str4.getClass();
                list4.getClass();
                rweVar.E.m(new o23(new ChatScreenModalBottomSheetDestination.ViewSources(str4, list4), 1), new p23(23));
                break;
            case 5:
                KnowledgeSource knowledgeSource = (KnowledgeSource) obj;
                knowledgeSource.getClass();
                rweVar.E.m(new s23(new ChatScreenModalBottomSheetDestination.PreviewLink(knowledgeSource, (String) obj2), 1), new p23(24));
                break;
            case 6:
                String str5 = (String) obj;
                Date date = (Date) obj2;
                str5.getClass();
                date.getClass();
                rj3 rj3Var = new rj3(new ClaudeAppOverlay.MemoryPreview(str5, date, null, null), 1);
                j83 j83Var = new j83(26);
                rweVar.getClass();
                rweVar.E.m(rj3Var, j83Var);
                break;
            case 7:
                String str6 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str6.getClass();
                ClaudeAppOverlay claudeAppOverlay = (ClaudeAppOverlay) iv1.t(rweVar);
                ClaudeAppOverlay.ArtifactFullScreen artifactFullScreen = claudeAppOverlay instanceof ClaudeAppOverlay.ArtifactFullScreen ? (ClaudeAppOverlay.ArtifactFullScreen) claudeAppOverlay : null;
                if (artifactFullScreen != null && (params = artifactFullScreen.getParams()) != null) {
                    uuidValue = params.getUuidValue();
                }
                if (!x44.r(uuidValue, str6)) {
                    ArtifactFullScreenParams.Companion.getClass();
                    rweVar.E.m(new mk3(new ClaudeAppOverlay.ArtifactFullScreen(a.a(str6, zBooleanValue)), 0), new tj3(4));
                }
                break;
            case 8:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zH = e18Var.h(rweVar);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new av(rweVar, 17);
                        e18Var.k0(objN);
                    }
                    b.b((zy7) objN, null, e18Var, 0);
                }
                break;
            case 9:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    boolean zH2 = e18Var2.h(rweVar);
                    Object objN2 = e18Var2.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new av(rweVar, 19);
                        e18Var2.k0(objN2);
                    }
                    r99.a((zy7) objN2, null, e18Var2, 0);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    olh.a(false, null, null, fd9.q0(1216474317, new io8(rweVar, i2), e18Var3), e18Var3, 3072, 7);
                }
                break;
        }
        return ieiVar;
    }
}
