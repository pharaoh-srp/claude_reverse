package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ilk extends xlk {
    public final long E;

    public ilk(long j) {
        this.E = j;
    }

    @Override // defpackage.xlk
    public final int a() {
        return xlk.d(this.E >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        xlk xlkVar = (xlk) obj;
        if (a() != xlkVar.a()) {
            return a() - xlkVar.a();
        }
        long jAbs = Math.abs(this.E);
        long jAbs2 = Math.abs(((ilk) xlkVar).E);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ilk.class == obj.getClass() && this.E == ((ilk) obj).E;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.E)});
    }

    public final String toString() {
        return Long.toString(this.E);
    }
}
