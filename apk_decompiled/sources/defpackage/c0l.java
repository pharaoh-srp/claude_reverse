package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.util.Log;
import android.webkit.WebView;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.airbnb.lottie.parser.moshi.a;
import com.anthropic.claude.R;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import okio.Buffer;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class c0l implements br4, v0i, b45, occ, ia4, d8j, hf5, x4d, fri, j5i, cec, c4f, tp1, sac {
    public static c0l F;
    public static l4e U;
    public final /* synthetic */ int E;
    public static final wg6 G = new wg6(21);
    public static final c0l H = new c0l(2);
    public static final c0l I = new c0l(3);
    public static final /* synthetic */ c0l J = new c0l(4);
    public static final c0l K = new c0l(6);
    public static final c0l L = new c0l(7);
    public static final String[] M = new String[0];
    public static final c0l N = new c0l(9);
    public static final rl7 O = new rl7(18);
    public static final /* synthetic */ c0l P = new c0l(12);
    public static final lnc Q = new lnc();
    public static final c0l R = new c0l(13);
    public static final c0l S = new c0l(14);
    public static final c0l T = new c0l(16);
    public static final c0l V = new c0l(17);
    public static final c0l W = new c0l(18);
    public static final wjj X = new wjj();
    public static final /* synthetic */ c0l Y = new c0l(20);
    public static final /* synthetic */ c0l Z = new c0l(21);

    public /* synthetic */ c0l(int i) {
        this.E = i;
    }

    public static nxf g(long j, long j2, long j3, long j4, long j5, ld4 ld4Var, int i) {
        long j6 = (i & 1) != 0 ? ((d54) ((e18) ld4Var).j(on4.a)).a : j;
        long j7 = (i & 4) != 0 ? gm3.a(ld4Var).O : j2;
        return new nxf(j6, j6, j7, (i & 8) != 0 ? d54.b(0.38f, j6) : j3, (i & 16) != 0 ? d54.b(0.38f, j6) : j4, (i & 32) != 0 ? d54.b(0.38f, j7) : j5);
    }

    public static final long j(int i, int i2, j8g j8gVar, k6f k6fVar, j8g j8gVar2) {
        int i3;
        int i4;
        if (!x44.r(j8gVar, j8g.c)) {
            i = r(j8gVar.a, k6fVar);
            i2 = r(j8gVar.b, k6fVar);
        }
        v46 v46Var = j8gVar2.a;
        v46 v46Var2 = j8gVar2.b;
        if ((v46Var instanceof q46) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = ((q46) v46Var).a)) {
            i = i4;
        }
        if ((v46Var2 instanceof q46) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = ((q46) v46Var2).a)) {
            i2 = i3;
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final double k(int i, int i2, int i3, int i4, k6f k6fVar, j8g j8gVar) {
        double dMax;
        double d = i;
        double d2 = ((double) i3) / d;
        double d3 = i2;
        double d4 = ((double) i4) / d3;
        int iOrdinal = k6fVar.ordinal();
        if (iOrdinal == 0) {
            dMax = Math.max(d2, d4);
        } else {
            if (iOrdinal != 1) {
                wg6.i();
                return 0.0d;
            }
            dMax = Math.min(d2, d4);
        }
        v46 v46Var = j8gVar.a;
        if (v46Var instanceof q46) {
            double d5 = ((double) ((q46) v46Var).a) / d;
            if (dMax > d5) {
                dMax = d5;
            }
        }
        v46 v46Var2 = j8gVar.b;
        if (v46Var2 instanceof q46) {
            double d6 = ((double) ((q46) v46Var2).a) / d3;
            if (dMax > d6) {
                return d6;
            }
        }
        return dMax;
    }

    public static qnc p() {
        return new qnc(20.0f, 8.0f, 12.0f, 8.0f);
    }

    public static whb q(mtc mtcVar) {
        mtcVar.getClass();
        if (mtcVar instanceof qxh) {
            qxh qxhVar = (qxh) mtcVar;
            if (qxhVar.getCanBeCollapsed()) {
                return new vhb(qxhVar);
            }
        }
        if (mtcVar instanceof ParsedContentBlock$Thinking) {
            return new uhb((ParsedContentBlock$Thinking) mtcVar);
        }
        if (mtcVar instanceof htc) {
            return new thb((htc) mtcVar);
        }
        return null;
    }

    public static int r(v46 v46Var, k6f k6fVar) {
        if (v46Var instanceof q46) {
            return ((q46) v46Var).a;
        }
        int iOrdinal = k6fVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        wg6.i();
        return 0;
    }

    @Override // defpackage.occ
    public int D(int i) {
        return 0;
    }

    @Override // defpackage.v0i
    public String H(Context context, boolean z, boolean z2) {
        context.getClass();
        String string = context.getString(z2 ? R.string.chart_display_tool_status_failed : z ? R.string.chart_display_tool_status_success : R.string.chart_display_tool_status_loading);
        string.getClass();
        return string;
    }

    @Override // defpackage.tp1
    public long a(long j) {
        return j;
    }

    @Override // defpackage.j5i
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.c4f
    public boolean b(cf5 cf5Var) {
        return true;
    }

    @Override // defpackage.x4d
    public boolean c(qqb qqbVar, p16 p16Var) {
        qqbVar.getClass();
        return true;
    }

    @Override // defpackage.d8j
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    public void d(Drawable drawable, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(257732500);
        int i2 = (e18Var.h(drawable) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            iqb iqbVarO = b.o(fqb.E, dp4.e);
            boolean zH = e18Var.h(drawable);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new d6d(24, drawable);
                e18Var.k0(objN);
            }
            dw1.a(zni.s(iqbVarO, (bz7) objN), e18Var, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ufe(this, drawable, i, 22);
        }
    }

    @Override // defpackage.hf5
    public Iterable e(Object obj) {
        wn9[] wn9VarArr = wj9.K;
        return ((e92) obj).a().i();
    }

    public void f(final Icon icon, ld4 ld4Var, final int i) {
        r7e r7eVarS;
        pz7 pz7Var;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2116504409);
        int i2 = (e18Var.h(icon) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) e18Var.j(w00.b);
            boolean zF = e18Var.f(icon) | e18Var.f(context);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = icon.loadDrawable(context);
                e18Var.k0(objN);
            }
            Drawable drawable = (Drawable) objN;
            if (drawable == null) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    pz7Var = new pz7(this, icon, i, i3) { // from class: geh
                        public final /* synthetic */ int E;
                        public final /* synthetic */ c0l F;
                        public final /* synthetic */ Icon G;

                        {
                            this.E = i3;
                            this.F = this;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.E;
                            iei ieiVar = iei.a;
                            Icon icon2 = this.G;
                            c0l c0lVar = this.F;
                            ld4 ld4Var2 = (ld4) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    c0lVar.f(icon2, ld4Var2, x44.p0(49));
                                    break;
                                default:
                                    c0lVar.f(icon2, ld4Var2, x44.p0(49));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            d(drawable, e18Var, 48);
        } else {
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            pz7Var = new pz7(this, icon, i, i4) { // from class: geh
                public final /* synthetic */ int E;
                public final /* synthetic */ c0l F;
                public final /* synthetic */ Icon G;

                {
                    this.E = i4;
                    this.F = this;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.E;
                    iei ieiVar = iei.a;
                    Icon icon2 = this.G;
                    c0l c0lVar = this.F;
                    ld4 ld4Var2 = (ld4) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            c0lVar.f(icon2, ld4Var2, x44.p0(49));
                            break;
                        default:
                            c0lVar.f(icon2, ld4Var2, x44.p0(49));
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    @Override // defpackage.d8j
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.br4
    public Object h(Object obj) {
        rqe rqeVar = (rqe) obj;
        try {
            Buffer buffer = new Buffer();
            rqeVar.G0().F0(buffer);
            return new qqe(rqeVar.e(), rqeVar.d(), buffer);
        } finally {
            rqeVar.close();
        }
    }

    @Override // defpackage.d8j
    public String[] i() {
        return M;
    }

    @Override // defpackage.occ
    public int l(int i) {
        return 0;
    }

    @Override // defpackage.d8j
    public void m(g8j g8jVar, jke jkeVar) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.fri
    public Object n(a aVar, float f) {
        boolean z = aVar.e() == 1;
        if (z) {
            aVar.beginArray();
        }
        float fNextDouble = (float) aVar.nextDouble();
        float fNextDouble2 = (float) aVar.nextDouble();
        while (aVar.hasNext()) {
            aVar.skipValue();
        }
        if (z) {
            aVar.endArray();
        }
        return new n6f((fNextDouble / 100.0f) * f, (fNextDouble2 / 100.0f) * f);
    }

    @Override // defpackage.d8j
    public void o(g8j g8jVar, mvd mvdVar) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.sac
    public Object o0() {
        return new LinkedHashSet();
    }

    @Override // defpackage.cec
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        Object objI = el5Var.i(new qzd(xr1.class, Executor.class));
        objI.getClass();
        return d4c.N((Executor) objI);
    }

    public String toString() {
        switch (this.E) {
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return "AllSampler { sample=true }";
            default:
                return super.toString();
        }
    }
}
