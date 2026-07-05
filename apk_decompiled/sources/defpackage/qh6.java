package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qh6 implements o5b {
    public final boolean a;
    public final boolean b;

    public qh6(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, long j) {
        long jA;
        long jA2;
        long jA3;
        nm6 nm6Var = nm6.E;
        boolean z = this.b;
        String str = "Collection contains no element matching the predicate.";
        int i = 0;
        boolean z2 = this.a;
        if (!z2 && !z) {
            int size = list.size();
            while (i < size) {
                h5b h5bVar = (h5b) list.get(i);
                if (x44.r(zni.B(h5bVar), "text")) {
                    c3d c3dVarU = h5bVar.u(rl4.a(0, 0, 0, 0, 14, j));
                    int iH = rl4.d(j) ? rl4.h(j) : c3dVarU.E;
                    int iMax = Math.max(rl4.i(j), c3dVarU.F);
                    return q5bVar.U(iH, iMax, nm6Var, new r6(iMax, 2, c3dVarU));
                }
                i++;
            }
            throw ij0.q("Collection contains no element matching the predicate.");
        }
        if (!z) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                h5b h5bVar2 = (h5b) list.get(i2);
                if (x44.r(zni.B(h5bVar2), "leadingIcon")) {
                    c3d c3dVarU2 = h5bVar2.u(rl4.a(0, 0, 0, 0, 14, j));
                    List list2 = list;
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        h5b h5bVar3 = (h5b) list.get(i3);
                        if (x44.r(zni.B(h5bVar3), "ghostLeadingIcon")) {
                            c3d c3dVarU3 = h5bVar3.u(rl4.a(0, 0, 0, 0, 14, j));
                            if (rl4.d(j)) {
                                int iH2 = rl4.h(j) - c3dVarU3.E;
                                if (iH2 < 0) {
                                    iH2 = 0;
                                }
                                if (iH2 < 0) {
                                    d39.a("width must be >= 0");
                                }
                                jA3 = sl4.h(iH2, iH2, 0, Integer.MAX_VALUE);
                            } else {
                                jA3 = rl4.a(0, 0, 0, 0, 14, j);
                            }
                            int size4 = list2.size();
                            while (i < size4) {
                                h5b h5bVar4 = (h5b) list.get(i);
                                if (x44.r(zni.B(h5bVar4), "text")) {
                                    c3d c3dVarU4 = h5bVar4.u(jA3);
                                    int iH3 = rl4.d(j) ? rl4.h(j) : c3dVarU3.E + c3dVarU4.E;
                                    int iMax2 = Math.max(rl4.i(j), Math.max(c3dVarU2.F, c3dVarU4.F));
                                    return q5bVar.U(iH3, iMax2, nm6Var, new tr1(c3dVarU2, iMax2, c3dVarU4));
                                }
                                i++;
                            }
                            throw ij0.q("Collection contains no element matching the predicate.");
                        }
                    }
                    throw ij0.q("Collection contains no element matching the predicate.");
                }
            }
            throw ij0.q("Collection contains no element matching the predicate.");
        }
        if (!z2) {
            int size5 = list.size();
            for (int i4 = 0; i4 < size5; i4++) {
                h5b h5bVar5 = (h5b) list.get(i4);
                if (x44.r(zni.B(h5bVar5), "trailingIcon")) {
                    c3d c3dVarU5 = h5bVar5.u(rl4.a(0, 0, 0, 0, 14, j));
                    if (rl4.d(j)) {
                        int iH4 = rl4.h(j) - c3dVarU5.E;
                        if (iH4 < 0) {
                            iH4 = 0;
                        }
                        if (iH4 < 0) {
                            d39.a("width must be >= 0");
                        }
                        jA2 = sl4.h(iH4, iH4, 0, Integer.MAX_VALUE);
                    } else {
                        jA2 = rl4.a(0, 0, 0, 0, 14, j);
                    }
                    int size6 = list.size();
                    while (i < size6) {
                        h5b h5bVar6 = (h5b) list.get(i);
                        if (x44.r(zni.B(h5bVar6), "text")) {
                            c3d c3dVarU6 = h5bVar6.u(jA2);
                            int iH5 = rl4.d(j) ? rl4.h(j) : c3dVarU5.E + c3dVarU6.E;
                            int iMax3 = Math.max(rl4.i(j), Math.max(c3dVarU5.F, c3dVarU6.F));
                            return q5bVar.U(iH5, iMax3, nm6Var, new oh6(c3dVarU6, iMax3, c3dVarU5, iH5));
                        }
                        i++;
                    }
                    throw ij0.q("Collection contains no element matching the predicate.");
                }
            }
            throw ij0.q("Collection contains no element matching the predicate.");
        }
        int size7 = list.size();
        int i5 = 0;
        while (i5 < size7) {
            h5b h5bVar7 = (h5b) list.get(i5);
            if (x44.r(zni.B(h5bVar7), "leadingIcon")) {
                String str2 = str;
                final c3d c3dVarU7 = h5bVar7.u(rl4.a(0, 0, 0, 0, 14, j));
                List list3 = list;
                int size8 = list3.size();
                for (int i6 = 0; i6 < size8; i6++) {
                    h5b h5bVar8 = (h5b) list.get(i6);
                    if (x44.r(zni.B(h5bVar8), "trailingIcon")) {
                        final c3d c3dVarU8 = h5bVar8.u(rl4.a(0, 0, 0, 0, 14, j));
                        int size9 = list3.size();
                        for (int i7 = 0; i7 < size9; i7++) {
                            h5b h5bVar9 = (h5b) list.get(i7);
                            if (x44.r(zni.B(h5bVar9), "ghostLeadingIcon")) {
                                c3d c3dVarU9 = h5bVar9.u(rl4.a(0, 0, 0, 0, 14, j));
                                if (rl4.d(j)) {
                                    int iH6 = (rl4.h(j) - c3dVarU9.E) - c3dVarU8.E;
                                    if (iH6 < 0) {
                                        iH6 = 0;
                                    }
                                    if (iH6 < 0) {
                                        d39.a("width must be >= 0");
                                    }
                                    jA = sl4.h(iH6, iH6, 0, Integer.MAX_VALUE);
                                } else {
                                    jA = rl4.a(0, 0, 0, 0, 14, j);
                                }
                                int size10 = list3.size();
                                while (i < size10) {
                                    h5b h5bVar10 = (h5b) list.get(i);
                                    if (x44.r(zni.B(h5bVar10), "text")) {
                                        final c3d c3dVarU10 = h5bVar10.u(jA);
                                        final int iH7 = rl4.d(j) ? rl4.h(j) : c3dVarU9.E + c3dVarU10.E + c3dVarU8.E;
                                        final int iMax4 = Math.max(rl4.i(j), Math.max(c3dVarU7.F, Math.max(c3dVarU10.F, c3dVarU8.F)));
                                        return q5bVar.U(iH7, iMax4, nm6Var, new bz7() { // from class: ph6
                                            @Override // defpackage.bz7
                                            public final Object invoke(Object obj) {
                                                b3d b3dVar = (b3d) obj;
                                                c3d c3dVar = c3dVarU7;
                                                int i8 = c3dVar.F;
                                                int i9 = iMax4;
                                                b3d.k(b3dVar, c3dVar, 0, ij0.c(i9 - i8, 2.0f, 1.0f));
                                                int i10 = c3dVar.E;
                                                b3d.k(b3dVar, c3dVarU10, i10, ij0.c(i9 - r1.F, 2.0f, 1.0f));
                                                c3d c3dVar2 = c3dVarU8;
                                                b3d.k(b3dVar, c3dVar2, iH7 - c3dVar2.E, ij0.c(i9 - c3dVar2.F, 2.0f, 1.0f));
                                                return iei.a;
                                            }
                                        });
                                    }
                                    i++;
                                }
                                throw ij0.q(str2);
                            }
                        }
                        throw ij0.q(str2);
                    }
                }
                throw ij0.q(str2);
            }
            i5++;
            str = str;
        }
        throw ij0.q(str);
    }
}
