package defpackage;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class hj9 extends ci9 {
    public static final Object L = new Object();
    public Object[] K;

    public hj9(Object obj) {
        int[] iArr = this.F;
        int i = this.E;
        iArr[i] = 7;
        Object[] objArr = new Object[32];
        this.K = objArr;
        this.E = i + 1;
        objArr[i] = obj;
    }

    @Override // defpackage.ci9
    public final int K(ai9 ai9Var) {
        bi9 bi9Var = bi9.I;
        Map.Entry entry = (Map.Entry) r0(Map.Entry.class, bi9Var);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw T(key, bi9Var);
        }
        String str = (String) key;
        int length = ai9Var.a.length;
        for (int i = 0; i < length; i++) {
            if (ai9Var.a[i].equals(str)) {
                this.K[this.E - 1] = entry.getValue();
                this.G[this.E - 2] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ci9
    public final int P(ai9 ai9Var) {
        int i = this.E;
        Object obj = i != 0 ? this.K[i - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != L) {
                return -1;
            }
            sz6.j("JsonReader is closed");
            return 0;
        }
        String str = (String) obj;
        int length = ai9Var.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (ai9Var.a[i2].equals(str)) {
                l0();
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.ci9
    public final void R() {
        if (!this.J) {
            this.K[this.E - 1] = ((Map.Entry) r0(Map.Entry.class, bi9.I)).getValue();
            this.G[this.E - 2] = "null";
        } else {
            bi9 bi9VarJ = j();
            nextName();
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(bi9VarJ);
            rl7.m(sb, " at ", c());
        }
    }

    public final void b0(Object obj) {
        int i = this.E;
        if (i == this.K.length) {
            if (i == 256) {
                throw new JsonDataException("Nesting too deep at ".concat(c()));
            }
            int[] iArr = this.F;
            this.F = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.G;
            this.G = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.H;
            this.H = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.K;
            this.K = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.K;
        int i2 = this.E;
        this.E = i2 + 1;
        objArr2[i2] = obj;
    }

    @Override // defpackage.ci9
    public final void beginArray() {
        List list = (List) r0(List.class, bi9.E);
        gj9 gj9Var = new gj9(bi9.F, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.K;
        int i = this.E;
        objArr[i - 1] = gj9Var;
        this.F[i - 1] = 1;
        this.H[i - 1] = 0;
        if (gj9Var.hasNext()) {
            b0(gj9Var.next());
        }
    }

    @Override // defpackage.ci9
    public final void beginObject() {
        Map map = (Map) r0(Map.class, bi9.G);
        gj9 gj9Var = new gj9(bi9.H, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.K;
        int i = this.E;
        objArr[i - 1] = gj9Var;
        this.F[i - 1] = 3;
        if (gj9Var.hasNext()) {
            b0(gj9Var.next());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Arrays.fill(this.K, 0, this.E, (Object) null);
        this.K[0] = L;
        this.F[0] = 8;
        this.E = 1;
    }

    @Override // defpackage.ci9
    public final boolean e() {
        Boolean bool = (Boolean) r0(Boolean.class, bi9.L);
        l0();
        return bool.booleanValue();
    }

    @Override // defpackage.ci9
    public final void endArray() {
        bi9 bi9Var = bi9.F;
        gj9 gj9Var = (gj9) r0(gj9.class, bi9Var);
        if (gj9Var.E != bi9Var || gj9Var.hasNext()) {
            throw T(gj9Var, bi9Var);
        }
        l0();
    }

    @Override // defpackage.ci9
    public final void endObject() {
        bi9 bi9Var = bi9.H;
        gj9 gj9Var = (gj9) r0(gj9.class, bi9Var);
        if (gj9Var.E != bi9Var || gj9Var.hasNext()) {
            throw T(gj9Var, bi9Var);
        }
        this.G[this.E - 1] = null;
        l0();
    }

    @Override // defpackage.ci9
    public final void f() {
        r0(Void.class, bi9.M);
        l0();
    }

    @Override // defpackage.ci9
    public final boolean hasNext() {
        int i = this.E;
        if (i == 0) {
            return false;
        }
        Object obj = this.K[i - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // defpackage.ci9
    public final bi9 j() {
        int i = this.E;
        if (i == 0) {
            return bi9.N;
        }
        Object obj = this.K[i - 1];
        if (obj instanceof gj9) {
            return ((gj9) obj).E;
        }
        if (obj instanceof List) {
            return bi9.E;
        }
        if (obj instanceof Map) {
            return bi9.G;
        }
        if (obj instanceof Map.Entry) {
            return bi9.I;
        }
        if (obj instanceof String) {
            return bi9.J;
        }
        if (obj instanceof Boolean) {
            return bi9.L;
        }
        if (obj instanceof Number) {
            return bi9.K;
        }
        if (obj == null) {
            return bi9.M;
        }
        if (obj != L) {
            throw T(obj, "a JSON value");
        }
        sz6.j("JsonReader is closed");
        return null;
    }

    public final void l0() {
        int i = this.E;
        int i2 = i - 1;
        this.E = i2;
        Object[] objArr = this.K;
        objArr[i2] = null;
        this.F[i2] = 0;
        if (i2 > 0) {
            int[] iArr = this.H;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            Object obj = objArr[i - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    b0(it.next());
                }
            }
        }
    }

    @Override // defpackage.ci9
    public final ci9 n() {
        hj9 hj9Var = new hj9((ci9) this);
        hj9Var.K = (Object[]) this.K.clone();
        for (int i = 0; i < hj9Var.E; i++) {
            Object[] objArr = hj9Var.K;
            Object obj = objArr[i];
            if (obj instanceof gj9) {
                gj9 gj9Var = (gj9) obj;
                objArr[i] = new gj9(gj9Var.E, gj9Var.F, gj9Var.G);
            }
        }
        return hj9Var;
    }

    @Override // defpackage.ci9
    public final double nextDouble() throws JsonEncodingException {
        double dDoubleValue;
        bi9 bi9Var = bi9.K;
        Object objR0 = r0(Object.class, bi9Var);
        if (objR0 instanceof Number) {
            dDoubleValue = ((Number) objR0).doubleValue();
        } else {
            if (!(objR0 instanceof String)) {
                throw T(objR0, bi9Var);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objR0);
            } catch (NumberFormatException unused) {
                throw T(objR0, bi9Var);
            }
        }
        if (this.I || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            l0();
            return dDoubleValue;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + c());
    }

    @Override // defpackage.ci9
    public final int nextInt() {
        int iIntValueExact;
        bi9 bi9Var = bi9.K;
        Object objR0 = r0(Object.class, bi9Var);
        if (objR0 instanceof Number) {
            iIntValueExact = ((Number) objR0).intValue();
        } else {
            if (!(objR0 instanceof String)) {
                throw T(objR0, bi9Var);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objR0);
                } catch (NumberFormatException unused) {
                    throw T(objR0, bi9Var);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objR0).intValueExact();
            }
        }
        l0();
        return iIntValueExact;
    }

    @Override // defpackage.ci9
    public final long nextLong() {
        long jLongValueExact;
        bi9 bi9Var = bi9.K;
        Object objR0 = r0(Object.class, bi9Var);
        if (objR0 instanceof Number) {
            jLongValueExact = ((Number) objR0).longValue();
        } else {
            if (!(objR0 instanceof String)) {
                throw T(objR0, bi9Var);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objR0);
                } catch (NumberFormatException unused) {
                    throw T(objR0, bi9Var);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objR0).longValueExact();
            }
        }
        l0();
        return jLongValueExact;
    }

    @Override // defpackage.ci9
    public final String nextName() {
        bi9 bi9Var = bi9.I;
        Map.Entry entry = (Map.Entry) r0(Map.Entry.class, bi9Var);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw T(key, bi9Var);
        }
        String str = (String) key;
        this.K[this.E - 1] = entry.getValue();
        this.G[this.E - 2] = str;
        return str;
    }

    @Override // defpackage.ci9
    public final String nextString() {
        int i = this.E;
        Object obj = i != 0 ? this.K[i - 1] : null;
        if (obj instanceof String) {
            l0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            l0();
            return obj.toString();
        }
        if (obj != L) {
            throw T(obj, bi9.J);
        }
        sz6.j("JsonReader is closed");
        return null;
    }

    public final Object r0(Class cls, bi9 bi9Var) {
        int i = this.E;
        Object obj = i != 0 ? this.K[i - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && bi9Var == bi9.M) {
            return null;
        }
        if (obj != L) {
            throw T(obj, bi9Var);
        }
        sz6.j("JsonReader is closed");
        return null;
    }

    @Override // defpackage.ci9
    public final void skipValue() {
        if (this.J) {
            StringBuilder sb = new StringBuilder("Cannot skip unexpected ");
            sb.append(j());
            rl7.m(sb, " at ", c());
            return;
        }
        int i = this.E;
        if (i > 1) {
            this.G[i - 2] = "null";
        }
        Object obj = i != 0 ? this.K[i - 1] : null;
        if (obj instanceof gj9) {
            StringBuilder sb2 = new StringBuilder("Expected a value but was ");
            sb2.append(j());
            rl7.m(sb2, " at path ", c());
        } else if (obj instanceof Map.Entry) {
            Object[] objArr = this.K;
            int i2 = i - 1;
            objArr[i2] = ((Map.Entry) objArr[i2]).getValue();
        } else {
            if (i > 0) {
                l0();
                return;
            }
            StringBuilder sb3 = new StringBuilder("Expected a value but was ");
            sb3.append(j());
            rl7.m(sb3, " at path ", c());
        }
    }

    @Override // defpackage.ci9
    public final void x() {
        if (hasNext()) {
            b0(nextName());
        }
    }
}
