package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ewe {
    public final List a;
    public final long b;
    public final d8a c;

    /* JADX WARN: Multi-variable type inference failed */
    public ewe(AbstractList abstractList, long j) {
        ArrayList arrayListA0;
        ArrayList arrayListA02;
        char c;
        char c2;
        char c3;
        char c4;
        zc5 zc5Var;
        zc5 zc5Var2;
        List list;
        char c5;
        char c6;
        abstractList.getClass();
        this.a = abstractList;
        this.b = j;
        d8a d8aVarE = x44.E();
        char c7 = 5;
        char c8 = 4;
        char c9 = 3;
        char c10 = 2;
        if (abstractList.size() <= 0 || ((kf7) abstractList.get(0)).a.size() != 3) {
            arrayListA0 = null;
            arrayListA02 = null;
        } else {
            zc5 zc5Var3 = (zc5) ((kf7) abstractList.get(0)).a.get(1);
            float[] fArr = zc5Var3.a;
            long jA = so7.a((zc5Var3.a() * 0.125f) + (fArr[4] * 0.375f) + (fArr[2] * 0.375f) + (fArr[0] * 0.125f), (zc5Var3.b() * 0.125f) + (fArr[5] * 0.375f) + (fArr[3] * 0.375f) + (fArr[1] * 0.125f));
            float[] fArr2 = zc5Var3.a;
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = fArr2[2] * 0.5f;
            float f4 = fArr2[3] * 0.5f;
            zc5 zc5VarC = mpk.c(f, f2, f3 + (f * 0.5f), f4 + (f2 * 0.5f), (fArr2[4] * 0.25f) + (f * 0.25f) + f3, (fArr2[5] * 0.25f) + (f2 * 0.25f) + f4, yfd.E(jA), yfd.F(jA));
            zc5 zc5VarC2 = mpk.c(yfd.E(jA), yfd.F(jA), (zc5Var3.a() * 0.25f) + (fArr2[4] * 0.5f) + (fArr2[2] * 0.25f), (zc5Var3.b() * 0.25f) + (fArr2[5] * 0.5f) + (fArr2[3] * 0.25f), (zc5Var3.a() * 0.5f) + (fArr2[4] * 0.5f), (zc5Var3.b() * 0.5f) + (fArr2[5] * 0.5f), zc5Var3.a(), zc5Var3.b());
            arrayListA02 = x44.a0(((kf7) abstractList.get(0)).a.get(0), zc5VarC);
            arrayListA0 = x44.a0(zc5VarC2, ((kf7) abstractList.get(0)).a.get(2));
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i = 0;
            zc5Var = null;
            zc5Var2 = null;
            while (true) {
                if (i == 0 && arrayListA0 != null) {
                    list = arrayListA0;
                } else if (i != this.a.size()) {
                    list = ((kf7) this.a.get(i)).a;
                } else {
                    if (arrayListA02 == null) {
                        c = c7;
                        c2 = c8;
                        c3 = c9;
                        c4 = c10;
                        break;
                    }
                    list = arrayListA02;
                }
                c = c7;
                int size2 = list.size();
                c2 = c8;
                int i2 = 0;
                while (i2 < size2) {
                    zc5 zc5Var4 = (zc5) list.get(i2);
                    if (zc5Var4.d()) {
                        c5 = c9;
                        if (zc5Var2 != null) {
                            float[] fArr3 = zc5Var2.a;
                            c6 = c10;
                            float[] fArrCopyOf = Arrays.copyOf(fArr3, fArr3.length);
                            zc5 zc5Var5 = new zc5(fArrCopyOf);
                            fArrCopyOf[6] = zc5Var4.a();
                            fArrCopyOf[7] = zc5Var4.b();
                            zc5Var2 = zc5Var5;
                        } else {
                            c6 = c10;
                        }
                    } else {
                        if (zc5Var2 != null) {
                            d8aVarE.add(zc5Var2);
                        }
                        c5 = c9;
                        c6 = c10;
                        if (zc5Var == null) {
                            zc5Var = zc5Var4;
                            zc5Var2 = zc5Var;
                        } else {
                            zc5Var2 = zc5Var4;
                        }
                    }
                    i2++;
                    c9 = c5;
                    c10 = c6;
                }
                c3 = c9;
                c4 = c10;
                if (i == size) {
                    break;
                }
                i++;
                c7 = c;
                c8 = c2;
                c9 = c3;
                c10 = c4;
            }
        } else {
            c = 5;
            c2 = 4;
            c3 = 3;
            c4 = 2;
            zc5Var = null;
            zc5Var2 = null;
        }
        if (zc5Var2 == null || zc5Var == null) {
            d8aVarE.add(mpk.c(yfd.E(this.b), yfd.F(this.b), yfd.E(this.b), yfd.F(this.b), yfd.E(this.b), yfd.F(this.b), yfd.E(this.b), yfd.F(this.b)));
        } else {
            float[] fArr4 = zc5Var2.a;
            float f5 = fArr4[0];
            float f6 = fArr4[1];
            float f7 = fArr4[c4];
            float f8 = fArr4[c3];
            float f9 = fArr4[c2];
            float f10 = fArr4[c];
            float[] fArr5 = zc5Var.a;
            d8aVarE.add(mpk.c(f5, f6, f7, f8, f9, f10, fArr5[0], fArr5[1]));
        }
        d8a d8aVarV = x44.v(d8aVarE);
        this.c = d8aVarV;
        Object obj = d8aVarV.get(d8aVarV.size() - 1);
        int size3 = d8aVarV.size();
        int i3 = 0;
        while (i3 < size3) {
            zc5 zc5Var6 = (zc5) this.c.get(i3);
            zc5 zc5Var7 = (zc5) obj;
            if (Math.abs(zc5Var6.a[0] - zc5Var7.a()) > 1.0E-4f || Math.abs(zc5Var6.a[1] - zc5Var7.b()) > 1.0E-4f) {
                sz6.p("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
                throw null;
            }
            i3++;
            obj = zc5Var6;
        }
    }

    public final ewe a() {
        char c;
        char c2;
        char c3;
        char c4;
        char c5 = 4;
        float[] fArr = new float[4];
        d8a d8aVar = this.c;
        int size = d8aVar.size();
        float fMax = Float.MIN_VALUE;
        char c6 = 0;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        int i = 0;
        float fMax2 = Float.MIN_VALUE;
        while (i < size) {
            zc5 zc5Var = (zc5) d8aVar.get(i);
            zc5Var.getClass();
            boolean zD = zc5Var.d();
            char c7 = c5;
            float[] fArr2 = zc5Var.a;
            if (zD) {
                fArr[c6] = fArr2[c6];
                fArr[1] = fArr2[1];
                fArr[2] = fArr2[c6];
                fArr[3] = fArr2[1];
                c = c6;
                c2 = 2;
                c3 = 1;
                c4 = 3;
            } else {
                c = c6;
                float fMin3 = Math.min(fArr2[c6], zc5Var.a());
                c2 = 2;
                float fMin4 = Math.min(fArr2[1], zc5Var.b());
                c3 = 1;
                float fMax3 = Math.max(fArr2[c], zc5Var.a());
                float fMax4 = Math.max(fArr2[1], zc5Var.b());
                c4 = 3;
                fArr[c] = Math.min(fMin3, Math.min(fArr2[2], fArr2[c7]));
                fArr[1] = Math.min(fMin4, Math.min(fArr2[3], fArr2[5]));
                fArr[2] = Math.max(fMax3, Math.max(fArr2[2], fArr2[c7]));
                fArr[3] = Math.max(fMax4, Math.max(fArr2[3], fArr2[5]));
            }
            fMin = Math.min(fMin, fArr[c]);
            fMin2 = Math.min(fMin2, fArr[c3]);
            fMax = Math.max(fMax, fArr[c2]);
            fMax2 = Math.max(fMax2, fArr[c4]);
            i++;
            c5 = c7;
            c6 = c;
        }
        char c8 = c6;
        fArr[c8] = fMin;
        fArr[1] = fMin2;
        fArr[2] = fMax;
        fArr[3] = fMax2;
        float f = fMax - fMin;
        float f2 = fMax2 - fMin2;
        float fMax5 = Math.max(f, f2);
        return b(new dwe(((fMax5 - f) / 2.0f) - fArr[c8], fMax5, ((fMax5 - f2) / 2.0f) - fArr[1]));
    }

    public final ewe b(s7d s7dVar) {
        long j = this.b;
        long jA = s7dVar.a(yfd.E(j), yfd.F(j));
        long jA2 = so7.a(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
        d8a d8aVarE = x44.E();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d8aVarE.add(((kf7) list.get(i)).a(s7dVar));
        }
        return new ewe(x44.v(d8aVarE), jA2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewe)) {
            return false;
        }
        return x44.r(this.a, ((ewe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb.append(w44.S0(this.c, null, null, null, null, 63));
        sb.append(" || Features = ");
        sb.append(w44.S0(this.a, null, null, null, null, 63));
        sb.append(" || Center = (");
        long j = this.b;
        sb.append(yfd.E(j));
        sb.append(", ");
        sb.append(yfd.F(j));
        sb.append(")]");
        return sb.toString();
    }
}
