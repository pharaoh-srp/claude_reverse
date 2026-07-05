package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vu7 implements tu7 {
    public final float[] a;
    public final float[] b;

    public vu7(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            sz6.p("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.tu7
    public final float a(float f) {
        return zp3.e(f, this.b, this.a);
    }

    @Override // defpackage.tu7
    public final float b(float f) {
        return zp3.e(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof vu7)) {
            return false;
        }
        vu7 vu7Var = (vu7) obj;
        return Arrays.equals(this.a, vu7Var.a) && Arrays.equals(this.b, vu7Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.a);
        string.getClass();
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.b);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
