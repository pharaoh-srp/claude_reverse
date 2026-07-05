package defpackage;

import com.anthropic.claude.api.errors.ClaudeApiError$AuthError;
import com.anthropic.claude.api.errors.ClaudeApiError$InvalidRequestError;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rkk {
    public static final ta4 a = new ta4(1447158413, false, new pb4(10));

    public static final void a(awb awbVar, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1042600347);
        int i2 = 1;
        if ((((e18Var.h(awbVar) ? 4 : 2) | i | (e18Var.h(zy7Var) ? 32 : 16)) & 19) == 18 && e18Var.C()) {
            e18Var.T();
        } else if (awbVar.get() != null) {
            if (!(e18Var.a instanceof hqa)) {
                iuj.A();
                throw null;
            }
            e18Var.Y();
            if (e18Var.S) {
                e18Var.k(zy7Var);
            } else {
                e18Var.n0();
            }
            e18Var.p(true);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lpa(awbVar, zy7Var, i, i2);
        }
    }

    public static final void b(awb awbVar, pz7 pz7Var, Object obj, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-649632125);
        hqa hqaVar = (hqa) e18Var.a;
        e18Var.a0(1495685668);
        boolean zH = e18Var.h(hqaVar) | e18Var.h(obj);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            objN = new yg4(hqaVar, pz7Var, obj, 29);
            e18Var.k0(objN);
        }
        e18Var.p(false);
        a(awbVar, (zy7) objN, e18Var, 0);
        e18Var.p(false);
    }

    public static final void c(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1792062778);
        if (i == 0 && e18Var.C()) {
            e18Var.T();
        } else {
            pqa pqaVar = ((hqa) e18Var.a).K;
            e18Var.a0(1577826274);
            xqa xqaVar = new xqa(0, 2, pqa.class, pqaVar, "indoorStateChangeListener", "getIndoorStateChangeListener()Lcom/google/maps/android/compose/IndoorStateChangeListener;");
            e18Var.a0(-568962266);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = ara.E;
                e18Var.k0(objN);
            }
            e18Var.p(false);
            b(xqaVar, (pz7) ((jm9) objN), new bra(xqaVar), e18Var);
            e18Var.p(false);
            e18Var.a0(1577843195);
            xqa xqaVar2 = new xqa(0, 3, pqa.class, pqaVar, "onMapClick", "getOnMapClick()Lkotlin/jvm/functions/Function1;");
            e18Var.a0(-568945059);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = cra.E;
                e18Var.k0(objN2);
            }
            e18Var.p(false);
            pz7 pz7Var = (pz7) ((jm9) objN2);
            e18Var.a0(-568943446);
            boolean zH = e18Var.h(xqaVar2);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new qqa(xqaVar2);
                e18Var.k0(objN3);
            }
            e18Var.p(false);
            b(xqaVar2, pz7Var, (qqa) objN3, e18Var);
            e18Var.p(false);
            e18Var.a0(1577851107);
            xqa xqaVar3 = new xqa(0, 4, pqa.class, pqaVar, "onMapLongClick", "getOnMapLongClick()Lkotlin/jvm/functions/Function1;");
            e18Var.a0(-568937151);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = dra.E;
                e18Var.k0(objN4);
            }
            e18Var.p(false);
            pz7 pz7Var2 = (pz7) ((jm9) objN4);
            e18Var.a0(-568935410);
            boolean zH2 = e18Var.h(xqaVar3);
            Object objN5 = e18Var.N();
            if (zH2 || objN5 == lz1Var) {
                objN5 = new rqa(xqaVar3);
                e18Var.k0(objN5);
            }
            e18Var.p(false);
            b(xqaVar3, pz7Var2, (rqa) objN5, e18Var);
            e18Var.p(false);
            e18Var.a0(1577859163);
            xqa xqaVar4 = new xqa(0, 5, pqa.class, pqaVar, "onMapLoaded", "getOnMapLoaded()Lkotlin/jvm/functions/Function0;");
            e18Var.a0(-568929090);
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = era.E;
                e18Var.k0(objN6);
            }
            e18Var.p(false);
            pz7 pz7Var3 = (pz7) ((jm9) objN6);
            e18Var.a0(-568927447);
            boolean zH3 = e18Var.h(xqaVar4);
            Object objN7 = e18Var.N();
            if (zH3 || objN7 == lz1Var) {
                objN7 = new sqa(xqaVar4);
                e18Var.k0(objN7);
            }
            e18Var.p(false);
            b(xqaVar4, pz7Var3, (sqa) objN7, e18Var);
            e18Var.p(false);
            e18Var.a0(1577867388);
            xqa xqaVar5 = new xqa(0, 6, pqa.class, pqaVar, "onMyLocationButtonClick", "getOnMyLocationButtonClick()Lkotlin/jvm/functions/Function0;");
            e18Var.a0(-568920886);
            Object objN8 = e18Var.N();
            if (objN8 == lz1Var) {
                objN8 = wqa.E;
                e18Var.k0(objN8);
            }
            e18Var.p(false);
            pz7 pz7Var4 = (pz7) ((jm9) objN8);
            e18Var.a0(-568918850);
            boolean zH4 = e18Var.h(xqaVar5);
            Object objN9 = e18Var.N();
            if (zH4 || objN9 == lz1Var) {
                objN9 = new tqa(xqaVar5);
                e18Var.k0(objN9);
            }
            e18Var.p(false);
            b(xqaVar5, pz7Var4, (tqa) objN9, e18Var);
            e18Var.p(false);
            e18Var.a0(1577876425);
            xqa xqaVar6 = new xqa(0, 0, pqa.class, pqaVar, "onMyLocationClick", "getOnMyLocationClick()Lkotlin/jvm/functions/Function1;");
            e18Var.a0(-568911836);
            Object objN10 = e18Var.N();
            if (objN10 == lz1Var) {
                objN10 = yqa.E;
                e18Var.k0(objN10);
            }
            e18Var.p(false);
            pz7 pz7Var5 = (pz7) ((jm9) objN10);
            e18Var.a0(-568909999);
            boolean zH5 = e18Var.h(xqaVar6);
            Object objN11 = e18Var.N();
            if (zH5 || objN11 == lz1Var) {
                objN11 = new uqa(xqaVar6);
                e18Var.k0(objN11);
            }
            e18Var.p(false);
            b(xqaVar6, pz7Var5, (uqa) objN11, e18Var);
            e18Var.p(false);
            e18Var.a0(1577884635);
            xqa xqaVar7 = new xqa(0, 1, pqa.class, pqaVar, "onPOIClick", "getOnPOIClick()Lkotlin/jvm/functions/Function1;");
            e18Var.a0(-568903619);
            Object objN12 = e18Var.N();
            if (objN12 == lz1Var) {
                objN12 = zqa.E;
                e18Var.k0(objN12);
            }
            e18Var.p(false);
            pz7 pz7Var6 = (pz7) ((jm9) objN12);
            e18Var.a0(-568902006);
            boolean zH6 = e18Var.h(xqaVar7);
            Object objN13 = e18Var.N();
            if (zH6 || objN13 == lz1Var) {
                objN13 = new vqa(xqaVar7);
                e18Var.k0(objN13);
            }
            e18Var.p(false);
            b(xqaVar7, pz7Var6, (vqa) objN13, e18Var);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uw8(i, 10);
        }
    }

    public static final zae d(Annotation[] annotationArr, ww7 ww7Var) {
        Annotation annotation;
        annotationArr.getClass();
        ww7Var.getClass();
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (yae.a(ez1.I(ez1.H(annotation))).b().equals(ww7Var)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new zae(annotation);
        }
        return null;
    }

    public static w9 e(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("name");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), w9.d)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            strM.getClass();
            return new w9(strM, strM2, linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Account", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Account", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Account", e3);
            return null;
        }
    }

    public static lbh f(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("architecture");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("brand");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("model");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("logical_cpu_count");
            Number numberL = bh9VarS4 != null ? bh9VarS4.l() : null;
            bh9 bh9VarS5 = qh9Var.s("total_ram");
            Number numberL2 = bh9VarS5 != null ? bh9VarS5.l() : null;
            bh9 bh9VarS6 = qh9Var.s("is_low_ram");
            return new lbh(strM, strM2, strM3, numberL, numberL2, bh9VarS6 != null ? Boolean.valueOf(bh9VarS6.a()) : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Device", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Device", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Device", e3);
            return null;
        }
    }

    public static final ArrayList g(Annotation[] annotationArr) {
        annotationArr.getClass();
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new zae(annotation));
        }
        return arrayList;
    }

    public static final boolean h(bj3 bj3Var) {
        return (bj3Var instanceof ClaudeApiError$AuthError) && ((ClaudeApiError$AuthError) bj3Var).a == vi3.I;
    }

    public static final boolean i(bj3 bj3Var) {
        bj3Var.getClass();
        String f = bj3Var.getF();
        yi3 yi3Var = yi3.N;
        return x44.r(f, yi3Var.E) || bj3Var.c(yi3Var) || ((bj3Var instanceof ClaudeApiError$InvalidRequestError) && isg.q0(((ClaudeApiError$InvalidRequestError) bj3Var).d, "Another response is already running", false));
    }

    public static final Object p(qvb qvbVar) {
        if (qvbVar.h()) {
            pmf.h("List is empty.");
            return null;
        }
        int i = qvbVar.b - 1;
        Object objF = qvbVar.f(i);
        qvbVar.k(i);
        return objF;
    }

    public void j(y6j y6jVar, int i, String str) {
        y6jVar.getClass();
        str.getClass();
    }

    public abstract void k(y6j y6jVar, int i, String str);

    public abstract void l(y6j y6jVar, Exception exc, pqe pqeVar);

    public abstract void m(y6j y6jVar, String str);

    public void n(y6j y6jVar, ByteString byteString) {
    }

    public void o(y6j y6jVar, pqe pqeVar) {
    }
}
