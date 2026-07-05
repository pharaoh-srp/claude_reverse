package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g91 {
    public final String a;
    public final byte[] b;
    public final agd c;

    public g91(String str, byte[] bArr, agd agdVar) {
        this.a = str;
        this.b = bArr;
        this.c = agdVar;
    }

    public static fj0 a() {
        fj0 fj0Var = new fj0();
        fj0Var.G = agd.E;
        return fj0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g91) {
            g91 g91Var = (g91) obj;
            if (this.a.equals(g91Var.a)) {
                if (Arrays.equals(this.b, g91Var instanceof g91 ? g91Var.b : g91Var.b) && this.c.equals(g91Var.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return ij0.m(sb, strEncodeToString, ")");
    }
}
