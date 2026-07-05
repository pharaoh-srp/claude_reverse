package defpackage;

import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q23 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ChatScreenModalBottomSheetDestination.PreviewImage F;

    public /* synthetic */ q23(ChatScreenModalBottomSheetDestination.PreviewImage previewImage, int i) {
        this.E = i;
        this.F = previewImage;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ChatScreenModalBottomSheetDestination.PreviewImage previewImage = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), previewImage) ? list : w44.b1(list, previewImage);
            default:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), previewImage) ? list2 : w44.b1(list2, previewImage);
        }
    }
}
