package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.chat.tool.ResearchStatus;
import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.chat.parse.MemoryToolSummary;
import com.anthropic.claude.chat.share.k;
import com.anthropic.claude.models.organization.configtypes.CCRStarterTask;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tfe implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ tfe(zy7 zy7Var, Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.H = obj;
        this.F = zy7Var;
        this.G = obj2;
    }

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
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3 = this.E;
        eo0 eo0Var = ko0.c;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        int i4 = 3;
        final int i5 = 1;
        iei ieiVar = iei.a;
        Object obj3 = this.F;
        Object obj4 = this.G;
        Object obj5 = this.H;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                amk.a((qfe) obj5, (bz7) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 1:
                ((Integer) obj2).getClass();
                cmk.e((String) obj5, (zy7) obj3, (bz7) obj4, (ld4) obj, x44.p0(49));
                return ieiVar;
            case 2:
                ((Integer) obj2).getClass();
                unk.g((iqb) obj5, (b4e) obj4, (qi3) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 3:
                jme jmeVar = (jme) obj5;
                String str = (String) obj4;
                iqb iqbVar = (iqb) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ResearchStatus researchStatus = jmeVar != null ? jmeVar.f : null;
                    int i6 = researchStatus == null ? -1 : ple.a[researchStatus.ordinal()];
                    if (i6 == 1 || i6 == 2) {
                        z = false;
                        i = -1554260376;
                        i2 = R.string.research_tool_initial_headline;
                    } else {
                        i = -1554257943;
                        i2 = R.string.research_tool_fallback_headline;
                        z = false;
                    }
                    tjh.b(str == null ? vb7.n(e18Var, i, i2, e18Var, z) : str, iqbVar, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 24960, 110584);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 4:
                aae aaeVar = (aae) obj5;
                raf rafVar = (raf) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = rafVar.h(rafVar.d(fFloatValue - aaeVar.E));
                raf rafVar2 = ((paf) obj3).a;
                aaeVar.E += rafVar.d(rafVar.g(rafVar2.c(rafVar2.k, jH, 1)));
                return ieiVar;
            case 5:
                ((Integer) obj2).getClass();
                wb5.c((CCRStarterTask) obj5, (zy7) obj3, (iqb) obj4, (ld4) obj, x44.p0(385));
                return ieiVar;
            case 6:
                String str2 = (String) obj5;
                zy7 zy7Var = (zy7) obj3;
                rz7 rz7Var = (rz7) obj4;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ssj.e(str2, zy7Var, rz7Var, null, e18Var2, 0);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 7:
                String str3 = (String) obj5;
                ml3 ml3Var = (ml3) obj4;
                ta4 ta4Var = (ta4) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int i7 = ml3.f;
                    ssj.d(str3, ml3Var, ta4Var, null, e18Var3, 0);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 8:
                ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource = (ChatMessageActionEvents$ActionSource) obj;
                chatMessageActionEvents$ActionSource.getClass();
                gb9.D((l45) obj5, null, null, new lza((w1g) obj4, (op3) obj3, chatMessageActionEvents$ActionSource, (whd) obj2, (tp4) null, 15), 3);
                return ieiVar;
            case 9:
                ((Integer) obj2).getClass();
                k.b((String) obj5, (zy7) obj3, (zy7) obj4, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 10:
                d2g d2gVar = (d2g) obj5;
                w1g w1gVar = (w1g) obj4;
                zy7 zy7Var2 = (zy7) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String str4 = d2gVar.c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    boolean zF = e18Var4.f(w1gVar);
                    Object objN = e18Var4.N();
                    if (zF || objN == lz1Var) {
                        objN = new ogf(0, w1gVar, w1g.class, "reportSnapshot", "reportSnapshot()V", 0, 4);
                        e18Var4.k0(objN);
                    }
                    k.b(str4, (zy7) ((jm9) objN), zy7Var2, e18Var4, 0);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 11:
                ((Integer) obj2).getClass();
                etj.i((ChatSnapshotSummaryWithChatId) obj5, (bz7) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 12:
                pz7 pz7Var = (pz7) obj5;
                ta4 ta4Var2 = (ta4) obj4;
                a5g a5gVar = (a5g) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else if (pz7Var == null) {
                    e18Var5.a0(-326029631);
                    ta4Var2.invoke(e18Var5, 0);
                    e18Var5.p(false);
                } else {
                    e18Var5.a0(-325955634);
                    e18Var5.p(false);
                    int iOrdinal = a5gVar.ordinal();
                    if (iOrdinal == 0) {
                        e18Var5.a0(-325864649);
                        q64 q64VarA = p64.a(eo0Var, lja.S, e18Var5, 0);
                        int iHashCode = Long.hashCode(e18Var5.T);
                        hyc hycVarL = e18Var5.l();
                        iqb iqbVarE = kxk.E(e18Var5, fqbVar);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var5.e0();
                        if (e18Var5.S) {
                            e18Var5.k(re4Var);
                        } else {
                            e18Var5.n0();
                        }
                        d4c.i0(e18Var5, cd4.f, q64VarA);
                        d4c.i0(e18Var5, cd4.e, hycVarL);
                        d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode));
                        d4c.h0(e18Var5, cd4.h);
                        d4c.i0(e18Var5, cd4.d, iqbVarE);
                        pz7Var.invoke(e18Var5, 0);
                        ta4Var2.invoke(e18Var5, 0);
                        e18Var5.p(true);
                        e18Var5.p(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw ebh.u(e18Var5, 2067695979, false);
                        }
                        e18Var5.a0(-325695110);
                        o5b o5bVarD = dw1.d(lja.G, false);
                        int iHashCode2 = Long.hashCode(e18Var5.T);
                        hyc hycVarL2 = e18Var5.l();
                        iqb iqbVarE2 = kxk.E(e18Var5, fqbVar);
                        dd4.e.getClass();
                        re4 re4Var2 = cd4.b;
                        e18Var5.e0();
                        if (e18Var5.S) {
                            e18Var5.k(re4Var2);
                        } else {
                            e18Var5.n0();
                        }
                        d4c.i0(e18Var5, cd4.f, o5bVarD);
                        d4c.i0(e18Var5, cd4.e, hycVarL2);
                        d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode2));
                        d4c.h0(e18Var5, cd4.h);
                        d4c.i0(e18Var5, cd4.d, iqbVarE2);
                        ta4Var2.invoke(e18Var5, 0);
                        pz7Var.invoke(e18Var5, 0);
                        e18Var5.p(true);
                        e18Var5.p(false);
                    }
                }
                return ieiVar;
            case 13:
                rz7 rz7Var2 = (rz7) obj5;
                i4g i4gVar = (i4g) obj4;
                ta4 ta4Var3 = (ta4) obj3;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                    return ieiVar;
                }
                q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var6, 0);
                int iHashCode3 = Long.hashCode(e18Var6.T);
                hyc hycVarL3 = e18Var6.l();
                iqb iqbVarE3 = kxk.E(e18Var6, fqbVar);
                dd4.e.getClass();
                re4 re4Var3 = cd4.b;
                e18Var6.e0();
                if (e18Var6.S) {
                    e18Var6.k(re4Var3);
                } else {
                    e18Var6.n0();
                }
                z80 z80Var = cd4.f;
                d4c.i0(e18Var6, z80Var, q64VarA2);
                z80 z80Var2 = cd4.e;
                d4c.i0(e18Var6, z80Var2, hycVarL3);
                Integer numValueOf = Integer.valueOf(iHashCode3);
                z80 z80Var3 = cd4.g;
                d4c.i0(e18Var6, z80Var3, numValueOf);
                bx bxVar = cd4.h;
                d4c.h0(e18Var6, bxVar);
                z80 z80Var4 = cd4.d;
                hw9 hw9VarN = kgh.n(e18Var6, iqbVarE3, z80Var4, 1.0f, true);
                o5b o5bVarD2 = dw1.d(lja.G, false);
                int iHashCode4 = Long.hashCode(e18Var6.T);
                hyc hycVarL4 = e18Var6.l();
                iqb iqbVarE4 = kxk.E(e18Var6, hw9VarN);
                e18Var6.e0();
                if (e18Var6.S) {
                    e18Var6.k(re4Var3);
                } else {
                    e18Var6.n0();
                }
                d4c.i0(e18Var6, z80Var, o5bVarD2);
                d4c.i0(e18Var6, z80Var2, hycVarL4);
                ij0.t(iHashCode4, e18Var6, z80Var3, e18Var6, bxVar);
                d4c.i0(e18Var6, z80Var4, iqbVarE4);
                ta4Var3.invoke(rz7Var2 != null ? i4g.a(i4gVar, MTTypesetterKt.kLineSkipLimitMultiplier) : i4gVar, e18Var6, 0);
                e18Var6.p(true);
                if (rz7Var2 == null) {
                    e18Var6.a0(411572522);
                    z2 = false;
                } else {
                    z2 = false;
                    e18Var6.a0(-2064933449);
                    rz7Var2.invoke(i4gVar, e18Var6, 0);
                }
                e18Var6.p(z2);
                e18Var6.p(true);
                return ieiVar;
            case 14:
                v4g v4gVar = (v4g) obj5;
                zy7 zy7Var3 = (zy7) obj3;
                l45 l45Var = (l45) obj4;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    k4g.a.a(v4gVar, zy7Var3, l45Var, e18Var7, 3072);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                tik.c((xs5) obj5, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 16:
                t4g t4gVar = (t4g) obj5;
                TaskResponse taskResponse = (TaskResponse) obj4;
                ta4 ta4Var4 = (ta4) obj3;
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    cxe cxeVarA = axe.a(new ho0(8.0f, true, new sz6(1)), lja.P, e18Var8, 6);
                    int iHashCode5 = Long.hashCode(e18Var8.T);
                    hyc hycVarL5 = e18Var8.l();
                    iqb iqbVarE5 = kxk.E(e18Var8, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var4 = cd4.b;
                    e18Var8.e0();
                    if (e18Var8.S) {
                        e18Var8.k(re4Var4);
                    } else {
                        e18Var8.n0();
                    }
                    d4c.i0(e18Var8, cd4.f, cxeVarA);
                    d4c.i0(e18Var8, cd4.e, hycVarL5);
                    d4c.i0(e18Var8, cd4.g, Integer.valueOf(iHashCode5));
                    d4c.h0(e18Var8, cd4.h);
                    d4c.i0(e18Var8, cd4.d, iqbVarE5);
                    tqh tqhVar = tqh.T;
                    ud0 ud0Var = ud0.L1;
                    boolean zH = e18Var8.h(t4gVar) | e18Var8.f(taskResponse);
                    Object objN2 = e18Var8.N();
                    if (zH || objN2 == lz1Var) {
                        objN2 = new q9h(t4gVar, taskResponse, i5);
                        e18Var8.k0(objN2);
                    }
                    tqhVar.y(ud0Var, "Inspect session events", null, false, (zy7) objN2, e18Var8, 196656, 12);
                    vb7.y(6, ta4Var4, e18Var8, true);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                cae caeVar = (cae) obj5;
                sih sihVar = (sih) obj4;
                z7d z7dVar = (z7d) obj;
                long jI = fcc.i(caeVar.E, ((fcc) obj2).a);
                caeVar.E = jI;
                sihVar.H(te8.E, fcc.i(((cae) obj3).E, jI));
                if (sihVar.A(sihVar.s())) {
                    z7dVar.a();
                    gf8 gf8Var = sihVar.j;
                    if (gf8Var != null) {
                        gf8Var.a(9);
                    }
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                nvh.a((z1e) obj5, obj4, (iqb) obj3, (ld4) obj, x44.p0(9));
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Integer) obj2).getClass();
                stk.b((MemoryToolSummary) obj5, (mnc) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                final KnowledgeSource knowledgeSource = (KnowledgeSource) obj5;
                final bz7 bz7Var = (bz7) obj4;
                final bz7 bz7Var2 = (bz7) obj3;
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zF2 = e18Var9.f(bz7Var) | e18Var9.f(knowledgeSource);
                    Object objN3 = e18Var9.N();
                    if (zF2 || objN3 == lz1Var) {
                        final int i8 = false ? 1 : 0;
                        objN3 = new zy7() { // from class: hwh
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i9 = i8;
                                iei ieiVar2 = iei.a;
                                KnowledgeSource knowledgeSource2 = knowledgeSource;
                                bz7 bz7Var3 = bz7Var;
                                switch (i9) {
                                    case 0:
                                        bz7Var3.invoke(knowledgeSource2);
                                        break;
                                    default:
                                        bz7Var3.invoke(knowledgeSource2);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var9.k0(objN3);
                    }
                    zy7 zy7Var4 = (zy7) objN3;
                    boolean zF3 = e18Var9.f(bz7Var2) | e18Var9.f(knowledgeSource);
                    Object objN4 = e18Var9.N();
                    if (zF3 || objN4 == lz1Var) {
                        objN4 = new zy7() { // from class: hwh
                            @Override // defpackage.zy7
                            public final Object a() {
                                int i9 = i5;
                                iei ieiVar2 = iei.a;
                                KnowledgeSource knowledgeSource2 = knowledgeSource;
                                bz7 bz7Var3 = bz7Var2;
                                switch (i9) {
                                    case 0:
                                        bz7Var3.invoke(knowledgeSource2);
                                        break;
                                    default:
                                        bz7Var3.invoke(knowledgeSource2);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var9.k0(objN4);
                    }
                    huk.i(knowledgeSource, zy7Var4, (zy7) objN4, b.c(fqbVar, 1.0f), e18Var9, 3072);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case 21:
                List list = (List) obj5;
                dwg dwgVar = (dwg) obj3;
                bz7 bz7Var3 = (bz7) obj4;
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    dxj.c(list, dwgVar, bz7Var3, null, e18Var10, 0);
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                List list2 = (List) obj5;
                List list3 = (List) obj4;
                pz7 pz7Var2 = (pz7) obj3;
                j0a j0aVar = (j0a) obj;
                mnc mncVar = (mnc) obj2;
                j0aVar.getClass();
                mncVar.getClass();
                boolean zIsEmpty = list2.isEmpty();
                boolean zIsEmpty2 = list3.isEmpty();
                int i9 = 19;
                dfg dfgVar = dfg.E;
                if (!zIsEmpty) {
                    j0aVar.U(efg.E, dfgVar, new ta4(1322484872, true, new u3e(new hzh(7), i9, mncVar)));
                    wvj.h(j0aVar, list2, mncVar, new kld(i4, pz7Var2));
                }
                if (!zIsEmpty2) {
                    if (!zIsEmpty) {
                        j0aVar.U(efg.F, dfgVar, new ta4(1322484872, true, new u3e(new hzh(8), i9, mncVar)));
                    }
                    wvj.h(j0aVar, list3, mncVar, new kld(4, pz7Var2));
                }
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                qi3 qi3Var = (qi3) obj5;
                VoiceSessionSummary voiceSessionSummary = (VoiceSessionSummary) obj4;
                zy7 zy7Var5 = (zy7) obj3;
                g4j g4jVar = (g4j) obj;
                String str5 = (String) obj2;
                g4jVar.getClass();
                str5.getClass();
                String str6 = g4jVar.E;
                String strJ1 = bsg.j1(FreeTypeConstants.FT_LOAD_NO_RECURSE, str5);
                dkk.j(qi3Var, voiceSessionSummary, false, str6, bsg.I0(strJ1) ? null : strJ1);
                zy7Var5.a();
                return ieiVar;
            default:
                ((Integer) obj2).getClass();
                tnk.d((MessageImageAsset) obj5, (iqb) obj4, (String) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
        }
    }

    public /* synthetic */ tfe(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.E = i2;
        this.H = obj;
        this.G = obj2;
        this.F = obj3;
    }

    public /* synthetic */ tfe(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.H = obj;
        this.G = obj2;
        this.F = obj3;
    }

    public /* synthetic */ tfe(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.E = i;
        this.H = obj;
        this.F = obj2;
        this.G = obj3;
    }
}
