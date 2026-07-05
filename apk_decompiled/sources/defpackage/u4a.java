package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u4a extends vxi {
    public final xub b;

    public u4a() {
        xub xubVar = x69.a;
        this.b = new xub();
    }

    @Override // defpackage.vxi
    public final void d() {
        xub xubVar = this.b;
        int[] iArr = xubVar.b;
        Object[] objArr = xubVar.c;
        long[] jArr = xubVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        qvb qvbVar = (qvb) objArr[i4];
                        Object[] objArr2 = qvbVar.a;
                        int i6 = qvbVar.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            t4a t4aVar = (t4a) objArr2[i7];
                            za2 za2Var = t4aVar.d;
                            if (za2Var != null) {
                                za2Var.cancel();
                            }
                            t4aVar.d = null;
                            aqa aqaVar = (aqa) t4aVar.a.F;
                            aqaVar.F = true;
                            aqaVar.E = false;
                            aqaVar.a();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
