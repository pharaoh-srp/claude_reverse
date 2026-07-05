package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oo8 extends od1 {
    public final ma1 l;
    public final no8 m;

    public oo8(y5a y5aVar, wdh wdhVar, ke2 ke2Var, y5a y5aVar2, no8 no8Var, nd1 nd1Var, wdh wdhVar2, String str) {
        super(y5aVar, wdhVar, ke2Var, null, 4.0f, y5aVar2, nd1Var, wdhVar2, str);
        this.l = ma1.a;
        this.m = no8Var;
    }

    @Override // defpackage.be2
    public final void a(ge2 ge2Var, sp0 sp0Var, oub oubVar, Object obj) {
        ge2 ge2Var2;
        ge2 ge2Var3 = ge2Var;
        ge2Var3.getClass();
        oubVar.getClass();
        ((ed2) obj).getClass();
        float fP = p(ge2Var3, oubVar, dxj.h(ge2Var3, oubVar));
        eq3 eq3VarH = dxj.h(ge2Var3, oubVar);
        nd1 nd1Var = this.g;
        if (!(nd1Var instanceof nd1)) {
            wg6.i();
            return;
        }
        no8 no8Var = this.m;
        Iterator it = no8Var.e(ge2Var3, oubVar, eq3VarH).iterator();
        if (!it.hasNext()) {
            pmf.d();
            return;
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        ke2 ke2Var = this.c;
        Float fValueOf = null;
        CharSequence charSequenceE = kzj.e(ke2Var, ge2Var3, dDoubleValue, null);
        wdh wdhVar = this.b;
        float fD = wdh.d(wdhVar, ge2Var3, charSequenceE, 0, MTTypesetterKt.kLineSkipLimitMultiplier, 12);
        while (it.hasNext()) {
            fD = Math.max(fD, wdh.d(wdhVar, ge2Var3, kzj.e(ke2Var, ge2Var3, ((Number) it.next()).doubleValue(), null), 0, MTTypesetterKt.kLineSkipLimitMultiplier, 12));
            ge2Var3 = ge2Var;
        }
        CharSequence charSequence = this.i;
        if (charSequence != null) {
            ge2Var2 = ge2Var;
            fValueOf = Float.valueOf(wdh.d(this.h, ge2Var2, charSequence, (int) this.k.width(), MTTypesetterKt.kLineSkipLimitMultiplier, 56));
        } else {
            ge2Var2 = ge2Var;
        }
        float fFloatValue = fD + (fValueOf != null ? fValueOf.floatValue() : 0.0f);
        ma1 ma1Var = this.l;
        ma1 ma1Var2 = ma1.a;
        float fI = i(ge2Var) + fFloatValue + (x44.r(ma1Var, ma1Var2) ? g(ge2Var) : 0.0f);
        float fHeight = ge2Var2.h().height() / 3.0f;
        if (fI > fHeight) {
            fI = fHeight;
        }
        float fD0 = wd6.d0(fI, ge2Var2.b(MTTypesetterKt.kLineSkipLimitMultiplier), ge2Var2.b(nd1Var.a));
        float fH = no8Var.h(ge2Var2, oubVar, j(ge2Var), fP);
        float fD2 = no8Var.d(ge2Var2, oubVar, j(ge2Var), fP);
        float f = sp0Var.b;
        if (f >= fH) {
            fH = f;
        }
        sp0Var.b = fH;
        float f2 = sp0Var.d;
        if (f2 >= fD2) {
            fD2 = f2;
        }
        sp0Var.d = fD2;
        if (x44.r(ma1Var, na1.a)) {
            sp0.a(sp0Var, fD0, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
        } else if (x44.r(ma1Var, ma1Var2)) {
            sp0.a(sp0Var, MTTypesetterKt.kLineSkipLimitMultiplier, fD0, 7);
        } else {
            wg6.i();
        }
    }

    @Override // defpackage.od1
    public final void d(yd2 yd2Var) {
    }

    @Override // defpackage.od1
    public final void e(yd2 yd2Var) {
        ma1 ma1Var;
        na1 na1Var;
        RectF rectF;
        float fG;
        oub oubVar;
        y9d y9dVar;
        float f;
        float f2;
        RectF rectF2 = yd2Var.b;
        oub oubVar2 = yd2Var.d;
        ge2 ge2Var = yd2Var.a;
        int iSave = yd2Var.c.save();
        ma1 ma1Var2 = this.l;
        na1 na1Var2 = na1.a;
        boolean zR = x44.r(ma1Var2, na1Var2);
        RectF rectF3 = this.k;
        float fG2 = zR ? (rectF3.bottom - g(yd2Var)) - i(yd2Var) : rectF3.top;
        float fI = i(yd2Var) + g(yd2Var) + fG2;
        eq3 eq3VarH = dxj.h(yd2Var, oubVar2);
        double d = eq3VarH.F;
        double d2 = eq3VarH.E;
        float f3 = fG2;
        float fP = p(yd2Var, oubVar2, eq3VarH);
        float f4 = fI;
        Canvas canvas = yd2Var.c;
        float f5 = rectF3.left;
        float fJ = j(yd2Var);
        no8 no8Var = this.m;
        canvas.clipRect(f5 - no8Var.h(yd2Var, oubVar2, fJ, fP), Math.min(rectF3.top, rectF2.top), no8Var.d(yd2Var, oubVar2, j(yd2Var), fP) + rectF3.right, Math.max(rectF3.bottom, rectF2.bottom));
        float f6 = x44.r(ma1Var2, na1Var2) ? f3 : f4;
        float fD = (oubVar2.d() * ge2Var.j()) + (nkk.e(rectF3, ge2Var.g()) - yd2Var.e);
        eq3 eq3VarE = xwj.e(yd2Var);
        List listC = no8Var.c(yd2Var, eq3VarE, eq3VarH, fP);
        List listG = no8Var.g(yd2Var, eq3VarE, eq3VarH);
        Iterator it = listC.iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            y9d y9dVar2 = y9d.G;
            y9d y9dVar3 = y9d.E;
            eq3 eq3Var = eq3VarH;
            y5a y5aVar = this.d;
            if (!zHasNext) {
                ma1 ma1Var3 = ma1Var2;
                na1 na1Var3 = na1Var2;
                RectF rectF4 = rectF3;
                no8 no8Var2 = no8Var;
                RectF rectF5 = rectF2;
                float f7 = f3;
                float f8 = f4;
                float f9 = fD;
                List list = listC;
                oub oubVar3 = oubVar2;
                if (listG != null) {
                    Iterator it2 = listG.iterator();
                    while (it2.hasNext()) {
                        double dDoubleValue = ((Number) it2.next()).doubleValue();
                        if (y5aVar != null) {
                            oubVar = oubVar3;
                            y5a.c(y5aVar, yd2Var, o(yd2Var, dDoubleValue, eq3Var) + (((float) ((dDoubleValue - ge2Var.d().b()) / ge2Var.d().d())) * oubVar.a * ge2Var.j()) + f9, f7, f8);
                        } else {
                            oubVar = oubVar3;
                        }
                        oubVar3 = oubVar;
                    }
                }
                oub oubVar4 = oubVar3;
                float fJ2 = no8Var2.i(yd2Var) ? j(yd2Var) : j(yd2Var) / 2.0f;
                y5a y5aVar2 = this.a;
                if (y5aVar2 != null) {
                    float f10 = rectF5.left - fJ2;
                    float f11 = rectF5.right + fJ2;
                    ma1Var = ma1Var3;
                    na1Var = na1Var3;
                    if (x44.r(ma1Var, na1Var)) {
                        rectF = rectF4;
                        fG = rectF.bottom - (g(yd2Var) / 2.0f);
                    } else {
                        rectF = rectF4;
                        fG = rectF.top + (g(yd2Var) / 2.0f);
                    }
                    y5a.b(y5aVar2, yd2Var, f10, f11, fG);
                } else {
                    ma1Var = ma1Var3;
                    na1Var = na1Var3;
                    rectF = rectF4;
                }
                CharSequence charSequence = this.i;
                if (charSequence != null) {
                    float fCenterX = rectF.centerX();
                    float f12 = x44.r(ma1Var, na1Var) ? rectF.top : rectF.bottom;
                    if (!x44.r(ma1Var, na1Var)) {
                        y9dVar2 = y9dVar3;
                    }
                    wdh.a(this.h, yd2Var, charSequence, fCenterX, f12, null, y9dVar2, (int) rectF.width(), 0, MTTypesetterKt.kLineSkipLimitMultiplier, 400);
                }
                yd2Var.c.restoreToCount(iSave);
                list.getClass();
                y5a y5aVar3 = this.f;
                if (y5aVar3 == null) {
                    return;
                }
                int iSave2 = yd2Var.c.save();
                yd2Var.c.clipRect(rectF5);
                if (listG == null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        double dDoubleValue2 = ((Number) it3.next()).doubleValue();
                        float fB = (((float) ((dDoubleValue2 - ge2Var.d().b()) / ge2Var.d().d())) * oubVar4.a * ge2Var.j()) + f9;
                        Double dValueOf = Double.valueOf(dDoubleValue2);
                        y5a y5aVar4 = (dValueOf.equals(Double.valueOf(d2)) || dValueOf.equals(Double.valueOf(d))) ? null : y5aVar3;
                        if (y5aVar4 != null) {
                            y5a.c(y5aVar4, yd2Var, fB, rectF5.top, rectF5.bottom);
                        }
                    }
                } else {
                    Iterator it4 = listG.iterator();
                    while (it4.hasNext()) {
                        double dDoubleValue3 = ((Number) it4.next()).doubleValue();
                        float fO = o(yd2Var, dDoubleValue3, eq3Var) + (((float) ((dDoubleValue3 - ge2Var.d().b()) / ge2Var.d().d())) * oubVar4.a * ge2Var.j()) + f9;
                        Double dValueOf2 = Double.valueOf(dDoubleValue3);
                        y5a y5aVar5 = (dValueOf2.equals(Double.valueOf(d2)) || dValueOf2.equals(Double.valueOf(d))) ? null : y5aVar3;
                        if (y5aVar5 != null) {
                            y5a.c(y5aVar5, yd2Var, fO, rectF5.top, rectF5.bottom);
                        }
                    }
                }
                if (iSave2 >= 0) {
                    yd2Var.c.restoreToCount(iSave2);
                    return;
                }
                return;
            }
            Object next = it.next();
            no8 no8Var3 = no8Var;
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            RectF rectF6 = rectF2;
            double dDoubleValue4 = ((Number) next).doubleValue();
            float f13 = f6;
            float fB2 = (((float) ((dDoubleValue4 - ge2Var.d().b()) / ge2Var.d().d())) * oubVar2.a * ge2Var.j()) + fD;
            Double d3 = (Double) w44.O0(i - 1, listC);
            double dDoubleValue5 = d3 != null ? d3.doubleValue() : (d2 * 2.0d) - dDoubleValue4;
            Double d4 = (Double) w44.O0(i2, listC);
            RectF rectF7 = rectF3;
            int iCeil = (int) Math.ceil((Math.min(dDoubleValue4 - dDoubleValue5, (d4 != null ? d4.doubleValue() : (2.0d * d) - dDoubleValue4) - dDoubleValue4) / ge2Var.d().d()) * ((double) oubVar2.a));
            CharSequence charSequenceE = kzj.e(this.c, yd2Var, dDoubleValue4, null);
            ma1Var2.getClass();
            if (ma1Var2.equals(na1Var2)) {
                y9dVar = y9dVar3;
            } else {
                if (!ma1Var2.equals(ma1.a)) {
                    wg6.i();
                    return;
                }
                y9dVar = y9dVar2;
            }
            ma1 ma1Var4 = ma1Var2;
            float f14 = f3;
            float f15 = fD;
            na1 na1Var4 = na1Var2;
            float f16 = f4;
            List list2 = listC;
            oub oubVar5 = oubVar2;
            wdh.a(this.b, yd2Var, charSequenceE, fB2, f13, null, y9dVar, iCeil, (int) ((rectF7.height() - i(yd2Var)) - (g(yd2Var) / 2.0f)), MTTypesetterKt.kLineSkipLimitMultiplier, 16);
            if (listG != null || y5aVar == null) {
                f = f14;
                f2 = f16;
            } else {
                f = f14;
                f2 = f16;
                y5a.c(y5aVar, yd2Var, o(yd2Var, dDoubleValue4, eq3Var) + fB2, f, f2);
            }
            eq3VarH = eq3Var;
            fD = f15;
            listC = list2;
            oubVar2 = oubVar5;
            rectF2 = rectF6;
            no8Var = no8Var3;
            ma1Var2 = ma1Var4;
            na1Var2 = na1Var4;
            f3 = f;
            f4 = f2;
            i = i2;
            f6 = f13;
            rectF3 = rectF7;
        }
    }

    @Override // defpackage.od1
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof oo8)) {
            return x44.r(this.m, ((oo8) obj).m);
        }
        return false;
    }

    @Override // defpackage.od1
    public final ra1 h() {
        return this.l;
    }

    @Override // defpackage.od1
    public final int hashCode() {
        return this.m.hashCode() + (super.hashCode() * 31);
    }

    @Override // defpackage.od1
    public final void n(ge2 ge2Var, oub oubVar) {
        ge2Var.getClass();
        oubVar.getClass();
        xd2 xd2VarD = ge2Var.d();
        p(ge2Var, oubVar, dxj.h(ge2Var, oubVar));
        no8 no8Var = this.m;
        Double dB = no8Var.b(ge2Var);
        Double dF = no8Var.f(ge2Var);
        ke2 ke2Var = this.c;
        wdh wdhVar = this.b;
        if (dB != null) {
            float f = wdh.f(wdhVar, ge2Var, kzj.e(ke2Var, ge2Var, dB.doubleValue(), null), 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier, 12) / 2.0f;
            if (!ge2Var.f()) {
                f -= ((float) (dB.doubleValue() - xd2VarD.b())) * oubVar.a;
            }
            oubVar.a(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (23 & 8) != 0 ? 0.0f : f, (23 & 16) != 0 ? 0.0f : MTTypesetterKt.kLineSkipLimitMultiplier);
        }
        if (dF != null) {
            float f2 = wdh.f(wdhVar, ge2Var, kzj.e(ke2Var, ge2Var, dF.doubleValue(), null), 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier, 12) / 2.0f;
            if (!ge2Var.f()) {
                f2 -= (float) ((xd2VarD.a() - dF.doubleValue()) * ((double) oubVar.a));
            }
            oubVar.a(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, (23 & 8) != 0 ? 0.0f : MTTypesetterKt.kLineSkipLimitMultiplier, (23 & 16) != 0 ? 0.0f : f2);
        }
    }

    public final float o(yd2 yd2Var, double d, eq3 eq3Var) {
        boolean zI = this.m.i(yd2Var);
        float fJ = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (zI) {
            if (d == Double.valueOf(eq3Var.E).doubleValue()) {
                fJ = -(j(yd2Var) / 2.0f);
            } else if (d == Double.valueOf(eq3Var.F).doubleValue()) {
                fJ = j(yd2Var) / 2.0f;
            }
        }
        return fJ * yd2Var.a.j();
    }

    public final float p(ge2 ge2Var, oub oubVar, eq3 eq3Var) {
        ge2Var.getClass();
        oubVar.getClass();
        Iterator it = this.m.a(ge2Var, oubVar, eq3Var).iterator();
        Float fValueOf = null;
        if (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            ke2 ke2Var = this.c;
            CharSequence charSequenceE = kzj.e(ke2Var, ge2Var, dDoubleValue, null);
            wdh wdhVar = this.b;
            float f = wdh.f(wdhVar, ge2Var, charSequenceE, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier, 12);
            while (it.hasNext()) {
                f = Math.max(f, wdh.f(wdhVar, ge2Var, kzj.e(ke2Var, ge2Var, ((Number) it.next()).doubleValue(), null), 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier, 12));
            }
            fValueOf = Float.valueOf(f);
        }
        return fValueOf != null ? fValueOf.floatValue() : MTTypesetterKt.kLineSkipLimitMultiplier;
    }
}
