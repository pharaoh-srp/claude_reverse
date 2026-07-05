package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mk6 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public mk6(Context context) {
        int color;
        int color2;
        int color3 = 0;
        boolean zH = amk.h(R.attr.elevationOverlayEnabled, context, false);
        TypedValue typedValueG = amk.g(context, R.attr.elevationOverlayColor);
        if (typedValueG != null) {
            int i = typedValueG.resourceId;
            color = i != 0 ? context.getColor(i) : typedValueG.data;
        } else {
            color = 0;
        }
        TypedValue typedValueG2 = amk.g(context, R.attr.elevationOverlayAccentColor);
        if (typedValueG2 != null) {
            int i2 = typedValueG2.resourceId;
            color2 = i2 != 0 ? context.getColor(i2) : typedValueG2.data;
        } else {
            color2 = 0;
        }
        TypedValue typedValueG3 = amk.g(context, R.attr.colorSurface);
        if (typedValueG3 != null) {
            int i3 = typedValueG3.resourceId;
            color3 = i3 != 0 ? context.getColor(i3) : typedValueG3.data;
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zH;
        this.b = color;
        this.c = color2;
        this.d = color3;
        this.e = f2;
    }
}
