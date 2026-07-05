package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fo0 implements go0 {
    public final /* synthetic */ int E;

    @Override // defpackage.go0
    public final void j(cz5 cz5Var, int i, int[] iArr, fu9 fu9Var, int[] iArr2) {
        int i2 = this.E;
        fu9 fu9Var2 = fu9.E;
        int i3 = 0;
        switch (i2) {
            case 0:
                if (fu9Var == fu9Var2) {
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    int i6 = i - i4;
                    int length = iArr.length;
                    int i7 = 0;
                    while (i3 < length) {
                        int i8 = iArr[i3];
                        iArr2[i7] = i6;
                        i6 += i8;
                        i3++;
                        i7++;
                    }
                } else {
                    for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                        int i9 = iArr[length2];
                        iArr2[length2] = i3;
                        i3 += i9;
                    }
                }
                break;
            default:
                if (fu9Var == fu9Var2) {
                    int length3 = iArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i3 < length3) {
                        int i12 = iArr[i3];
                        iArr2[i10] = i11;
                        i11 += i12;
                        i3++;
                        i10++;
                    }
                } else {
                    int length4 = iArr.length;
                    int i13 = 0;
                    while (i3 < length4) {
                        i13 += iArr[i3];
                        i3++;
                    }
                    int i14 = i - i13;
                    for (int length5 = iArr.length - 1; -1 < length5; length5--) {
                        int i15 = iArr[length5];
                        iArr2[length5] = i14;
                        i14 += i15;
                    }
                }
                break;
        }
    }

    public final String toString() {
        switch (this.E) {
            case 0:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
