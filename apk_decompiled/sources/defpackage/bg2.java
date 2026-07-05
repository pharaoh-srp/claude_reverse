package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class bg2 {
    public static final z31 c = new z31(2);
    public final dd5 a;
    public final int b;

    public bg2(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        this.a = new dd5(spannableStringBuilder, alignment, null, null, f, 0, i, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z, z ? i3 : -16777216, Integer.MIN_VALUE, MTTypesetterKt.kLineSkipLimitMultiplier, 0);
        this.b = i4;
    }
}
