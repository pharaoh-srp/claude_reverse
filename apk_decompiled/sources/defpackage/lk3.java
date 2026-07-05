package defpackage;

import com.anthropic.claude.app.ClaudeAppOverlay;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lk3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ClaudeAppOverlay.FeedbackSheet F;

    public /* synthetic */ lk3(ClaudeAppOverlay.FeedbackSheet feedbackSheet, int i) {
        this.E = i;
        this.F = feedbackSheet;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ClaudeAppOverlay.FeedbackSheet feedbackSheet = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), feedbackSheet) ? list : w44.b1(list, feedbackSheet);
            default:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), feedbackSheet) ? list2 : w44.b1(list2, feedbackSheet);
        }
    }
}
