package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nh4 implements ph4 {
    public final Exception a;

    public nh4(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nh4) && this.a.equals(((nh4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(error=" + this.a + ")";
    }
}
