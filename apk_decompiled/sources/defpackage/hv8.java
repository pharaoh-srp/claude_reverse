package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class hv8 implements fjb {
    public final byte[] a;
    public final String b;
    public final String c;

    public hv8(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.fjb
    public final void b(m7b m7bVar) {
        String str = this.b;
        if (str != null) {
            m7bVar.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hv8.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((hv8) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return vb7.l(this.a.length, "\"", kgh.r("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""));
    }
}
