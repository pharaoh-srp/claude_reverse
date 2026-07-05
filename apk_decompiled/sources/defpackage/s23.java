package defpackage;

import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s23 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ChatScreenModalBottomSheetDestination.PreviewLink F;

    public /* synthetic */ s23(ChatScreenModalBottomSheetDestination.PreviewLink previewLink, int i) {
        this.E = i;
        this.F = previewLink;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ChatScreenModalBottomSheetDestination.PreviewLink previewLink = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), previewLink) ? list : w44.b1(list, previewLink);
            default:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), previewLink) ? list2 : w44.b1(list2, previewLink);
        }
    }
}
