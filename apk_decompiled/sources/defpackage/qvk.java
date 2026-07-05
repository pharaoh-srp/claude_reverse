package defpackage;

import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qvk {
    public static final ta4 a = new ta4(1428799065, false, new ic4(13));

    public static final void a(whd whdVar, boolean z, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1675015126);
        int i2 = i | (e18Var.f(whdVar) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            vkc.a(gb9.S(u4g.G, null, null, zy7Var2, e18Var, (i2 & 7168) | 6, 6), d4c.j0(R.string.chat_message_bottom_sheet_menu_select, e18Var), null, null, false, false, null, null, null, null, null, null, fd9.q0(-664538865, new sy3(whdVar, z, zy7Var, 3), e18Var), e18Var, 8, 3072, 8188);
            e18Var = e18Var;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(i, 14, whdVar, zy7Var, zy7Var2, z);
        }
    }

    public static final void b(xb0 xb0Var, String str, String str2) {
        if (str2.length() <= 0) {
            e39.a("alternateText can't be an empty string.");
        }
        xb0Var.l("androidx.compose.foundation.text.inlineContent", str);
        xb0Var.h(str2);
        xb0Var.i();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(defpackage.jt7 r7, defpackage.j70 r8) {
        /*
            ft7 r0 = r7.u1()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L81
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L35
            if (r0 == r3) goto L81
            if (r0 != r1) goto L31
            boolean r0 = h(r7, r8)
            if (r0 != 0) goto L77
            ws7 r0 = r7.r1()
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L76
            goto L77
        L31:
            defpackage.wg6.i()
            return r2
        L35:
            jt7 r0 = defpackage.cok.o(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L7d
            ft7 r6 = r0.u1()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L78
            if (r6 == r4) goto L55
            if (r6 == r3) goto L78
            if (r6 == r1) goto L51
            defpackage.wg6.i()
            return r2
        L51:
            defpackage.sz6.j(r5)
            return r2
        L55:
            boolean r1 = c(r0, r8)
            if (r1 != 0) goto L77
            boolean r7 = g(r7, r0, r3, r8)
            if (r7 != 0) goto L77
            ws7 r7 = r0.r1()
            boolean r7 = r7.a
            if (r7 == 0) goto L76
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L76
            goto L77
        L76:
            return r2
        L77:
            return r4
        L78:
            boolean r7 = g(r7, r0, r3, r8)
            return r7
        L7d:
            defpackage.sz6.j(r5)
            return r2
        L81:
            boolean r7 = h(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvk.c(jt7, j70):boolean");
    }

    public static c61 d(q16 q16Var, List list) {
        List parameters = q16Var.K.getParameters();
        ArrayList arrayList = new ArrayList(x44.y(parameters, 10));
        Iterator it = parameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((qai) it.next()).a());
        }
        return new c61(null, q16Var, list, sta.p0(w44.v1(arrayList, list)), 26);
    }

    public static iqb e(long j, vve vveVar) {
        vveVar.getClass();
        return zni.t(fqb.E, new rp(vveVar, 5.0f, 5.0f, j));
    }

    public static final boolean f(jt7 jt7Var, j70 j70Var) {
        int iOrdinal = jt7Var.u1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                jt7 jt7VarO = cok.o(jt7Var);
                if (jt7VarO != null) {
                    return f(jt7VarO, j70Var) || g(jt7Var, jt7VarO, 1, j70Var);
                }
                sz6.j("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return jt7Var.r1().a ? ((Boolean) j70Var.invoke(jt7Var)).booleanValue() : i(jt7Var, j70Var);
                }
                wg6.i();
                return false;
            }
        }
        return i(jt7Var, j70Var);
    }

    public static final boolean g(jt7 jt7Var, jt7 jt7Var2, int i, j70 j70Var) {
        if (j(jt7Var, jt7Var2, i, j70Var)) {
            return true;
        }
        Boolean bool = (Boolean) wwk.r(jt7Var, i, new qgc(((ts7) yfd.X(jt7Var).getFocusOwner()).h(), jt7Var, jt7Var2, i, j70Var, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean h(jt7 jt7Var, j70 j70Var) {
        Object[] objArr = new jt7[16];
        if (!jt7Var.E.R) {
            b39.c("visitChildren called on an unattached node");
        }
        wwb wwbVar = new wwb(0, new hqb[16]);
        hqb hqbVar = jt7Var.E;
        hqb hqbVar2 = hqbVar.J;
        if (hqbVar2 == null) {
            yfd.i(wwbVar, hqbVar);
        } else {
            wwbVar.b(hqbVar2);
        }
        int i = 0;
        while (true) {
            int i2 = wwbVar.G;
            if (i2 == 0) {
                break;
            }
            hqb hqbVarJ = (hqb) wwbVar.m(i2 - 1);
            if ((hqbVarJ.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
                yfd.i(wwbVar, hqbVarJ);
            } else {
                while (true) {
                    if (hqbVarJ == null) {
                        break;
                    }
                    if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                        wwb wwbVar2 = null;
                        while (hqbVarJ != null) {
                            if (hqbVarJ instanceof jt7) {
                                jt7 jt7Var2 = (jt7) hqbVarJ;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = jt7Var2;
                                i = i3;
                            } else if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ instanceof qw5)) {
                                int i4 = 0;
                                for (hqb hqbVar3 = ((qw5) hqbVarJ).T; hqbVar3 != null; hqbVar3 = hqbVar3.J) {
                                    if ((hqbVar3.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            hqbVarJ = hqbVar3;
                                        } else {
                                            if (wwbVar2 == null) {
                                                wwbVar2 = new wwb(0, new hqb[16]);
                                            }
                                            if (hqbVarJ != null) {
                                                wwbVar2.b(hqbVarJ);
                                                hqbVarJ = null;
                                            }
                                            wwbVar2.b(hqbVar3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            hqbVarJ = yfd.j(wwbVar2);
                        }
                    } else {
                        hqbVarJ = hqbVarJ.J;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, mt7.F);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                jt7 jt7Var3 = (jt7) objArr[i5];
                if (cok.q(jt7Var3) && c(jt7Var3, j70Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean i(jt7 jt7Var, j70 j70Var) {
        Object[] objArr = new jt7[16];
        if (!jt7Var.E.R) {
            b39.c("visitChildren called on an unattached node");
        }
        wwb wwbVar = new wwb(0, new hqb[16]);
        hqb hqbVar = jt7Var.E;
        hqb hqbVar2 = hqbVar.J;
        if (hqbVar2 == null) {
            yfd.i(wwbVar, hqbVar);
        } else {
            wwbVar.b(hqbVar2);
        }
        int i = 0;
        while (true) {
            int i2 = wwbVar.G;
            if (i2 == 0) {
                break;
            }
            hqb hqbVarJ = (hqb) wwbVar.m(i2 - 1);
            if ((hqbVarJ.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
                yfd.i(wwbVar, hqbVarJ);
            } else {
                while (true) {
                    if (hqbVarJ == null) {
                        break;
                    }
                    if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                        wwb wwbVar2 = null;
                        while (hqbVarJ != null) {
                            if (hqbVarJ instanceof jt7) {
                                jt7 jt7Var2 = (jt7) hqbVarJ;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = jt7Var2;
                                i = i3;
                            } else if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ instanceof qw5)) {
                                int i4 = 0;
                                for (hqb hqbVar3 = ((qw5) hqbVarJ).T; hqbVar3 != null; hqbVar3 = hqbVar3.J) {
                                    if ((hqbVar3.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            hqbVarJ = hqbVar3;
                                        } else {
                                            if (wwbVar2 == null) {
                                                wwbVar2 = new wwb(0, new hqb[16]);
                                            }
                                            if (hqbVarJ != null) {
                                                wwbVar2.b(hqbVarJ);
                                                hqbVarJ = null;
                                            }
                                            wwbVar2.b(hqbVar3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            hqbVarJ = yfd.j(wwbVar2);
                        }
                    } else {
                        hqbVarJ = hqbVarJ.J;
                    }
                }
            }
        }
        Arrays.sort(objArr, 0, i, mt7.F);
        for (int i5 = 0; i5 < i; i5++) {
            jt7 jt7Var3 = (jt7) objArr[i5];
            if (cok.q(jt7Var3) && f(jt7Var3, j70Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fe, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x019b A[EDGE_INSN: B:157:0x019b->B:127:0x019b BREAK  A[LOOP:5: B:89:0x012c->B:162:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean j(defpackage.jt7 r12, defpackage.jt7 r13, int r14, defpackage.j70 r15) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvk.j(jt7, jt7, int, j70):boolean");
    }
}
