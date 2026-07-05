package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.compose.foundation.b;
import androidx.health.platform.client.proto.g;
import androidx.health.platform.client.proto.i;
import androidx.health.platform.client.proto.j;
import androidx.health.platform.client.proto.l;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.chat.menu.d;
import com.anthropic.claude.tool.model.SuggestConnectorsOutputConnectorsItem;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zik {
    public static final ta4 a = new ta4(1705543878, false, new jb4(7));

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ChatConversationWithProjectReference chatConversationWithProjectReference, final Date date, final zy7 zy7Var, final String str, final zy7 zy7Var2, final bz7 bz7Var, final zy7 zy7Var3, final zy7 zy7Var4, final zy7 zy7Var5, final iqb iqbVar, qdf qdfVar, boolean z, zy7 zy7Var6, tkh tkhVar, tkh tkhVar2, pl3 pl3Var, vd3 vd3Var, ld4 ld4Var, final int i, final int i2) {
        int i3;
        int i4;
        e18 e18Var;
        final boolean z2;
        final tkh tkhVar3;
        final tkh tkhVar4;
        final pl3 pl3Var2;
        final vd3 vd3Var2;
        final qdf qdfVar2;
        final zy7 zy7Var7;
        boolean z3;
        tkh tkhVar5;
        tkh tkhVar6;
        Object obj;
        Object objA;
        int i5;
        tkh tkhVar7;
        final vd3 vd3Var3;
        int i6;
        qdf qdfVar3;
        zy7 zy7Var8;
        pl3 pl3Var3;
        tkh tkhVar8;
        zy7 zy7Var9;
        boolean z4;
        iqb iqbVarB;
        date.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        bz7Var.getClass();
        zy7Var3.getClass();
        zy7Var4.getClass();
        zy7Var5.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-500205044);
        char c = 8192;
        int i7 = i | (e18Var2.f(chatConversationWithProjectReference) ? 4 : 2) | (e18Var2.h(date) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.f(str) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var2) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i7 |= e18Var2.h(bz7Var) ? 131072 : 65536;
        }
        int i8 = i7 | (e18Var2.h(zy7Var3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.h(zy7Var4) ? 8388608 : 4194304) | (e18Var2.h(zy7Var5) ? 67108864 : 33554432);
        if ((i & 805306368) == 0) {
            i8 |= e18Var2.f(iqbVar) ? 536870912 : 268435456;
        }
        int i9 = i2 & FreeTypeConstants.FT_LOAD_NO_RECURSE;
        qdf qdfVar4 = qdfVar;
        char c2 = i9 != 0 ? (char) 6 : e18Var2.f(qdfVar4) ? (char) 4 : (char) 2;
        int i10 = i2 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
        int i11 = i8;
        if (i10 != 0) {
            i3 = c2 | '0';
        } else {
            i3 = c2 | (e18Var2.g(z) ? ' ' : (char) 16);
        }
        int i12 = i3;
        int i13 = i2 & FreeTypeConstants.FT_LOAD_MONOCHROME;
        if (i13 != 0) {
            i4 = i12 | 384;
        } else {
            i4 = i12 | (e18Var2.h(zy7Var6) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        }
        int i14 = i4 | (((i2 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0 && e18Var2.f(tkhVar)) ? (char) 2048 : (char) 1024);
        if ((i2 & 16384) == 0 && e18Var2.f(tkhVar2)) {
            c = 16384;
        }
        int i15 = i14 | c | 589824;
        if (e18Var2.Q(i11 & 1, ((i11 & 306783379) == 306783378 && (599187 & i15) == 599186) ? false : true)) {
            e18Var2.V();
            int i16 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i16 == 0 || e18Var2.A()) {
                if (i9 != 0) {
                    qdfVar4 = null;
                }
                z3 = i10 != 0 ? false : z;
                zy7 zy7Var10 = i13 != 0 ? null : zy7Var6;
                if ((i2 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0) {
                    tkhVar5 = ((jm3) gm3.c(e18Var2).e.E).e;
                    i15 &= -7169;
                } else {
                    tkhVar5 = tkhVar;
                }
                if ((i2 & 16384) != 0) {
                    tkhVar6 = ((jm3) gm3.c(e18Var2).e.E).g;
                    i15 &= -57345;
                } else {
                    tkhVar6 = tkhVar2;
                }
                int i17 = i15;
                tkh tkhVar9 = tkhVar6;
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    obj = null;
                    objA = m7fVarN.a(jce.a.b(pl3.class), null, null);
                    e18Var2.k0(objA);
                } else {
                    objA = objN;
                    obj = null;
                }
                e18Var2.p(false);
                e18Var2.p(false);
                pl3 pl3Var4 = (pl3) objA;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(m7fVarN2) | e18Var2.f(obj);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var) {
                    objN2 = m7fVarN2.a(jce.a.b(vd3.class), null, null);
                    e18Var2.k0(objN2);
                }
                i5 = 0;
                e18Var2.p(false);
                e18Var2.p(false);
                tkhVar7 = tkhVar9;
                vd3Var3 = (vd3) objN2;
                i6 = i17 & (-4128769);
                qdfVar3 = qdfVar4;
                zy7Var8 = zy7Var10;
                pl3Var3 = pl3Var4;
            } else {
                e18Var2.T();
                if ((i2 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0) {
                    i15 &= -7169;
                }
                if ((i2 & 16384) != 0) {
                    i15 &= -57345;
                }
                z3 = z;
                zy7Var8 = zy7Var6;
                tkhVar5 = tkhVar;
                tkhVar7 = tkhVar2;
                vd3Var3 = vd3Var;
                i6 = i15 & (-4128769);
                qdfVar3 = qdfVar4;
                i5 = 0;
                pl3Var3 = pl3Var;
            }
            e18Var2.q();
            int i18 = zy7Var8 != null ? 1 : i5;
            qdf qdfVar5 = qdfVar3;
            Object[] objArr = new Object[i5];
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                tkhVar8 = tkhVar5;
                objN3 = new xq2(23);
                e18Var2.k0(objN3);
            } else {
                tkhVar8 = tkhVar5;
            }
            final nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN3, e18Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objN4 = e18Var2.N();
            if (objN4 == lz1Var) {
                objN4 = new xq2(24);
                e18Var2.k0(objN4);
            }
            final nwb nwbVar2 = (nwb) iuj.I(objArr2, (zy7) objN4, e18Var2, 48);
            boolean zF3 = e18Var2.f(nwbVar) | e18Var2.f(nwbVar2);
            Object objN5 = e18Var2.N();
            if (zF3 || objN5 == lz1Var) {
                objN5 = new ej2(nwbVar, nwbVar2, 1);
                e18Var2.k0(objN5);
            }
            final zy7 zy7Var11 = (zy7) objN5;
            gf8 gf8Var = (gf8) e18Var2.j(ve4.l);
            Object objN6 = e18Var2.N();
            if (objN6 == lz1Var) {
                objN6 = fd9.O(im6.E, e18Var2);
                e18Var2.k0(objN6);
            }
            final l45 l45Var = (l45) objN6;
            boolean zIs_starred = chatConversationWithProjectReference.is_starred();
            boolean zF4 = e18Var2.f(nwbVar2);
            Object objN7 = e18Var2.N();
            if (zF4 || objN7 == lz1Var) {
                objN7 = new dy2(1, nwbVar2);
                e18Var2.k0(objN7);
            }
            zy7 zy7Var12 = (zy7) objN7;
            boolean zF5 = e18Var2.f(nwbVar2);
            Object objN8 = e18Var2.N();
            if (zF5 || objN8 == lz1Var) {
                objN8 = new dy2(2, nwbVar2);
                e18Var2.k0(objN8);
            }
            List listC = d.c(zIs_starred, zy7Var12, zy7Var2, (zy7) objN8, e18Var2, (i11 >> 6) & 896);
            e18Var = e18Var2;
            boolean z5 = i18 == 0 && (((Boolean) nwbVar.getValue()).booleanValue() || ((qx2) nwbVar2.getValue()) != null);
            qnc qncVar = e84.e;
            boolean z6 = z5;
            iqb iqbVarV = xn5.V(gb9.L(iqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.b(e18Var).e);
            fqb fqbVar = fqb.E;
            if (zy7Var8 != null) {
                e18Var.a0(1930876224);
                vue vueVar = new vue(1);
                boolean z7 = (i6 & 896) == 256;
                Object objN9 = e18Var.N();
                if (z7 || objN9 == lz1Var) {
                    objN9 = new kw0(2, zy7Var8);
                    e18Var.k0(objN9);
                }
                boolean z8 = z3;
                iqbVarB = kzj.h(fqbVar, z8, false, vueVar, (bz7) objN9, 10);
                e18Var.p(false);
                zy7Var9 = zy7Var8;
                z4 = z8;
            } else {
                e18Var.a0(1931322841);
                String strJ0 = d4c.j0(R.string.generic_button_open_menu, e18Var);
                zy7Var9 = zy7Var8;
                z4 = z3;
                vue vueVar2 = new vue(0);
                boolean zF6 = e18Var.f(nwbVar) | e18Var.h(pl3Var3) | e18Var.h(gf8Var);
                Object objN10 = e18Var.N();
                if (zF6 || objN10 == lz1Var) {
                    objN10 = new hy2(pl3Var3, gf8Var, nwbVar, 0);
                    e18Var.k0(objN10);
                }
                iqb iqbVarE = b.e(fqbVar, str, vueVar2, strJ0, (zy7) objN10, zy7Var, 225);
                boolean zH = e18Var.h(listC);
                Object objN11 = e18Var.N();
                if (zH || objN11 == lz1Var) {
                    objN11 = new hj2(listC, 3);
                    e18Var.k0(objN11);
                }
                iqbVarB = tjf.b(iqbVarE, false, (bz7) objN11);
                e18Var.p(false);
            }
            tkh tkhVar10 = tkhVar7;
            kwj.d(z6, zy7Var11, fd9.q0(541043796, new rz7() { // from class: iy2
                @Override // defpackage.rz7
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    ld4 ld4Var2 = (ld4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((zy7) obj2).getClass();
                    e18 e18Var3 = (e18) ld4Var2;
                    if (e18Var3.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
                        qx2 qx2Var = (qx2) nwbVar2.getValue();
                        l45 l45Var2 = l45Var;
                        boolean zH2 = e18Var3.h(l45Var2);
                        vd3 vd3Var4 = vd3Var3;
                        boolean zH3 = zH2 | e18Var3.h(vd3Var4);
                        ChatConversationWithProjectReference chatConversationWithProjectReference2 = chatConversationWithProjectReference;
                        boolean zF7 = zH3 | e18Var3.f(chatConversationWithProjectReference2);
                        zy7 zy7Var13 = zy7Var5;
                        boolean zF8 = zF7 | e18Var3.f(zy7Var13);
                        Object objN12 = e18Var3.N();
                        if (zF8 || objN12 == jd4.a) {
                            he heVar = new he(l45Var2, vd3Var4, chatConversationWithProjectReference2, zy7Var13, 6);
                            e18Var3.k0(heVar);
                            objN12 = heVar;
                        }
                        d.a(chatConversationWithProjectReference2, zBooleanValue, zy7Var11, zy7Var2, bz7Var, zy7Var3, zy7Var4, zy7Var13, (zy7) objN12, null, null, qx2Var, null, e18Var3, 0, 5632);
                    } else {
                        e18Var3.T();
                    }
                    return iei.a;
                }
            }, e18Var), iqbVarV.B(iqbVarB), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, qncVar, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-403104373, new ey2(i18, chatConversationWithProjectReference, qdfVar5, date, tkhVar8, tkhVar10, z4), e18Var), e18Var, 384, 880);
            pl3Var2 = pl3Var3;
            vd3Var2 = vd3Var3;
            tkhVar4 = tkhVar10;
            z2 = z4;
            zy7Var7 = zy7Var9;
            qdfVar2 = qdfVar5;
            tkhVar3 = tkhVar8;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            z2 = z;
            tkhVar3 = tkhVar;
            tkhVar4 = tkhVar2;
            pl3Var2 = pl3Var;
            vd3Var2 = vd3Var;
            qdfVar2 = qdfVar4;
            zy7Var7 = zy7Var6;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: gy2
                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP0 = x44.p0(i | 1);
                    zik.a(chatConversationWithProjectReference, date, zy7Var, str, zy7Var2, bz7Var, zy7Var3, zy7Var4, zy7Var5, iqbVar, qdfVar2, z2, zy7Var7, tkhVar3, tkhVar4, pl3Var2, vd3Var2, (ld4) obj2, iP0, i2);
                    return iei.a;
                }
            };
        }
    }

    public static final McpServer b(List list, SuggestConnectorsOutputConnectorsItem suggestConnectorsOutputConnectorsItem) {
        Object next;
        list.getClass();
        suggestConnectorsOutputConnectorsItem.getClass();
        if (suggestConnectorsOutputConnectorsItem.getUrl() != null) {
            return xvk.f(suggestConnectorsOutputConnectorsItem.getUrl(), list);
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (isg.j0(((McpServer) next).getName(), suggestConnectorsOutputConnectorsItem.getName())) {
                break;
            }
        }
        return (McpServer) next;
    }

    public static hla c(qh9 qh9Var) {
        try {
            ila ilaVarI = ajk.i(qh9Var.s("view").g());
            String strM = qh9Var.s("source").m();
            strM.getClass();
            for (int i : sq6.H(11)) {
                if (y6a.i(i).equals(strM)) {
                    return new hla(ilaVarI, i);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Container", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Container", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Container", e3);
            return null;
        }
    }

    public static final int d(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                return height * (config == Bitmap.Config.ALPHA_8 ? 1 : (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) ? 2 : config == Bitmap.Config.RGBA_F16 ? 8 : 4);
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static double e(g gVar, String str) {
        l lVar = (l) gVar.E().get(str);
        if (lVar != null) {
            return lVar.r();
        }
        return 0.0d;
    }

    public static double f(j jVar, String str) {
        l lVar = (l) jVar.q().get(str);
        if (lVar != null) {
            return lVar.r();
        }
        return 0.0d;
    }

    public static final Instant g(g gVar) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(gVar.u());
        instantOfEpochMilli.getClass();
        return instantOfEpochMilli;
    }

    public static final ZoneOffset h(g gVar) {
        if (gVar.I()) {
            return ZoneOffset.ofTotalSeconds(gVar.v());
        }
        return null;
    }

    public static String i(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static long j(g gVar, String str) {
        l lVar = (l) gVar.E().get(str);
        if (lVar != null) {
            return lVar.t();
        }
        return 0L;
    }

    public static long k(j jVar) {
        l lVar = (l) jVar.q().get("bpm");
        if (lVar != null) {
            return lVar.t();
        }
        return 0L;
    }

    public static final ijb l(g gVar) {
        h26 h26Var;
        String strC = gVar.K() ? gVar.C() : "";
        strC.getClass();
        String strQ = gVar.r().q();
        strQ.getClass();
        cg5 cg5Var = new cg5(strQ);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(gVar.D());
        instantOfEpochMilli.getClass();
        String strP = gVar.G() ? gVar.p() : null;
        long jQ = gVar.q();
        if (gVar.H()) {
            i iVarT = gVar.t();
            iVarT.getClass();
            String strQ2 = iVarT.t() ? iVarT.q() : null;
            String strR = iVarT.u() ? iVarT.r() : null;
            Map map = u26.a;
            String strS = iVarT.s();
            strS.getClass();
            h26Var = new h26(strQ2, ((Number) map.getOrDefault(strS, 0)).intValue(), strR);
        } else {
            h26Var = null;
        }
        return new ijb(gVar.x(), strC, cg5Var, instantOfEpochMilli, strP, jQ, h26Var);
    }

    public static final Instant m(g gVar) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(gVar.z());
        instantOfEpochMilli.getClass();
        return instantOfEpochMilli;
    }

    public static final ZoneOffset n(g gVar) {
        if (gVar.J()) {
            return ZoneOffset.ofTotalSeconds(gVar.A());
        }
        return null;
    }

    public static final String o(g gVar, String str) {
        l lVar = (l) gVar.E().get(str);
        if (lVar != null) {
            return lVar.u();
        }
        return null;
    }

    public static final Instant p(g gVar) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(gVar.w());
        instantOfEpochMilli.getClass();
        return instantOfEpochMilli;
    }

    public static final ZoneOffset q(g gVar) {
        if (gVar.L()) {
            return ZoneOffset.ofTotalSeconds(gVar.F());
        }
        return null;
    }

    public static final int r(g gVar, String str, Map map) {
        map.getClass();
        l lVar = (l) gVar.E().get(str);
        String strS = lVar != null ? lVar.s() : null;
        if (strS == null) {
            return 0;
        }
        return ((Number) map.getOrDefault(strS, 0)).intValue();
    }

    public abstract qh9 s();
}
