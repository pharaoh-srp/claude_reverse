package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z05 {
    public final String a;
    public final List b;

    public z05(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z05)) {
            return false;
        }
        z05 z05Var = (z05) obj;
        return x44.r(this.a, z05Var.a) && x44.r(this.b, z05Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return y6a.o("ConwayToolGroup(namespace=", this.a, ", tools=", this.b, ")");
    }
}
