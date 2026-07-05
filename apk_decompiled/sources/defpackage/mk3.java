package defpackage;

import com.anthropic.claude.app.ClaudeAppOverlay;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mk3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ClaudeAppOverlay.ArtifactFullScreen F;

    public /* synthetic */ mk3(ClaudeAppOverlay.ArtifactFullScreen artifactFullScreen, int i) {
        this.E = i;
        this.F = artifactFullScreen;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ClaudeAppOverlay.ArtifactFullScreen artifactFullScreen = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), artifactFullScreen) ? list : w44.b1(list, artifactFullScreen);
            default:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), artifactFullScreen) ? list2 : w44.b1(list2, artifactFullScreen);
        }
    }
}
