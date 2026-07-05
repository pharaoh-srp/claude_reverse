package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.project.ProjectKnowledgeStats;
import com.anthropic.claude.design.icon.a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nw7 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ nw7(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.F
            koc r0 = (defpackage.koc) r0
            java.lang.Object r9 = r9.G
            fu9 r9 = (defpackage.fu9) r9
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            boolean r1 = defpackage.x41.o(r0, r10)
            coc r2 = r0.k()
            ukc r2 = r2.e
            ukc r3 = defpackage.ukc.E
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L2b
            goto L35
        L2b:
            fu9 r2 = defpackage.fu9.E
            if (r9 != r2) goto L30
            goto L35
        L30:
            if (r1 != 0) goto L34
            r1 = r5
            goto L35
        L34:
            r1 = r4
        L35:
            coc r9 = r0.k()
            int r9 = r9.b
            r2 = 0
            if (r9 != 0) goto L40
            r3 = r2
            goto L46
        L40:
            float r3 = defpackage.x41.h(r0)
            float r9 = (float) r9
            float r3 = r3 / r9
        L46:
            int r9 = (int) r3
            float r9 = (float) r9
            float r9 = r3 - r9
            cz5 r6 = r0.n
            float r7 = java.lang.Math.abs(r10)
            r8 = 1137180672(0x43c80000, float:400.0)
            float r6 = r6.q0(r8)
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L5c
            goto L63
        L5c:
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 <= 0) goto L62
            r4 = r5
            goto L63
        L62:
            r4 = r7
        L63:
            if (r4 != 0) goto Laa
            float r9 = java.lang.Math.abs(r9)
            r10 = 1056964608(0x3f000000, float:0.5)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L72
            if (r1 == 0) goto Lb2
            goto Lac
        L72:
            float r9 = java.lang.Math.abs(r3)
            cz5 r10 = r0.n
            loc r2 = defpackage.moc.a
            r2 = 1113587712(0x42600000, float:56.0)
            float r10 = r10.q0(r2)
            int r2 = r0.m()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r10 = java.lang.Math.min(r10, r2)
            int r0 = r0.m()
            float r0 = (float) r0
            float r10 = r10 / r0
            float r10 = java.lang.Math.abs(r10)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 < 0) goto L9d
            if (r1 == 0) goto Lac
            goto Lb2
        L9d:
            float r9 = java.lang.Math.abs(r11)
            float r10 = java.lang.Math.abs(r12)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 >= 0) goto Lac
            goto Lb2
        Laa:
            if (r4 != r5) goto Lae
        Lac:
            r11 = r12
            goto Lb2
        Lae:
            if (r4 != r7) goto Lb1
            goto Lb2
        Lb1:
            r11 = r2
        Lb2:
            java.lang.Float r9 = java.lang.Float.valueOf(r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw7.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        f0d f0dVar = (f0d) this.F;
        l1d l1dVar = (l1d) this.G;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        mnc mncVar = i4gVar.a;
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean z = f0dVar instanceof e0d;
            fqb fqbVar = fqb.E;
            if (z) {
                e18Var.a0(-93924862);
                List list = ((e0d) f0dVar).a;
                x0a x0aVarA = a1a.a(0, 3, e18Var);
                u0d u0dVar = (u0d) w44.V0(list);
                Integer numValueOf = u0dVar != null ? Integer.valueOf(u0dVar.a) : null;
                boolean zH = e18Var.h(list) | e18Var.f(x0aVarA);
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (zH || objN == lz1Var) {
                    objN = new wn(list, x0aVarA, (tp4) null);
                    e18Var.k0(objN);
                }
                fd9.i(e18Var, (pz7) objN, numValueOf);
                if (list.isEmpty() && l1dVar == l1d.H) {
                    e18Var.a0(-93351951);
                    tjh.b(d4c.j0(R.string.phone_call_connecting_body, e18Var), gb9.I(b.c(fqbVar, 1.0f), mncVar), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131064);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-92949230);
                    qnc qncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 5);
                    iqb iqbVarI = gb9.I(b.c, mncVar);
                    boolean zH2 = e18Var.h(list);
                    Object objN2 = e18Var.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new hj2(list, 8);
                        e18Var.k0(objN2);
                    }
                    knk.h(iqbVarI, x0aVarA, qncVarD, false, null, null, null, false, null, (bz7) objN2, e18Var, 0, 504);
                    e18Var.p(false);
                }
                e18Var.p(false);
            } else if (f0dVar instanceof d0d) {
                e18Var.a0(-92288589);
                tjh.b(((d0d) f0dVar).a, gb9.I(b.c(fqbVar, 1.0f), mncVar), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131064);
                e18Var.p(false);
            } else {
                if (f0dVar != null) {
                    throw ebh.u(e18Var, -1804146469, false);
                }
                e18Var.a0(-92018889);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        ydd yddVar = (ydd) this.F;
        MessageBlobFile messageBlobFile = (MessageBlobFile) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((mw1) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            xdd xddVar = (xdd) yddVar.f.getValue();
            if (xddVar instanceof udd) {
                e18Var.a0(-798991657);
                xo1 xo1Var = lja.K;
                FillElement fillElement = b.c;
                o5b o5bVarD = dw1.d(xo1Var, false);
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE = kxk.E(e18Var, fillElement);
                dd4.e.getClass();
                re4 re4Var = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVarD);
                d4c.i0(e18Var, cd4.e, hycVarL);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE);
                ez1.a(null, vf2.J, 0L, e18Var, 48, 5);
                e18Var.p(true);
                e18Var.p(false);
            } else if (xddVar instanceof vdd) {
                e18Var.a0(-798692445);
                rwj.f(384, e18Var, b.c, ((vdd) xddVar).a, yddVar.e);
                e18Var.p(false);
            } else {
                if (!(xddVar instanceof wdd)) {
                    throw ebh.u(e18Var, -579966610, false);
                }
                e18Var.a0(-798418529);
                twj.d(messageBlobFile.getFile_name(), null, e18Var, 0);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        ps7 ps7Var;
        lz1 lz1Var;
        z80 z80Var;
        float f;
        bx bxVar;
        z80 z80Var2;
        float f2;
        z80 z80Var3;
        fqb fqbVar;
        final vid vidVar = (vid) this.F;
        ybg ybgVar = (ybg) this.G;
        mnc mncVar = (mnc) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mncVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
        }
        final int i = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            zy1 zy1Var = vidVar.f;
            lsc lscVar = vidVar.p;
            lsc lscVar2 = vidVar.k;
            wlg wlgVar = vidVar.g;
            lsc lscVar3 = vidVar.o;
            zni.g(zy1Var, ybgVar, e18Var, 48);
            j9f j9fVarY = mpk.Y(e18Var);
            fqb fqbVar2 = fqb.E;
            iqb iqbVarI = gb9.I(mpk.b0(fqbVar2, j9fVarY, true), mncVar);
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var4 = cd4.f;
            d4c.i0(e18Var, z80Var4, q64VarA);
            z80 z80Var5 = cd4.e;
            d4c.i0(e18Var, z80Var5, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var6 = cd4.g;
            d4c.i0(e18Var, z80Var6, numValueOf);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var, bxVar2);
            z80 z80Var7 = cd4.d;
            d4c.i0(e18Var, z80Var7, iqbVarE);
            ps7 ps7Var2 = (ps7) e18Var.j(ve4.i);
            String strJ0 = d4c.j0(R.string.profile_full_name, e18Var);
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).g;
            iqb iqbVarC = b.c(gb9.L(fqbVar2, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f);
            Object objN = e18Var.N();
            lz1 lz1Var2 = jd4.a;
            if (objN == lz1Var2) {
                objN = new f7d(7);
                e18Var.k0(objN);
            }
            tjh.b(strJ0, tjf.a(iqbVarC, (bz7) objN), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 131068);
            kxk.g(e18Var, b.e(fqbVar2, 4.0f));
            cjh cjhVar = (cjh) vidVar.h.getValue();
            boolean z = !((Boolean) lscVar3.getValue()).booleanValue();
            long j = gm3.a(e18Var).n;
            int i2 = 0;
            mp9 mp9Var = new mp9(2, i2, i2, 126);
            iqb iqbVarC2 = b.c(gb9.L(fqbVar2, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f);
            boolean zF = e18Var.f(vidVar);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var2) {
                final int i3 = 0;
                objN2 = new bz7() { // from class: wid
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj4) {
                        int i4 = i3;
                        iei ieiVar = iei.a;
                        vid vidVar2 = vidVar;
                        cjh cjhVar2 = (cjh) obj4;
                        switch (i4) {
                            case 0:
                                cjhVar2.getClass();
                                vidVar2.getClass();
                                vidVar2.h.setValue(cjhVar2);
                                break;
                            case 1:
                                cjhVar2.getClass();
                                vidVar2.getClass();
                                vidVar2.i.setValue(cjhVar2);
                                break;
                            default:
                                cjhVar2.getClass();
                                vidVar2.getClass();
                                vidVar2.j.setValue(cjhVar2);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN2);
            }
            mwa.a(cjhVar, (bz7) objN2, strJ0, iqbVarC2, z, null, null, null, null, null, mp9Var, null, true, 0, 0, j, null, e18Var, 100666368, 1597440, 1490656);
            String strP = gid.p(16.0f, R.string.profile_display_name, e18Var, e18Var, fqbVar2);
            tkh tkhVar2 = ((jm3) gm3.c(e18Var).e.E).g;
            iqb iqbVarC3 = b.c(gb9.L(fqbVar2, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f);
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var2) {
                objN3 = new f7d(8);
                e18Var.k0(objN3);
            }
            tjh.b(strP, tjf.a(iqbVarC3, (bz7) objN3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar2, e18Var, 0, 0, 131068);
            kxk.g(e18Var, b.e(fqbVar2, 4.0f));
            cjh cjhVar2 = (cjh) vidVar.i.getValue();
            boolean z2 = !((Boolean) lscVar3.getValue()).booleanValue();
            long j2 = gm3.a(e18Var).n;
            int i4 = 0;
            mp9 mp9Var2 = new mp9(2, i4, i4, 126);
            iqb iqbVarC4 = b.c(gb9.L(fqbVar2, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f);
            boolean zF2 = e18Var.f(vidVar);
            Object objN4 = e18Var.N();
            if (zF2 || objN4 == lz1Var2) {
                objN4 = new bz7() { // from class: wid
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj4) {
                        int i42 = i;
                        iei ieiVar = iei.a;
                        vid vidVar2 = vidVar;
                        cjh cjhVar22 = (cjh) obj4;
                        switch (i42) {
                            case 0:
                                cjhVar22.getClass();
                                vidVar2.getClass();
                                vidVar2.h.setValue(cjhVar22);
                                break;
                            case 1:
                                cjhVar22.getClass();
                                vidVar2.getClass();
                                vidVar2.i.setValue(cjhVar22);
                                break;
                            default:
                                cjhVar22.getClass();
                                vidVar2.getClass();
                                vidVar2.j.setValue(cjhVar22);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN4);
            }
            mwa.a(cjhVar2, (bz7) objN4, strP, iqbVarC4, z2, null, null, null, null, null, mp9Var2, null, true, 0, 0, j2, null, e18Var, 100666368, 1597440, 1490656);
            String strP2 = gid.p(16.0f, R.string.profile_update_button, e18Var, e18Var, fqbVar2);
            boolean zBooleanValue = ((Boolean) lscVar3.getValue()).booleanValue();
            boolean z3 = (((Boolean) vidVar.m.getValue()).booleanValue() || ((Boolean) lscVar3.getValue()).booleanValue()) ? false : true;
            boolean zF3 = e18Var.f(vidVar);
            Object objN5 = e18Var.N();
            if (zF3 || objN5 == lz1Var2) {
                ps7Var = ps7Var2;
                lz1Var = lz1Var2;
                z80Var = z80Var7;
                f = 0.0f;
                bxVar = bxVar2;
                z80Var2 = z80Var6;
                f2 = 16.0f;
                z80Var3 = z80Var4;
                fqbVar = fqbVar2;
                mx5 mx5Var = new mx5(0, vidVar, vid.class, "updateAccount", "updateAccount()V", 0, 22);
                e18Var.k0(mx5Var);
                objN5 = mx5Var;
            } else {
                ps7Var = ps7Var2;
                lz1Var = lz1Var2;
                f = 0.0f;
                z80Var3 = z80Var4;
                z80Var = z80Var7;
                bxVar = bxVar2;
                fqbVar = fqbVar2;
                z80Var2 = z80Var6;
                f2 = 16.0f;
            }
            dxj.a(strP2, zBooleanValue, b.c(gb9.L(fqbVar, f2, f, 2), 1.0f), z3, null, null, null, 0L, (zy7) ((jm9) objN5), e18Var, 384, 240);
            String strP3 = gid.p(24.0f, R.string.profile_conversation_preferences, e18Var, e18Var, fqbVar);
            ho0 ho0Var = new ho0(2.0f, true, new sz6(1));
            iqb iqbVarL = gb9.L(fqbVar, f2, f, 2);
            q64 q64VarA2 = p64.a(ho0Var, vo1Var, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarL);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var8 = z80Var3;
            d4c.i0(e18Var, z80Var8, q64VarA2);
            d4c.i0(e18Var, z80Var5, hycVarL2);
            z80 z80Var9 = z80Var2;
            bx bxVar3 = bxVar;
            ij0.t(iHashCode2, e18Var, z80Var9, e18Var, bxVar3);
            z80 z80Var10 = z80Var;
            d4c.i0(e18Var, z80Var10, iqbVarE2);
            nxf nxfVarG = c0l.g(0L, 0L, 0L, 0L, 0L, e18Var, 63);
            tkh tkhVar3 = ((jm3) gm3.c(e18Var).e.E).e;
            long j3 = nxfVarG.a;
            Object objN6 = e18Var.N();
            lz1 lz1Var3 = lz1Var;
            if (objN6 == lz1Var3) {
                objN6 = new f7d(9);
                e18Var.k0(objN6);
            }
            tjh.b(strP3, tjf.a(fqbVar, (bz7) objN6), j3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar3, e18Var, 0, 0, 131064);
            tjh.b(d4c.j0(R.string.profile_conversation_preferences_description, e18Var), null, nxfVarG.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
            e18Var.p(true);
            kxk.g(e18Var, b.e(fqbVar, 4.0f));
            o5b o5bVarD = dw1.d(lja.K, false);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var8, o5bVarD);
            d4c.i0(e18Var, z80Var5, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var9, e18Var, bxVar3);
            d4c.i0(e18Var, z80Var10, iqbVarE3);
            cjh cjhVar3 = (cjh) vidVar.j.getValue();
            boolean z4 = (!((Boolean) wlgVar.getValue()).booleanValue() || ((Boolean) lscVar2.getValue()).booleanValue() || ((Boolean) lscVar.getValue()).booleanValue()) ? false : true;
            mp9 mp9Var3 = mp9.g;
            mp9 mp9VarA = mp9.a();
            long j4 = gm3.a(e18Var).n;
            final int i5 = 2;
            iqb iqbVarC5 = b.c(gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f);
            boolean zF4 = e18Var.f(vidVar);
            Object objN7 = e18Var.N();
            if (zF4 || objN7 == lz1Var3) {
                objN7 = new bz7() { // from class: wid
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj4) {
                        int i42 = i5;
                        iei ieiVar = iei.a;
                        vid vidVar2 = vidVar;
                        cjh cjhVar22 = (cjh) obj4;
                        switch (i42) {
                            case 0:
                                cjhVar22.getClass();
                                vidVar2.getClass();
                                vidVar2.h.setValue(cjhVar22);
                                break;
                            case 1:
                                cjhVar22.getClass();
                                vidVar2.getClass();
                                vidVar2.i.setValue(cjhVar22);
                                break;
                            default:
                                cjhVar22.getClass();
                                vidVar2.getClass();
                                vidVar2.j.setValue(cjhVar22);
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var.k0(objN7);
            }
            mwa.a(cjhVar3, (bz7) objN7, strP3, iqbVarC5, z4, null, null, ask.a, null, null, mp9VarA, null, false, 4, 6, j4, null, e18Var, 100666368, 114819072, 1097440);
            e18 e18Var2 = e18Var;
            if (((Boolean) lscVar2.getValue()).booleanValue()) {
                e18Var2.a0(-508286156);
                ez1.a(null, vf2.J, 0L, e18Var2, 48, 5);
                e18Var2 = e18Var2;
                e18Var2.p(false);
            } else {
                e18Var2.a0(-508203510);
                e18Var2.p(false);
            }
            e18Var2.p(true);
            kxk.g(e18Var2, b.e(fqbVar, 16.0f));
            String strJ02 = d4c.j0(R.string.profile_save_preferences_button, e18Var2);
            boolean zBooleanValue2 = ((Boolean) lscVar.getValue()).booleanValue();
            boolean z5 = (!((Boolean) wlgVar.getValue()).booleanValue() || ((Boolean) vidVar.n.getValue()).booleanValue() || ((Boolean) lscVar.getValue()).booleanValue() || ((Boolean) lscVar2.getValue()).booleanValue()) ? false : true;
            iqb iqbVarC6 = b.c(gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f);
            ps7 ps7Var3 = ps7Var;
            boolean zH = e18Var2.h(ps7Var3) | e18Var2.f(vidVar);
            Object objN8 = e18Var2.N();
            if (zH || objN8 == lz1Var3) {
                objN8 = new aac(ps7Var3, 6, vidVar);
                e18Var2.k0(objN8);
            }
            e18 e18Var3 = e18Var2;
            dxj.a(strJ02, zBooleanValue2, iqbVarC6, z5, null, null, null, 0L, (zy7) objN8, e18Var3, 384, 240);
            e18 e18Var4 = e18Var3;
            if (((Boolean) wlgVar.getValue()).booleanValue()) {
                e18Var4.a0(-1788961884);
                e18Var4.p(false);
            } else {
                sq6.A(8.0f, -1789424125, e18Var4, e18Var4, fqbVar);
                tjh.b(d4c.j0(R.string.profile_conversation_preferences_disabled_by_organization, e18Var4), b.c(gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f), gm3.a(e18Var4).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).g, e18Var4, 48, 0, 131064);
                e18Var4 = e18Var4;
                e18Var4.p(false);
            }
            e18 e18Var5 = e18Var4;
            tjh.b(gid.p(48.0f, R.string.profile_account_actions, e18Var4, e18Var4, fqbVar), b.c(gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f), gm3.a(e18Var4).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).g, e18Var5, 48, 0, 131064);
            kxk.g(e18Var5, b.e(fqbVar, 4.0f));
            bpc bpcVarA = a.a(ud0.C1, e18Var5);
            String strJ03 = d4c.j0(R.string.profile_delete_account, e18Var5);
            nxf nxfVarG2 = c0l.g(gm3.a(e18Var5).y, 0L, 0L, 0L, 0L, e18Var5, 62);
            int i6 = 2;
            iqb iqbVarL2 = gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            boolean zF5 = e18Var5.f(vidVar);
            Object objN9 = e18Var5.N();
            if (zF5 || objN9 == lz1Var3) {
                objN9 = new sid(vidVar, i6);
                e18Var5.k0(objN9);
            }
            xsc.g(bpcVarA, strJ03, (zy7) objN9, iqbVarL2, null, null, false, nxfVarG2, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, null, 0, e18Var5, 3080, 0, 130928);
            kxk.g(e18Var5, b.e(fqbVar, 24.0f));
            if (((Boolean) vidVar.q.getValue()).booleanValue()) {
                e18Var5.a0(-1788009161);
                boolean zF6 = e18Var5.f(vidVar);
                Object objN10 = e18Var5.N();
                if (zF6 || objN10 == lz1Var3) {
                    objN10 = new sid(vidVar, 3);
                    e18Var5.k0(objN10);
                }
                qwk.a((zy7) objN10, null, null, e18Var5, 0);
                e18Var5.p(false);
            } else {
                e18Var5.a0(-1787873660);
                e18Var5.p(false);
            }
            e18Var5.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        bpc bpcVar = (bpc) this.F;
        String str = (String) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dxe) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            wo1 wo1Var = lja.Q;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            cv8.b(bpcVar, null, b.o(fqbVar, 24.0f), 0L, e18Var, 440, 8);
            kxk.g(e18Var, b.t(fqbVar, 8.0f));
            tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 0, 24960, 110590);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        mnc mncVar = (mnc) this.F;
        ta4 ta4Var = (ta4) this.G;
        qw1 qw1Var = (qw1) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        qw1Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(qw1Var) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zC = rl4.c(qw1Var.b);
            xo1 xo1Var = lja.K;
            iqb iqbVarB0 = fqb.E;
            if (zC) {
                e18Var.a0(1430426136);
                iqbVarB0 = mpk.b0(iqbVarB0, mpk.Y(e18Var), true);
            } else {
                e18Var.a0(1430427483);
            }
            e18Var.p(false);
            iqb iqbVarJ = gb9.J(gb9.I(b.g(b.c(iqbVarB0, 1.0f), zC ? qw1Var.b() : Float.NaN, MTTypesetterKt.kLineSkipLimitMultiplier, 2), mncVar), 16.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            vb7.y(0, ta4Var, e18Var, true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        wmd wmdVar = (wmd) this.F;
        mxd mxdVar = (mxd) this.G;
        mnc mncVar = (mnc) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mncVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
        }
        int i = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zH = e18Var.h(wmdVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zH || objN == lz1Var) {
                objN = new umd(wmdVar, i);
                e18Var.k0(objN);
            }
            int i2 = wmd.r;
            mwa.d(wmdVar, null, (bz7) objN, e18Var, 8);
            boolean zBooleanValue = ((Boolean) wmdVar.l.getValue()).booleanValue();
            boolean zH2 = e18Var.h(wmdVar);
            Object objN2 = e18Var.N();
            if (zH2 || objN2 == lz1Var) {
                objN2 = new tmd(wmdVar, 6);
                e18Var.k0(objN2);
            }
            iuj.c(zBooleanValue, (zy7) objN2, null, mxdVar, fd9.q0(-2146454261, new xg4(wmdVar, mncVar, mxdVar, 29), e18Var), null, fd9.q0(-1668721395, new nw7(wmdVar, 25, mncVar), e18Var), e18Var, 1597440, 36);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        ProjectKnowledgeStats projectKnowledgeStats = (ProjectKnowledgeStats) this.F;
        lod lodVar = (lod) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ia0) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            dtj.c(projectKnowledgeStats.getKnowledge_size(), projectKnowledgeStats.getMax_knowledge_size(), projectKnowledgeStats.getProject_knowledge_search_threshold(), ((Boolean) lodVar.h.getValue()).booleanValue(), gb9.N(b.c(fqb.E, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7), e18Var, 24576);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0469  */
    @Override // defpackage.rz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r50, java.lang.Object r51, java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 3198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw7.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
