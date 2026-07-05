package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zka implements Cloneable {
    public /* synthetic */ boolean E;
    public /* synthetic */ long[] F;
    public /* synthetic */ Object[] G;
    public /* synthetic */ int H;

    public zka(int i) {
        if (i == 0) {
            this.F = sf5.c;
            this.G = sf5.d;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.F = new long[i5];
        this.G = new Object[i5];
    }

    public final void a() {
        int i = this.H;
        Object[] objArr = this.G;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.H = 0;
        this.E = false;
    }

    public final Object b(long j) {
        Object obj;
        int i = sf5.i(this.F, this.H, j);
        if (i < 0 || (obj = this.G[i]) == zsj.d) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.E) {
            int i = this.H;
            long[] jArr = this.F;
            Object[] objArr = this.G;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != zsj.d) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.E = false;
            this.H = i2;
        }
        return sf5.i(this.F, this.H, j);
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        zka zkaVar = (zka) objClone;
        zkaVar.F = (long[]) this.F.clone();
        zkaVar.G = (Object[]) this.G.clone();
        return zkaVar;
    }

    public final long d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.H)) {
            gtk.f("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.E) {
            long[] jArr = this.F;
            Object[] objArr = this.G;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != zsj.d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.E = false;
            this.H = i3;
        }
        return this.F[i];
    }

    public final void f(long j, Object obj) {
        Object obj2 = zsj.d;
        int i = sf5.i(this.F, this.H, j);
        if (i >= 0) {
            this.G[i] = obj;
            return;
        }
        int i2 = ~i;
        int i3 = this.H;
        if (i2 < i3) {
            Object[] objArr = this.G;
            if (objArr[i2] == obj2) {
                this.F[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.E) {
            long[] jArr = this.F;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.G;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.E = false;
                this.H = i4;
                i2 = ~sf5.i(this.F, i4, j);
            }
        }
        int i6 = this.H;
        if (i6 >= this.F.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            this.F = Arrays.copyOf(this.F, i10);
            this.G = Arrays.copyOf(this.G, i10);
        }
        int i11 = this.H;
        if (i11 - i2 != 0) {
            long[] jArr2 = this.F;
            int i12 = i2 + 1;
            mp0.t0(jArr2, jArr2, i12, i2, i11);
            Object[] objArr3 = this.G;
            mp0.s0(i12, i2, this.H, objArr3, objArr3);
        }
        this.F[i2] = j;
        this.G[i2] = obj;
        this.H++;
    }

    public final void g(long j) {
        int i = sf5.i(this.F, this.H, j);
        if (i >= 0) {
            Object[] objArr = this.G;
            Object obj = objArr[i];
            Object obj2 = zsj.d;
            if (obj != obj2) {
                objArr[i] = obj2;
                this.E = true;
            }
        }
    }

    public final int h() {
        if (this.E) {
            int i = this.H;
            long[] jArr = this.F;
            Object[] objArr = this.G;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != zsj.d) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.E = false;
            this.H = i2;
        }
        return this.H;
    }

    public final Object i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.H)) {
            gtk.f("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.E) {
            long[] jArr = this.F;
            Object[] objArr = this.G;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != zsj.d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.E = false;
            this.H = i3;
        }
        return this.G[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.H * 28);
        sb.append('{');
        int i = this.H;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ zka(Object obj) {
        this(10);
    }
}
