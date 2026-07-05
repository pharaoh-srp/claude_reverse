package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rpg extends wpg {
    public final String a;
    public final long b;

    public rpg(String str, long j) {
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
        if (!(obj instanceof rpg)) {
            return false;
        }
        rpg rpgVar = (rpg) obj;
        return x44.r(this.a, rpgVar.a) && this.b == rpgVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbW = vb7.w("Thinking(text=", this.a, ", timestamp=", this.b);
        sbW.append(")");
        return sbW.toString();
    }
}
