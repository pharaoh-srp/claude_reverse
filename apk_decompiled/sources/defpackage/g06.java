package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class g06 implements i06 {
    public static final g06 c;
    public static final g06 d;
    public static final g06 e;
    public final k06 a;
    public final u0h b = new u0h(new l4(10, this));

    static {
        k06 k06Var = new k06();
        k06Var.j();
        k06Var.a = true;
        new g06(k06Var);
        k06 k06Var2 = new k06();
        k06Var2.j();
        um6 um6Var = um6.E;
        k06Var2.d(um6Var);
        k06Var2.a = true;
        new g06(k06Var2);
        k06 k06Var3 = new k06();
        k06Var3.j();
        k06Var3.d(um6Var);
        k06Var3.n();
        k06Var3.a = true;
        new g06(k06Var3);
        k06 k06Var4 = new k06();
        k06Var4.d(um6Var);
        zh3 zh3Var = zh3.c;
        k06Var4.h(zh3Var);
        xrc xrcVar = xrc.F;
        k06Var4.g(xrcVar);
        k06Var4.a = true;
        new g06(k06Var4);
        k06 k06Var5 = new k06();
        k06Var5.j();
        k06Var5.d(um6Var);
        k06Var5.h(zh3Var);
        k06Var5.f();
        k06Var5.g(xrc.G);
        k06Var5.a();
        k06Var5.c();
        k06Var5.n();
        k06Var5.i();
        k06Var5.a = true;
        new g06(k06Var5);
        k06 k06Var6 = new k06();
        k06Var6.d(h06.F);
        k06Var6.a = true;
        c = new g06(k06Var6);
        k06 k06Var7 = new k06();
        k06Var7.d(h06.G);
        k06Var7.a = true;
        new g06(k06Var7);
        k06 k06Var8 = new k06();
        k06Var8.h(zh3Var);
        k06Var8.g(xrcVar);
        k06Var8.a = true;
        d = new g06(k06Var8);
        k06 k06Var9 = new k06();
        k06Var9.b();
        k06Var9.h(zh3.b);
        k06Var9.d(h06.G);
        k06Var9.a = true;
        e = new g06(k06Var9);
        k06 k06Var10 = new k06();
        k06Var10.m();
        k06Var10.d(h06.G);
        k06Var10.a = true;
        new g06(k06Var10);
    }

    public g06(k06 k06Var) {
        this.a = k06Var;
    }

    public static void Y(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean k0(yr9 yr9Var) {
        if (!cpk.q(yr9Var)) {
            return false;
        }
        List listH = yr9Var.H();
        if ((listH instanceof Collection) && listH.isEmpty()) {
            return true;
        }
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            if (((vai) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static final void o(g06 g06Var, hrd hrdVar, StringBuilder sb) {
        boolean zS = g06Var.s();
        k06 k06Var = g06Var.a;
        if (!zS) {
            va1 va1Var = k06Var.g;
            wn9[] wn9VarArr = k06.W;
            wn9 wn9Var = wn9VarArr[5];
            va1Var.getClass();
            wn9Var.getClass();
            if (!((Boolean) va1Var.a).booleanValue()) {
                if (g06Var.r().contains(h06.ANNOTATIONS)) {
                    g06Var.z(sb, hrdVar, null);
                    nh7 nh7VarV = hrdVar.V();
                    if (nh7VarV != null) {
                        g06Var.z(sb, nh7VarV, sc0.FIELD);
                    }
                    nh7 nh7VarT = hrdVar.T();
                    if (nh7VarT != null) {
                        g06Var.z(sb, nh7VarT, sc0.PROPERTY_DELEGATE_FIELD);
                    }
                    va1 va1Var2 = k06Var.G;
                    wn9 wn9Var2 = wn9VarArr[31];
                    va1Var2.getClass();
                    wn9Var2.getClass();
                    if (((frd) va1Var2.a) == frd.F) {
                        krd krdVarB = hrdVar.b();
                        if (krdVarB != null) {
                            g06Var.z(sb, krdVarB, sc0.PROPERTY_GETTER);
                        }
                        prd prdVarC = hrdVar.c();
                        if (prdVarC != null) {
                            g06Var.z(sb, prdVarC, sc0.PROPERTY_SETTER);
                            List listI = prdVarC.I();
                            listI.getClass();
                            eri eriVar = (eri) w44.e1(listI);
                            eriVar.getClass();
                            g06Var.z(sb, eriVar, sc0.SETTER_PARAMETER);
                        }
                    }
                }
                List listX = hrdVar.X();
                listX.getClass();
                g06Var.D(sb, listX);
                ow5 visibility = hrdVar.getVisibility();
                visibility.getClass();
                g06Var.i0(visibility, sb);
                g06Var.O("const", sb, g06Var.r().contains(h06.CONST) && hrdVar.r());
                g06Var.L(hrdVar, sb);
                g06Var.N(hrdVar, sb);
                g06Var.T(hrdVar, sb);
                g06Var.O("lateinit", sb, g06Var.r().contains(h06.LATEINIT) && hrdVar.Y());
                g06Var.K(hrdVar, sb);
            }
            g06Var.f0(hrdVar, sb, false);
            List typeParameters = hrdVar.getTypeParameters();
            typeParameters.getClass();
            g06Var.e0(typeParameters, sb, true);
            g06Var.W(hrdVar, sb);
        }
        g06Var.Q(hrdVar, sb, true);
        sb.append(": ");
        yr9 type = hrdVar.getType();
        type.getClass();
        sb.append(g06Var.Z(type));
        g06Var.X(hrdVar, sb);
        g06Var.I(hrdVar, sb);
        List typeParameters2 = hrdVar.getTypeParameters();
        typeParameters2.getClass();
        g06Var.j0(sb, typeParameters2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(defpackage.w9b r5) {
        /*
            boolean r0 = r5 instanceof defpackage.qqb
            r1 = 4
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L10
            qqb r5 = (defpackage.qqb) r5
            int r5 = r5.m()
            if (r5 != r2) goto L55
            goto L52
        L10:
            bo5 r0 = r5.h()
            boolean r4 = r0 instanceof defpackage.qqb
            if (r4 == 0) goto L1b
            qqb r0 = (defpackage.qqb) r0
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L1f
            goto L55
        L1f:
            boolean r4 = r5 instanceof defpackage.e92
            if (r4 != 0) goto L24
            goto L55
        L24:
            e92 r5 = (defpackage.e92) r5
            java.util.Collection r4 = r5.i()
            r4.getClass()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L3a
            int r4 = r0.q()
            if (r4 == r3) goto L3a
            goto L53
        L3a:
            int r0 = r0.m()
            if (r0 != r2) goto L55
            ow5 r0 = r5.getVisibility()
            p06 r2 = defpackage.q06.a
            boolean r0 = defpackage.x44.r(r0, r2)
            if (r0 != 0) goto L55
            int r5 = r5.q()
            if (r5 != r1) goto L53
        L52:
            return r1
        L53:
            r5 = 3
            return r5
        L55:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g06.w(w9b):int");
    }

    public final void B(yh3 yh3Var, StringBuilder sb) {
        List listI0 = yh3Var.i0();
        listI0.getClass();
        List parameters = yh3Var.p().getParameters();
        parameters.getClass();
        if (v() && yh3Var.y() && parameters.size() > listI0.size()) {
            sb.append(" /*captured type parameters: ");
            d0(sb, parameters.subList(listI0.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String C(il4 il4Var) {
        if (il4Var instanceof lp0) {
            return w44.S0((Iterable) ((lp0) il4Var).b(), ", ", "{", "}", new e06(this, 1), 24);
        }
        if (il4Var instanceof uc0) {
            return bsg.R0(y((jc0) ((uc0) il4Var).b(), null), "@");
        }
        if (!(il4Var instanceof bm9)) {
            return il4Var.toString();
        }
        am9 am9Var = (am9) ((bm9) il4Var).b();
        if (am9Var instanceof yl9) {
            return ((yl9) am9Var).a() + "::class";
        }
        if (!(am9Var instanceof zl9)) {
            mr9.b();
            return null;
        }
        zl9 zl9Var = (zl9) am9Var;
        String strB = zl9Var.b().b().b();
        int iA = zl9Var.a();
        for (int i = 0; i < iA; i++) {
            strB = grc.n('>', "kotlin.Array<", strB);
        }
        return strB.concat("::class");
    }

    public final void D(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            l6e l6eVar = (l6e) it.next();
            z(sb, l6eVar, sc0.RECEIVER);
            yr9 type = ((mw9) l6eVar).getType();
            type.getClass();
            sb.append(H(type));
            if (i == list.size() - 1) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.lang.StringBuilder r6, defpackage.j7g r7) {
        /*
            r5 = this;
            A(r5, r6, r7)
            boolean r0 = defpackage.ttj.j(r7)
            r1 = 0
            if (r0 == 0) goto L80
            boolean r0 = defpackage.jwk.B(r7)
            k06 r2 = r5.a
            if (r0 == 0) goto L44
            va1 r0 = r2.T
            wn9[] r3 = defpackage.k06.W
            r4 = 45
            r3 = r3[r4]
            r0.getClass()
            r3.getClass()
            java.lang.Object r0 = r0.a
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L44
            nu6 r0 = defpackage.nu6.a
            defpackage.jwk.B(r7)
            u9i r0 = r7.O()
            r0.getClass()
            lu6 r0 = (defpackage.lu6) r0
            java.lang.String[] r0 = r0.b
            r0 = r0[r1]
            java.lang.String r5 = r5.F(r0)
            r6.append(r5)
            goto Lb0
        L44:
            boolean r0 = r7 instanceof defpackage.ku6
            if (r0 == 0) goto L69
            va1 r0 = r2.V
            wn9[] r1 = defpackage.k06.W
            r2 = 47
            r1 = r1[r2]
            r0.getClass()
            r1.getClass()
            java.lang.Object r0 = r0.a
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L69
            r0 = r7
            ku6 r0 = (defpackage.ku6) r0
            java.lang.String r0 = r0.L
            r6.append(r0)
            goto L74
        L69:
            u9i r0 = r7.O()
            java.lang.String r0 = r0.toString()
            r6.append(r0)
        L74:
            java.util.List r0 = r7.H()
            java.lang.String r5 = r5.a0(r0)
            r6.append(r5)
            goto Lb0
        L80:
            u9i r0 = r7.O()
            u9i r2 = r7.O()
            xh3 r2 = r2.a()
            boolean r3 = r2 instanceof defpackage.yh3
            if (r3 == 0) goto L93
            yh3 r2 = (defpackage.yh3) r2
            goto L94
        L93:
            r2 = 0
        L94:
            lrb r1 = defpackage.sf5.l(r7, r2, r1)
            if (r1 != 0) goto Lad
            java.lang.String r0 = r5.b0(r0)
            r6.append(r0)
            java.util.List r0 = r7.H()
            java.lang.String r5 = r5.a0(r0)
            r6.append(r5)
            goto Lb0
        Lad:
            r5.V(r6, r1)
        Lb0:
            boolean r5 = r7.b0()
            if (r5 == 0) goto Lbb
            java.lang.String r5 = "?"
            r6.append(r5)
        Lbb:
            boolean r5 = r7 instanceof defpackage.fw5
            if (r5 == 0) goto Lc4
            java.lang.String r5 = " & Any"
            r6.append(r5)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g06.E(java.lang.StringBuilder, j7g):void");
    }

    public final String F(String str) {
        int iOrdinal = t().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return ij0.j("<font color=red><b>", str, "</b></font>");
        }
        mr9.b();
        return null;
    }

    public final String G(String str, String str2, or9 or9Var) {
        str.getClass();
        str2.getClass();
        if (yb5.Q(str, str2)) {
            return isg.q0(str2, "(", false) ? ij0.j("(", str, ")!") : str.concat("!");
        }
        String strH1 = bsg.h1(q().b(or9Var.i(okg.B), this), "Collection");
        String strE = yb5.E(str, strH1.concat("Mutable"), str2, strH1, strH1.concat("(Mutable)"));
        if (strE != null) {
            return strE;
        }
        String strE2 = yb5.E(str, strH1.concat("MutableMap.MutableEntry"), str2, strH1.concat("Map.Entry"), strH1.concat("(Mutable)Map.(Mutable)Entry"));
        if (strE2 != null) {
            return strE2;
        }
        String strH12 = bsg.h1(q().b(or9Var.j("Array"), this), "Array");
        String strE3 = yb5.E(str, strH12.concat(p("Array<")), str2, strH12.concat(p("Array<out ")), strH12.concat(p("Array<(out) ")));
        if (strE3 != null) {
            return strE3;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String H(yr9 yr9Var) {
        String strZ = Z(yr9Var);
        return ((!k0(yr9Var) || fbi.e(yr9Var)) && !(yr9Var instanceof fw5)) ? strZ : grc.n(')', "(", strZ);
    }

    public final void I(iri iriVar, StringBuilder sb) {
        il4 il4VarD;
        va1 va1Var = this.a.u;
        wn9 wn9Var = k06.W[19];
        va1Var.getClass();
        wn9Var.getClass();
        if (!((Boolean) va1Var.a).booleanValue() || (il4VarD = iriVar.D()) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(p(C(il4VarD)));
    }

    public final String J(String str) {
        int iOrdinal = t().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                mr9.b();
                return null;
            }
            va1 va1Var = this.a.U;
            wn9 wn9Var = k06.W[46];
            va1Var.getClass();
            wn9Var.getClass();
            if (!((Boolean) va1Var.a).booleanValue()) {
                return ij0.j("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void K(e92 e92Var, StringBuilder sb) {
        if (r().contains(h06.MEMBER_KIND) && v() && e92Var.getKind() != 1) {
            sb.append("/*");
            sb.append(mwj.n(qy1.A(e92Var.getKind())));
            sb.append("*/ ");
        }
    }

    public final void L(w9b w9bVar, StringBuilder sb) {
        O("external", sb, w9bVar.isExternal());
        boolean z = false;
        O("expect", sb, r().contains(h06.EXPECT) && w9bVar.x());
        if (r().contains(h06.ACTUAL) && w9bVar.g0()) {
            z = true;
        }
        O("actual", sb, z);
    }

    public final void M(int i, int i2, StringBuilder sb) {
        va1 va1Var = this.a.p;
        wn9 wn9Var = k06.W[14];
        va1Var.getClass();
        wn9Var.getClass();
        if (((Boolean) va1Var.a).booleanValue() || i != i2) {
            O(mwj.n(y6a.v(i)), sb, r().contains(h06.MODALITY));
        }
    }

    public final void N(e92 e92Var, StringBuilder sb) {
        if (m06.s(e92Var) && e92Var.q() == 1) {
            return;
        }
        va1 va1Var = this.a.A;
        wn9 wn9Var = k06.W[25];
        va1Var.getClass();
        wn9Var.getClass();
        if (((emc) va1Var.a) == emc.E && e92Var.q() == 3 && !e92Var.i().isEmpty()) {
            return;
        }
        int iQ = e92Var.q();
        sq6.a(iQ);
        M(iQ, w(e92Var), sb);
    }

    public final void O(String str, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(J(str));
            sb.append(" ");
        }
    }

    public final String P(sxb sxbVar, boolean z) {
        String strP = p(yb5.C(sxbVar));
        va1 va1Var = this.a.U;
        wn9 wn9Var = k06.W[46];
        va1Var.getClass();
        wn9Var.getClass();
        return (((Boolean) va1Var.a).booleanValue() && t() == kge.F && z) ? ij0.j("<b>", strP, "</b>") : strP;
    }

    public final void Q(bo5 bo5Var, StringBuilder sb, boolean z) {
        sxb name = bo5Var.getName();
        name.getClass();
        sb.append(P(name, z));
    }

    public final void R(StringBuilder sb, yr9 yr9Var) throws IOException {
        fhi fhiVarK0 = yr9Var.k0();
        q qVar = fhiVarK0 instanceof q ? (q) fhiVarK0 : null;
        if (qVar == null) {
            S(sb, yr9Var);
            return;
        }
        k06 k06Var = this.a;
        va1 va1Var = k06Var.Q;
        wn9[] wn9VarArr = k06.W;
        wn9 wn9Var = wn9VarArr[41];
        va1Var.getClass();
        wn9Var.getClass();
        if (((Boolean) va1Var.a).booleanValue()) {
            S(sb, qVar.u0());
            return;
        }
        S(sb, qVar.t0());
        va1 va1Var2 = k06Var.P;
        wn9 wn9Var2 = wn9VarArr[40];
        va1Var2.getClass();
        wn9Var2.getClass();
        if (((Boolean) va1Var2.a).booleanValue()) {
            kge kgeVarT = t();
            ige igeVar = kge.F;
            if (kgeVarT == igeVar) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* = ");
            S(sb, qVar.u0());
            sb.append(" */");
            if (t() == igeVar) {
                sb.append("</i></font>");
            }
        }
    }

    public final void S(StringBuilder sb, yr9 yr9Var) throws IOException {
        sxb sxbVarI;
        String strP;
        k06 k06Var = this.a;
        if ((yr9Var instanceof z1a) && k06Var.o()) {
            dfa dfaVar = ((z1a) yr9Var).H;
            if (dfaVar.G == ffa.E || dfaVar.G == ffa.F) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        fhi fhiVarK0 = yr9Var.k0();
        if (fhiVarK0 instanceof sn7) {
            sb.append(((sn7) fhiVarK0).p0(this, this));
            return;
        }
        if (fhiVarK0 instanceof j7g) {
            j7g j7gVar = (j7g) fhiVarK0;
            if (j7gVar.equals(fbi.b) || j7gVar.O() == fbi.a.F) {
                sb.append("???");
                return;
            }
            u9i u9iVarO = j7gVar.O();
            int i = 0;
            if ((u9iVarO instanceof lu6) && ((lu6) u9iVarO).a == mu6.UNINFERRED_TYPE_VARIABLE) {
                va1 va1Var = k06Var.t;
                wn9 wn9Var = k06.W[18];
                va1Var.getClass();
                wn9Var.getClass();
                if (!((Boolean) va1Var.a).booleanValue()) {
                    sb.append("???");
                    return;
                }
                u9i u9iVarO2 = j7gVar.O();
                u9iVarO2.getClass();
                sb.append(F(((lu6) u9iVarO2).b[0]));
                return;
            }
            if (ttj.j(j7gVar)) {
                E(sb, j7gVar);
                return;
            }
            if (!k0(j7gVar)) {
                E(sb, j7gVar);
                return;
            }
            int length = sb.length();
            ((g06) this.b.getValue()).z(sb, j7gVar, null);
            boolean z = sb.length() != length;
            yr9 yr9VarM = cpk.m(j7gVar);
            List listK = cpk.k(j7gVar);
            if (!listK.isEmpty()) {
                sb.append("context(");
                Iterator it = listK.subList(0, listK.size() - 1).iterator();
                while (it.hasNext()) {
                    R(sb, (yr9) it.next());
                    sb.append(", ");
                }
                R(sb, (yr9) w44.U0(listK));
                sb.append(") ");
            }
            boolean zS = cpk.s(j7gVar);
            boolean zB0 = j7gVar.b0();
            boolean z2 = zB0 || (z && yr9VarM != null);
            if (z2) {
                if (zS) {
                    sb.insert(length, '(');
                } else {
                    if (z) {
                        gb9.B(bsg.J0(sb));
                        if (sb.charAt(sb.length() - 2) != ')') {
                            sb.insert(sb.length() - 1, "()");
                        }
                    }
                    sb.append("(");
                }
            }
            O("suspend", sb, zS);
            if (yr9VarM != null) {
                boolean z3 = (k0(yr9VarM) && !yr9VarM.b0()) || cpk.s(yr9VarM) || !yr9VarM.getAnnotations().isEmpty() || (yr9VarM instanceof fw5);
                if (z3) {
                    sb.append("(");
                }
                R(sb, yr9VarM);
                if (z3) {
                    sb.append(")");
                }
                sb.append(".");
            }
            sb.append("(");
            if (!cpk.p(j7gVar) || j7gVar.H().size() > 1) {
                int i2 = 0;
                for (vai vaiVar : cpk.o(j7gVar)) {
                    int i3 = i2 + 1;
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    va1 va1Var2 = k06Var.S;
                    wn9 wn9Var2 = k06.W[43];
                    va1Var2.getClass();
                    wn9Var2.getClass();
                    if (((Boolean) va1Var2.a).booleanValue()) {
                        yr9 yr9VarB = vaiVar.b();
                        yr9VarB.getClass();
                        sxbVarI = cpk.i(yr9VarB);
                    } else {
                        sxbVarI = null;
                    }
                    if (sxbVarI != null) {
                        sb.append(P(sxbVarI, false));
                        sb.append(": ");
                    }
                    vaiVar.getClass();
                    StringBuilder sb2 = new StringBuilder();
                    w44.R0(x44.W(vaiVar), sb2, ", ", null, null, new e06(this, i), 60);
                    sb.append(sb2.toString());
                    i2 = i3;
                }
            } else {
                sb.append("???");
            }
            sb.append(") ");
            int iOrdinal = t().ordinal();
            if (iOrdinal == 0) {
                strP = p("->");
            } else {
                if (iOrdinal != 1) {
                    mr9.b();
                    return;
                }
                strP = "&rarr;";
            }
            sb.append(strP);
            sb.append(" ");
            R(sb, cpk.n(j7gVar));
            if (z2) {
                sb.append(")");
            }
            if (zB0) {
                sb.append("?");
            }
        }
    }

    public final void T(e92 e92Var, StringBuilder sb) {
        if (r().contains(h06.OVERRIDE) && !e92Var.i().isEmpty()) {
            va1 va1Var = this.a.A;
            wn9 wn9Var = k06.W[25];
            va1Var.getClass();
            wn9Var.getClass();
            if (((emc) va1Var.a) != emc.F) {
                O("override", sb, true);
                if (v()) {
                    sb.append("/*");
                    sb.append(e92Var.i().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public final void U(ww7 ww7Var, String str, StringBuilder sb) {
        sb.append(J(str));
        xw7 xw7VarI = ww7Var.i();
        xw7VarI.getClass();
        String strP = p(yb5.D(xw7VarI.e()));
        if (strP.length() > 0) {
            sb.append(" ");
            sb.append(strP);
        }
    }

    public final void V(StringBuilder sb, lrb lrbVar) {
        lrb lrbVarJ = lrbVar.J();
        if (lrbVarJ != null) {
            V(sb, lrbVarJ);
            sb.append('.');
            sxb name = lrbVar.v().getName();
            name.getClass();
            sb.append(P(name, false));
        } else {
            u9i u9iVarP = lrbVar.v().p();
            u9iVarP.getClass();
            sb.append(b0(u9iVarP));
        }
        sb.append(a0(lrbVar.u()));
    }

    public final void W(e92 e92Var, StringBuilder sb) {
        l6e l6eVarS = e92Var.S();
        if (l6eVarS != null) {
            z(sb, l6eVarS, sc0.RECEIVER);
            yr9 type = ((mw9) l6eVarS).getType();
            type.getClass();
            sb.append(H(type));
            sb.append(".");
        }
    }

    public final void X(e92 e92Var, StringBuilder sb) {
        l6e l6eVarS;
        va1 va1Var = this.a.E;
        wn9 wn9Var = k06.W[29];
        va1Var.getClass();
        wn9Var.getClass();
        if (((Boolean) va1Var.a).booleanValue() && (l6eVarS = e92Var.S()) != null) {
            sb.append(" on ");
            yr9 type = ((mw9) l6eVarS).getType();
            type.getClass();
            sb.append(Z(type));
        }
    }

    public final String Z(yr9 yr9Var) {
        yr9Var.getClass();
        StringBuilder sb = new StringBuilder();
        va1 va1Var = this.a.x;
        wn9 wn9Var = k06.W[22];
        va1Var.getClass();
        wn9Var.getClass();
        R(sb, (yr9) ((bz7) va1Var.a).invoke(yr9Var));
        return sb.toString();
    }

    @Override // defpackage.i06
    public final void a() {
        this.a.a();
    }

    public final String a0(List list) throws IOException {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(p("<"));
        w44.R0(list, sb, ", ", null, null, new e06(this, 0), 60);
        sb.append(p(">"));
        return sb.toString();
    }

    @Override // defpackage.i06
    public final void b() {
        this.a.b();
    }

    public final String b0(u9i u9iVar) {
        u9iVar.getClass();
        xh3 xh3VarA = u9iVar.a();
        if (xh3VarA instanceof qai ? true : xh3VarA instanceof qqb ? true : xh3VarA instanceof q16) {
            xh3VarA.getClass();
            return nu6.f(xh3VarA) ? xh3VarA.p().toString() : q().b(xh3VarA, this);
        }
        if (xh3VarA == null) {
            return u9iVar instanceof qa9 ? ((qa9) u9iVar).g(f06.G) : u9iVar.toString();
        }
        sz6.k("Unexpected classifier: ", xh3VarA.getClass());
        return null;
    }

    @Override // defpackage.i06
    public final void c() {
        this.a.c();
    }

    public final void c0(qai qaiVar, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(p("<"));
        }
        if (v()) {
            sb.append("/*");
            sb.append(qaiVar.getIndex());
            sb.append("*/ ");
        }
        O("reified", sb, qaiVar.u());
        String strN = fsh.n(qaiVar.z());
        boolean z2 = true;
        O(strN, sb, strN.length() > 0);
        z(sb, qaiVar, null);
        Q(qaiVar, sb, z);
        int size = qaiVar.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            yr9 yr9Var = (yr9) qaiVar.getUpperBounds().iterator().next();
            if (yr9Var == null) {
                or9.a(141);
                throw null;
            }
            if (!or9.w(yr9Var) || !yr9Var.b0()) {
                sb.append(" : ");
                sb.append(Z(yr9Var));
            }
        } else if (z) {
            for (yr9 yr9Var2 : qaiVar.getUpperBounds()) {
                if (yr9Var2 == null) {
                    or9.a(141);
                    throw null;
                }
                if (!or9.w(yr9Var2) || !yr9Var2.b0()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(Z(yr9Var2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(p(">"));
        }
    }

    @Override // defpackage.i06
    public final void d(Set set) {
        set.getClass();
        this.a.d(set);
    }

    public final void d0(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c0((qai) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    @Override // defpackage.i06
    public final void e(LinkedHashSet linkedHashSet) {
        this.a.e(linkedHashSet);
    }

    public final void e0(List list, StringBuilder sb, boolean z) {
        va1 va1Var = this.a.v;
        wn9 wn9Var = k06.W[20];
        va1Var.getClass();
        wn9Var.getClass();
        if (((Boolean) va1Var.a).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(p("<"));
        d0(sb, list);
        sb.append(p(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override // defpackage.i06
    public final void f() {
        this.a.f();
    }

    public final void f0(iri iriVar, StringBuilder sb, boolean z) {
        if (z || !(iriVar instanceof eri)) {
            sb.append(J(iriVar.R() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // defpackage.i06
    public final void g(xrc xrcVar) {
        this.a.g(xrcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0(defpackage.eri r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g06.g0(eri, boolean, java.lang.StringBuilder, boolean):void");
    }

    @Override // defpackage.i06
    public final void h(zh3 zh3Var) {
        this.a.h(zh3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(java.util.Collection r8, boolean r9, java.lang.StringBuilder r10) {
        /*
            r7 = this;
            k06 r0 = r7.a
            va1 r0 = r0.D
            wn9[] r1 = defpackage.k06.W
            r2 = 28
            r1 = r1[r2]
            r0.getClass()
            r1.getClass()
            java.lang.Object r0 = r0.a
            xrc r0 = (defpackage.xrc) r0
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L27
            r9 = 2
            if (r0 != r9) goto L23
        L21:
            r9 = r1
            goto L2a
        L23:
            defpackage.mr9.b()
            return
        L27:
            if (r9 != 0) goto L21
        L29:
            r9 = r2
        L2a:
            int r0 = r8.size()
            d06 r3 = r7.u()
            r3.getClass()
            r10.getClass()
            java.lang.String r3 = "("
            r10.append(r3)
            java.util.Iterator r8 = r8.iterator()
            r3 = r1
        L42:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L6f
            int r4 = r3 + 1
            java.lang.Object r5 = r8.next()
            eri r5 = (defpackage.eri) r5
            d06 r6 = r7.u()
            r6.getClass()
            r5.getClass()
            r7.g0(r5, r9, r10, r1)
            d06 r5 = r7.u()
            r5.getClass()
            int r5 = r0 + (-1)
            if (r3 == r5) goto L6d
            java.lang.String r3 = ", "
            r10.append(r3)
        L6d:
            r3 = r4
            goto L42
        L6f:
            d06 r7 = r7.u()
            r7.getClass()
            java.lang.String r7 = ")"
            r10.append(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g06.h0(java.util.Collection, boolean, java.lang.StringBuilder):void");
    }

    @Override // defpackage.i06
    public final void i() {
        this.a.i();
    }

    public final boolean i0(ow5 ow5Var, StringBuilder sb) {
        if (!r().contains(h06.VISIBILITY)) {
            return false;
        }
        k06 k06Var = this.a;
        va1 va1Var = k06Var.n;
        wn9[] wn9VarArr = k06.W;
        wn9 wn9Var = wn9VarArr[12];
        va1Var.getClass();
        wn9Var.getClass();
        if (((Boolean) va1Var.a).booleanValue()) {
            ow5Var = q06.f(ow5Var.a.c());
        }
        va1 va1Var2 = k06Var.o;
        wn9 wn9Var2 = wn9VarArr[13];
        va1Var2.getClass();
        wn9Var2.getClass();
        if (!((Boolean) va1Var2.a).booleanValue() && ow5Var.equals(q06.j)) {
            return false;
        }
        sb.append(J(ow5Var.a.b()));
        sb.append(" ");
        return true;
    }

    @Override // defpackage.i06
    public final void j() {
        this.a.j();
    }

    public final void j0(StringBuilder sb, List list) {
        va1 va1Var = this.a.v;
        wn9 wn9Var = k06.W[20];
        va1Var.getClass();
        wn9Var.getClass();
        if (((Boolean) va1Var.a).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qai qaiVar = (qai) it.next();
            List upperBounds = qaiVar.getUpperBounds();
            upperBounds.getClass();
            for (yr9 yr9Var : w44.I0(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                sxb name = qaiVar.getName();
                name.getClass();
                sb2.append(P(name, false));
                sb2.append(" : ");
                yr9Var.getClass();
                sb2.append(Z(yr9Var));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(J("where"));
        sb.append(" ");
        w44.R0(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // defpackage.i06
    public final Set k() {
        return this.a.k();
    }

    @Override // defpackage.i06
    public final ec0 l() {
        return this.a.l();
    }

    @Override // defpackage.i06
    public final void m() {
        this.a.m();
    }

    @Override // defpackage.i06
    public final void n() {
        this.a.n();
    }

    public final String p(String str) {
        return t().a(str);
    }

    public final zh3 q() {
        va1 va1Var = this.a.b;
        k06.W[0].getClass();
        return (zh3) va1Var.a;
    }

    public final Set r() {
        va1 va1Var = this.a.e;
        wn9 wn9Var = k06.W[3];
        va1Var.getClass();
        wn9Var.getClass();
        return (Set) va1Var.a;
    }

    public final boolean s() {
        va1 va1Var = this.a.f;
        wn9 wn9Var = k06.W[4];
        va1Var.getClass();
        wn9Var.getClass();
        return ((Boolean) va1Var.a).booleanValue();
    }

    public final kge t() {
        va1 va1Var = this.a.C;
        wn9 wn9Var = k06.W[27];
        va1Var.getClass();
        wn9Var.getClass();
        return (kge) va1Var.a;
    }

    public final d06 u() {
        va1 va1Var = this.a.B;
        wn9 wn9Var = k06.W[26];
        va1Var.getClass();
        wn9Var.getClass();
        return (d06) va1Var.a;
    }

    public final boolean v() {
        va1 va1Var = this.a.j;
        wn9 wn9Var = k06.W[8];
        va1Var.getClass();
        wn9Var.getClass();
        return ((Boolean) va1Var.a).booleanValue();
    }

    public final String x(bo5 bo5Var) {
        bo5 bo5VarH;
        String str;
        bo5Var.getClass();
        StringBuilder sb = new StringBuilder();
        bo5Var.E(new n78(12, this), sb);
        k06 k06Var = this.a;
        va1 va1Var = k06Var.c;
        wn9[] wn9VarArr = k06.W;
        wn9VarArr[1].getClass();
        if (((Boolean) va1Var.a).booleanValue() && !(bo5Var instanceof wmc) && !(bo5Var instanceof d1a) && (bo5VarH = bo5Var.h()) != null && !(bo5VarH instanceof tqb)) {
            sb.append(" ");
            int iOrdinal = t().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    mr9.b();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            xw7 xw7VarG = m06.g(bo5VarH);
            xw7VarG.getClass();
            sb.append(xw7VarG.a.isEmpty() ? "root package" : p(yb5.D(xw7VarG.e())));
            va1 va1Var2 = k06Var.d;
            wn9VarArr[2].getClass();
            if (((Boolean) va1Var2.a).booleanValue() && (bo5VarH instanceof wmc) && (bo5Var instanceof do5)) {
                ((do5) bo5Var).d().getClass();
            }
        }
        return sb.toString();
    }

    public final String y(jc0 jc0Var, sc0 sc0Var) throws IOException {
        tg3 tg3VarN0;
        List listI;
        jc0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (sc0Var != null) {
            sb.append(sc0Var.a() + ':');
        }
        yr9 type = jc0Var.getType();
        sb.append(Z(type));
        k06 k06Var = this.a;
        if (x41.k(k06Var)) {
            Map mapF = jc0Var.f();
            va1 va1Var = k06Var.H;
            wn9 wn9Var = k06.W[32];
            va1Var.getClass();
            wn9Var.getClass();
            List list = null;
            qqb qqbVarD = ((Boolean) va1Var.a).booleanValue() ? o06.d(jc0Var) : null;
            if (qqbVarD != null && (tg3VarN0 = qqbVarD.n0()) != null && (listI = tg3VarN0.I()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listI) {
                    if (((eri) obj).P0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((eri) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = lm6.E;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                sxb sxbVar = (sxb) obj2;
                sxbVar.getClass();
                if (!mapF.containsKey(sxbVar)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(x44.y(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((sxb) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapF.entrySet();
            ArrayList arrayList5 = new ArrayList(x44.y(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                sxb sxbVar2 = (sxb) entry.getKey();
                il4 il4Var = (il4) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sxbVar2.b());
                sb2.append(" = ");
                sb2.append(!list.contains(sxbVar2) ? C(il4Var) : "...");
                arrayList5.add(sb2.toString());
            }
            List listH1 = w44.h1(w44.a1(arrayList4, arrayList5));
            if (x41.l(k06Var) || !listH1.isEmpty()) {
                w44.R0(listH1, sb, ", ", "(", ")", null, 112);
            }
        }
        if (v() && (ttj.j(type) || (type.O().a() instanceof s6c))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void z(StringBuilder sb, ub0 ub0Var, sc0 sc0Var) {
        Set setK;
        if (r().contains(h06.ANNOTATIONS)) {
            boolean z = ub0Var instanceof yr9;
            k06 k06Var = this.a;
            if (z) {
                setK = k06Var.k();
            } else {
                va1 va1Var = k06Var.J;
                wn9 wn9Var = k06.W[34];
                va1Var.getClass();
                wn9Var.getClass();
                setK = (Set) va1Var.a;
            }
            va1 va1Var2 = k06Var.L;
            wn9 wn9Var2 = k06.W[36];
            va1Var2.getClass();
            wn9Var2.getClass();
            bz7 bz7Var = (bz7) va1Var2.a;
            for (jc0 jc0Var : ub0Var.getAnnotations()) {
                if (!w44.G0(setK, jc0Var.e()) && !x44.r(jc0Var.e(), okg.r) && (bz7Var == null || ((Boolean) bz7Var.invoke(jc0Var)).booleanValue())) {
                    sb.append(y(jc0Var, sc0Var));
                    va1 va1Var3 = k06Var.I;
                    wn9 wn9Var3 = k06.W[33];
                    va1Var3.getClass();
                    wn9Var3.getClass();
                    if (((Boolean) va1Var3.a).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }
}
