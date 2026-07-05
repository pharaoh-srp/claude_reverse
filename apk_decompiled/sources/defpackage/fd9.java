package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Base64;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.e;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.e0;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes.dex */
public class fd9 {
    public static cbi j = null;
    public static final ta4 k;
    public static final w86 l;
    public static final mrg m;
    public static volatile boolean n = true;
    public static long o = -1;
    public final WeakReference a;
    public final fxc b;
    public final ArrayList c;
    public final Window d;
    public long e;
    public long f;
    public long g;
    public final ey7 h;
    public final ed9 i;

    static {
        new ta4(-1279944877, false, new s03(29));
        k = new ta4(-2071655068, false, new xe3(6));
        l = new w86();
        m = new mrg("google_sign_in_web_client_id");
    }

    public fd9(cd9 cd9Var, View view, Window window) {
        this.a = new WeakReference(view);
        Choreographer.getInstance().getClass();
        View rootView = view.getRootView();
        Object tag = rootView.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new fxc();
            rootView.setTag(R.id.metricsStateHolder, tag);
        }
        this.b = (fxc) tag;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = window;
        ey7 ey7Var = new ey7(arrayList);
        ey7Var.e = 0L;
        this.h = ey7Var;
        this.i = new ed9(this, 0, cd9Var);
    }

    public static void A(String str, int i, int i2, boolean z) {
        if (z) {
            return;
        }
        sz6.p(iik.g(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void B(String str, int i, boolean z) {
        if (z) {
            return;
        }
        sz6.p(iik.g(str, Integer.valueOf(i)));
    }

    public static void C(String str, boolean z) {
        if (z) {
            return;
        }
        sz6.p(str);
    }

    public static void D(String str, boolean z, long j2) {
        if (z) {
            return;
        }
        sz6.p(iik.g(str, Long.valueOf(j2)));
    }

    public static void E(boolean z) {
        if (z) {
            return;
        }
        mr9.y();
    }

    public static void F(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        sz6.p(iik.g(str, obj));
    }

    public static void G(int i, int i2) {
        String strG;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strG = iik.g("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    sz6.p(grc.p(i2, "negative size: "));
                    return;
                }
                strG = iik.g("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static void H(t7b t7bVar) {
        t7bVar.getClass();
    }

    public static void I(String str, Object obj) {
        if (obj != null) {
            return;
        }
        mr9.h(str);
    }

    public static void J(int i, int i2) {
        if (i < 0 || i > i2) {
            xh6.j(u(i, i2, "index"));
        }
    }

    public static void K(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? u(i, i3, "start index") : (i2 < 0 || i2 > i3) ? u(i2, i3, "end index") : iik.g("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void L(String str, boolean z) {
        if (z) {
            return;
        }
        sz6.j(str);
    }

    public static void M(boolean z) {
        if (z) {
            return;
        }
        e0.b();
    }

    public static final Object N(pz7 pz7Var, tp4 tp4Var) {
        n7f n7fVar = new n7f(tp4Var, tp4Var.getContext());
        return gb9.W(n7fVar, true, n7fVar, pz7Var);
    }

    public static final l45 O(c45 c45Var, ld4 ld4Var) {
        if (c45Var.x0(dd8.J) == null) {
            return new e(((e18) ld4Var).R, c45Var);
        }
        mf9 mf9VarG = knk.g();
        mf9VarG.c0(new e94(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return c(mf9VarG);
    }

    public static byte[] P(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static final boolean Q(File file, h99 h99Var) {
        file.getClass();
        h99Var.getClass();
        Boolean boolValueOf = Boolean.FALSE;
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            boolValueOf = Boolean.valueOf(file.delete());
        } catch (SecurityException e) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
        } catch (Exception e2) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
        }
        return boolValueOf.booleanValue();
    }

    public static String R(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static final void S(l45 l45Var) {
        knk.u(l45Var.getCoroutineContext());
    }

    public static final boolean T(File file, h99 h99Var) {
        file.getClass();
        h99Var.getClass();
        Boolean boolValueOf = Boolean.FALSE;
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            boolValueOf = Boolean.valueOf(file.exists());
        } catch (SecurityException e) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
        } catch (Exception e2) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
        }
        return boolValueOf.booleanValue();
    }

    public static final void U(jne jneVar, eug eugVar) {
        int iHashCode = qug.a.hashCode();
        pug pugVar = jneVar.K;
        pugVar.getClass();
        boolean z = (pugVar.c0.c.h() & 4) != 0;
        int i = jneVar.F;
        if (!z) {
            jneVar.F = i + 1;
            return;
        }
        int i2 = iHashCode ^ i;
        int i3 = jneVar.E;
        jne jneVar2 = kne.a;
        jneVar.E = Integer.rotateLeft(i3, 3) ^ i2;
        wub wubVar = jneVar.G;
        if (wubVar == null) {
            wubVar = new wub();
            jneVar.G = wubVar;
        }
        wubVar.a(i);
        jneVar.F = 0;
        eugVar.a(jneVar);
        jneVar.F = wubVar.f(wubVar.b - 1) + 1;
        jneVar.E = Integer.rotateRight(jneVar.E ^ i2, 3);
    }

    public static c4f V(vf4 vf4Var, l35 l35Var) {
        int i = 22;
        if (vf4Var == null) {
            return new c0l(i);
        }
        String str = vf4Var.r;
        HashMap map = vf4Var.q0;
        HashMap map2 = vf4Var.r0;
        String str2 = vf4Var.s0;
        j3i j3iVarA = j3i.b;
        if (str2 != null) {
            j3iVarA = j3i.a(str2);
        }
        boolean z = (map == null || map.isEmpty()) ? false : true;
        boolean z2 = (map2 == null || map2.isEmpty()) ? false : true;
        boolean zIsEmpty = j3iVarA.a.isEmpty();
        boolean zC = vf4Var.E1.c("v2.compatibility.enabled", false, new String[0]);
        Double d = l35Var != null ? l35Var.j : vf4Var.t0;
        if (zC && (z || z2 || !zIsEmpty || d != null)) {
            try {
                return kxe.c(map, map2, j3iVarA, d, vf4Var.u0);
            } catch (IllegalArgumentException unused) {
                return new c0l(i);
            }
        }
        if (d == null) {
            return vf4Var.q ? "keep".equalsIgnoreCase(str) ? new wv7(1) : "drop".equalsIgnoreCase(str) ? new wv7(0) : new o1e() : new c0l(i);
        }
        o1e o1eVar = new o1e();
        o1eVar.E = new q28(d.doubleValue());
        return o1eVar;
    }

    public static wxe W(String str, h99 h99Var) {
        h99Var.getClass();
        try {
            qh9 qh9VarG = v40.J(str).g();
            String strM = qh9VarG.s("type").m();
            if (!x44.r(strM, "view")) {
                dch.H(h99Var, 5, g99.E, new rb1(strM, 29), null, false, 56);
                return null;
            }
            String strM2 = qh9VarG.s("viewId").m();
            long jK = qh9VarG.s("documentVersion").k();
            bh9 bh9VarS = qh9VarG.s("hasAccessibility");
            boolean zA = bh9VarS == null ? false : bh9VarS.a();
            strM2.getClass();
            return new wxe(strM2, Boolean.valueOf(zA), jK);
        } catch (ClassCastException e) {
            pmf.j("Unable to parse json into RUM event meta", e);
            return null;
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into RUM event meta", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into RUM event meta", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into RUM event meta", e4);
            return null;
        }
    }

    public static ka X(qh9 qh9Var) {
        try {
            return new ka(qh9Var.s("count").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Crash", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Crash", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Crash", e3);
            return null;
        }
    }

    public static cf8 Y(SSLSession sSLSession) throws IOException {
        Object objL;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            sz6.j("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            xh6.c("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        zf3 zf3VarR = zf3.b.r(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            sz6.j("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            xh6.c("tlsVersion == NONE");
            return null;
        }
        nrh.F.getClass();
        nrh nrhVarT = efk.t(protocol);
        try {
            objL = blj.l(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objL = lm6.E;
        }
        return new cf8(nrhVarT, zf3VarR, blj.l(sSLSession.getLocalCertificates()), new p7(29, objL));
    }

    public static rcg Z() {
        return (rcg) ycg.b.get();
    }

    public static final void a(final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final zy7 zy7Var, final zy7 zy7Var2, final zy7 zy7Var3, final zy7 zy7Var4, final zy7 zy7Var5, final zy7 zy7Var6, final zy7 zy7Var7, ld4 ld4Var, final int i) {
        str.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        zy7Var5.getClass();
        zy7Var6.getClass();
        zy7Var7.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1916938979);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.g(z4) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var) ? 131072 : 65536) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.h(zy7Var3) ? 8388608 : 4194304) | (e18Var.h(zy7Var4) ? 67108864 : 33554432) | (e18Var.h(zy7Var5) ? 536870912 : 268435456);
        if (e18Var.Q(i2 & 1, ((306783379 & i2) == 306783378 && (((e18Var.h(zy7Var6) ? (char) 4 : (char) 2) | (e18Var.h(zy7Var7) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            wsk.c(q0(1034519218, new ka3(str, z, z2, z3, z4, zy7Var, zy7Var2, zy7Var3, zy7Var4, zy7Var5, zy7Var6, zy7Var7), e18Var), ywj.c, e18Var, 54);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(str, z, z2, z3, z4, zy7Var, zy7Var2, zy7Var3, zy7Var4, zy7Var5, zy7Var6, zy7Var7, i) { // from class: la3
                public final /* synthetic */ String E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ boolean I;
                public final /* synthetic */ zy7 J;
                public final /* synthetic */ zy7 K;
                public final /* synthetic */ zy7 L;
                public final /* synthetic */ zy7 M;
                public final /* synthetic */ zy7 N;
                public final /* synthetic */ zy7 O;
                public final /* synthetic */ zy7 P;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    fd9.a(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(final ta4 ta4Var, ta4 ta4Var2, ta4 ta4Var3, iqb iqbVar, float f, ld4 ld4Var, int i) {
        final ta4 ta4Var4;
        ta4 ta4Var5;
        iqb iqbVar2;
        float f2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-163846153);
        int i2 = i | 27648;
        final int i3 = 0;
        final int i4 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            final float f3 = 50.0f;
            ta4 ta4VarQ0 = q0(1381627574, new pz7() { // from class: ha3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    iei ieiVar = iei.a;
                    fqb fqbVar = fqb.E;
                    ta4 ta4Var6 = ta4Var;
                    float f4 = f3;
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            e18 e18Var2 = (e18) ld4Var2;
                            if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                e18Var2.T();
                            } else {
                                xo1 xo1Var = lja.K;
                                iqb iqbVarG = b.g(fqbVar, f4, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                o5b o5bVarD = dw1.d(xo1Var, false);
                                int iHashCode = Long.hashCode(e18Var2.T);
                                hyc hycVarL = e18Var2.l();
                                iqb iqbVarE = kxk.E(e18Var2, iqbVarG);
                                dd4.e.getClass();
                                re4 re4Var = cd4.b;
                                e18Var2.e0();
                                if (e18Var2.S) {
                                    e18Var2.k(re4Var);
                                } else {
                                    e18Var2.n0();
                                }
                                d4c.i0(e18Var2, cd4.f, o5bVarD);
                                d4c.i0(e18Var2, cd4.e, hycVarL);
                                d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                                d4c.h0(e18Var2, cd4.h);
                                d4c.i0(e18Var2, cd4.d, iqbVarE);
                                vb7.y(0, ta4Var6, e18Var2, true);
                            }
                            break;
                        default:
                            e18 e18Var3 = (e18) ld4Var2;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                e18Var3.T();
                            } else {
                                xo1 xo1Var2 = lja.K;
                                iqb iqbVarG2 = b.g(fqbVar, f4, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                o5b o5bVarD2 = dw1.d(xo1Var2, false);
                                int iHashCode2 = Long.hashCode(e18Var3.T);
                                hyc hycVarL2 = e18Var3.l();
                                iqb iqbVarE2 = kxk.E(e18Var3, iqbVarG2);
                                dd4.e.getClass();
                                re4 re4Var2 = cd4.b;
                                e18Var3.e0();
                                if (e18Var3.S) {
                                    e18Var3.k(re4Var2);
                                } else {
                                    e18Var3.n0();
                                }
                                d4c.i0(e18Var3, cd4.f, o5bVarD2);
                                d4c.i0(e18Var3, cd4.e, hycVarL2);
                                d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                                d4c.h0(e18Var3, cd4.h);
                                d4c.i0(e18Var3, cd4.d, iqbVarE2);
                                vb7.y(0, ta4Var6, e18Var3, true);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }, e18Var);
            ta4Var4 = ta4Var2;
            ta4 ta4VarQ02 = q0(341335735, new pz7() { // from class: ha3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    iei ieiVar = iei.a;
                    fqb fqbVar = fqb.E;
                    ta4 ta4Var6 = ta4Var4;
                    float f4 = f3;
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            e18 e18Var2 = (e18) ld4Var2;
                            if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                e18Var2.T();
                            } else {
                                xo1 xo1Var = lja.K;
                                iqb iqbVarG = b.g(fqbVar, f4, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                o5b o5bVarD = dw1.d(xo1Var, false);
                                int iHashCode = Long.hashCode(e18Var2.T);
                                hyc hycVarL = e18Var2.l();
                                iqb iqbVarE = kxk.E(e18Var2, iqbVarG);
                                dd4.e.getClass();
                                re4 re4Var = cd4.b;
                                e18Var2.e0();
                                if (e18Var2.S) {
                                    e18Var2.k(re4Var);
                                } else {
                                    e18Var2.n0();
                                }
                                d4c.i0(e18Var2, cd4.f, o5bVarD);
                                d4c.i0(e18Var2, cd4.e, hycVarL);
                                d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                                d4c.h0(e18Var2, cd4.h);
                                d4c.i0(e18Var2, cd4.d, iqbVarE);
                                vb7.y(0, ta4Var6, e18Var2, true);
                            }
                            break;
                        default:
                            e18 e18Var3 = (e18) ld4Var2;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                e18Var3.T();
                            } else {
                                xo1 xo1Var2 = lja.K;
                                iqb iqbVarG2 = b.g(fqbVar, f4, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                o5b o5bVarD2 = dw1.d(xo1Var2, false);
                                int iHashCode2 = Long.hashCode(e18Var3.T);
                                hyc hycVarL2 = e18Var3.l();
                                iqb iqbVarE2 = kxk.E(e18Var3, iqbVarG2);
                                dd4.e.getClass();
                                re4 re4Var2 = cd4.b;
                                e18Var3.e0();
                                if (e18Var3.S) {
                                    e18Var3.k(re4Var2);
                                } else {
                                    e18Var3.n0();
                                }
                                d4c.i0(e18Var3, cd4.f, o5bVarD2);
                                d4c.i0(e18Var3, cd4.e, hycVarL2);
                                d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                                d4c.h0(e18Var3, cd4.h);
                                d4c.i0(e18Var3, cd4.d, iqbVarE2);
                                vb7.y(0, ta4Var6, e18Var3, true);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }, e18Var);
            ta4Var5 = ta4Var3;
            ta4 ta4VarQ03 = q0(1399013984, new cu2(f3, ta4Var5), e18Var);
            iqbVar2 = fqb.E;
            zni.e(iqbVar2, ta4VarQ0, ta4VarQ02, ta4VarQ03, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var, 3510, 240);
            f2 = 50.0f;
        } else {
            ta4Var4 = ta4Var2;
            ta4Var5 = ta4Var3;
            e18Var.T();
            iqbVar2 = iqbVar;
            f2 = f;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ja3(ta4Var, ta4Var4, ta4Var5, iqbVar2, f2, i);
        }
    }

    public static final mp4 c(c45 c45Var) {
        if (c45Var.x0(dd8.J) == null) {
            c45Var = c45Var.r0(knk.g());
        }
        return new mp4(c45Var);
    }

    public static final int c0(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final void d(Object obj, bz7 bz7Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        boolean zF = e18Var.f(obj);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new u86(bz7Var);
            e18Var.k0(objN);
        }
    }

    public static final boolean d0(l45 l45Var) {
        lf9 lf9Var = (lf9) l45Var.getCoroutineContext().x0(dd8.J);
        if (lf9Var != null) {
            return lf9Var.c();
        }
        return true;
    }

    public static final void e(Object obj, Object obj2, bz7 bz7Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        boolean zF = e18Var.f(obj) | e18Var.f(obj2);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new u86(bz7Var);
            e18Var.k0(objN);
        }
    }

    public static final boolean e0(File file, h99 h99Var) {
        file.getClass();
        h99Var.getClass();
        Boolean boolValueOf = Boolean.FALSE;
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            boolValueOf = Boolean.valueOf(file.isDirectory());
        } catch (SecurityException e) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
        } catch (Exception e2) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
        }
        return boolValueOf.booleanValue();
    }

    public static final void f(Object obj, Object obj2, Object obj3, bz7 bz7Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        boolean zF = e18Var.f(obj) | e18Var.f(obj2) | e18Var.f(obj3);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new u86(bz7Var);
            e18Var.k0(objN);
        }
    }

    public static final boolean f0(toh tohVar, ooh oohVar) {
        return tohVar.a(oohVar) != lja.b0;
    }

    public static final void g(Object[] objArr, bz7 bz7Var, ld4 ld4Var) {
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= ((e18) ld4Var).f(obj);
        }
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            e18Var.k0(new u86(bz7Var));
        }
    }

    public static final boolean g0(av9 av9Var) {
        if (av9Var.M == null) {
            return false;
        }
        av9 av9VarG = av9Var.G();
        return (av9VarG != null ? av9VarG.M : null) == null || av9Var.t().b;
    }

    public static final void h(vt6 vt6Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-349751986);
        int i2 = (e18Var.f(vt6Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2 | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            q64 q64VarA = p64.a(ko0.c, lja.T, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            uik.c(vt6Var, null, tik.g(e18Var), null, zy7Var, e18Var, (i3 & 14) | ((i3 << 9) & 57344), 10);
            kxk.g(e18Var, b.e(fqbVar, 16.0f));
            csg.j(zy7Var2, null, false, null, null, null, null, j8.d, e18Var, ((i3 >> 6) & 14) | 805306368, 510);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(vt6Var, zy7Var, zy7Var2, iqbVar2, i, 6);
        }
    }

    public static final iqb h0(iqb iqbVar, rz7 rz7Var) {
        return iqbVar.B(new gu9(rz7Var));
    }

    public static final void i(ld4 ld4Var, pz7 pz7Var, Object obj) {
        c45 c45Var = ((e18) ld4Var).R;
        e18 e18Var = (e18) ld4Var;
        boolean zF = e18Var.f(obj);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new c(c45Var, pz7Var);
            e18Var.k0(objN);
        }
    }

    public static final long i0(File file, h99 h99Var) {
        file.getClass();
        h99Var.getClass();
        Long lValueOf = 0L;
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            lValueOf = Long.valueOf(file.length());
        } catch (SecurityException e) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
        } catch (Exception e2) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
        }
        return lValueOf.longValue();
    }

    public static final void j(Object obj, Object obj2, pz7 pz7Var, ld4 ld4Var) {
        c45 c45Var = ((e18) ld4Var).R;
        e18 e18Var = (e18) ld4Var;
        boolean zF = e18Var.f(obj) | e18Var.f(obj2);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new c(c45Var, pz7Var);
            e18Var.k0(objN);
        }
    }

    public static final File[] j0(File file, h99 h99Var) {
        file.getClass();
        h99Var.getClass();
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            return file.listFiles();
        } catch (SecurityException e) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
            return null;
        } catch (Exception e2) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
            return null;
        }
    }

    public static final void k(Object obj, Object obj2, Object obj3, pz7 pz7Var, ld4 ld4Var) {
        c45 c45Var = ((e18) ld4Var).R;
        e18 e18Var = (e18) ld4Var;
        boolean zF = e18Var.f(obj) | e18Var.f(obj2) | e18Var.f(obj3);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new c(c45Var, pz7Var);
            e18Var.k0(objN);
        }
    }

    public static rcg k0(rcg rcgVar) {
        if (rcgVar instanceof g6i) {
            g6i g6iVar = (g6i) rcgVar;
            if (g6iVar.t == zni.q()) {
                g6iVar.r = null;
                return rcgVar;
            }
        }
        if (rcgVar instanceof h6i) {
            h6i h6iVar = (h6i) rcgVar;
            if (h6iVar.i == zni.q()) {
                h6iVar.h = null;
                return rcgVar;
            }
        }
        rcg rcgVarG = ycg.g(rcgVar, null, false);
        rcgVarG.j();
        return rcgVarG;
    }

    public static final void l(Object[] objArr, pz7 pz7Var, ld4 ld4Var) {
        c45 c45Var = ((e18) ld4Var).R;
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= ((e18) ld4Var).f(obj);
        }
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            e18Var.k0(new c(c45Var, pz7Var));
        }
    }

    public static final boolean l0(File file, h99 h99Var) {
        file.getClass();
        h99Var.getClass();
        Boolean boolValueOf = Boolean.FALSE;
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            boolValueOf = Boolean.valueOf(file.mkdirs());
        } catch (SecurityException e) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
        } catch (Exception e2) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(java.lang.String r19, defpackage.jj r20, defpackage.pz7 r21, defpackage.bz7 r22, defpackage.zy7 r23, defpackage.zy7 r24, defpackage.iqb r25, defpackage.fca r26, defpackage.ld4 r27, int r28) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd9.m(java.lang.String, jj, pz7, bz7, zy7, zy7, iqb, fca, ld4, int):void");
    }

    public static Object m0(uz5 uz5Var, zy7 zy7Var) {
        rcg g6iVar;
        rcg rcgVar = (rcg) ycg.b.get();
        if (rcgVar instanceof g6i) {
            g6i g6iVar2 = (g6i) rcgVar;
            if (g6iVar2.t == zni.q()) {
                bz7 bz7Var = g6iVar2.r;
                bz7 bz7Var2 = g6iVar2.s;
                try {
                    ((g6i) rcgVar).r = ycg.k(uz5Var, bz7Var, true);
                    ((g6i) rcgVar).s = bz7Var2;
                    return zy7Var.a();
                } finally {
                    g6iVar2.r = bz7Var;
                    g6iVar2.s = bz7Var2;
                }
            }
        }
        if (rcgVar == null || (rcgVar instanceof kwb)) {
            g6iVar = new g6i(rcgVar instanceof kwb ? (kwb) rcgVar : null, uz5Var, null, true, false);
        } else {
            g6iVar = rcgVar.u(uz5Var);
        }
        try {
            rcg rcgVarJ = g6iVar.j();
            try {
                Object objA = zy7Var.a();
                rcg.q(rcgVarJ);
                g6iVar.c();
                return objA;
            } catch (Throwable th) {
                rcg.q(rcgVarJ);
                throw th;
            }
        } catch (Throwable th2) {
            g6iVar.c();
            throw th2;
        }
    }

    public static final void n(fca fcaVar, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(421865345);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(fcaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.c(MTTypesetterKt.kLineSkipLimitMultiplier) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            olh.a(false, null, null, q0(2027375166, new f73(iqbVar, fcaVar, zy7Var2, zy7Var, 4), e18Var), e18Var, 3072, 7);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xo4(fcaVar, zy7Var, zy7Var2, iqbVar, i);
        }
    }

    public static final void n0(ir9 ir9Var) {
    }

    public static final mp4 o() {
        myg mygVarG = iuj.g();
        ft5 ft5Var = g86.a;
        return new mp4(nai.Z(mygVarG, tpa.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.y42 o0(defpackage.wg8 r26) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd9.o0(wg8):y42");
    }

    public static final void p(final s64 s64Var, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final zy7 zy7Var, final zy7 zy7Var2, final zy7 zy7Var3, final zy7 zy7Var4, final zy7 zy7Var5, final zy7 zy7Var6, final zy7 zy7Var7, ld4 ld4Var, final int i) {
        int i2;
        boolean z5;
        boolean z6;
        boolean z7;
        zy7 zy7Var8;
        zy7 zy7Var9;
        zy7 zy7Var10;
        zy7 zy7Var11;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(165923459);
        if ((i & 48) == 0) {
            i2 = (e18Var2.f(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            z5 = z2;
            i2 |= e18Var2.g(z5) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            z5 = z2;
        }
        if ((i & 24576) == 0) {
            z6 = z3;
            i2 |= e18Var2.g(z6) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            z6 = z3;
        }
        if ((196608 & i) == 0) {
            z7 = z4;
            i2 |= e18Var2.g(z7) ? 131072 : 65536;
        } else {
            z7 = z4;
        }
        if ((1572864 & i) == 0) {
            zy7Var8 = zy7Var;
            i2 |= e18Var2.h(zy7Var8) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            zy7Var8 = zy7Var;
        }
        if ((12582912 & i) == 0) {
            zy7Var9 = zy7Var2;
            i2 |= e18Var2.h(zy7Var9) ? 8388608 : 4194304;
        } else {
            zy7Var9 = zy7Var2;
        }
        if ((100663296 & i) == 0) {
            zy7Var10 = zy7Var3;
            i2 |= e18Var2.h(zy7Var10) ? 67108864 : 33554432;
        } else {
            zy7Var10 = zy7Var3;
        }
        if ((805306368 & i) == 0) {
            zy7Var11 = zy7Var4;
            i2 |= e18Var2.h(zy7Var11) ? 536870912 : 268435456;
        } else {
            zy7Var11 = zy7Var4;
        }
        int i3 = (e18Var2.h(zy7Var5) ? 4 : 2) | (e18Var2.h(zy7Var6) ? 32 : 16) | (e18Var2.h(zy7Var7) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        int i4 = i2;
        if (e18Var2.Q(i4 & 1, ((i4 & 306783377) == 306783376 && (i3 & 147) == 146) ? false : true)) {
            e18Var = e18Var2;
            tjh.b(str, gb9.L(b.v(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 200.0f, 1), 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, new fdh(5), 0L, 2, false, 3, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var, ((i4 >> 3) & 14) | 48, 24960, 109560);
            int i5 = i3 << 24;
            ajk.a(z, z5, z6, z7, zy7Var8, zy7Var9, zy7Var10, zy7Var11, zy7Var5, zy7Var6, zy7Var7, null, e18Var, ((i4 >> 6) & 33554430) | (234881024 & i5) | (i5 & 1879048192), (i3 >> 6) & 14);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: ia3
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i | 1);
                    fd9.p(s64Var, str, z, z2, z3, z4, zy7Var, zy7Var2, zy7Var3, zy7Var4, zy7Var5, zy7Var6, zy7Var7, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final String p0(File file, Charset charset, h99 h99Var) {
        charset.getClass();
        h99Var.getClass();
        if (!T(file, h99Var) || !x(file, h99Var)) {
            return null;
        }
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            return nk7.p0(file, charset);
        } catch (SecurityException e) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
            return null;
        } catch (Exception e2) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
            return null;
        }
    }

    public static final void q(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1047833956);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            zy7Var2 = zy7Var;
            ez1.e(zy7Var2, fqbVar, false, null, null, ywj.a, e18Var, (i4 & 14) | 1572912, 60);
            iqbVar = fqbVar;
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(zy7Var2, iqbVar, i, i3);
        }
    }

    public static final ta4 q0(int i, qz7 qz7Var, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        if (objN == jd4.a) {
            objN = new ta4(i, true, qz7Var);
            e18Var.k0(objN);
        }
        ta4 ta4Var = (ta4) objN;
        if (!ta4Var.G.equals(qz7Var)) {
            ta4Var.G = qz7Var;
            if (ta4Var.F) {
                r7e r7eVar = ta4Var.H;
                if (r7eVar != null) {
                    le4 le4Var = r7eVar.a;
                    if (le4Var != null) {
                        le4Var.s(r7eVar, null);
                    }
                    ta4Var.H = null;
                }
                ArrayList arrayList = ta4Var.I;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        r7e r7eVar2 = (r7e) arrayList.get(i2);
                        le4 le4Var2 = r7eVar2.a;
                        if (le4Var2 != null) {
                            le4Var2.s(r7eVar2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return ta4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[LOOP:0: B:4:0x000d->B:35:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067 A[EDGE_INSN: B:43:0x0067->B:36:0x0067 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0064], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.wjf r(defpackage.av9 r9, boolean r10) {
        /*
            g5c r0 = r9.k0
            java.lang.Object r0 = r0.K
            hqb r0 = (defpackage.hqb) r0
            int r1 = r0.H
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L67
        Ld:
            if (r0 == 0) goto L67
            int r1 = r0.G
            r1 = r1 & 8
            if (r1 == 0) goto L5e
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5e
            boolean r4 = r1 instanceof defpackage.ujf
            if (r4 == 0) goto L1f
            r2 = r1
            goto L67
        L1f:
            int r4 = r1.G
            r4 = r4 & 8
            if (r4 == 0) goto L59
            boolean r4 = r1 instanceof defpackage.qw5
            if (r4 == 0) goto L59
            r4 = r1
            qw5 r4 = (defpackage.qw5) r4
            hqb r4 = r4.T
            r5 = 0
            r6 = r5
        L30:
            r7 = 1
            if (r4 == 0) goto L56
            int r8 = r4.G
            r8 = r8 & 8
            if (r8 == 0) goto L53
            int r6 = r6 + 1
            if (r6 != r7) goto L3f
            r1 = r4
            goto L53
        L3f:
            if (r3 != 0) goto L4a
            wwb r3 = new wwb
            r7 = 16
            hqb[] r7 = new defpackage.hqb[r7]
            r3.<init>(r5, r7)
        L4a:
            if (r1 == 0) goto L50
            r3.b(r1)
            r1 = r2
        L50:
            r3.b(r4)
        L53:
            hqb r4 = r4.J
            goto L30
        L56:
            if (r6 != r7) goto L59
            goto L17
        L59:
            hqb r1 = defpackage.yfd.j(r3)
            goto L17
        L5e:
            int r1 = r0.H
            r1 = r1 & 8
            if (r1 == 0) goto L67
            hqb r0 = r0.J
            goto Ld
        L67:
            r2.getClass()
            ujf r2 = (defpackage.ujf) r2
            hqb r2 = (defpackage.hqb) r2
            hqb r0 = r2.E
            qjf r1 = r9.I()
            if (r1 != 0) goto L7b
            qjf r1 = new qjf
            r1.<init>()
        L7b:
            wjf r2 = new wjf
            r2.<init>(r0, r10, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd9.r(av9, boolean):wjf");
    }

    public static final y59 r0(pl9 pl9Var, Object obj, bz7 bz7Var, ld4 ld4Var) {
        pl9Var.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        swe sweVar = (swe) e18Var.j(twe.a);
        kd4 kd4VarB = sweVar.a.b();
        boolean zF = e18Var.f(obj) | e18Var.f(kd4VarB);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            kd4VarB.getClass();
            obj.getClass();
            y59 y59Var = (y59) ((HashMap) kd4VarB.b).get(obj);
            if (y59Var == null) {
                y59 y59Var2 = (y59) bz7Var.invoke(sweVar);
                kd4VarB.k(obj, y59Var2);
                objN = y59Var2;
            } else {
                objN = y59Var;
            }
            e18Var.k0(objN);
        }
        return (y59) objN;
    }

    public static final void s(zy7 zy7Var, ld4 ld4Var) {
        hjc hjcVar = ((e18) ld4Var).M.b.f;
        hjcVar.a0(vic.d);
        zni.X(hjcVar, 0, zy7Var);
    }

    public static void s0(rcg rcgVar, rcg rcgVar2, bz7 bz7Var) {
        if (rcgVar != rcgVar2) {
            rcgVar2.getClass();
            rcg.q(rcgVar);
            rcgVar2.c();
        } else if (rcgVar instanceof g6i) {
            ((g6i) rcgVar).r = bz7Var;
        } else if (rcgVar instanceof h6i) {
            ((h6i) rcgVar).h = bz7Var;
        } else {
            xh6.d("Non-transparent snapshot was reused: ", rcgVar);
        }
    }

    public static final epk t(Context context, long j2) {
        n11 n11Var = new n11();
        n11Var.D();
        ive iveVar = new ive(26, false);
        iveVar.A(d4c.n0(j2));
        n11Var.y(iveVar.j());
        n11Var.E(context);
        n11Var.A(context);
        n11Var.C(2);
        n11Var.q();
        n11Var.z();
        n11Var.B();
        n11Var.p();
        return n11Var.k();
    }

    public static final void t0(h99 h99Var, iuj iujVar, zy7 zy7Var) {
        h99Var.getClass();
        iujVar.getClass();
        long jNanoTime = System.nanoTime() - 500000000;
        int i = 1;
        boolean zBooleanValue = false;
        while (i <= 3 && !zBooleanValue) {
            if (System.nanoTime() - jNanoTime >= 500000000) {
                try {
                    zBooleanValue = ((Boolean) zy7Var.a()).booleanValue();
                } catch (Exception e) {
                    dch.I(h99Var, 5, x44.X(g99.F, g99.G), qs7.Z, e, 48);
                    zBooleanValue = false;
                }
                jNanoTime = System.nanoTime();
                i++;
            }
        }
    }

    public static String u(int i, int i2, String str) {
        if (i < 0) {
            return iik.g("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return iik.g("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        sz6.p(grc.p(i2, "negative size: "));
        return null;
    }

    public static final int v(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final sz5 w(View view) {
        Context context = view.getContext();
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
        }
        baseContext = null;
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            hz5 hz5VarS = d4c.s(context);
            long jD = mpk.d(configuration.screenWidthDp, configuration.screenHeightDp);
            return new sz5(csg.R(hz5VarS.U0(jD)), jD);
        }
        tdj.a.getClass();
        sdj sdjVar = sdj.a;
        udj udjVar = sdj.b;
        udjVar.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i = Build.VERSION.SDK_INT;
        pv1 pv1Var = (i >= 34 ? ez5.F : i >= 30 ? wv1.F : pyk.W).I(contextWrapper2, udjVar.b).a;
        long jWidth = (((long) pv1Var.c().width()) << 32) | (((long) pv1Var.c().height()) & 4294967295L);
        return new sz5(jWidth, d4c.s(baseContext).s(csg.T(jWidth)));
    }

    public static final boolean x(File file, h99 h99Var) {
        h99Var.getClass();
        Boolean boolValueOf = Boolean.FALSE;
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            boolValueOf = Boolean.valueOf(file.canRead());
        } catch (SecurityException e) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
        } catch (Exception e2) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
        }
        return boolValueOf.booleanValue();
    }

    public static final boolean y(File file, h99 h99Var) {
        file.getClass();
        h99Var.getClass();
        Boolean boolValueOf = Boolean.FALSE;
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            boolValueOf = Boolean.valueOf(file.canWrite());
        } catch (SecurityException e) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
        } catch (Exception e2) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
        }
        return boolValueOf.booleanValue();
    }

    public static final void z(l45 l45Var, CancellationException cancellationException) {
        lf9 lf9Var = (lf9) l45Var.getCoroutineContext().x0(dd8.J);
        if (lf9Var != null) {
            lf9Var.d(cancellationException);
        } else {
            xh6.d("Scope cannot be cancelled because it does not have a job: ", l45Var);
        }
    }

    public long a0(FrameMetrics frameMetrics) {
        View view = (View) this.a.get();
        int i = rw5.E;
        return nwk.g(view);
    }

    public ey7 b0(long j2, long j3, FrameMetrics frameMetrics) {
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long j4 = j2 + metric;
        this.g = j4;
        rl rlVar = this.b.a;
        if (rlVar != null) {
            rlVar.D(j2, j4, this.c);
        }
        boolean z = metric > j3;
        long metric2 = frameMetrics.getMetric(8);
        ey7 ey7Var = this.h;
        ey7Var.b = j2;
        ey7Var.c = metric;
        ey7Var.d = z;
        ey7Var.e = metric2;
        return ey7Var;
    }
}
