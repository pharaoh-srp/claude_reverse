package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wjf {
    public final hqb a;
    public final boolean b;
    public final av9 c;
    public final qjf d;
    public wjf e;
    public final int f;

    public wjf(hqb hqbVar, boolean z, av9 av9Var, qjf qjfVar) {
        this.a = hqbVar;
        this.b = z;
        this.c = av9Var;
        this.d = qjfVar;
        this.f = av9Var.F;
    }

    public static /* synthetic */ List j(int i, wjf wjfVar) {
        return wjfVar.i((i & 1) != 0 ? !wjfVar.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [hqb] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [hqb] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final l9e a(m5c m5cVar) {
        ?? J;
        wjf wjfVarL = l();
        if (wjfVarL == null) {
            return l9e.e;
        }
        hqb hqbVar = (hqb) wjfVarL.c.k0.K;
        if ((hqbVar.H & 8) != 0) {
            loop0: while (hqbVar != null) {
                if ((hqbVar.G & 8) != 0) {
                    J = hqbVar;
                    ?? wwbVar = 0;
                    while (J != 0) {
                        if (J instanceof ujf) {
                            if (((ujf) J).k()) {
                                break loop0;
                            }
                        } else if ((J.G & 8) != 0 && (J instanceof qw5)) {
                            hqb hqbVar2 = ((qw5) J).T;
                            int i = 0;
                            J = J;
                            wwbVar = wwbVar;
                            while (hqbVar2 != null) {
                                if ((hqbVar2.G & 8) != 0) {
                                    i++;
                                    wwbVar = wwbVar;
                                    if (i == 1) {
                                        J = hqbVar2;
                                    } else {
                                        if (wwbVar == 0) {
                                            wwbVar = new wwb(0, new hqb[16]);
                                        }
                                        if (J != 0) {
                                            wwbVar.b(J);
                                            J = 0;
                                        }
                                        wwbVar.b(hqbVar2);
                                    }
                                }
                                hqbVar2 = hqbVar2.J;
                                J = J;
                                wwbVar = wwbVar;
                            }
                            if (i == 1) {
                            }
                        }
                        J = yfd.j(wwbVar);
                    }
                }
                if ((hqbVar.H & 8) == 0) {
                    break;
                }
                hqbVar = hqbVar.J;
            }
            J = 0;
        } else {
            J = 0;
        }
        ujf ujfVar = (ujf) J;
        m5c m5cVarU = ujfVar != null ? yfd.U(ujfVar, 8) : null;
        return m5cVarU == null ? wjfVarL.a(m5cVar) : m5cVarU.J(m5cVar, true);
    }

    public final wjf b(vue vueVar, bz7 bz7Var) {
        qjf qjfVar = new qjf();
        qjfVar.G = false;
        qjfVar.H = false;
        bz7Var.invoke(qjfVar);
        wjf wjfVar = new wjf(new vjf(bz7Var), false, new av9(true, this.f + (vueVar != null ? 1000000000 : 2000000000)), qjfVar);
        wjfVar.e = this;
        return wjfVar;
    }

    public final void c(av9 av9Var, ArrayList arrayList) {
        wwb wwbVarL = av9Var.L();
        Object[] objArr = wwbVarL.E;
        int i = wwbVarL.G;
        for (int i2 = 0; i2 < i; i2++) {
            av9 av9Var2 = (av9) objArr[i2];
            if (av9Var2.X() && !av9Var2.u0) {
                if (av9Var2.k0.i(8)) {
                    arrayList.add(fd9.r(av9Var2, this.b));
                } else {
                    c(av9Var2, arrayList);
                }
            }
        }
    }

    public final m5c d() {
        if (!o()) {
            ujf ujfVarF = f();
            return ujfVarF != null ? yfd.U(ujfVarF, 8) : (z39) this.c.k0.H;
        }
        wjf wjfVarL = l();
        if (wjfVarL != null) {
            return wjfVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            wjf wjfVar = (wjf) arrayList.get(size2);
            if (wjfVar.p()) {
                arrayList2.add(wjfVar);
            } else if (!wjfVar.d.H) {
                wjfVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [hqb] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [hqb] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final ujf f() {
        ?? J;
        boolean z;
        boolean z2 = this.d.G;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        av9 av9Var = this.c;
        if (z2) {
            hqb hqbVar = (hqb) av9Var.k0.K;
            if ((hqbVar.H & 8) != 0) {
                J = 0;
                while (hqbVar != null) {
                    if ((hqbVar.G & 8) != 0) {
                        hqb hqbVarJ = hqbVar;
                        wwb wwbVar = null;
                        while (hqbVarJ != null) {
                            if (hqbVarJ instanceof ujf) {
                                ujf ujfVar = (ujf) hqbVarJ;
                                ?? r0 = J;
                                if (ujfVar.k()) {
                                    r0 = J;
                                    if (ujfVar.Z0()) {
                                        return ujfVar;
                                    }
                                    if (J == 0) {
                                        r0 = ujfVar;
                                    }
                                }
                                z = false;
                                J = r0;
                            } else {
                                z = true;
                                J = J;
                            }
                            if (z && (hqbVarJ.G & 8) != 0 && (hqbVarJ instanceof qw5)) {
                                int i = 0;
                                for (hqb hqbVar2 = ((qw5) hqbVarJ).T; hqbVar2 != null; hqbVar2 = hqbVar2.J) {
                                    if ((hqbVar2.G & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            hqbVarJ = hqbVar2;
                                        } else {
                                            if (wwbVar == null) {
                                                wwbVar = new wwb(0, new hqb[16]);
                                            }
                                            if (hqbVarJ != null) {
                                                wwbVar.b(hqbVarJ);
                                                hqbVarJ = null;
                                            }
                                            wwbVar.b(hqbVar2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            hqbVarJ = yfd.j(wwbVar);
                        }
                    }
                    if ((hqbVar.H & 8) == 0) {
                        break;
                    }
                    hqbVar = hqbVar.J;
                    J = J;
                }
                r4 = J;
            }
        } else {
            hqb hqbVar3 = (hqb) av9Var.k0.K;
            if ((hqbVar3.H & 8) != 0) {
                loop3: while (hqbVar3 != null) {
                    if ((hqbVar3.G & 8) != 0) {
                        J = hqbVar3;
                        ?? wwbVar2 = 0;
                        while (J != 0) {
                            if (J instanceof ujf) {
                                if (((ujf) J).k()) {
                                    r4 = J;
                                }
                            } else if ((J.G & 8) != 0 && (J instanceof qw5)) {
                                hqb hqbVar4 = ((qw5) J).T;
                                int i2 = 0;
                                J = J;
                                wwbVar2 = wwbVar2;
                                while (hqbVar4 != null) {
                                    if ((hqbVar4.G & 8) != 0) {
                                        i2++;
                                        wwbVar2 = wwbVar2;
                                        if (i2 == 1) {
                                            J = hqbVar4;
                                        } else {
                                            if (wwbVar2 == 0) {
                                                wwbVar2 = new wwb(0, new hqb[16]);
                                            }
                                            if (J != 0) {
                                                wwbVar2.b(J);
                                                J = 0;
                                            }
                                            wwbVar2.b(hqbVar4);
                                        }
                                    }
                                    hqbVar4 = hqbVar4.J;
                                    J = J;
                                    wwbVar2 = wwbVar2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = yfd.j(wwbVar2);
                        }
                    }
                    if ((hqbVar3.H & 8) == 0) {
                        break;
                    }
                    hqbVar3 = hqbVar3.J;
                }
            }
        }
        return (ujf) r4;
    }

    public final l9e g() {
        m5c m5cVarD = d();
        if (m5cVarD != null) {
            if (!m5cVarD.h1().R) {
                m5cVarD = null;
            }
            if (m5cVarD != null) {
                return nai.A(m5cVarD).J(m5cVarD, true);
            }
        }
        return l9e.e;
    }

    public final l9e h() {
        m5c m5cVarD = d();
        if (m5cVarD != null) {
            if (!m5cVarD.h1().R) {
                m5cVarD = null;
            }
            if (m5cVarD != null) {
                return nai.p(m5cVarD, true);
            }
        }
        return l9e.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.H) {
            return lm6.E;
        }
        ArrayList arrayList = new ArrayList();
        if (!p()) {
            return s(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final qjf k() {
        boolean zP = p();
        qjf qjfVar = this.d;
        if (!zP) {
            return qjfVar;
        }
        qjf qjfVarE = qjfVar.e();
        r(new ArrayList(), qjfVarE);
        return qjfVarE;
    }

    public final wjf l() {
        av9 av9VarG;
        wjf wjfVar = this.e;
        if (wjfVar != null) {
            return wjfVar;
        }
        av9 av9Var = this.c;
        boolean z = this.b;
        if (z) {
            av9VarG = av9Var.G();
            while (av9VarG != null) {
                qjf qjfVarI = av9VarG.I();
                if (qjfVarI != null && qjfVarI.G) {
                    break;
                }
                av9VarG = av9VarG.G();
            }
            av9VarG = null;
        } else {
            av9VarG = null;
        }
        if (av9VarG == null) {
            av9 av9VarG2 = av9Var.G();
            while (true) {
                if (av9VarG2 == null) {
                    av9VarG = null;
                    break;
                }
                if (av9VarG2.k0.i(8)) {
                    av9VarG = av9VarG2;
                    break;
                }
                av9VarG2 = av9VarG2.G();
            }
        }
        if (av9VarG == null) {
            return null;
        }
        return fd9.r(av9VarG, z);
    }

    public final l9e m() {
        Object objF = f();
        if (objF == null) {
            return ((z39) this.c.k0.H).D1();
        }
        hqb hqbVar = ((hqb) objF).E;
        Object objG = this.d.E.g(ojf.b);
        if (objG == null) {
            objG = null;
        }
        return dgj.D(hqbVar, objG != null, true);
    }

    public final qjf n() {
        return this.d;
    }

    public final boolean o() {
        return this.e != null;
    }

    public final boolean p() {
        return this.b && this.d.G;
    }

    public final boolean q() {
        if (o() || !j(4, this).isEmpty()) {
            return false;
        }
        av9 av9VarG = this.c.G();
        while (true) {
            if (av9VarG == null) {
                av9VarG = null;
                break;
            }
            qjf qjfVarI = av9VarG.I();
            if (qjfVarI != null && qjfVarI.G) {
                break;
            }
            av9VarG = av9VarG.G();
        }
        return av9VarG == null;
    }

    public final void r(ArrayList arrayList, qjf qjfVar) {
        if (this.d.H) {
            return;
        }
        s(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            wjf wjfVar = (wjf) arrayList.get(size2);
            if (!wjfVar.p()) {
                qjfVar.h(wjfVar.d);
                wjfVar.r(arrayList, qjfVar);
            }
        }
    }

    public final List s(ArrayList arrayList, boolean z) {
        if (o()) {
            return lm6.E;
        }
        c(this.c, arrayList);
        if (z) {
            qjf qjfVar = this.d;
            ewb ewbVar = qjfVar.E;
            Object objG = ewbVar.g(akf.z);
            if (objG == null) {
                objG = null;
            }
            vue vueVar = (vue) objG;
            if (vueVar != null && qjfVar.G && !arrayList.isEmpty()) {
                arrayList.add(b(vueVar, new e0(27, vueVar)));
            }
            dkf dkfVar = akf.a;
            if (ewbVar.c(dkfVar) && !arrayList.isEmpty() && qjfVar.G) {
                Object objG2 = ewbVar.g(dkfVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) w44.N0(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new e0(28, str)));
                }
            }
        }
        return arrayList;
    }
}
