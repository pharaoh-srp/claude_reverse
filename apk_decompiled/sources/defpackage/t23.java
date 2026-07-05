package defpackage;

import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t23 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ChatScreenArtifactSheetDestination.ViewArtifact F;

    public /* synthetic */ t23(ChatScreenArtifactSheetDestination.ViewArtifact viewArtifact, int i) {
        this.E = i;
        this.F = viewArtifact;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ChatScreenArtifactSheetDestination.ViewArtifact viewArtifact = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), viewArtifact) ? list : w44.b1(list, viewArtifact);
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), viewArtifact) ? list2 : w44.b1(list2, viewArtifact);
            default:
                List list3 = (List) obj;
                list3.getClass();
                return x44.r(w44.U0(list3), viewArtifact) ? list3 : w44.b1(list3, viewArtifact);
        }
    }
}
