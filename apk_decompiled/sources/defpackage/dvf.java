package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dvf implements fvf {
    public final String a;

    public dvf(String str) {
        str.getClass();
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvf) && x44.r(this.a, ((dvf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("ToolApprovalResolved(toolUseId=", this.a, ")");
    }
}
