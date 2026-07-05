package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class c38 extends jv8 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public c38(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c38.class != obj.getClass()) {
            return false;
        }
        c38 c38Var = (c38) obj;
        return Objects.equals(this.b, c38Var.b) && this.c.equals(c38Var.c) && this.d.equals(c38Var.d) && Arrays.equals(this.e, c38Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + kgh.l(kgh.l((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // defpackage.jv8
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
