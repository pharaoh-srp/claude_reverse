package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wm4 {
    public final int a;

    public wm4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wm4) && this.a == ((wm4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vb7.r(new StringBuilder("ContainerInfo(layoutId="), this.a, ')');
    }
}
