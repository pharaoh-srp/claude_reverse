package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g6a extends rzf implements na9 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;
    public final int g;

    public g6a(int i, long j, long j2, List list, List list2) {
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = j2;
        this.g = i;
    }

    @Override // defpackage.na9
    public final Object b(Object obj, float f) {
        if (obj == null) {
            obj = new eeg(d54.g);
        }
        boolean z = obj instanceof eeg;
        List list = this.c;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((d54) list.get(i)).getClass();
                arrayList.add(new d54(((eeg) obj).a));
            }
            obj = new g6a(this.g, this.e, this.f, arrayList, this.d);
        }
        if (!(obj instanceof g6a)) {
            return null;
        }
        g6a g6aVar = (g6a) obj;
        ArrayList arrayListO = ssj.o(list, g6aVar.c, f);
        ArrayList arrayListP = ssj.p(this.d, g6aVar.d, f);
        long jQ = ssj.q(f, this.e, g6aVar.e);
        long jQ2 = ssj.q(f, this.f, g6aVar.f);
        if (f >= 0.5f) {
            this = g6aVar;
        }
        return new g6a(this.g, jQ, jQ2, arrayListO, arrayListP);
    }

    @Override // defpackage.rzf
    public final Shader c(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        return usj.d(this.g, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6a)) {
            return false;
        }
        g6a g6aVar = (g6a) obj;
        return this.c.equals(g6aVar.c) && x44.r(this.d, g6aVar.d) && fcc.c(this.e, g6aVar.e) && fcc.c(this.f, g6aVar.f) && this.g == g6aVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(this.g) + vb7.e(vb7.e((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) fcc.k(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.f;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) fcc.k(j2)) + ", ";
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        ms6.x(", ", str, str2, sb, this.d);
        sb.append("tileMode=");
        sb.append((Object) hsk.i(this.g));
        sb.append(')');
        return sb.toString();
    }
}
