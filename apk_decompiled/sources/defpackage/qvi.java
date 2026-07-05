package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class qvi {
    public static final String[] d = {"id", "name"};
    public final String a;
    public final String b;
    public final Map c;

    public qvi(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvi)) {
            return false;
        }
        qvi qviVar = (qvi) obj;
        return this.a.equals(qviVar.a) && x44.r(this.b, qviVar.b) && this.c.equals(qviVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return qy1.i(kgh.r("Account(id=", this.a, ", name=", this.b, ", additionalProperties="), this.c, ")");
    }
}
