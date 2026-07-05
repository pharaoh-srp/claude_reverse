package defpackage;

import io.sentry.e0;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ij9 extends jj9 {
    public Object[] O = new Object[32];
    public String P;

    public ij9() {
        R(6);
    }

    public final void B0(Serializable serializable) {
        String str;
        Object objPut;
        int iK = K();
        int i = this.E;
        if (i == 1) {
            if (iK != 6) {
                sz6.j("JSON must have only one top-level value.");
                return;
            }
            int i2 = i - 1;
            this.F[i2] = 7;
            this.O[i2] = serializable;
            return;
        }
        if (iK == 3 && (str = this.P) != null) {
            if ((serializable != null || this.K) && (objPut = ((Map) this.O[i - 1]).put(str, serializable)) != null) {
                xh6.e("Map key '", this.P, "' has multiple values at path ", j(), ": ", objPut, " and ", serializable);
                return;
            } else {
                this.P = null;
                return;
            }
        }
        if (iK == 1) {
            ((List) this.O[i - 1]).add(serializable);
        } else if (iK == 9) {
            sz6.j("Sink from valueSink() was not closed");
        } else {
            sz6.j("Nesting problem.");
        }
    }

    public final Object D0() {
        int i = this.E;
        if (i <= 1 && (i != 1 || this.F[i - 1] == 7)) {
            return this.O[0];
        }
        sz6.j("Incomplete document");
        return null;
    }

    @Override // defpackage.jj9
    public final jj9 T(double d) {
        if (!this.J && (Double.isNaN(d) || d == Double.NEGATIVE_INFINITY || d == Double.POSITIVE_INFINITY)) {
            e0.c(d, "Numeric values must be finite, but was ");
            return null;
        }
        if (this.L) {
            this.L = false;
            n(Double.toString(d));
            return this;
        }
        B0(Double.valueOf(d));
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 b0(long j) {
        if (this.L) {
            this.L = false;
            n(Long.toString(j));
            return this;
        }
        B0(Long.valueOf(j));
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 c() {
        if (this.L) {
            sz6.j("Array cannot be used as a map key in JSON at path ".concat(j()));
            return null;
        }
        int i = this.E;
        int i2 = this.M;
        if (i == i2 && this.F[i - 1] == 1) {
            this.M = ~i2;
            return this;
        }
        e();
        ArrayList arrayList = new ArrayList();
        B0(arrayList);
        Object[] objArr = this.O;
        int i3 = this.E;
        objArr[i3] = arrayList;
        this.H[i3] = 0;
        R(1);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.E;
        if (i > 1 || (i == 1 && this.F[i - 1] != 7)) {
            xh6.c("Incomplete document");
        } else {
            this.E = 0;
        }
    }

    @Override // defpackage.jj9
    public final jj9 d() {
        if (this.L) {
            sz6.j("Object cannot be used as a map key in JSON at path ".concat(j()));
            return null;
        }
        int i = this.E;
        int i2 = this.M;
        if (i == i2 && this.F[i - 1] == 3) {
            this.M = ~i2;
            return this;
        }
        e();
        j7a j7aVar = new j7a();
        B0(j7aVar);
        this.O[this.E] = j7aVar;
        R(3);
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 f() {
        if (K() != 1) {
            sz6.j("Nesting problem.");
            return null;
        }
        int i = this.E;
        int i2 = ~this.M;
        if (i == i2) {
            this.M = i2;
            return this;
        }
        int i3 = i - 1;
        this.E = i3;
        this.O[i3] = null;
        int[] iArr = this.H;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.E != 0) {
            return;
        }
        sz6.j("JsonWriter is closed.");
    }

    @Override // defpackage.jj9
    public final jj9 i() {
        if (K() != 3) {
            sz6.j("Nesting problem.");
            return null;
        }
        if (this.P != null) {
            xh6.n("Dangling name: ", this.P);
            return null;
        }
        int i = this.E;
        int i2 = ~this.M;
        if (i == i2) {
            this.M = i2;
            return this;
        }
        this.L = false;
        int i3 = i - 1;
        this.E = i3;
        this.O[i3] = null;
        this.G[i3] = null;
        int[] iArr = this.H;
        int i4 = i - 2;
        iArr[i4] = iArr[i4] + 1;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 l0(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            b0(number.longValue());
            return this;
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            T(number.doubleValue());
            return this;
        }
        if (number == null) {
            x();
            return this;
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.L) {
            this.L = false;
            n(bigDecimal.toString());
            return this;
        }
        B0(bigDecimal);
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 n(String str) {
        if (str == null) {
            mr9.h("name == null");
            return null;
        }
        if (this.E == 0) {
            sz6.j("JsonWriter is closed.");
            return null;
        }
        if (K() != 3 || this.P != null || this.L) {
            sz6.j("Nesting problem.");
            return null;
        }
        this.P = str;
        this.G[this.E - 1] = str;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 r0(String str) {
        if (this.L) {
            this.L = false;
            n(str);
            return this;
        }
        B0(str);
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 x() {
        if (this.L) {
            sz6.j("null cannot be used as a map key in JSON at path ".concat(j()));
            return null;
        }
        B0(null);
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }

    @Override // defpackage.jj9
    public final jj9 x0(boolean z) {
        if (this.L) {
            sz6.j("Boolean cannot be used as a map key in JSON at path ".concat(j()));
            return null;
        }
        B0(Boolean.valueOf(z));
        int[] iArr = this.H;
        int i = this.E - 1;
        iArr[i] = iArr[i] + 1;
        return this;
    }
}
