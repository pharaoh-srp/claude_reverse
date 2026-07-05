package defpackage;

import android.content.Context;
import androidx.health.platform.client.proto.g;
import coil3.compose.ImagePainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.google.accompanist.drawablepainter.DrawablePainter;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class auk {
    public static final ta4 a = new ta4(-1132937826, false, new wb4(25));

    public static final void a(iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(939079111);
        if (e18Var.Q(i & 1, (i & 3) != 2)) {
            iqbVar2 = iqbVar;
            cv8.b(a.a(ud0.K1, e18Var), d4c.j0(R.string.generic_error_something_went_wrong, e18Var), iqbVar2, gm3.a(e18Var).y, e18Var, 392, 0);
        } else {
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fl(i, 27, iqbVar2);
        }
    }

    public static final void b(final v0i v0iVar, final int i, final boolean z, final boolean z2, final zy7 zy7Var, final iqb iqbVar, final boolean z3, long j, boolean z4, pz7 pz7Var, rz7 rz7Var, ld4 ld4Var, final int i2, final int i3, final int i4) {
        int i5;
        boolean z5;
        long j2;
        boolean z6;
        int i6;
        int i7;
        e18 e18Var;
        final long j3;
        final pz7 pz7Var2;
        final rz7 rz7Var2;
        long j4;
        pz7 pz7Var3;
        rz7 rz7Var3;
        long j5;
        v0iVar.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(550294017);
        if ((i2 & 6) == 0) {
            i5 = ((i2 & 8) == 0 ? e18Var2.f(v0iVar) : e18Var2.h(v0iVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= e18Var2.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 3072) == 0) {
            i5 |= e18Var2.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 24576) == 0) {
            i5 |= e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            i5 |= e18Var2.f(iqbVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            z5 = z3;
            i5 |= e18Var2.g(z5) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            z5 = z3;
        }
        if ((12582912 & i2) == 0) {
            if ((i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
                j2 = j;
                int i8 = e18Var2.e(j2) ? 8388608 : 4194304;
                i5 |= i8;
            } else {
                j2 = j;
            }
            i5 |= i8;
        } else {
            j2 = j;
        }
        if ((100663296 & i2) == 0) {
            if ((i4 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
                z6 = z4;
                int i9 = e18Var2.g(z6) ? 67108864 : 33554432;
                i5 |= i9;
            } else {
                z6 = z4;
            }
            i5 |= i9;
        } else {
            z6 = z4;
        }
        int i10 = i4 & 512;
        if (i10 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= e18Var2.h(pz7Var) ? 536870912 : 268435456;
        }
        int i11 = i5;
        int i12 = i4 & FreeTypeConstants.FT_LOAD_NO_RECURSE;
        if (i12 != 0) {
            i7 = 6;
            i6 = i12;
        } else if ((i3 & 6) == 0) {
            i6 = i12;
            i7 = i3 | (e18Var2.h(rz7Var) ? 4 : 2);
        } else {
            i6 = i12;
            i7 = i3;
        }
        if (e18Var2.Q(i11 & 1, ((i11 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            e18Var2.V();
            if ((i2 & 1) == 0 || e18Var2.A()) {
                if ((i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                    j4 = ((d54) e18Var2.j(on4.a)).a;
                    i11 &= -29360129;
                } else {
                    j4 = j2;
                }
                if ((i4 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
                    z6 = z2;
                    i11 &= -234881025;
                }
                pz7Var3 = i10 != 0 ? null : pz7Var;
                rz7Var3 = i6 != 0 ? null : rz7Var;
            } else {
                e18Var2.T();
                int i13 = (i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? i11 & (-29360129) : i11;
                if ((i4 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
                    i13 &= -234881025;
                }
                rz7Var3 = rz7Var;
                i11 = i13;
                j4 = j2;
                pz7Var3 = pz7Var;
            }
            e18Var2.q();
            Context context = (Context) e18Var2.j(w00.b);
            pz7 pz7Var4 = z6 ? mvk.a : pz7Var3;
            vve vveVar = ihd.a;
            if (z) {
                e18Var2.a0(551611078);
                long j6 = gm3.a(e18Var2).n;
                e18Var2.p(false);
                j5 = j6;
            } else {
                e18Var2.a0(551612267);
                long j7 = ((gwa) e18Var2.j(jwa.a)).a.n;
                e18Var2.p(false);
                j5 = j7;
            }
            int i14 = i11 >> 9;
            e18Var = e18Var2;
            gjk.c(v0iVar.H(context, z, z2), zy7Var, iqbVar, z5, !z, fd9.q0(-495747012, new fyh(i, 0, j4), e18Var2), false, pz7Var4, true, gm3.b(e18Var2).g, sf5.a(0.5f, gm3.a(e18Var2).v), ihd.a(j5, e18Var2, 14), rwj.h(30), null, MTTypesetterKt.kLineSkipLimitMultiplier, ((jm3) gm3.c(e18Var2).e.E).h, Integer.MAX_VALUE, true, rz7Var3, e18Var, (i14 & 112) | 100859904 | (i14 & 896) | (i14 & 7168), 14155776 | ((i7 << 24) & 234881024), 24640);
            j3 = j4;
            pz7Var2 = pz7Var3;
            rz7Var2 = rz7Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            j3 = j2;
            pz7Var2 = pz7Var;
            rz7Var2 = rz7Var;
        }
        final boolean z7 = z6;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: gyh
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i2 | 1);
                    int iP02 = x44.p0(i3);
                    auk.b(v0iVar, i, z, z2, zy7Var, iqbVar, z3, j3, z7, pz7Var2, rz7Var2, (ld4) obj, iP0, iP02, i4);
                    return iei.a;
                }
            };
        }
    }

    public static final hqb c(nw5 nw5Var, int i) {
        hqb hqbVar = nw5Var.x0().J;
        if (hqbVar == null || (hqbVar.H & i) == 0) {
            return null;
        }
        while (hqbVar != null) {
            int i2 = hqbVar.G;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return hqbVar;
            }
            hqbVar = hqbVar.J;
        }
        return null;
    }

    public static final bpc d(wv8 wv8Var, Context context, int i) {
        return wv8Var instanceof gr1 ? wb5.a(new r20(((gr1) wv8Var).a), i) : wv8Var instanceof ee6 ? new DrawablePainter(quk.d(wv8Var, context.getResources()).mutate()) : new ImagePainter(wv8Var);
    }

    public static boolean e(CharSequence charSequence, String str) {
        char c;
        int length = charSequence.length();
        if (charSequence == str) {
            return true;
        }
        if (length == str.length()) {
            for (int i = 0; i < length; i++) {
                if (charSequence.charAt(i) == str.charAt(i) || ((c = (char) ((r3 | ' ') - 97)) < 26 && c == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x004c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0052. Please report as an issue. */
    public static int f(int i, String str) {
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ',') {
                if (cCharAt == '[') {
                    i2++;
                } else {
                    if (cCharAt != ']') {
                        if (cCharAt != '`') {
                            if (cCharAt == '{') {
                                i3++;
                            } else if (cCharAt == '}') {
                                i3--;
                                if (i3 >= 0) {
                                    i4 = i;
                                }
                            } else if (cCharAt != 8239 && cCharAt != 8287 && cCharAt != 12288) {
                                if (cCharAt == '.') {
                                    continue;
                                } else if (cCharAt != '/') {
                                    if (cCharAt != '>') {
                                        if (cCharAt == '?') {
                                            continue;
                                        } else if (cCharAt != 8232 && cCharAt != 8233) {
                                            switch (cCharAt) {
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case '\b':
                                                case '\t':
                                                case '\n':
                                                case 11:
                                                case '\f':
                                                case '\r':
                                                case 14:
                                                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                                case 16:
                                                case g.MAX_FIELD_NUMBER /* 17 */:
                                                case g.AVG_FIELD_NUMBER /* 18 */:
                                                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                                case 21:
                                                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                                case 24:
                                                case BuildConfig.VERSION_CODE /* 25 */:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case FreeTypeConstants.FT_LOAD_FORCE_AUTOHINT /* 32 */:
                                                case '\"':
                                                    break;
                                                case '!':
                                                    break;
                                                default:
                                                    switch (cCharAt) {
                                                        case '\'':
                                                            boolean z2 = !z;
                                                            if (z) {
                                                                i4 = i;
                                                            }
                                                            z = z2;
                                                            continue;
                                                        case '(':
                                                            i5++;
                                                            continue;
                                                        case ')':
                                                            i5--;
                                                            if (i5 >= 0) {
                                                                i4 = i;
                                                            }
                                                            break;
                                                        default:
                                                            switch (cCharAt) {
                                                                case ':':
                                                                case ';':
                                                                    break;
                                                                case '<':
                                                                    break;
                                                                default:
                                                                    switch (cCharAt) {
                                                                        case 127:
                                                                        case FreeTypeConstants.FT_LOAD_PEDANTIC /* 128 */:
                                                                        case 129:
                                                                        case 130:
                                                                        case 131:
                                                                        case 132:
                                                                        case 133:
                                                                        case 134:
                                                                        case 135:
                                                                        case 136:
                                                                        case 137:
                                                                        case 138:
                                                                        case 139:
                                                                        case 140:
                                                                        case 141:
                                                                        case 142:
                                                                        case 143:
                                                                        case 144:
                                                                        case 145:
                                                                        case 146:
                                                                        case 147:
                                                                        case 148:
                                                                        case 149:
                                                                        case 150:
                                                                        case 151:
                                                                        case 152:
                                                                        case 153:
                                                                        case 154:
                                                                        case 155:
                                                                        case 156:
                                                                        case 157:
                                                                        case 158:
                                                                        case 159:
                                                                        case 160:
                                                                            break;
                                                                        default:
                                                                            switch (cCharAt) {
                                                                                case FreeTypeConstants.FT_LOAD_LINEAR_DESIGN /* 8192 */:
                                                                                case 8193:
                                                                                case 8194:
                                                                                case 8195:
                                                                                case 8196:
                                                                                case 8197:
                                                                                case 8198:
                                                                                case 8199:
                                                                                case 8200:
                                                                                case 8201:
                                                                                case 8202:
                                                                                    break;
                                                                                default:
                                                                                    i4 = i;
                                                                                    break;
                                                                            }
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                } else if (i4 == i - 1) {
                                    i4 = i;
                                }
                            }
                        }
                        return i4;
                    }
                    i2--;
                    if (i2 < 0) {
                        return i4;
                    }
                    i4 = i;
                }
            }
            i++;
        }
        return i4;
    }

    public static HashMap g() {
        HashMap map = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        map.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList arrayListJ = qy1.j(36, map, qy1.j(34, map, qy1.j(33, map, qy1.j(32, map, qy1.j(31, map, qy1.j(30, map, qy1.j(27, map, qy1.j(20, map, qy1.j(7, map, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        arrayListJ.add("VA");
        map.put(39, arrayListJ);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList arrayListJ2 = qy1.j(43, map, qy1.j(41, map, qy1.j(40, map, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        arrayListJ2.add("GG");
        arrayListJ2.add("IM");
        arrayListJ2.add("JE");
        map.put(44, arrayListJ2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList arrayListJ3 = qy1.j(46, map, qy1.j(45, map, arrayList4, 1, "SE"), 2, "NO");
        arrayListJ3.add("SJ");
        map.put(47, arrayListJ3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList arrayListJ4 = qy1.j(60, map, qy1.j(58, map, qy1.j(57, map, qy1.j(56, map, qy1.j(55, map, qy1.j(54, map, qy1.j(53, map, qy1.j(52, map, qy1.j(51, map, qy1.j(49, map, qy1.j(48, map, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        arrayListJ4.add("CC");
        arrayListJ4.add("CX");
        map.put(61, arrayListJ4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList arrayListJ5 = qy1.j(211, map, qy1.j(98, map, qy1.j(95, map, qy1.j(94, map, qy1.j(93, map, qy1.j(92, map, qy1.j(91, map, qy1.j(90, map, qy1.j(86, map, qy1.j(84, map, qy1.j(82, map, qy1.j(81, map, qy1.j(66, map, qy1.j(65, map, qy1.j(64, map, qy1.j(63, map, qy1.j(62, map, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        arrayListJ5.add("EH");
        map.put(212, arrayListJ5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList arrayListJ6 = qy1.j(261, map, qy1.j(260, map, qy1.j(258, map, qy1.j(257, map, qy1.j(FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING, map, qy1.j(255, map, qy1.j(254, map, qy1.j(253, map, qy1.j(252, map, qy1.j(251, map, qy1.j(250, map, qy1.j(249, map, qy1.j(248, map, qy1.j(247, map, qy1.j(246, map, qy1.j(245, map, qy1.j(244, map, qy1.j(243, map, qy1.j(242, map, qy1.j(241, map, qy1.j(240, map, qy1.j(239, map, qy1.j(238, map, qy1.j(237, map, qy1.j(236, map, qy1.j(235, map, qy1.j(234, map, qy1.j(233, map, qy1.j(232, map, qy1.j(231, map, qy1.j(230, map, qy1.j(229, map, qy1.j(228, map, qy1.j(227, map, qy1.j(226, map, qy1.j(225, map, qy1.j(224, map, qy1.j(223, map, qy1.j(222, map, qy1.j(221, map, qy1.j(220, map, qy1.j(218, map, qy1.j(216, map, qy1.j(213, map, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        arrayListJ6.add("YT");
        map.put(262, arrayListJ6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList arrayListJ7 = qy1.j(269, map, qy1.j(268, map, qy1.j(267, map, qy1.j(266, map, qy1.j(265, map, qy1.j(264, map, qy1.j(263, map, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        arrayListJ7.add("TA");
        map.put(290, arrayListJ7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList arrayListJ8 = qy1.j(357, map, qy1.j(356, map, qy1.j(355, map, qy1.j(354, map, qy1.j(353, map, qy1.j(352, map, qy1.j(351, map, qy1.j(350, map, qy1.j(299, map, qy1.j(298, map, qy1.j(297, map, qy1.j(291, map, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        arrayListJ8.add("AX");
        map.put(358, arrayListJ8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList arrayListJ9 = qy1.j(509, map, qy1.j(508, map, qy1.j(507, map, qy1.j(506, map, qy1.j(505, map, qy1.j(504, map, qy1.j(503, map, qy1.j(502, map, qy1.j(501, map, qy1.j(500, map, qy1.j(423, map, qy1.j(421, map, qy1.j(420, map, qy1.j(389, map, qy1.j(387, map, qy1.j(386, map, qy1.j(385, map, qy1.j(383, map, qy1.j(382, map, qy1.j(381, map, qy1.j(380, map, qy1.j(378, map, qy1.j(377, map, qy1.j(376, map, qy1.j(375, map, qy1.j(374, map, qy1.j(373, map, qy1.j(372, map, qy1.j(371, map, qy1.j(370, map, qy1.j(359, map, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        arrayListJ9.add("BL");
        arrayListJ9.add("MF");
        map.put(590, arrayListJ9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList arrayListJ10 = qy1.j(598, map, qy1.j(597, map, qy1.j(596, map, qy1.j(595, map, qy1.j(594, map, qy1.j(593, map, qy1.j(592, map, qy1.j(591, map, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        arrayListJ10.add("BQ");
        map.put(599, arrayListJ10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        map.put(998, qy1.j(996, map, qy1.j(995, map, qy1.j(994, map, qy1.j(993, map, qy1.j(992, map, qy1.j(979, map, qy1.j(977, map, qy1.j(976, map, qy1.j(975, map, qy1.j(974, map, qy1.j(973, map, qy1.j(972, map, qy1.j(971, map, qy1.j(970, map, qy1.j(968, map, qy1.j(967, map, qy1.j(966, map, qy1.j(965, map, qy1.j(964, map, qy1.j(963, map, qy1.j(962, map, qy1.j(961, map, qy1.j(960, map, qy1.j(888, map, qy1.j(886, map, qy1.j(883, map, qy1.j(882, map, qy1.j(881, map, qy1.j(880, map, qy1.j(878, map, qy1.j(870, map, qy1.j(856, map, qy1.j(855, map, qy1.j(853, map, qy1.j(852, map, qy1.j(850, map, qy1.j(808, map, qy1.j(800, map, qy1.j(692, map, qy1.j(691, map, qy1.j(690, map, qy1.j(689, map, qy1.j(688, map, qy1.j(687, map, qy1.j(686, map, qy1.j(685, map, qy1.j(683, map, qy1.j(682, map, qy1.j(681, map, qy1.j(680, map, qy1.j(679, map, qy1.j(678, map, qy1.j(677, map, qy1.j(676, map, qy1.j(675, map, qy1.j(674, map, qy1.j(673, map, qy1.j(672, map, qy1.j(670, map, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return map;
    }

    public static boolean h(char c) {
        return i(c) || j(c);
    }

    public static boolean i(char c) {
        if (c < 'A' || c > 'Z') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    public static boolean j(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean k(char c) {
        return c >= 128;
    }

    public static boolean l(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static String m(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (l(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (l(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String n(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
