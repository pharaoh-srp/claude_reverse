package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class egd extends jv8 {
    public final String b;
    public final byte[] c;

    public egd(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || egd.class != obj.getClass()) {
            return false;
        }
        egd egdVar = (egd) obj;
        return this.b.equals(egdVar.b) && Arrays.equals(this.c, egdVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + kgh.l(527, 31, this.b);
    }

    @Override // defpackage.jv8
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
