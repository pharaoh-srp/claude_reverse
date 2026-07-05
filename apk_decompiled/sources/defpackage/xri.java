package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class xri extends ori {
    public static final PorterDuff.Mode N = PorterDuff.Mode.SRC_IN;
    public vri F;
    public PorterDuffColorFilter G;
    public ColorFilter H;
    public boolean I;
    public boolean J;
    public final float[] K;
    public final Matrix L;
    public final Rect M;

    public xri() {
        this.J = true;
        this.K = new float[9];
        this.L = new Matrix();
        this.M = new Rect();
        vri vriVar = new vri();
        vriVar.c = null;
        vriVar.d = N;
        vriVar.b = new uri();
        this.F = vriVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.E;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.M;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.H;
        if (colorFilter == null) {
            colorFilter = this.G;
        }
        Matrix matrix = this.L;
        canvas.getMatrix(matrix);
        float[] fArr = this.K;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != MTTypesetterKt.kLineSkipLimitMultiplier || fAbs4 != MTTypesetterKt.kLineSkipLimitMultiplier) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM, iWidth);
        int iMin2 = Math.min(FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), MTTypesetterKt.kLineSkipLimitMultiplier);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        vri vriVar = this.F;
        Bitmap bitmap = vriVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != vriVar.f.getHeight()) {
            vriVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            vriVar.k = true;
        }
        boolean z = this.J;
        vri vriVar2 = this.F;
        if (!z) {
            vriVar2.f.eraseColor(0);
            Canvas canvas2 = new Canvas(vriVar2.f);
            uri uriVar = vriVar2.b;
            uriVar.a(uriVar.g, uri.p, canvas2, iMin, iMin2);
        } else if (vriVar2.k || vriVar2.g != vriVar2.c || vriVar2.h != vriVar2.d || vriVar2.j != vriVar2.e || vriVar2.i != vriVar2.b.getRootAlpha()) {
            vri vriVar3 = this.F;
            vriVar3.f.eraseColor(0);
            Canvas canvas3 = new Canvas(vriVar3.f);
            uri uriVar2 = vriVar3.b;
            uriVar2.a(uriVar2.g, uri.p, canvas3, iMin, iMin2);
            vri vriVar4 = this.F;
            vriVar4.g = vriVar4.c;
            vriVar4.h = vriVar4.d;
            vriVar4.i = vriVar4.b.getRootAlpha();
            vriVar4.j = vriVar4.e;
            vriVar4.k = false;
        }
        vri vriVar5 = this.F;
        if (vriVar5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (vriVar5.l == null) {
                Paint paint2 = new Paint();
                vriVar5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            vriVar5.l.setAlpha(vriVar5.b.getRootAlpha());
            vriVar5.l.setColorFilter(colorFilter);
            paint = vriVar5.l;
        }
        canvas.drawBitmap(vriVar5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.E;
        return drawable != null ? drawable.getAlpha() : this.F.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.E;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.F.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.E;
        return drawable != null ? drawable.getColorFilter() : this.H;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.E != null) {
            return new wri(this.E.getConstantState());
        }
        this.F.a = getChangingConfigurations();
        return this.F;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.E;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.F.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.E;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.F.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.E;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        vri vriVar = this.F;
        vriVar.b = new uri();
        TypedArray typedArrayO0 = xn5.o0(resources, theme, attributeSet, ne5.a);
        vri vriVar2 = this.F;
        uri uriVar = vriVar2.b;
        int i5 = !xn5.k0(xmlPullParser, "tintMode") ? -1 : typedArrayO0.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i6 = 3;
        if (i5 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i5 != 5) {
            if (i5 != 9) {
                switch (i5) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        vriVar2.d = mode;
        ColorStateList colorStateListF0 = xn5.f0(typedArrayO0, xmlPullParser, theme);
        if (colorStateListF0 != null) {
            vriVar2.c = colorStateListF0;
        }
        boolean z = vriVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayO0.getBoolean(5, z);
        }
        vriVar2.e = z;
        float f = uriVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayO0.getFloat(7, f);
        }
        uriVar.j = f;
        float f2 = uriVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayO0.getFloat(8, f2);
        }
        uriVar.k = f2;
        if (uriVar.j <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            throw new XmlPullParserException(typedArrayO0.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            throw new XmlPullParserException(typedArrayO0.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        uriVar.h = typedArrayO0.getDimension(3, uriVar.h);
        int i7 = 2;
        float dimension = typedArrayO0.getDimension(2, uriVar.i);
        uriVar.i = dimension;
        if (uriVar.h <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            throw new XmlPullParserException(typedArrayO0.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            throw new XmlPullParserException(typedArrayO0.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = uriVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayO0.getFloat(4, alpha);
        }
        uriVar.setAlpha(alpha);
        String string = typedArrayO0.getString(0);
        if (string != null) {
            uriVar.m = string;
            uriVar.o.put(string, uriVar);
        }
        typedArrayO0.recycle();
        vriVar.a = getChangingConfigurations();
        int i8 = 1;
        vriVar.k = true;
        vri vriVar3 = this.F;
        uri uriVar2 = vriVar3.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        rri rriVar = uriVar2.g;
        bp0 bp0Var = uriVar2.o;
        arrayDeque.push(rriVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != i8 && (xmlPullParser.getDepth() >= depth || eventType != i6)) {
            if (eventType == i7) {
                String name = xmlPullParser.getName();
                rri rriVar2 = (rri) arrayDeque.peek();
                i = depth;
                if ("path".equals(name)) {
                    qri qriVar = new qri();
                    qriVar.e = MTTypesetterKt.kLineSkipLimitMultiplier;
                    qriVar.g = 1.0f;
                    qriVar.h = 1.0f;
                    qriVar.i = MTTypesetterKt.kLineSkipLimitMultiplier;
                    qriVar.j = 1.0f;
                    qriVar.k = MTTypesetterKt.kLineSkipLimitMultiplier;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    qriVar.l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    qriVar.m = join;
                    qriVar.n = 4.0f;
                    TypedArray typedArrayO02 = xn5.o0(resources, theme, attributeSet, ne5.c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayO02.getString(0);
                        if (string2 != null) {
                            qriVar.b = string2;
                        }
                        String string3 = typedArrayO02.getString(2);
                        if (string3 != null) {
                            qriVar.a = ssj.h(string3);
                        }
                        qriVar.f = xn5.g0(typedArrayO02, xmlPullParser, theme, "fillColor", 1);
                        float f3 = qriVar.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f3 = typedArrayO02.getFloat(12, f3);
                        }
                        qriVar.h = f3;
                        int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayO02.getInt(8, -1) : -1;
                        qriVar.l = i9 != 0 ? i9 != 1 ? i9 != 2 ? qriVar.l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayO02.getInt(9, -1) : -1;
                        qriVar.m = i10 != 0 ? i10 != 1 ? i10 != 2 ? qriVar.m : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f4 = qriVar.n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f4 = typedArrayO02.getFloat(10, f4);
                        }
                        qriVar.n = f4;
                        qriVar.d = xn5.g0(typedArrayO02, xmlPullParser, theme, "strokeColor", 3);
                        float f5 = qriVar.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f5 = typedArrayO02.getFloat(11, f5);
                        }
                        qriVar.g = f5;
                        float f6 = qriVar.e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f6 = typedArrayO02.getFloat(4, f6);
                        }
                        qriVar.e = f6;
                        float f7 = qriVar.j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f7 = typedArrayO02.getFloat(6, f7);
                        }
                        qriVar.j = f7;
                        float f8 = qriVar.k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f8 = typedArrayO02.getFloat(7, f8);
                        }
                        qriVar.k = f8;
                        float f9 = qriVar.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f9 = typedArrayO02.getFloat(5, f9);
                        }
                        qriVar.i = f9;
                        int i11 = qriVar.c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i11 = typedArrayO02.getInt(13, i11);
                        }
                        qriVar.c = i11;
                    }
                    typedArrayO02.recycle();
                    rriVar2.b.add(qriVar);
                    if (qriVar.getPathName() != null) {
                        bp0Var.put(qriVar.getPathName(), qriVar);
                    }
                    vriVar3.a = vriVar3.a;
                    i4 = 1;
                    z2 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        pri priVar = new pri();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayO03 = xn5.o0(resources, theme, attributeSet, ne5.d);
                            String string4 = typedArrayO03.getString(0);
                            if (string4 != null) {
                                priVar.b = string4;
                            }
                            String string5 = typedArrayO03.getString(1);
                            if (string5 != null) {
                                priVar.a = ssj.h(string5);
                            }
                            priVar.c = !xn5.k0(xmlPullParser, "fillType") ? 0 : typedArrayO03.getInt(2, 0);
                            typedArrayO03.recycle();
                        }
                        rriVar2.b.add(priVar);
                        if (priVar.getPathName() != null) {
                            bp0Var.put(priVar.getPathName(), priVar);
                        }
                        vriVar3.a = vriVar3.a;
                    } else if ("group".equals(name)) {
                        rri rriVar3 = new rri();
                        TypedArray typedArrayO04 = xn5.o0(resources, theme, attributeSet, ne5.b);
                        float f10 = rriVar3.c;
                        if (xn5.k0(xmlPullParser, "rotation")) {
                            f10 = typedArrayO04.getFloat(5, f10);
                        }
                        rriVar3.c = f10;
                        i4 = 1;
                        rriVar3.d = typedArrayO04.getFloat(1, rriVar3.d);
                        rriVar3.e = typedArrayO04.getFloat(2, rriVar3.e);
                        float f11 = rriVar3.f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f11 = typedArrayO04.getFloat(3, f11);
                        }
                        rriVar3.f = f11;
                        float f12 = rriVar3.g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f12 = typedArrayO04.getFloat(4, f12);
                        }
                        rriVar3.g = f12;
                        float f13 = rriVar3.h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f13 = typedArrayO04.getFloat(6, f13);
                        }
                        rriVar3.h = f13;
                        float f14 = rriVar3.i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f14 = typedArrayO04.getFloat(7, f14);
                        }
                        rriVar3.i = f14;
                        String string6 = typedArrayO04.getString(0);
                        if (string6 != null) {
                            rriVar3.k = string6;
                        }
                        rriVar3.c();
                        typedArrayO04.recycle();
                        rriVar2.b.add(rriVar3);
                        arrayDeque.push(rriVar3);
                        if (rriVar3.getGroupName() != null) {
                            bp0Var.put(rriVar3.getGroupName(), rriVar3);
                        }
                        vriVar3.a = vriVar3.a;
                    }
                    i4 = 1;
                }
                i3 = i4;
                i2 = 3;
            } else {
                i = depth;
                i2 = i6;
                i3 = 1;
                if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i6 = i2;
            i8 = i3;
            depth = i;
            i7 = 2;
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
        this.G = a(vriVar.c, vriVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.E;
        return drawable != null ? drawable.isAutoMirrored() : this.F.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.E;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        vri vriVar = this.F;
        if (vriVar == null) {
            return false;
        }
        uri uriVar = vriVar.b;
        if (uriVar.n == null) {
            uriVar.n = Boolean.valueOf(uriVar.g.a());
        }
        if (uriVar.n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.F.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.I && super.mutate() == this) {
            vri vriVar = this.F;
            vri vriVar2 = new vri();
            vriVar2.c = null;
            vriVar2.d = N;
            if (vriVar != null) {
                vriVar2.a = vriVar.a;
                uri uriVar = new uri(vriVar.b);
                vriVar2.b = uriVar;
                if (vriVar.b.e != null) {
                    uriVar.e = new Paint(vriVar.b.e);
                }
                if (vriVar.b.d != null) {
                    vriVar2.b.d = new Paint(vriVar.b.d);
                }
                vriVar2.c = vriVar.c;
                vriVar2.d = vriVar.d;
                vriVar2.e = vriVar.e;
            }
            this.F = vriVar2;
            this.I = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.E;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        vri vriVar = this.F;
        ColorStateList colorStateList = vriVar.c;
        if (colorStateList == null || (mode = vriVar.d) == null) {
            z = false;
        } else {
            this.G = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        uri uriVar = vriVar.b;
        if (uriVar.n == null) {
            uriVar.n = Boolean.valueOf(uriVar.g.a());
        }
        if (uriVar.n.booleanValue()) {
            boolean zB = vriVar.b.g.b(iArr);
            vriVar.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.F.b.getRootAlpha() != i) {
            this.F.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.F.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.H = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        vri vriVar = this.F;
        if (vriVar.c != colorStateList) {
            vriVar.c = colorStateList;
            this.G = a(colorStateList, vriVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        vri vriVar = this.F;
        if (vriVar.d != mode) {
            vriVar.d = mode;
            this.G = a(vriVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.E;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public xri(vri vriVar) {
        this.J = true;
        this.K = new float[9];
        this.L = new Matrix();
        this.M = new Rect();
        this.F = vriVar;
        this.G = a(vriVar.c, vriVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
