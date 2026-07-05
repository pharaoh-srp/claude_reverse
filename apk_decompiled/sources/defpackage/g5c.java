package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.anthropic.claude.R;
import com.anthropic.claude.types.strings.ChatId;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class g5c implements rzh {
    public final /* synthetic */ int E;
    public final Object F;
    public final Object G;
    public final Object H;
    public Object I;
    public final Object J;
    public Object K;
    public Object L;
    public Object M;
    public final Object N;
    public Object O;

    public g5c(av9 av9Var) {
        this.E = 0;
        this.F = av9Var;
        f5c f5cVar = new f5c();
        f5cVar.H = -1;
        this.G = f5cVar;
        z39 z39Var = new z39(av9Var);
        this.H = z39Var;
        this.I = z39Var;
        j4h j4hVar = z39Var.y0;
        this.J = j4hVar;
        this.K = j4hVar;
        this.N = new wwb(0, new iqb[16]);
    }

    public static final void b(g5c g5cVar, hqb hqbVar, m5c m5cVar) {
        for (hqb hqbVar2 = hqbVar.I; hqbVar2 != null; hqbVar2 = hqbVar2.I) {
            if (hqbVar2 == ((f5c) g5cVar.G)) {
                av9 av9VarG = ((av9) g5cVar.F).G();
                m5cVar.W = av9VarG != null ? (z39) av9VarG.k0.H : null;
                g5cVar.I = m5cVar;
                return;
            } else {
                if ((hqbVar2.G & 2) != 0) {
                    return;
                }
                hqbVar2.o1(m5cVar);
            }
        }
    }

    public static hqb d(gqb gqbVar, hqb hqbVar) {
        hqb hqbVarCreate;
        if (gqbVar instanceof nqb) {
            hqbVarCreate = ((nqb) gqbVar).create();
            hqbVarCreate.G = s5c.f(hqbVarCreate);
        } else {
            nc1 nc1Var = new nc1();
            nc1Var.G = s5c.d(gqbVar);
            nc1Var.S = gqbVar;
            nc1Var.T = new HashSet();
            hqbVarCreate = nc1Var;
        }
        if (hqbVarCreate.R) {
            b39.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        hqbVarCreate.M = true;
        hqb hqbVar2 = hqbVar.J;
        if (hqbVar2 != null) {
            hqbVar2.I = hqbVarCreate;
            hqbVarCreate.J = hqbVar2;
        }
        hqbVar.J = hqbVarCreate;
        hqbVarCreate.I = hqbVar;
        return hqbVarCreate;
    }

    public static hqb f(hqb hqbVar) {
        boolean z = hqbVar.R;
        if (z) {
            mvb mvbVar = s5c.a;
            if (!z) {
                b39.c("autoInvalidateRemovedNode called on unattached node");
            }
            s5c.a(hqbVar, -1, 2);
            hqbVar.m1();
            hqbVar.g1();
        }
        hqb hqbVar2 = hqbVar.J;
        hqb hqbVar3 = hqbVar.I;
        if (hqbVar2 != null) {
            hqbVar2.I = hqbVar3;
            hqbVar.J = null;
        }
        if (hqbVar3 != null) {
            hqbVar3.J = hqbVar2;
            hqbVar.I = null;
        }
        hqbVar3.getClass();
        return hqbVar3;
    }

    public static void n(gqb gqbVar, gqb gqbVar2, hqb hqbVar) {
        if ((gqbVar instanceof nqb) && (gqbVar2 instanceof nqb)) {
            hqbVar.getClass();
            ((nqb) gqbVar2).update(hqbVar);
            if (hqbVar.R) {
                s5c.c(hqbVar);
                return;
            } else {
                hqbVar.N = true;
                return;
            }
        }
        if (!(hqbVar instanceof nc1)) {
            b39.c("Unknown Modifier.Node type");
            return;
        }
        nc1 nc1Var = (nc1) hqbVar;
        boolean z = nc1Var.R;
        if (z) {
            if (!z) {
                b39.c("unInitializeModifier called on unattached node");
            }
            if ((nc1Var.G & 8) != 0) {
                ((AndroidComposeView) yfd.X(nc1Var)).B();
            }
        }
        nc1Var.S = gqbVar2;
        nc1Var.G = s5c.d(gqbVar2);
        if (nc1Var.R) {
            nc1Var.p1(false);
        }
        if (hqbVar.R) {
            s5c.c(hqbVar);
        } else {
            hqbVar.N = true;
        }
    }

    @Override // defpackage.rzh
    public boolean c(String str, znb znbVar) {
        if (e(str, znbVar) != 0) {
            return false;
        }
        return str != null ? ((Boolean) ((bz7) this.L).invoke(ChatId.m978boximpl(str))).booleanValue() : ((Boolean) ((bz7) this.J).invoke(znbVar)).booleanValue() && ((Boolean) ((zy7) this.M).a()).booleanValue();
    }

    @Override // defpackage.rzh
    public int e(String str, znb znbVar) {
        int i = ((Boolean) ((zy7) this.I).a()).booleanValue() ? R.string.tool_setting_disabled_by_organization : !((Boolean) ((bz7) this.J).invoke(znbVar)).booleanValue() ? R.string.tool_setting_not_supported_for_model : 0;
        if (i != 0) {
            return i;
        }
        pz7 pz7Var = (pz7) this.K;
        if (pz7Var != null) {
            return ((Number) pz7Var.invoke(str != null ? ChatId.m978boximpl(str) : null, znbVar)).intValue();
        }
        return 0;
    }

    @Override // defpackage.rzh
    public boolean g() {
        return ((Boolean) ((zy7) this.H).a()).booleanValue();
    }

    public boolean i(int i) {
        return (((hqb) this.K).H & i) != 0;
    }

    @Override // defpackage.rzh
    public boolean isVisible() {
        return ((Boolean) ((zy7) this.G).a()).booleanValue();
    }

    public void j() {
        for (hqb hqbVar = (hqb) this.K; hqbVar != null; hqbVar = hqbVar.J) {
            hqbVar.l1();
            if (hqbVar.M) {
                mvb mvbVar = s5c.a;
                if (!hqbVar.R) {
                    b39.c("autoInvalidateInsertedNode called on unattached node");
                }
                s5c.a(hqbVar, -1, 1);
            }
            if (hqbVar.N) {
                s5c.c(hqbVar);
            }
            hqbVar.M = false;
            hqbVar.N = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0268, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x026e, code lost:
    
        r1 = r1 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x014e, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0154, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0156, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0158, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
    
        if (r13 > r1) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015d, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015f, code lost:
    
        if (r13 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0161, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016f, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0172, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0174, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017f, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0186, code lost:
    
        r22 = r10 - ((r5 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
    
        if (r1 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018e, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0191, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0198, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a4, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a6, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a8, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b4, code lost:
    
        if (r6.a(r14 - 1, r27 - 1) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b6, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bd, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c5, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c7, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c9, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cb, code lost:
    
        if (r11 > r1) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d1, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d3, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(int r32, defpackage.wwb r33, defpackage.wwb r34, defpackage.hqb r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g5c.k(int, wwb, wwb, hqb, boolean):void");
    }

    public void l() {
        su9 su9Var;
        mmc mmcVar;
        av9 av9Var = (av9) this.F;
        m5c m5cVar = (z39) this.H;
        for (hqb hqbVar = ((j4h) this.J).I; hqbVar != null; hqbVar = hqbVar.I) {
            pu9 pu9VarN = yfd.n(hqbVar);
            if (pu9VarN != null) {
                m5c m5cVar2 = hqbVar.L;
                if (m5cVar2 != null) {
                    su9Var = (su9) m5cVar2;
                    pu9 pu9Var = su9Var.y0;
                    su9Var.K1(pu9VarN);
                    if (pu9Var != hqbVar && (mmcVar = su9Var.r0) != null) {
                        ((ma8) mmcVar).c();
                    }
                } else {
                    su9Var = new su9(av9Var, pu9VarN);
                    hqbVar.o1(su9Var);
                }
                m5cVar.W = su9Var;
                su9Var.V = m5cVar;
                m5cVar = su9Var;
            } else {
                hqbVar.o1(m5cVar);
            }
        }
        av9 av9VarG = av9Var.G();
        m5cVar.W = av9VarG != null ? (z39) av9VarG.k0.H : null;
        this.I = m5cVar;
    }

    public Object m(String str, boolean z, xzg xzgVar) {
        ((bz7) this.N).invoke(Boolean.valueOf(z));
        w3c w3cVar = (w3c) this.F;
        Object objN = fd9.N(new sa3(w3cVar, ((AtomicInteger) ((cbf) w3cVar.F).G).incrementAndGet(), str, Boolean.valueOf(z), null), xzgVar);
        return objN == m45.E ? objN : iei.a;
    }

    public String toString() {
        switch (this.E) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                hqb hqbVar = (hqb) this.K;
                j4h j4hVar = (j4h) this.J;
                if (hqbVar == j4hVar) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (hqbVar != null && hqbVar != j4hVar) {
                            sb.append(String.valueOf(hqbVar));
                            if (hqbVar.J == j4hVar) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                hqbVar = hqbVar.J;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ g5c(Object obj, Object obj2, Object obj3, Object obj4, qz7 qz7Var, pz7 pz7Var, qz7 qz7Var2, Object obj5, qz7 qz7Var3, Object obj6, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = qz7Var;
        this.K = pz7Var;
        this.L = qz7Var2;
        this.M = obj5;
        this.N = qz7Var3;
        this.O = obj6;
    }
}
