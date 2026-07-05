package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c99 {
    public final String a;
    public final z9 b;
    public final long c;

    public c99(String str, z9 z9Var, long j) {
        str.getClass();
        z9Var.getClass();
        this.a = str;
        this.b = z9Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c99)) {
            return false;
        }
        c99 c99Var = (c99) obj;
        return x44.r(this.a, c99Var.a) && this.b == c99Var.b && this.c == c99Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InternalInteractionContext(viewId=");
        sb.append(this.a);
        sb.append(", actionType=");
        sb.append(this.b);
        sb.append(", eventCreatedAtNanos=");
        return grc.r(this.c, ")", sb);
    }
}
