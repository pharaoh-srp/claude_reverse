package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wnh implements b45 {
    public final ThreadLocal E;

    public wnh(ThreadLocal threadLocal) {
        this.E = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnh) && x44.r(this.E, ((wnh) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.E + ')';
    }
}
