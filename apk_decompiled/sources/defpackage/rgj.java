package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rgj {
    public String a;
    public zfj b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgj)) {
            return false;
        }
        rgj rgjVar = (rgj) obj;
        return x44.r(this.a, rgjVar.a) && this.b == rgjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
