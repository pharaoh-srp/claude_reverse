package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class owa implements Comparable {
    public final long E;
    public final long F;
    public final long G;

    public owa(long j, long j2, long j3) {
        this.E = j;
        this.F = j2;
        this.G = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.E, ((owa) obj).E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owa)) {
            return false;
        }
        owa owaVar = (owa) obj;
        return this.E == owaVar.E && this.F == owaVar.F && this.G == owaVar.G;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.E), Long.valueOf(this.F), Long.valueOf(this.G));
    }
}
