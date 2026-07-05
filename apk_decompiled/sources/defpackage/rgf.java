package defpackage;

import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class rgf extends TextView {
    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (IllegalStateException unused) {
            CharSequence text = this.getText();
            Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
            if (spannable != null) {
                Selection.removeSelection(spannable);
            }
            return super.performLongClick();
        }
    }
}
