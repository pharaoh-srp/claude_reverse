package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yoe extends ape {
    public final long a;

    public yoe(long j) {
        this.a = j;
    }

    @Override // defpackage.ape
    public final vh9 a() {
        return new vh9(Long.valueOf(this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yoe) && this.a == ((yoe) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return grc.q(this.a, "Long(item=", ")");
    }
}
