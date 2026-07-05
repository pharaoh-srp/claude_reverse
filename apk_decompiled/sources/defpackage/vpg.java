package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vpg extends wpg {
    public final v6j a;
    public final long b;

    public vpg(v6j v6jVar, long j) {
        this.a = v6jVar;
        this.b = j;
    }

    @Override // defpackage.wpg
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpg)) {
            return false;
        }
        vpg vpgVar = (vpg) obj;
        return this.a.equals(vpgVar.a) && this.b == vpgVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebSearch(query=" + this.a + ", timestamp=" + this.b + ")";
    }
}
