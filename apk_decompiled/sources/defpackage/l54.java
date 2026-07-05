package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class l54 {
    public final int a;
    public final srd b;
    public f59 c;
    public f59 d;
    public trd e;
    public final ColorDrawable f;
    public boolean g;
    public int h;

    static {
        new PathInterpolator(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f);
        new PathInterpolator(0.6f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, 1.0f);
        new PathInterpolator(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 0.2f, 1.0f);
        new PathInterpolator(0.4f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, 1.0f);
    }

    public l54(int i, int i2) {
        srd srdVar = new srd();
        srdVar.a = -1;
        srdVar.b = -1;
        f59 f59Var = f59.e;
        srdVar.c = f59Var;
        srdVar.d = false;
        srdVar.e = null;
        srdVar.f = MTTypesetterKt.kLineSkipLimitMultiplier;
        srdVar.g = MTTypesetterKt.kLineSkipLimitMultiplier;
        srdVar.h = 1.0f;
        this.b = srdVar;
        this.c = f59Var;
        this.d = f59Var;
        this.e = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            sz6.p(grc.p(i, "Unexpected side: "));
            throw null;
        }
        this.a = i;
        this.f = new ColorDrawable();
        this.h = 0;
        b(i2);
    }

    public final int a() {
        return this.a;
    }

    public final void b(int i) {
        this.g = true;
        if (this.h != i) {
            this.h = i;
            ColorDrawable colorDrawable = this.f;
            colorDrawable.setColor(i);
            srd srdVar = this.b;
            srdVar.e = colorDrawable;
            qb5 qb5Var = srdVar.i;
            if (qb5Var != null) {
                ((View) qb5Var.F).setBackground(colorDrawable);
            }
        }
    }

    public final void c(float f) {
        float f2 = f * 1.0f;
        srd srdVar = this.b;
        if (srdVar.h != f2) {
            srdVar.h = f2;
            qb5 qb5Var = srdVar.i;
            if (qb5Var != null) {
                ((View) qb5Var.F).setAlpha(f2);
            }
        }
    }

    public final void d(float f) {
        float f2 = f * 1.0f;
        srd srdVar = this.b;
        int i = this.a;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * srdVar.a;
            if (srdVar.f != f3) {
                srdVar.f = f3;
                qb5 qb5Var = srdVar.i;
                if (qb5Var != null) {
                    ((View) qb5Var.F).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * srdVar.b;
            if (srdVar.g != f4) {
                srdVar.g = f4;
                qb5 qb5Var2 = srdVar.i;
                if (qb5Var2 != null) {
                    ((View) qb5Var2.F).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * srdVar.a;
            if (srdVar.f != f5) {
                srdVar.f = f5;
                qb5 qb5Var3 = srdVar.i;
                if (qb5Var3 != null) {
                    ((View) qb5Var3.F).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * srdVar.b;
        if (srdVar.g != f6) {
            srdVar.g = f6;
            qb5 qb5Var4 = srdVar.i;
            if (qb5Var4 != null) {
                ((View) qb5Var4.F).setTranslationY(f6);
            }
        }
    }
}
