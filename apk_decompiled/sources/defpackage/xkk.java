package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import androidx.media3.common.ParserException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ByteArrayInputStream;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xkk {
    public static final ta4 a = new ta4(-1376663445, false, new pb4(14));

    public static final void a(ta4 ta4Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1456182209);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            gr9.a(null, fd9.q0(1382412699, new rx0(ta4Var, 5), e18Var), e18Var, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rx0(ta4Var, i, 6);
        }
    }

    public static final void b(vsa vsaVar, int i, zy7 zy7Var, String str, ld4 ld4Var, int i2) {
        int i3;
        zy7 zy7Var2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-123427979);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? e18Var.f(vsaVar) : e18Var.h(vsaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            zy7Var2 = zy7Var;
            i3 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= e18Var.f(str) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            String strK0 = vsaVar.a;
            if (bsg.I0(strK0)) {
                strK0 = null;
            }
            if (strK0 == null) {
                e18Var.a0(1644802839);
                strK0 = d4c.k0(R.string.map_display_tool_location_number, new Object[]{Integer.valueOf(i + 1)}, e18Var);
            } else {
                e18Var.a0(1644801041);
            }
            e18Var.p(false);
            twj.a(zy7Var2, b.c(jvk.k(fqb.E, str), 1.0f), false, null, null, null, sf5.a(1.0f, gm3.a(e18Var).v), fd9.q0(-389572822, new nw7(vsaVar, 10, strK0), e18Var), e18Var, ((i3 >> 6) & 14) | 100663296, 188);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zh(vsaVar, i, zy7Var, str, i2);
        }
    }

    public static final void c(String str, yw8 yw8Var, ld4 ld4Var, int i) {
        yw8 yw8Var2;
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1280567018);
        int i3 = 2;
        int i4 = (e18Var.f(str) ? 4 : 2) | i | 16;
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                mrg mrgVar = nai.j;
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(mrgVar) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(yw8.class), mrgVar, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                yw8Var2 = (yw8) objN;
                i2 = i4 & (-113);
            } else {
                e18Var.T();
                i2 = i4 & (-113);
                yw8Var2 = yw8Var;
            }
            e18Var.q();
            quk.b(str, null, yw8Var2, xn5.V(b.o(fqb.E, 54.0f), gm3.b(e18Var).d), null, null, ho4.a, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, (i2 & 14) | 12582960, 0, 3952);
        } else {
            e18Var.T();
            yw8Var2 = yw8Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lpa(str, yw8Var2, i, i3);
        }
    }

    public static void d(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.a(null, str);
        }
    }

    public static ea e(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("test_execution_id").m();
            strM.getClass();
            return new ea(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type CiTest", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type CiTest", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type CiTest", e3);
            return null;
        }
    }

    public static nbh f(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new nbh(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Session", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Session", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Session", e3);
            return null;
        }
    }

    public static int g(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                        return 8000;
                    case 16:
                        return 256000;
                    case g.MAX_FIELD_NUMBER /* 17 */:
                        return 336000;
                    case g.AVG_FIELD_NUMBER /* 18 */:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static final iqb h(ld4 ld4Var, iqb iqbVar) {
        iqbVar.getClass();
        return b.v(b.g(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, ((Configuration) ((e18) ld4Var).j(w00.a)).screenHeightDp, 1), MTTypesetterKt.kLineSkipLimitMultiplier, r3.screenWidthDp, 1);
    }

    public static final lm9 i(qz7 qz7Var) {
        Metadata metadata = (Metadata) qz7Var.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strArrD2 = metadata.d2();
                oc7 oc7Var = fl9.a;
                strArrD2.getClass();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(rq1.a(strArrD1));
                oc7 oc7Var2 = fl9.a;
                kk9 kk9VarG = fl9.g(byteArrayInputStream, strArrD2);
                oc7 oc7Var3 = fl9.a;
                sk9 sk9Var = usd.Z;
                sk9Var.getClass();
                t34 t34Var = new t34(byteArrayInputStream);
                b3 b3Var = (b3) sk9Var.b(t34Var, oc7Var3);
                try {
                    t34Var.a(0);
                    if (!b3Var.b()) {
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA = new UninitializedMessageException().a();
                        invalidProtocolBufferExceptionA.E = b3Var;
                        throw invalidProtocolBufferExceptionA;
                    }
                    usd usdVar = (usd) b3Var;
                    jk9 jk9Var = new jk9(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = qz7Var.getClass();
                    ttd ttdVar = usdVar.T;
                    ttdVar.getClass();
                    return new lm9(hm6.F, (c7g) vpi.f(cls, usdVar, kk9VarG, new cbi(ttdVar), jk9Var, dce.E));
                } catch (InvalidProtocolBufferException e) {
                    e.E = b3Var;
                    throw e;
                }
            }
        }
        return null;
    }
}
