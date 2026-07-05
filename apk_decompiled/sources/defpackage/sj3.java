package defpackage;

import com.anthropic.claude.app.ClaudeAppOverlay;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class sj3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ClaudeAppOverlay.GroveNoticeBottomSheet F;

    public /* synthetic */ sj3(ClaudeAppOverlay.GroveNoticeBottomSheet groveNoticeBottomSheet, int i) {
        this.E = i;
        this.F = groveNoticeBottomSheet;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ClaudeAppOverlay.GroveNoticeBottomSheet groveNoticeBottomSheet = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), groveNoticeBottomSheet) ? list : w44.b1(list, groveNoticeBottomSheet);
            default:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), groveNoticeBottomSheet) ? list2 : w44.b1(list2, groveNoticeBottomSheet);
        }
    }
}
