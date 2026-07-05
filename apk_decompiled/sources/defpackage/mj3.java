package defpackage;

import com.anthropic.claude.app.ClaudeAppOverlay;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mj3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ClaudeAppOverlay.SharedChatFullScreen F;

    public /* synthetic */ mj3(ClaudeAppOverlay.SharedChatFullScreen sharedChatFullScreen, int i) {
        this.E = i;
        this.F = sharedChatFullScreen;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ClaudeAppOverlay.SharedChatFullScreen sharedChatFullScreen = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), sharedChatFullScreen) ? list : w44.b1(list, sharedChatFullScreen);
            default:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), sharedChatFullScreen) ? list2 : w44.b1(list2, sharedChatFullScreen);
        }
    }
}
