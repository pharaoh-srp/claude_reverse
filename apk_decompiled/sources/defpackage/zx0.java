package defpackage;

import com.anthropic.claude.mainactivity.AssistantOverlayActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zx0 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ jy0 F;

    public /* synthetic */ zx0(jy0 jy0Var, int i) {
        this.E = i;
        this.F = jy0Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        jy0 jy0Var = this.F;
        w86 w86Var = (w86) obj;
        switch (i) {
            case 0:
                int i2 = AssistantOverlayActivity.d0;
                w86Var.getClass();
                return new ny0(jy0Var, 0);
            default:
                int i3 = AssistantOverlayActivity.d0;
                w86Var.getClass();
                return new ny0(jy0Var, 1);
        }
    }
}
