package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wef {
    public static final wef c;
    public static final wef d;
    public final long a;
    public final long b;

    static {
        wef wefVar = new wef(0L, 0L);
        new wef(Long.MAX_VALUE, Long.MAX_VALUE);
        c = new wef(Long.MAX_VALUE, 0L);
        new wef(0L, Long.MAX_VALUE);
        d = wefVar;
    }

    public wef(long j, long j2) {
        fd9.E(j >= 0);
        fd9.E(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wef.class == obj.getClass()) {
            wef wefVar = (wef) obj;
            if (this.a == wefVar.a && this.b == wefVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
