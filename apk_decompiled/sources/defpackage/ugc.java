package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ugc {
    public final String a;

    public ugc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugc) && this.a.equals(((ugc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vb7.s(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
