package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ili extends jv8 {
    public final String b;
    public final String c;

    public ili(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ili.class != obj.getClass()) {
            return false;
        }
        ili iliVar = (ili) obj;
        return this.a.equals(iliVar.a) && Objects.equals(this.b, iliVar.b) && this.c.equals(iliVar.c);
    }

    public final int hashCode() {
        int iL = kgh.l(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iL + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.jv8
    public final String toString() {
        return this.a + ": url=" + this.c;
    }
}
