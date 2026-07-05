package defpackage;

import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o23 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ChatScreenModalBottomSheetDestination.ViewSources F;

    public /* synthetic */ o23(ChatScreenModalBottomSheetDestination.ViewSources viewSources, int i) {
        this.E = i;
        this.F = viewSources;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ChatScreenModalBottomSheetDestination.ViewSources viewSources = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), viewSources) ? list : w44.b1(list, viewSources);
            default:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), viewSources) ? list2 : w44.b1(list2, viewSources);
        }
    }
}
