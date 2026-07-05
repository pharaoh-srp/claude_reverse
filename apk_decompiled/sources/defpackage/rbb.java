package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rbb {
    public final String a;
    public final List b;

    public rbb(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbb)) {
            return false;
        }
        rbb rbbVar = (rbb) obj;
        return this.a.equals(rbbVar.a) && this.b.equals(rbbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return y6a.o("MemoryFilesSection(title=", this.a, ", files=", this.b, ")");
    }
}
