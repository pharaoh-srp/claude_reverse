package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rog extends xn5 {
    public final int f;
    public final z9 g;
    public final long h;

    public rog(int i, z9 z9Var, long j) {
        this.f = i;
        this.g = z9Var;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rog)) {
            return false;
        }
        rog rogVar = (rog) obj;
        return this.f == rogVar.f && this.g == rogVar.g && this.h == rogVar.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ((this.g.hashCode() + (Integer.hashCode(this.f) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Action(frustrationCount=");
        sb.append(this.f);
        sb.append(", type=");
        sb.append(this.g);
        sb.append(", eventEndTimestampInNanos=");
        return grc.r(this.h, ")", sb);
    }
}
