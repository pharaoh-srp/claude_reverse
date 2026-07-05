package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vjh extends le1 {
    public final StringBuilder B;
    public final StringBuilder C;
    public final StringBuilder D;
    public final StringBuilder E;
    public final RectF F;
    public final Matrix G;
    public final ps9 H;
    public final ps9 I;
    public final HashMap J;
    public final zka K;
    public final ArrayList L;
    public final ArrayList M;
    public final g54 N;
    public final pna O;
    public final bna P;
    public final int Q;
    public final g54 R;
    public final g54 S;
    public final g54 T;
    public final g54 U;
    public final g54 V;
    public final g54 W;
    public final g54 X;
    public final g54 Y;

    public vjh(pna pnaVar, rt9 rt9Var) {
        o5l o5lVar;
        o5l o5lVar2;
        b80 b80Var;
        o5l o5lVar3;
        b80 b80Var2;
        o5l o5lVar4;
        b80 b80Var3;
        h80 h80Var;
        b80 b80Var4;
        h80 h80Var2;
        c80 c80Var;
        h80 h80Var3;
        c80 c80Var2;
        h80 h80Var4;
        b80 b80Var5;
        h80 h80Var5;
        b80 b80Var6;
        super(pnaVar, rt9Var);
        this.B = new StringBuilder(2);
        this.C = new StringBuilder(0);
        this.D = new StringBuilder(0);
        this.E = new StringBuilder(0);
        this.F = new RectF();
        this.G = new Matrix();
        ps9 ps9Var = new ps9(1, 1);
        ps9Var.setStyle(Paint.Style.FILL);
        this.H = ps9Var;
        ps9 ps9Var2 = new ps9(1, 2);
        ps9Var2.setStyle(Paint.Style.STROKE);
        this.I = ps9Var2;
        this.J = new HashMap();
        this.K = new zka((Object) null);
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.Q = 2;
        this.O = pnaVar;
        this.P = rt9Var.b;
        g54 g54Var = new g54((List) rt9Var.q.F, 3);
        this.N = g54Var;
        g54Var.a(this);
        d(g54Var);
        epk epkVar = rt9Var.r;
        if (epkVar != null && (h80Var5 = (h80) epkVar.E) != null && (b80Var6 = (b80) h80Var5.E) != null) {
            ke1 ke1VarA = b80Var6.a();
            this.R = (g54) ke1VarA;
            ke1VarA.a(this);
            d(ke1VarA);
        }
        if (epkVar != null && (h80Var4 = (h80) epkVar.E) != null && (b80Var5 = (b80) h80Var4.F) != null) {
            ke1 ke1VarA2 = b80Var5.a();
            this.S = (g54) ke1VarA2;
            ke1VarA2.a(this);
            d(ke1VarA2);
        }
        if (epkVar != null && (h80Var3 = (h80) epkVar.E) != null && (c80Var2 = (c80) h80Var3.G) != null) {
            g54 g54VarA = c80Var2.a();
            this.T = g54VarA;
            g54VarA.a(this);
            d(g54VarA);
        }
        if (epkVar != null && (h80Var2 = (h80) epkVar.E) != null && (c80Var = (c80) h80Var2.H) != null) {
            g54 g54VarA2 = c80Var.a();
            this.U = g54VarA2;
            g54VarA2.a(this);
            d(g54VarA2);
        }
        if (epkVar != null && (h80Var = (h80) epkVar.E) != null && (b80Var4 = (b80) h80Var.I) != null) {
            ke1 ke1VarA3 = b80Var4.a();
            this.V = (g54) ke1VarA3;
            ke1VarA3.a(this);
            d(ke1VarA3);
        }
        if (epkVar != null && (o5lVar4 = (o5l) epkVar.F) != null && (b80Var3 = (b80) o5lVar4.G) != null) {
            ke1 ke1VarA4 = b80Var3.a();
            this.W = (g54) ke1VarA4;
            ke1VarA4.a(this);
            d(ke1VarA4);
        }
        if (epkVar != null && (o5lVar3 = (o5l) epkVar.F) != null && (b80Var2 = (b80) o5lVar3.H) != null) {
            ke1 ke1VarA5 = b80Var2.a();
            this.X = (g54) ke1VarA5;
            ke1VarA5.a(this);
            d(ke1VarA5);
        }
        if (epkVar != null && (o5lVar2 = (o5l) epkVar.F) != null && (b80Var = (b80) o5lVar2.I) != null) {
            ke1 ke1VarA6 = b80Var.a();
            this.Y = (g54) ke1VarA6;
            ke1VarA6.a(this);
            d(ke1VarA6);
        }
        if (epkVar == null || (o5lVar = (o5l) epkVar.F) == null) {
            return;
        }
        this.Q = o5lVar.F;
    }

    public static void p(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        canvas.drawText(str, 0, str.length(), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, paint);
    }

    public static void q(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == MTTypesetterKt.kLineSkipLimitMultiplier) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.le1, defpackage.pg6
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        bna bnaVar = this.P;
        rectF.set(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, bnaVar.k.width(), bnaVar.k.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0499, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r1 = r24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.le1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, defpackage.gh6 r34) {
        /*
            Method dump skipped, instruction units count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vjh.i(android.graphics.Canvas, android.graphics.Matrix, int, gh6):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String n(int i, String str) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        zka zkaVar = this.K;
        if (zkaVar.c(j) >= 0) {
            return (String) zkaVar.b(j);
        }
        StringBuilder sb = this.B;
        sb.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb.toString();
        zkaVar.f(j, string);
        return string;
    }

    public final void o(w96 w96Var, int i, int i2) {
        ps9 ps9Var = this.H;
        g54 g54Var = this.R;
        if (g54Var == null || !s(i2)) {
            ps9Var.setColor(w96Var.h);
        } else {
            ps9Var.setColor(((Integer) g54Var.d()).intValue());
        }
        g54 g54Var2 = this.S;
        ps9 ps9Var2 = this.I;
        if (g54Var2 == null || !s(i2)) {
            ps9Var2.setColor(w96Var.i);
        } else {
            ps9Var2.setColor(((Integer) g54Var2.d()).intValue());
        }
        g54 g54Var3 = this.w.p;
        int iIntValue = 100;
        int iIntValue2 = g54Var3 == null ? 100 : ((Integer) g54Var3.d()).intValue();
        g54 g54Var4 = this.V;
        if (g54Var4 != null && s(i2)) {
            iIntValue = ((Integer) g54Var4.d()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        ps9Var.setAlpha(iRound);
        ps9Var2.setAlpha(iRound);
        g54 g54Var5 = this.T;
        if (g54Var5 == null || !s(i2)) {
            ps9Var2.setStrokeWidth(zpi.c() * w96Var.j);
        } else {
            ps9Var2.setStrokeWidth(((Float) g54Var5.d()).floatValue());
        }
    }

    public final ujh r(int i) {
        ArrayList arrayList = this.M;
        for (int size = arrayList.size(); size < i; size++) {
            ujh ujhVar = new ujh();
            ujhVar.a = "";
            ujhVar.b = MTTypesetterKt.kLineSkipLimitMultiplier;
            arrayList.add(ujhVar);
        }
        return (ujh) arrayList.get(i - 1);
    }

    public final boolean s(int i) {
        g54 g54Var;
        int length = ((w96) this.N.d()).a.length();
        g54 g54Var2 = this.W;
        if (g54Var2 == null || (g54Var = this.X) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) g54Var2.d()).intValue(), ((Integer) g54Var.d()).intValue());
        int iMax = Math.max(((Integer) g54Var2.d()).intValue(), ((Integer) g54Var.d()).intValue());
        g54 g54Var3 = this.Y;
        if (g54Var3 != null) {
            int iIntValue = ((Integer) g54Var3.d()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.Q == 2) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean t(Canvas canvas, w96 w96Var, int i, float f) {
        PointF pointF = w96Var.l;
        PointF pointF2 = w96Var.m;
        float fC = zpi.c();
        float f2 = MTTypesetterKt.kLineSkipLimitMultiplier;
        float f3 = (i * w96Var.f * fC) + (pointF == null ? 0.0f : (w96Var.f * fC) + pointF.y);
        this.O.getClass();
        float f4 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f2 = pointF2.x;
        }
        int iF = sq6.F(w96Var.d);
        if (iF == 0) {
            canvas.translate(f4, f3);
            return true;
        }
        if (iF == 1) {
            canvas.translate((f4 + f2) - f, f3);
            return true;
        }
        if (iF != 2) {
            return true;
        }
        canvas.translate(((f2 / 2.0f) + f4) - (f / 2.0f), f3);
        return true;
    }

    public final List u(String str, float f, tt7 tt7Var, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                int iA = ut7.a(cCharAt, tt7Var.a, tt7Var.b);
                jgg jggVar = this.P.h;
                jggVar.getClass();
                ut7 ut7Var = (ut7) jwj.f(jggVar, iA);
                if (ut7Var != null) {
                    fMeasureText = (zpi.c() * ((float) ut7Var.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.H.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > MTTypesetterKt.kLineSkipLimitMultiplier && f4 >= f && cCharAt != ' ') {
                i++;
                ujh ujhVarR = r(i);
                if (i3 == i2) {
                    ujhVarR.a = str.substring(i2, i4).trim();
                    ujhVarR.b = (f4 - fMeasureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    ujhVarR.a = str.substring(i2, i3 - 1).trim();
                    ujhVarR.b = ((f4 - f5) - ((r8.length() - r14.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > MTTypesetterKt.kLineSkipLimitMultiplier) {
            i++;
            ujh ujhVarR2 = r(i);
            ujhVarR2.a = str.substring(i2);
            ujhVarR2.b = f4;
        }
        return this.M.subList(0, i);
    }
}
