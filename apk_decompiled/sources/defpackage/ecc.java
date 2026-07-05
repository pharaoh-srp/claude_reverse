package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ecc {
    public static final Matrix B = new Matrix();
    public gh6 A;
    public Canvas a;
    public at b;
    public int c;
    public RectF d;
    public RectF e;
    public Rect f;
    public RectF g;
    public RectF h;
    public Rect i;
    public RectF j;
    public ps9 k;
    public Bitmap l;
    public Canvas m;
    public Rect n;
    public ps9 o;
    public Matrix p;
    public float[] q;
    public Bitmap r;
    public Bitmap s;
    public Canvas t;
    public Canvas u;
    public ps9 v;
    public BlurMaskFilter w;
    public float x = MTTypesetterKt.kLineSkipLimitMultiplier;
    public RenderNode y;
    public RenderNode z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF b(RectF rectF, gh6 gh6Var) {
        if (this.e == null) {
            this.e = new RectF();
        }
        if (this.g == null) {
            this.g = new RectF();
        }
        this.e.set(rectF);
        this.e.offsetTo(rectF.left + gh6Var.b, rectF.top + gh6Var.c);
        RectF rectF2 = this.e;
        float f = gh6Var.a;
        rectF2.inset(-f, -f);
        this.g.set(rectF);
        this.e.union(this.g);
        return this.e;
    }

    public final void c() {
        float f;
        ps9 ps9Var;
        if (this.a == null || this.b == null || this.q == null || this.d == null) {
            sz6.j("OffscreenBitmap: finish() call without matching start()");
            return;
        }
        int iF = sq6.F(this.c);
        if (iF == 0 || iF == 1) {
            this.a.restore();
        } else {
            if (iF != 2) {
                if (iF == 3) {
                    if (this.y == null) {
                        sz6.j("RenderNode is not ready; should've been initialized at start() time");
                        return;
                    }
                    int i = Build.VERSION.SDK_INT;
                    if (i < 29) {
                        sz6.j("RenderNode not supported but we chose it as render strategy");
                        return;
                    }
                    this.a.save();
                    Canvas canvas = this.a;
                    float[] fArr = this.q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.y.endRecording();
                    if (this.b.m()) {
                        Canvas canvas2 = this.a;
                        gh6 gh6Var = (gh6) this.b.G;
                        if (this.y == null || this.z == null) {
                            sz6.j("Cannot render to render node outside a start()/finish() block");
                            return;
                        }
                        if (i < 31) {
                            pmf.o("RenderEffect is not supported on API level <31");
                            return;
                        }
                        float[] fArr2 = this.q;
                        float f2 = fArr2 != null ? fArr2[0] : 1.0f;
                        f = fArr2 != null ? fArr2[4] : 1.0f;
                        gh6 gh6Var2 = this.A;
                        if (gh6Var2 == null || gh6Var.a != gh6Var2.a || gh6Var.b != gh6Var2.b || gh6Var.c != gh6Var2.c || gh6Var.d != gh6Var2.d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(gh6Var.d, PorterDuff.Mode.SRC_IN));
                            float f3 = gh6Var.a;
                            if (f3 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                                float f4 = ((f2 + f) * f3) / 2.0f;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f4, f4, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.A = gh6Var;
                        }
                        RectF rectFB = b(this.d, gh6Var);
                        RectF rectF = new RectF(rectFB.left * f2, rectFB.top * f, rectFB.right * f2, rectFB.bottom * f);
                        this.z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((gh6Var.b * f2) + (-rectF.left), (gh6Var.c * f) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.y);
                        this.z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.z);
                        canvas2.restore();
                    }
                    this.a.drawRenderNode(this.y);
                    this.a.restore();
                }
            } else {
                if (this.l == null) {
                    sz6.j("Bitmap is not ready; should've been initialized at start() time");
                    return;
                }
                if (this.b.m()) {
                    Canvas canvas3 = this.a;
                    gh6 gh6Var3 = (gh6) this.b.G;
                    RectF rectF2 = this.d;
                    if (rectF2 == null || this.l == null) {
                        sz6.j("Cannot render to bitmap outside a start()/finish() block");
                        return;
                    }
                    RectF rectFB2 = b(rectF2, gh6Var3);
                    if (this.f == null) {
                        this.f = new Rect();
                    }
                    this.f.set((int) Math.floor(rectFB2.left), (int) Math.floor(rectFB2.top), (int) Math.ceil(rectFB2.right), (int) Math.ceil(rectFB2.bottom));
                    float[] fArr3 = this.q;
                    float f5 = fArr3 != null ? fArr3[0] : 1.0f;
                    f = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.h == null) {
                        this.h = new RectF();
                    }
                    this.h.set(rectFB2.left * f5, rectFB2.top * f, rectFB2.right * f5, rectFB2.bottom * f);
                    if (this.i == null) {
                        this.i = new Rect();
                    }
                    this.i.set(0, 0, Math.round(this.h.width()), Math.round(this.h.height()));
                    if (d(this.r, this.h)) {
                        Bitmap bitmap = this.r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.r = a(this.h, Bitmap.Config.ARGB_8888);
                        this.s = a(this.h, Bitmap.Config.ALPHA_8);
                        this.t = new Canvas(this.r);
                        this.u = new Canvas(this.s);
                    } else {
                        Canvas canvas4 = this.t;
                        if (canvas4 == null || this.u == null || (ps9Var = this.o) == null) {
                            sz6.j("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                            return;
                        } else {
                            canvas4.drawRect(this.i, ps9Var);
                            this.u.drawRect(this.i, this.o);
                        }
                    }
                    if (this.s == null) {
                        sz6.j("Expected to have allocated a shadow mask bitmap");
                        return;
                    }
                    if (this.v == null) {
                        this.v = new ps9(1, 0);
                    }
                    RectF rectF3 = this.d;
                    this.u.drawBitmap(this.l, Math.round((rectF3.left - rectFB2.left) * f5), Math.round((rectF3.top - rectFB2.top) * f), (Paint) null);
                    if (this.w == null || this.x != gh6Var3.a) {
                        float f6 = ((f5 + f) * gh6Var3.a) / 2.0f;
                        if (f6 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                            this.w = new BlurMaskFilter(f6, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.w = null;
                        }
                        this.x = gh6Var3.a;
                    }
                    this.v.setColor(gh6Var3.d);
                    float f7 = gh6Var3.a;
                    ps9 ps9Var2 = this.v;
                    if (f7 > MTTypesetterKt.kLineSkipLimitMultiplier) {
                        ps9Var2.setMaskFilter(this.w);
                    } else {
                        ps9Var2.setMaskFilter(null);
                    }
                    this.v.setFilterBitmap(true);
                    this.t.drawBitmap(this.s, Math.round(gh6Var3.b * f5), Math.round(gh6Var3.c * f), this.v);
                    canvas3.drawBitmap(this.r, this.i, this.f, this.k);
                }
                if (this.n == null) {
                    this.n = new Rect();
                }
                this.n.set(0, 0, (int) (this.d.width() * this.q[0]), (int) (this.d.height() * this.q[4]));
                this.a.drawBitmap(this.l, this.n, this.d, this.k);
            }
        }
        this.a = null;
    }

    public final Canvas e(Canvas canvas, RectF rectF, at atVar) {
        if (this.a != null) {
            sz6.j("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
            return null;
        }
        if (this.q == null) {
            this.q = new float[9];
        }
        if (this.p == null) {
            this.p = new Matrix();
        }
        canvas.getMatrix(this.p);
        this.p.getValues(this.q);
        float[] fArr = this.q;
        float f = fArr[0];
        int i = 4;
        float f2 = fArr[4];
        if (this.j == null) {
            this.j = new RectF();
        }
        this.j.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
        this.a = canvas;
        this.b = atVar;
        if (atVar.F >= 255 && !atVar.m()) {
            i = 1;
        } else if (atVar.m()) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 29 || !canvas.isHardwareAccelerated() || i2 <= 31) {
                i = 3;
            }
        } else {
            i = 2;
        }
        this.c = i;
        if (this.d == null) {
            this.d = new RectF();
        }
        this.d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.k == null) {
            this.k = new ps9();
        }
        this.k.reset();
        int iF = sq6.F(this.c);
        if (iF == 0) {
            canvas.save();
            return canvas;
        }
        if (iF == 1) {
            this.k.setAlpha(atVar.F);
            this.k.setColorFilter(null);
            ps9 ps9Var = this.k;
            Matrix matrix = zpi.a;
            canvas.saveLayer(rectF, ps9Var);
            return canvas;
        }
        Matrix matrix2 = B;
        if (iF == 2) {
            if (this.o == null) {
                ps9 ps9Var2 = new ps9();
                this.o = ps9Var2;
                ps9Var2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (d(this.l, this.j)) {
                Bitmap bitmap = this.l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.l = a(this.j, Bitmap.Config.ARGB_8888);
                this.m = new Canvas(this.l);
            } else {
                Canvas canvas2 = this.m;
                if (canvas2 == null) {
                    sz6.j("If needNewBitmap() returns true, we should have a canvas ready");
                    return null;
                }
                canvas2.setMatrix(matrix2);
                this.m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.o);
            }
            ac1.j(0, this.k);
            this.k.setColorFilter(null);
            this.k.setAlpha(atVar.F);
            Canvas canvas3 = this.m;
            canvas3.scale(f, f2);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iF != 3) {
            pmf.o("Invalid render strategy for OffscreenLayer");
            return null;
        }
        if (Build.VERSION.SDK_INT < 29) {
            sz6.j("RenderNode not supported but we chose it as render strategy");
            return null;
        }
        if (this.y == null) {
            this.y = n6b.g();
        }
        if (atVar.m() && this.z == null) {
            this.z = n6b.x();
            this.A = null;
        }
        this.y.setAlpha(atVar.F / 255.0f);
        if (atVar.m()) {
            RenderNode renderNode = this.z;
            if (renderNode == null) {
                sz6.j("Must initialize shadowRenderNode when we have shadow");
                return null;
            }
            renderNode.setAlpha(atVar.F / 255.0f);
        }
        this.y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.y;
        RectF rectF2 = this.j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.y.beginRecording((int) this.j.width(), (int) this.j.height());
        recordingCanvasBeginRecording.setMatrix(matrix2);
        recordingCanvasBeginRecording.scale(f, f2);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
