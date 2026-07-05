package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class cwa extends Drawable implements i1g {
    public static final Paint a0;
    public bwa E;
    public final z0g[] F;
    public final z0g[] G;
    public final BitSet H;
    public boolean I;
    public final Matrix J;
    public final Path K;
    public final Path L;
    public final RectF M;
    public final RectF N;
    public final Region O;
    public final Region P;
    public f0g Q;
    public final Paint R;
    public final Paint S;
    public final wzf T;
    public final ax5 U;
    public final o8b V;
    public PorterDuffColorFilter W;
    public PorterDuffColorFilter X;
    public final RectF Y;
    public final boolean Z;

    static {
        Paint paint = new Paint(1);
        a0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public cwa(bwa bwaVar) {
        this.F = new z0g[4];
        this.G = new z0g[4];
        this.H = new BitSet(8);
        this.J = new Matrix();
        this.K = new Path();
        this.L = new Path();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new Region();
        this.P = new Region();
        Paint paint = new Paint(1);
        this.R = paint;
        Paint paint2 = new Paint(1);
        this.S = paint2;
        this.T = new wzf();
        this.V = Looper.getMainLooper().getThread() == Thread.currentThread() ? g0g.a : new o8b();
        this.Y = new RectF();
        this.Z = true;
        this.E = bwaVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        g();
        f(getState());
        this.U = new ax5(20, this);
    }

    public final void a(RectF rectF, Path path) {
        bwa bwaVar = this.E;
        this.V.b(bwaVar.a, bwaVar.i, rectF, this.U, path);
        if (this.E.h != 1.0f) {
            Matrix matrix = this.J;
            matrix.reset();
            float f = this.E.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.Y, true);
    }

    public final int b(int i) {
        int i2;
        bwa bwaVar = this.E;
        float f = bwaVar.m + MTTypesetterKt.kLineSkipLimitMultiplier + bwaVar.l;
        mk6 mk6Var = bwaVar.b;
        if (mk6Var == null || !mk6Var.a || x54.d(i, 255) != mk6Var.d) {
            return i;
        }
        float fMin = (mk6Var.e <= MTTypesetterKt.kLineSkipLimitMultiplier || f <= MTTypesetterKt.kLineSkipLimitMultiplier) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iS = cmk.s(fMin, x54.d(i, 255), mk6Var.b);
        if (fMin > MTTypesetterKt.kLineSkipLimitMultiplier && (i2 = mk6Var.c) != 0) {
            iS = x54.b(x54.d(i2, mk6.f), iS);
        }
        return x54.d(iS, iAlpha);
    }

    public final void c(Canvas canvas) {
        if (this.H.cardinality() > 0) {
            Log.w("cwa", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.E.o;
        Path path = this.K;
        wzf wzfVar = this.T;
        if (i != 0) {
            canvas.drawPath(path, (Paint) wzfVar.d);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            z0g z0gVar = this.F[i2];
            int i3 = this.E.n;
            Matrix matrix = z0g.b;
            z0gVar.a(matrix, wzfVar, i3, canvas);
            this.G[i2].a(matrix, wzfVar, this.E.n, canvas);
        }
        if (this.Z) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.E.o));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.E.o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, a0);
            canvas.translate(iSin, iCos);
        }
    }

    public final RectF d() {
        Rect bounds = getBounds();
        RectF rectF = this.M;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.W;
        Paint paint = this.R;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.E.k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.X;
        Paint paint2 = this.S;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.E.j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.E.k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.I;
        RectF rectF = this.N;
        Path path = this.L;
        Path path2 = this.K;
        if (z) {
            float f = -(e() ? paint2.getStrokeWidth() / 2.0f : MTTypesetterKt.kLineSkipLimitMultiplier);
            f0g f0gVar = this.E.a;
            g81 g81VarD = f0gVar.d();
            s35 dfVar = f0gVar.e;
            if (!(dfVar instanceof dee)) {
                dfVar = new df(f, dfVar);
            }
            g81VarD.e = dfVar;
            s35 dfVar2 = f0gVar.f;
            if (!(dfVar2 instanceof dee)) {
                dfVar2 = new df(f, dfVar2);
            }
            g81VarD.f = dfVar2;
            s35 dfVar3 = f0gVar.h;
            if (!(dfVar3 instanceof dee)) {
                dfVar3 = new df(f, dfVar3);
            }
            g81VarD.h = dfVar3;
            s35 dfVar4 = f0gVar.g;
            if (!(dfVar4 instanceof dee)) {
                dfVar4 = new df(f, dfVar4);
            }
            g81VarD.g = dfVar4;
            f0g f0gVarD = g81VarD.d();
            this.Q = f0gVarD;
            float f2 = this.E.i;
            rectF.set(d());
            float strokeWidth = e() ? paint2.getStrokeWidth() / 2.0f : MTTypesetterKt.kLineSkipLimitMultiplier;
            rectF.inset(strokeWidth, strokeWidth);
            this.V.b(f0gVarD, f2, rectF, null, path);
            a(d(), path2);
            this.I = false;
        }
        bwa bwaVar = this.E;
        bwaVar.getClass();
        if (bwaVar.n > 0 && !this.E.a.c(d()) && !path2.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas.translate((int) (((double) this.E.o) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.E.o)));
            if (this.Z) {
                RectF rectF2 = this.Y;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    sz6.j("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    return;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.E.n * 2) + ((int) rectF2.width()) + iWidth, (this.E.n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f3 = (getBounds().left - this.E.n) - iWidth;
                float f4 = (getBounds().top - this.E.n) - iHeight;
                canvas2.translate(-f3, -f4);
                c(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                c(canvas);
                canvas.restore();
            }
        }
        bwa bwaVar2 = this.E;
        Paint.Style style = bwaVar2.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            f0g f0gVar2 = bwaVar2.a;
            RectF rectFD = d();
            if (f0gVar2.c(rectFD)) {
                float fA = f0gVar2.f.a(rectFD) * this.E.i;
                canvas.drawRoundRect(rectFD, fA, fA, paint);
            } else {
                canvas.drawPath(path2, paint);
            }
        }
        if (e()) {
            f0g f0gVar3 = this.Q;
            rectF.set(d());
            float strokeWidth2 = e() ? paint2.getStrokeWidth() / 2.0f : MTTypesetterKt.kLineSkipLimitMultiplier;
            rectF.inset(strokeWidth2, strokeWidth2);
            if (f0gVar3.c(rectF)) {
                float fA2 = f0gVar3.f.a(rectF) * this.E.i;
                canvas.drawRoundRect(rectF, fA2, fA2, paint2);
            } else {
                canvas.drawPath(path, paint2);
            }
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final boolean e() {
        Paint.Style style = this.E.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.S.getStrokeWidth() > MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    public final boolean f(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.E.c == null || color2 == (colorForState2 = this.E.c.getColorForState(iArr, (color2 = (paint2 = this.R).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.E.d == null || color == (colorForState = this.E.d.getColorForState(iArr, (color = (paint = this.S).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean g() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.W;
        PorterDuffColorFilter porterDuffColorFilter3 = this.X;
        bwa bwaVar = this.E;
        ColorStateList colorStateList = bwaVar.e;
        PorterDuff.Mode mode = bwaVar.f;
        if (colorStateList == null || mode == null) {
            int color = this.R.getColor();
            int iB = b(color);
            porterDuffColorFilter = iB != color ? new PorterDuffColorFilter(iB, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.W = porterDuffColorFilter;
        this.E.getClass();
        this.X = null;
        this.E.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.W) && Objects.equals(porterDuffColorFilter3, this.X)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.E.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.E.getClass();
        if (this.E.a.c(d())) {
            outline.setRoundRect(getBounds(), this.E.a.e.a(d()) * this.E.i);
            return;
        }
        RectF rectFD = d();
        Path path = this.K;
        a(rectFD, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.E.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.O;
        region.set(bounds);
        RectF rectFD = d();
        Path path = this.K;
        a(rectFD, path);
        Region region2 = this.P;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h() {
        bwa bwaVar = this.E;
        float f = bwaVar.m + MTTypesetterKt.kLineSkipLimitMultiplier;
        bwaVar.n = (int) Math.ceil(0.75f * f);
        this.E.o = (int) Math.ceil(f * 0.25f);
        g();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.I = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.E.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.E.getClass();
        ColorStateList colorStateList2 = this.E.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.E.c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        bwa bwaVar = this.E;
        bwa bwaVar2 = new bwa();
        bwaVar2.c = null;
        bwaVar2.d = null;
        bwaVar2.e = null;
        bwaVar2.f = PorterDuff.Mode.SRC_IN;
        bwaVar2.g = null;
        bwaVar2.h = 1.0f;
        bwaVar2.i = 1.0f;
        bwaVar2.k = 255;
        bwaVar2.l = MTTypesetterKt.kLineSkipLimitMultiplier;
        bwaVar2.m = MTTypesetterKt.kLineSkipLimitMultiplier;
        bwaVar2.n = 0;
        bwaVar2.o = 0;
        bwaVar2.p = Paint.Style.FILL_AND_STROKE;
        bwaVar2.a = bwaVar.a;
        bwaVar2.b = bwaVar.b;
        bwaVar2.j = bwaVar.j;
        bwaVar2.c = bwaVar.c;
        bwaVar2.d = bwaVar.d;
        bwaVar2.f = bwaVar.f;
        bwaVar2.e = bwaVar.e;
        bwaVar2.k = bwaVar.k;
        bwaVar2.h = bwaVar.h;
        bwaVar2.o = bwaVar.o;
        bwaVar2.i = bwaVar.i;
        bwaVar2.l = bwaVar.l;
        bwaVar2.m = bwaVar.m;
        bwaVar2.n = bwaVar.n;
        bwaVar2.p = bwaVar.p;
        Rect rect = bwaVar.g;
        if (rect != null) {
            bwaVar2.g = new Rect(rect);
        }
        this.E = bwaVar2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.I = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = f(iArr) || g();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        bwa bwaVar = this.E;
        if (bwaVar.k != i) {
            bwaVar.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.E.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.i1g
    public final void setShapeAppearanceModel(f0g f0gVar) {
        this.E.a = f0gVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.E.e = colorStateList;
        g();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        bwa bwaVar = this.E;
        if (bwaVar.f != mode) {
            bwaVar.f = mode;
            g();
            super.invalidateSelf();
        }
    }

    public cwa(f0g f0gVar) {
        bwa bwaVar = new bwa();
        bwaVar.c = null;
        bwaVar.d = null;
        bwaVar.e = null;
        bwaVar.f = PorterDuff.Mode.SRC_IN;
        bwaVar.g = null;
        bwaVar.h = 1.0f;
        bwaVar.i = 1.0f;
        bwaVar.k = 255;
        bwaVar.l = MTTypesetterKt.kLineSkipLimitMultiplier;
        bwaVar.m = MTTypesetterKt.kLineSkipLimitMultiplier;
        bwaVar.n = 0;
        bwaVar.o = 0;
        bwaVar.p = Paint.Style.FILL_AND_STROKE;
        bwaVar.a = f0gVar;
        bwaVar.b = null;
        this(bwaVar);
    }
}
