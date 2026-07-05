package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zk8 {
    public final uz6 a;
    public final String b;

    public zk8(uz6 uz6Var, String str) {
        this.a = uz6Var;
        this.b = str;
    }

    public final uz6 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk8)) {
            return false;
        }
        zk8 zk8Var = (zk8) obj;
        return this.a.equals(zk8Var.a) && this.b.equals(zk8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthedSession(api=" + this.a + ", organizationId=" + this.b + ")";
    }
}
