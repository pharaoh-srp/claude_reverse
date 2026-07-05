package defpackage;

import android.graphics.RectF;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xti extends od1 {
    public final pa1 l;
    public final vti m;
    public final y9d n;
    public final wti o;
    public Float p;

    public xti(wdh wdhVar, vti vtiVar, y9d y9dVar, ke2 ke2Var, y5a y5aVar, y5a y5aVar2, wti wtiVar, nd1 nd1Var, wdh wdhVar2, String str) {
        super(null, wdhVar, ke2Var, y5aVar, 8.0f, y5aVar2, nd1Var, wdhVar2, str);
        this.l = pa1.a;
        this.m = vtiVar;
        this.n = y9dVar;
        this.o = wtiVar;
    }

    @Override // defpackage.be2
    public final void a(ge2 ge2Var, sp0 sp0Var, oub oubVar, Object obj) {
        ge2Var.getClass();
        oubVar.getClass();
        ((ed2) obj).getClass();
        float fQ = q(ge2Var);
        float fMax = Math.max(g(ge2Var), j(ge2Var));
        wti wtiVar = this.o;
        y9d y9dVar = this.n;
        sp0.a(sp0Var, wtiVar.b(ge2Var, y9dVar, fQ, fMax), wtiVar.a(ge2Var, y9dVar, fQ, fMax), 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139 A[EDGE_INSN: B:65:0x0139->B:46:0x0139 BREAK  A[LOOP:0: B:25:0x0072->B:45:0x0130], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.od1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.yd2 r24) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xti.d(yd2):void");
    }

    @Override // defpackage.od1
    public final void e(yd2 yd2Var) {
        RectF rectF = yd2Var.b;
        xd2 xd2VarD = yd2Var.a.d();
        pa1 pa1Var = this.l;
        lub lubVarE = xd2VarD.e(pa1Var);
        float fQ = q(yd2Var);
        RectF rectF2 = this.k;
        rectF2.height();
        wti wtiVar = this.o;
        List listE = wtiVar.e(pa1Var, yd2Var);
        if (listE == null) {
            listE = wtiVar.f(yd2Var, rectF2.height(), fQ, pa1Var);
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            float fP = p(yd2Var, f(yd2Var), dDoubleValue) + (rectF2.bottom - (rectF2.height() * ((float) ((dDoubleValue - lubVarE.a) / lubVarE.a()))));
            y5a y5aVar = this.f;
            if (y5aVar != null) {
                if (!k(rectF.left, fP - (f(yd2Var) / 2.0f), rectF.right, (f(yd2Var) / 2.0f) + fP)) {
                    y5aVar = null;
                }
                if (y5aVar != null) {
                    y5a.b(y5aVar, yd2Var, rectF.left, rectF.right, fP);
                }
            }
        }
        float fJ = wtiVar.d(yd2Var) ? j(yd2Var) : MTTypesetterKt.kLineSkipLimitMultiplier;
        y5a y5aVar2 = this.a;
        if (y5aVar2 != null) {
            y5a.c(y5aVar2, yd2Var, ovk.g(pa1Var, yd2Var) ? rectF2.right - (g(yd2Var) / 2.0f) : rectF2.left + (g(yd2Var) / 2.0f), rectF2.top - fJ, rectF2.bottom + fJ);
        }
    }

    @Override // defpackage.od1
    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof xti)) {
            return false;
        }
        xti xtiVar = (xti) obj;
        return this.m == xtiVar.m && this.n == xtiVar.n && x44.r(this.o, xtiVar.o);
    }

    @Override // defpackage.od1
    public final ra1 h() {
        return this.l;
    }

    @Override // defpackage.od1
    public final int hashCode() {
        return this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + (super.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.od1, defpackage.be2
    /* JADX INFO: renamed from: m */
    public final void b(ge2 ge2Var, sp0 sp0Var, float f, ed2 ed2Var) {
        ge2 ge2Var2;
        Float fValueOf;
        float fI;
        ge2Var.getClass();
        ed2Var.getClass();
        nd1 nd1Var = this.g;
        if (!(nd1Var instanceof nd1)) {
            wg6.i();
            return;
        }
        Float fValueOf2 = null;
        CharSequence charSequence = this.i;
        if (charSequence != null) {
            ge2Var2 = ge2Var;
            fValueOf = Float.valueOf(wdh.f(this.h, ge2Var2, charSequence, 0, (int) this.k.height(), 90.0f, 36));
        } else {
            ge2Var2 = ge2Var;
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        int iOrdinal = this.m.ordinal();
        pa1 pa1Var = this.l;
        if (iOrdinal == 0) {
            Iterator it = this.o.g(ge2Var2, f, q(ge2Var), pa1Var).iterator();
            if (it.hasNext()) {
                double dDoubleValue = ((Number) it.next()).doubleValue();
                ke2 ke2Var = this.c;
                CharSequence charSequenceE = kzj.e(ke2Var, ge2Var2, dDoubleValue, pa1Var);
                wdh wdhVar = this.b;
                float f2 = wdh.f(wdhVar, ge2Var2, charSequenceE, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier, 44);
                while (it.hasNext()) {
                    f2 = Math.max(f2, wdh.f(wdhVar, ge2Var2, kzj.e(ke2Var, ge2Var2, ((Number) it.next()).doubleValue(), pa1Var), 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier, 44));
                }
                fValueOf2 = Float.valueOf(f2);
            }
            float fCeil = (float) Math.ceil(fValueOf2 != null ? fValueOf2.floatValue() : 0.0f);
            this.p = Float.valueOf(fCeil);
            fI = i(ge2Var) + fCeil;
        } else {
            if (iOrdinal != 1) {
                wg6.i();
                return;
            }
            fI = 0.0f;
        }
        float fD0 = wd6.d0(g(ge2Var) + fI + fFloatValue, ge2Var2.b(MTTypesetterKt.kLineSkipLimitMultiplier), ge2Var2.b(nd1Var.a));
        if (x44.r(pa1Var, pa1.a)) {
            sp0.b(sp0Var, fD0, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
        } else if (x44.r(pa1Var, oa1.a)) {
            sp0.b(sp0Var, MTTypesetterKt.kLineSkipLimitMultiplier, fD0, 1);
        } else {
            wg6.i();
        }
    }

    @Override // defpackage.od1
    public final void n(ge2 ge2Var, oub oubVar) {
        ge2Var.getClass();
        oubVar.getClass();
    }

    public final boolean o() {
        pa1 pa1Var = pa1.a;
        pa1 pa1Var2 = this.l;
        boolean zR = x44.r(pa1Var2, pa1Var);
        vti vtiVar = this.m;
        if (zR && vtiVar == vti.E) {
            return true;
        }
        return x44.r(pa1Var2, oa1.a) && vtiVar == vti.F;
    }

    public final float p(yd2 yd2Var, float f, double d) {
        return (d == yd2Var.a.d().e(this.l).b && this.o.d(yd2Var)) ? -(f / 2.0f) : f / 2.0f;
    }

    public final float q(ge2 ge2Var) {
        Float fValueOf;
        ge2Var.getClass();
        wti wtiVar = this.o;
        pa1 pa1Var = this.l;
        Iterator it = wtiVar.c(ge2Var, pa1Var).iterator();
        if (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue();
            ke2 ke2Var = this.c;
            CharSequence charSequenceE = kzj.e(ke2Var, ge2Var, dDoubleValue, pa1Var);
            wdh wdhVar = this.b;
            float fD = wdh.d(wdhVar, ge2Var, charSequenceE, 0, MTTypesetterKt.kLineSkipLimitMultiplier, 44);
            while (it.hasNext()) {
                fD = Math.max(fD, wdh.d(wdhVar, ge2Var, kzj.e(ke2Var, ge2Var, ((Number) it.next()).doubleValue(), pa1Var), 0, MTTypesetterKt.kLineSkipLimitMultiplier, 44));
            }
            fValueOf = Float.valueOf(fD);
        } else {
            fValueOf = null;
        }
        return fValueOf != null ? fValueOf.floatValue() : MTTypesetterKt.kLineSkipLimitMultiplier;
    }
}
