package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d5c extends w5c {
    public final hqb c;
    public m5c f;
    public t7d g;
    public boolean h;
    public final yja d = new yja();
    public final zka e = new zka(2);
    public boolean i = true;
    public boolean j = true;

    public d5c(hqb hqbVar) {
        this.c = hqbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0203  */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [hqb] */
    /* JADX WARN: Type inference failed for: r5v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [hqb] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [wwb] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [wwb] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    @Override // defpackage.w5c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.zka r44, defpackage.cu9 r45, defpackage.i99 r46, boolean r47) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d5c.a(zka, cu9, i99, boolean):boolean");
    }

    @Override // defpackage.w5c
    public final void b(i99 i99Var) {
        super.b(i99Var);
        t7d t7dVar = this.g;
        if (t7dVar == null) {
            return;
        }
        this.h = this.i;
        List list = t7dVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            z7d z7dVar = (z7d) list.get(i);
            boolean zF = z7dVar.f();
            boolean zD = i99Var.d(z7dVar.d());
            boolean z = this.i;
            if ((!zF && !zD) || (!zF && !z)) {
                this.d.i(z7dVar.d());
            }
        }
        this.i = false;
        this.j = t7dVar.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [wwb] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [wwb] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [hqb] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [hqb] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        wwb wwbVar = this.a;
        Object[] objArr = wwbVar.E;
        int i = wwbVar.G;
        for (int i2 = 0; i2 < i; i2++) {
            ((d5c) objArr[i2]).c();
        }
        ?? J = this.c;
        ?? wwbVar2 = 0;
        while (J != 0) {
            if (J instanceof d8d) {
                ((d8d) J).R();
            } else if ((J.G & 16) != 0 && (J instanceof qw5)) {
                hqb hqbVar = ((qw5) J).T;
                int i3 = 0;
                wwbVar2 = wwbVar2;
                J = J;
                while (hqbVar != null) {
                    if ((hqbVar.G & 16) != 0) {
                        i3++;
                        wwbVar2 = wwbVar2;
                        if (i3 == 1) {
                            J = hqbVar;
                        } else {
                            if (wwbVar2 == 0) {
                                wwbVar2 = new wwb(0, new hqb[16]);
                            }
                            if (J != 0) {
                                wwbVar2.b(J);
                                J = 0;
                            }
                            wwbVar2.b(hqbVar);
                        }
                    }
                    hqbVar = hqbVar.J;
                    wwbVar2 = wwbVar2;
                    J = J;
                }
                if (i3 == 1) {
                }
            }
            J = yfd.j(wwbVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [hqb] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [wwb] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [wwb] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(i99 i99Var) {
        av9 av9Var;
        zka zkaVar = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (zkaVar.h() != 0) {
            hqb hqbVar = this.c;
            if (hqbVar.R) {
                m5c m5cVar = hqbVar.L;
                if ((m5cVar == null || (av9Var = m5cVar.S) == null) ? false : av9Var.Y()) {
                    t7d t7dVar = this.g;
                    t7dVar.getClass();
                    m5c m5cVar2 = this.f;
                    m5cVar2.getClass();
                    long j = m5cVar2.G;
                    ?? J = hqbVar;
                    ?? wwbVar = 0;
                    while (J != 0) {
                        if (J instanceof d8d) {
                            ((d8d) J).C(t7dVar, u7d.G, j);
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
                    if (hqbVar.R) {
                        wwb wwbVar2 = this.a;
                        Object[] objArr = wwbVar2.E;
                        int i2 = wwbVar2.G;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((d5c) objArr[i3]).d(i99Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(i99Var);
        zkaVar.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [hqb] */
    /* JADX WARN: Type inference failed for: r0v3, types: [hqb] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [hqb] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [wwb] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [wwb] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [hqb] */
    /* JADX WARN: Type inference failed for: r6v10, types: [hqb] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [wwb] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [wwb] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(i99 i99Var, boolean z) {
        av9 av9Var;
        if (this.e.h() == 0) {
            return false;
        }
        ?? J = this.c;
        if (J.R) {
            m5c m5cVar = J.L;
            if ((m5cVar == null || (av9Var = m5cVar.S) == null) ? false : av9Var.Y()) {
                t7d t7dVar = this.g;
                t7dVar.getClass();
                m5c m5cVar2 = this.f;
                m5cVar2.getClass();
                long j = m5cVar2.G;
                ?? J2 = J;
                ?? wwbVar = 0;
                while (J2 != 0) {
                    if (J2 instanceof d8d) {
                        ((d8d) J2).C(t7dVar, u7d.E, j);
                    } else if ((J2.G & 16) != 0 && (J2 instanceof qw5)) {
                        hqb hqbVar = ((qw5) J2).T;
                        int i = 0;
                        J2 = J2;
                        wwbVar = wwbVar;
                        while (hqbVar != null) {
                            if ((hqbVar.G & 16) != 0) {
                                i++;
                                wwbVar = wwbVar;
                                if (i == 1) {
                                    J2 = hqbVar;
                                } else {
                                    if (wwbVar == 0) {
                                        wwbVar = new wwb(0, new hqb[16]);
                                    }
                                    if (J2 != 0) {
                                        wwbVar.b(J2);
                                        J2 = 0;
                                    }
                                    wwbVar.b(hqbVar);
                                }
                            }
                            hqbVar = hqbVar.J;
                            J2 = J2;
                            wwbVar = wwbVar;
                        }
                        if (i == 1) {
                        }
                    }
                    J2 = yfd.j(wwbVar);
                }
                if (J.R) {
                    wwb wwbVar2 = this.a;
                    Object[] objArr = wwbVar2.E;
                    int i2 = wwbVar2.G;
                    for (int i3 = 0; i3 < i2; i3++) {
                        d5c d5cVar = (d5c) objArr[i3];
                        this.f.getClass();
                        d5cVar.e(i99Var, z);
                    }
                }
                if (J.R) {
                    ?? wwbVar3 = 0;
                    while (J != 0) {
                        if (J instanceof d8d) {
                            ((d8d) J).C(t7dVar, u7d.F, j);
                        } else if ((J.G & 16) != 0 && (J instanceof qw5)) {
                            hqb hqbVar2 = ((qw5) J).T;
                            int i4 = 0;
                            J = J;
                            wwbVar3 = wwbVar3;
                            while (hqbVar2 != null) {
                                if ((hqbVar2.G & 16) != 0) {
                                    i4++;
                                    wwbVar3 = wwbVar3;
                                    if (i4 == 1) {
                                        J = hqbVar2;
                                    } else {
                                        if (wwbVar3 == 0) {
                                            wwbVar3 = new wwb(0, new hqb[16]);
                                        }
                                        if (J != 0) {
                                            wwbVar3.b(J);
                                            J = 0;
                                        }
                                        wwbVar3.b(hqbVar2);
                                    }
                                }
                                hqbVar2 = hqbVar2.J;
                                J = J;
                                wwbVar3 = wwbVar3;
                            }
                            if (i4 == 1) {
                            }
                        }
                        J = yfd.j(wwbVar3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, qvb qvbVar) {
        yja yjaVar = this.d;
        if (yjaVar.d(j) && qvbVar.g(this) < 0) {
            yjaVar.i(j);
            this.e.g(j);
        }
        wwb wwbVar = this.a;
        Object[] objArr = wwbVar.E;
        int i = wwbVar.G;
        for (int i2 = 0; i2 < i; i2++) {
            ((d5c) objArr[i2]).f(j, qvbVar);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
