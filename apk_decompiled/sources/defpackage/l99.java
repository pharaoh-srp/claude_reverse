package defpackage;

import com.anthropic.claude.api.mcp.DirectoryServer;
import com.anthropic.claude.app.verification.VerificationScreens;
import com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination;
import com.anthropic.claude.settings.SettingsAppScreen;
import com.anthropic.claude.settings.internal.InternalSettingsAppScreen;
import com.anthropic.claude.tool.model.KnowledgeSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l99 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;

    public /* synthetic */ l99(rwe rweVar, int i) {
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
                String str = (String) obj;
                str.getClass();
                rweVar.E.m(new cv(29, new InternalSettingsAppScreen.GrowthBookFeatureJsonEditor(str)), new ae5(5));
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                rweVar.E.m(new u3a(16, new SettingsAppScreen.MemoryFileDetailScreen(str2)), new hyf(3));
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                rweVar.E.m(new d6d(11, new SettingsAppScreen.MemoryFileDetailScreen(str3)), new qte((byte) 0, 1));
                break;
            case 3:
                DirectoryServer directoryServer = (DirectoryServer) obj;
                directoryServer.getClass();
                rweVar.E.m(new u3a(15, new SettingsAppScreen.ConnectorDirectoryDetail(directoryServer)), new nmd(12));
                break;
            case 4:
                List list = (List) obj;
                list.getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((whb) it.next()).getId());
                }
                rweVar.E.m(new u3a(19, new SharedChatModalBottomSheetDestination.ViewCollapsedTools(arrayList)), new hyf(23));
                break;
            case 5:
                KnowledgeSource knowledgeSource = (KnowledgeSource) obj;
                knowledgeSource.getClass();
                rweVar.E.m(new c2g(new SharedChatModalBottomSheetDestination.PreviewLink(knowledgeSource, knowledgeSource.getUrl()), 1), new hyf(24));
                break;
            default:
                String str4 = (String) obj;
                str4.getClass();
                rweVar.E.m(new u3a(25, new VerificationScreens.VerifyPhoneCodeStep(str4)), new eah(2));
                break;
        }
        return ieiVar;
    }
}
