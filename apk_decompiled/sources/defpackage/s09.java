package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class s09 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = bkh.a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fR0 = wd6.r0(layout, lineForOffset, paint) + wd6.q0(layout, lineForOffset, paint);
            if (fR0 == MTTypesetterKt.kLineSkipLimitMultiplier) {
                return;
            }
            canvas.getClass();
            canvas.translate(fR0, MTTypesetterKt.kLineSkipLimitMultiplier);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
