package defpackage;

import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hr8 {
    public static final tq8 E;
    public static final zq8 F;
    public static final ar8 G;
    public static final br8 H;
    public static final cr8 I;
    public static final dr8 J;
    public static final er8 K;
    public static final fr8 L;
    public static final gr8 M;
    public static final jq8 N;
    public static final kq8 O;
    public static final lq8 P;
    public static final mq8 Q;
    public static final nq8 R;
    public static final oq8 S;
    public static final pq8 T;
    public static final qq8 U;
    public static final rq8 V;
    public static final sq8 W;
    public static final uq8 X;
    public static final vq8 Y;
    public static final wq8 Z;
    public static final xq8 a0;
    public static final yq8 b0;
    public static final /* synthetic */ hr8[] c0;

    static {
        tq8 tq8Var = new tq8();
        E = tq8Var;
        zq8 zq8Var = new zq8();
        F = zq8Var;
        ar8 ar8Var = new ar8();
        G = ar8Var;
        br8 br8Var = new br8();
        H = br8Var;
        cr8 cr8Var = new cr8();
        I = cr8Var;
        dr8 dr8Var = new dr8();
        J = dr8Var;
        er8 er8Var = new er8();
        K = er8Var;
        fr8 fr8Var = new fr8();
        L = fr8Var;
        gr8 gr8Var = new gr8();
        M = gr8Var;
        jq8 jq8Var = new jq8();
        N = jq8Var;
        kq8 kq8Var = new kq8();
        O = kq8Var;
        lq8 lq8Var = new lq8();
        P = lq8Var;
        mq8 mq8Var = new mq8();
        Q = mq8Var;
        nq8 nq8Var = new nq8();
        R = nq8Var;
        oq8 oq8Var = new oq8();
        S = oq8Var;
        pq8 pq8Var = new pq8();
        T = pq8Var;
        qq8 qq8Var = new qq8();
        U = qq8Var;
        rq8 rq8Var = new rq8();
        V = rq8Var;
        sq8 sq8Var = new sq8();
        W = sq8Var;
        uq8 uq8Var = new uq8();
        X = uq8Var;
        vq8 vq8Var = new vq8();
        Y = vq8Var;
        wq8 wq8Var = new wq8();
        Z = wq8Var;
        xq8 xq8Var = new xq8();
        a0 = xq8Var;
        yq8 yq8Var = new yq8();
        b0 = yq8Var;
        c0 = new hr8[]{tq8Var, zq8Var, ar8Var, br8Var, cr8Var, dr8Var, er8Var, fr8Var, gr8Var, jq8Var, kq8Var, lq8Var, mq8Var, nq8Var, oq8Var, pq8Var, qq8Var, rq8Var, sq8Var, uq8Var, vq8Var, wq8Var, xq8Var, yq8Var};
        String.valueOf((char) 0);
    }

    public static boolean a(hsh hshVar) {
        if (hshVar.a == 5) {
            return xrg.f(((yrh) hshVar).d.s());
        }
        return false;
    }

    public static void b(dsh dshVar, iq8 iq8Var, evh evhVar) {
        if (evhVar != null) {
            iq8Var.c.o(evhVar);
        }
        iq8Var.m = iq8Var.l;
        iq8Var.l = L;
        iq8Var.x(dshVar);
    }

    public static void c(dsh dshVar, yj6 yj6Var) {
        n31 n31Var = dshVar.g;
        if (n31Var != null) {
            n31Var.getClass();
            m31 m31Var = new m31(n31Var);
            while (m31Var.hasNext()) {
                l31 l31Var = (l31) m31Var.next();
                String str = l31Var.E;
                n31 n31VarK = yj6Var.k();
                if (!n31VarK.o(str)) {
                    n31 n31Var2 = l31Var.G;
                    if (n31Var2 != null && n31Var2.o(str)) {
                        Map map = (Map) (!n31Var2.o("/jsoup.userdata") ? null : n31Var2.v().get("jsoup.attrs"));
                        if (map == null || ((k1e) map.get(str)) == null) {
                            int i = k1e.c;
                        }
                    } else {
                        int i2 = k1e.c;
                    }
                    n31VarK.t(str, n31.h(l31Var.F));
                    l31Var.G = n31VarK;
                }
            }
        }
    }

    public static hr8 valueOf(String str) {
        return (hr8) Enum.valueOf(hr8.class, str);
    }

    public static hr8[] values() {
        return (hr8[]) c0.clone();
    }

    public abstract boolean d(hsh hshVar, iq8 iq8Var);
}
