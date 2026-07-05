package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class me4 extends le1 {
    public final g54 B;
    public final ArrayList C;
    public final RectF D;
    public final RectF E;
    public final RectF F;
    public final ecc G;
    public final at H;
    public float I;
    public boolean J;
    public final ih6 K;

    public me4(pna pnaVar, rt9 rt9Var, List list, bna bnaVar) {
        le1 le1Var;
        le1 me4Var;
        String str;
        super(pnaVar, rt9Var);
        this.C = new ArrayList();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new ecc();
        this.H = new at(7);
        this.J = true;
        c80 c80Var = rt9Var.s;
        if (c80Var != null) {
            g54 g54VarA = c80Var.a();
            this.B = g54VarA;
            d(g54VarA);
            g54VarA.a(this);
        } else {
            this.B = null;
        }
        zka zkaVar = new zka(bnaVar.j.size());
        int size = list.size() - 1;
        le1 le1Var2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < zkaVar.h(); i++) {
                    le1 le1Var3 = (le1) zkaVar.b(zkaVar.d(i));
                    if (le1Var3 != null && (le1Var = (le1) zkaVar.b(le1Var3.p.f)) != null) {
                        le1Var3.t = le1Var;
                    }
                }
                h80 h80Var = this.p.x;
                if (h80Var != null) {
                    this.K = new ih6(this, this, h80Var);
                    return;
                }
                return;
            }
            rt9 rt9Var2 = (rt9) list.get(size);
            int iF = sq6.F(rt9Var2.e);
            if (iF == 0) {
                me4Var = new me4(pnaVar, rt9Var2, (List) bnaVar.c.get(rt9Var2.g), bnaVar);
            } else if (iF == 1) {
                me4Var = new feg(pnaVar, rt9Var2);
            } else if (iF == 2) {
                me4Var = new ww8(pnaVar, rt9Var2);
            } else if (iF == 3) {
                me4Var = new h9c(pnaVar, rt9Var2);
            } else if (iF == 4) {
                me4Var = new s0g(pnaVar, rt9Var2, this, bnaVar);
            } else if (iF != 5) {
                switch (rt9Var2.e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                oga.a("Unknown layer type ".concat(str));
                me4Var = null;
            } else {
                me4Var = new vjh(pnaVar, rt9Var2);
            }
            if (me4Var != null) {
                zkaVar.f(me4Var.p.d, me4Var);
                if (le1Var2 != null) {
                    le1Var2.s = me4Var;
                    le1Var2 = null;
                } else {
                    this.C.add(0, me4Var);
                    int iF2 = sq6.F(rt9Var2.u);
                    if (iF2 == 1 || iF2 == 2) {
                        le1Var2 = me4Var;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.le1, defpackage.pg6
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.D;
            rectF2.set(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
            ((le1) arrayList.get(size)).c(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.le1
    public final void i(Canvas canvas, Matrix matrix, int i, gh6 gh6Var) {
        Canvas canvasE;
        boolean z = false;
        ih6 ih6Var = this.K;
        boolean z2 = (gh6Var == null && ih6Var == null) ? false : true;
        pna pnaVar = this.o;
        pnaVar.getClass();
        if (z2 && pnaVar.O) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (ih6Var != null) {
            gh6Var = ih6Var.b(matrix, i2);
        }
        boolean z3 = this.J;
        rt9 rt9Var = this.p;
        ArrayList<le1> arrayList = this.C;
        RectF rectF = this.E;
        if (z3 || !"__container".equals(rt9Var.c)) {
            rectF.set(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, rt9Var.o, rt9Var.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (le1 le1Var : arrayList) {
                RectF rectF2 = this.F;
                le1Var.c(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        ecc eccVar = this.G;
        if (z) {
            at atVar = this.H;
            atVar.G = null;
            atVar.F = i;
            if (gh6Var != null) {
                if (Color.alpha(gh6Var.d) > 0) {
                    atVar.G = gh6Var;
                } else {
                    atVar.G = null;
                }
                gh6Var = null;
            }
            canvasE = eccVar.e(canvas, rectF, atVar);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((le1) arrayList.get(size)).f(canvasE, matrix, i2, gh6Var);
            }
        }
        if (z) {
            eccVar.c();
        }
        canvas.restore();
    }

    @Override // defpackage.le1
    public final void m(float f) {
        this.I = f;
        super.m(f);
        rt9 rt9Var = this.p;
        g54 g54Var = this.B;
        if (g54Var != null) {
            bna bnaVar = this.o.E;
            f = ((((Float) g54Var.d()).floatValue() * rt9Var.b.n) - rt9Var.b.l) / ((bnaVar.m - bnaVar.l) + 0.01f);
        }
        if (g54Var == null) {
            float f2 = rt9Var.n;
            bna bnaVar2 = rt9Var.b;
            f -= f2 / (bnaVar2.m - bnaVar2.l);
        }
        if (rt9Var.m != MTTypesetterKt.kLineSkipLimitMultiplier && !"__container".equals(rt9Var.c)) {
            f /= rt9Var.m;
        }
        ArrayList arrayList = this.C;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((le1) arrayList.get(size)).m(f);
        }
    }
}
