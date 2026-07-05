package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w0e extends rzf implements na9 {
    public final List c;
    public final List d;
    public final long e;
    public final float f;
    public final int g;

    public w0e(List list, List list2, long j, float f, int i) {
        this.c = list;
        this.d = list2;
        this.e = j;
        this.f = f;
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
            obj = new w0e(arrayList, this.d, this.e, this.f, this.g);
        }
        if (!(obj instanceof w0e)) {
            return null;
        }
        w0e w0eVar = (w0e) obj;
        ArrayList arrayListO = ssj.o(list, w0eVar.c, f);
        ArrayList arrayListP = ssj.p(this.d, w0eVar.d, f);
        long jG = hvk.g(f, this.e, w0eVar.e);
        float fW = d4c.W(this.f, w0eVar.f, f);
        if (f >= 0.5f) {
            this = w0eVar;
        }
        return new w0e(arrayListO, arrayListP, jG, fW, this.g);
    }

    @Override // defpackage.rzf
    public final Shader c(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.e;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jX = eve.x(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jX >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jX & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fD = this.f;
        if (fD == Float.POSITIVE_INFINITY) {
            fD = k8g.d(j) / 2.0f;
        }
        float f = fD;
        List list = this.c;
        List list2 = this.d;
        sqk.i(list, list2);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f, sqk.f(list), sqk.g(list2, list), zni.b0(this.g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0e)) {
            return false;
        }
        w0e w0eVar = (w0e) obj;
        return this.c.equals(w0eVar.c) && x44.r(this.d, w0eVar.d) && fcc.c(this.e, w0eVar.e) && this.f == w0eVar.f && this.g == w0eVar.g;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        List list = this.d;
        return Integer.hashCode(this.g) + vb7.b(this.f, vb7.e((iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) fcc.k(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.f;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        ms6.x(", ", str, str2, sb, this.d);
        sb.append("tileMode=");
        sb.append((Object) hsk.i(this.g));
        sb.append(')');
        return sb.toString();
    }
}
