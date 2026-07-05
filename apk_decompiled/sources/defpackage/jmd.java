package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jmd {
    public final kmd a;
    public final String b;

    public jmd(kmd kmdVar, String str) {
        str.getClass();
        this.a = kmdVar;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final kmd b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmd)) {
            return false;
        }
        jmd jmdVar = (jmd) obj;
        return this.a == jmdVar.a && x44.r(this.b, jmdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProjectIdListEntry(source=" + this.a + ", project_uuid=" + this.b + ")";
    }
}
