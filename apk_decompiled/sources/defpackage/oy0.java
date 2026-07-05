package defpackage;

import com.anthropic.claude.mainactivity.AssistantOverlayActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class oy0 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ AssistantOverlayActivity F;

    public /* synthetic */ oy0(AssistantOverlayActivity assistantOverlayActivity, int i) {
        this.E = i;
        this.F = assistantOverlayActivity;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        AssistantOverlayActivity assistantOverlayActivity = this.F;
        switch (i) {
            case 0:
                return eve.z(assistantOverlayActivity).a(jce.a.b(fk0.class), null, null);
            case 1:
                return eve.z(assistantOverlayActivity).a(jce.a.b(ql3.class), null, null);
            default:
                return eve.z(assistantOverlayActivity).a(jce.a.b(qi3.class), null, null);
        }
    }
}
