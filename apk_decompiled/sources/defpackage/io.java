package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class io implements so {
    public final boolean a;
    public final boolean b;
    public final String c;

    public io(String str, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io)) {
            return false;
        }
        io ioVar = (io) obj;
        return this.a == ioVar.a && this.b == ioVar.b && x44.r(this.c, ioVar.c);
    }

    public final int hashCode() {
        int iP = fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return iP + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryPaginationState(hasMore=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", oldestEventId=");
        return ij0.m(sb, this.c, ")");
    }

    public /* synthetic */ io() {
        this(null, true, true);
    }
}
