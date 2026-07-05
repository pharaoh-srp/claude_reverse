package defpackage;

import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.textclassifier.TextSelection;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class l5d {
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* synthetic */ TextSelection.Request.Builder l(int i, int i2, CharSequence charSequence) {
        return new TextSelection.Request.Builder(charSequence, i, i2);
    }

    public static /* synthetic */ void p() {
    }
}
