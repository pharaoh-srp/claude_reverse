package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class luf implements fvf {
    public final String a;

    public luf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof luf) && this.a.equals(((luf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ij0.j("ControlResponse(requestId=", this.a, ")");
    }
}
