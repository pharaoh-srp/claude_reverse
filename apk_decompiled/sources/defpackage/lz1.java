package defpackage;

import android.content.Context;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class lz1 implements br4, bf, tn7, ia4, jo4, t20, o29, p1h {
    public static final lz1 G;
    public static final b10 H;
    public static volatile tk5 Q;
    public final /* synthetic */ int E;
    public static final lz1 F = new lz1(0);
    public static final b10 I = new b10(2);
    public static final lz1 J = new lz1(3);
    public static final lz1 K = new lz1(4);
    public static final lz1 L = new lz1(5);
    public static final lz1 M = new lz1(6);
    public static final /* synthetic */ lz1 N = new lz1(7);
    public static final sqb O = new sqb("PackageViewDescriptorFactory", 0);
    public static final lz1 P = new lz1(8);
    public static final lz1 R = new lz1(9);
    public static final lz1 S = new lz1(10);
    public static final /* synthetic */ lz1 T = new lz1(11);
    public static final /* synthetic */ lz1 U = new lz1(12);

    static {
        int i = 1;
        G = new lz1(i);
        H = new b10(i);
    }

    public lz1(int i, TimeUnit timeUnit) {
        this.E = 26;
        timeUnit.toNanos(i);
        String lowerCase = timeUnit.name().toLowerCase(Locale.ROOT);
        if (i == 1) {
            lowerCase.substring(0, lowerCase.length() - 1);
        }
        new AtomicLong(System.nanoTime());
    }

    public static final void B(StringBuilder sb, List list) {
        z69 z69VarA0 = wd6.A0(wd6.H0(0, list.size()), 2);
        int i = z69VarA0.E;
        int i2 = z69VarA0.F;
        int i3 = z69VarA0.G;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public static g6a E(cpc[] cpcVarArr, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        return F((cpc[]) Arrays.copyOf(cpcVarArr, cpcVarArr.length), (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L));
    }

    public static g6a F(cpc[] cpcVarArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(cpcVarArr.length);
        for (cpc cpcVar : cpcVarArr) {
            arrayList.add(new d54(((d54) cpcVar.F).a));
        }
        ArrayList arrayList2 = new ArrayList(cpcVarArr.length);
        for (cpc cpcVar2 : cpcVarArr) {
            arrayList2.add(Float.valueOf(((Number) cpcVar2.E).floatValue()));
        }
        return new g6a(0, j, j2, arrayList, arrayList2);
    }

    public static HttpURLConnection G(String str) throws IOException {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.getClass();
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(201000);
            httpURLConnection.setRequestProperty("User-Agent", "analytics-kotlin/1.19.2");
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        } catch (MalformedURLException e) {
            IOException iOException = new IOException("Attempted to use malformed url: ".concat(str), e);
            bjk.f(gx.Companion, iOException);
            throw iOException;
        }
    }

    public static g6a I(int i, List list) {
        return new g6a(0, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) & 4294967295L), (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), list, null);
    }

    public static g6a J(cpc[] cpcVarArr, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        return F((cpc[]) Arrays.copyOf(cpcVarArr, cpcVarArr.length), (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier) << 32));
    }

    @Override // defpackage.tn7
    public yr9 A(ntd ntdVar, String str, j7g j7gVar, j7g j7gVar2) {
        ntdVar.getClass();
        str.getClass();
        j7gVar.getClass();
        j7gVar2.getClass();
        throw new IllegalArgumentException("This method should not be used.");
    }

    public float C(Context context) {
        Object objA;
        context.getClass();
        try {
            objA = new k2c(7, D(context)).a();
        } catch (ClassCastException unused) {
            objA = null;
        }
        Float f = (Float) objA;
        if (f != null) {
            return f.floatValue();
        }
        return -1.0f;
    }

    public tk5 D(Context context) {
        tk5 tk5Var = Q;
        if (tk5Var != null) {
            return tk5Var;
        }
        synchronized (this) {
            tk5 tk5Var2 = Q;
            if (tk5Var2 != null) {
                return tk5Var2;
            }
            tk5 tk5Var3 = new tk5(context);
            Q = tk5Var3;
            return tk5Var3;
        }
    }

    public HttpURLConnection H(String str) throws IOException {
        HttpURLConnection httpURLConnectionG = G("https://" + str + "/b");
        httpURLConnectionG.setRequestProperty("Content-Type", "text/plain");
        httpURLConnectionG.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnectionG.setDoOutput(true);
        httpURLConnectionG.setChunkedStreamingMode(0);
        return httpURLConnectionG;
    }

    @Override // defpackage.p1h
    public void a(Context context) {
    }

    @Override // defpackage.jo4
    public long b(long j, long j2) {
        float fS = wd6.S(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fS)) << 32) | (((long) Float.floatToRawIntBits(fS)) & 4294967295L);
        int i = m6f.a;
        return jFloatToRawIntBits;
    }

    @Override // defpackage.t20
    public Integer c() {
        return null;
    }

    @Override // defpackage.o29
    public boolean d(o1c o1cVar) {
        return false;
    }

    @Override // defpackage.t20
    public int e() {
        return 0;
    }

    @Override // defpackage.bf
    public Collection f(qqb qqbVar) {
        return lm6.E;
    }

    @Override // defpackage.t20
    public String g() {
        return "";
    }

    @Override // defpackage.br4
    public Object h(Object obj) {
        return obj.toString();
    }

    @Override // defpackage.bf
    public Collection i(qqb qqbVar) {
        qqbVar.getClass();
        return lm6.E;
    }

    @Override // defpackage.t20
    public List j() {
        return lm6.E;
    }

    @Override // defpackage.t20
    public String k() {
        return "";
    }

    @Override // defpackage.t20
    public String l() {
        return "";
    }

    @Override // defpackage.t20
    public String m() {
        return "";
    }

    @Override // defpackage.t20
    public String n() {
        return "";
    }

    @Override // defpackage.t20
    public String o() {
        return "";
    }

    @Override // defpackage.t20
    public String p() {
        return "";
    }

    @Override // defpackage.t20
    public String q() {
        return "";
    }

    @Override // defpackage.t20
    public Boolean r() {
        return null;
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        switch (this.E) {
            case 11:
                return new xkb();
            default:
                return new w2g((Context) el5Var.a(Context.class));
        }
    }

    @Override // defpackage.bf
    public Collection t(qqb qqbVar) {
        return lm6.E;
    }

    public String toString() {
        switch (this.E) {
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return "Empty";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.t20
    public String u() {
        return "";
    }

    @Override // defpackage.p1h
    public o1h v() {
        return new o1h();
    }

    @Override // defpackage.bf
    public Collection w(sxb sxbVar, qqb qqbVar) {
        sxbVar.getClass();
        qqbVar.getClass();
        return lm6.E;
    }

    @Override // defpackage.t20
    public String x() {
        return "";
    }

    @Override // defpackage.t20
    public Integer y() {
        return null;
    }

    @Override // defpackage.t20
    public t26 z() {
        return t26.E;
    }

    public /* synthetic */ lz1(int i) {
        this.E = i;
    }
}
