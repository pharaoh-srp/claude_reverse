package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.agog.mathdisplay.render.MTTypesetterKt;
import io.sentry.b2;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fi0 {
    public final TextView a;
    public krh b;
    public krh c;
    public krh d;
    public krh e;
    public krh f;
    public krh g;
    public krh h;
    public final oi0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public fi0(TextView textView) {
        this.a = textView;
        this.i = new oi0(textView);
    }

    public static krh c(Context context, ch0 ch0Var, int i) {
        ColorStateList colorStateListG;
        synchronized (ch0Var) {
            colorStateListG = ch0Var.a.g(context, i);
        }
        if (colorStateListG == null) {
            return null;
        }
        krh krhVar = new krh();
        krhVar.d = true;
        krhVar.a = colorStateListG;
        return krhVar;
    }

    public final void a(Drawable drawable, krh krhVar) {
        if (drawable == null || krhVar == null) {
            return;
        }
        ch0.d(drawable, krhVar, this.a.getDrawableState());
    }

    public final void b() {
        krh krhVar = this.b;
        TextView textView = this.a;
        if (krhVar != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        krh krhVar = this.h;
        if (krhVar != null) {
            return krhVar.a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        krh krhVar = this.h;
        if (krhVar != null) {
            return krhVar.b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:226:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, t0e.v);
        lrb lrbVar = new lrb(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        m(context, lrbVar);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            di0.d(textView, string);
        }
        lrbVar.S();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        oi0 oi0Var = this.i;
        if (oi0Var.j()) {
            DisplayMetrics displayMetrics = oi0Var.j.getResources().getDisplayMetrics();
            oi0Var.k(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (oi0Var.h()) {
                oi0Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        oi0 oi0Var = this.i;
        if (oi0Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = oi0Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                oi0Var.f = oi0.b(iArrCopyOf);
                if (!oi0Var.i()) {
                    b2.g("None of the preset sizes is valid: ", Arrays.toString(iArr));
                    return;
                }
            } else {
                oi0Var.g = false;
            }
            if (oi0Var.h()) {
                oi0Var.a();
            }
        }
    }

    public final void j(int i) {
        oi0 oi0Var = this.i;
        if (oi0Var.j()) {
            if (i == 0) {
                oi0Var.a = 0;
                oi0Var.d = -1.0f;
                oi0Var.e = -1.0f;
                oi0Var.c = -1.0f;
                oi0Var.f = new int[0];
                oi0Var.b = false;
                return;
            }
            if (i != 1) {
                sz6.p(grc.p(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = oi0Var.j.getResources().getDisplayMetrics();
            oi0Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (oi0Var.h()) {
                oi0Var.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new krh();
        }
        krh krhVar = this.h;
        krhVar.a = colorStateList;
        krhVar.d = colorStateList != null;
        this.b = krhVar;
        this.c = krhVar;
        this.d = krhVar;
        this.e = krhVar;
        this.f = krhVar;
        this.g = krhVar;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new krh();
        }
        krh krhVar = this.h;
        krhVar.b = mode;
        krhVar.c = mode != null;
        this.b = krhVar;
        this.c = krhVar;
        this.d = krhVar;
        this.e = krhVar;
        this.f = krhVar;
        this.g = krhVar;
    }

    public final void m(Context context, lrb lrbVar) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) lrbVar.G;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceC = lrbVar.C(i5, this.j, new bi0(this, i6, i7, new WeakReference(this.a)));
                if (typefaceC != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceC;
                    } else {
                        this.l = ei0.a(Typeface.create(typefaceC, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = ei0.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
