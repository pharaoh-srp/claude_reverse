package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class nd {
    public static final nd c = new nd(new ld[0]);
    public static final ld d;
    public final int a;
    public final ld[] b;

    static {
        ld ldVar = new ld(-1, -1, new int[0], new j7b[0], new long[0], new String[0], new md[0]);
        int[] iArr = ldVar.e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = ldVar.f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        j7b[] j7bVarArr = (j7b[]) Arrays.copyOf(ldVar.d, 0);
        String[] strArr = (String[]) Arrays.copyOf(ldVar.g, 0);
        md[] mdVarArr = ldVar.h;
        d = new ld(0, ldVar.b, iArrCopyOf, j7bVarArr, jArrCopyOf, strArr, (md[]) Arrays.copyOf(mdVarArr, Math.max(0, mdVarArr.length)));
        tpi.w(1);
        tpi.w(2);
        tpi.w(3);
        tpi.w(4);
    }

    public nd(ld[] ldVarArr) {
        this.a = ldVarArr.length;
        this.b = ldVarArr;
    }

    public final ld a(int i) {
        return i < 0 ? d : this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nd.class != obj.getClass()) {
            return false;
        }
        nd ndVar = (nd) obj;
        return this.a == ndVar.a && Arrays.equals(this.b, ndVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((this.a * 29791) + 1) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            ld[] ldVarArr = this.b;
            if (i >= ldVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, ads=[");
            ldVarArr[i].getClass();
            for (int i2 = 0; i2 < ldVarArr[i].e.length; i2++) {
                sb.append("ad(state=");
                int i3 = ldVarArr[i].e[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(ldVarArr[i].f[i2]);
                sb.append(')');
                if (i2 < ldVarArr[i].e.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < ldVarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
