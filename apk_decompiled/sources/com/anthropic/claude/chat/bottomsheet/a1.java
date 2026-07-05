package com.anthropic.claude.chat.bottomsheet;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.messages.ThinkingSummary;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import defpackage.bsg;
import defpackage.bz7;
import defpackage.cd4;
import defpackage.d44;
import defpackage.d4c;
import defpackage.dd4;
import defpackage.e18;
import defpackage.ebh;
import defpackage.fd9;
import defpackage.fqb;
import defpackage.gb9;
import defpackage.gm3;
import defpackage.hyc;
import defpackage.i44;
import defpackage.iqb;
import defpackage.jd4;
import defpackage.ko0;
import defpackage.kxk;
import defpackage.ld4;
import defpackage.lja;
import defpackage.p64;
import defpackage.pqh;
import defpackage.q64;
import defpackage.qf8;
import defpackage.qnc;
import defpackage.qqh;
import defpackage.qxh;
import defpackage.r7e;
import defpackage.re4;
import defpackage.rqh;
import defpackage.rsk;
import defpackage.rz7;
import defpackage.sq;
import defpackage.t3;
import defpackage.ta4;
import defpackage.thb;
import defpackage.uhb;
import defpackage.vhb;
import defpackage.whb;
import defpackage.x44;
import defpackage.zy7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a1 {
    /* JADX WARN: Removed duplicated region for block: B:127:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.util.List r22, defpackage.zy7 r23, boolean r24, defpackage.bz7 r25, defpackage.bz7 r26, defpackage.bz7 r27, defpackage.bz7 r28, defpackage.bz7 r29, defpackage.bz7 r30, defpackage.ld4 r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.bottomsheet.a1.a(java.util.List, zy7, boolean, bz7, bz7, bz7, bz7, bz7, bz7, ld4, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r13v1, types: [e18, ld4] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9, types: [d44, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void b(int i, ld4 ld4Var, bz7 bz7Var, iqb iqbVar, List list) {
        iqb iqbVar2;
        fqb fqbVar;
        ?? r5;
        String str;
        String body;
        String str2;
        t3 qqhVar;
        long j;
        boolean z;
        long j2;
        bz7Var.getClass();
        ?? r13 = (e18) ld4Var;
        r13.c0(-1042494594);
        int i2 = i | (r13.f(list) ? 4 : 2) | (r13.h(bz7Var) ? 32 : 16) | 384;
        int i3 = 1;
        final ?? r7 = 0;
        if (r13.Q(i2 & 1, (i2 & 147) != 146)) {
            fqb fqbVar2 = fqb.E;
            iqb iqbVarK = gb9.K(androidx.compose.foundation.layout.b.c(fqbVar2, 1.0f), 18.0f, 12.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, r13, 0);
            int iHashCode = Long.hashCode(r13.T);
            hyc hycVarL = r13.l();
            iqb iqbVarE = kxk.E(r13, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            r13.e0();
            if (r13.S) {
                r13.k(re4Var);
            } else {
                r13.n0();
            }
            d4c.i0(r13, cd4.f, q64VarA);
            d4c.i0(r13, cd4.e, hycVarL);
            d4c.i0(r13, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(r13, cd4.h);
            d4c.i0(r13, cd4.d, iqbVarE);
            long j3 = gm3.a(r13).v;
            rqh rqhVar = rqh.E;
            pqh pqhVar = new pqh(j3, 4.5f, rqhVar);
            r13.a0(-1618728331);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    x44.n0();
                    throw null;
                }
                final whb whbVar = (whb) obj;
                if (i4 == list.size() - i3) {
                    fqbVar = fqbVar2;
                    r5 = i3;
                } else {
                    fqbVar = fqbVar2;
                    r5 = r7;
                }
                Object objA = whbVar.a();
                qf8 qf8Var = objA != null ? (qf8) objA : null;
                ?? r12 = (qf8Var == null || qf8Var.getIsComplete() != i3) ? r7 : i3;
                ?? r21 = r12 ^ 1;
                boolean z2 = whbVar instanceof vhb;
                if (z2) {
                    r13.a0(1088648169);
                    r13.p(r7);
                    qxh qxhVar = ((vhb) whbVar).a;
                    String messageText = qxhVar.getMessageText();
                    if (messageText == null) {
                        messageText = qxhVar.getToolName();
                    }
                    str2 = messageText;
                    str = null;
                } else {
                    if (whbVar instanceof uhb) {
                        r13.a0(1088782399);
                        ParsedContentBlock$Thinking parsedContentBlock$Thinking = ((uhb) whbVar).a;
                        body = parsedContentBlock$Thinking.getBody();
                        if (bsg.I0(body)) {
                            ThinkingSummary latestSummary = parsedContentBlock$Thinking.getLatestSummary();
                            body = latestSummary != null ? latestSummary.getSummary() : null;
                            str = null;
                            if (body == null) {
                                r13.a0(-1552296360);
                                body = d4c.j0(parsedContentBlock$Thinking.getIsComplete() == i3 ? R.string.chat_thinking_block_finished_label : R.string.chat_thinking_block_thinking_label, r13);
                                r13.p(r7);
                            } else {
                                r13.a0(-1552298096);
                                r13.p(r7);
                            }
                        } else {
                            str = null;
                        }
                        r13.p(r7);
                    } else {
                        str = null;
                        if (!(whbVar instanceof thb)) {
                            throw ebh.u(r13, -1904546946, r7);
                        }
                        r13.a0(1089270866);
                        r13.p(r7);
                        body = ((thb) whbVar).a.getBody();
                    }
                    str2 = body;
                }
                String messageSubText = z2 ? ((vhb) whbVar).a.getMessageSubText() : str;
                qnc qncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, r5 == 0 ? 20.0f : 0.0f, 7);
                if (z2) {
                    r13.a0(-1354207676);
                    if (r12 == 0) {
                        r13.a0(-1354184364);
                        j2 = gm3.a(r13).c;
                        r13.p(r7);
                    } else {
                        r13.a0(-1354083304);
                        j2 = gm3.a(r13).v;
                        r13.p(r7);
                    }
                    qqhVar = new qqh(j2, rqhVar, fd9.q0(-1846373032, new rz7() { // from class: h44
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i6 = r7;
                            iei ieiVar = iei.a;
                            fqb fqbVar3 = fqb.E;
                            whb whbVar2 = whbVar;
                            switch (i6) {
                                case 0:
                                    va6 va6Var = (va6) obj2;
                                    ld4 ld4Var2 = (ld4) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= ((e18) ld4Var2).c(va6Var.E) ? 4 : 2;
                                    }
                                    e18 e18Var = (e18) ld4Var2;
                                    if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        e18Var.T();
                                    } else {
                                        iqb iqbVarO = b.o(fqbVar3, va6Var.E);
                                        o5b o5bVarD = dw1.d(lja.K, false);
                                        int iHashCode2 = Long.hashCode(e18Var.T);
                                        hyc hycVarL2 = e18Var.l();
                                        iqb iqbVarE2 = kxk.E(e18Var, iqbVarO);
                                        dd4.e.getClass();
                                        re4 re4Var2 = cd4.b;
                                        e18Var.e0();
                                        if (e18Var.S) {
                                            e18Var.k(re4Var2);
                                        } else {
                                            e18Var.n0();
                                        }
                                        d4c.i0(e18Var, cd4.f, o5bVarD);
                                        d4c.i0(e18Var, cd4.e, hycVarL2);
                                        d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
                                        d4c.h0(e18Var, cd4.h);
                                        d4c.i0(e18Var, cd4.d, iqbVarE2);
                                        qxh qxhVar2 = ((vhb) whbVar2).a;
                                        Integer toolIconResId = qxhVar2.getToolIconResId();
                                        if (toolIconResId != null) {
                                            e18Var.a0(-1130491583);
                                            wtk.c(null, d54.g, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-1704295150, new t04(toolIconResId, 3, whbVar2), e18Var), e18Var, 199728, 21);
                                            e18Var.p(false);
                                        } else {
                                            e18Var.a0(-1129749691);
                                            wtk.d(qxhVar2.getIntegrationIconUrl(), qxhVar2.getIntegrationName(), null, qxhVar2.getIconName(), 0L, 24.0f, e18Var, 196608, 20);
                                            e18Var.p(false);
                                        }
                                        e18Var.p(true);
                                    }
                                    break;
                                default:
                                    va6 va6Var2 = (va6) obj2;
                                    ld4 ld4Var3 = (ld4) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= ((e18) ld4Var3).c(va6Var2.E) ? 4 : 2;
                                    }
                                    e18 e18Var2 = (e18) ld4Var3;
                                    if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        e18Var2.T();
                                    } else {
                                        iqb iqbVarO2 = b.o(fqbVar3, va6Var2.E);
                                        o5b o5bVarD2 = dw1.d(lja.K, false);
                                        int iHashCode3 = Long.hashCode(e18Var2.T);
                                        hyc hycVarL3 = e18Var2.l();
                                        iqb iqbVarE3 = kxk.E(e18Var2, iqbVarO2);
                                        dd4.e.getClass();
                                        re4 re4Var3 = cd4.b;
                                        e18Var2.e0();
                                        if (e18Var2.S) {
                                            e18Var2.k(re4Var3);
                                        } else {
                                            e18Var2.n0();
                                        }
                                        d4c.i0(e18Var2, cd4.f, o5bVarD2);
                                        d4c.i0(e18Var2, cd4.e, hycVarL3);
                                        d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode3));
                                        d4c.h0(e18Var2, cd4.h);
                                        d4c.i0(e18Var2, cd4.d, iqbVarE3);
                                        hvk.c(((thb) whbVar2).a.b, e18Var2, 0);
                                        e18Var2.p(true);
                                    }
                                    break;
                            }
                            return ieiVar;
                        }
                    }, r13));
                    r13.p(r7);
                } else if (whbVar instanceof uhb) {
                    r13.a0(649117922);
                    r13.p(r7);
                    qqhVar = pqhVar;
                } else {
                    if (!(whbVar instanceof thb)) {
                        throw ebh.u(r13, 649050836, r7);
                    }
                    r13.a0(-1352069079);
                    if (r12 == 0) {
                        r13.a0(-1352003948);
                        j = gm3.a(r13).c;
                        r13.p(r7);
                    } else {
                        r13.a0(-1351902888);
                        j = gm3.a(r13).v;
                        r13.p(r7);
                    }
                    final int i6 = 1;
                    qqhVar = new qqh(j, rqhVar, fd9.q0(-1007797040, new rz7() { // from class: h44
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            int i62 = i6;
                            iei ieiVar = iei.a;
                            fqb fqbVar3 = fqb.E;
                            whb whbVar2 = whbVar;
                            switch (i62) {
                                case 0:
                                    va6 va6Var = (va6) obj2;
                                    ld4 ld4Var2 = (ld4) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= ((e18) ld4Var2).c(va6Var.E) ? 4 : 2;
                                    }
                                    e18 e18Var = (e18) ld4Var2;
                                    if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        e18Var.T();
                                    } else {
                                        iqb iqbVarO = b.o(fqbVar3, va6Var.E);
                                        o5b o5bVarD = dw1.d(lja.K, false);
                                        int iHashCode2 = Long.hashCode(e18Var.T);
                                        hyc hycVarL2 = e18Var.l();
                                        iqb iqbVarE2 = kxk.E(e18Var, iqbVarO);
                                        dd4.e.getClass();
                                        re4 re4Var2 = cd4.b;
                                        e18Var.e0();
                                        if (e18Var.S) {
                                            e18Var.k(re4Var2);
                                        } else {
                                            e18Var.n0();
                                        }
                                        d4c.i0(e18Var, cd4.f, o5bVarD);
                                        d4c.i0(e18Var, cd4.e, hycVarL2);
                                        d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
                                        d4c.h0(e18Var, cd4.h);
                                        d4c.i0(e18Var, cd4.d, iqbVarE2);
                                        qxh qxhVar2 = ((vhb) whbVar2).a;
                                        Integer toolIconResId = qxhVar2.getToolIconResId();
                                        if (toolIconResId != null) {
                                            e18Var.a0(-1130491583);
                                            wtk.c(null, d54.g, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-1704295150, new t04(toolIconResId, 3, whbVar2), e18Var), e18Var, 199728, 21);
                                            e18Var.p(false);
                                        } else {
                                            e18Var.a0(-1129749691);
                                            wtk.d(qxhVar2.getIntegrationIconUrl(), qxhVar2.getIntegrationName(), null, qxhVar2.getIconName(), 0L, 24.0f, e18Var, 196608, 20);
                                            e18Var.p(false);
                                        }
                                        e18Var.p(true);
                                    }
                                    break;
                                default:
                                    va6 va6Var2 = (va6) obj2;
                                    ld4 ld4Var3 = (ld4) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= ((e18) ld4Var3).c(va6Var2.E) ? 4 : 2;
                                    }
                                    e18 e18Var2 = (e18) ld4Var3;
                                    if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        e18Var2.T();
                                    } else {
                                        iqb iqbVarO2 = b.o(fqbVar3, va6Var2.E);
                                        o5b o5bVarD2 = dw1.d(lja.K, false);
                                        int iHashCode3 = Long.hashCode(e18Var2.T);
                                        hyc hycVarL3 = e18Var2.l();
                                        iqb iqbVarE3 = kxk.E(e18Var2, iqbVarO2);
                                        dd4.e.getClass();
                                        re4 re4Var3 = cd4.b;
                                        e18Var2.e0();
                                        if (e18Var2.S) {
                                            e18Var2.k(re4Var3);
                                        } else {
                                            e18Var2.n0();
                                        }
                                        d4c.i0(e18Var2, cd4.f, o5bVarD2);
                                        d4c.i0(e18Var2, cd4.e, hycVarL3);
                                        d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode3));
                                        d4c.h0(e18Var2, cd4.h);
                                        d4c.i0(e18Var2, cd4.d, iqbVarE3);
                                        hvk.c(((thb) whbVar2).a.b, e18Var2, 0);
                                        e18Var2.p(true);
                                    }
                                    break;
                            }
                            return ieiVar;
                        }
                    }, r13));
                    r13.p(r7);
                }
                ta4 ta4VarQ0 = fd9.q0(177901286, new sq(messageSubText, whbVar, (boolean) r21, str2, 8), r13);
                ?? r122 = ((i2 & 112) == 32 ? 1 : r7) | (r13.h(whbVar) ? 1 : 0);
                ?? N = r13.N();
                if (r122 != 0 || N == jd4.a) {
                    z = true;
                    N = new d44(bz7Var, 1, whbVar);
                    r13.k0(N);
                } else {
                    z = true;
                }
                fqb fqbVar3 = fqbVar;
                rsk.d(ta4VarQ0, false, r5, null, (zy7) N, qqhVar, 24.0f, 16.0f, qncVarD, null, r13, 14155830, 520);
                r7 = r7 == true ? 1 : 0;
                i4 = i5;
                rqhVar = rqhVar;
                pqhVar = pqhVar;
                i2 = i2;
                fqbVar2 = fqbVar3;
                i3 = 1;
            }
            r13.p(r7);
            r13.p(true);
            iqbVar2 = fqbVar2;
        } else {
            r13.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = r13.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i44(list, bz7Var, iqbVar2, i, 0);
        }
    }
}
