package defpackage;

import android.view.Window;

/* JADX INFO: loaded from: classes3.dex */
public final class ky7 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Window G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ky7(Window window, int i) {
        super(0);
        this.F = i;
        this.G = window;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        Window window = this.G;
        switch (i) {
            case 0:
                return "Disabling jankStats for window " + window;
            default:
                return "Resuming jankStats for window " + window;
        }
    }
}
