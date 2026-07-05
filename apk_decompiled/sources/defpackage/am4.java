package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.os.Trace;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import com.anthropic.claude.api.account.MemoryMode;
import java.io.IOException;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes.dex */
public final class am4 implements sac, qo6, nf8, unc, ajd, c6d, crc, b9f, c6b {
    public final /* synthetic */ int E;

    public /* synthetic */ am4(int i) {
        this.E = i;
    }

    public static final tgg o(String str, String str2, String str3, String str4) {
        ArrayList arrayList = wgg.a;
        return new tgg(sxb.e(str2), str + '.' + (str2 + '(' + str3 + ')' + str4));
    }

    public static final int p(int i, long j) {
        int i2 = d3i.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static Typeface q(String str, dv7 dv7Var, int i) {
        if (i == 0 && x44.r(dv7Var, dv7.J) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iC = xpk.c(dv7Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iC) : Typeface.create(str, iC);
    }

    public static MediaCodec r(h2f h2fVar) throws IOException {
        String str = ((g6b) h2fVar.b).a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    public static hcb s(MemoryMode memoryMode) {
        int i = memoryMode == null ? -1 : gcb.a[memoryMode.ordinal()];
        hcb hcbVar = hcb.H;
        if (i == -1) {
            return hcbVar;
        }
        if (i == 1) {
            return hcb.F;
        }
        if (i == 2) {
            return hcb.G;
        }
        if (i == 3 || i == 4) {
            return hcbVar;
        }
        wg6.i();
        return null;
    }

    public static long u() {
        return d3i.a;
    }

    public static void v(int i) {
        synchronized (UnmanagedSessionReceiver.a) {
            if (UnmanagedSessionReceiver.b.get(Integer.valueOf(i)) != null) {
                throw new ClassCastException();
            }
        }
    }

    public static fw5 w(fhi fhiVar, boolean z) {
        boolean zE;
        fhiVar.getClass();
        if (fhiVar instanceof fw5) {
            return (fw5) fhiVar;
        }
        fhiVar.O();
        if ((fhiVar.O().a() instanceof qai) || (fhiVar instanceof i2c)) {
            xh3 xh3VarA = fhiVar.O().a();
            rai raiVar = xh3VarA instanceof rai ? (rai) xh3VarA : null;
            zE = true;
            if (raiVar == null || raiVar.P) {
                zE = (z && (fhiVar.O().a() instanceof qai)) ? fbi.e(fhiVar) : true ^ ljk.f(nkk.b(false, null, 24), yb5.A(fhiVar), s9i.c);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (fhiVar instanceof sn7) {
            sn7 sn7Var = (sn7) fhiVar;
            x44.r(sn7Var.F.O(), sn7Var.G.O());
        }
        return new fw5(yb5.A(fhiVar).l0(false), z);
    }

    public static long y(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    @Override // defpackage.ajd
    public void a(String str) {
        str.getClass();
    }

    @Override // defpackage.nf8
    public boolean b() {
        boolean z;
        synchronized (ei7.a) {
            try {
                int i = ei7.c;
                ei7.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > ei7.d + 30000) {
                    ei7.c = 0;
                    ei7.d = SystemClock.uptimeMillis();
                    String[] list = ei7.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    ei7.e = list.length < 800;
                }
                z = ei7.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.nf8
    public boolean c(i8g i8gVar) {
        kud kudVar = i8gVar.a;
        if ((kudVar instanceof r46 ? ((r46) kudVar).M : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        kud kudVar2 = i8gVar.b;
        return (kudVar2 instanceof r46 ? ((r46) kudVar2).M : Integer.MAX_VALUE) > 100;
    }

    @Override // defpackage.ajd
    public void d(String str, gjd gjdVar) {
        str.getClass();
    }

    @Override // defpackage.ajd
    public void e(Context context, Map map, Set set) {
    }

    @Override // defpackage.qo6
    public Object f(String str, Provider provider) {
        switch (this.E) {
            case 5:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // defpackage.c6d
    public Typeface g(dv7 dv7Var, int i) {
        return q(null, dv7Var, i);
    }

    @Override // defpackage.ajd
    public void h(h99 h99Var) {
    }

    @Override // defpackage.b9f
    public void i(boolean z, int i, int i2, int i3) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // defpackage.c6b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.d6b j(defpackage.h2f r5) throws java.lang.Throwable {
        /*
            r4 = this;
            r4 = 0
            android.media.MediaCodec r4 = r(r5)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r0 = "configureCodec"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r0 = r5.e     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.view.Surface r0 = (android.view.Surface) r0     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r0 != 0) goto L25
            java.lang.Object r1 = r5.b     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            g6b r1 = (defpackage.g6b) r1     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            boolean r1 = r1.h     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r1 == 0) goto L25
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r2 = 35
            if (r1 < r2) goto L25
            r1 = 8
            goto L26
        L21:
            r5 = move-exception
            goto L49
        L23:
            r5 = move-exception
            goto L49
        L25:
            r1 = 0
        L26:
            java.lang.Object r2 = r5.c     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaFormat r2 = (android.media.MediaFormat) r2     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r3 = r5.f     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.media.MediaCrypto r3 = (android.media.MediaCrypto) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r4.configure(r2, r0, r3, r1)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r0 = "startCodec"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r4.start()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            dke r0 = new dke     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.Object r5 = r5.g     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            xv8 r5 = (defpackage.xv8) r5     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r0.<init>(r4, r5)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r0
        L49:
            if (r4 == 0) goto L4e
            r4.release()
        L4e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am4.j(h2f):d6b");
    }

    @Override // defpackage.c6d
    public Typeface k(z28 z28Var, dv7 dv7Var, int i) {
        String strConcat = z28Var.J;
        int i2 = dv7Var.E / 100;
        if (i2 >= 0 && i2 < 2) {
            strConcat = strConcat.concat("-thin");
        } else if (2 <= i2 && i2 < 4) {
            strConcat = strConcat.concat("-light");
        } else if (i2 != 4) {
            if (i2 == 5) {
                strConcat = strConcat.concat("-medium");
            } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                strConcat = strConcat.concat("-black");
            }
        }
        Typeface typeface = null;
        if (strConcat.length() != 0) {
            Typeface typefaceQ = q(strConcat, dv7Var, i);
            if (!x44.r(typefaceQ, Typeface.create(Typeface.DEFAULT, xpk.c(dv7Var, i))) && !x44.r(typefaceQ, q(null, dv7Var, i))) {
                typeface = typefaceQ;
            }
        }
        return typeface == null ? q(z28Var.J, dv7Var, i) : typeface;
    }

    @Override // defpackage.ajd
    public void l(String str) {
        str.getClass();
    }

    @Override // defpackage.unc
    public int m(nz9 nz9Var, int i) {
        return (int) (i * 0.95f);
    }

    @Override // defpackage.ajd
    public boolean n(String str) {
        str.getClass();
        return false;
    }

    @Override // defpackage.sac
    public Object o0() {
        return new ConcurrentHashMap();
    }

    @Override // defpackage.b9f
    public void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    public int t(int i) {
        return i == 7 ? 6 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.oo9 x(android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am4.x(android.view.KeyEvent):oo9");
    }
}
