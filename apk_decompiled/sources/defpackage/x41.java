package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import androidx.media3.common.ParserException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x41 {
    public static AudioManager a;
    public static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final float d = 56.0f;

    public static final void a(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(641715181);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            b(zy7Var, fqbVar, fd9.q0(-441878938, new itf(3, (jm3) gm3.c(e18Var).e.E), e18Var), e18Var, (i2 & 14) | 432);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar, i, 19);
        }
    }

    public static final void b(zy7 zy7Var, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        zy7 zy7Var2;
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1260018158);
        if ((i & 6) == 0) {
            zy7Var2 = zy7Var;
            i2 = (e18Var.h(zy7Var2) ? 4 : 2) | i;
        } else {
            zy7Var2 = zy7Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            vve vveVarB = xve.b(14.0f);
            wo1 wo1Var = lja.Q;
            Object objN = e18Var.N();
            int i4 = 14;
            if (objN == jd4.a) {
                objN = new d6f(i4);
                e18Var.k0(objN);
            }
            iqb iqbVarB = b.b(gb9.K(yfd.p(ez1.t(androidx.compose.foundation.b.c(xn5.V(iqbVar.B(new lr1(vveVarB, (bz7) objN)), vveVarB), false, null, null, null, zy7Var2, 15), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).t, vveVarB), gm3.a(e18Var).n, vveVarB), 12.0f, 8.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, 1);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            vb7.y(14 & (i3 >> 6), ta4Var, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new op1(zy7Var, iqbVar, ta4Var, i, 2);
        }
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1109179131);
        int i2 = 2;
        int i3 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48;
        int i4 = 18;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            b(zy7Var, fqbVar, fd9.q0(1857515710, new itf(i2, (jm3) gm3.c(e18Var).e.E), e18Var), e18Var, (i3 & 14) | 432);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar, i, i4);
        }
    }

    public static final void d(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(58286000);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48;
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            b(zy7Var, fqbVar, fd9.q0(-1893576727, new itf(i3, (jm3) gm3.c(e18Var).e.E), e18Var), e18Var, (i2 & 14) | 432);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar, i, 17);
        }
    }

    public static final void e(int i, int i2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i3) {
        iqb iqbVar2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1978910451);
        int i4 = (e18Var.d(i) ? 4 : 2) | i3 | (e18Var.d(i2) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | 24576;
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            fqb fqbVar = fqb.E;
            b(zy7Var, fqbVar, fd9.q0(-774676308, new wx8((jm3) gm3.c(e18Var).e.E, i, i2), e18Var), e18Var, ((i4 >> 9) & 14) | 432);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new vp(i, i2, zy7Var, iqbVar2, i3, 4);
        }
    }

    public static final void f(zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1905268078);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i | 48;
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            b(zy7Var, fqbVar, fd9.q0(-1229071513, new itf(i3, (jm3) gm3.c(e18Var).e.E), e18Var), e18Var, (i2 & 14) | 432);
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xh(zy7Var, iqbVar, i, 16);
        }
    }

    public static final void g(int i, int i2, ld4 ld4Var, zy7 zy7Var, iqb iqbVar) {
        iqb iqbVar2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-386107518);
        int i3 = (e18Var.d(i) ? 4 : 2) | i2 | (e18Var.h(zy7Var) ? 32 : 16) | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            uhk.b(zy7Var, fqbVar, null, null, fd9.q0(1762566618, new ay3(i, (jm3) gm3.c(e18Var).e.E), e18Var), e18Var, ((i3 >> 3) & 14) | 24624, 12);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mu(i, i2, 13, zy7Var, iqbVar2);
        }
    }

    public static final float h(koc kocVar) {
        return kocVar.k().e == ukc.F ? Float.intBitsToFloat((int) (kocVar.o() >> 32)) : Float.intBitsToFloat((int) (kocVar.o() & 4294967295L));
    }

    public static String i(qh9 qh9Var, String str) {
        bh9 bh9VarS = qh9Var.s(str);
        if (bh9VarS == null || !(bh9VarS instanceof vh9)) {
            return null;
        }
        return bh9VarS.h().m();
    }

    public static synchronized AudioManager j(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                hf4 hf4Var = new hf4();
                ac1.d().execute(new fd(applicationContext, 3, hf4Var));
                hf4Var.a();
                AudioManager audioManager2 = a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean k(i06 i06Var) {
        return i06Var.l().E;
    }

    public static boolean l(i06 i06Var) {
        return i06Var.l().F;
    }

    public static int m(dg2 dg2Var) throws ParserException {
        int iG = dg2Var.g(4);
        if (iG == 15) {
            if (dg2Var.b() >= 24) {
                return dg2Var.g(24);
            }
            throw ParserException.a(null, "AAC header insufficient data");
        }
        if (iG < 13) {
            return b[iG];
        }
        throw ParserException.a(null, "AAC header wrong Sampling Frequency Index");
    }

    public static Object n(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final boolean o(koc kocVar, float f) {
        kocVar.k().getClass();
        return !(((kocVar.p() ? -f : h(kocVar)) > MTTypesetterKt.kLineSkipLimitMultiplier ? 1 : ((kocVar.p() ? -f : h(kocVar)) == MTTypesetterKt.kLineSkipLimitMultiplier ? 0 : -1)) > 0);
    }

    public static p r(dg2 dg2Var, boolean z) throws ParserException {
        int iG = dg2Var.g(5);
        if (iG == 31) {
            iG = dg2Var.g(6) + 32;
        }
        int iM = m(dg2Var);
        int iG2 = dg2Var.g(4);
        String strP = grc.p(iG, "mp4a.40.");
        if (iG == 5 || iG == 29) {
            iM = m(dg2Var);
            int iG3 = dg2Var.g(5);
            if (iG3 == 31) {
                iG3 = dg2Var.g(6) + 32;
            }
            iG = iG3;
            if (iG == 22) {
                iG2 = dg2Var.g(4);
            }
        }
        if (z) {
            if (iG != 1 && iG != 2 && iG != 3 && iG != 4 && iG != 6 && iG != 7 && iG != 17) {
                switch (iG) {
                    case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    case 21:
                    case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        break;
                    default:
                        throw ParserException.b("Unsupported audio object type: " + iG);
                }
            }
            if (dg2Var.f()) {
                ysj.u("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (dg2Var.f()) {
                dg2Var.o(14);
            }
            boolean zF = dg2Var.f();
            if (iG2 == 0) {
                mr9.x();
                return null;
            }
            if (iG == 6 || iG == 20) {
                dg2Var.o(3);
            }
            if (zF) {
                if (iG == 22) {
                    dg2Var.o(16);
                }
                if (iG == 17 || iG == 19 || iG == 20 || iG == 23) {
                    dg2Var.o(3);
                }
                dg2Var.o(1);
            }
            switch (iG) {
                case g.MAX_FIELD_NUMBER /* 17 */:
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                case 21:
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    int iG4 = dg2Var.g(2);
                    if (iG4 == 2 || iG4 == 3) {
                        throw ParserException.b("Unsupported epConfig: " + iG4);
                    }
                    break;
            }
        }
        int i = c[iG2];
        if (i != -1) {
            return new p(iM, i, strP);
        }
        throw ParserException.a(null, null);
    }

    public static HashMap s(qh9 qh9Var) {
        bh9 bh9VarS = qh9Var.s("tags");
        if (bh9VarS == null || !(bh9VarS instanceof qh9)) {
            return null;
        }
        qh9 qh9VarG = bh9VarS.g();
        HashMap map = new HashMap();
        Iterator it = ((m7a) qh9VarG.E.entrySet()).iterator();
        while (((o7a) it).hasNext()) {
            p7a p7aVarA = ((l7a) it).a();
            bh9 bh9Var = (bh9) p7aVarA.getValue();
            bh9Var.getClass();
            if (bh9Var instanceof vh9) {
                map.put((String) p7aVarA.getKey(), bh9Var.h().m());
            }
        }
        return map;
    }

    public void p(int i, CharSequence charSequence) {
    }

    public void q(lq1 lq1Var) {
    }
}
