package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class br5 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final kri c = new kri();
    public ro6 d;
    public int e;
    public int f;
    public long g;

    public final long a(xd7 xd7Var, int i) {
        byte[] bArr = this.a;
        xd7Var.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
