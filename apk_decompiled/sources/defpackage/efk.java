package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.measurement.n0;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.g;
import io.sentry.h6;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class efk implements gz1, ia4, tn7, tai, dzk, s16, ka4, jo4, h6, sb, wi7, pog, fe7 {
    public static final efk F = new efk(1);
    public static final efk G = new efk(2);
    public static final fu9 H = fu9.E;
    public static final fz5 I = new fz5(1.0f, 1.0f);
    public static final efk J = new efk(3);
    public static final efk K = new efk(4);
    public static final efk L = new efk(5);
    public static final efk M = new efk(6);
    public static final efk N = new efk(7);
    public static final /* synthetic */ efk O = new efk(8);
    public static final efk P = new efk(9);
    public static final /* synthetic */ efk Q = new efk(10);
    public static final efk R = new efk(11);
    public final /* synthetic */ int E;

    public /* synthetic */ efk(int i) {
        this.E = i;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static nrh t(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return nrh.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return nrh.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return nrh.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return nrh.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return nrh.SSL_3_0;
        }
        sz6.p("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static pf6 u(String str) {
        Object next;
        str.getClass();
        Iterator<E> it = pf6.R.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((pf6) next).E.equals(str)) {
                break;
            }
        }
        return (pf6) next;
    }

    public static bvd v(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return bvd.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return bvd.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return bvd.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return bvd.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return bvd.SPDY_3;
        }
        if (str.equals("quic")) {
            return bvd.QUIC;
        }
        if (isg.q0(str, "h3", false)) {
            return bvd.HTTP_3;
        }
        xh6.c("Unexpected protocol: ".concat(str));
        return null;
    }

    @Override // defpackage.tn7
    public yr9 A(ntd ntdVar, String str, j7g j7gVar, j7g j7gVar2) {
        ntdVar.getClass();
        str.getClass();
        j7gVar.getClass();
        j7gVar2.getClass();
        if (str.equals("kotlin.jvm.PlatformType")) {
            return ntdVar.l(el9.g) ? new j2e(j7gVar, j7gVar2) : yfd.z(j7gVar, j7gVar2);
        }
        return nu6.c(mu6.ERROR_FLEXIBLE_TYPE, str, j7gVar.toString(), j7gVar2.toString());
    }

    @Override // defpackage.m4i
    public void a(Context context) {
    }

    @Override // defpackage.jo4
    public long b(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        int i = m6f.a;
        return jFloatToRawIntBits;
    }

    @Override // defpackage.wi7
    public File c() {
        return null;
    }

    @Override // defpackage.ka4
    public List d(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (p94 p94Var : componentRegistrar.getComponents()) {
            String str = p94Var.a;
            if (str != null) {
                p94Var = new p94(str, p94Var.b, p94Var.c, p94Var.d, p94Var.e, new ja4(str, 0, p94Var), p94Var.g);
            }
            arrayList.add(p94Var);
        }
        return arrayList;
    }

    @Override // defpackage.dzk
    public boolean e(Class cls) {
        return n0.class.isAssignableFrom(cls);
    }

    @Override // defpackage.dzk
    public zzk f(Class cls) {
        if (!n0.class.isAssignableFrom(cls)) {
            sz6.p("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (zzk) n0.d(cls.asSubclass(n0.class)).e(3);
        } catch (Exception e) {
            xh6.f("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.gz1
    public long g() {
        return 9205357640488583168L;
    }

    @Override // defpackage.ivd
    public Object get() {
        g6j g6jVar = new g6j(0);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            mr9.h("Null flags");
            return null;
        }
        map.put(agd.E, new d91(30000L, 86400000L, set));
        if (set == null) {
            mr9.h("Null flags");
            return null;
        }
        map.put(agd.G, new d91(1000L, 86400000L, set));
        if (set == null) {
            mr9.h("Null flags");
            return null;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(y6f.F)));
        if (setUnmodifiableSet == null) {
            mr9.h("Null flags");
            return null;
        }
        map.put(agd.F, new d91(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() >= agd.values().length) {
            new HashMap();
            return new c91(g6jVar, map);
        }
        sz6.j("Not all priorities have been configured");
        return null;
    }

    @Override // defpackage.gz1
    public cz5 getDensity() {
        return I;
    }

    @Override // defpackage.gz1
    public fu9 getLayoutDirection() {
        return H;
    }

    @Override // defpackage.pog
    public void h(ih1 ih1Var, mpk mpkVar, boolean z) {
    }

    @Override // io.sentry.h6
    public g i(g gVar, io.sentry.n0 n0Var) {
        gVar.getClass();
        if (x44.r(gVar.I, "http")) {
            Object obj = gVar.J.get("http.query");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null && !bsg.I0(str)) {
                gVar.c("http.query", v9e.b(str));
            }
            Object obj2 = gVar.J.get("http.fragment");
            String strA = obj2 instanceof String ? (String) obj2 : null;
            if (strA != null && !bsg.I0(strA)) {
                List list = v9e.a;
                if (!bsg.I0(strA)) {
                    strA = v9e.a(strA);
                }
                gVar.c("http.fragment", strA);
            }
        }
        return gVar;
    }

    @Override // defpackage.tai
    public qai j(ybe ybeVar) {
        ybeVar.getClass();
        return null;
    }

    @Override // defpackage.m4i
    public void k(k99 k99Var, Context context) {
        k99Var.getClass();
        context.getClass();
    }

    @Override // defpackage.wi7
    public File l(File file) {
        return null;
    }

    @Override // defpackage.pog
    public yg1 m() {
        return null;
    }

    @Override // defpackage.sb
    public oyi n(View view, float f, float f2) {
        return null;
    }

    @Override // defpackage.wi7
    public File o() {
        return null;
    }

    @Override // defpackage.sb
    public oyi p(View view, float f, float f2) {
        return null;
    }

    @Override // defpackage.pog
    public bz7 q(lj5 lj5Var) {
        lj5Var.getClass();
        return f06.d0;
    }

    @Override // defpackage.s16
    public Object r(Object obj) {
        String str = (String) obj;
        str.getClass();
        try {
            return UUID.fromString(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        switch (this.E) {
            case 3:
                Object objI = el5Var.i(new qzd(rdi.class, Executor.class));
                objI.getClass();
                return d4c.N((Executor) objI);
            default:
                return new slh();
        }
    }

    public void w(String str, String str2) {
        Collections.singletonMap("track", str).getClass();
    }
}
