package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class taf {
    public static final taf b;
    public final qz8 a;

    static {
        xzd xzdVar = new xzd(8, false);
        xzdVar.F = qz8.o(2, 1, 5);
        b = new taf(xzdVar);
    }

    public taf(xzd xzdVar) {
        this.a = (qz8) xzdVar.F;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof taf) && this.a.equals(((taf) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
