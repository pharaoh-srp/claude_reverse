package defpackage;

import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class r23 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ChatScreenModalBottomSheetDestination.PreviewBlob F;

    public /* synthetic */ r23(ChatScreenModalBottomSheetDestination.PreviewBlob previewBlob, int i) {
        this.E = i;
        this.F = previewBlob;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ChatScreenModalBottomSheetDestination.PreviewBlob previewBlob = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), previewBlob) ? list : w44.b1(list, previewBlob);
            default:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), previewBlob) ? list2 : w44.b1(list2, previewBlob);
        }
    }
}
