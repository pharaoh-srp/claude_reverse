package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class f5 extends ClickableSpan {
    public final int E;
    public final i6 F;
    public final int G;

    public f5(int i, i6 i6Var, int i2) {
        this.E = i;
        this.F = i6Var;
        this.G = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.E);
        this.F.a.performAction(this.G, bundle);
    }
}
