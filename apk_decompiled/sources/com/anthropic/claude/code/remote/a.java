package com.anthropic.claude.code.remote;

import com.anthropic.claude.sessions.types.SessionGrouping;
import com.anthropic.claude.sessions.types.SessionGroupingMember;
import defpackage.bsg;
import defpackage.cd4;
import defpackage.d4c;
import defpackage.dd4;
import defpackage.e18;
import defpackage.fqb;
import defpackage.gb9;
import defpackage.gm3;
import defpackage.gmk;
import defpackage.ho0;
import defpackage.hyc;
import defpackage.iqb;
import defpackage.jm3;
import defpackage.kn;
import defpackage.kxk;
import defpackage.ld4;
import defpackage.lja;
import defpackage.lm6;
import defpackage.p64;
import defpackage.q64;
import defpackage.r7e;
import defpackage.re4;
import defpackage.sz6;
import defpackage.tjh;
import defpackage.x44;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final void a(SessionGrouping sessionGrouping, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        fqb fqbVar;
        boolean z;
        boolean z2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1988097743);
        int i2 = i | (e18Var.h(sessionGrouping) ? 4 : 2) | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            String description = sessionGrouping.getDescription();
            if (description == null || bsg.I0(description)) {
                description = null;
            }
            List<SessionGroupingMember> members = sessionGrouping.getMembers();
            if (members == null) {
                members = lm6.E;
            }
            List<SessionGroupingMember> list = members;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            fqb fqbVar2 = fqb.E;
            iqb iqbVarK = gb9.K(androidx.compose.foundation.layout.b.c(fqbVar2, 1.0f), 16.0f, 4.0f);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
            if (description == null) {
                e18Var.a0(-1810417855);
                e18Var.p(false);
                z2 = false;
                z = true;
                fqbVar = fqbVar2;
            } else {
                e18Var.a0(-1810417854);
                fqbVar = fqbVar2;
                z = true;
                z2 = false;
                tjh.b(description, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 3, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 24960, 110586);
                e18Var = e18Var;
                e18Var.p(false);
            }
            if (list.isEmpty()) {
                e18Var.a0(-1809924055);
                e18Var.p(z2);
            } else {
                e18Var.a0(-1810123943);
                gmk.a(list, x44.r(sessionGrouping.getMembers_truncated(), Boolean.TRUE), sessionGrouping.isPrivate(), null, e18Var, 0);
                e18Var.p(z2);
            }
            e18Var.p(z);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kn(sessionGrouping, iqbVar2, i, 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f8  */
    /* JADX WARN: Type inference failed for: r14v5, types: [pz7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.vx3 r25, final java.lang.String r26, final defpackage.ml3 r27, final defpackage.bz7 r28, final defpackage.zy7 r29, final defpackage.iqb r30, final boolean r31, final defpackage.bz7 r32, final defpackage.zy7 r33, final java.lang.String r34, final boolean r35, com.anthropic.claude.code.remote.c r36, defpackage.ld4 r37, final int r38) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.a.b(vx3, java.lang.String, ml3, bz7, zy7, iqb, boolean, bz7, zy7, java.lang.String, boolean, com.anthropic.claude.code.remote.c, ld4, int):void");
    }
}
