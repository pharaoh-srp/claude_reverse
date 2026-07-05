package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class td5 implements LeadingMarginSpan {
    public final e0g E;
    public final float F;
    public final float G;
    public final jy1 H;
    public final float I;
    public final yd6 J;
    public final cz5 K;
    public final int L;
    public final int M;

    public td5(e0g e0gVar, float f, float f2, float f3, jy1 jy1Var, float f4, yd6 yd6Var, cz5 cz5Var, float f5) {
        this.E = e0gVar;
        this.F = f;
        this.G = f2;
        this.H = jy1Var;
        this.I = f4;
        this.J = yd6Var;
        this.K = cz5Var;
        int iL = mwa.L(f + f3);
        this.L = iL;
        this.M = mwa.L(f5) - iL;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.L;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        qk7 qk7Var = qk7.a;
        yd6 yd6Var = this.J;
        Integer numValueOf = null;
        if (x44.r(yd6Var, qk7Var)) {
            paint.setStyle(Paint.Style.FILL);
        } else {
            if (!(yd6Var instanceof ksg)) {
                wg6.i();
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            ksg ksgVar = (ksg) yd6Var;
            paint.setStrokeWidth(ksgVar.a);
            paint.setStrokeMiter(ksgVar.b);
            int i10 = ksgVar.c;
            paint.setStrokeCap(i10 == 0 ? Paint.Cap.BUTT : i10 == 1 ? Paint.Cap.ROUND : i10 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            int i11 = ksgVar.d;
            paint.setStrokeJoin(i11 == 0 ? Paint.Join.MITER : i11 == 1 ? Paint.Join.ROUND : i11 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            ruc rucVar = ksgVar.e;
            paint.setPathEffect(rucVar != null ? ((d40) rucVar).a : null);
        }
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.F)) << 32) | (((long) Float.floatToRawIntBits(this.G)) & 4294967295L);
        zy7 zy7Var = new zy7() { // from class: sd5
            @Override // defpackage.zy7
            public final Object a() {
                td5 td5Var = this.E;
                e0g e0gVar = td5Var.E;
                int i12 = i2;
                knk knkVarA = e0gVar.a(jFloatToRawIntBits, i12 > 0 ? fu9.E : fu9.F, td5Var.K);
                float f2 = i9;
                boolean z2 = knkVarA instanceof elc;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                if (z2) {
                    canvas2.save();
                    elc elcVar = (elc) knkVarA;
                    l9e l9eVarW = elcVar.w();
                    canvas2.translate(f2, f3 - ((l9eVarW.d - l9eVarW.b) / 2.0f));
                    c40 c40Var = elcVar.k;
                    if (!(c40Var instanceof c40)) {
                        pmf.n("Unable to obtain android.graphics.Path");
                        return null;
                    }
                    canvas2.drawPath(c40Var.a, paint2);
                    canvas2.restore();
                } else if (knkVarA instanceof glc) {
                    sve sveVar = ((glc) knkVarA).k;
                    if (gb9.A(sveVar)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (sveVar.e >> 32));
                        canvas2.drawRoundRect(f2, f3 - (sveVar.a() / 2.0f), (sveVar.b() * i12) + f2, (sveVar.a() / 2.0f) + f3, fIntBitsToFloat, fIntBitsToFloat, paint2);
                    } else {
                        c40 c40VarA = f40.a();
                        c40.c(c40VarA, sveVar);
                        canvas2.save();
                        canvas2.translate(f2, f3 - (sveVar.a() / 2.0f));
                        canvas2.drawPath(c40VarA.a, paint2);
                        canvas2.restore();
                    }
                } else {
                    if (!(knkVarA instanceof flc)) {
                        wg6.i();
                        return null;
                    }
                    l9e l9eVar = ((flc) knkVarA).k;
                    float f4 = (l9eVar.d - l9eVar.b) / 2.0f;
                    canvas2.drawRect(f2, f3 - f4, sq6.k(l9eVar.c, l9eVar.a, i12, f2), f4 + f3, paint2);
                }
                return iei.a;
            }
        };
        jy1 jy1Var = this.H;
        float f2 = this.I;
        if (jy1Var == null) {
            if (!Float.isNaN(f2)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            zy7Var.a();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        } else if (jy1Var instanceof eeg) {
            int color = paint.getColor();
            if (!Float.isNaN(f2)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            paint.setColor(d4c.n0(((eeg) jy1Var).a));
            zy7Var.a();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        } else {
            if (!(jy1Var instanceof rzf)) {
                wg6.i();
                return;
            }
            Shader shader = paint.getShader();
            if (!Float.isNaN(f2)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f2 * 255.0f));
            }
            paint.setShader(((rzf) jy1Var).c(jFloatToRawIntBits));
            zy7Var.a();
            paint.setShader(shader);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.M;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
