package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v6j {
    public final String a;
    public final List b;

    public v6j(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v6j)) {
            return false;
        }
        v6j v6jVar = (v6j) obj;
        return this.a.equals(v6jVar.a) && this.b.equals(v6jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return y6a.o("WebSearchQuery(query=", this.a, ", results=", this.b, ")");
    }
}
