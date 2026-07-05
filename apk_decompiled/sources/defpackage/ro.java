package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ro implements so {
    public final String a;

    public ro(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro) && x44.r(this.a, ((ro) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("ToolApprovalResolved(requestId=", this.a, ")");
    }
}
