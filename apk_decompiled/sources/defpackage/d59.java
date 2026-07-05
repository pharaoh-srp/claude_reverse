package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import defpackage.lhd;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class d59 {
    public static Bitmap a;

    public static void a(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static final RenderEffect b(RenderEffect renderEffect, RenderEffect renderEffect2, BlendMode blendMode, long j) {
        if ((9223372034707292159L & j) != 9205357640488583168L && !fcc.c(j, 0L)) {
            renderEffect2 = RenderEffect.createOffsetEffect(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), renderEffect2);
            renderEffect2.getClass();
        }
        RenderEffect renderEffectCreateBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffect, renderEffect2, blendMode);
        renderEffectCreateBlendModeEffect.getClass();
        return renderEffectCreateBlendModeEffect;
    }

    public static final i50 c(gg8 gg8Var, xfe xfeVar) {
        RenderEffect renderEffectCreateBlurEffect;
        float f = xfeVar.c;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        float f2 = xfeVar.a * f;
        if (va6.a(f2, MTTypesetterKt.kLineSkipLimitMultiplier) < 0) {
            sz6.p("blurRadius needs to be equal or greater than 0.dp");
            return null;
        }
        long jG = k8g.g(f, xfeVar.d);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((float) Math.ceil(Float.intBitsToFloat((int) (jG & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits((float) Math.ceil(Float.intBitsToFloat((int) (jG >> 32))))) << 32);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(mwa.L(Float.intBitsToFloat((int) (r12 & 4294967295L))))) & 4294967295L) | (((long) Float.floatToRawIntBits(mwa.L(Float.intBitsToFloat((int) (fcc.j(f, xfeVar.e) >> 32))))) << 32);
        if (va6.a(f2, MTTypesetterKt.kLineSkipLimitMultiplier) <= 0) {
            renderEffectCreateBlurEffect = RenderEffect.createOffsetEffect(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
        } else {
            try {
                float fQ0 = ((cz5) yb5.o(gg8Var, ve4.h)).q0(f2);
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(fQ0, fQ0, zni.b0(xfeVar.i));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(ij0.j("Error whilst calling RenderEffect.createBlurEffect. This is likely because this device does not support a blur radius of ", va6.c(f2), "dp"), e);
            }
        }
        renderEffectCreateBlurEffect.getClass();
        Context context = (Context) yb5.o(gg8Var, w00.b);
        float f3 = xfeVar.b;
        if (f3 >= 0.005f) {
            if (f <= MTTypesetterKt.kLineSkipLimitMultiplier) {
                f = 1.0f;
            }
            Bitmap bitmapF = f(context);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmapF, tileMode, tileMode);
            if (Math.abs(f - 1.0f) >= 0.001f) {
                Matrix matrix = new Matrix();
                float f4 = 1.0f / f;
                matrix.setScale(f4, f4);
                bitmapShader.setLocalMatrix(matrix);
            }
            float fD0 = wd6.d0(f3, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
            RenderEffect renderEffectCreateShaderEffect = RenderEffect.createShaderEffect(bitmapShader);
            renderEffectCreateShaderEffect.getClass();
            if (fD0 < 1.0f) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setScale(1.0f, 1.0f, 1.0f, fD0);
                renderEffectCreateShaderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffectCreateShaderEffect);
            }
            renderEffectCreateShaderEffect.getClass();
            BlendMode blendMode = BlendMode.DST_ATOP;
            renderEffectCreateBlurEffect = RenderEffect.createBlendModeEffect(renderEffectCreateShaderEffect, renderEffectCreateBlurEffect, BlendMode.DST_ATOP);
            renderEffectCreateBlurEffect.getClass();
        }
        List<qg8> list = xfeVar.f;
        float f5 = xfeVar.g;
        for (qg8 qg8Var : list) {
            boolean zA = qg8Var.a();
            int i = qg8Var.b;
            if (zA) {
                jy1 jy1Var = qg8Var.c;
                Shader shaderC = (jy1Var == null || !(jy1Var instanceof rzf)) ? null : ((rzf) jy1Var).c(jFloatToRawIntBits);
                if (shaderC != null) {
                    RenderEffect renderEffectCreateShaderEffect2 = f5 >= 1.0f ? RenderEffect.createShaderEffect(shaderC) : RenderEffect.createColorFilterEffect(new BlendModeColorFilter(d4c.n0(d54.b(f5, d54.f)), BlendMode.SRC_IN), RenderEffect.createShaderEffect(shaderC));
                    renderEffectCreateShaderEffect2.getClass();
                    renderEffectCreateBlurEffect = b(renderEffectCreateBlurEffect, renderEffectCreateShaderEffect2, j8.i0(i), jFloatToRawIntBits2);
                } else {
                    long jB = qg8Var.a;
                    if (f5 < 1.0f) {
                        jB = d54.b(d54.d(jB) * f5, jB);
                    }
                    if (d54.d(jB) >= 0.005f) {
                        renderEffectCreateBlurEffect = RenderEffect.createColorFilterEffect(new BlendModeColorFilter(d4c.n0(jB), j8.i0(i)), renderEffectCreateBlurEffect);
                        renderEffectCreateBlurEffect.getClass();
                    }
                }
            }
        }
        jy1 jy1Var2 = xfeVar.h;
        BlendMode blendMode2 = BlendMode.DST_IN;
        if (jy1Var2 != null) {
            Shader shaderC2 = jy1Var2 instanceof rzf ? ((rzf) jy1Var2).c(jFloatToRawIntBits) : null;
            if (shaderC2 != null) {
                RenderEffect renderEffectCreateShaderEffect3 = RenderEffect.createShaderEffect(shaderC2);
                renderEffectCreateShaderEffect3.getClass();
                renderEffectCreateBlurEffect = b(renderEffectCreateBlurEffect, renderEffectCreateShaderEffect3, blendMode2, jFloatToRawIntBits2);
            }
        }
        return new i50(renderEffectCreateBlurEffect);
    }

    public static void d(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    public static ContentCaptureSession e(View view) {
        return view.getContentCaptureSession();
    }

    public static final Bitmap f(Context context) {
        context.getClass();
        Bitmap bitmap = a;
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.haze_noise);
        a = bitmapDecodeResource;
        bitmapDecodeResource.getClass();
        return bitmapDecodeResource;
    }

    public static boolean g() {
        return Trace.isEnabled();
    }

    public static Insets h(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static final void i(Activity activity, lhd.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }
}
