package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class qlk extends xlk {
    public final String E;

    public qlk(String str) {
        this.E = str;
    }

    @Override // defpackage.xlk
    public final int a() {
        return xlk.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        xlk xlkVar = (xlk) obj;
        int iA = xlkVar.a();
        int iD = xlk.d((byte) 96);
        if (iD != iA) {
            return iD - xlkVar.a();
        }
        String str = ((qlk) xlkVar).E;
        int length = str.length();
        String str2 = this.E;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qlk.class == obj.getClass()) {
            return this.E.equals(((qlk) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(xlk.d((byte) 96)), this.E});
    }

    public final String toString() {
        return ij0.m(new StringBuilder("\""), this.E, "\"");
    }
}
