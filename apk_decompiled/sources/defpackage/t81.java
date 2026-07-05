package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t81 {
    public final String a;
    public final String b;

    public t81(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            mr9.h("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t81)) {
            return false;
        }
        t81 t81Var = (t81) obj;
        return this.a.equals(t81Var.a) && this.b.equals(t81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return ij0.m(sb, this.b, "}");
    }
}
