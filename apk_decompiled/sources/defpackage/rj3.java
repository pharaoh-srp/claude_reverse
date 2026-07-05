package defpackage;

import com.anthropic.claude.app.ClaudeAppOverlay;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rj3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ClaudeAppOverlay.MemoryPreview F;

    public /* synthetic */ rj3(ClaudeAppOverlay.MemoryPreview memoryPreview, int i) {
        this.E = i;
        this.F = memoryPreview;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ClaudeAppOverlay.MemoryPreview memoryPreview = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return x44.r(w44.U0(list), memoryPreview) ? list : w44.b1(list, memoryPreview);
            default:
                List list2 = (List) obj;
                list2.getClass();
                return x44.r(w44.U0(list2), memoryPreview) ? list2 : w44.b1(list2, memoryPreview);
        }
    }
}
