package defpackage;

import com.anthropic.claude.chat.ChatScreenOverlay;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v73 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ChatScreenOverlay.BrowserTakeover F;

    public /* synthetic */ v73(ChatScreenOverlay.BrowserTakeover browserTakeover, int i) {
        this.E = i;
        this.F = browserTakeover;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ChatScreenOverlay.BrowserTakeover browserTakeover = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), browserTakeover) ? list : w44.b1(list, browserTakeover);
            default:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), browserTakeover) ? list2 : w44.b1(list2, browserTakeover);
        }
    }
}
