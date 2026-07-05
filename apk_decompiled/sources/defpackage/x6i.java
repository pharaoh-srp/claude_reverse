package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x6i {
    public static final x6i e = new x6i(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final vz8 c;
    public Object[] d;

    public x6i(int i, int i2, Object[] objArr, vz8 vz8Var) {
        this.a = i;
        this.b = i2;
        this.c = vz8Var;
        this.d = objArr;
    }

    public static x6i j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, vz8 vz8Var) {
        if (i3 > 30) {
            return new x6i(0, 0, new Object[]{obj, obj2, obj3, obj4}, vz8Var);
        }
        int iM = ez1.M(i, i3);
        int iM2 = ez1.M(i2, i3);
        if (iM != iM2) {
            return new x6i((1 << iM) | (1 << iM2), 0, iM < iM2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, vz8Var);
        }
        return new x6i(0, 1 << iM, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, vz8Var)}, vz8Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, vz8 vz8Var) {
        Object obj3 = this.d[i];
        x6i x6iVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, vz8Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        mp0.v0(0, i, 6, objArr, objArr2);
        mp0.s0(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = x6iVarJ;
        mp0.s0(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        z69 z69VarA0 = wd6.A0(wd6.H0(0, this.d.length), 2);
        int i = z69VarA0.E;
        int i2 = z69VarA0.F;
        int i3 = z69VarA0.G;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!x44.r(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, Object obj, int i2) {
        int iM = 1 << ez1.M(i, i2);
        if (h(iM)) {
            return x44.r(obj, this.d[f(iM)]);
        }
        if (!i(iM)) {
            return false;
        }
        x6i x6iVarS = s(t(iM));
        return i2 == 30 ? x6iVarS.c(obj) : x6iVarS.d(i, obj, i2 + 5);
    }

    public final boolean e(x6i x6iVar) {
        if (this == x6iVar) {
            return true;
        }
        if (this.b == x6iVar.b && this.a == x6iVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == x6iVar.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, Object obj, int i2) {
        int iM = 1 << ez1.M(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            if (x44.r(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iM)) {
            return null;
        }
        x6i x6iVarS = s(t(iM));
        if (i2 != 30) {
            return x6iVarS.g(i, obj, i2 + 5);
        }
        z69 z69VarA0 = wd6.A0(wd6.H0(0, x6iVarS.d.length), 2);
        int i3 = z69VarA0.E;
        int i4 = z69VarA0.F;
        int i5 = z69VarA0.G;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!x44.r(obj, x6iVarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return x6iVarS.x(i3);
    }

    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    public final x6i k(int i, nyc nycVar) {
        nycVar.h(nycVar.J - 1);
        nycVar.H = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != nycVar.F) {
            return new x6i(0, 0, ez1.n(i, objArr), nycVar.F);
        }
        this.d = ez1.n(i, objArr);
        return this;
    }

    public final x6i l(int i, Object obj, Object obj2, int i2, nyc nycVar) {
        nyc nycVar2;
        x6i x6iVarL;
        int iM = 1 << ez1.M(i, i2);
        boolean zH = h(iM);
        vz8 vz8Var = this.c;
        if (zH) {
            int iF = f(iM);
            if (!x44.r(obj, this.d[iF])) {
                nycVar.h(nycVar.J + 1);
                vz8 vz8Var2 = nycVar.F;
                if (vz8Var != vz8Var2) {
                    return new x6i(this.a ^ iM, this.b | iM, a(iF, iM, i, obj, obj2, i2, vz8Var2), vz8Var2);
                }
                this.d = a(iF, iM, i, obj, obj2, i2, vz8Var2);
                this.a ^= iM;
                this.b |= iM;
                return this;
            }
            nycVar.H = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (vz8Var == nycVar.F) {
                this.d[iF + 1] = obj2;
                return this;
            }
            nycVar.I++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new x6i(this.a, this.b, objArrCopyOf, nycVar.F);
        }
        if (!i(iM)) {
            nycVar.h(nycVar.J + 1);
            vz8 vz8Var3 = nycVar.F;
            int iF2 = f(iM);
            Object[] objArr2 = this.d;
            if (vz8Var != vz8Var3) {
                return new x6i(this.a | iM, this.b, ez1.m(objArr2, iF2, obj, obj2), vz8Var3);
            }
            this.d = ez1.m(objArr2, iF2, obj, obj2);
            this.a |= iM;
            return this;
        }
        int iT = t(iM);
        x6i x6iVarS = s(iT);
        if (i2 == 30) {
            z69 z69VarA0 = wd6.A0(wd6.H0(0, x6iVarS.d.length), 2);
            int i3 = z69VarA0.E;
            int i4 = z69VarA0.F;
            int i5 = z69VarA0.G;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                nycVar.h(nycVar.J + 1);
                x6iVarL = new x6i(0, 0, ez1.m(x6iVarS.d, 0, obj, obj2), nycVar.F);
                nycVar2 = nycVar;
            } else {
                while (!x44.r(obj, x6iVarS.d[i3])) {
                    if (i3 == i4) {
                        nycVar.h(nycVar.J + 1);
                        x6iVarL = new x6i(0, 0, ez1.m(x6iVarS.d, 0, obj, obj2), nycVar.F);
                        break;
                    }
                    i3 += i5;
                }
                nycVar.H = x6iVarS.x(i3);
                if (x6iVarS.c == nycVar.F) {
                    x6iVarS.d[i3 + 1] = obj2;
                    x6iVarL = x6iVarS;
                } else {
                    nycVar.I++;
                    Object[] objArr3 = x6iVarS.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    x6iVarL = new x6i(0, 0, objArrCopyOf2, nycVar.F);
                }
                nycVar2 = nycVar;
            }
        } else {
            nycVar2 = nycVar;
            x6iVarL = x6iVarS.l(i, obj, obj2, i2 + 5, nycVar2);
        }
        return x6iVarS == x6iVarL ? this : r(iT, x6iVarL, nycVar2.F);
    }

    public final x6i m(x6i x6iVar, int i, bz5 bz5Var, nyc nycVar) {
        Object[] objArr;
        x6i x6iVarJ;
        if (this == x6iVar) {
            bz5Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            vz8 vz8Var = nycVar.F;
            int i3 = x6iVar.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + x6iVar.d.length);
            int length = this.d.length;
            z69 z69VarA0 = wd6.A0(wd6.H0(0, x6iVar.d.length), 2);
            int i4 = z69VarA0.E;
            int i5 = z69VarA0.F;
            int i6 = z69VarA0.G;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(x6iVar.d[i4])) {
                        bz5Var.a++;
                    } else {
                        Object[] objArr3 = x6iVar.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                return length == x6iVar.d.length ? x6iVar : length == objArrCopyOf.length ? new x6i(0, 0, objArrCopyOf, vz8Var) : new x6i(0, 0, Arrays.copyOf(objArrCopyOf, length), vz8Var);
            }
        } else {
            int i7 = this.b | x6iVar.b;
            int i8 = this.a;
            int i9 = x6iVar.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (x44.r(this.d[f(iLowestOneBit)], x6iVar.d[x6iVar.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                zad.b("Check failed.");
            }
            x6i x6iVar2 = (x44.r(this.c, nycVar.F) && this.a == i12 && this.b == i7) ? this : new x6i(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = x6iVar2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    x6iVarJ = s(t(iLowestOneBit2));
                    if (x6iVar.i(iLowestOneBit2)) {
                        x6iVarJ = x6iVarJ.m(x6iVar.s(x6iVar.t(iLowestOneBit2)), i + 5, bz5Var, nycVar);
                        objArr = objArr4;
                    } else if (x6iVar.h(iLowestOneBit2)) {
                        int iF = x6iVar.f(iLowestOneBit2);
                        Object obj = x6iVar.d[iF];
                        Object objX = x6iVar.x(iF);
                        int i15 = nycVar.J;
                        objArr = objArr4;
                        x6iVarJ = x6iVarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, nycVar);
                        if (nycVar.J == i15) {
                            bz5Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (x6iVar.i(iLowestOneBit2)) {
                        x6i x6iVarS = x6iVar.s(x6iVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (x6iVarS.d(obj2 != null ? obj2.hashCode() : 0, obj2, i16)) {
                                bz5Var.a++;
                                x6iVarJ = x6iVarS;
                            } else {
                                x6iVarJ = x6iVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, nycVar);
                            }
                        } else {
                            x6iVarJ = x6iVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = x6iVar.f(iLowestOneBit2);
                        Object obj4 = x6iVar.d[iF4];
                        x6iVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, x6iVar.x(iF4), i + 5, nycVar.F);
                    }
                }
                objArr[length2] = x6iVarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (x6iVar.h(iLowestOneBit3)) {
                    int iF5 = x6iVar.f(iLowestOneBit3);
                    Object[] objArr5 = x6iVar2.d;
                    objArr5[i18] = x6iVar.d[iF5];
                    objArr5[i18 + 1] = x6iVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        bz5Var.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = x6iVar2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(x6iVar2)) {
                return x6iVar.e(x6iVar2) ? x6iVar : x6iVar2;
            }
        }
        return this;
    }

    public final x6i n(int i, Object obj, int i2, nyc nycVar) {
        x6i x6iVarN;
        int iM = 1 << ez1.M(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            if (x44.r(obj, this.d[iF])) {
                return p(iF, iM, nycVar);
            }
        } else if (i(iM)) {
            int iT = t(iM);
            x6i x6iVarS = s(iT);
            if (i2 == 30) {
                z69 z69VarA0 = wd6.A0(wd6.H0(0, x6iVarS.d.length), 2);
                int i3 = z69VarA0.E;
                int i4 = z69VarA0.F;
                int i5 = z69VarA0.G;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    x6iVarN = x6iVarS;
                    break;
                }
                while (!x44.r(obj, x6iVarS.d[i3])) {
                    if (i3 == i4) {
                        x6iVarN = x6iVarS;
                        break;
                    }
                    i3 += i5;
                }
                x6iVarN = x6iVarS.k(i3, nycVar);
            } else {
                x6iVarN = x6iVarS.n(i, obj, i2 + 5, nycVar);
            }
            return q(x6iVarS, x6iVarN, iT, iM, nycVar.F);
        }
        return this;
    }

    public final x6i o(int i, Object obj, Object obj2, int i2, nyc nycVar) {
        nyc nycVar2;
        x6i x6iVarO;
        int iM = 1 << ez1.M(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            return (x44.r(obj, this.d[iF]) && x44.r(obj2, x(iF))) ? p(iF, iM, nycVar) : this;
        }
        if (!i(iM)) {
            return this;
        }
        int iT = t(iM);
        x6i x6iVarS = s(iT);
        if (i2 == 30) {
            z69 z69VarA0 = wd6.A0(wd6.H0(0, x6iVarS.d.length), 2);
            int i3 = z69VarA0.E;
            int i4 = z69VarA0.F;
            int i5 = z69VarA0.G;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                x6iVarO = x6iVarS;
                nycVar2 = nycVar;
            } else {
                while (true) {
                    if (!x44.r(obj, x6iVarS.d[i3]) || !x44.r(obj2, x6iVarS.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        x6iVarO = x6iVarS.k(i3, nycVar);
                        break;
                    }
                }
                x6iVarO = x6iVarS;
                nycVar2 = nycVar;
            }
        } else {
            nycVar2 = nycVar;
            x6iVarO = x6iVarS.o(i, obj, obj2, i2 + 5, nycVar2);
        }
        return q(x6iVarS, x6iVarO, iT, iM, nycVar2.F);
    }

    public final x6i p(int i, int i2, nyc nycVar) {
        nycVar.h(nycVar.J - 1);
        nycVar.H = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != nycVar.F) {
            return new x6i(i2 ^ this.a, this.b, ez1.n(i, objArr), nycVar.F);
        }
        this.d = ez1.n(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final x6i q(x6i x6iVar, x6i x6iVar2, int i, int i2, vz8 vz8Var) {
        vz8 vz8Var2 = this.c;
        if (x6iVar2 != null) {
            return (vz8Var2 == vz8Var || x6iVar != x6iVar2) ? r(i, x6iVar2, vz8Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (vz8Var2 != vz8Var) {
            return new x6i(this.a, this.b ^ i2, ez1.o(i, objArr), vz8Var);
        }
        this.d = ez1.o(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final x6i r(int i, x6i x6iVar, vz8 vz8Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && x6iVar.d.length == 2 && x6iVar.b == 0) {
            x6iVar.a = this.b;
            return x6iVar;
        }
        if (this.c == vz8Var) {
            objArr[i] = x6iVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = x6iVar;
        return new x6i(this.a, this.b, objArrCopyOf, vz8Var);
    }

    public final x6i s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (x6i) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r14.G = w(r7, r2, (defpackage.x6i) r14.G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.g11 u(int r14, java.lang.Object r15, java.lang.Object r16, int r17) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x6i.u(int, java.lang.Object, java.lang.Object, int):g11");
    }

    public final x6i v(int i, Object obj, int i2) {
        x6i x6iVarV;
        int iM = 1 << ez1.M(i, i2);
        if (h(iM)) {
            int iF = f(iM);
            if (!x44.r(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new x6i(this.a ^ iM, this.b, ez1.n(iF, objArr), null);
            }
        } else {
            if (!i(iM)) {
                return this;
            }
            int iT = t(iM);
            x6i x6iVarS = s(iT);
            if (i2 == 30) {
                z69 z69VarA0 = wd6.A0(wd6.H0(0, x6iVarS.d.length), 2);
                int i3 = z69VarA0.E;
                int i4 = z69VarA0.F;
                int i5 = z69VarA0.G;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    x6iVarV = x6iVarS;
                    break;
                }
                while (!x44.r(obj, x6iVarS.d[i3])) {
                    if (i3 == i4) {
                        x6iVarV = x6iVarS;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = x6iVarS.d;
                x6iVarV = objArr2.length == 2 ? null : new x6i(0, 0, ez1.n(i3, objArr2), null);
            } else {
                x6iVarV = x6iVarS.v(i, obj, i2 + 5);
            }
            if (x6iVarV != null) {
                return x6iVarS != x6iVarV ? w(iT, iM, x6iVarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new x6i(this.a, this.b ^ iM, ez1.o(iT, objArr3), null);
            }
        }
        return null;
    }

    public final x6i w(int i, int i2, x6i x6iVar) {
        Object[] objArr = x6iVar.d;
        if (objArr.length != 2 || x6iVar.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = x6iVar;
            return new x6i(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            x6iVar.a = this.b;
            return x6iVar;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        mp0.s0(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        mp0.s0(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new x6i(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
