package defpackage;

import android.graphics.Shader;
import android.graphics.SweepGradient;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l0h extends rzf implements na9 {
    public final long c;
    public final ArrayList d;
    public final List e;

    public l0h(long j, ArrayList arrayList, List list) {
        this.c = j;
        this.d = arrayList;
        this.e = list;
    }

    @Override // defpackage.na9
    public final Object b(Object obj, float f) {
        if (obj == null) {
            obj = new eeg(d54.g);
        }
        boolean z = obj instanceof eeg;
        List list = this.e;
        long j = this.c;
        ArrayList arrayList = this.d;
        if (z) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((d54) arrayList.get(i)).getClass();
                arrayList2.add(new d54(((eeg) obj).a));
            }
            obj = new l0h(j, arrayList2, list);
        }
        if (!(obj instanceof l0h)) {
            return null;
        }
        l0h l0hVar = (l0h) obj;
        return new l0h(hvk.g(f, j, l0hVar.c), ssj.o(arrayList, l0hVar.d, f), ssj.p(list, l0hVar.e, f));
    }

    @Override // defpackage.rzf
    public final Shader c(long j) {
        long jFloatToRawIntBits;
        long j2 = this.c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            jFloatToRawIntBits = eve.x(j);
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat(i2);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        }
        ArrayList arrayList = this.d;
        List list = this.e;
        sqk.i(arrayList, list);
        return new SweepGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), sqk.f(arrayList), sqk.g(list, arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0h)) {
            return false;
        }
        l0h l0hVar = (l0h) obj;
        return fcc.c(this.c, l0hVar.c) && this.d.equals(l0hVar.d) && x44.r(this.e, l0hVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31;
        List list = this.e;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str;
        long j = this.c;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) fcc.k(j)) + ", ";
        } else {
            str = "";
        }
        StringBuilder sbX = sq6.x("SweepGradient(", str, "colors=");
        sbX.append(this.d);
        sbX.append(", stops=");
        sbX.append(this.e);
        sbX.append(')');
        return sbX.toString();
    }
}
