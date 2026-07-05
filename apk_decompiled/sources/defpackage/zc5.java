package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class zc5 {
    public final float[] a;

    public zc5(float[] fArr) {
        this.a = fArr;
        if (fArr.length == 8) {
            return;
        }
        sz6.p("Points array size should be 8");
        throw null;
    }

    public final float a() {
        return this.a[6];
    }

    public final float b() {
        return this.a[7];
    }

    public final tub c(s7d s7dVar) {
        float[] fArr = new float[8];
        tub tubVar = new tub(fArr);
        float[] fArr2 = this.a;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        tubVar.e(s7dVar, 0);
        tubVar.e(s7dVar, 2);
        tubVar.e(s7dVar, 4);
        tubVar.e(s7dVar, 6);
        return tubVar;
    }

    public final boolean d() {
        float[] fArr = this.a;
        return Math.abs(fArr[0] - a()) < 1.0E-4f && Math.abs(fArr[1] - b()) < 1.0E-4f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc5)) {
            return false;
        }
        return Arrays.equals(this.a, ((zc5) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("anchor0: (");
        float[] fArr = this.a;
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(") control0: (");
        sb.append(fArr[2]);
        sb.append(", ");
        sb.append(fArr[3]);
        sb.append("), control1: (");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("), anchor1: (");
        sb.append(a());
        sb.append(", ");
        sb.append(b());
        sb.append(')');
        return sb.toString();
    }
}
