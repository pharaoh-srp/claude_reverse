package defpackage;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ufk extends yak {
    public String G;
    public String H;
    public int I;
    public String J;
    public long K;
    public long L;
    public List M;
    public String N;
    public int O;
    public String P;
    public String Q;
    public String R;
    public long S;
    public String T;

    @Override // defpackage.yak
    public final boolean Q0() {
        return true;
    }

    public final String R0() {
        O0();
        dgj.v(this.G);
        return this.G;
    }

    public final String S0() {
        K0();
        O0();
        dgj.v(this.P);
        return this.P;
    }

    public final void T0() {
        String str;
        K0();
        if (I0().V0().i(ork.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            J0().X1().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            b0().Q.b("Analytics Storage consent is not granted");
            str = null;
        }
        b0().Q.b("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.R = str;
        ((umk) this.E).R.getClass();
        this.S = System.currentTimeMillis();
    }
}
