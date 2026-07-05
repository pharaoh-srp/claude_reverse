package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class msk {
    public static final ta4 a = new ta4(1758914818, false, new vb4(23));
    public static final ta4 b = new ta4(-392568317, false, new vb4(24));

    public static final void a(pw4 pw4Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(693640631);
        int i2 = i | (e18Var2.f(pw4Var) ? 4 : 2) | (e18Var2.h(zy7Var) ? 32 : 16) | 384;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            iuj.f(zy7Var, fqbVar, iuj.G(true, null, e18Var2, 6, 2), MTTypesetterKt.kLineSkipLimitMultiplier, false, null, gm3.a(e18Var2).o, 0L, 0L, null, null, null, fd9.q0(1096401941, new nn(18, pw4Var), e18Var2), e18Var, (i2 >> 3) & 126, 3072, 8120);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(pw4Var, i, zy7Var, iqbVar2, 13);
        }
    }

    public static final void b(pw4 pw4Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1882349902);
        int i2 = i | (e18Var.f(pw4Var) ? 4 : 2);
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            String str = pw4Var.b;
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).i;
            long j = gm3.a(e18Var).N;
            fqb fqbVar = fqb.E;
            tjh.b(str, gb9.K(b.c(fqbVar, 1.0f), 24.0f, 8.0f), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var, 48, 24960, 110584);
            e18Var = e18Var;
            xo1 xo1Var = lja.K;
            hw9 hw9Var = new hw9(1.0f, true);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, o5bVarD);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            String str2 = pw4Var.a;
            z0c z0cVarO = osk.o(pw4Var.c);
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            int i3 = 4;
            boolean z = (i2 & 14) == 4;
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new py3(i3, pw4Var);
                e18Var.k0(objN);
            }
            tnk.g(str2, tjf.b(iqbVarC, false, (bz7) objN), null, null, z0cVarO, null, e18Var, 0, 44);
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(pw4Var, iqbVar, i, 18);
        }
    }

    public static final void c(pz7 pz7Var, sz7 sz7Var, pz7 pz7Var2, sz7 sz7Var2, ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2090131479);
        int i2 = (e18Var.h(pz7Var) ? 4 : 2) | i | (e18Var.h(pz7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        byte b2 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            j8.c(ste.a.a(new rte(pz7Var == null ? rte.e.a : pz7Var, sz7Var == null ? rte.e.b : sz7Var, pz7Var2 == null ? rte.e.c : pz7Var2, sz7Var2 == null ? rte.e.d : sz7Var2)), fd9.q0(-1030900567, new tte(ta4Var, b2, b2), e18Var), e18Var, 56);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new w4d(pz7Var, sz7Var, pz7Var2, sz7Var2, ta4Var, i);
        }
    }

    public static final String d(int i) {
        return grc.p(i, "appWidget-");
    }

    public static final boolean e(nm0 nm0Var) {
        int i = nm0Var.a;
        return Integer.MIN_VALUE <= i && i < -1;
    }

    public static final boolean f(Instant instant, aqh aqhVar, ZoneOffset zoneOffset) {
        instant.getClass();
        aqhVar.getClass();
        if (aqhVar instanceof h69) {
            h69 h69Var = (h69) aqhVar;
            if (!instant.isBefore(h69Var.a) && instant.isBefore(h69Var.b)) {
                return true;
            }
        } else {
            if (!(aqhVar instanceof cea)) {
                wg6.i();
                return false;
            }
            cea ceaVar = (cea) aqhVar;
            if (!instant.isBefore(h(ceaVar.a, zoneOffset)) && instant.isBefore(h(ceaVar.b, zoneOffset))) {
                return true;
            }
        }
        return false;
    }

    public static final kl8 g(gh2 gh2Var, ld4 ld4Var, int i) {
        gh2Var.getClass();
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zH = ((((i & 14) ^ 6) > 4 && e18Var.h(gh2Var)) || (i & 6) == 4) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new f25(m7fVar, 15, gh2Var);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        return (kl8) fd9.r0(kceVar.b(kl8.class), oq5.B(kceVar.b(kl8.class)), (bz7) objN, e18Var);
    }

    public static final Instant h(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        localDateTime.getClass();
        ZoneId zoneIdSystemDefault = zoneOffset;
        if (zoneOffset == null) {
            zoneIdSystemDefault = ZoneId.systemDefault();
        }
        Instant instant = localDateTime.atZone(zoneIdSystemDefault).toInstant();
        instant.getClass();
        return instant;
    }

    public static void i(int i, int i2) {
        String strM;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM = psk.m("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    sz6.p(ij0.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                    return;
                }
                strM = psk.m("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM);
        }
    }

    public static void j(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? k(i, i3, "start index") : (i2 < 0 || i2 > i3) ? k(i2, i3, "end index") : psk.m("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String k(int i, int i2, String str) {
        if (i < 0) {
            return psk.m("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return psk.m("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        sz6.p(ij0.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
