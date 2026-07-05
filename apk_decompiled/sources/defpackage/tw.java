package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectStarterClicked;
import com.anthropic.claude.api.feature.Feature;
import com.anthropic.claude.api.memory.MemorySynthesisResponse;
import com.anthropic.claude.chat.bottomsheet.a1;
import com.anthropic.claude.tool.model.AnalysisToolInvocation;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tw implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public /* synthetic */ tw(zy7 zy7Var, zy7 zy7Var2, boolean z) {
        this.E = 9;
        this.F = z;
        this.H = zy7Var;
        this.G = zy7Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v39 */
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
    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        u56 u56Var;
        boolean z2;
        zb0 zb0Var;
        ?? r8;
        boolean z3;
        mzi mziVar;
        int i2 = this.E;
        eo0 eo0Var = ko0.c;
        fqb fqbVar = fqb.E;
        Object obj4 = jd4.a;
        int i3 = 2;
        boolean z4 = this.F;
        iei ieiVar = iei.a;
        Object obj5 = this.H;
        Object obj6 = this.G;
        switch (i2) {
            case 0:
                AnalysisToolInvocation analysisToolInvocation = (AnalysisToolInvocation) obj6;
                zy7 zy7Var = (zy7) obj5;
                s64 s64Var = (s64) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                s64Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(s64Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    if (analysisToolInvocation == null || !analysisToolInvocation.isComplete()) {
                        z = false;
                        i = iIntValue;
                    } else {
                        i = iIntValue;
                        z = true;
                    }
                    rqk.h(s64Var, analysisToolInvocation, z, this.F, zy7Var, uuj.a, e18Var, (i & 14) | 196608);
                }
                break;
            case 1:
                bz7 bz7Var = (bz7) obj6;
                pl3 pl3Var = (pl3) obj5;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    rkj.c(null, d4c.j0(R.string.memory_search_setting_title, e18Var2), this.F, bz7Var, null, null, zrk.j(R.string.memory_search_setting_description, x44.W(tyg.UNDERSTANDING_PERSONALIZATION.a()), null, new CharSequence[0], e18Var2, 0, 4), false, qf2.a(e18Var2), qf2.c(e18Var2), qf2.a, MTTypesetterKt.kLineSkipLimitMultiplier, lja.Q, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, Integer.MAX_VALUE, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, pl3Var, e18Var2, 6, 12583296, 0, 1960112);
                }
                break;
            case 2:
                MemorySynthesisResponse memorySynthesisResponse = (MemorySynthesisResponse) obj6;
                pz7 pz7Var = (pz7) obj5;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    lwj.h(memorySynthesisResponse, z4, pz7Var, e18Var3, 0);
                }
                break;
            case 3:
                g93 g93Var = (g93) obj6;
                lc3 lc3Var = (lc3) obj5;
                px9 px9Var = (px9) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                px9Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(px9Var) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    e18Var4.T();
                } else {
                    if (g93Var.i) {
                        e18Var4.a0(615809402);
                        boolean zA = g93Var.d.a();
                        zb0 zb0Var2 = new zb0(d4c.j0(R.string.research_tool_disclaimer, e18Var4));
                        if (zA) {
                            e18Var4.a0(-943126300);
                            zb0Var = new zb0(d4c.j0(R.string.research_tool_disclaimer_notifications_enabled, e18Var4));
                            z2 = false;
                            e18Var4.p(false);
                        } else {
                            z2 = false;
                            e18Var4.a0(-942996224);
                            e18Var4.p(false);
                            zb0Var = null;
                        }
                        u56Var = new u56(zb0Var2, zb0Var, null);
                        e18Var4.p(z2);
                    } else if (g93Var.s) {
                        e18Var4.a0(615813426);
                        u56Var = pqi.k(g93Var.t, g93Var.v, e18Var4);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(615816517);
                        u56Var = new u56(new zb0(d4c.j0(R.string.chat_disclaimer_1, e18Var4)), new zb0(d4c.j0(R.string.chat_disclaimer_2, e18Var4)), tyg.INCORRECT_RESPONSES.a());
                        e18Var4.p(false);
                    }
                    boolean z5 = g93Var.D;
                    wp6 wp6VarE = gp6.e(null, 3);
                    d77 d77VarF = gp6.f(null, 3);
                    iqb qy9Var = fqbVar;
                    if (z4) {
                        yig yigVar = e93.b;
                        qy9Var = fqbVar;
                        if (yigVar != null) {
                            qy9Var = new qy9(null, yigVar, null);
                        }
                    }
                    wd6.M(z5, qy9Var, wp6VarE, d77VarF, null, fd9.q0(-1663434908, new ye(lc3Var, u56Var, g93Var, 19), e18Var4), e18Var4, 200064, 16);
                }
                break;
            case 4:
                List list = (List) obj6;
                t4g t4gVar = (t4g) obj5;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((i4g) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                } else {
                    boolean zG = e18Var5.g(z4) | e18Var5.h(t4gVar);
                    Object objN = e18Var5.N();
                    if (zG || objN == obj4) {
                        objN = new xu0(z4, t4gVar, i3);
                        e18Var5.k0(objN);
                    }
                    a1.b(0, e18Var5, (bz7) objN, null, list);
                }
                break;
            case 5:
                final y85 y85Var = (y85) obj6;
                iqb iqbVar = (iqb) obj5;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((e18) ld4Var6).f(mncVar) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    e18Var6.T();
                } else {
                    znd zndVarP = y85Var.P();
                    koi koiVar = y85Var.c;
                    e18Var6.a0(1933298528);
                    iqb iqbVarB0 = mpk.b0(gb9.L(gb9.I(iqbVar, mncVar), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2).B(b.c).B(z4 ? mpk.k0(fqbVar, mpk.n) : fqbVar), mpk.Y(e18Var6), true);
                    e18Var6.p(false);
                    q64 q64VarA = p64.a(eo0Var, lja.S, e18Var6, 0);
                    int iHashCode = Long.hashCode(e18Var6.T);
                    hyc hycVarL = e18Var6.l();
                    iqb iqbVarE = kxk.E(e18Var6, iqbVarB0);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var6.e0();
                    if (e18Var6.S) {
                        e18Var6.k(re4Var);
                    } else {
                        e18Var6.n0();
                    }
                    d4c.i0(e18Var6, cd4.f, q64VarA);
                    d4c.i0(e18Var6, cd4.e, hycVarL);
                    d4c.i0(e18Var6, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var6, cd4.h);
                    d4c.i0(e18Var6, cd4.d, iqbVarE);
                    kxk.g(e18Var6, b.e(fqbVar, 16.0f));
                    List list2 = y85Var.i;
                    boolean zF = e18Var6.f(y85Var);
                    Object objN2 = e18Var6.N();
                    if (zF || objN2 == obj4) {
                        final int i4 = 0;
                        objN2 = new bz7() { // from class: a95
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj7) {
                                int i5 = i4;
                                iei ieiVar2 = iei.a;
                                y85 y85Var2 = y85Var;
                                switch (i5) {
                                    case 0:
                                        znd zndVar = (znd) obj7;
                                        zndVar.getClass();
                                        y85Var2.m.setValue(zndVar);
                                        y85Var2.l.setValue(o75.F);
                                        qi3 qi3Var = y85Var2.g;
                                        String str = y85Var2.c.e;
                                        String strName = zndVar.e.name();
                                        Locale locale = Locale.ROOT;
                                        String lowerCase = strName.toLowerCase(locale);
                                        lowerCase.getClass();
                                        String lowerCase2 = zndVar.f.name().toLowerCase(locale);
                                        lowerCase2.getClass();
                                        qi3Var.e(new ProjectsEvents$ProjectStarterClicked(str, lowerCase, lowerCase2), ProjectsEvents$ProjectStarterClicked.Companion.serializer());
                                        break;
                                    default:
                                        Boolean bool = (Boolean) obj7;
                                        bool.getClass();
                                        y85Var2.o.setValue(bool);
                                        break;
                                }
                                return ieiVar2;
                            }
                        };
                        e18Var6.k0(objN2);
                    }
                    cvk.e(list2, (bz7) objN2, zndVarP, e18Var6, 512);
                    if (y85Var.O() != o75.F || zndVarP == null) {
                        r8 = 0;
                        e18Var6.a0(-1662150253);
                        e18Var6.p(false);
                    } else {
                        e18Var6.a0(-1662867159);
                        yih yihVar = y85Var.n;
                        if (koiVar.i()) {
                            e18Var6.a0(-1662626816);
                            String name = koiVar.e().getName();
                            boolean zBooleanValue = ((Boolean) y85Var.o.getValue()).booleanValue();
                            boolean zBooleanValue2 = ((Boolean) y85Var.f.c(Feature.PUBLIC_PROJECTS).getValue()).booleanValue();
                            boolean zF2 = e18Var6.f(y85Var);
                            Object objN3 = e18Var6.N();
                            if (zF2 || objN3 == obj4) {
                                final int i5 = 1;
                                objN3 = new bz7() { // from class: a95
                                    @Override // defpackage.bz7
                                    public final Object invoke(Object obj7) {
                                        int i52 = i5;
                                        iei ieiVar2 = iei.a;
                                        y85 y85Var2 = y85Var;
                                        switch (i52) {
                                            case 0:
                                                znd zndVar = (znd) obj7;
                                                zndVar.getClass();
                                                y85Var2.m.setValue(zndVar);
                                                y85Var2.l.setValue(o75.F);
                                                qi3 qi3Var = y85Var2.g;
                                                String str = y85Var2.c.e;
                                                String strName = zndVar.e.name();
                                                Locale locale = Locale.ROOT;
                                                String lowerCase = strName.toLowerCase(locale);
                                                lowerCase.getClass();
                                                String lowerCase2 = zndVar.f.name().toLowerCase(locale);
                                                lowerCase2.getClass();
                                                qi3Var.e(new ProjectsEvents$ProjectStarterClicked(str, lowerCase, lowerCase2), ProjectsEvents$ProjectStarterClicked.Companion.serializer());
                                                break;
                                            default:
                                                Boolean bool = (Boolean) obj7;
                                                bool.getClass();
                                                y85Var2.o.setValue(bool);
                                                break;
                                        }
                                        return ieiVar2;
                                    }
                                };
                                e18Var6.k0(objN3);
                            }
                            mziVar = new mzi(name, zBooleanValue, zBooleanValue2, (bz7) objN3);
                            z3 = false;
                            e18Var6.p(false);
                        } else {
                            z3 = false;
                            e18Var6.a0(-1662231969);
                            e18Var6.p(false);
                            mziVar = null;
                        }
                        cvk.a(zndVarP, yihVar, mziVar, e18Var6, 8);
                        e18Var6.p(z3);
                        r8 = z3;
                    }
                    kxk.g(e18Var6, b.e(fqbVar, 32.0f));
                    if (z4) {
                        e18Var6.a0(-1661961029);
                        cvk.g(y85Var, e18Var6, r8);
                        e18Var6.p(r8);
                    } else {
                        e18Var6.a0(-1661907213);
                        e18Var6.p(r8);
                    }
                    e18Var6.p(true);
                }
                break;
            case 6:
                nwb nwbVar = (nwb) obj6;
                nwb nwbVar2 = (nwb) obj5;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    e18Var7.T();
                } else {
                    iqb iqbVarN = gb9.N(gb9.L(b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7);
                    q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var7, 0);
                    int iHashCode2 = Long.hashCode(e18Var7.T);
                    hyc hycVarL2 = e18Var7.l();
                    iqb iqbVarE2 = kxk.E(e18Var7, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var2);
                    } else {
                        e18Var7.n0();
                    }
                    d4c.i0(e18Var7, cd4.f, q64VarA2);
                    d4c.i0(e18Var7, cd4.e, hycVarL2);
                    d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var7, cd4.h);
                    d4c.i0(e18Var7, cd4.d, iqbVarE2);
                    tjh.b(d4c.j0(R.string.ccr_environment_name_label, e18Var7), gb9.K(fqbVar, 16.0f, 8.0f), gm3.a(e18Var7).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var7).e.E).f, e18Var7, 0, 0, 131064);
                    String str = (String) nwbVar.getValue();
                    boolean z6 = this.F;
                    ta4 ta4Var = z6 ? jlk.b : null;
                    tkh tkhVar = ((jm3) gm3.c(e18Var7).e.E).g;
                    ffh ffhVarQ = k2e.q(gm3.a(e18Var7).M, gm3.a(e18Var7).M, 0L, 0L, 0L, 0L, gm3.a(e18Var7).c, 0L, gm3.a(e18Var7).c, gm3.a(e18Var7).v, 0L, gm3.a(e18Var7).y, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, e18Var7, 2147460860);
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    Object objN4 = e18Var7.N();
                    if (objN4 == obj4) {
                        objN4 = new mj2(nwbVar, nwbVar2, 1);
                        e18Var7.k0(objN4);
                    }
                    kxk.d(str, (bz7) objN4, iqbVarC, false, false, tkhVar, null, null, null, null, ta4Var, z6, null, null, null, true, 0, 0, null, ffhVarQ, e18Var7, 432, 12582912, 0, 4050904);
                    e18Var7.p(true);
                }
                break;
            case 7:
                q5b q5bVar = (q5b) obj;
                h5b h5bVar = (h5b) obj2;
                rl4 rl4Var = (rl4) obj3;
                int iG = sl4.g(((isc) obj6).h(), rl4Var.a);
                long j = rl4Var.a;
                int iF = sl4.f(((isc) obj5).h(), j);
                int iJ = z4 ? iG : rl4.j(j);
                if (!z4) {
                    iG = rl4.h(j);
                }
                c3d c3dVarU = h5bVar.u(rl4.a(iJ, iG, 0, iF, 4, rl4Var.a));
                break;
            case 8:
                eed eedVar = (eed) obj6;
                t4g t4gVar2 = (t4g) obj5;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    e18Var8.T();
                } else {
                    o82 o82Var = eedVar.c;
                    int iB = o82Var != null ? ovj.b(o82Var.O()) + ovj.b(o82Var.P()) : 0;
                    boolean zH = e18Var8.h(t4gVar2);
                    Object objN5 = e18Var8.N();
                    if (zH || objN5 == obj4) {
                        objN5 = new ue(t4gVar2, 20);
                        e18Var8.k0(objN5);
                    }
                    kmb.a(iB, 384, e18Var8, (zy7) objN5, z4);
                }
                break;
            case 9:
                zy7 zy7Var2 = (zy7) obj5;
                zy7 zy7Var3 = (zy7) obj6;
                mnc mncVar2 = (mnc) obj;
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                mncVar2.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((e18) ld4Var9).f(mncVar2) ? 4 : 2;
                }
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    e18Var9.T();
                } else {
                    FillElement fillElement = b.c;
                    iqb iqbVarI = gb9.I(fillElement, mncVar2);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode3 = Long.hashCode(e18Var9.T);
                    hyc hycVarL3 = e18Var9.l();
                    iqb iqbVarE3 = kxk.E(e18Var9, iqbVarI);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var9.e0();
                    if (e18Var9.S) {
                        e18Var9.k(re4Var3);
                    } else {
                        e18Var9.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var9, z80Var, o5bVarD);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var9, z80Var2, hycVarL3);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var9, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var9, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var9, z80Var4, iqbVarE3);
                    vo1 vo1Var = lja.T;
                    iqb iqbVarN2 = gb9.N(gb9.L(mpk.b0(fillElement, mpk.Y(e18Var9), true), 40.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 120.0f, 7);
                    dd8 dd8Var = ko0.e;
                    q64 q64VarA3 = p64.a(dd8Var, vo1Var, e18Var9, 54);
                    int iHashCode4 = Long.hashCode(e18Var9.T);
                    hyc hycVarL4 = e18Var9.l();
                    iqb iqbVarE4 = kxk.E(e18Var9, iqbVarN2);
                    e18Var9.e0();
                    if (e18Var9.S) {
                        e18Var9.k(re4Var3);
                    } else {
                        e18Var9.n0();
                    }
                    d4c.i0(e18Var9, z80Var, q64VarA3);
                    d4c.i0(e18Var9, z80Var2, hycVarL4);
                    ij0.t(iHashCode4, e18Var9, z80Var3, e18Var9, bxVar);
                    d4c.i0(e18Var9, z80Var4, iqbVarE4);
                    tjh.b(d4c.j0(R.string.ccr_notification_permission_title, e18Var9), null, gm3.a(e18Var9).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var9).e.E).a, e18Var9, 0, 0, 130042);
                    tjh.b(gid.p(30.0f, R.string.ccr_notification_permission_description, e18Var9, e18Var9, fqbVar), null, gm3.a(e18Var9).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var9).e.E).e, e18Var9, 0, 0, 130042);
                    e18Var9.p(true);
                    iqb iqbVarJ = gb9.J(b.c(nw1.a.a(fqbVar, lja.N), 1.0f), 16.0f);
                    q64 q64VarA4 = p64.a(eo0Var, lja.S, e18Var9, 0);
                    int iHashCode5 = Long.hashCode(e18Var9.T);
                    hyc hycVarL5 = e18Var9.l();
                    iqb iqbVarE5 = kxk.E(e18Var9, iqbVarJ);
                    e18Var9.e0();
                    if (e18Var9.S) {
                        e18Var9.k(re4Var3);
                    } else {
                        e18Var9.n0();
                    }
                    d4c.i0(e18Var9, z80Var, q64VarA4);
                    d4c.i0(e18Var9, z80Var2, hycVarL5);
                    ij0.t(iHashCode5, e18Var9, z80Var3, e18Var9, bxVar);
                    d4c.i0(e18Var9, z80Var4, iqbVarE5);
                    dxj.a(d4c.j0(R.string.ccr_notification_permission_enable, e18Var9), this.F, b.c(fqbVar, 1.0f), false, null, null, null, 0L, zy7Var2, e18Var9, 384, 248);
                    kxk.g(e18Var9, b.e(fqbVar, 8.0f));
                    iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                    cxe cxeVarA = axe.a(dd8Var, lja.P, e18Var9, 6);
                    int iHashCode6 = Long.hashCode(e18Var9.T);
                    hyc hycVarL6 = e18Var9.l();
                    iqb iqbVarE6 = kxk.E(e18Var9, iqbVarC2);
                    e18Var9.e0();
                    if (e18Var9.S) {
                        e18Var9.k(re4Var3);
                    } else {
                        e18Var9.n0();
                    }
                    d4c.i0(e18Var9, z80Var, cxeVarA);
                    d4c.i0(e18Var9, z80Var2, hycVarL6);
                    ij0.t(iHashCode6, e18Var9, z80Var3, e18Var9, bxVar);
                    d4c.i0(e18Var9, z80Var4, iqbVarE6);
                    csg.j(zy7Var3, null, false, null, null, null, null, dqk.E, e18Var9, 805306368, 510);
                    ij0.w(e18Var9, true, true, true);
                }
                break;
            case 10:
                mtc mtcVar = (mtc) obj6;
                m83 m83Var = (m83) obj5;
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    e18Var10.T();
                } else {
                    btc btcVar = (btc) mtcVar;
                    List list3 = btcVar.a;
                    List list4 = btcVar.b;
                    boolean zF3 = e18Var10.f(list3) | e18Var10.f(list4);
                    Object objN6 = e18Var10.N();
                    if (zF3 || objN6 == obj4) {
                        objN6 = w44.a1(list3, list4);
                        e18Var10.k0(objN6);
                    }
                    List list5 = (List) objN6;
                    boolean zF4 = e18Var10.f(m83Var) | e18Var10.f(mtcVar);
                    Object objN7 = e18Var10.N();
                    if (zF4 || objN7 == obj4) {
                        objN7 = new p7g(m83Var, mtcVar, 1);
                        e18Var10.k0(objN7);
                    }
                    zy7 zy7Var4 = (zy7) objN7;
                    iqb iqbVar2 = e93.a;
                    iqb iqbVarL = gb9.L(fqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    iqb iqbVar3 = fqbVar;
                    if (!z4) {
                        iqbVar3 = e93.a;
                    }
                    zq9.a(list5, zy7Var4, iqbVarL.B(iqbVar3), null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var10, 0);
                }
                break;
            default:
                ((Integer) obj3).getClass();
                aag.a.a((zub) obj6, null, (v9g) obj5, this.F, 0L, (ld4) obj2, 196608);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ tw(Object obj, Object obj2, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.F = z;
    }

    public /* synthetic */ tw(Object obj, boolean z, Object obj2, int i) {
        this.E = i;
        this.G = obj;
        this.F = z;
        this.H = obj2;
    }

    public /* synthetic */ tw(boolean z, Object obj, Object obj2, int i) {
        this.E = i;
        this.F = z;
        this.G = obj;
        this.H = obj2;
    }
}
