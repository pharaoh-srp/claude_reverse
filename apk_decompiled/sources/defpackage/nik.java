package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.core.telemetry.SilentException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nik implements iyi {
    public static final ta4 a = new ta4(671922322, false, new hb4(0));
    public static final ta4 b = new ta4(1927714616, false, new gb4(27));
    public static final jf7 c;
    public static final jf7 d;
    public static final jf7[] e;

    static {
        jf7 jf7Var = new jf7("auth_blockstore", 3L);
        jf7 jf7Var2 = new jf7("blockstore_data_transfer", 1L);
        jf7 jf7Var3 = new jf7("blockstore_notify_app_restore", 1L);
        jf7 jf7Var4 = new jf7("blockstore_store_bytes_with_options", 2L);
        jf7 jf7Var5 = new jf7("blockstore_is_end_to_end_encryption_available", 1L);
        jf7 jf7Var6 = new jf7("blockstore_enable_cloud_backup", 1L);
        jf7 jf7Var7 = new jf7("blockstore_delete_bytes", 2L);
        jf7 jf7Var8 = new jf7("blockstore_retrieve_bytes_with_options", 3L);
        jf7 jf7Var9 = new jf7("auth_clear_restore_credential", 1L);
        c = jf7Var9;
        jf7 jf7Var10 = new jf7("auth_create_restore_credential", 1L);
        jf7 jf7Var11 = new jf7("auth_get_restore_credential", 1L);
        d = jf7Var11;
        e = new jf7[]{jf7Var, jf7Var2, jf7Var3, jf7Var4, jf7Var5, jf7Var6, jf7Var7, jf7Var8, jf7Var9, jf7Var10, jf7Var11};
    }

    public static final void d(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        long j;
        qu1 qu1VarA;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(640533368);
        int i2 = 2;
        int i3 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        boolean z = true;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            if (str != null && !bsg.I0(str)) {
                z = false;
            }
            if (z) {
                e18Var.a0(1372251747);
                e18Var.p(false);
                j = d54.g;
            } else {
                e18Var.a0(1372252893);
                j = gm3.a(e18Var).q;
                e18Var.p(false);
            }
            float f = MTTypesetterKt.kLineSkipLimitMultiplier;
            if (z) {
                e18Var.a0(1372254255);
                qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u);
                e18Var.p(false);
            } else {
                e18Var.a0(-409732123);
                e18Var.p(false);
                qu1VarA = null;
            }
            qu1 qu1Var = qu1VarA;
            if (!z) {
                f = 80.0f;
            }
            int i4 = i3 >> 3;
            x2k.e(zy7Var, iqbVar, j, 0L, null, f, MTTypesetterKt.kLineSkipLimitMultiplier, qu1Var, fd9.q0(2022980890, new lx3(z, str, i2), e18Var), e18Var, (i4 & 14) | 100663296 | (i4 & 112), 88);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uf2(str, zy7Var, iqbVar, i, 4);
        }
    }

    public static final void e(int i, ld4 ld4Var, bz7 bz7Var, iqb iqbVar) {
        bz7 bz7Var2;
        iqb iqbVar2;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(210909547);
        int i2 = (e18Var.h(bz7Var) ? 32 : 16) | i;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
            tp4 tp4Var = null;
            boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = m7fVarN.a(jce.a.b(fk0.class), null, null);
                e18Var.k0(objN2);
            }
            e18Var.p(false);
            e18Var.p(false);
            fk0 fk0Var = (fk0) objN2;
            m7f m7fVarN2 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
            boolean zF2 = e18Var.f(null) | e18Var.f(m7fVarN2);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = m7fVarN2.a(jce.a.b(ysg.class), null, null);
                e18Var.k0(objN3);
            }
            e18Var.p(false);
            e18Var.p(false);
            ysg ysgVar = (ysg) objN3;
            m7f m7fVarN3 = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
            boolean zF3 = e18Var.f(null) | e18Var.f(m7fVarN3);
            Object objN4 = e18Var.N();
            if (zF3 || objN4 == lz1Var) {
                objN4 = m7fVarN3.a(jce.a.b(ptg.class), null, null);
                e18Var.k0(objN4);
            }
            e18Var.p(false);
            e18Var.p(false);
            ptg ptgVar = (ptg) objN4;
            List list = (List) ysgVar.h.getValue();
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = mpk.P(ysgVar.c(fk0Var.f()));
                e18Var.k0(objN5);
            }
            nwb nwbVar2 = (nwb) objN5;
            boolean zH = e18Var.h(fk0Var);
            Object objN6 = e18Var.N();
            if (zH || objN6 == lz1Var) {
                objN6 = new x1d(fk0Var, nwbVar2, tp4Var, 13);
                e18Var.k0(objN6);
            }
            fd9.i(e18Var, (pz7) objN6, iei.a);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            Object objN7 = e18Var.N();
            if (objN7 == lz1Var) {
                objN7 = new shf(2, nwbVar);
                e18Var.k0(objN7);
            }
            bz7Var2 = bz7Var;
            iqbVar2 = iqbVar;
            kkk.a(zBooleanValue, (bz7) objN7, iqbVar2, fd9.q0(-288814079, new otg(nwbVar2, nwbVar, list, ptgVar, ysgVar, bz7Var2), e18Var), e18Var, 3504, 0);
        } else {
            bz7Var2 = bz7Var;
            iqbVar2 = iqbVar;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new z0e(iqbVar2, bz7Var2, i);
        }
    }

    public static ht6 f(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("name").m();
            boolean zA = qh9Var.s("crashed").a();
            String strM2 = qh9Var.s("stack").m();
            bh9 bh9VarS = qh9Var.s("state");
            String strM3 = bh9VarS != null ? bh9VarS.m() : null;
            strM.getClass();
            strM2.getClass();
            return new ht6(strM, zA, strM2, strM3);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Thread", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Thread", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Thread", e4);
            return null;
        }
    }

    public static bla g(qh9 qh9Var) {
        try {
            ArrayList arrayList = qh9Var.s("id").e().E;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((bh9) it.next()).m());
            }
            return new bla(arrayList2);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type Action", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type Action", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type Action", e4);
            return null;
        }
    }

    public static final Object h(zy1 zy1Var, op3 op3Var, qi3 qi3Var, String str, String str2, ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource, whd whdVar, xzg xzgVar) {
        if (whdVar != null) {
            return i(op3Var, qi3Var, str, str2, chatMessageActionEvents$ActionSource, whdVar.c(), whdVar.e(), xzgVar);
        }
        SilentException.a(new SilentException("Copy bottom sheet tried to copy null message"), null, false, 3);
        Object objB = zy1Var.b(xzgVar, new tt6(true));
        return objB == m45.E ? objB : iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.op3 r14, defpackage.qi3 r15, java.lang.String r16, java.lang.String r17, com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource r18, java.lang.String r19, java.lang.String r20, defpackage.vp4 r21) {
        /*
            r0 = r21
            boolean r1 = r0 instanceof defpackage.cl2
            if (r1 == 0) goto L15
            r1 = r0
            cl2 r1 = (defpackage.cl2) r1
            int r2 = r1.K
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.K = r2
            goto L1a
        L15:
            cl2 r1 = new cl2
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.J
            int r2 = r1.K
            r3 = 1
            iei r4 = defpackage.iei.a
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L39
            java.lang.String r14 = r1.I
            com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource r15 = r1.H
            java.lang.String r2 = r1.G
            java.lang.String r3 = r1.F
            qi3 r1 = r1.E
            defpackage.sf5.h0(r0)
            r8 = r14
            r9 = r15
            r15 = r1
            r7 = r2
            r6 = r3
            goto L73
        L39:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r14)
            return r5
        L3f:
            defpackage.sf5.h0(r0)
            r0 = r20
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r5, r0)
            r0.getClass()
            r1.E = r15
            r2 = r16
            r1.F = r2
            r5 = r17
            r1.G = r5
            r6 = r18
            r1.H = r6
            r7 = r19
            r1.I = r7
            r1.K = r3
            mz r14 = (defpackage.mz) r14
            nz r14 = r14.a
            android.content.ClipboardManager r14 = r14.a()
            r14.setPrimaryClip(r0)
            m45 r14 = defpackage.m45.E
            if (r4 != r14) goto L6f
            return r14
        L6f:
            r9 = r6
            r8 = r7
            r6 = r2
            r7 = r5
        L73:
            com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked r5 = new com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked
            com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction r10 = com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction.COPY
            r12 = 32
            r13 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            zy2 r14 = com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked.Companion
            kotlinx.serialization.KSerializer r14 = r14.serializer()
            znf r14 = (defpackage.znf) r14
            r15.e(r5, r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nik.i(op3, qi3, java.lang.String, java.lang.String, com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    @Override // defpackage.iyi
    public void a() {
    }

    @Override // defpackage.iyi
    public void b() {
    }
}
