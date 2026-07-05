package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hab {
    public final String a;

    public hab(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hab) && this.a.equals(((hab) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return vb7.s(new StringBuilder("MemberSignature(signature="), this.a, ')');
    }
}
