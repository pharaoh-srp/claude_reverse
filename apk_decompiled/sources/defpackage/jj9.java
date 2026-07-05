package defpackage;

import com.squareup.moshi.JsonDataException;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jj9 implements Closeable, Flushable {
    public String I;
    public boolean J;
    public boolean K;
    public boolean L;
    public LinkedHashMap N;
    public int E = 0;
    public int[] F = new int[32];
    public String[] G = new String[32];
    public int[] H = new int[32];
    public int M = -1;

    public static cj9 H(BufferedSink bufferedSink) {
        return new cj9(bufferedSink);
    }

    public final int K() {
        int i = this.E;
        if (i != 0) {
            return this.F[i - 1];
        }
        sz6.j("JsonWriter is closed.");
        return 0;
    }

    public final void P() {
        int iK = K();
        if (iK == 5 || iK == 3) {
            this.L = true;
        } else {
            sz6.j("Nesting problem.");
        }
    }

    public final void R(int i) {
        int[] iArr = this.F;
        int i2 = this.E;
        this.E = i2 + 1;
        iArr[i2] = i;
    }

    public void S(String str) {
        if (str.isEmpty()) {
            str = null;
        }
        this.I = str;
    }

    public abstract jj9 T(double d);

    public abstract jj9 b0(long j);

    public abstract jj9 c();

    public abstract jj9 d();

    public final void e() {
        int i = this.E;
        int[] iArr = this.F;
        if (i != iArr.length) {
            return;
        }
        if (i == 256) {
            throw new JsonDataException("Nesting too deep at " + j() + ": circular reference?");
        }
        this.F = Arrays.copyOf(iArr, iArr.length * 2);
        String[] strArr = this.G;
        this.G = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        int[] iArr2 = this.H;
        this.H = Arrays.copyOf(iArr2, iArr2.length * 2);
        if (this instanceof ij9) {
            ij9 ij9Var = (ij9) this;
            Object[] objArr = ij9Var.O;
            ij9Var.O = Arrays.copyOf(objArr, objArr.length * 2);
        }
    }

    public abstract jj9 f();

    public abstract jj9 i();

    public final String j() {
        return ac1.f(this.E, this.F, this.G, this.H);
    }

    public abstract jj9 l0(Number number);

    public abstract jj9 n(String str);

    public abstract jj9 r0(String str);

    public abstract jj9 x();

    public abstract jj9 x0(boolean z);
}
