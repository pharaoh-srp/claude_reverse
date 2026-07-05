package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w6i {
    public static final w6i e = new w6i(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final ql8 c;
    public Object[] d;

    public w6i(int i, int i2, Object[] objArr, ql8 ql8Var) {
        this.a = i;
        this.b = i2;
        this.c = ql8Var;
        this.d = objArr;
    }

    public static w6i k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, ql8 ql8Var) {
        if (i3 > 30) {
            return new w6i(0, 0, new Object[]{obj, obj2, obj3, obj4}, ql8Var);
        }
        int iZ = iv1.z(i, i3);
        int iZ2 = iv1.z(i2, i3);
        if (iZ != iZ2) {
            return new w6i((1 << iZ) | (1 << iZ2), 0, iZ < iZ2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, ql8Var);
        }
        return new w6i(0, 1 << iZ, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, ql8Var)}, ql8Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, ql8 ql8Var) {
        Object obj3 = this.d[i];
        w6i w6iVarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, w(i), i3, obj, obj2, i4 + 5, ql8Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        mp0.v0(0, i, 6, objArr, objArr2);
        mp0.s0(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = w6iVarK;
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

    public final int c(Object obj) {
        z69 z69VarA0 = wd6.A0(wd6.H0(0, this.d.length), 2);
        int i = z69VarA0.E;
        int i2 = z69VarA0.F;
        int i3 = z69VarA0.G;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return -1;
        }
        while (!x44.r(obj, this.d[i])) {
            if (i == i2) {
                return -1;
            }
            i += i3;
        }
        return i;
    }

    public final boolean d(int i, Object obj, int i2) {
        int iZ = 1 << iv1.z(i, i2);
        if (i(iZ)) {
            return x44.r(obj, this.d[f(iZ)]);
        }
        if (!j(iZ)) {
            return false;
        }
        w6i w6iVarS = s(t(iZ));
        return i2 == 30 ? w6iVarS.c(obj) != -1 : w6iVarS.d(i, obj, i2 + 5);
    }

    public final boolean e(w6i w6iVar) {
        if (this == w6iVar) {
            return true;
        }
        if (this.b == w6iVar.b && this.a == w6iVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == w6iVar.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(defpackage.w6i r8, defpackage.pz7 r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w6i.g(w6i, pz7):boolean");
    }

    public final Object h(int i, Object obj, int i2) {
        int iZ = 1 << iv1.z(i, i2);
        if (i(iZ)) {
            int iF = f(iZ);
            if (x44.r(obj, this.d[iF])) {
                return w(iF);
            }
            return null;
        }
        if (!j(iZ)) {
            return null;
        }
        w6i w6iVarS = s(t(iZ));
        if (i2 != 30) {
            return w6iVarS.h(i, obj, i2 + 5);
        }
        int iC = w6iVarS.c(obj);
        if (iC != -1) {
            return w6iVarS.w(iC);
        }
        return null;
    }

    public final boolean i(int i) {
        return (this.a & i) != 0;
    }

    public final boolean j(int i) {
        return (this.b & i) != 0;
    }

    public final w6i l(int i, myc mycVar) {
        mycVar.l(mycVar.d() - 1);
        mycVar.k(w(i));
        if (this.d.length == 2) {
            return null;
        }
        ql8 ql8VarH = mycVar.h();
        Object[] objArr = this.d;
        if (this.c != ql8VarH) {
            return new w6i(0, 0, iv1.j(i, objArr), mycVar.h());
        }
        this.d = iv1.j(i, objArr);
        return this;
    }

    public final w6i m(int i, Object obj, Object obj2, int i2, myc mycVar) {
        w6i w6iVarM;
        int iZ = 1 << iv1.z(i, i2);
        boolean zI = i(iZ);
        ql8 ql8Var = this.c;
        if (zI) {
            int iF = f(iZ);
            if (!x44.r(obj, this.d[iF])) {
                mycVar.l(mycVar.d() + 1);
                ql8 ql8VarH = mycVar.h();
                if (ql8Var != ql8VarH) {
                    return new w6i(this.a ^ iZ, this.b | iZ, a(iF, iZ, i, obj, obj2, i2, ql8VarH), ql8VarH);
                }
                this.d = a(iF, iZ, i, obj, obj2, i2, ql8VarH);
                this.a ^= iZ;
                this.b |= iZ;
                return this;
            }
            mycVar.k(w(iF));
            if (w(iF) != obj2) {
                if (ql8Var == mycVar.h()) {
                    this.d[iF + 1] = obj2;
                    return this;
                }
                mycVar.i(mycVar.f() + 1);
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF + 1] = obj2;
                return new w6i(this.a, this.b, objArrCopyOf, mycVar.h());
            }
        } else {
            if (!j(iZ)) {
                mycVar.l(mycVar.d() + 1);
                ql8 ql8VarH2 = mycVar.h();
                int iF2 = f(iZ);
                Object[] objArr2 = this.d;
                if (ql8Var != ql8VarH2) {
                    return new w6i(this.a | iZ, this.b, iv1.i(objArr2, iF2, obj, obj2), ql8VarH2);
                }
                this.d = iv1.i(objArr2, iF2, obj, obj2);
                this.a |= iZ;
                return this;
            }
            int iT = t(iZ);
            w6i w6iVarS = s(iT);
            if (i2 == 30) {
                int iC = w6iVarS.c(obj);
                if (iC != -1) {
                    mycVar.k(w6iVarS.w(iC));
                    if (w6iVarS.c == mycVar.h()) {
                        w6iVarS.d[iC + 1] = obj2;
                        w6iVarM = w6iVarS;
                    } else {
                        mycVar.i(mycVar.f() + 1);
                        Object[] objArr3 = w6iVarS.d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                        objArrCopyOf2[iC + 1] = obj2;
                        w6iVarM = new w6i(0, 0, objArrCopyOf2, mycVar.h());
                    }
                } else {
                    mycVar.l(mycVar.d() + 1);
                    w6iVarM = new w6i(0, 0, iv1.i(w6iVarS.d, 0, obj, obj2), mycVar.h());
                }
            } else {
                w6iVarM = w6iVarS.m(i, obj, obj2, i2 + 5, mycVar);
            }
            if (w6iVarS != w6iVarM) {
                return v(iT, iZ, mycVar.h(), w6iVarM);
            }
        }
        return this;
    }

    public final w6i n(w6i w6iVar, int i, az5 az5Var, myc mycVar) {
        w6i w6iVarK;
        w6iVar.getClass();
        if (this == w6iVar) {
            az5Var.b(b());
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            ql8 ql8VarH = mycVar.h();
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + w6iVar.d.length);
            int length = this.d.length;
            z69 z69VarA0 = wd6.A0(wd6.H0(0, w6iVar.d.length), 2);
            int i3 = z69VarA0.E;
            int i4 = z69VarA0.F;
            int i5 = z69VarA0.G;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(w6iVar.d[i3]) != -1) {
                        az5Var.c(az5Var.a() + 1);
                    } else {
                        Object[] objArr2 = w6iVar.d;
                        objArrCopyOf[length] = objArr2[i3];
                        objArrCopyOf[length + 1] = objArr2[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.d.length) {
                if (length != w6iVar.d.length) {
                    return length == objArrCopyOf.length ? new w6i(0, 0, objArrCopyOf, ql8VarH) : new w6i(0, 0, Arrays.copyOf(objArrCopyOf, length), ql8VarH);
                }
            }
            return this;
        }
        int i6 = this.b | w6iVar.b;
        int i7 = this.a;
        int i8 = w6iVar.a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            if (x44.r(this.d[f(iLowestOneBit)], w6iVar.d[w6iVar.f(iLowestOneBit)])) {
                i9 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i6 & i9) != 0) {
            sz6.j("Check failed.");
            return null;
        }
        w6i w6iVar2 = (x44.r(this.c, mycVar.h()) && this.a == i9 && this.b == i6) ? this : new w6i(i9, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i9) * 2)], null);
        int i11 = 0;
        while (i6 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i6);
            Object[] objArr3 = w6iVar2.d;
            int length2 = (objArr3.length - 1) - i11;
            if (j(iLowestOneBit2)) {
                w6iVarK = s(t(iLowestOneBit2));
                if (w6iVar.j(iLowestOneBit2)) {
                    w6iVarK = w6iVarK.n(w6iVar.s(w6iVar.t(iLowestOneBit2)), i + 5, az5Var, mycVar);
                } else if (w6iVar.i(iLowestOneBit2)) {
                    int iF = w6iVar.f(iLowestOneBit2);
                    Object obj = w6iVar.d[iF];
                    Object objW = w6iVar.w(iF);
                    int iD = mycVar.d();
                    w6iVarK = w6iVarK.m(obj != null ? obj.hashCode() : i2, obj, objW, i + 5, mycVar);
                    if (mycVar.d() == iD) {
                        az5Var.c(az5Var.a() + 1);
                    }
                }
            } else if (w6iVar.j(iLowestOneBit2)) {
                w6i w6iVarS = w6iVar.s(w6iVar.t(iLowestOneBit2));
                if (i(iLowestOneBit2)) {
                    int iF2 = f(iLowestOneBit2);
                    Object obj2 = this.d[iF2];
                    int iHashCode = obj2 != null ? obj2.hashCode() : i2;
                    int i12 = i + 5;
                    if (w6iVarS.d(iHashCode, obj2, i12)) {
                        az5Var.c(az5Var.a() + 1);
                        w6iVarK = w6iVarS;
                    } else {
                        w6iVarK = w6iVarS.m(obj2 != null ? obj2.hashCode() : 0, obj2, w(iF2), i12, mycVar);
                    }
                } else {
                    w6iVarK = w6iVarS;
                }
            } else {
                int iF3 = f(iLowestOneBit2);
                Object obj3 = this.d[iF3];
                Object objW2 = w(iF3);
                int iF4 = w6iVar.f(iLowestOneBit2);
                Object obj4 = w6iVar.d[iF4];
                w6iVarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, objW2, obj4 != null ? obj4.hashCode() : 0, obj4, w6iVar.w(iF4), i + 5, mycVar.h());
            }
            objArr3[length2] = w6iVarK;
            i11++;
            i6 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i13 = 0;
        while (i9 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i9);
            int i14 = i13 * 2;
            if (w6iVar.i(iLowestOneBit3)) {
                int iF5 = w6iVar.f(iLowestOneBit3);
                Object[] objArr4 = w6iVar2.d;
                objArr4[i14] = w6iVar.d[iF5];
                objArr4[i14 + 1] = w6iVar.w(iF5);
                if (i(iLowestOneBit3)) {
                    az5Var.c(az5Var.a() + 1);
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr5 = w6iVar2.d;
                objArr5[i14] = this.d[iF6];
                objArr5[i14 + 1] = w(iF6);
            }
            i13++;
            i9 ^= iLowestOneBit3;
        }
        if (!e(w6iVar2)) {
            return w6iVar.e(w6iVar2) ? w6iVar : w6iVar2;
        }
        return this;
    }

    public final w6i o(int i, Object obj, int i2, myc mycVar) {
        int iZ = 1 << iv1.z(i, i2);
        if (i(iZ)) {
            int iF = f(iZ);
            return x44.r(obj, this.d[iF]) ? q(iF, iZ, mycVar) : this;
        }
        if (!j(iZ)) {
            return this;
        }
        int iT = t(iZ);
        w6i w6iVarS = s(iT);
        if (i2 == 30) {
            int iC = w6iVarS.c(obj);
            if (iC != -1) {
                w6iVarS = w6iVarS.l(iC, mycVar);
            }
        } else {
            w6iVarS = w6iVarS.o(i, obj, i2 + 5, mycVar);
        }
        return r(iT, iZ, mycVar.h(), w6iVarS);
    }

    public final w6i p(int i, Object obj, Object obj2, int i2, myc mycVar) {
        myc mycVar2;
        int iZ = 1 << iv1.z(i, i2);
        if (i(iZ)) {
            int iF = f(iZ);
            return (x44.r(obj, this.d[iF]) && x44.r(obj2, w(iF))) ? q(iF, iZ, mycVar) : this;
        }
        if (!j(iZ)) {
            return this;
        }
        int iT = t(iZ);
        w6i w6iVarS = s(iT);
        if (i2 == 30) {
            int iC = w6iVarS.c(obj);
            if (iC != -1 && x44.r(obj2, w6iVarS.w(iC))) {
                w6iVarS = w6iVarS.l(iC, mycVar);
            }
            mycVar2 = mycVar;
        } else {
            mycVar2 = mycVar;
            w6iVarS = w6iVarS.p(i, obj, obj2, i2 + 5, mycVar2);
        }
        return r(iT, iZ, mycVar2.h(), w6iVarS);
    }

    public final w6i q(int i, int i2, myc mycVar) {
        mycVar.l(mycVar.d() - 1);
        mycVar.k(w(i));
        if (this.d.length == 2) {
            return null;
        }
        ql8 ql8VarH = mycVar.h();
        Object[] objArr = this.d;
        if (this.c != ql8VarH) {
            return new w6i(i2 ^ this.a, this.b, iv1.j(i, objArr), mycVar.h());
        }
        this.d = iv1.j(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final w6i r(int i, int i2, ql8 ql8Var, w6i w6iVar) {
        if (w6iVar != null) {
            return v(i, i2, ql8Var, w6iVar);
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != ql8Var) {
            Object[] objArr2 = new Object[objArr.length - 1];
            mp0.v0(0, i, 6, objArr, objArr2);
            mp0.s0(i, i + 1, objArr.length, objArr, objArr2);
            return new w6i(this.a, this.b ^ i2, objArr2, ql8Var);
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        mp0.v0(0, i, 6, objArr, objArr3);
        mp0.s0(i, i + 1, objArr.length, objArr, objArr3);
        this.d = objArr3;
        this.b ^= i2;
        return this;
    }

    public final w6i s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (w6i) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (r15 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (r15 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        r15.G = v(r7, r2, null, (defpackage.w6i) r15.G);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bb, code lost:
    
        return r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.g11 u(int r14, java.lang.Object r15, defpackage.r7a r16, int r17) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w6i.u(int, java.lang.Object, r7a, int):g11");
    }

    public final w6i v(int i, int i2, ql8 ql8Var, w6i w6iVar) {
        Object[] objArr = w6iVar.d;
        if (objArr.length != 2 || w6iVar.b != 0) {
            if (ql8Var != null && this.c == ql8Var) {
                this.d[i] = w6iVar;
                return this;
            }
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = w6iVar;
            return new w6i(this.a, this.b, objArrCopyOf, ql8Var);
        }
        if (this.d.length == 1) {
            w6iVar.a = this.b;
            return w6iVar;
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
        return new w6i(this.a ^ i2, this.b ^ i2, objArrCopyOf2, ql8Var);
    }

    public final Object w(int i) {
        return this.d[i + 1];
    }
}
