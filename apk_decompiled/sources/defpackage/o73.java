package defpackage;

import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o73 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ChatScreenModalBottomSheetDestination.LocalToolApproval F;

    public /* synthetic */ o73(ChatScreenModalBottomSheetDestination.LocalToolApproval localToolApproval, int i) {
        this.E = i;
        this.F = localToolApproval;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ChatScreenModalBottomSheetDestination.LocalToolApproval localToolApproval = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), localToolApproval) ? list : w44.b1(list, localToolApproval);
            default:
                List list2 = (List) obj;
                list2.getClass();
                return w44.b1(w44.J0(1, list2), localToolApproval);
        }
    }
}
