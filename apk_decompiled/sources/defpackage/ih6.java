package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class ih6 implements ge1 {
    public final le1 a;
    public final le1 b;
    public final g54 c;
    public final g54 d;
    public final g54 e;
    public final g54 f;
    public final g54 g;
    public Matrix h;

    public ih6(le1 le1Var, le1 le1Var2, h80 h80Var) {
        this.b = le1Var;
        this.a = le1Var2;
        ke1 ke1VarA = ((b80) h80Var.E).a();
        this.c = (g54) ke1VarA;
        ke1VarA.a(this);
        le1Var2.d(ke1VarA);
        g54 g54VarA = ((c80) h80Var.G).a();
        this.d = g54VarA;
        g54VarA.a(this);
        le1Var2.d(g54VarA);
        g54 g54VarA2 = ((c80) h80Var.H).a();
        this.e = g54VarA2;
        g54VarA2.a(this);
        le1Var2.d(g54VarA2);
        g54 g54VarA3 = ((c80) h80Var.F).a();
        this.f = g54VarA3;
        g54VarA3.a(this);
        le1Var2.d(g54VarA3);
        g54 g54VarA4 = ((c80) h80Var.I).a();
        this.g = g54VarA4;
        g54VarA4.a(this);
        le1Var2.d(g54VarA4);
    }

    @Override // defpackage.ge1
    public final void a() {
        this.b.a();
    }

    public final gh6 b(Matrix matrix, int i) {
        float fI = this.e.i() * 0.017453292f;
        float fFloatValue = ((Float) this.f.d()).floatValue();
        double d = fI;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.g.d()).floatValue();
        int iIntValue = ((Integer) this.c.d()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.d.d()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        gh6 gh6Var = new gh6();
        gh6Var.a = fFloatValue2 * 0.33f;
        gh6Var.b = fSin;
        gh6Var.c = fCos;
        gh6Var.d = iArgb;
        gh6Var.e = null;
        gh6Var.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.d().invert(this.h);
        gh6Var.c(this.h);
        return gh6Var;
    }
}
