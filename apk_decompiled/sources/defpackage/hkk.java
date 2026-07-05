package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.citation.Citation;
import com.anthropic.claude.tool.model.TaskProposeInput;
import com.anthropic.claude.tool.model.TaskProposeInputStepsItem;
import com.anthropic.claude.tool.model.TaskProposeOutput;
import com.anthropic.claude.tool.model.TaskProposeOutputStepsItem;
import com.pvporbit.freetype.FreeTypeConstants;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hkk {
    public static final ta4 a = new ta4(-1571285657, false, new ob4(28));
    public static final ta4 b = new ta4(2145439056, false, new ob4(29));

    /* JADX WARN: Removed duplicated region for block: B:100:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.r4g r29, final com.anthropic.claude.api.experience.SpotlightContent r30, final defpackage.k87 r31, final defpackage.pz7 r32, final defpackage.zy7 r33, defpackage.iqb r34, final boolean r35, defpackage.bz7 r36, final defpackage.l45 r37, defpackage.ld4 r38, int r39) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkk.a(r4g, com.anthropic.claude.api.experience.SpotlightContent, k87, pz7, zy7, iqb, boolean, bz7, l45, ld4, int):void");
    }

    public static final void b(int i, String str, String str2, iqb iqbVar, ld4 ld4Var, int i2) {
        int i3;
        iqb iqbVar2;
        long j;
        long j2;
        str.getClass();
        str2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1702452241);
        if ((i2 & 6) == 0) {
            i3 = (e18Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = i3 | 3072;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            t tVarI = i(i, str2, str, e18Var, (i4 & 14) | ((i4 >> 3) & 112) | ((i4 << 3) & 896));
            boolean z = tVarI.b;
            if (z) {
                e18Var.a0(325948673);
                j = gm3.a(e18Var).m;
            } else {
                e18Var.a0(325950036);
                j = gm3.a(e18Var).q;
            }
            e18Var.p(false);
            if (z) {
                e18Var.a0(325952481);
                j2 = gm3.a(e18Var).j;
            } else {
                e18Var.a0(325953846);
                j2 = gm3.a(e18Var).M;
            }
            e18Var.p(false);
            zy7 zy7Var = (zy7) tVarI.c;
            n02 n02VarA = q02.a(j, j2, 0L, 0L, e18Var, 12);
            fqb fqbVar = fqb.E;
            csg.a(zy7Var, fqbVar, false, xve.a(50), n02VarA, null, null, new qnc(12.0f, 6.0f, 12.0f, 6.0f), null, fd9.q0(2124750335, new lca(10, tVarI), e18Var), e18Var, ((i4 >> 6) & 112) | 817889280, 356);
            e18Var = e18Var;
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new zh(i, str, str2, iqbVar2, i2, 8);
        }
    }

    public static final void c(zy7 zy7Var, iqb iqbVar, l5j l5jVar, pl3 pl3Var, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        l5j l5jVar2;
        pl3 pl3Var2;
        l5j l5jVar3;
        pl3 pl3Var3;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(2024312820);
        int i2 = 4;
        int i3 = i | (e18Var2.h(zy7Var) ? 4 : 2) | 1200;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var2.V();
            int i4 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var2.A()) {
                m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                boolean zH = e18Var2.h(m7fVar);
                Object objN = e18Var2.N();
                if (zH || objN == lz1Var) {
                    objN = new t2g(m7fVar, i2);
                    e18Var2.k0(objN);
                }
                kce kceVar = jce.a;
                l5jVar3 = (l5j) fd9.r0(kceVar.b(l5j.class), oq5.B(kceVar.b(l5j.class)), (bz7) objN, e18Var2);
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN2 = e18Var2.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(pl3.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                pl3Var3 = (pl3) objN2;
                iqbVar2 = fqb.E;
            } else {
                e18Var2.T();
                iqbVar2 = iqbVar;
                l5jVar3 = l5jVar;
                pl3Var3 = pl3Var;
            }
            e18Var2.q();
            boolean zF2 = e18Var2.f(l5jVar3);
            Object objN3 = e18Var2.N();
            if (zF2 || objN3 == lz1Var) {
                objN3 = new jp(l5jVar3, tp4Var, 10);
                e18Var2.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var2, 0, 1);
            boolean zF3 = e18Var2.f(l5jVar3);
            Object objN4 = e18Var2.N();
            if (zF3 || objN4 == lz1Var) {
                objN4 = new ymi(3, l5jVar3);
                e18Var2.k0(objN4);
            }
            mwa.h(iei.a, null, (bz7) objN4, e18Var2, 6);
            String strJ0 = d4c.j0(R.string.voice_settings_sheet_title, e18Var2);
            long j = gm3.a(e18Var2).p;
            long j2 = gm3.a(e18Var2).M;
            WeakHashMap weakHashMap = gdj.x;
            e18Var = e18Var2;
            v40.b(iqbVar2, strJ0, fd9.q0(76427767, new e42(5, zy7Var, strJ0), e18Var2), null, null, null, 0, j, j2, s4i.d(e18Var2).l, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-840738518, new u3e(l5jVar3, 20, pl3Var3), e18Var2), e18Var, 390, 1144);
            pl3Var2 = pl3Var3;
            l5jVar2 = l5jVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            l5jVar2 = l5jVar;
            pl3Var2 = pl3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e(zy7Var, iqbVar2, (iwe) l5jVar2, (Object) pl3Var2, i, 18);
        }
    }

    public static final List d(TaskProposeOutput taskProposeOutput, TaskProposeInput taskProposeInput) {
        int i = 0;
        if (taskProposeOutput != null) {
            List listI1 = w44.i1(taskProposeOutput.getSteps(), new x8e(14));
            ArrayList arrayList = new ArrayList(x44.y(listI1, 10));
            for (Object obj : listI1) {
                int i2 = i + 1;
                if (i < 0) {
                    x44.n0();
                    throw null;
                }
                arrayList.add(new t6h(i2, ((TaskProposeOutputStepsItem) obj).getTitle()));
                i = i2;
            }
            return arrayList;
        }
        if (taskProposeInput == null) {
            return lm6.E;
        }
        List<TaskProposeInputStepsItem> steps = taskProposeInput.getSteps();
        ArrayList arrayList2 = new ArrayList(x44.y(steps, 10));
        for (Object obj2 : steps) {
            int i3 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            arrayList2.add(new t6h(i3, ((TaskProposeInputStepsItem) obj2).getTitle()));
            i = i3;
        }
        return arrayList2;
    }

    public static final ArrayList e(String str, List list) {
        List list2;
        str.getClass();
        List list3 = list;
        ArrayList<Integer> arrayList = new ArrayList(x44.y(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Citation) it.next()).getEnd_index());
        }
        int i = 0;
        if (arrayList.isEmpty()) {
            list2 = lm6.E;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                linkedHashMap.put(Integer.valueOf(i2), Integer.valueOf(i3));
                if (Character.isHighSurrogate(cCharAt)) {
                    i3 += 2;
                } else if (!Character.isLowSurrogate(cCharAt)) {
                    i3++;
                }
                i2++;
            }
            linkedHashMap.put(Integer.valueOf(i2), Integer.valueOf(i3));
            ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
            for (Integer num : arrayList) {
                arrayList2.add(num != null ? (Integer) linkedHashMap.get(Integer.valueOf(num.intValue())) : null);
            }
            list2 = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(x44.y(list3, 10));
        for (Object obj : list3) {
            int i5 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            arrayList3.add(Citation.copy$default((Citation) obj, null, null, null, null, null, (Integer) list2.get(i), null, null, null, 479, null));
            i = i5;
        }
        return arrayList3;
    }

    public static l5 f(Locale locale) {
        if (l5.f == null) {
            l5 l5Var = new l5(1);
            l5Var.d = BreakIterator.getWordInstance(locale);
            l5.f = l5Var;
        }
        l5 l5Var2 = l5.f;
        l5Var2.getClass();
        return l5Var2;
    }

    public static final hma g(hma hmaVar) {
        av9 av9VarG = hmaVar.S.S;
        while (true) {
            av9 av9VarG2 = av9VarG.G();
            if ((av9VarG2 != null ? av9VarG2.M : null) == null) {
                hma hmaVarF1 = ((m5c) av9VarG.k0.I).f1();
                hmaVarF1.getClass();
                return hmaVarF1;
            }
            av9 av9VarG3 = av9VarG.G();
            av9 av9Var = av9VarG3 != null ? av9VarG3.M : null;
            av9Var.getClass();
            if (av9Var.L) {
                av9VarG = av9VarG.G();
                av9VarG.getClass();
            } else {
                av9 av9VarG4 = av9VarG.G();
                av9VarG4.getClass();
                av9VarG = av9VarG4.M;
                av9VarG.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[PHI: r8
      0x0067: PHI (r8v6 java.lang.String) = (r8v4 java.lang.String), (r8v5 java.lang.String), (r8v7 java.lang.String) binds: [B:28:0x0071, B:30:0x0079, B:22:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String h(java.lang.String r12, java.util.List r13) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkk.h(java.lang.String, java.util.List):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0128 A[PHI: r4
      0x0128: PHI (r4v17 java.lang.String) = (r4v14 java.lang.String), (r4v18 java.lang.String) binds: [B:53:0x0126, B:49:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.t i(int r19, java.lang.String r20, java.lang.String r21, defpackage.ld4 r22, int r23) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkk.i(int, java.lang.String, java.lang.String, ld4, int):t");
    }
}
