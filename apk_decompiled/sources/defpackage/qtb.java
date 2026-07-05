package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qtb {
    public final el5 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public qtb(el5 el5Var, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int iG;
        int i5;
        this.a = el5Var;
        this.b = i;
        if (rl4.j(j) != 0 || rl4.i(j) != 0) {
            c39.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) el5Var.I;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            erc ercVar = (erc) arrayList2.get(i6);
            b40 b40Var = ercVar.a;
            int iH = rl4.h(j);
            if (rl4.c(j)) {
                i4 = i6;
                iG = rl4.g(j) - ((int) Math.ceil(f));
                if (iG < 0) {
                    iG = 0;
                }
            } else {
                i4 = i6;
                iG = rl4.g(j);
            }
            i3 = 0;
            x30 x30Var = new x30(b40Var, this.b - i7, i2, sl4.b(0, iH, 0, iG, 5));
            float fB = x30Var.b() + f;
            wjh wjhVar = x30Var.d;
            int i8 = i7 + wjhVar.g;
            arrayList.add(new drc(x30Var, ercVar.b, ercVar.c, i7, i8, f, fB));
            if (!wjhVar.d) {
                if (i8 == this.b) {
                    i5 = i4;
                    if (i5 != x44.M((ArrayList) this.a.I)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i8;
                f = fB;
            }
            z = true;
            i7 = i8;
            f = fB;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = rl4.h(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = i3; i9 < size2; i9++) {
            drc drcVar = (drc) arrayList.get(i9);
            List list = drcVar.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i10 = i3; i10 < size3; i10++) {
                l9e l9eVar = (l9e) list.get(i10);
                arrayList4.add(l9eVar != null ? drcVar.a(l9eVar) : null);
            }
            b54.t0(arrayList3, arrayList4);
        }
        if (arrayList3.size() < ((List) this.a.F).size()) {
            int size4 = ((List) this.a.F).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i11 = i3; i11 < size4; i11++) {
                arrayList5.add(null);
            }
            arrayList3 = w44.a1(arrayList3, arrayList5);
        }
        this.g = arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j, float[] fArr) {
        j(kkh.g(j));
        k(kkh.f(j));
        bae baeVar = new bae();
        baeVar.E = 0;
        v40.t(this.h, j, new nu1(j, fArr, baeVar, new aae(), 1));
    }

    public final float b(int i) {
        l(i);
        ArrayList arrayList = this.h;
        drc drcVar = (drc) arrayList.get(v40.r(i, arrayList));
        x30 x30Var = drcVar.a;
        return x30Var.d.e(i - drcVar.d) + drcVar.f;
    }

    public final int c(int i, boolean z) {
        int iF;
        l(i);
        ArrayList arrayList = this.h;
        drc drcVar = (drc) arrayList.get(v40.r(i, arrayList));
        x30 x30Var = drcVar.a;
        int i2 = i - drcVar.d;
        wjh wjhVar = x30Var.d;
        if (z) {
            Layout layout = wjhVar.f;
            ThreadLocal threadLocal = bkh.a;
            if (layout.getEllipsisCount(i2) <= 0 || wjhVar.b != TextUtils.TruncateAt.END) {
                el5 el5VarC = wjhVar.c();
                Layout layout2 = (Layout) el5VarC.E;
                iF = el5VarC.C(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                iF = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            iF = wjhVar.f(i2);
        }
        return iF + drcVar.b;
    }

    public final int d(int i) {
        int length = ((zb0) this.a.E).F.length();
        ArrayList arrayList = this.h;
        drc drcVar = (drc) arrayList.get(i >= length ? x44.M(arrayList) : i < 0 ? 0 : v40.q(i, arrayList));
        return drcVar.a.d.f.getLineForOffset(drcVar.d(i)) + drcVar.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        drc drcVar = (drc) arrayList.get(v40.s(arrayList, f));
        int i = drcVar.c - drcVar.b;
        int i2 = drcVar.d;
        if (i == 0) {
            return i2;
        }
        x30 x30Var = drcVar.a;
        float f2 = f - drcVar.f;
        wjh wjhVar = x30Var.d;
        return wjhVar.f.getLineForVertical(((int) f2) - wjhVar.h) + i2;
    }

    public final float f(int i) {
        l(i);
        ArrayList arrayList = this.h;
        drc drcVar = (drc) arrayList.get(v40.r(i, arrayList));
        x30 x30Var = drcVar.a;
        return x30Var.d.g(i - drcVar.d) + drcVar.f;
    }

    public final int g(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        drc drcVar = (drc) arrayList.get(v40.s(arrayList, fIntBitsToFloat));
        int i2 = drcVar.c;
        int i3 = drcVar.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        x30 x30Var = drcVar.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - drcVar.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        wjh wjhVar = x30Var.d;
        int lineForVertical = wjhVar.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits))) - wjhVar.h);
        return wjhVar.f.getOffsetForHorizontal(lineForVertical, (wjhVar.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))) + i3;
    }

    public final long h(l9e l9eVar, int i, poc pocVar) {
        long jB;
        long j;
        float f = l9eVar.b;
        ArrayList arrayList = this.h;
        int iS = v40.s(arrayList, f);
        float f2 = ((drc) arrayList.get(iS)).g;
        float f3 = l9eVar.d;
        if (f2 >= f3 || iS == x44.M(arrayList)) {
            drc drcVar = (drc) arrayList.get(iS);
            return drcVar.b(drcVar.a.c(drcVar.c(l9eVar), i, pocVar), true);
        }
        int iS2 = v40.s(arrayList, f3);
        long jB2 = kkh.b;
        while (true) {
            jB = kkh.b;
            if (!kkh.c(jB2, jB) || iS > iS2) {
                break;
            }
            drc drcVar2 = (drc) arrayList.get(iS);
            jB2 = drcVar2.b(drcVar2.a.c(drcVar2.c(l9eVar), i, pocVar), true);
            iS++;
        }
        if (kkh.c(jB2, jB)) {
            return jB;
        }
        while (true) {
            j = kkh.b;
            if (!kkh.c(jB, j) || iS > iS2) {
                break;
            }
            drc drcVar3 = (drc) arrayList.get(iS2);
            jB = drcVar3.b(drcVar3.a.c(drcVar3.c(l9eVar), i, pocVar), true);
            iS2--;
        }
        return kkh.c(jB, j) ? jB2 : mwa.m((int) (jB2 >> 32), (int) (4294967295L & jB));
    }

    public final void i(fb2 fb2Var, long j, uzf uzfVar, qeh qehVar, yd6 yd6Var) {
        fb2Var.g();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            drc drcVar = (drc) arrayList.get(i);
            drcVar.a.f(fb2Var, j, uzfVar, qehVar, yd6Var);
            fb2Var.n(MTTypesetterKt.kLineSkipLimitMultiplier, drcVar.a.b());
        }
        fb2Var.p();
    }

    public final void j(int i) {
        zb0 zb0Var = (zb0) this.a.E;
        if (i < 0 || i >= zb0Var.F.length()) {
            StringBuilder sbU = vb7.u("offset(", i, ") is out of bounds [0, ");
            sbU.append(zb0Var.F.length());
            sbU.append(')');
            c39.a(sbU.toString());
        }
    }

    public final void k(int i) {
        zb0 zb0Var = (zb0) this.a.E;
        if (i < 0 || i > zb0Var.F.length()) {
            StringBuilder sbU = vb7.u("offset(", i, ") is out of bounds [0, ");
            sbU.append(zb0Var.F.length());
            sbU.append(']');
            c39.a(sbU.toString());
        }
    }

    public final void l(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        c39.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
