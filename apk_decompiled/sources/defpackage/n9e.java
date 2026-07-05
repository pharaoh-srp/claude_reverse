package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class n9e {
    public final AndroidComposeView a;
    public final l94 b;
    public final voh c;
    public final qvb d;
    public boolean e;
    public boolean f;
    public boolean g;
    public pz h;
    public long i;
    public final l4 j;
    public final dwb k;

    public n9e(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        l94 l94Var = new l94(3);
        l94Var.c = new long[192];
        l94Var.d = new long[192];
        this.b = l94Var;
        this.c = new voh();
        this.d = new qvb();
        this.i = -1L;
        this.j = new l4(27, this);
        this.k = new dwb();
    }

    public static boolean c(m5c m5cVar) {
        mmc mmcVar = m5cVar.r0;
        return (mmcVar == null || yfd.H(((ma8) mmcVar).b())) ? false : true;
    }

    public static long e(av9 av9Var) {
        g5c g5cVar = av9Var.k0;
        m5c m5cVar = (m5c) g5cVar.I;
        long jD = 0;
        for (m5c m5cVar2 = (z39) g5cVar.H; m5cVar2 != null && m5cVar2 != m5cVar; m5cVar2 = m5cVar2.W) {
            if (c(m5cVar2)) {
                return 9223372034707292159L;
            }
            jD = y69.d(jD, m5cVar2.f0);
        }
        return jD;
    }

    public static void h(av9 av9Var) {
        if (!av9Var.G || c((m5c) av9Var.k0.I)) {
            return;
        }
        av9Var.G = false;
        if (av9Var.I) {
            av9Var.H = e(av9Var);
            av9Var.I = false;
        }
        if (y69.b(av9Var.H, 9223372034707292159L)) {
            return;
        }
        wwb wwbVarM = av9Var.M();
        Object[] objArr = wwbVarM.E;
        int i = wwbVarM.G;
        for (int i2 = 0; i2 < i; i2++) {
            h((av9) objArr[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9e.a():void");
    }

    public final long b(av9 av9Var) {
        long j;
        int i = av9Var.F & 33554431;
        l94 l94Var = this.b;
        long[] jArr = (long[]) l94Var.c;
        int i2 = l94Var.b;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) j)) & 4294967295L) | (((long) ((int) (j >> 32))) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.av9 r23) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n9e.d(av9):void");
    }

    public final void f(av9 av9Var) {
        long j;
        boolean zY = av9Var.Y();
        g5c g5cVar = av9Var.k0;
        if (zY && av9Var.J) {
            av9 av9VarG = av9Var.G();
            if (av9VarG == null || av9VarG.G) {
                j = av9VarG == null ? 0L : 9223372034707292159L;
            } else {
                if (av9VarG.I) {
                    av9VarG.I = false;
                    av9VarG.H = e(av9VarG);
                }
                j = av9VarG.H;
            }
            m5c m5cVar = (m5c) g5cVar.I;
            if (y69.b(j, 9223372034707292159L) || c(m5cVar)) {
                d(av9Var);
            } else if (av9Var.G) {
                d(av9Var);
                h(av9Var);
            } else {
                long jD = y69.d(j, m5cVar.f0);
                n5b n5bVarA = av9Var.A();
                int iX = n5bVarA.X();
                int iS = n5bVarA.S();
                int i = av9Var.F;
                boolean z = av9Var.K;
                l94 l94Var = this.b;
                long j2 = 4294967295L;
                if (!z) {
                    av9Var.K = true;
                    boolean zI = g5cVar.i(FreeTypeConstants.FT_LOAD_NO_RECURSE);
                    boolean zI2 = g5cVar.i(16);
                    boolean zA = this.c.a.a(i);
                    if (av9VarG != null) {
                        int i2 = av9VarG.F;
                        int i3 = (int) (jD >> 32);
                        int i4 = (int) (jD & 4294967295L);
                        int i5 = i & 33554431;
                        long[] jArr = (long[]) l94Var.c;
                        int i6 = l94Var.b - 3;
                        while (true) {
                            if (i6 < 0) {
                                break;
                            }
                            if ((((int) jArr[i6 + 2]) & 33554431) == i2) {
                                long j3 = jArr[i6];
                                int i7 = ((int) (j3 >> 32)) + i3;
                                int i8 = ((int) j3) + i4;
                                l94Var.f(i5, i7, i8, i7 + iX, i8 + iS, i2, zI, zI2, zA, i6);
                                break;
                            }
                            i6 -= 3;
                        }
                    } else {
                        int i9 = (int) (jD >> 32);
                        int i10 = (int) (jD & 4294967295L);
                        l94Var.f(i, i9, i10, i9 + iX, i10 + iS, (512 & 32) != 0 ? -1 : 0, zI, zI2, zA, -1);
                    }
                } else if (av9VarG != null) {
                    int i11 = av9VarG.F;
                    int i12 = (int) (jD >> 32);
                    int i13 = (int) (jD & 4294967295L);
                    int i14 = i & 33554431;
                    long[] jArr2 = (long[]) l94Var.c;
                    int i15 = l94Var.b;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= jArr2.length - 2 || i16 >= i15) {
                            break;
                        }
                        long j4 = j2;
                        if ((((int) jArr2[i16 + 2]) & 33554431) == i11) {
                            long j5 = jArr2[i16];
                            int i17 = ((int) (j5 >> 32)) + i12;
                            int i18 = ((int) j5) + i13;
                            int i19 = i17 + iX;
                            int i20 = i18 + iS;
                            i16 += 3;
                            while (i16 < jArr2.length - 2 && i16 < i15) {
                                int i21 = i16 + 2;
                                int i22 = i11;
                                int i23 = i12;
                                long j6 = jArr2[i21];
                                int i24 = i13;
                                if ((((int) j6) & 33554431) == i14) {
                                    long j7 = jArr2[i16];
                                    long[] jArr3 = jArr2;
                                    int i25 = i17 - ((int) (j7 >> 32));
                                    int i26 = i18 - ((int) j7);
                                    jArr3[i16] = (((long) i18) & j4) | (((long) i17) << 32);
                                    jArr3[i16 + 1] = (((long) i19) << 32) | (((long) i20) & j4);
                                    jArr3[i21] = j6 | (((j6 >> 63) & 1) << 60);
                                    if (i25 != 0 || i26 != 0) {
                                        int i27 = m9e.b;
                                        l94Var.j(i25, i26, (j6 & (-1125899873288193L)) | (((long) ((i16 + 3) & 33554431)) << 25));
                                    }
                                } else {
                                    i16 += 3;
                                    i11 = i22;
                                    i12 = i23;
                                    i13 = i24;
                                }
                            }
                        }
                        i16 += 3;
                        jArr2 = jArr2;
                        j2 = j4;
                        i11 = i11;
                        i12 = i12;
                        i13 = i13;
                    }
                } else {
                    int i28 = (int) (jD >> 32);
                    int i29 = (int) (jD & 4294967295L);
                    int i30 = iX + i28;
                    int i31 = i29 + iS;
                    int i32 = i & 33554431;
                    long[] jArr4 = (long[]) l94Var.c;
                    int i33 = l94Var.b;
                    int i34 = 0;
                    while (true) {
                        if (i34 >= jArr4.length - 2 || i34 >= i33) {
                            break;
                        }
                        int i35 = i34 + 2;
                        long j8 = jArr4[i35];
                        if ((((int) j8) & 33554431) == i32) {
                            long j9 = jArr4[i34];
                            int i36 = i34;
                            jArr4[i36] = (((long) i28) << 32) | (((long) i29) & 4294967295L);
                            jArr4[i36 + 1] = (((long) i30) << 32) | (((long) i31) & 4294967295L);
                            jArr4[i35] = (((j8 >> 63) & 1) << 60) | j8;
                            int i37 = i28 - ((int) (j9 >> 32));
                            int i38 = i29 - ((int) j9);
                            if ((i37 != 0) | (i38 != 0)) {
                                int i39 = m9e.b;
                                l94Var.j(i37, i38, (j8 & (-1125899873288193L)) | (((long) ((i36 + 3) & 33554431)) << 25));
                            }
                        } else {
                            i34 += 3;
                        }
                    }
                }
            }
            av9Var.J = false;
            this.e = true;
            i();
        }
    }

    public final void g(av9 av9Var) {
        if (av9Var.K) {
            int i = av9Var.F & 33554431;
            l94 l94Var = this.b;
            long[] jArr = (long[]) l94Var.c;
            int i2 = l94Var.b;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = m9e.a;
                    break;
                }
                i3 += 3;
            }
            av9Var.K = false;
            av9Var.J = true;
            this.e = true;
            this.g = true;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        pz pzVar = this.h;
        int i = 0;
        boolean z = pzVar != null;
        long j = this.c.c;
        if (j >= 0 || !z) {
            if (this.i == j && z) {
                return;
            }
            AndroidComposeView androidComposeView = this.a;
            if (pzVar != null) {
                androidComposeView.removeCallbacks(pzVar);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            this.i = jMax;
            pz pzVar2 = new pz(i, this.j);
            androidComposeView.postDelayed(pzVar2, jMax - jCurrentTimeMillis);
            this.h = pzVar2;
        }
    }
}
