package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface mqb extends nw5 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [hqb] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [hqb] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [mqb, nw5] */
    default Object b0(tk5 tk5Var) {
        g5c g5cVar;
        hqb hqbVar = (hqb) this;
        if (!hqbVar.E.R) {
            b39.a("ModifierLocal accessed from an unattached node");
        }
        if (!hqbVar.E.R) {
            b39.c("visitAncestors called on an unattached node");
        }
        hqb hqbVar2 = hqbVar.E.I;
        av9 av9VarW = yfd.W(this);
        while (av9VarW != null) {
            if ((((hqb) av9VarW.k0.K).H & 32) != 0) {
                while (hqbVar2 != null) {
                    if ((hqbVar2.G & 32) != 0) {
                        ?? J = hqbVar2;
                        ?? wwbVar = 0;
                        while (J != 0) {
                            if (J instanceof mqb) {
                                mqb mqbVar = (mqb) J;
                                if (mqbVar.j0().q(tk5Var)) {
                                    return mqbVar.j0().x(tk5Var);
                                }
                            } else if ((J.G & 32) != 0 && (J instanceof qw5)) {
                                hqb hqbVar3 = ((qw5) J).T;
                                int i = 0;
                                J = J;
                                wwbVar = wwbVar;
                                while (hqbVar3 != null) {
                                    if ((hqbVar3.G & 32) != 0) {
                                        i++;
                                        wwbVar = wwbVar;
                                        if (i == 1) {
                                            J = hqbVar3;
                                        } else {
                                            if (wwbVar == 0) {
                                                wwbVar = new wwb(0, new hqb[16]);
                                            }
                                            if (J != 0) {
                                                wwbVar.b(J);
                                                J = 0;
                                            }
                                            wwbVar.b(hqbVar3);
                                        }
                                    }
                                    hqbVar3 = hqbVar3.J;
                                    J = J;
                                    wwbVar = wwbVar;
                                }
                                if (i == 1) {
                                }
                            }
                            J = yfd.j(wwbVar);
                        }
                    }
                    hqbVar2 = hqbVar2.I;
                }
            }
            av9VarW = av9VarW.G();
            hqbVar2 = (av9VarW == null || (g5cVar = av9VarW.k0) == null) ? null : (j4h) g5cVar.J;
        }
        return ((zy7) tk5Var.F).a();
    }

    default kxk j0() {
        return om6.l;
    }
}
