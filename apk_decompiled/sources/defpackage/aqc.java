package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class aqc {
    public static final xe4 a = new xe4(new oob(22));

    public static final void a(noh nohVar, wp6 wp6Var, d77 d77Var, kl7 kl7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        wp6 wp6Var2;
        d77 d77Var2;
        kl7 kl7Var2;
        wp6 wp6VarA;
        d77 d77VarA;
        d77 d77Var3;
        vo1 vo1Var = lja.T;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-983746378);
        final int i2 = 4;
        final int i3 = 2;
        int i4 = i | (e18Var.f(nohVar) ? 4 : 2) | (e18Var.f(fqb.E) ? 32 : 16) | 9344 | (e18Var.h(ta4Var) ? 131072 : 65536);
        final int i5 = 0;
        final int i6 = 1;
        if (e18Var.Q(i4 & 1, (74899 & i4) != 74898)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                final moh mohVarG = nohVar.E.g();
                final ooh oohVar = nohVar.F;
                dqc dqcVarA = mohVarG.b(oohVar).a();
                if (x44.r(dqcVarA, zp3.N)) {
                    rz5 rz5Var = gqc.c;
                    final int i7 = 5;
                    bz7 bz7Var = new bz7() { // from class: hqc
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            int iP;
                            int i8 = i7;
                            int i9 = 0;
                            fqc fqcVar = null;
                            moh mohVar = mohVarG;
                            ((Integer) obj).getClass();
                            switch (i8) {
                                case 0:
                                    iP = x44.P(mohVar);
                                    break;
                                case 1:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 2:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 3:
                                    int i10 = mohVar.h - 1;
                                    while (true) {
                                        if (-1 < i10) {
                                            mohVar.c(i10);
                                            fqc fqcVarA = mohVar.a(i10);
                                            if (x44.r(fqcVarA.a(), zp3.R)) {
                                                i9 = -(fqcVar != null ? (int) (fqcVar.c >> 32) : ((int) (fqcVarA.c >> 32)) + ((int) (fqcVarA.b >> 32)));
                                            } else {
                                                if (fqcVarA.a().b == 3 || fqcVarA.a().b == 1) {
                                                    fqcVar = fqcVarA;
                                                }
                                                i10--;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                case 4:
                                    int i11 = mohVar.h;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < i11) {
                                            mohVar.c(i12);
                                            fqc fqcVarA2 = mohVar.a(i12);
                                            if (x44.r(fqcVarA2.a(), zp3.S)) {
                                                i9 = ((int) (mohVar.g >> 32)) - (fqcVar != null ? ((int) (fqcVar.c >> 32)) + ((int) (fqcVar.b >> 32)) : (int) (fqcVarA2.c >> 32));
                                            } else {
                                                if (fqcVarA2.a().b == 3 || fqcVarA2.a().b == 1) {
                                                    fqcVar = fqcVarA2;
                                                }
                                                i12++;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                default:
                                    iP = x44.P(mohVar);
                                    break;
                            }
                            return Integer.valueOf(iP);
                        }
                    };
                    d9i d9iVar = gp6.a;
                    wp6VarA = new wp6(new b6i((he7) null, new s9g(rz5Var, new fp6(0, bz7Var)), (dh2) null, (l6f) null, (LinkedHashMap) null, 125));
                } else if (x44.r(dqcVarA, zp3.P)) {
                    rz5 rz5Var2 = gqc.e;
                    bz7 bz7Var2 = new bz7() { // from class: hqc
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            int iP;
                            int i8 = i5;
                            int i9 = 0;
                            fqc fqcVar = null;
                            moh mohVar = mohVarG;
                            ((Integer) obj).getClass();
                            switch (i8) {
                                case 0:
                                    iP = x44.P(mohVar);
                                    break;
                                case 1:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 2:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 3:
                                    int i10 = mohVar.h - 1;
                                    while (true) {
                                        if (-1 < i10) {
                                            mohVar.c(i10);
                                            fqc fqcVarA = mohVar.a(i10);
                                            if (x44.r(fqcVarA.a(), zp3.R)) {
                                                i9 = -(fqcVar != null ? (int) (fqcVar.c >> 32) : ((int) (fqcVarA.c >> 32)) + ((int) (fqcVarA.b >> 32)));
                                            } else {
                                                if (fqcVarA.a().b == 3 || fqcVarA.a().b == 1) {
                                                    fqcVar = fqcVarA;
                                                }
                                                i10--;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                case 4:
                                    int i11 = mohVar.h;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < i11) {
                                            mohVar.c(i12);
                                            fqc fqcVarA2 = mohVar.a(i12);
                                            if (x44.r(fqcVarA2.a(), zp3.S)) {
                                                i9 = ((int) (mohVar.g >> 32)) - (fqcVar != null ? ((int) (fqcVar.c >> 32)) + ((int) (fqcVar.b >> 32)) : (int) (fqcVarA2.c >> 32));
                                            } else {
                                                if (fqcVarA2.a().b == 3 || fqcVarA2.a().b == 1) {
                                                    fqcVar = fqcVarA2;
                                                }
                                                i12++;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                default:
                                    iP = x44.P(mohVar);
                                    break;
                            }
                            return Integer.valueOf(iP);
                        }
                    };
                    d9i d9iVar2 = gp6.a;
                    wp6VarA = new wp6(new b6i((he7) null, new s9g(rz5Var2, new fp6(0, bz7Var2)), (dh2) null, (l6f) null, (LinkedHashMap) null, 125));
                } else if (x44.r(dqcVarA, zp3.O)) {
                    rz5 rz5Var3 = gqc.c;
                    bz7 bz7Var3 = new bz7() { // from class: hqc
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            int iP;
                            int i8 = i6;
                            int i9 = 0;
                            fqc fqcVar = null;
                            moh mohVar = mohVarG;
                            ((Integer) obj).getClass();
                            switch (i8) {
                                case 0:
                                    iP = x44.P(mohVar);
                                    break;
                                case 1:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 2:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 3:
                                    int i10 = mohVar.h - 1;
                                    while (true) {
                                        if (-1 < i10) {
                                            mohVar.c(i10);
                                            fqc fqcVarA = mohVar.a(i10);
                                            if (x44.r(fqcVarA.a(), zp3.R)) {
                                                i9 = -(fqcVar != null ? (int) (fqcVar.c >> 32) : ((int) (fqcVarA.c >> 32)) + ((int) (fqcVarA.b >> 32)));
                                            } else {
                                                if (fqcVarA.a().b == 3 || fqcVarA.a().b == 1) {
                                                    fqcVar = fqcVarA;
                                                }
                                                i10--;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                case 4:
                                    int i11 = mohVar.h;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < i11) {
                                            mohVar.c(i12);
                                            fqc fqcVarA2 = mohVar.a(i12);
                                            if (x44.r(fqcVarA2.a(), zp3.S)) {
                                                i9 = ((int) (mohVar.g >> 32)) - (fqcVar != null ? ((int) (fqcVar.c >> 32)) + ((int) (fqcVar.b >> 32)) : (int) (fqcVarA2.c >> 32));
                                            } else {
                                                if (fqcVarA2.a().b == 3 || fqcVarA2.a().b == 1) {
                                                    fqcVar = fqcVarA2;
                                                }
                                                i12++;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                default:
                                    iP = x44.P(mohVar);
                                    break;
                            }
                            return Integer.valueOf(iP);
                        }
                    };
                    d9i d9iVar3 = gp6.a;
                    wp6VarA = new wp6(new b6i((he7) null, new s9g(rz5Var3, new fp6(0, bz7Var3)), (dh2) null, (l6f) null, (LinkedHashMap) null, 125));
                } else if (x44.r(dqcVarA, zp3.Q)) {
                    rz5 rz5Var4 = gqc.e;
                    bz7 bz7Var4 = new bz7() { // from class: hqc
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            int iP;
                            int i8 = i3;
                            int i9 = 0;
                            fqc fqcVar = null;
                            moh mohVar = mohVarG;
                            ((Integer) obj).getClass();
                            switch (i8) {
                                case 0:
                                    iP = x44.P(mohVar);
                                    break;
                                case 1:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 2:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 3:
                                    int i10 = mohVar.h - 1;
                                    while (true) {
                                        if (-1 < i10) {
                                            mohVar.c(i10);
                                            fqc fqcVarA = mohVar.a(i10);
                                            if (x44.r(fqcVarA.a(), zp3.R)) {
                                                i9 = -(fqcVar != null ? (int) (fqcVar.c >> 32) : ((int) (fqcVarA.c >> 32)) + ((int) (fqcVarA.b >> 32)));
                                            } else {
                                                if (fqcVarA.a().b == 3 || fqcVarA.a().b == 1) {
                                                    fqcVar = fqcVarA;
                                                }
                                                i10--;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                case 4:
                                    int i11 = mohVar.h;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < i11) {
                                            mohVar.c(i12);
                                            fqc fqcVarA2 = mohVar.a(i12);
                                            if (x44.r(fqcVarA2.a(), zp3.S)) {
                                                i9 = ((int) (mohVar.g >> 32)) - (fqcVar != null ? ((int) (fqcVar.c >> 32)) + ((int) (fqcVar.b >> 32)) : (int) (fqcVarA2.c >> 32));
                                            } else {
                                                if (fqcVarA2.a().b == 3 || fqcVarA2.a().b == 1) {
                                                    fqcVar = fqcVarA2;
                                                }
                                                i12++;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                default:
                                    iP = x44.P(mohVar);
                                    break;
                            }
                            return Integer.valueOf(iP);
                        }
                    };
                    d9i d9iVar4 = gp6.a;
                    wp6VarA = new wp6(new b6i((he7) null, new s9g(rz5Var4, new fp6(0, bz7Var4)), (dh2) null, (l6f) null, (LinkedHashMap) null, 125));
                } else {
                    wp6VarA = x44.r(dqcVarA, zp3.T) ? gp6.a(gqc.d, vo1Var, 12).a(new wp6(new b6i((he7) null, new s9g(gqc.c, new fp6(0, new bz7() { // from class: iqc
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            int iR;
                            long j;
                            int i8 = i5;
                            int i9 = 0;
                            ooh oohVar2 = oohVar;
                            moh mohVar = mohVarG;
                            ((Integer) obj).getClass();
                            switch (i8) {
                                case 0:
                                    int i10 = mohVar.h;
                                    iR = 0;
                                    while (i9 < i10) {
                                        ooh oohVarC = mohVar.c(i9);
                                        fqc fqcVarA = mohVar.a(i9);
                                        if (x44.r(oohVarC, oohVar2)) {
                                            j = mohVar.b(oohVar2).e;
                                        } else {
                                            if (fqcVarA.a().b == 3 || fqcVarA.a().b == 1) {
                                                iR = ((int) (fqcVarA.c >> 32)) + ((int) (fqcVarA.b >> 32));
                                            }
                                            i9++;
                                        }
                                        break;
                                    }
                                    j = mohVar.b(oohVar2).e;
                                    break;
                                default:
                                    int i11 = mohVar.h;
                                    iR = 0;
                                    while (i9 < i11) {
                                        ooh oohVarC2 = mohVar.c(i9);
                                        fqc fqcVarA2 = mohVar.a(i9);
                                        if (x44.r(oohVarC2, oohVar2)) {
                                            j = mohVar.b(oohVar2).c;
                                        } else {
                                            if (fqcVarA2.a().b == 3 || fqcVarA2.a().b == 2) {
                                                iR = x44.R(fqcVarA2);
                                            }
                                            i9++;
                                        }
                                        break;
                                    }
                                    j = mohVar.b(oohVar2).c;
                                    break;
                            }
                            return Integer.valueOf(iR - ((int) (j >> 32)));
                        }
                    })), (dh2) null, (l6f) null, (LinkedHashMap) null, 125))) : x44.r(dqcVarA, zp3.V) ? gp6.e(gqc.b, 2) : wp6.b;
                }
                final moh mohVarG2 = nohVar.E.g();
                final ooh oohVar2 = nohVar.F;
                dqc dqcVarA2 = mohVarG2.b(oohVar2).a();
                if (x44.r(dqcVarA2, zp3.R)) {
                    rz5 rz5Var5 = gqc.c;
                    final int i8 = 3;
                    bz7 bz7Var5 = new bz7() { // from class: hqc
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            int iP;
                            int i82 = i8;
                            int i9 = 0;
                            fqc fqcVar = null;
                            moh mohVar = mohVarG2;
                            ((Integer) obj).getClass();
                            switch (i82) {
                                case 0:
                                    iP = x44.P(mohVar);
                                    break;
                                case 1:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 2:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 3:
                                    int i10 = mohVar.h - 1;
                                    while (true) {
                                        if (-1 < i10) {
                                            mohVar.c(i10);
                                            fqc fqcVarA = mohVar.a(i10);
                                            if (x44.r(fqcVarA.a(), zp3.R)) {
                                                i9 = -(fqcVar != null ? (int) (fqcVar.c >> 32) : ((int) (fqcVarA.c >> 32)) + ((int) (fqcVarA.b >> 32)));
                                            } else {
                                                if (fqcVarA.a().b == 3 || fqcVarA.a().b == 1) {
                                                    fqcVar = fqcVarA;
                                                }
                                                i10--;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                case 4:
                                    int i11 = mohVar.h;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < i11) {
                                            mohVar.c(i12);
                                            fqc fqcVarA2 = mohVar.a(i12);
                                            if (x44.r(fqcVarA2.a(), zp3.S)) {
                                                i9 = ((int) (mohVar.g >> 32)) - (fqcVar != null ? ((int) (fqcVar.c >> 32)) + ((int) (fqcVar.b >> 32)) : (int) (fqcVarA2.c >> 32));
                                            } else {
                                                if (fqcVarA2.a().b == 3 || fqcVarA2.a().b == 1) {
                                                    fqcVar = fqcVarA2;
                                                }
                                                i12++;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                default:
                                    iP = x44.P(mohVar);
                                    break;
                            }
                            return Integer.valueOf(iP);
                        }
                    };
                    d9i d9iVar5 = gp6.a;
                    d77Var3 = new d77(new b6i((he7) null, new s9g(rz5Var5, new fp6(1, bz7Var5)), (dh2) null, (l6f) null, (LinkedHashMap) null, 125));
                } else if (x44.r(dqcVarA2, zp3.S)) {
                    rz5 rz5Var6 = gqc.c;
                    bz7 bz7Var6 = new bz7() { // from class: hqc
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            int iP;
                            int i82 = i2;
                            int i9 = 0;
                            fqc fqcVar = null;
                            moh mohVar = mohVarG2;
                            ((Integer) obj).getClass();
                            switch (i82) {
                                case 0:
                                    iP = x44.P(mohVar);
                                    break;
                                case 1:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 2:
                                    iP = x44.Q(mohVar);
                                    break;
                                case 3:
                                    int i10 = mohVar.h - 1;
                                    while (true) {
                                        if (-1 < i10) {
                                            mohVar.c(i10);
                                            fqc fqcVarA = mohVar.a(i10);
                                            if (x44.r(fqcVarA.a(), zp3.R)) {
                                                i9 = -(fqcVar != null ? (int) (fqcVar.c >> 32) : ((int) (fqcVarA.c >> 32)) + ((int) (fqcVarA.b >> 32)));
                                            } else {
                                                if (fqcVarA.a().b == 3 || fqcVarA.a().b == 1) {
                                                    fqcVar = fqcVarA;
                                                }
                                                i10--;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                case 4:
                                    int i11 = mohVar.h;
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < i11) {
                                            mohVar.c(i12);
                                            fqc fqcVarA2 = mohVar.a(i12);
                                            if (x44.r(fqcVarA2.a(), zp3.S)) {
                                                i9 = ((int) (mohVar.g >> 32)) - (fqcVar != null ? ((int) (fqcVar.c >> 32)) + ((int) (fqcVar.b >> 32)) : (int) (fqcVarA2.c >> 32));
                                            } else {
                                                if (fqcVarA2.a().b == 3 || fqcVarA2.a().b == 1) {
                                                    fqcVar = fqcVarA2;
                                                }
                                                i12++;
                                            }
                                        }
                                    }
                                    return Integer.valueOf(i9);
                                default:
                                    iP = x44.P(mohVar);
                                    break;
                            }
                            return Integer.valueOf(iP);
                        }
                    };
                    d9i d9iVar6 = gp6.a;
                    d77Var3 = new d77(new b6i((he7) null, new s9g(rz5Var6, new fp6(1, bz7Var6)), (dh2) null, (l6f) null, (LinkedHashMap) null, 125));
                } else {
                    d77VarA = x44.r(dqcVarA2, zp3.U) ? gp6.i(gqc.d, vo1Var, 12).a(new d77(new b6i((he7) null, new s9g(gqc.c, new fp6(1, new bz7() { // from class: iqc
                        @Override // defpackage.bz7
                        public final Object invoke(Object obj) {
                            int iR;
                            long j;
                            int i82 = i6;
                            int i9 = 0;
                            ooh oohVar22 = oohVar2;
                            moh mohVar = mohVarG2;
                            ((Integer) obj).getClass();
                            switch (i82) {
                                case 0:
                                    int i10 = mohVar.h;
                                    iR = 0;
                                    while (i9 < i10) {
                                        ooh oohVarC = mohVar.c(i9);
                                        fqc fqcVarA = mohVar.a(i9);
                                        if (x44.r(oohVarC, oohVar22)) {
                                            j = mohVar.b(oohVar22).e;
                                        } else {
                                            if (fqcVarA.a().b == 3 || fqcVarA.a().b == 1) {
                                                iR = ((int) (fqcVarA.c >> 32)) + ((int) (fqcVarA.b >> 32));
                                            }
                                            i9++;
                                        }
                                        break;
                                    }
                                    j = mohVar.b(oohVar22).e;
                                    break;
                                default:
                                    int i11 = mohVar.h;
                                    iR = 0;
                                    while (i9 < i11) {
                                        ooh oohVarC2 = mohVar.c(i9);
                                        fqc fqcVarA2 = mohVar.a(i9);
                                        if (x44.r(oohVarC2, oohVar22)) {
                                            j = mohVar.b(oohVar22).c;
                                        } else {
                                            if (fqcVarA2.a().b == 3 || fqcVarA2.a().b == 2) {
                                                iR = x44.R(fqcVarA2);
                                            }
                                            i9++;
                                        }
                                        break;
                                    }
                                    j = mohVar.b(oohVar22).c;
                                    break;
                            }
                            return Integer.valueOf(iR - ((int) (j >> 32)));
                        }
                    })), (dh2) null, (l6f) null, (LinkedHashMap) null, 125))) : x44.r(dqcVarA2, zp3.W) ? gp6.f(gqc.b, 2) : d77.b;
                    d77Var2 = d77VarA;
                    kl7Var2 = gqc.a;
                    wp6Var2 = wp6VarA;
                }
                d77VarA = d77Var3;
                d77Var2 = d77VarA;
                kl7Var2 = gqc.a;
                wp6Var2 = wp6VarA;
            } else {
                e18Var.T();
                wp6Var2 = wp6Var;
                d77Var2 = d77Var;
                kl7Var2 = kl7Var;
            }
            e18Var.q();
            ((p90) e18Var.j(a)).a(new el5(nohVar, wp6Var2, d77Var2, kl7Var2, ta4Var), e18Var, 0);
        } else {
            e18Var.T();
            wp6Var2 = wp6Var;
            d77Var2 = d77Var;
            kl7Var2 = kl7Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new g73(nohVar, wp6Var2, d77Var2, kl7Var2, ta4Var, i, 4);
        }
    }
}
