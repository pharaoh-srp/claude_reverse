package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s86 {
    public final r86 a;

    static {
        new s86("", 0, 0);
    }

    public s86(String str, int i, int i2) {
        this.a = new r86(str, i, i2);
    }

    public static s86 a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String string;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder sbV = vb7.v("M0,", " A", i8, i7, ",");
            qy1.k(i8, i, " 0 1,1 ", ",", sbV);
            qy1.k(i8, i7, " A", ",", sbV);
            sbV.append(i8);
            sbV.append(" 0 1,1 0,");
            sbV.append(i8);
            sbV.append(" Z");
            string = sbV.toString();
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i / 2, i2 / 2);
            int iMin2 = Math.min(iMin, i3);
            int iMin3 = Math.min(iMin, i4);
            int iMin4 = Math.min(iMin, i5);
            int iMin5 = Math.min(iMin, i6);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                ij0.s(iMin3, iMin3, " A ", ",", sb);
                ij0.s(i, iMin3, " 0 0,1 ", ",", sb);
            }
            sb.append(" L ");
            sb.append(i);
            sb.append(",");
            sb.append(i2 - iMin4);
            if (iMin4 > 0) {
                ij0.s(iMin4, iMin4, " A ", ",", sb);
                sb.append(" 0 0,1 ");
                sb.append(i - iMin4);
                sb.append(",");
                sb.append(i2);
            }
            ij0.s(iMin5, i2, " L ", ",", sb);
            if (iMin5 > 0) {
                ij0.s(iMin5, iMin5, " A ", ",", sb);
                sb.append(" 0 0,1 0,");
                sb.append(i2 - iMin5);
            }
            if (iMin2 > 0) {
                ij0.s(iMin2, iMin2, " L 0,", " A ", sb);
                ij0.s(iMin2, iMin2, ",", " 0 0,1 ", sb);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new s86(string, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s86) {
            return this.a.equals(((s86) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
