package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class upg extends wpg {
    public final String a;
    public final long b;

    public upg(String str, long j) {
        str.getClass();
        this.a = str;
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
        if (!(obj instanceof upg)) {
            return false;
        }
        upg upgVar = (upg) obj;
        return x44.r(this.a, upgVar.a) && this.b == upgVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbW = vb7.w("UserMessage(text=", this.a, ", timestamp=", this.b);
        sbW.append(")");
        return sbW.toString();
    }
}
