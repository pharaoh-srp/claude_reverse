package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class jh4 {
    public static final jh4 e;
    public static final jh4 f;
    public static final jh4 g;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        zf3 zf3Var = zf3.r;
        zf3 zf3Var2 = zf3.s;
        zf3 zf3Var3 = zf3.t;
        zf3 zf3Var4 = zf3.l;
        zf3 zf3Var5 = zf3.n;
        zf3 zf3Var6 = zf3.m;
        zf3 zf3Var7 = zf3.o;
        zf3 zf3Var8 = zf3.q;
        zf3 zf3Var9 = zf3.p;
        List listX = x44.X(zf3Var, zf3Var2, zf3Var3, zf3Var4, zf3Var5, zf3Var6, zf3Var7, zf3Var8, zf3Var9);
        List listX2 = x44.X(zf3Var, zf3Var2, zf3Var3, zf3Var4, zf3Var5, zf3Var6, zf3Var7, zf3Var8, zf3Var9, zf3.j, zf3.k, zf3.h, zf3.i, zf3.f, zf3.g, zf3.e);
        ih4 ih4Var = new ih4();
        zf3[] zf3VarArr = (zf3[]) listX.toArray(new zf3[0]);
        ih4Var.b((zf3[]) Arrays.copyOf(zf3VarArr, zf3VarArr.length));
        nrh nrhVar = nrh.TLS_1_3;
        nrh nrhVar2 = nrh.TLS_1_2;
        ih4Var.c(nrhVar, nrhVar2);
        ih4Var.d = true;
        e = ih4Var.a();
        ih4 ih4Var2 = new ih4();
        List list = listX2;
        zf3[] zf3VarArr2 = (zf3[]) list.toArray(new zf3[0]);
        ih4Var2.b((zf3[]) Arrays.copyOf(zf3VarArr2, zf3VarArr2.length));
        ih4Var2.c(nrhVar, nrhVar2);
        ih4Var2.d = true;
        f = ih4Var2.a();
        ih4 ih4Var3 = new ih4();
        zf3[] zf3VarArr3 = (zf3[]) list.toArray(new zf3[0]);
        ih4Var3.b((zf3[]) Arrays.copyOf(zf3VarArr3, zf3VarArr3.length));
        ih4Var3.c(nrhVar, nrhVar2, nrh.TLS_1_1, nrh.TLS_1_0);
        ih4Var3.d = true;
        ih4Var3.a();
        g = new jh4(false, false, null, null);
    }

    public jh4(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = zkj.j(strArr, enabledCipherSuites, zf3.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = zkj.j(enabledProtocols2, strArr2, cyb.E);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        iec iecVar = zf3.c;
        byte[] bArr = zkj.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (iecVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            sz6.p("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            sz6.p("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            sz6.p("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            sz6.p("At least one TLS version is required");
            return;
        }
        jh4 jh4Var = new jh4(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (jh4Var.c() != null) {
            sSLSocket.setEnabledProtocols(jh4Var.d);
        }
        if (jh4Var.b() != null) {
            sSLSocket.setEnabledCipherSuites(jh4Var.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(zf3.b.r(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            nrh.F.getClass();
            arrayList.add(efk.t(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jh4)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        jh4 jh4Var = (jh4) obj;
        boolean z = jh4Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, jh4Var.c) && Arrays.equals(this.d, jh4Var.d) && this.b == jh4Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(b(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return y6a.p(sb, this.b, ')');
    }
}
