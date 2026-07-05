package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class ea8 extends mqk {
    public final CharSequence F;
    public final TextPaint G;

    public ea8(CharSequence charSequence, TextPaint textPaint) {
        this.F = charSequence;
        this.G = textPaint;
    }

    @Override // defpackage.mqk
    public final int g(int i) {
        CharSequence charSequence = this.F;
        return this.G.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.mqk
    public final int i(int i) {
        CharSequence charSequence = this.F;
        return this.G.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
