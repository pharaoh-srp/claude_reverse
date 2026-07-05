package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.notification.ChannelPreference;
import com.anthropic.claude.api.notification.FeaturePreference;
import com.anthropic.claude.api.notification.Preferences;
import com.anthropic.claude.tool.model.AlarmCreateV0Input;
import com.anthropic.claude.tool.model.TimerCreateV0Input;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class puk {
    public static final ta4 a = new ta4(1928355336, false, new wb4(28));
    public static final ta4 b = new ta4(706557631, false, new wb4(29));

    public static final void a(String str, AlarmCreateV0Input alarmCreateV0Input, qi3 qi3Var, ld4 ld4Var, int i) {
        qi3 qi3Var2;
        int i2;
        qi3 qi3Var3;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-823463886);
        int i3 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(alarmCreateV0Input) ? 32 : 16) | FreeTypeConstants.FT_LOAD_PEDANTIC;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-897);
                qi3Var3 = (qi3) objN;
            } else {
                e18Var.T();
                i2 = i3 & (-897);
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            String str2 = LocalTime.of(alarmCreateV0Input.getHour(), alarmCreateV0Input.getMinute()).format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
            str2.getClass();
            b(str, str2, alarmCreateV0Input.getMessage(), d4c.j0(R.string.alarm_was_set_caption, e18Var), qi3Var3, e18Var, i2 & 14);
            qi3Var2 = qi3Var3;
        } else {
            e18Var.T();
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(str, i, alarmCreateV0Input, qi3Var2, 19);
        }
    }

    public static final void b(String str, String str2, String str3, String str4, qi3 qi3Var, ld4 ld4Var, int i) {
        int i2;
        String str5;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(836386610);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str5 = str2;
            i2 |= e18Var.f(str5) ? 32 : 16;
        } else {
            str5 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(str4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? e18Var.f(qi3Var) : e18Var.h(qi3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            boolean z = ((i2 & 14) == 4) | ((((57344 & i2) ^ 24576) > 16384 && e18Var.h(qi3Var)) || (i2 & 24576) == 16384);
            Object objN = e18Var.N();
            if (z || objN == jd4.a) {
                objN = new w55(qi3Var, str, null, i3);
                e18Var.k0(objN);
            }
            csg.g((bz7) objN, e18Var, 6, 0);
            long j = gm3.a(e18Var).n;
            wo8 wo8Var = zni.b;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(yfd.p(fqbVar, j, wo8Var), 1.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
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
            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e18Var, 0, 7);
            kxk.g(e18Var, b.e(fqbVar, 12.0f));
            int i4 = i2;
            String str6 = str5;
            tjh.b(str6, gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 0L, eve.B(21), null, dv7.O, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, ((i2 >> 3) & 14) | 1597488, 0, 130988);
            kxk.g(e18Var, b.e(fqbVar, 8.0f));
            tjh.b(str3, gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, ((i4 >> 6) & 14) | 48, 0, 131068);
            kxk.g(e18Var, b.e(fqbVar, 8.0f));
            tjh.b(str4, gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).k, e18Var, ((i4 >> 9) & 14) | 48, 0, 131068);
            e18Var = e18Var;
            grc.z(fqbVar, 12.0f, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(str, str2, str3, str4, qi3Var, i, 13);
        }
    }

    public static final void c(String str, TimerCreateV0Input timerCreateV0Input, qi3 qi3Var, ld4 ld4Var, int i) {
        qi3 qi3Var2;
        int i2;
        qi3 qi3Var3;
        String str2;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1410703598);
        int i3 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(timerCreateV0Input) ? 32 : 16) | FreeTypeConstants.FT_LOAD_PEDANTIC;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-897);
                qi3Var3 = (qi3) objN;
            } else {
                e18Var.T();
                i2 = i3 & (-897);
                qi3Var3 = qi3Var;
            }
            e18Var.q();
            lz1 lz1Var = uh6.F;
            int duration_seconds = timerCreateV0Input.getDuration_seconds();
            zh6 zh6Var = zh6.SECONDS;
            long jQ = v40.Q(duration_seconds, zh6Var);
            long jO = uh6.o(jQ, zh6.HOURS);
            long jO2 = uh6.o(jQ, zh6.MINUTES) % 60;
            long jO3 = uh6.o(jQ, zh6Var) % 60;
            if (jO > 0) {
                str2 = String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jO), Long.valueOf(jO2), Long.valueOf(jO3)}, 3));
            } else if (jO2 > 0) {
                str2 = String.format(Locale.getDefault(), "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jO2), Long.valueOf(jO3)}, 2));
            } else {
                str2 = jO3 + "s";
            }
            b(str, str2, timerCreateV0Input.getMessage(), d4c.j0(R.string.timer_was_set_caption, e18Var), qi3Var3, e18Var, i2 & 14);
            qi3Var2 = qi3Var3;
        } else {
            e18Var.T();
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(str, i, timerCreateV0Input, qi3Var2, 20);
        }
    }

    public static final void d(String str, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1077706428);
        int i2 = i | (e18Var2.f(str) ? 4 : 2);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var = e18Var2;
            tjh.b(str, iqbVar, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var, i2 & 126, 0, 131068);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar, i, 21);
        }
    }

    public static final iqb e(iqb iqbVar) {
        iqbVar.getClass();
        return kxk.p(iqbVar, new ic4(22));
    }

    public static final jz0 f(b5c b5cVar, jz0 jz0Var, jz0 jz0Var2) {
        nz0 uy0Var;
        String str;
        nz0 hz0Var;
        if (b5cVar == null) {
            return null;
        }
        lz0 lz0Var = new lz0();
        lz0Var.a = jz0Var;
        lz0Var.b = null;
        lz0Var.c = null;
        lz0Var.d = jz0Var2;
        lz0Var.e = null;
        if (b5cVar instanceof qr1) {
            uy0Var = ry0.a;
        } else if (b5cVar instanceof c02) {
            uy0Var = new b01(((c02) b5cVar).h);
        } else if (b5cVar instanceof kq3) {
            String str2 = ((kq3) b5cVar).g;
            str2.getClass();
            uy0Var = new sy0(str2);
        } else if (b5cVar instanceof p96) {
            uy0Var = vy0.a;
        } else if (b5cVar instanceof bm6) {
            String str3 = ((bm6) b5cVar).g;
            str3.getClass();
            uy0Var = new wy0(str3);
        } else if (b5cVar instanceof bh7) {
            bh7 bh7Var = (bh7) b5cVar;
            String str4 = bh7Var.k;
            str4.getClass();
            char c = bh7Var.g;
            int i = bh7Var.i;
            int i2 = bh7Var.h;
            String str5 = bh7Var.j;
            str5.getClass();
            uy0Var = new xy0(c, i2, i, str5, str4);
        } else if (b5cVar instanceof lf8) {
            uy0Var = yy0.a;
        } else if (b5cVar instanceof yg8) {
            uy0Var = new zy0(((yg8) b5cVar).g);
        } else if (b5cVar instanceof klh) {
            uy0Var = a01.a;
        } else if (b5cVar instanceof yp8) {
            String str6 = ((yp8) b5cVar).g;
            str6.getClass();
            uy0Var = new bz0(str6);
        } else if (b5cVar instanceof wp8) {
            String str7 = ((wp8) b5cVar).g;
            str7.getClass();
            uy0Var = new az0(str7);
        } else {
            if (b5cVar instanceof vv8) {
                vv8 vv8Var = (vv8) b5cVar;
                String str8 = vv8Var.g;
                if (str8 != null) {
                    String str9 = vv8Var.h;
                    hz0Var = new cz0(str9 != null ? str9 : "", str8);
                    uy0Var = hz0Var;
                }
                uy0Var = null;
            } else if (b5cVar instanceof u09) {
                String str10 = ((u09) b5cVar).g;
                str10.getClass();
                uy0Var = new dz0(str10);
            } else if (b5cVar instanceof l6a) {
                l6a l6aVar = (l6a) b5cVar;
                String str11 = l6aVar.h;
                str = str11 != null ? str11 : "";
                String str12 = l6aVar.g;
                str12.getClass();
                uy0Var = new gz0(str12, str);
            } else if (b5cVar instanceof i9a) {
                uy0Var = iz0.a;
            } else if (b5cVar instanceof tjc) {
                tjc tjcVar = (tjc) b5cVar;
                uy0Var = new oz0(tjcVar.h, tjcVar.i);
            } else if (b5cVar instanceof arc) {
                uy0Var = pz0.a;
            } else if (b5cVar instanceof aeg) {
                uy0Var = qz0.a;
            } else if (b5cVar instanceof msg) {
                uy0Var = new sz0(((msg) b5cVar).g);
            } else if (b5cVar instanceof edh) {
                String str13 = ((edh) b5cVar).g;
                str13.getClass();
                uy0Var = new zz0(str13);
            } else if (b5cVar instanceof x6a) {
                x6a x6aVar = (x6a) b5cVar;
                String str14 = x6aVar.i;
                str = str14 != null ? str14 : "";
                String str15 = x6aVar.h;
                str15.getClass();
                String str16 = x6aVar.g;
                str16.getClass();
                hz0Var = new hz0(str16, str15, str);
                uy0Var = hz0Var;
            } else if (b5cVar instanceof a3h) {
                uy0Var = xz0.a;
            } else if (b5cVar instanceof j3h) {
                uy0Var = wz0.a;
            } else if (b5cVar instanceof c3h) {
                uy0Var = tz0.a;
            } else if (b5cVar instanceof u3h) {
                uy0Var = yz0.a;
            } else if (b5cVar instanceof g3h) {
                g3h g3hVar = (g3h) b5cVar;
                boolean z = g3hVar.g;
                f3h f3hVar = g3hVar.h;
                int i3 = f3hVar == null ? -1 : kz0.a[f3hVar.ordinal()];
                vz0 vz0Var = vz0.E;
                if (i3 != -1 && i3 != 1) {
                    if (i3 == 2) {
                        vz0Var = vz0.F;
                    } else {
                        if (i3 != 3) {
                            wg6.i();
                            return null;
                        }
                        vz0Var = vz0.G;
                    }
                }
                uy0Var = new uz0(z, vz0Var);
            } else if (b5cVar instanceof wqg) {
                uy0Var = new rz0();
            } else if (b5cVar instanceof q39) {
                uy0Var = new ez0(((q39) b5cVar).g);
            } else if (b5cVar instanceof m86) {
                m86 m86Var = (m86) b5cVar;
                uy0Var = new uy0(m86Var.g, m86Var.h);
            } else {
                uy0Var = null;
            }
        }
        jz0 jz0Var3 = uy0Var != null ? new jz0(uy0Var, lz0Var) : null;
        if (jz0Var3 != null) {
            lz0 lz0Var2 = jz0Var3.b;
            lz0Var2.b = f(b5cVar.b, jz0Var3, null);
            lz0Var2.e = f(b5cVar.e, jz0Var, jz0Var3);
        }
        if (b5cVar.e == null && jz0Var != null) {
            jz0Var.b.c = jz0Var3;
        }
        return jz0Var3;
    }

    public static final boolean h(Preferences preferences, g9c g9cVar) {
        FeaturePreference feature_preference;
        ChannelPreference channelPreference;
        g9cVar.getClass();
        if (preferences == null || (feature_preference = preferences.getFeature_preference()) == null || (channelPreference = (ChannelPreference) g9cVar.E.invoke(feature_preference)) == null) {
            return false;
        }
        return x44.r(channelPreference.getEnable_push(), Boolean.TRUE);
    }

    public static final iqb i(float f, ld4 ld4Var, int i, int i2) {
        boolean z = (i2 & 2) != 0;
        long j = gm3.a(ld4Var).o;
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = lz1.F(new cpc[]{new cpc(Float.valueOf(f), new d54(d54.g)), new cpc(Float.valueOf(1.0f), new d54(j))}, 0L, (((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
            e18Var.k0(objN);
        }
        jy1 jy1Var = (jy1) objN;
        boolean z2 = (((i & 896) ^ 384) > 256 && e18Var.g(z)) || (i & 384) == 256;
        Object objN2 = e18Var.N();
        if (z2 || objN2 == lz1Var) {
            objN2 = new xu0(z, jy1Var, 5);
            e18Var.k0(objN2);
        }
        return zni.u(fqb.E, (bz7) objN2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Preferences j(Preferences preferences, g9c g9cVar, boolean z) {
        g9cVar.getClass();
        FeaturePreference feature_preference = preferences.getFeature_preference();
        if (feature_preference == null) {
            feature_preference = new FeaturePreference((ChannelPreference) null, (ChannelPreference) null, (ChannelPreference) null, (ChannelPreference) null, (ChannelPreference) null, (ChannelPreference) null, (ChannelPreference) null, 127, (mq5) null);
        }
        ChannelPreference channelPreference = (ChannelPreference) g9cVar.E.invoke(feature_preference);
        Boolean bool = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (channelPreference == null) {
            channelPreference = new ChannelPreference(bool, (Boolean) (objArr2 == true ? 1 : 0), 3, (mq5) (objArr == true ? 1 : 0));
        }
        return preferences.copy((FeaturePreference) g9cVar.F.invoke(feature_preference, ChannelPreference.copy$default(channelPreference, null, Boolean.valueOf(z), 1, null)));
    }
}
