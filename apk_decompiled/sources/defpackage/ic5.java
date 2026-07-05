package defpackage;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ic5 extends Drawable implements Drawable.Callback, Animatable {
    public final /* synthetic */ int E;
    public final int F;
    public final boolean G;
    public final ArrayList H;
    public final int I;
    public final int J;
    public long K;
    public int L;
    public int M;
    public Drawable N;
    public final Drawable O;
    public final Enum P;

    public ic5(Drawable drawable, j6f j6fVar, int i, boolean z) {
        this.E = 1;
        this.P = j6fVar;
        this.F = i;
        this.G = z;
        this.H = new ArrayList();
        this.I = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null);
        this.J = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null);
        this.L = 255;
        this.N = null;
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        this.O = drawableMutate;
        if (i <= 0) {
            sz6.p("durationMillis must be > 0.");
            throw null;
        }
        Drawable drawable2 = this.N;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        if (drawableMutate == null) {
            return;
        }
        drawableMutate.setCallback(this);
    }

    public final int a(Integer num, Integer num2) {
        switch (this.E) {
            case 0:
                if (num != null && num.intValue() == -1) {
                    return -1;
                }
                if (num2 != null && num2.intValue() == -1) {
                    return -1;
                }
                return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
            default:
                if (num != null && num.intValue() == -1) {
                    return -1;
                }
                if (num2 != null && num2.intValue() == -1) {
                    return -1;
                }
                return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
    }

    public final void b() {
        int i = this.E;
        int i2 = 0;
        ArrayList arrayList = this.H;
        switch (i) {
            case 0:
                this.M = 2;
                this.N = null;
                int size = arrayList.size();
                while (i2 < size) {
                    ColorStateList colorStateList = ((xva) arrayList.get(i2)).b.S;
                    if (colorStateList != null) {
                        setTintList(colorStateList);
                    }
                    i2++;
                }
                break;
            default:
                this.M = 2;
                this.N = null;
                int size2 = arrayList.size();
                while (i2 < size2) {
                    ColorStateList colorStateList2 = ((xva) arrayList.get(i2)).b.S;
                    if (colorStateList2 != null) {
                        setTintList(colorStateList2);
                    }
                    i2++;
                }
                break;
        }
    }

    public void c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dE = bwk.e(intrinsicWidth, intrinsicHeight, iWidth, iHeight, (j6f) this.P);
        int iK = mwa.K((((double) iWidth) - (((double) intrinsicWidth) * dE)) / 2.0d);
        int iK2 = mwa.K((((double) iHeight) - (dE * ((double) intrinsicHeight))) / 2.0d);
        drawable.setBounds(rect.left + iK, rect.top + iK2, rect.right - iK, rect.bottom - iK2);
    }

    public void d(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dK = c0l.k(intrinsicWidth, intrinsicHeight, iWidth, iHeight, (k6f) this.P, j8g.c);
        int iK = mwa.K((((double) iWidth) - (((double) intrinsicWidth) * dK)) / 2.0d);
        int iK2 = mwa.K((((double) iHeight) - (dK * ((double) intrinsicHeight))) / 2.0d);
        drawable.setBounds(rect.left + iK, rect.top + iK2, rect.right - iK, rect.bottom - iK2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        int iSave;
        Drawable drawable;
        Drawable drawable2;
        int i = this.E;
        boolean z2 = this.G;
        int i2 = this.F;
        Drawable drawable3 = this.O;
        switch (i) {
            case 0:
                int i3 = this.M;
                if (i3 == 0) {
                    Drawable drawable4 = this.N;
                    if (drawable4 != null) {
                        drawable4.setAlpha(this.L);
                        iSave = canvas.save();
                        try {
                            drawable4.draw(canvas);
                            return;
                        } finally {
                        }
                    }
                    return;
                }
                if (i3 == 2) {
                    if (drawable3 != null) {
                        drawable3.setAlpha(this.L);
                        iSave = canvas.save();
                        try {
                            drawable3.draw(canvas);
                            return;
                        } finally {
                        }
                    }
                    return;
                }
                double dUptimeMillis = (SystemClock.uptimeMillis() - this.K) / ((double) i2);
                double dC0 = wd6.c0(dUptimeMillis, 0.0d, 1.0d);
                int i4 = this.L;
                int i5 = (int) (dC0 * ((double) i4));
                if (z2) {
                    i4 -= i5;
                }
                z = dUptimeMillis >= 1.0d;
                if (!z && (drawable = this.N) != null) {
                    drawable.setAlpha(i4);
                    iSave = canvas.save();
                    try {
                        drawable.draw(canvas);
                    } finally {
                    }
                }
                if (drawable3 != null) {
                    drawable3.setAlpha(i5);
                    iSave = canvas.save();
                    try {
                        drawable3.draw(canvas);
                    } finally {
                    }
                }
                if (z) {
                    b();
                    return;
                } else {
                    invalidateSelf();
                    return;
                }
            default:
                int i6 = this.M;
                if (i6 == 0) {
                    Drawable drawable5 = this.N;
                    if (drawable5 != null) {
                        drawable5.setAlpha(this.L);
                        iSave = canvas.save();
                        try {
                            drawable5.draw(canvas);
                            return;
                        } finally {
                        }
                    }
                    return;
                }
                if (i6 == 2) {
                    if (drawable3 != null) {
                        drawable3.setAlpha(this.L);
                        iSave = canvas.save();
                        try {
                            drawable3.draw(canvas);
                            return;
                        } finally {
                        }
                    }
                    return;
                }
                double dUptimeMillis2 = (SystemClock.uptimeMillis() - this.K) / ((double) i2);
                double dC02 = wd6.c0(dUptimeMillis2, 0.0d, 1.0d);
                int i7 = this.L;
                int i8 = (int) (dC02 * ((double) i7));
                if (z2) {
                    i7 -= i8;
                }
                z = dUptimeMillis2 >= 1.0d;
                if (!z && (drawable2 = this.N) != null) {
                    drawable2.setAlpha(i7);
                    iSave = canvas.save();
                    try {
                        drawable2.draw(canvas);
                    } finally {
                    }
                }
                if (drawable3 != null) {
                    drawable3.setAlpha(i8);
                    iSave = canvas.save();
                    try {
                        drawable3.draw(canvas);
                    } finally {
                    }
                }
                if (z) {
                    b();
                    return;
                } else {
                    invalidateSelf();
                    return;
                }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        switch (this.E) {
        }
        return this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        ColorFilter colorFilter2;
        int i = this.E;
        Drawable drawable = this.O;
        switch (i) {
            case 0:
                int i2 = this.M;
                if (i2 == 0) {
                    Drawable drawable2 = this.N;
                    if (drawable2 != null) {
                        return drawable2.getColorFilter();
                    }
                    return null;
                }
                if (i2 != 1) {
                    if (i2 == 2 && drawable != null) {
                        return drawable.getColorFilter();
                    }
                    return null;
                }
                if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
                    return colorFilter;
                }
                Drawable drawable3 = this.N;
                if (drawable3 != null) {
                    return drawable3.getColorFilter();
                }
                return null;
            default:
                int i3 = this.M;
                if (i3 == 0) {
                    Drawable drawable4 = this.N;
                    if (drawable4 != null) {
                        return drawable4.getColorFilter();
                    }
                    return null;
                }
                if (i3 != 1) {
                    if (i3 == 2 && drawable != null) {
                        return drawable.getColorFilter();
                    }
                    return null;
                }
                if (drawable != null && (colorFilter2 = drawable.getColorFilter()) != null) {
                    return colorFilter2;
                }
                Drawable drawable5 = this.N;
                if (drawable5 != null) {
                    return drawable5.getColorFilter();
                }
                return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.E) {
        }
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.E) {
        }
        return this.I;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int i = this.E;
        Drawable drawable = this.O;
        switch (i) {
            case 0:
                Drawable drawable2 = this.N;
                int i2 = this.M;
                if (i2 != 0) {
                    if (i2 != 2) {
                        if (drawable2 == null || drawable == null) {
                            if (drawable2 == null) {
                                if (drawable != null) {
                                }
                            }
                        }
                    } else if (drawable != null) {
                    }
                } else if (drawable2 != null) {
                }
                break;
            default:
                Drawable drawable3 = this.N;
                int i3 = this.M;
                if (i3 != 0) {
                    if (i3 != 2) {
                        if (drawable3 == null || drawable == null) {
                            if (drawable3 == null) {
                                if (drawable != null) {
                                }
                            }
                        }
                    } else if (drawable != null) {
                    }
                } else if (drawable3 != null) {
                }
                break;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.E) {
            case 0:
                invalidateSelf();
                break;
            default:
                invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        switch (this.E) {
            case 0:
                if (this.M == 1) {
                }
                break;
            default:
                if (this.M == 1) {
                }
                break;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        switch (this.E) {
            case 0:
                Drawable drawable = this.N;
                if (!(drawable != null ? drawable.isStateful() : false)) {
                    Drawable drawable2 = this.O;
                    if (!(drawable2 != null ? drawable2.isStateful() : false)) {
                        return false;
                    }
                }
                return true;
            default:
                return super.isStateful();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = this.E;
        Drawable drawable = this.O;
        switch (i) {
            case 0:
                Drawable drawable2 = this.N;
                if (drawable2 != null) {
                    d(drawable2, rect);
                }
                if (drawable != null) {
                    d(drawable, rect);
                }
                break;
            default:
                Drawable drawable3 = this.N;
                if (drawable3 != null) {
                    c(drawable3, rect);
                }
                if (drawable != null) {
                    c(drawable, rect);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        int i2 = this.E;
        Drawable drawable = this.O;
        switch (i2) {
            case 0:
                Drawable drawable2 = this.N;
                boolean level = drawable2 != null ? drawable2.setLevel(i) : false;
                boolean level2 = drawable != null ? drawable.setLevel(i) : false;
                if (!level && !level2) {
                    break;
                }
                break;
            default:
                Drawable drawable3 = this.N;
                boolean level3 = drawable3 != null ? drawable3.setLevel(i) : false;
                boolean level4 = drawable != null ? drawable.setLevel(i) : false;
                if (!level3 && !level4) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i = this.E;
        Drawable drawable = this.O;
        switch (i) {
            case 0:
                Drawable drawable2 = this.N;
                boolean state = drawable2 != null ? drawable2.setState(iArr) : false;
                boolean state2 = drawable != null ? drawable.setState(iArr) : false;
                if (!state && !state2) {
                    break;
                }
                break;
            default:
                Drawable drawable3 = this.N;
                boolean state3 = drawable3 != null ? drawable3.setState(iArr) : false;
                boolean state4 = drawable != null ? drawable.setState(iArr) : false;
                if (!state3 && !state4) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.E) {
            case 0:
                scheduleSelf(runnable, j);
                break;
            default:
                scheduleSelf(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.E) {
            case 0:
                if (i >= 0 && i < 256) {
                    this.L = i;
                } else {
                    mr9.q(grc.p(i, "Invalid alpha: "));
                }
                break;
            default:
                if (i >= 0 && i < 256) {
                    this.L = i;
                } else {
                    mr9.q(grc.p(i, "Invalid alpha: "));
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i = this.E;
        Drawable drawable = this.O;
        switch (i) {
            case 0:
                Drawable drawable2 = this.N;
                if (drawable2 != null) {
                    drawable2.setColorFilter(colorFilter);
                }
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                }
                break;
            default:
                Drawable drawable3 = this.N;
                if (drawable3 != null) {
                    drawable3.setColorFilter(colorFilter);
                }
                if (drawable != null) {
                    drawable.setColorFilter(colorFilter);
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        int i2 = this.E;
        Drawable drawable = this.O;
        switch (i2) {
            case 0:
                Drawable drawable2 = this.N;
                if (drawable2 != null) {
                    drawable2.setTint(i);
                }
                if (drawable != null) {
                    drawable.setTint(i);
                }
                break;
            default:
                Drawable drawable3 = this.N;
                if (drawable3 != null) {
                    drawable3.setTint(i);
                }
                if (drawable != null) {
                    drawable.setTint(i);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        int i = this.E;
        Drawable drawable = this.O;
        switch (i) {
            case 0:
                Drawable drawable2 = this.N;
                if (drawable2 != null) {
                    drawable2.setTintBlendMode(blendMode);
                }
                if (drawable != null) {
                    drawable.setTintBlendMode(blendMode);
                }
                break;
            default:
                Drawable drawable3 = this.N;
                if (drawable3 != null) {
                    drawable3.setTintBlendMode(blendMode);
                }
                if (drawable != null) {
                    drawable.setTintBlendMode(blendMode);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        int i = this.E;
        Drawable drawable = this.O;
        switch (i) {
            case 0:
                Drawable drawable2 = this.N;
                if (drawable2 != null) {
                    drawable2.setTintList(colorStateList);
                }
                if (drawable != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
            default:
                Drawable drawable3 = this.N;
                if (drawable3 != null) {
                    drawable3.setTintList(colorStateList);
                }
                if (drawable != null) {
                    drawable.setTintList(colorStateList);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        int i = this.E;
        Drawable drawable = this.O;
        switch (i) {
            case 0:
                Drawable drawable2 = this.N;
                if (drawable2 != null) {
                    drawable2.setTintMode(mode);
                }
                if (drawable != null) {
                    drawable.setTintMode(mode);
                }
                break;
            default:
                Drawable drawable3 = this.N;
                if (drawable3 != null) {
                    drawable3.setTintMode(mode);
                }
                if (drawable != null) {
                    drawable.setTintMode(mode);
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        switch (this.E) {
            case 0:
                boolean visible = super.setVisible(z, z2);
                Drawable drawable = this.N;
                boolean z3 = drawable != null && drawable.setVisible(z, z2);
                Drawable drawable2 = this.O;
                return visible || z3 || (drawable2 != null && drawable2.setVisible(z, z2));
            default:
                return super.setVisible(z, z2);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animatable animatable;
        int i = this.E;
        int i2 = 0;
        ArrayList arrayList = this.H;
        Object obj = this.O;
        switch (i) {
            case 0:
                Object obj2 = this.N;
                Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
                if (animatable2 != null) {
                    animatable2.start();
                }
                animatable = obj instanceof Animatable ? (Animatable) obj : null;
                if (animatable != null) {
                    animatable.start();
                }
                if (this.M == 0) {
                    this.M = 1;
                    this.K = SystemClock.uptimeMillis();
                    int size = arrayList.size();
                    while (i2 < size) {
                        ((xva) arrayList.get(i2)).a(this);
                        i2++;
                    }
                    invalidateSelf();
                    break;
                }
                break;
            default:
                Object obj3 = this.N;
                Animatable animatable3 = obj3 instanceof Animatable ? (Animatable) obj3 : null;
                if (animatable3 != null) {
                    animatable3.start();
                }
                animatable = obj instanceof Animatable ? (Animatable) obj : null;
                if (animatable != null) {
                    animatable.start();
                }
                if (this.M == 0) {
                    this.M = 1;
                    this.K = SystemClock.uptimeMillis();
                    int size2 = arrayList.size();
                    while (i2 < size2) {
                        ((xva) arrayList.get(i2)).a(this);
                        i2++;
                    }
                    invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Animatable animatable;
        int i = this.E;
        Object obj = this.O;
        switch (i) {
            case 0:
                Object obj2 = this.N;
                Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
                if (animatable2 != null) {
                    animatable2.stop();
                }
                animatable = obj instanceof Animatable ? (Animatable) obj : null;
                if (animatable != null) {
                    animatable.stop();
                }
                if (this.M != 2) {
                    b();
                }
                break;
            default:
                Object obj3 = this.N;
                Animatable animatable3 = obj3 instanceof Animatable ? (Animatable) obj3 : null;
                if (animatable3 != null) {
                    animatable3.stop();
                }
                animatable = obj instanceof Animatable ? (Animatable) obj : null;
                if (animatable != null) {
                    animatable.stop();
                }
                if (this.M != 2) {
                    b();
                }
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.E) {
            case 0:
                unscheduleSelf(runnable);
                break;
            default:
                unscheduleSelf(runnable);
                break;
        }
    }

    public ic5(k6f k6fVar, int i, boolean z) {
        this.E = 0;
        this.P = k6fVar;
        this.F = i;
        this.G = z;
        this.H = new ArrayList();
        this.I = a(null, null);
        this.J = a(null, null);
        this.L = 255;
        this.N = null;
        this.O = null;
        if (i > 0) {
            return;
        }
        sz6.p("durationMillis must be > 0.");
        throw null;
    }
}
