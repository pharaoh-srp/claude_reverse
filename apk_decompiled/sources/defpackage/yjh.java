package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yjh {
    public final xjh a;
    public final qtb b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public yjh(xjh xjhVar, qtb qtbVar, long j) {
        this.a = xjhVar;
        this.b = qtbVar;
        this.c = j;
        ArrayList arrayList = qtbVar.h;
        boolean zIsEmpty = arrayList.isEmpty();
        float fD = MTTypesetterKt.kLineSkipLimitMultiplier;
        this.d = zIsEmpty ? 0.0f : ((drc) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            drc drcVar = (drc) w44.U0(arrayList);
            fD = drcVar.a.d.d(r4.g - 1) + drcVar.f;
        }
        this.e = fD;
        this.f = qtbVar.g;
    }

    public final lne a(int i) {
        qtb qtbVar = this.b;
        qtbVar.k(i);
        int length = ((zb0) qtbVar.a.E).F.length();
        ArrayList arrayList = qtbVar.h;
        drc drcVar = (drc) arrayList.get(i == length ? x44.M(arrayList) : v40.q(i, arrayList));
        return drcVar.a.d.f.isRtlCharAt(drcVar.d(i)) ? lne.F : lne.E;
    }

    public final l9e b(int i) {
        float fI;
        float fI2;
        float fH;
        float fH2;
        qtb qtbVar = this.b;
        qtbVar.j(i);
        ArrayList arrayList = qtbVar.h;
        drc drcVar = (drc) arrayList.get(v40.q(i, arrayList));
        x30 x30Var = drcVar.a;
        int iD = drcVar.d(i);
        CharSequence charSequence = x30Var.e;
        if (iD < 0 || iD >= charSequence.length()) {
            StringBuilder sbU = vb7.u("offset(", iD, ") is out of bounds [0,");
            sbU.append(charSequence.length());
            sbU.append(')');
            c39.a(sbU.toString());
        }
        wjh wjhVar = x30Var.d;
        Layout layout = wjhVar.f;
        int lineForOffset = layout.getLineForOffset(iD);
        float fG = wjhVar.g(lineForOffset);
        float fE = wjhVar.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fH = wjhVar.i(iD, false);
                fH2 = wjhVar.i(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fH = wjhVar.h(iD, false);
                fH2 = wjhVar.h(iD + 1, true);
            } else {
                fI = wjhVar.i(iD, false);
                fI2 = wjhVar.i(iD + 1, true);
            }
            float f = fH;
            fI = fH2;
            fI2 = f;
        } else {
            fI = wjhVar.h(iD, false);
            fI2 = wjhVar.h(iD + 1, true);
        }
        RectF rectF = new RectF(fI, fG, fI2, fE);
        return drcVar.a(new l9e(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final l9e c(int i) {
        qtb qtbVar = this.b;
        qtbVar.k(i);
        int length = ((zb0) qtbVar.a.E).F.length();
        ArrayList arrayList = qtbVar.h;
        drc drcVar = (drc) arrayList.get(i == length ? x44.M(arrayList) : v40.q(i, arrayList));
        x30 x30Var = drcVar.a;
        int iD = drcVar.d(i);
        CharSequence charSequence = x30Var.e;
        wjh wjhVar = x30Var.d;
        if (iD < 0 || iD > charSequence.length()) {
            StringBuilder sbU = vb7.u("offset(", iD, ") is out of bounds [0,");
            sbU.append(charSequence.length());
            sbU.append(']');
            c39.a(sbU.toString());
        }
        float fH = wjhVar.h(iD, false);
        int lineForOffset = wjhVar.f.getLineForOffset(iD);
        return drcVar.a(new l9e(fH, wjhVar.g(lineForOffset), fH, wjhVar.e(lineForOffset)));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        qtb qtbVar = this.b;
        return f < qtbVar.d || qtbVar.c || ((float) ((int) (j & 4294967295L))) < qtbVar.e;
    }

    public final float e(int i, boolean z) {
        qtb qtbVar = this.b;
        qtbVar.k(i);
        int length = ((zb0) qtbVar.a.E).F.length();
        ArrayList arrayList = qtbVar.h;
        drc drcVar = (drc) arrayList.get(i == length ? x44.M(arrayList) : v40.q(i, arrayList));
        x30 x30Var = drcVar.a;
        int iD = drcVar.d(i);
        wjh wjhVar = x30Var.d;
        return z ? wjhVar.h(iD, false) : wjhVar.i(iD, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yjh) {
            yjh yjhVar = (yjh) obj;
            if (this.a.equals(yjhVar.a) && this.b == yjhVar.b && g79.b(this.c, yjhVar.c) && this.d == yjhVar.d && this.e == yjhVar.e && x44.r(this.f, yjhVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        qtb qtbVar = this.b;
        qtbVar.l(i);
        ArrayList arrayList = qtbVar.h;
        drc drcVar = (drc) arrayList.get(v40.r(i, arrayList));
        x30 x30Var = drcVar.a;
        int i2 = i - drcVar.d;
        wjh wjhVar = x30Var.d;
        return wjhVar.f.getLineLeft(i2) + (i2 == wjhVar.g + (-1) ? wjhVar.j : MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public final float g(int i) {
        qtb qtbVar = this.b;
        qtbVar.l(i);
        ArrayList arrayList = qtbVar.h;
        drc drcVar = (drc) arrayList.get(v40.r(i, arrayList));
        x30 x30Var = drcVar.a;
        int i2 = i - drcVar.d;
        wjh wjhVar = x30Var.d;
        return wjhVar.f.getLineRight(i2) + (i2 == wjhVar.g + (-1) ? wjhVar.k : MTTypesetterKt.kLineSkipLimitMultiplier);
    }

    public final int h(int i) {
        qtb qtbVar = this.b;
        qtbVar.l(i);
        ArrayList arrayList = qtbVar.h;
        drc drcVar = (drc) arrayList.get(v40.r(i, arrayList));
        x30 x30Var = drcVar.a;
        return x30Var.d.f.getLineStart(i - drcVar.d) + drcVar.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + vb7.b(this.e, vb7.b(this.d, vb7.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final lne i(int i) {
        qtb qtbVar = this.b;
        qtbVar.k(i);
        int length = ((zb0) qtbVar.a.E).F.length();
        ArrayList arrayList = qtbVar.h;
        drc drcVar = (drc) arrayList.get(i == length ? x44.M(arrayList) : v40.q(i, arrayList));
        x30 x30Var = drcVar.a;
        int iD = drcVar.d(i);
        wjh wjhVar = x30Var.d;
        return wjhVar.f.getParagraphDirection(wjhVar.f.getLineForOffset(iD)) == 1 ? lne.E : lne.F;
    }

    public final c40 j(int i, int i2) {
        qtb qtbVar = this.b;
        zb0 zb0Var = (zb0) qtbVar.a.E;
        if (i < 0 || i > i2 || i2 > zb0Var.F.length()) {
            StringBuilder sbV = vb7.v("Start(", ") or End(", i, i2, ") is out of range [0..");
            sbV.append(zb0Var.F.length());
            sbV.append("), or start > end!");
            c39.a(sbV.toString());
        }
        if (i == i2) {
            return f40.a();
        }
        c40 c40VarA = f40.a();
        v40.t(qtbVar.h, mwa.m(i, i2), new l59(c40VarA, i, i2, 3));
        return c40VarA;
    }

    public final long k(int i) {
        qtb qtbVar = this.b;
        qtbVar.k(i);
        int length = ((zb0) qtbVar.a.E).F.length();
        ArrayList arrayList = qtbVar.h;
        drc drcVar = (drc) arrayList.get(i == length ? x44.M(arrayList) : v40.q(i, arrayList));
        x30 x30Var = drcVar.a;
        int iD = drcVar.d(i);
        bi0 bi0VarJ = x30Var.d.j();
        return drcVar.b(mwa.m(tlk.h(bi0VarJ, iD), tlk.g(bi0VarJ, iD)), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + ((Object) g79.c(this.c)) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ')';
    }
}
