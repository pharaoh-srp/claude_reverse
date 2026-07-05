package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xp9 implements vh6 {
    public final wp9 a;

    public xp9(wp9 wp9Var) {
        this.a = wp9Var;
    }

    @Override // defpackage.kl7, defpackage.mb0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final jsi a(c9i c9iVar) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        wp9 wp9Var = this.a;
        xub xubVar = wp9Var.b;
        wub wubVar = new wub(xubVar.e + 2);
        xub xubVar2 = new xub(xubVar.e);
        int[] iArr3 = xubVar.b;
        Object[] objArr3 = xubVar.c;
        long[] jArr = xubVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            vp9 vp9Var = (vp9) objArr3[i6];
                            wubVar.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            xubVar2.i(i7, new isi((sb0) c9iVar.a().invoke(vp9Var.a), vp9Var.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!xubVar.a(0)) {
            int i8 = wubVar.b;
            if (i8 < 0) {
                gtk.h("Index must be between 0 and size");
                throw null;
            }
            wubVar.b(i8 + 1);
            int[] iArr4 = wubVar.a;
            int i9 = wubVar.b;
            if (i9 != 0) {
                mp0.r0(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            wubVar.b++;
        }
        if (!xubVar.a(wp9Var.a)) {
            wubVar.a(wp9Var.a);
        }
        int i10 = wubVar.b;
        if (i10 != 0) {
            int[] iArr5 = wubVar.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new jsi(wubVar, xubVar2, wp9Var.a, wi6.d);
    }
}
