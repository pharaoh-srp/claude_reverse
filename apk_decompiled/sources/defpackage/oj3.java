package defpackage;

import com.anthropic.claude.app.ClaudeAppOverlay;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oj3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ClaudeAppOverlay.UpgradeToProBottomSheet F;

    public /* synthetic */ oj3(ClaudeAppOverlay.UpgradeToProBottomSheet upgradeToProBottomSheet, int i) {
        this.E = i;
        this.F = upgradeToProBottomSheet;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ClaudeAppOverlay.UpgradeToProBottomSheet upgradeToProBottomSheet = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), upgradeToProBottomSheet) ? list : w44.b1(list, upgradeToProBottomSheet);
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), upgradeToProBottomSheet) ? list2 : w44.b1(list2, upgradeToProBottomSheet);
            case 2:
                List list3 = (List) obj;
                list3.getClass();
                return x44.r(w44.U0(list3), upgradeToProBottomSheet) ? list3 : w44.b1(list3, upgradeToProBottomSheet);
            case 3:
                List list4 = (List) obj;
                list4.getClass();
                return x44.r(w44.U0(list4), upgradeToProBottomSheet) ? list4 : w44.b1(list4, upgradeToProBottomSheet);
            default:
                List list5 = (List) obj;
                list5.getClass();
                return w44.b1(w44.J0(1, list5), upgradeToProBottomSheet);
        }
    }
}
