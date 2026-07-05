package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jsi implements fsi {
    public final wub E;
    public final xub F;
    public final int G;
    public final vi6 H;
    public int[] I = esi.a;
    public float[] J;
    public sb0 K;
    public sb0 L;
    public sb0 M;
    public sb0 N;
    public float[] O;
    public float[] P;
    public tk5 Q;

    public jsi(wub wubVar, xub xubVar, int i, vi6 vi6Var) {
        this.E = wubVar;
        this.F = xubVar;
        this.G = i;
        this.H = vi6Var;
        float[] fArr = esi.b;
        this.J = fArr;
        this.O = fArr;
        this.P = fArr;
        this.Q = esi.c;
    }

    public final int b(int i) {
        int i2;
        wub wubVar = this.E;
        int i3 = wubVar.b;
        if (i3 <= 0) {
            gtk.h("");
            throw null;
        }
        int i4 = i3 - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = wubVar.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public final float c(int i, int i2, boolean z) {
        vi6 vi6Var;
        float f;
        wub wubVar = this.E;
        if (i >= wubVar.b - 1) {
            f = i2;
        } else {
            int iC = wubVar.c(i);
            int iC2 = wubVar.c(i + 1);
            if (i2 != iC) {
                int i3 = iC2 - iC;
                isi isiVar = (isi) this.F.b(iC);
                if (isiVar == null || (vi6Var = isiVar.b) == null) {
                    vi6Var = this.H;
                }
                float f2 = i3;
                float fA = vi6Var.a((i2 - iC) / f2);
                return z ? fA : ((f2 * fA) + iC) / 1000.0f;
            }
            f = iC;
        }
        return f / 1000.0f;
    }

    public final void d(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        float[] fArr;
        boolean z = this.Q != esi.c;
        sb0 sb0Var4 = this.K;
        xub xubVar = this.F;
        wub wubVar = this.E;
        if (sb0Var4 == null) {
            this.K = sb0Var.c();
            this.L = sb0Var3.c();
            int i = wubVar.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = wubVar.c(i2) / 1000.0f;
            }
            this.J = fArr2;
            int i3 = wubVar.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.I = iArr;
        }
        if (z) {
            if (this.Q != esi.c && x44.r(this.M, sb0Var) && x44.r(this.N, sb0Var2)) {
                return;
            }
            this.M = sb0Var;
            this.N = sb0Var2;
            int iB = sb0Var.b() + (sb0Var.b() % 2);
            this.O = new float[iB];
            this.P = new float[iB];
            int i5 = wubVar.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iC = wubVar.c(i6);
                isi isiVar = (isi) xubVar.b(iC);
                if (iC == 0 && isiVar == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = sb0Var.a(i7);
                    }
                } else if (iC == this.G && isiVar == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = sb0Var2.a(i8);
                    }
                } else {
                    isiVar.getClass();
                    sb0 sb0Var5 = isiVar.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = sb0Var5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.Q = new tk5(this.I, this.J, fArr3);
        }
    }

    @Override // defpackage.dsi
    public final sb0 f(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        long j2 = j / 1000000;
        int[] iArr = esi.a;
        long j3 = this.G;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return sb0Var3;
        }
        d(sb0Var, sb0Var2, sb0Var3);
        sb0 sb0Var4 = this.L;
        sb0Var4.getClass();
        int i = 0;
        if (this.Q != esi.c) {
            int i2 = (int) j4;
            float fC = c(b(i2), i2, false);
            float[] fArr = this.P;
            zn0[][] zn0VarArr = (zn0[][]) this.Q.F;
            float f = zn0VarArr[0][0].a;
            float f2 = zn0VarArr[zn0VarArr.length - 1][0].b;
            if (fC < f) {
                fC = f;
            }
            if (fC <= f2) {
                f2 = fC;
            }
            int length = fArr.length;
            boolean z = false;
            for (zn0[] zn0VarArr2 : zn0VarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    zn0 zn0Var = zn0VarArr2[i4];
                    if (f2 <= zn0Var.b) {
                        if (zn0Var.p) {
                            fArr[i3] = zn0Var.q;
                            fArr[i3 + 1] = zn0Var.r;
                        } else {
                            zn0Var.c(f2);
                            fArr[i3] = zn0Var.a();
                            fArr[i3 + 1] = zn0Var.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                sb0Var4.e(i, fArr[i]);
                i++;
            }
        } else {
            sb0 sb0VarP = p((j4 - 1) * 1000000, sb0Var, sb0Var2, sb0Var3);
            sb0 sb0VarP2 = p(j4 * 1000000, sb0Var, sb0Var2, sb0Var3);
            int iB = sb0VarP.b();
            while (i < iB) {
                sb0Var4.e(i, (sb0VarP.a(i) - sb0VarP2.a(i)) * 1000.0f);
                i++;
            }
        }
        return sb0Var4;
    }

    @Override // defpackage.fsi
    public final int k() {
        return 0;
    }

    @Override // defpackage.fsi
    public final int o() {
        return this.G;
    }

    @Override // defpackage.dsi
    public final sb0 p(long j, sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3) {
        sb0 sb0Var4;
        sb0 sb0Var5;
        zn0[][] zn0VarArr;
        sb0 sb0Var6 = sb0Var;
        long j2 = j / 1000000;
        int[] iArr = esi.a;
        int i = this.G;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        xub xubVar = this.F;
        isi isiVar = (isi) xubVar.b(i2);
        if (isiVar != null) {
            return isiVar.a;
        }
        if (i2 >= i) {
            return sb0Var2;
        }
        if (i2 <= 0) {
            return sb0Var6;
        }
        d(sb0Var6, sb0Var2, sb0Var3);
        sb0 sb0Var7 = this.K;
        sb0Var7.getClass();
        int i3 = 0;
        if (this.Q != esi.c) {
            float fC = c(b(i2), i2, false);
            float[] fArr = this.O;
            zn0[][] zn0VarArr2 = (zn0[][]) this.Q.F;
            int length = zn0VarArr2.length - 1;
            float f = zn0VarArr2[0][0].a;
            float f2 = zn0VarArr2[length][0].b;
            int length2 = fArr.length;
            if (fC < f || fC > f2) {
                if (fC > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fC - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    zn0 zn0Var = zn0VarArr2[length][i5];
                    boolean z = zn0Var.p;
                    float f4 = zn0Var.r;
                    float f5 = zn0Var.q;
                    if (z) {
                        float f6 = zn0Var.a;
                        float f7 = zn0Var.k;
                        float f8 = zn0Var.c;
                        zn0VarArr = zn0VarArr2;
                        fArr[i4] = (f5 * f3) + sq6.k(zn0Var.e, f8, (f - f6) * f7, f8);
                        float f9 = (f - f6) * f7;
                        float f10 = zn0Var.d;
                        fArr[i4 + 1] = (f4 * f3) + sq6.k(zn0Var.f, f10, f9, f10);
                    } else {
                        zn0VarArr = zn0VarArr2;
                        zn0Var.c(f);
                        fArr[i4] = (zn0Var.a() * f3) + (zn0Var.n * zn0Var.h) + f5;
                        fArr[i4 + 1] = (zn0Var.b() * f3) + (zn0Var.o * zn0Var.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    zn0VarArr2 = zn0VarArr;
                }
            } else {
                int length3 = zn0VarArr2.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        zn0 zn0Var2 = zn0VarArr2[i6][i8];
                        if (fC <= zn0Var2.b) {
                            if (zn0Var2.p) {
                                float f11 = zn0Var2.a;
                                float f12 = zn0Var2.k;
                                float f13 = zn0Var2.c;
                                fArr[i7] = sq6.k(zn0Var2.e, f13, (fC - f11) * f12, f13);
                                float f14 = zn0Var2.d;
                                fArr[i7 + 1] = sq6.k(zn0Var2.f, f14, (fC - f11) * f12, f14);
                            } else {
                                zn0Var2.c(fC);
                                fArr[i7] = (zn0Var2.n * zn0Var2.h) + zn0Var2.q;
                                fArr[i7 + 1] = (zn0Var2.o * zn0Var2.i) + zn0Var2.r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                sb0Var7.e(i9, fArr[i9]);
            }
        } else {
            int iB = b(i2);
            float fC2 = c(iB, i2, true);
            wub wubVar = this.E;
            isi isiVar2 = (isi) xubVar.b(wubVar.c(iB));
            if (isiVar2 != null && (sb0Var5 = isiVar2.a) != null) {
                sb0Var6 = sb0Var5;
            }
            isi isiVar3 = (isi) xubVar.b(wubVar.c(iB + 1));
            if (isiVar3 == null || (sb0Var4 = isiVar3.a) == null) {
                sb0Var4 = sb0Var2;
            }
            int iB2 = sb0Var7.b();
            for (int i10 = 0; i10 < iB2; i10++) {
                sb0Var7.e(i10, (sb0Var4.a(i10) * fC2) + ((1.0f - fC2) * sb0Var6.a(i10)));
            }
        }
        return sb0Var7;
    }
}
