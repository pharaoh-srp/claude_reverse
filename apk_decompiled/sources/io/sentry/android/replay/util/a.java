package io.sentry.android.replay.util;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.lm6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Drawable {
    public static final int d = Color.argb(32, 255, 20, 20);
    public static final int e = Color.argb(FreeTypeConstants.FT_LOAD_PEDANTIC, 255, 20, 20);
    public final Paint a = new Paint(1);
    public final Rect b = new Rect();
    public final List c = lm6.E;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Paint paint = this.a;
        paint.setTextSize(32.0f);
        paint.setColor(-16777216);
        paint.setStrokeWidth(6.0f);
        for (Rect rect : this.c) {
            paint.setColor(d);
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            canvas.drawRect(rect, paint);
            paint.setColor(e);
            Paint.Style style2 = Paint.Style.STROKE;
            paint.setStyle(style2);
            canvas.drawRect(rect, paint);
            StringBuilder sb = new StringBuilder();
            sb.append(rect.left);
            sb.append('/');
            sb.append(rect.top);
            String string = sb.toString();
            int length = string.length();
            Rect rect2 = this.b;
            paint.getTextBounds(string, 0, length, rect2);
            float f = rect.left;
            float f2 = rect.top;
            paint.setColor(-1);
            paint.setStyle(style2);
            canvas.drawText(string, f, f2, paint);
            paint.setColor(-16777216);
            paint.setStyle(style);
            canvas.drawText(string, f, f2, paint);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(rect.right);
            sb2.append('/');
            sb2.append(rect.bottom);
            String string2 = sb2.toString();
            paint.getTextBounds(string2, 0, string2.length(), rect2);
            float fWidth = rect.right - rect2.width();
            float fHeight = rect.bottom + rect2.height();
            paint.setColor(-1);
            paint.setStyle(style2);
            canvas.drawText(string2, fWidth, fHeight, paint);
            paint.setColor(-16777216);
            paint.setStyle(style);
            canvas.drawText(string2, fWidth, fHeight, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
