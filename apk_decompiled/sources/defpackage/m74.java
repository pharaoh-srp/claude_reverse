package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class m74 extends jv8 {
    public final String b;
    public final String c;
    public final String d;

    public m74(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m74.class != obj.getClass()) {
            return false;
        }
        m74 m74Var = (m74) obj;
        return this.c.equals(m74Var.c) && this.b.equals(m74Var.b) && Objects.equals(this.d, m74Var.d);
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(527, 31, this.b), 31, this.c);
        String str = this.d;
        return iL + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.jv8
    public final String toString() {
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
