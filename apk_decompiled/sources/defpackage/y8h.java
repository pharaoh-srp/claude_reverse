package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class y8h implements b9h {
    public final String a;
    public final String b;

    public y8h(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8h)) {
            return false;
        }
        y8h y8hVar = (y8h) obj;
        return this.a.equals(y8hVar.a) && x44.r(this.b, y8hVar.b);
    }

    @Override // defpackage.b9h
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("AssistantThinking(key=", this.a, ", thinking=", this.b, ")");
    }
}
