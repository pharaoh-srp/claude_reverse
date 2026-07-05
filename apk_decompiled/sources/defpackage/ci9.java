package defpackage;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.Closeable;
import java.util.Arrays;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ci9 implements Closeable {
    public int E;
    public int[] F;
    public String[] G;
    public int[] H;
    public boolean I;
    public boolean J;

    public ci9(ci9 ci9Var) {
        this.E = ci9Var.E;
        this.F = (int[]) ci9Var.F.clone();
        this.G = (String[]) ci9Var.G.clone();
        this.H = (int[]) ci9Var.H.clone();
        this.I = ci9Var.I;
        this.J = ci9Var.J;
    }

    public static bj9 i(BufferedSource bufferedSource) {
        return new bj9(bufferedSource);
    }

    public final void H(int i) {
        int i2 = this.E;
        int[] iArr = this.F;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at ".concat(c()));
            }
            this.F = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.G;
            this.G = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.H;
            this.H = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.F;
        int i3 = this.E;
        this.E = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int K(ai9 ai9Var);

    public abstract int P(ai9 ai9Var);

    public abstract void R();

    public final void S(String str) {
        throw new JsonEncodingException(str + " at path " + c());
    }

    public final JsonDataException T(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + c());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + c());
    }

    public abstract void beginArray();

    public abstract void beginObject();

    public final String c() {
        return ac1.f(this.E, this.F, this.G, this.H);
    }

    public final boolean d() {
        return this.I;
    }

    public abstract boolean e();

    public abstract void endArray();

    public abstract void endObject();

    public abstract void f();

    public abstract boolean hasNext();

    public abstract bi9 j();

    public abstract ci9 n();

    public abstract double nextDouble();

    public abstract int nextInt();

    public abstract long nextLong();

    public abstract String nextName();

    public abstract String nextString();

    public abstract void skipValue();

    public abstract void x();

    public ci9() {
        this.F = new int[32];
        this.G = new String[32];
        this.H = new int[32];
    }
}
