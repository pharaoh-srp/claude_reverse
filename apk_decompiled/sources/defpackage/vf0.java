package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class vf0 extends jv8 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public vf0(int i, String str, String str2, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.fjb
    public final void b(m7b m7bVar) {
        m7bVar.a(this.e, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vf0.class != obj.getClass()) {
            return false;
        }
        vf0 vf0Var = (vf0) obj;
        return this.d == vf0Var.d && this.b.equals(vf0Var.b) && Objects.equals(this.c, vf0Var.c) && Arrays.equals(this.e, vf0Var.e);
    }

    public final int hashCode() {
        int iL = kgh.l((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((iL + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.jv8
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
