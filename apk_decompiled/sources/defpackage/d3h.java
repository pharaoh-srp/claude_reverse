package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class d3h {
    public final float[] a;
    public final float[] b;

    public d3h(float[] fArr, float[] fArr2) {
        this.a = fArr;
        this.b = fArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d3h)) {
            return false;
        }
        d3h d3hVar = (d3h) obj;
        return Arrays.equals(this.a, d3hVar.a) && Arrays.equals(this.b, d3hVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
