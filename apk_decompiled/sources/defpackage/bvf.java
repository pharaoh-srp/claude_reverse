package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bvf implements fvf {
    public final Integer a;
    public final boolean b;

    public bvf(boolean z, Integer num) {
        this.a = num;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvf)) {
            return false;
        }
        bvf bvfVar = (bvf) obj;
        return x44.r(this.a, bvfVar.a) && this.b == bvfVar.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Boolean.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ThinkingTokensChanged(estimatedTokens=" + this.a + ", isBlockOpen=" + this.b + ")";
    }
}
