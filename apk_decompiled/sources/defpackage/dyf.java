package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dyf {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & 16) != 0) {
            return this.b[4];
        }
        return 65535;
    }

    public final void b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
