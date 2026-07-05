package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class n22 {
    public final byte[] a;

    public n22(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static n22 a(byte[] bArr) {
        if (bArr != null) {
            return new n22(bArr, bArr.length);
        }
        mr9.h("data must be non-null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n22) {
            return Arrays.equals(((n22) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "Bytes(" + psk.j(this.a) + ")";
    }
}
