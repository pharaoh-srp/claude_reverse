package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z98 implements pg6, ge1, ym4 {
    public final boolean a;
    public final zka b = new zka((Object) null);
    public final zka c = new zka((Object) null);
    public final Path d;
    public final ps9 e;
    public final RectF f;
    public final ArrayList g;
    public final int h;
    public final x98 i;
    public final g54 j;
    public final x98 k;
    public final x98 l;
    public final pna m;
    public final int n;
    public final g54 o;
    public float p;

    public z98(pna pnaVar, bna bnaVar, le1 le1Var, y98 y98Var) {
        Path path = new Path();
        this.d = path;
        this.e = new ps9(1, 0);
        this.f = new RectF();
        this.g = new ArrayList();
        this.p = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.a = y98Var.g;
        this.m = pnaVar;
        this.h = y98Var.a;
        path.setFillType(y98Var.b);
        this.n = (int) (bnaVar.b() / 32.0f);
        ke1 ke1VarA = y98Var.c.a();
        this.i = (x98) ke1VarA;
        ke1VarA.a(this);
        le1Var.d(ke1VarA);
        ke1 ke1VarA2 = y98Var.d.a();
        this.j = (g54) ke1VarA2;
        ke1VarA2.a(this);
        le1Var.d(ke1VarA2);
        ke1 ke1VarA3 = y98Var.e.a();
        this.k = (x98) ke1VarA3;
        ke1VarA3.a(this);
        le1Var.d(ke1VarA3);
        ke1 ke1VarA4 = y98Var.f.a();
        this.l = (x98) ke1VarA4;
        ke1VarA4.a(this);
        le1Var.d(ke1VarA4);
        if (le1Var.j() != null) {
            g54 g54VarA = ((c80) le1Var.j().F).a();
            this.o = g54VarA;
            g54VarA.a(this);
            le1Var.d(g54VarA);
        }
    }

    @Override // defpackage.ge1
    public final void a() {
        this.m.invalidateSelf();
    }

    @Override // defpackage.ym4
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            ym4 ym4Var = (ym4) list2.get(i);
            if (ym4Var instanceof quc) {
                this.g.add((quc) ym4Var);
            }
        }
    }

    @Override // defpackage.pg6
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.d;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((quc) arrayList.get(i)).e(), matrix);
                i++;
            }
        }
    }

    public final int d() {
        float f = this.k.d;
        float f2 = this.n;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.l.d * f2);
        int iRound3 = Math.round(this.i.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // defpackage.pg6
    public final void f(Canvas canvas, Matrix matrix, int i, gh6 gh6Var) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.a) {
            return;
        }
        Path path = this.d;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((quc) arrayList.get(i2)).e(), matrix);
            i2++;
        }
        path.computeBounds(this.f, false);
        int i3 = this.h;
        x98 x98Var = this.i;
        x98 x98Var2 = this.l;
        x98 x98Var3 = this.k;
        if (i3 == 1) {
            long jD = d();
            zka zkaVar = this.b;
            linearGradient = (LinearGradient) zkaVar.b(jD);
            if (linearGradient == null) {
                PointF pointF = (PointF) x98Var3.d();
                PointF pointF2 = (PointF) x98Var2.d();
                w98 w98Var = (w98) x98Var.d();
                int[] iArr3 = w98Var.b;
                float[] fArr2 = w98Var.a;
                if (iArr3.length < 2) {
                    int[] iArr4 = {iArr3[0], iArr3[0]};
                    fArr2 = new float[]{MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f};
                    iArr2 = iArr4;
                } else {
                    iArr2 = iArr3;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                zkaVar.f(jD, linearGradient);
            }
        } else {
            long jD2 = d();
            zka zkaVar2 = this.c;
            RadialGradient radialGradient = (RadialGradient) zkaVar2.b(jD2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) x98Var3.d();
                PointF pointF4 = (PointF) x98Var2.d();
                w98 w98Var2 = (w98) x98Var.d();
                int[] iArr5 = w98Var2.b;
                float[] fArr3 = w98Var2.a;
                if (iArr5.length < 2) {
                    iArr = new int[]{iArr5[0], iArr5[0]};
                    fArr = new float[]{MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArr5;
                }
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= MTTypesetterKt.kLineSkipLimitMultiplier) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                zkaVar2.f(jD2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        ps9 ps9Var = this.e;
        ps9Var.setShader(linearGradient);
        g54 g54Var = this.o;
        if (g54Var != null) {
            float fFloatValue = ((Float) g54Var.d()).floatValue();
            if (fFloatValue == MTTypesetterKt.kLineSkipLimitMultiplier) {
                ps9Var.setMaskFilter(null);
            } else if (fFloatValue != this.p) {
                ps9Var.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.p = fFloatValue;
        }
        float fIntValue = ((Integer) this.j.d()).intValue() / 100.0f;
        ps9Var.setAlpha(vkb.c((int) (i * fIntValue)));
        if (gh6Var != null) {
            gh6Var.a((int) (fIntValue * 255.0f), ps9Var);
        }
        canvas.drawPath(path, ps9Var);
    }
}
