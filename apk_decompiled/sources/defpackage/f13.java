package defpackage;

import android.net.Uri;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.artifact.sheet.ArtifactShareParams;
import com.anthropic.claude.chat.ChatScreenOverlay;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.chat.dialogs.ChatScreenDialog;
import com.anthropic.claude.chat.dialogs.d;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.login.LoginScreens;
import com.anthropic.claude.login.MagicLinkSentConfig;
import com.anthropic.claude.tool.model.KnowledgeSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f13 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;

    public /* synthetic */ f13(rwe rweVar, int i) {
        this.E = i;
        this.F = rweVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                ArtifactShareParams artifactShareParams = (ArtifactShareParams) obj;
                artifactShareParams.getClass();
                rweVar.E.m(new fv(11, new ChatScreenDialog[]{new ChatScreenDialog.ShareArtifact(artifactShareParams)}), new a2g(22));
                break;
            case 1:
                ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation = (ParsedContentBlock$McpToolInvocation) obj;
                parsedContentBlock$McpToolInvocation.getClass();
                rweVar.E.m(new cv(5, new ChatScreenModalBottomSheetDestination.ViewToolContent(parsedContentBlock$McpToolInvocation.getId())), new a2g(27));
                break;
            case 2:
                gtc gtcVar = (gtc) obj;
                gtcVar.getClass();
                String strB = gtcVar.b();
                if (strB != null) {
                    rweVar.E.m(new cv(6, new ChatScreenModalBottomSheetDestination.ViewResearchDetails(strB, null)), new a2g(28));
                }
                break;
            case 3:
                List list = (List) obj;
                list.getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((whb) it.next()).getId());
                }
                rweVar.E.m(new cv(7, new ChatScreenModalBottomSheetDestination.ViewCollapsedTools(arrayList)), new a2g(29));
                break;
            case 4:
                MessageImageAsset messageImageAsset = (MessageImageAsset) obj;
                messageImageAsset.getClass();
                rweVar.E.m(new q23(new ChatScreenModalBottomSheetDestination.PreviewImage(messageImageAsset, false, false, false, 14, (mq5) null), 0), new p23(2));
                break;
            case 5:
                MessageDocumentFile messageDocumentFile = (MessageDocumentFile) obj;
                messageDocumentFile.getClass();
                rweVar.E.m(new cv(10, new ChatScreenModalBottomSheetDestination.PreviewDocument(messageDocumentFile)), new p23(3));
                break;
            case 6:
                MessageBlobFile messageBlobFile = (MessageBlobFile) obj;
                messageBlobFile.getClass();
                rweVar.E.m(new r23(new ChatScreenModalBottomSheetDestination.PreviewBlob(messageBlobFile), 0), new p23(4));
                break;
            case 7:
                KnowledgeSource knowledgeSource = (KnowledgeSource) obj;
                knowledgeSource.getClass();
                rweVar.E.m(new s23(new ChatScreenModalBottomSheetDestination.PreviewLink(knowledgeSource, (String) null, 2, (mq5) null), 0), new p23(6));
                break;
            case 8:
                ((String) obj).getClass();
                d.b(rweVar);
                break;
            case 9:
                String str = (String) obj;
                str.getClass();
                v73 v73Var = new v73(new ChatScreenOverlay.BrowserTakeover(str, (String) null, 2, (mq5) null), 1);
                p23 p23Var = new p23(25);
                rweVar.getClass();
                rweVar.E.m(v73Var, p23Var);
                break;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                cv cvVar = new cv(20, new ClaudeAppOverlay.ExperienceSpotlightSheet(str2));
                tj3 tj3Var = new tj3(0);
                rweVar.getClass();
                rweVar.E.m(cvVar, tj3Var);
                break;
            case 11:
                Uri uri = (Uri) obj;
                if (!(iv1.t(rweVar) instanceof ClaudeAppOverlay.FeedbackSheet)) {
                    rweVar.E.m(new lk3(new ClaudeAppOverlay.FeedbackSheet(uri != null ? uri.toString() : null), 1), new tj3(5));
                }
                break;
            default:
                MagicLinkSentConfig magicLinkSentConfig = (MagicLinkSentConfig) obj;
                magicLinkSentConfig.getClass();
                rweVar.E.m(new u3a(4, new LoginScreens.MagicLinkSent(magicLinkSentConfig)), new ae5(20));
                break;
        }
        return ieiVar;
    }
}
