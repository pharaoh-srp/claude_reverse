package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dba {
    public final Object a;
    public final String b;

    public dba(String str, Object obj) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return this.b + "@" + System.identityHashCode(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dba)) {
            return false;
        }
        dba dbaVar = (dba) obj;
        return this.a == dbaVar.a && this.b.equals(dbaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
    }
}
