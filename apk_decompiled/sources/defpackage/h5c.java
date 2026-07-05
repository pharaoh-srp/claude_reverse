package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h5c implements i5c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r8v0, types: [hqb] */
    /* JADX WARN: Type inference failed for: r8v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [hqb] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.i5c
    public final boolean g(hqb hqbVar) {
        ?? wwbVar = 0;
        while (hqbVar != 0) {
            if (hqbVar instanceof d8d) {
                ((d8d) hqbVar).Z();
            } else if ((hqbVar.G & 16) != 0 && (hqbVar instanceof qw5)) {
                hqb hqbVar2 = ((qw5) hqbVar).T;
                int i = 0;
                wwbVar = wwbVar;
                hqbVar = hqbVar;
                while (hqbVar2 != null) {
                    if ((hqbVar2.G & 16) != 0) {
                        i++;
                        wwbVar = wwbVar;
                        if (i == 1) {
                            hqbVar = hqbVar2;
                        } else {
                            if (wwbVar == 0) {
                                wwbVar = new wwb(0, new hqb[16]);
                            }
                            if (hqbVar != 0) {
                                wwbVar.b(hqbVar);
                                hqbVar = 0;
                            }
                            wwbVar.b(hqbVar2);
                        }
                    }
                    hqbVar2 = hqbVar2.J;
                    wwbVar = wwbVar;
                    hqbVar = hqbVar;
                }
                if (i == 1) {
                }
            }
            hqbVar = yfd.j(wwbVar);
        }
        return false;
    }

    @Override // defpackage.i5c
    public final int h() {
        return 16;
    }

    @Override // defpackage.i5c
    public final void l(av9 av9Var, long j, dn8 dn8Var, int i, boolean z) {
        av9Var.N(j, dn8Var, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [hqb] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
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
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.i5c
    public final boolean o(dn8 dn8Var, av9 av9Var) {
        m5c m5cVar = (m5c) av9Var.k0.I;
        m5cVar.getClass();
        hqb hqbVarJ1 = m5cVar.j1(s5c.g(16));
        if (hqbVarJ1 != null && hqbVarJ1.R) {
            if (!hqbVarJ1.E.R) {
                b39.c("visitLocalDescendants called on an unattached node");
            }
            hqb hqbVar = hqbVarJ1.E;
            if ((hqbVar.H & 16) != 0) {
                while (hqbVar != null) {
                    if ((hqbVar.G & 16) != 0) {
                        ?? J = hqbVar;
                        ?? wwbVar = 0;
                        while (J != 0) {
                            if (J instanceof d8d) {
                                if (((d8d) J).R0()) {
                                    dn8Var.G = dn8Var.E.b - 1;
                                    return true;
                                }
                            } else if ((J.G & 16) != 0 && (J instanceof qw5)) {
                                hqb hqbVar2 = ((qw5) J).T;
                                int i = 0;
                                J = J;
                                wwbVar = wwbVar;
                                while (hqbVar2 != null) {
                                    if ((hqbVar2.G & 16) != 0) {
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
                    hqbVar = hqbVar.J;
                }
            }
        }
        return false;
    }

    @Override // defpackage.i5c
    public final boolean p(av9 av9Var) {
        return true;
    }
}
