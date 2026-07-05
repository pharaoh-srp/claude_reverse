package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class vkk extends xlk {
    public final boolean E;

    public vkk(boolean z) {
        this.E = z;
    }

    @Override // defpackage.xlk
    public final int a() {
        return xlk.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        xlk xlkVar = (xlk) obj;
        int iA = xlkVar.a();
        int iD = xlk.d((byte) -32);
        if (iD != iA) {
            return iD - xlkVar.a();
        }
        return (true != this.E ? 20 : 21) - (true != ((vkk) xlkVar).E ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && vkk.class == obj.getClass() && this.E == ((vkk) obj).E;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(xlk.d((byte) -32)), Boolean.valueOf(this.E)});
    }

    public final String toString() {
        return Boolean.toString(this.E);
    }
}
