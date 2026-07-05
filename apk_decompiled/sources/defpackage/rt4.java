package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import com.anthropic.claude.conway.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rt4 implements pt4 {
    public final us4 a;

    static {
        us4 us4Var = us4.e;
    }

    public rt4(us4 us4Var) {
        this.a = us4Var;
    }

    public final void a(int i, ld4 ld4Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar) {
        iqb iqbVar2;
        int i2;
        zy7 zy7Var3;
        e18 e18Var;
        iqbVar.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1855653376);
        if ((i & 6) == 0) {
            iqbVar2 = iqbVar;
            i2 = (e18Var2.f(iqbVar2) ? 4 : 2) | i;
        } else {
            iqbVar2 = iqbVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var3 = zy7Var;
            i2 |= e18Var2.h(zy7Var3) ? 32 : 16;
        } else {
            zy7Var3 = zy7Var;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(this) : e18Var2.h(this) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        final int i3 = 1;
        final int i4 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            ContentResolver contentResolver = ((Context) e18Var2.j(w00.b)).getContentResolver();
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new kwc();
                e18Var2.k0(objN);
            }
            final kwc kwcVar = (kwc) objN;
            m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
            boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                objN2 = m7fVarN.a(jce.a.b(rc8.class), null, null);
                e18Var2.k0(objN2);
            }
            e18Var2.p(false);
            e18Var2.p(false);
            int max_per_message_upload_count = amk.c((rc8) objN2).getMax_per_message_upload_count();
            if (max_per_message_upload_count < 1) {
                max_per_message_upload_count = 1;
            }
            boolean zH = e18Var2.h(kwcVar);
            Object objN3 = e18Var2.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new bz7() { // from class: qt4
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        int i5 = i4;
                        iei ieiVar = iei.a;
                        kwc kwcVar2 = kwcVar;
                        switch (i5) {
                            case 0:
                                List list = (List) obj;
                                list.getClass();
                                ap1 ap1Var = kwcVar2.a;
                                v84 v84Var = ap1Var.a;
                                if (v84Var != null) {
                                    v84Var.c0(list);
                                }
                                ap1Var.a = null;
                                break;
                            case 1:
                                File file = (File) obj;
                                ap1 ap1Var2 = kwcVar2.b;
                                v84 v84Var2 = ap1Var2.a;
                                if (v84Var2 != null) {
                                    v84Var2.c0(file);
                                }
                                ap1Var2.a = null;
                                break;
                            default:
                                List list2 = (List) obj;
                                list2.getClass();
                                ap1 ap1Var3 = kwcVar2.c;
                                v84 v84Var3 = ap1Var3.a;
                                if (v84Var3 != null) {
                                    v84Var3.c0(list2);
                                }
                                ap1Var3.a = null;
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var2.k0(objN3);
            }
            q2d q2dVarI = uuj.i(max_per_message_upload_count, false, (bz7) objN3, e18Var2, 0, 2);
            boolean zH2 = e18Var2.h(kwcVar);
            Object objN4 = e18Var2.N();
            if (zH2 || objN4 == lz1Var) {
                objN4 = new bz7() { // from class: qt4
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        int i5 = i3;
                        iei ieiVar = iei.a;
                        kwc kwcVar2 = kwcVar;
                        switch (i5) {
                            case 0:
                                List list = (List) obj;
                                list.getClass();
                                ap1 ap1Var = kwcVar2.a;
                                v84 v84Var = ap1Var.a;
                                if (v84Var != null) {
                                    v84Var.c0(list);
                                }
                                ap1Var.a = null;
                                break;
                            case 1:
                                File file = (File) obj;
                                ap1 ap1Var2 = kwcVar2.b;
                                v84 v84Var2 = ap1Var2.a;
                                if (v84Var2 != null) {
                                    v84Var2.c0(file);
                                }
                                ap1Var2.a = null;
                                break;
                            default:
                                List list2 = (List) obj;
                                list2.getClass();
                                ap1 ap1Var3 = kwcVar2.c;
                                v84 v84Var3 = ap1Var3.a;
                                if (v84Var3 != null) {
                                    v84Var3.c0(list2);
                                }
                                ap1Var3.a = null;
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var2.k0(objN4);
            }
            l4h l4hVarM = u00.M(e18Var2, (bz7) objN4);
            boolean zH3 = e18Var2.h(kwcVar);
            Object objN5 = e18Var2.N();
            if (zH3 || objN5 == lz1Var) {
                final int i5 = 2;
                objN5 = new bz7() { // from class: qt4
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        int i52 = i5;
                        iei ieiVar = iei.a;
                        kwc kwcVar2 = kwcVar;
                        switch (i52) {
                            case 0:
                                List list = (List) obj;
                                list.getClass();
                                ap1 ap1Var = kwcVar2.a;
                                v84 v84Var = ap1Var.a;
                                if (v84Var != null) {
                                    v84Var.c0(list);
                                }
                                ap1Var.a = null;
                                break;
                            case 1:
                                File file = (File) obj;
                                ap1 ap1Var2 = kwcVar2.b;
                                v84 v84Var2 = ap1Var2.a;
                                if (v84Var2 != null) {
                                    v84Var2.c0(file);
                                }
                                ap1Var2.a = null;
                                break;
                            default:
                                List list2 = (List) obj;
                                list2.getClass();
                                ap1 ap1Var3 = kwcVar2.c;
                                v84 v84Var3 = ap1Var3.a;
                                if (v84Var3 != null) {
                                    v84Var3.c0(list2);
                                }
                                ap1Var3.a = null;
                                break;
                        }
                        return ieiVar;
                    }
                };
                e18Var2.k0(objN5);
            }
            ti7 ti7VarA = ui7.a(null, (bz7) objN5, e18Var2, 0, 1);
            boolean zF2 = e18Var2.f(contentResolver) | e18Var2.f(q2dVarI) | e18Var2.f(l4hVarM) | e18Var2.f(ti7VarA);
            Object objN6 = e18Var2.N();
            if (zF2 || objN6 == lz1Var) {
                objN6 = new dx4(new py(kwcVar, q2dVarI, contentResolver, null, 3), l4hVarM != null ? new ny(kwcVar, l4hVarM, null, 5) : null, new py(kwcVar, ti7VarA, contentResolver, null, 4));
                e18Var2.k0(objN6);
            }
            int i6 = i2 & 14;
            us4 us4Var = us4.e;
            int i7 = i2 << 6;
            a.a(iqbVar2, this.a, (dx4) objN6, zy7Var3, zy7Var2, e18Var2, i6 | (i7 & 7168) | (i7 & 57344));
            e18Var = e18Var2;
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(this, iqbVar, zy7Var, zy7Var2, i, 24);
        }
    }
}
