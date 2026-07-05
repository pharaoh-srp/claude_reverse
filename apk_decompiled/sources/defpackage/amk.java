package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.TypedValue;
import com.anthropic.claude.R;
import com.anthropic.claude.configs.flags.FileUploadConfig;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class amk {
    public static final ta4 a = new ta4(308876494, false, new rb4(18));

    public static final void a(final qfe qfeVar, bz7 bz7Var, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        qfeVar.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1522970473);
        int i2 = i | (e18Var2.f(qfeVar) ? 4 : 2) | (e18Var2.h(bz7Var) ? 32 : 16) | (e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        final byte b = 0;
        final int i3 = 1;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            zy1 zy1Var = qfeVar.d;
            boolean z = (i2 & 112) == 32;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new vp6(3, null, bz7Var);
                e18Var2.k0(objN);
            }
            x44.b(zy1Var, (pz7) objN, e18Var2, 0);
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objN2 = e18Var2.N();
            int i4 = 22;
            if (z2 || objN2 == lz1Var) {
                objN2 = new aac(qfeVar, i4, zy7Var);
                e18Var2.k0(objN2);
            }
            e18Var = e18Var2;
            trk.b((zy7) objN2, fd9.q0(1685687316, new pz7() { // from class: sfe
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = b;
                    lz1 lz1Var2 = jd4.a;
                    iei ieiVar = iei.a;
                    switch (i5) {
                        case 0:
                            ld4 ld4Var2 = (ld4) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            e18 e18Var3 = (e18) ld4Var2;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                e18Var3.T();
                            } else {
                                String strJ0 = d4c.j0(R.string.project_rename, e18Var3);
                                qfe qfeVar2 = qfeVar;
                                boolean zBooleanValue = ((Boolean) qfeVar2.g.getValue()).booleanValue();
                                boolean zF = e18Var3.f(qfeVar2);
                                Object objN3 = e18Var3.N();
                                if (zF || objN3 == lz1Var2) {
                                    mx5 mx5Var = new mx5(0, qfeVar2, qfe.class, "submitRename", "submitRename()V", 0, 26);
                                    e18Var3.k0(mx5Var);
                                    objN3 = mx5Var;
                                }
                                bhk.a(strJ0, zBooleanValue, (zy7) ((jm9) objN3), null, e18Var3, 0, 8);
                            }
                            break;
                        default:
                            ld4 ld4Var3 = (ld4) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            e18 e18Var4 = (e18) ld4Var3;
                            if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                e18Var4.T();
                            } else {
                                q64 q64VarA = p64.a(ko0.c, lja.T, e18Var4, 48);
                                int iHashCode = Long.hashCode(e18Var4.T);
                                hyc hycVarL = e18Var4.l();
                                fqb fqbVar = fqb.E;
                                iqb iqbVarE = kxk.E(e18Var4, fqbVar);
                                dd4.e.getClass();
                                re4 re4Var = cd4.b;
                                e18Var4.e0();
                                if (e18Var4.S) {
                                    e18Var4.k(re4Var);
                                } else {
                                    e18Var4.n0();
                                }
                                d4c.i0(e18Var4, cd4.f, q64VarA);
                                d4c.i0(e18Var4, cd4.e, hycVarL);
                                d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                                d4c.h0(e18Var4, cd4.h);
                                d4c.i0(e18Var4, cd4.d, iqbVarE);
                                Object objN4 = e18Var4.N();
                                if (objN4 == lz1Var2) {
                                    objN4 = ij0.d(e18Var4);
                                }
                                bt7 bt7Var = (bt7) objN4;
                                qfe qfeVar3 = qfeVar;
                                cjh cjhVar = (cjh) qfeVar3.f.getValue();
                                boolean zF2 = e18Var4.f(qfeVar3);
                                Object objN5 = e18Var4.N();
                                if (zF2 || objN5 == lz1Var2) {
                                    pac pacVar = new pac(1, qfeVar3, qfe.class, "updateNameInput", "updateNameInput(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0, 23);
                                    e18Var4.k0(pacVar);
                                    objN5 = pacVar;
                                }
                                mwa.a(cjhVar, (bz7) ((jm9) objN5), d4c.j0(R.string.project_rename_dialog_title, e18Var4), iv1.s(fqbVar, bt7Var), false, null, null, null, null, null, null, null, true, 0, 0, 0L, null, e18Var4, 100663296, 1572864, 2031344);
                                Object objN6 = e18Var4.N();
                                if (objN6 == lz1Var2) {
                                    objN6 = new fz3(bt7Var, null, 10);
                                    e18Var4.k0(objN6);
                                }
                                fd9.i(e18Var4, (pz7) objN6, ieiVar);
                                e18Var4.p(true);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }, e18Var2), null, fd9.q0(-280299438, new sxa(zy7Var, i4, b), e18Var2), wsk.a, fd9.q0(1065687727, new pz7() { // from class: sfe
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    lz1 lz1Var2 = jd4.a;
                    iei ieiVar = iei.a;
                    switch (i5) {
                        case 0:
                            ld4 ld4Var2 = (ld4) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            e18 e18Var3 = (e18) ld4Var2;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                e18Var3.T();
                            } else {
                                String strJ0 = d4c.j0(R.string.project_rename, e18Var3);
                                qfe qfeVar2 = qfeVar;
                                boolean zBooleanValue = ((Boolean) qfeVar2.g.getValue()).booleanValue();
                                boolean zF = e18Var3.f(qfeVar2);
                                Object objN3 = e18Var3.N();
                                if (zF || objN3 == lz1Var2) {
                                    mx5 mx5Var = new mx5(0, qfeVar2, qfe.class, "submitRename", "submitRename()V", 0, 26);
                                    e18Var3.k0(mx5Var);
                                    objN3 = mx5Var;
                                }
                                bhk.a(strJ0, zBooleanValue, (zy7) ((jm9) objN3), null, e18Var3, 0, 8);
                            }
                            break;
                        default:
                            ld4 ld4Var3 = (ld4) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            e18 e18Var4 = (e18) ld4Var3;
                            if (!e18Var4.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                e18Var4.T();
                            } else {
                                q64 q64VarA = p64.a(ko0.c, lja.T, e18Var4, 48);
                                int iHashCode = Long.hashCode(e18Var4.T);
                                hyc hycVarL = e18Var4.l();
                                fqb fqbVar = fqb.E;
                                iqb iqbVarE = kxk.E(e18Var4, fqbVar);
                                dd4.e.getClass();
                                re4 re4Var = cd4.b;
                                e18Var4.e0();
                                if (e18Var4.S) {
                                    e18Var4.k(re4Var);
                                } else {
                                    e18Var4.n0();
                                }
                                d4c.i0(e18Var4, cd4.f, q64VarA);
                                d4c.i0(e18Var4, cd4.e, hycVarL);
                                d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                                d4c.h0(e18Var4, cd4.h);
                                d4c.i0(e18Var4, cd4.d, iqbVarE);
                                Object objN4 = e18Var4.N();
                                if (objN4 == lz1Var2) {
                                    objN4 = ij0.d(e18Var4);
                                }
                                bt7 bt7Var = (bt7) objN4;
                                qfe qfeVar3 = qfeVar;
                                cjh cjhVar = (cjh) qfeVar3.f.getValue();
                                boolean zF2 = e18Var4.f(qfeVar3);
                                Object objN5 = e18Var4.N();
                                if (zF2 || objN5 == lz1Var2) {
                                    pac pacVar = new pac(1, qfeVar3, qfe.class, "updateNameInput", "updateNameInput(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0, 23);
                                    e18Var4.k0(pacVar);
                                    objN5 = pacVar;
                                }
                                mwa.a(cjhVar, (bz7) ((jm9) objN5), d4c.j0(R.string.project_rename_dialog_title, e18Var4), iv1.s(fqbVar, bt7Var), false, null, null, null, null, null, null, null, true, 0, 0, 0L, null, e18Var4, 100663296, 1572864, 2031344);
                                Object objN6 = e18Var4.N();
                                if (objN6 == lz1Var2) {
                                    objN6 = new fz3(bt7Var, null, 10);
                                    e18Var4.k0(objN6);
                                }
                                fd9.i(e18Var4, (pz7) objN6, ieiVar);
                                e18Var4.p(true);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }, e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var, 1772592, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tfe(qfeVar, i, bz7Var, zy7Var, 0);
        }
    }

    public static final List b(Uri uri) {
        if (x44.r(uri.getScheme(), "claude") && x44.r(uri.getHost(), "code")) {
            return uri.getPathSegments();
        }
        List<String> pathSegments = uri.getPathSegments();
        pathSegments.getClass();
        if (!x44.r(w44.N0(pathSegments), "code")) {
            return null;
        }
        List<String> pathSegments2 = uri.getPathSegments();
        pathSegments2.getClass();
        return w44.I0(pathSegments2, 1);
    }

    public static final FileUploadConfig c(rc8 rc8Var) {
        rc8Var.getClass();
        FileUploadConfig fileUploadConfig = (FileUploadConfig) rc8Var.i(FileUploadConfig.FEATURE_KEY, FileUploadConfig.Companion.serializer());
        if (fileUploadConfig != null) {
            return fileUploadConfig;
        }
        return new FileUploadConfig(0, 0, 0, 7, (mq5) null);
    }

    public static final xfj d(tgj tgjVar) {
        tgjVar.getClass();
        return new xfj(tgjVar.a, tgjVar.t);
    }

    public static final kub e(rb... rbVarArr) {
        ArrayList arrayList = new ArrayList(rbVarArr.length);
        for (rb rbVar : rbVarArr) {
            rbVar.getClass();
            arrayList.add(new cpc(vsj.a, rbVar.a));
        }
        cpc[] cpcVarArr = (cpc[]) arrayList.toArray(new cpc[0]);
        return new kub(sta.j0((cpc[]) Arrays.copyOf(cpcVarArr, cpcVarArr.length)));
    }

    public static final qfe f(String str, e18 e18Var) {
        str.getClass();
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean zF = e18Var.f(str) | e18Var.h(m7fVar);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            objN = new jy5(str, m7fVar, 8);
            e18Var.k0(objN);
        }
        kce kceVar = jce.a;
        String strB = oq5.B(kceVar.b(qfe.class));
        return (qfe) fd9.r0(kceVar.b(qfe.class), strB, (bz7) objN, e18Var);
    }

    public static TypedValue g(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean h(int i, Context context, boolean z) {
        TypedValue typedValueG = g(context, i);
        return (typedValueG == null || typedValueG.type != 18) ? z : typedValueG.data != 0;
    }

    public static final int i(String str, h99 h99Var) {
        str.getClass();
        h99Var.getClass();
        try {
            for (int i : sq6.H(10)) {
                if (ebh.c(i).equals(str)) {
                    return i;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (NoSuchElementException e) {
            dch.H(h99Var, 5, g99.E, new bbf(str, 1), e, false, 48);
            return 0;
        }
    }
}
