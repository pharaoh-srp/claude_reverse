package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class opg extends wpg {
    public final String a;
    public final String b;
    public final long c;

    public opg(String str, String str2, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // defpackage.wpg
    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opg)) {
            return false;
        }
        opg opgVar = (opg) obj;
        return x44.r(this.a, opgVar.a) && this.b.equals(opgVar.b) && this.c == opgVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return grc.r(this.c, ")", kgh.r("Speak(id=", this.a, ", text=", this.b, ", timestamp="));
    }
}
