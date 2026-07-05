package defpackage;

import com.google.re2j.PatternSyntaxException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class wtc {
    public static final int[][] g = {new int[]{0, 1114111, 1}};
    public int a;
    public int b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;

    public wtc(String str, int i) {
        this.d = new vsc();
        this.b = 0;
        this.f = new HashMap();
        this.c = str;
        this.a = i;
    }

    public static boolean a(wtc wtcVar) {
        return Objects.equals(((jw7) wtcVar.c).o, "audio/raw");
    }

    public static void d(kde kdeVar) {
        if (kdeVar.a == 4) {
            int[] iArr = kdeVar.d;
            int length = iArr.length;
            if (length >= 4) {
                at.n(0, length - 2, iArr);
                int i = 2;
                for (int i2 = 2; i2 < length; i2 += 2) {
                    int i3 = iArr[i2];
                    int i4 = iArr[i2 + 1];
                    int i5 = i - 1;
                    int i6 = iArr[i5];
                    if (i3 > i6 + 1) {
                        iArr[i] = i3;
                        iArr[i + 1] = i4;
                        i += 2;
                    } else if (i4 > i6) {
                        iArr[i5] = i4;
                    }
                }
                length = i;
            }
            if (length != iArr.length) {
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                iArr = iArr2;
            }
            kdeVar.d = iArr;
            if (iArr.length == 2 && iArr[0] == 0 && iArr[1] == 1114111) {
                kdeVar.d = null;
                kdeVar.a = 6;
            } else if (iArr.length == 4 && iArr[0] == 0 && iArr[1] == 9 && iArr[2] == 11 && iArr[3] == 1114111) {
                kdeVar.d = null;
                kdeVar.a = 5;
            }
        }
    }

    public static boolean h(kde kdeVar) {
        int i = kdeVar.a;
        return (i == 3 && kdeVar.d.length == 1) || i == 4 || i == 5 || i == 6;
    }

    public static void k(kde kdeVar, kde kdeVar2) {
        int iF = sq6.F(kdeVar.a);
        int i = 0;
        if (iF == 2) {
            int i2 = kdeVar2.d[0];
            int i3 = kdeVar.d[0];
            if (i2 == i3 && kdeVar2.b == kdeVar.b) {
                return;
            }
            kdeVar.a = 4;
            at atVar = new at(2);
            if ((kdeVar.b & 1) != 0) {
                atVar.b(i3, i3);
            } else {
                atVar.d(i3, i3);
            }
            int i4 = kdeVar2.d[0];
            if ((kdeVar2.b & 1) != 0) {
                atVar.b(i4, i4);
            } else {
                atVar.d(i4, i4);
            }
            kdeVar.d = atVar.r();
            return;
        }
        if (iF == 3) {
            int i5 = kdeVar2.a;
            int[] iArr = kdeVar.d;
            if (i5 == 3) {
                at atVar2 = new at(iArr);
                int i6 = kdeVar2.d[0];
                if ((kdeVar2.b & 1) != 0) {
                    atVar2.b(i6, i6);
                } else {
                    atVar2.d(i6, i6);
                }
                kdeVar.d = atVar2.r();
                return;
            }
            at atVar3 = new at(iArr);
            int[] iArr2 = kdeVar2.d;
            while (i < iArr2.length) {
                atVar3.d(iArr2[i], iArr2[i + 1]);
                i += 2;
            }
            kdeVar.d = atVar3.r();
            return;
        }
        if (iF != 4) {
            return;
        }
        int iF2 = sq6.F(kdeVar2.a);
        if (iF2 == 2) {
            int[] iArr3 = kdeVar2.d;
            if (iArr3.length != 1 || iArr3[0] != 10) {
                return;
            }
        } else if (iF2 == 3) {
            while (true) {
                int[] iArr4 = kdeVar2.d;
                if (i >= iArr4.length) {
                    return;
                }
                if (iArr4[i] <= 10 && 10 <= iArr4[i + 1]) {
                    break;
                } else {
                    i += 2;
                }
            }
        } else if (iF2 == 4 || iF2 != 5) {
            return;
        }
        kdeVar.a = 6;
    }

    public static int n(ep1 ep1Var, int i) {
        if (ep1Var.e()) {
            return ep1Var.c('\\') ? o(ep1Var) : ep1Var.h();
        }
        throw new PatternSyntaxException("missing closing ]", ep1Var.a(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r6.g() <= 55) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int o(defpackage.ep1 r6) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtc.o(ep1):int");
    }

    public static int p(ep1 ep1Var) {
        int iG;
        int i = ep1Var.c;
        while (ep1Var.e() && (iG = ep1Var.g()) >= 48 && iG <= 57) {
            ep1Var.j(1);
        }
        String strA = ep1Var.a(i);
        if (strA.isEmpty()) {
            return -1;
        }
        if (strA.length() > 1 && strA.charAt(0) == '0') {
            return -1;
        }
        if (strA.length() > 8) {
            return -2;
        }
        return Integer.valueOf(strA, 10).intValue();
    }

    public static kde[] y(kde[] kdeVarArr, int i, int i2) {
        kde[] kdeVarArr2 = new kde[i2 - i];
        for (int i3 = i; i3 < i2; i3++) {
            kdeVarArr2[i3 - i] = kdeVarArr[i3];
        }
        return kdeVarArr2;
    }

    public void b() {
        kde[] kdeVarArrT = t();
        if (kdeVarArrT.length > 0) {
            d(kdeVarArrT[kdeVarArrT.length - 1]);
        }
        if (kdeVarArrT.length == 0) {
            u(l(1));
        } else {
            u(e(kdeVarArrT, 19));
        }
    }

    public long c(int i, int i2) {
        int i3;
        epk epkVar = (epk) this.c;
        int[] iArr = (int[]) epkVar.E;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = (int[]) epkVar.F;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            d39.a("width must be >= 0");
        }
        return sl4.h(i3, i3, 0, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.kde e(defpackage.kde[] r19, int r20) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtc.e(kde[], int):kde");
    }

    public void f() {
        j(-1, 0);
        kde[] kdeVarArrT = t();
        if (kdeVarArrT.length == 0) {
            u(l(2));
        } else {
            u(e(kdeVarArrT, 18));
        }
    }

    public fx9 g(int i) {
        iv7 iv7VarB = ((ix9) this.e).b(i);
        int i2 = iv7VarB.a;
        int size = iv7VarB.b.size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.a) ? 0 : this.b;
        ex9[] ex9VarArr = new ex9[size];
        int i5 = 0;
        while (true) {
            List list = iv7VarB.b;
            if (i3 >= size) {
                return new fx9(i, ex9VarArr, (epk) this.f, list, i4);
            }
            int i6 = (int) ((za8) list.get(i3)).a;
            int i7 = i4;
            ex9 ex9VarL0 = ((bx9) this.d).L0(c(i5, i6), i2 + i3, i5, i6, i7);
            i5 += i6;
            ex9VarArr[i3] = ex9VarL0;
            i3++;
            i4 = i7;
        }
    }

    public void i(int i) {
        int i2 = this.a;
        kde kdeVarL = l(3);
        kdeVarL.b = i2;
        if ((i2 & 1) != 0 && i >= 65 && i <= 66639) {
            int i3 = i;
            for (int iG = xzk.G(i); iG != i; iG = xzk.G(iG)) {
                if (i3 > iG) {
                    i3 = iG;
                }
            }
            i = i3;
        }
        kdeVarL.d = new int[]{i};
        u(kdeVarL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean j(int i, int i2) {
        vsc vscVar = (vsc) this.d;
        int size = vscVar.size();
        if (size >= 2) {
            kde kdeVar = (kde) vscVar.get(size - 1);
            kde kdeVar2 = (kde) vscVar.get(size - 2);
            if (kdeVar.a == 3 && kdeVar2.a == 3 && (kdeVar.b & 1) == (kdeVar2.b & 1)) {
                int[] iArr = kdeVar2.d;
                int[] iArr2 = kdeVar.d;
                int[] iArr3 = new int[iArr.length + iArr2.length];
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                kdeVar2.d = iArr3;
                if (i >= 0) {
                    kdeVar.d = new int[]{i};
                    kdeVar.b = i2;
                    return true;
                }
                s();
                x(kdeVar);
            }
        }
        return false;
    }

    public kde l(int i) {
        kde[] kdeVarArr;
        kde kdeVar = (kde) this.e;
        if (kdeVar == null || (kdeVarArr = kdeVar.c) == null || kdeVarArr.length <= 0) {
            return new kde(i);
        }
        this.e = kdeVarArr[0];
        kdeVar.b = 0;
        kdeVar.c = kde.j;
        kdeVar.d = null;
        kdeVar.f = 0;
        kdeVar.e = 0;
        kdeVar.g = 0;
        kdeVar.h = null;
        kdeVar.a = i;
        return kdeVar;
    }

    public kde m(int i) {
        kde kdeVarL = l(i);
        kdeVarL.b = this.a;
        return u(kdeVarL);
    }

    public boolean q(ep1 ep1Var, at atVar) {
        int i = ep1Var.c;
        if ((this.a & 64) != 0 && ep1Var.e() && ep1Var.h() == 92 && ep1Var.e()) {
            ep1Var.h();
            ii2 ii2Var = (ii2) ii2.c.get(ep1Var.a(i));
            if (ii2Var != null) {
                atVar.c(ii2Var, (this.a & 1) != 0);
                return true;
            }
        }
        return false;
    }

    public boolean r(ep1 ep1Var, at atVar) {
        String strSubstring;
        epk epkVar;
        epk epkVar2;
        int i = ep1Var.c;
        if ((this.a & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0 || !(ep1Var.d("\\p") || ep1Var.d("\\P"))) {
            return false;
        }
        ep1Var.j(1);
        int i2 = ep1Var.h() == 80 ? -1 : 1;
        if (!ep1Var.e()) {
            ep1Var.c = i;
            throw new PatternSyntaxException("invalid character class range", ep1Var.i());
        }
        int iH = ep1Var.h();
        if (iH != 123) {
            char c = (char) iH;
            strSubstring = iH == c ? String.valueOf(c) : new String(Character.toChars(c));
        } else {
            String strI = ep1Var.i();
            int iIndexOf = strI.indexOf(125);
            if (iIndexOf < 0) {
                ep1Var.c = i;
                throw new PatternSyntaxException("invalid character class range", ep1Var.i());
            }
            strSubstring = strI.substring(0, iIndexOf);
            ep1Var.c = strSubstring.length() + ep1Var.c;
            ep1Var.j(1);
        }
        if (!strSubstring.isEmpty() && strSubstring.charAt(0) == '^') {
            i2 = -i2;
            strSubstring = strSubstring.substring(1);
        }
        if (strSubstring.equals("Any")) {
            int[][] iArr = g;
            epkVar = new epk(iArr, iArr);
        } else {
            int[][] iArr2 = (int[][]) eei.D1.get(strSubstring);
            if (iArr2 != null) {
                epkVar2 = new epk(iArr2, eei.N1.get(strSubstring));
            } else {
                int[][] iArr3 = (int[][]) eei.E1.get(strSubstring);
                if (iArr3 != null) {
                    epkVar2 = new epk(iArr3, eei.I1.get(strSubstring));
                } else {
                    epkVar = null;
                }
            }
            epkVar = epkVar2;
        }
        if (epkVar == null) {
            throw new PatternSyntaxException("invalid character class range", ep1Var.a(i));
        }
        int[][] iArr4 = (int[][]) epkVar.E;
        int[][] iArr5 = (int[][]) epkVar.F;
        if ((this.a & 1) != 0 && iArr5 != null) {
            at atVar2 = new at(2);
            atVar2.e(iArr4);
            atVar2.e(iArr5);
            atVar2.f();
            atVar.a(i2, atVar2.r());
            return true;
        }
        if (i2 >= 0) {
            atVar.e(iArr4);
            return true;
        }
        int i3 = 0;
        for (int[] iArr6 : iArr4) {
            int i4 = iArr6[0];
            int i5 = iArr6[1];
            int i6 = iArr6[2];
            if (i6 == 1) {
                int i7 = i4 - 1;
                if (i3 <= i7) {
                    atVar.d(i3, i7);
                }
                i3 = i5 + 1;
            } else {
                while (i4 <= i5) {
                    int i8 = i4 - 1;
                    if (i3 <= i8) {
                        atVar.d(i3, i8);
                    }
                    i3 = i4 + 1;
                    i4 += i6;
                }
            }
        }
        if (i3 <= 1114111) {
            atVar.d(i3, 1114111);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kde s() {
        return (kde) ((vsc) this.d).remove(r1.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kde[] t() {
        vsc vscVar = (vsc) this.d;
        int size = vscVar.size();
        int i = size;
        while (i > 0 && sq6.F(((kde) vscVar.get(i - 1)).a) < 19) {
            i--;
        }
        kde[] kdeVarArr = (kde[]) vscVar.subList(i, size).toArray(new kde[size - i]);
        vscVar.removeRange(i, size);
        return kdeVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.kde u(defpackage.kde r9) {
        /*
            r8 = this;
            int r0 = r9.a
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 4
            if (r0 != r5) goto L33
            int[] r6 = r9.d
            int r7 = r6.length
            if (r7 != r2) goto L33
            r7 = r6[r4]
            r6 = r6[r3]
            if (r7 != r6) goto L33
            int r0 = r8.a
            r0 = r0 & (-2)
            boolean r0 = r8.j(r7, r0)
            if (r0 == 0) goto L1f
            goto L8c
        L1f:
            r9.a = r1
            int[] r0 = r9.d
            r0 = r0[r4]
            int[] r0 = new int[]{r0}
            r9.d = r0
            int r0 = r8.a
            r0 = r0 & (-2)
            r9.b = r0
            goto La4
        L33:
            if (r0 != r5) goto L5a
            int[] r0 = r9.d
            int r6 = r0.length
            if (r6 != r5) goto L5a
            r6 = r0[r4]
            r7 = r0[r3]
            if (r6 != r7) goto L5a
            r7 = r0[r2]
            r0 = r0[r1]
            if (r7 != r0) goto L5a
            int r0 = defpackage.xzk.G(r6)
            int[] r6 = r9.d
            r6 = r6[r2]
            if (r0 != r6) goto L5a
            int r0 = defpackage.xzk.G(r6)
            int[] r6 = r9.d
            r6 = r6[r4]
            if (r0 == r6) goto L7f
        L5a:
            int r0 = r9.a
            if (r0 != r5) goto La0
            int[] r0 = r9.d
            int r5 = r0.length
            if (r5 != r2) goto La0
            r2 = r0[r4]
            int r5 = r2 + 1
            r0 = r0[r3]
            if (r5 != r0) goto La0
            int r0 = defpackage.xzk.G(r2)
            int[] r2 = r9.d
            r2 = r2[r3]
            if (r0 != r2) goto La0
            int r0 = defpackage.xzk.G(r2)
            int[] r2 = r9.d
            r2 = r2[r4]
            if (r0 != r2) goto La0
        L7f:
            int[] r0 = r9.d
            r0 = r0[r4]
            int r2 = r8.a
            r2 = r2 | r3
            boolean r0 = r8.j(r0, r2)
            if (r0 == 0) goto L8e
        L8c:
            r8 = 0
            return r8
        L8e:
            r9.a = r1
            int[] r0 = r9.d
            r0 = r0[r4]
            int[] r0 = new int[]{r0}
            r9.d = r0
            int r0 = r8.a
            r0 = r0 | r3
            r9.b = r0
            goto La4
        La0:
            r0 = -1
            r8.j(r0, r4)
        La4:
            java.lang.Object r8 = r8.d
            vsc r8 = (defpackage.vsc) r8
            r8.add(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtc.u(kde):kde");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.kde v(defpackage.kde r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.a
            r1 = 18
            r2 = 2
            if (r0 != r1) goto L3c
            kde[] r1 = r8.c
            int r3 = r1.length
            if (r3 <= 0) goto L3c
            r0 = 0
            r1 = r1[r0]
            kde r9 = r7.v(r1, r9)
            kde[] r1 = r8.c
            r1[r0] = r9
            int r0 = r9.a
            if (r0 != r2) goto L58
            r7.x(r9)
            kde[] r9 = r8.c
            int r0 = r9.length
            if (r0 == 0) goto L36
            r1 = 1
            if (r0 == r1) goto L36
            if (r0 == r2) goto L30
            int r7 = r9.length
            kde[] r7 = y(r9, r1, r7)
            r8.c = r7
            return r8
        L30:
            r9 = r9[r1]
            r7.x(r8)
            return r9
        L36:
            r8.a = r2
            r7 = 0
            r8.c = r7
            return r8
        L3c:
            r7 = 3
            if (r0 != r7) goto L58
            int[] r7 = r8.d
            int r0 = r7.length
            int r1 = r0 - r9
            int[] r3 = new int[r1]
            r4 = r9
        L47:
            if (r4 >= r0) goto L52
            int r5 = r4 - r9
            r6 = r7[r4]
            r3[r5] = r6
            int r4 = r4 + 1
            goto L47
        L52:
            r8.d = r3
            if (r1 != 0) goto L58
            r8.a = r2
        L58:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wtc.v(kde, int):kde");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(int i, int i2, int i3, int i4, ep1 ep1Var, int i5) {
        vsc vscVar = (vsc) this.d;
        int i6 = this.a;
        if ((i6 & 64) != 0) {
            if (ep1Var.e() && ep1Var.c('?')) {
                ep1Var.j(1);
                i6 ^= 32;
            }
            if (i5 != -1) {
                throw new PatternSyntaxException("invalid nested repetition operator", ep1Var.a(i5));
            }
        }
        int size = vscVar.size();
        if (size == 0) {
            throw new PatternSyntaxException("missing argument to repetition operator", ep1Var.a(i4));
        }
        int i7 = size - 1;
        kde kdeVar = (kde) vscVar.get(i7);
        if (sq6.F(kdeVar.a) >= 19) {
            throw new PatternSyntaxException("missing argument to repetition operator", ep1Var.a(i4));
        }
        kde kdeVarL = l(i);
        kdeVarL.e = i2;
        kdeVarL.f = i3;
        kdeVarL.b = i6;
        kdeVarL.c = new kde[]{kdeVar};
        vscVar.set(i7, kdeVarL);
    }

    public void x(kde kdeVar) {
        kde[] kdeVarArr = kdeVar.c;
        if (kdeVarArr != null && kdeVarArr.length > 0) {
            kdeVarArr[0] = (kde) this.e;
        }
        this.e = kdeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean z() {
        vsc vscVar = (vsc) this.d;
        int size = vscVar.size();
        if (size >= 3 && ((kde) vscVar.get(size - 2)).a == 21) {
            int i = size - 1;
            if (h((kde) vscVar.get(i))) {
                int i2 = size - 3;
                if (h((kde) vscVar.get(i2))) {
                    kde kdeVar = (kde) vscVar.get(i);
                    kde kdeVar2 = (kde) vscVar.get(i2);
                    if (sq6.F(kdeVar.a) > sq6.F(kdeVar2.a)) {
                        vscVar.set(i2, kdeVar);
                    } else {
                        kdeVar2 = kdeVar;
                        kdeVar = kdeVar2;
                    }
                    k(kdeVar, kdeVar2);
                    x(kdeVar2);
                    s();
                    return true;
                }
            }
        }
        if (size < 2) {
            return false;
        }
        int i3 = size - 1;
        kde kdeVar3 = (kde) vscVar.get(i3);
        int i4 = size - 2;
        kde kdeVar4 = (kde) vscVar.get(i4);
        if (kdeVar4.a != 21) {
            return false;
        }
        if (size >= 3) {
            d((kde) vscVar.get(size - 3));
        }
        vscVar.set(i4, kdeVar3);
        vscVar.set(i3, kdeVar4);
        return true;
    }

    public wtc(epk epkVar, int i, int i2, bx9 bx9Var, ix9 ix9Var) {
        this.f = epkVar;
        this.c = epkVar;
        this.a = i;
        this.b = i2;
        this.d = bx9Var;
        this.e = ix9Var;
    }

    public wtc(jw7 jw7Var, jw7 jw7Var2, int i, int i2, f51 f51Var, h51 h51Var) {
        this.c = jw7Var;
        this.d = jw7Var2;
        this.a = i;
        this.b = i2;
        this.e = f51Var;
        this.f = h51Var;
    }
}
