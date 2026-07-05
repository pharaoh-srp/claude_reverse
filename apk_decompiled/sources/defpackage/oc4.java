package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class oc4 extends ClickableSpan {
    public final o6a E;

    public oc4(o6a o6aVar) {
        this.E = o6aVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        o6a o6aVar = this.E;
        v6a v6aVarA = o6aVar.a();
        if (v6aVarA != null) {
            v6aVarA.a(o6aVar);
        }
    }
}
