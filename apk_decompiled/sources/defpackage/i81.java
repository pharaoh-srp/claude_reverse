package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class i81 {
    public final Iterable a;
    public final byte[] b;

    public i81(ArrayList arrayList, byte[] bArr) {
        this.a = arrayList;
        this.b = bArr;
    }

    public static qb5 a() {
        return new qb5();
    }

    public final Iterable b() {
        return this.a;
    }

    public final byte[] c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i81) {
            i81 i81Var = (i81) obj;
            if (this.a.equals(i81Var.a) && Arrays.equals(this.b, i81Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
