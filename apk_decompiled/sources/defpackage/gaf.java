package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gaf implements o5b {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean[] f;
    public final /* synthetic */ nwb g;

    public gaf(List list, int i, int[] iArr, float f, float f2, boolean[] zArr, nwb nwbVar) {
        this.a = list;
        this.b = i;
        this.c = iArr;
        this.d = f;
        this.e = f2;
        this.f = zArr;
        this.g = nwbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        int iM0;
        int[] iArr;
        int i;
        int[] iArr2;
        int i2;
        q5bVar.getClass();
        list.getClass();
        final int size = this.a.size();
        int size2 = list.size();
        int i3 = this.b;
        if (size2 != size * i3) {
            sz6.j("Check failed.");
            return null;
        }
        int i4 = 0;
        int i5 = this.c[0];
        int iM02 = q5bVar.M0(32.0f);
        float f = this.d;
        if (va6.b(f, Float.POSITIVE_INFINITY)) {
            iM0 = Integer.MAX_VALUE;
        } else {
            iM0 = q5bVar.M0(f);
            if (iM0 < iM02) {
                iM0 = iM02;
            }
        }
        if (i5 != Integer.MAX_VALUE) {
            iM0 = wd6.e0(i5 - q5bVar.M0(48.0f), iM02, iM0);
        }
        long jB = sl4.b(0, iM0, 0, 0, 13);
        final c3d[] c3dVarArr = new c3d[list.size()];
        int[] iArr3 = new int[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            iArr3[i6] = iM02;
        }
        final int[] iArr4 = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            int i8 = i4;
            while (i8 < i3) {
                int i9 = (i7 * i3) + i8;
                int i10 = i4;
                c3d c3dVarU = ((h5b) list.get(i9)).u(jB);
                c3dVarArr[i9] = c3dVarU;
                int i11 = c3dVarU.E;
                if (i11 > iArr3[i8]) {
                    iArr3[i8] = i11;
                }
                int i12 = c3dVarU.F;
                if (i12 > iArr4[i7]) {
                    iArr4[i7] = i12;
                }
                i8++;
                i4 = i10;
            }
        }
        int i13 = i4;
        float f2 = this.e;
        float f3 = (i3 + 1) * f2;
        int iL = mwa.L(mp0.V0(iArr3) + f3);
        if (i5 == Integer.MAX_VALUE || iL >= i5) {
            iArr = iArr3;
            i = iL;
        } else {
            int iV0 = mp0.V0(iArr3);
            if (iV0 < 1) {
                iV0 = 1;
            }
            int iL2 = i5 - mwa.L(f3);
            int i14 = i13;
            int i15 = i14;
            while (i14 < i3) {
                if (i14 < i3 - 1) {
                    iArr2 = iArr3;
                    i2 = (int) ((((long) iArr3[i14]) * ((long) iL2)) / ((long) iV0));
                } else {
                    iArr2 = iArr3;
                    i2 = iL2 - i15;
                }
                iArr2[i14] = i2;
                i15 += i2;
                i14++;
                iArr3 = iArr2;
            }
            iArr = iArr3;
            i = i5;
        }
        this.f[i13] = (i5 == Integer.MAX_VALUE || i <= i5) ? i13 : true;
        int i16 = size + 1;
        int iL3 = mwa.L((f2 * i16) + mp0.V0(iArr4));
        final int i17 = this.b;
        final float[] fArr = new float[i17 + 1];
        final float[] fArr2 = new float[i16];
        final float f4 = this.e;
        final nwb nwbVar = this.g;
        final int[] iArr5 = iArr;
        return q5bVar.U(i, iL3, nm6.E, new bz7() { // from class: faf
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i18;
                b3d b3dVar = (b3d) obj;
                b3dVar.getClass();
                float f5 = f4;
                float f6 = f5;
                int i19 = 0;
                while (true) {
                    int i20 = size;
                    float[] fArr3 = fArr2;
                    float[] fArr4 = fArr;
                    if (i19 >= i20) {
                        fArr3[i20] = f6 - (f5 / 2.0f);
                        nwbVar.setValue(new d3h(fArr3, fArr4));
                        return iei.a;
                    }
                    float f7 = f5 / 2.0f;
                    fArr3[i19] = f6 - f7;
                    float f8 = f5;
                    int i21 = 0;
                    while (true) {
                        i18 = i17;
                        if (i21 >= i18) {
                            break;
                        }
                        if (i19 == 0) {
                            fArr4[i21] = f8 - f7;
                        }
                        c3d c3dVar = c3dVarArr[(i18 * i19) + i21];
                        c3dVar.getClass();
                        b3dVar.f(c3dVar, mwa.L(f8), mwa.L(f6), MTTypesetterKt.kLineSkipLimitMultiplier);
                        f8 += iArr5[i21] + f5;
                        i21++;
                    }
                    if (i19 == 0) {
                        fArr4[i18] = f8 - f7;
                    }
                    f6 += iArr4[i19] + f5;
                    i19++;
                }
            }
        });
    }
}
