package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class oic extends ln7 {
    public static final oic d = new oic(1, 0, 2);

    @Override // defpackage.ln7
    public final void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        int[] iArr;
        y08 y08Var;
        int iC;
        int iA = gjcVar.a(0);
        if (vagVar.n != 0) {
            pd4.a("Cannot move a group while inserting");
        }
        if (iA < 0) {
            pd4.a("Parameter offset is out of bounds");
        }
        if (iA == 0) {
            return;
        }
        int i = vagVar.t;
        int i2 = vagVar.v;
        int i3 = vagVar.u;
        int i4 = i;
        while (true) {
            iArr = vagVar.b;
            if (iA <= 0) {
                break;
            }
            i4 += iArr[(vagVar.r(i4) * 5) + 3];
            if (i4 > i3) {
                pd4.a("Parameter offset is out of bounds");
            }
            iA--;
        }
        int i5 = iArr[(vagVar.r(i4) * 5) + 3];
        int iG = vagVar.g(vagVar.r(vagVar.t), vagVar.b);
        int iG2 = vagVar.g(vagVar.r(i4), vagVar.b);
        int i6 = i4 + i5;
        int iG3 = vagVar.g(vagVar.r(i6), vagVar.b);
        int i7 = iG3 - iG2;
        vagVar.x(i7, Math.max(vagVar.t - 1, 0));
        vagVar.w(i5);
        int[] iArr2 = vagVar.b;
        int iR = vagVar.r(i6) * 5;
        mp0.r0(vagVar.r(i) * 5, iR, (i5 * 5) + iR, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = vagVar.c;
            int iH = vagVar.h(iG2 + i7);
            System.arraycopy(objArr, iH, objArr, iG, vagVar.h(iG3 + i7) - iH);
        }
        int i8 = iG2 + i7;
        int i9 = i8 - iG;
        int i10 = vagVar.k;
        int i11 = vagVar.l;
        int length = vagVar.c.length;
        int i12 = vagVar.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iR2 = vagVar.r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iR2 * 5) + 4] = vag.i(vag.i(vagVar.g(iR2, iArr2) - i15, i12 < iR2 ? 0 : i10, i11, length), vagVar.k, vagVar.l, vagVar.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iP = vagVar.p();
        int iA2 = uag.a(vagVar.d, i6, iP);
        ArrayList arrayList = new ArrayList();
        if (iA2 >= 0) {
            while (iA2 < vagVar.d.size() && (iC = vagVar.c((y08Var = (y08) vagVar.d.get(iA2)))) >= i6 && iC < i16) {
                arrayList.add(y08Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            y08 y08Var2 = (y08) arrayList.get(i18);
            int iC2 = vagVar.c(y08Var2) + i17;
            if (iC2 >= vagVar.g) {
                y08Var2.a = -(iP - iC2);
            } else {
                y08Var2.a = iC2;
            }
            vagVar.d.add(uag.a(vagVar.d, iC2, iP), y08Var2);
        }
        if (vagVar.I(i6, i5)) {
            pd4.a("Unexpectedly removed anchors");
        }
        vagVar.m(i2, vagVar.u, i);
        if (i7 > 0) {
            vagVar.J(i8, i7, i6 - 1);
        }
    }
}
