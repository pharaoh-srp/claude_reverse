package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class x5e implements y5e {
    public final byte[] a;

    public x5e(byte[] bArr) {
        this.a = bArr;
    }

    public final byte[] a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x5e) {
            return Arrays.equals(this.a, ((x5e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return ij0.j("Signed(signature=", Arrays.toString(this.a), ")");
    }
}
