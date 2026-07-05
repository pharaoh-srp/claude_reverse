package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uik {
    public static final ta4 a = new ta4(1072050874, false, new jb4(6));
    public static final jf7 b;
    public static final jf7[] c;

    static {
        new ta4(1274689881, false, new hb4(3));
        jf7 jf7Var = new jf7("app_client", -1, 4L, true);
        jf7 jf7Var2 = new jf7("carrier_auth", -1, 1L, true);
        jf7 jf7Var3 = new jf7("wear3_oem_companion", -1, 1L, true);
        jf7 jf7Var4 = new jf7("wear_await_data_sync_complete", -1, 1L, true);
        jf7 jf7Var5 = new jf7("wear_backup_restore", -1, 8L, true);
        jf7 jf7Var6 = new jf7("wear_consent", -1, 2L, true);
        jf7 jf7Var7 = new jf7("wear_consent_recordoptin", -1, 1L, true);
        jf7 jf7Var8 = new jf7("wear_consent_recordoptin_swaadl", -1, 1L, true);
        jf7 jf7Var9 = new jf7("wear_consent_supervised", -1, 2L, true);
        jf7 jf7Var10 = new jf7("wear_get_phone_switching_feature_status", -1, 1L, true);
        jf7 jf7Var11 = new jf7("wear_fast_pair_account_key_sync", -1, 1L, true);
        jf7 jf7Var12 = new jf7("wear_fast_pair_get_account_keys", -1, 1L, true);
        jf7 jf7Var13 = new jf7("wear_fast_pair_get_account_key_by_account", -1, 1L, true);
        jf7 jf7Var14 = new jf7("wear_flush_batched_data", -1, 1L, true);
        jf7 jf7Var15 = new jf7("wear_get_related_configs", -1, 1L, true);
        jf7 jf7Var16 = new jf7("wear_get_node_id", -1, 1L, true);
        jf7 jf7Var17 = new jf7("wear_logging_service", -1, 2L, true);
        jf7 jf7Var18 = new jf7("wear_retry_connection", -1, 1L, true);
        jf7 jf7Var19 = new jf7("wear_set_cloud_sync_setting_by_node", -1, 1L, true);
        jf7 jf7Var20 = new jf7("wear_first_party_consents", -1, 2L, true);
        jf7 jf7Var21 = new jf7("wear_update_config", -1, 1L, true);
        jf7 jf7Var22 = new jf7("wear_update_connection_retry_strategy", -1, 1L, true);
        jf7 jf7Var23 = new jf7("wear_update_delay_config", -1, 1L, true);
        jf7 jf7Var24 = new jf7("wearable_services", -1, 1L, true);
        b = jf7Var24;
        c = new jf7[]{jf7Var, jf7Var2, jf7Var3, jf7Var4, jf7Var5, jf7Var6, jf7Var7, jf7Var8, jf7Var9, jf7Var10, jf7Var11, jf7Var12, jf7Var13, jf7Var14, jf7Var15, jf7Var16, jf7Var17, jf7Var18, jf7Var19, jf7Var20, jf7Var21, jf7Var22, jf7Var23, jf7Var24, new jf7("wear_cancel_migration", -1, 1L, true), new jf7("wear_customizable_screens", -1, 2L, true), new jf7("wear_wifi_immediate_connect", -1, 1L, true), new jf7("wear_get_node_active_network_metered", -1, 1L, true), new jf7("wear_consents_per_watch", -1, 3L, true), new jf7("wear_material3_experience", -1, 1L, true), new jf7("wear_offload_connection", -1, 1L, true), new jf7("wear_get_local_capabilities", -1, 1L, true), new jf7("wear_notify_channel_flushed", -1, 1L, true)};
    }

    public static final void a(iqb iqbVar, boolean z, ld4 ld4Var, int i, int i2) {
        int i3;
        int i4;
        iqb iqbVar2;
        int i5;
        int i6;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1981483735);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (e18Var.g(z) ? 32 : 16);
        }
        if (e18Var.Q(i4 & 1, (i4 & 19) != 18)) {
            if (i7 != 0) {
                iqbVar = fqb.E;
            }
            iqb iqbVar3 = iqbVar;
            if (i8 != 0) {
                z = false;
            }
            if (z) {
                ud0 ud0Var = ud0.d;
                i5 = R.drawable.anthropicon_star;
                i6 = R.string.empty_state_chat_starred_title;
            } else {
                ud0 ud0Var2 = ud0.d;
                i5 = R.drawable.anthropicon_chats;
                i6 = R.string.empty_state_chat_title;
            }
            pvj.b(u00.D(i5, 0, e18Var), d4c.j0(i6, e18Var), iqbVar3, null, e18Var, 8 | ((i4 << 6) & 896), 8);
            iqbVar2 = iqbVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        boolean z2 = z;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tx2(iqbVar2, z2, i, i2, 0);
        }
    }

    public static final void b(zb0 zb0Var, iqb iqbVar, zt6 zt6Var, String str, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        e18 e18Var;
        zb0Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1739577355);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(zb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(zt6Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.f(str) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var2.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            zy7Var2 = zy7Var;
        }
        int i3 = i2;
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            e18Var = e18Var2;
            pzg.a(iqbVar, zt6Var.c, zt6Var.a, zt6Var.b, MTTypesetterKt.kLineSkipLimitMultiplier, zt6Var.e, zt6Var.d, fd9.q0(-2070323974, new mm5(zb0Var, zy7Var2, zt6Var, str, 6), e18Var2), e18Var, ((i3 >> 3) & 14) | 12582912, 16);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk(zb0Var, iqbVar, zt6Var, str, zy7Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.vt6 r14, defpackage.iqb r15, defpackage.zt6 r16, java.lang.String r17, defpackage.zy7 r18, defpackage.ld4 r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uik.c(vt6, iqb, zt6, java.lang.String, zy7, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r14, defpackage.iqb r15, defpackage.zt6 r16, java.lang.String r17, defpackage.zy7 r18, defpackage.ld4 r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uik.d(java.lang.String, iqb, zt6, java.lang.String, zy7, ld4, int, int):void");
    }

    public static final void e(final String str, String str2, boolean z, boolean z2, zy7 zy7Var, String str3, zy7 zy7Var2, final String str4, ta4 ta4Var, final ta4 ta4Var2, iqb iqbVar, final j9f j9fVar, ld4 ld4Var, int i, int i2) {
        int i3;
        String str5;
        boolean z3;
        boolean z4;
        zy7 zy7Var3;
        String str6;
        zy7 zy7Var4;
        ta4 ta4Var3;
        int i4;
        str.getClass();
        str2.getClass();
        zy7Var.getClass();
        str3.getClass();
        zy7Var2.getClass();
        str4.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(321574053);
        if ((i & 6) == 0) {
            i3 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str5 = str2;
            i3 |= e18Var.f(str5) ? 32 : 16;
        } else {
            str5 = str2;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i3 |= e18Var.g(z3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i3 |= e18Var.g(z4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            zy7Var3 = zy7Var;
            i3 |= e18Var.h(zy7Var3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            zy7Var3 = zy7Var;
        }
        if ((196608 & i) == 0) {
            str6 = str3;
            i3 |= e18Var.f(str6) ? 131072 : 65536;
        } else {
            str6 = str3;
        }
        if ((1572864 & i) == 0) {
            zy7Var4 = zy7Var2;
            i3 |= e18Var.h(zy7Var4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        } else {
            zy7Var4 = zy7Var2;
        }
        if ((i & 12582912) == 0) {
            i3 |= e18Var.f(str4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            ta4Var3 = ta4Var;
            i3 |= e18Var.h(ta4Var3) ? 67108864 : 33554432;
        } else {
            ta4Var3 = ta4Var;
        }
        if ((i & 805306368) == 0) {
            i3 |= e18Var.h(ta4Var2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e18Var.f(iqbVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e18Var.f(j9fVar) ? 32 : 16;
        }
        int i5 = i4;
        if (e18Var.Q(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            final String str7 = str5;
            final boolean z5 = z3;
            final boolean z6 = z4;
            final zy7 zy7Var5 = zy7Var3;
            final String str8 = str6;
            final zy7 zy7Var6 = zy7Var4;
            final ta4 ta4Var4 = ta4Var3;
            pzg.a(iqbVar, gm3.b(e18Var).i, gm3.a(e18Var).n, gm3.a(e18Var).M, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v), fd9.q0(1611227562, new pz7() { // from class: awg
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    iqb iqbVarB0;
                    ld4 ld4Var2 = (ld4) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        j9f j9fVar2 = j9fVar;
                        fqb fqbVar = fqb.E;
                        iqb iqbVarN = gb9.N((j9fVar2 == null || (iqbVarB0 = mpk.b0(fqbVar, j9fVar2, true)) == null) ? fqbVar : iqbVarB0, MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 20.0f, 5);
                        vo1 vo1Var = lja.S;
                        eo0 eo0Var = ko0.c;
                        q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var2, 0);
                        int iHashCode = Long.hashCode(e18Var2.T);
                        hyc hycVarL = e18Var2.l();
                        iqb iqbVarE = kxk.E(e18Var2, iqbVarN);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        z80 z80Var = cd4.f;
                        d4c.i0(e18Var2, z80Var, q64VarA);
                        z80 z80Var2 = cd4.e;
                        d4c.i0(e18Var2, z80Var2, hycVarL);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        z80 z80Var3 = cd4.g;
                        d4c.i0(e18Var2, z80Var3, numValueOf);
                        bx bxVar = cd4.h;
                        d4c.h0(e18Var2, bxVar);
                        z80 z80Var4 = cd4.d;
                        d4c.i0(e18Var2, z80Var4, iqbVarE);
                        iqb iqbVarL = gb9.L(fqbVar, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                        q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var2, 0);
                        int iHashCode2 = Long.hashCode(e18Var2.T);
                        hyc hycVarL2 = e18Var2.l();
                        iqb iqbVarE2 = kxk.E(e18Var2, iqbVarL);
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, z80Var, q64VarA2);
                        d4c.i0(e18Var2, z80Var2, hycVarL2);
                        ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
                        d4c.i0(e18Var2, z80Var4, iqbVarE2);
                        tkh tkhVar = (tkh) gm3.c(e18Var2).f.K;
                        Object objN = e18Var2.N();
                        lz1 lz1Var = jd4.a;
                        if (objN == lz1Var) {
                            objN = new z1g(26);
                            e18Var2.k0(objN);
                        }
                        tjh.b(str, tjf.b(fqbVar, false, (bz7) objN), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var2, 0, 0, 131068);
                        kxk.g(e18Var2, b.e(fqbVar, 4.0f));
                        tjh.b(str7, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131070);
                        kxk.g(e18Var2, b.e(fqbVar, 16.0f));
                        ta4Var4.invoke(e18Var2, 0);
                        kxk.g(e18Var2, b.e(fqbVar, 16.0f));
                        dxj.a(str8, z6, b.c(fqbVar, 1.0f), z5, null, null, null, 0L, zy7Var5, e18Var2, 384, 240);
                        e18Var2.p(true);
                        kxk.g(e18Var2, b.e(fqbVar, 20.0f));
                        iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e18Var2, 48, 5);
                        kxk.g(e18Var2, b.e(fqbVar, 20.0f));
                        iqb iqbVarL2 = gb9.L(fqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                        q64 q64VarA3 = p64.a(eo0Var, vo1Var, e18Var2, 0);
                        int iHashCode3 = Long.hashCode(e18Var2.T);
                        hyc hycVarL3 = e18Var2.l();
                        iqb iqbVarE3 = kxk.E(e18Var2, iqbVarL2);
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, z80Var, q64VarA3);
                        d4c.i0(e18Var2, z80Var2, hycVarL3);
                        ij0.t(iHashCode3, e18Var2, z80Var3, e18Var2, bxVar);
                        d4c.i0(e18Var2, z80Var4, iqbVarE3);
                        iqb iqbVarL3 = gb9.L(fqbVar, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                        q64 q64VarA4 = p64.a(eo0Var, vo1Var, e18Var2, 0);
                        int iHashCode4 = Long.hashCode(e18Var2.T);
                        hyc hycVarL4 = e18Var2.l();
                        iqb iqbVarE4 = kxk.E(e18Var2, iqbVarL3);
                        e18Var2.e0();
                        if (e18Var2.S) {
                            e18Var2.k(re4Var);
                        } else {
                            e18Var2.n0();
                        }
                        d4c.i0(e18Var2, z80Var, q64VarA4);
                        d4c.i0(e18Var2, z80Var2, hycVarL4);
                        ij0.t(iHashCode4, e18Var2, z80Var3, e18Var2, bxVar);
                        d4c.i0(e18Var2, z80Var4, iqbVarE4);
                        ta4Var2.invoke(e18Var2, 0);
                        e18Var2.p(true);
                        kxk.g(e18Var2, b.e(fqbVar, 16.0f));
                        String strJ0 = d4c.j0(R.string.generic_click_label_open_link, e18Var2);
                        qnc qncVar = new qnc(4.0f, 4.0f, 4.0f, 4.0f);
                        String str9 = str4;
                        boolean zF = e18Var2.f(str9) | e18Var2.f(strJ0);
                        Object objN2 = e18Var2.N();
                        if (zF || objN2 == lz1Var) {
                            objN2 = new pl5(str9, strJ0, 2);
                            e18Var2.k0(objN2);
                        }
                        lnk.d(zy7Var6, tjf.a(fqbVar, (bz7) objN2), false, null, null, qncVar, null, ouk.a, e18Var2, 806879232, 444);
                        e18Var2.p(true);
                        e18Var2.p(true);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, (i5 & 14) | 12582912, 48);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hl1(str, str2, z, z2, zy7Var, str3, zy7Var2, str4, ta4Var, ta4Var2, iqbVar, j9fVar, i, i2);
        }
    }

    public static final void f(bpc bpcVar, String str, String str2, zy7 zy7Var, iqb iqbVar, boolean z, mnc mncVar, ld4 ld4Var, int i, int i2) {
        boolean z2;
        int i3;
        iqb iqbVar2;
        mnc mncVar2;
        boolean z3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-541759819);
        int i4 = i | (e18Var.h(bpcVar) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        int i5 = i4 | 24576;
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i4 | 221184;
            z2 = z;
        } else {
            z2 = z;
            i3 = i5 | (e18Var.g(z2) ? 131072 : 65536);
        }
        int i7 = i3 | 1572864;
        if (e18Var.Q(i7 & 1, (599187 & i7) != 599186)) {
            boolean z4 = i6 != 0 ? true : z2;
            qnc qncVar = new qnc(16.0f, 8.0f, 16.0f, 8.0f);
            fqb fqbVar = fqb.E;
            t30.b(fd9.q0(756659845, new ny3(str, str2, 11), e18Var), zy7Var, fqbVar, fd9.q0(-47563896, new mh6(bpcVar, 3), e18Var), null, z4, null, qncVar, e18Var, (i7 & 458752) | ((i7 >> 6) & 112) | 3462 | 12582912, 336);
            iqbVar2 = fqbVar;
            z3 = z4;
            mncVar2 = qncVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            mncVar2 = mncVar;
            z3 = z2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new de3(bpcVar, str, str2, zy7Var, iqbVar2, z3, mncVar2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r17, boolean r18, defpackage.bz7 r19, defpackage.iqb r20, java.lang.String r21, boolean r22, boolean r23, defpackage.ld4 r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uik.g(java.lang.String, boolean, bz7, iqb, java.lang.String, boolean, boolean, ld4, int, int):void");
    }

    public static fla h(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("session_sample_rate").l();
            bh9 bh9VarS = qh9Var.s("session_replay_sample_rate");
            Number numberL2 = bh9VarS != null ? bh9VarS.l() : null;
            bh9 bh9VarS2 = qh9Var.s("profiling_sample_rate");
            Number numberL3 = bh9VarS2 != null ? bh9VarS2.l() : null;
            bh9 bh9VarS3 = qh9Var.s("trace_sample_rate");
            Number numberL4 = bh9VarS3 != null ? bh9VarS3.l() : null;
            numberL.getClass();
            return new fla(numberL, numberL2, numberL3, numberL4);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Configuration", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Configuration", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Configuration", e3);
            return null;
        }
    }

    public static final Object i(r28 r28Var, t28 t28Var) {
        r28Var.getClass();
        t28Var.getClass();
        if (r28Var.l(t28Var)) {
            return r28Var.k(t28Var);
        }
        return null;
    }

    public static final Object j(r28 r28Var, t28 t28Var, int i) {
        r28Var.getClass();
        t28Var.getClass();
        r28Var.o(t28Var);
        sh7 sh7Var = r28Var.E;
        s28 s28Var = t28Var.d;
        sh7Var.getClass();
        ebg ebgVar = sh7Var.a;
        if (!s28Var.G) {
            sz6.p("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object obj = ebgVar.get(s28Var);
        if (i < (obj == null ? 0 : ((List) obj).size())) {
            r28Var.o(t28Var);
            if (s28Var.G) {
                Object obj2 = ebgVar.get(s28Var);
                if (obj2 != null) {
                    return t28Var.a(((List) obj2).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            sz6.p("getRepeatedField() can only be called on repeated fields.");
        }
        return null;
    }
}
