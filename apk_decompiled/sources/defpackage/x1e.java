package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x1e {
    public static final byte[] c = new byte[0];
    public final byte[] a;
    public final byte[] b;

    public x1e(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x1e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        x1e x1eVar = (x1e) obj;
        return Arrays.equals(this.a, x1eVar.a) && Arrays.equals(this.b, x1eVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ij0.l("RawBatchEvent(data=", Arrays.toString(this.a), ", metadata=", Arrays.toString(this.b), ")");
    }
}
