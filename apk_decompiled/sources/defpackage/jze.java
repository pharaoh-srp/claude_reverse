package defpackage;

import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes.dex */
public abstract class jze {
    public static final gh3 a = gh3.j(new ww7("java.lang.Void"));

    /* JADX WARN: Multi-variable type inference failed */
    public static gk9 a(h08 h08Var) {
        String strI = mwj.i(h08Var);
        if (strI == null) {
            if (h08Var instanceof krd) {
                String strB = o06.i(h08Var).getName().b();
                strB.getClass();
                strI = lj9.a(strB);
            } else if (h08Var instanceof prd) {
                String strB2 = o06.i(h08Var).getName().b();
                strB2.getClass();
                strI = lj9.b(strB2);
            } else {
                strI = ((co5) h08Var).getName().b();
                strI.getClass();
            }
        }
        return new gk9(new ik9(strI, csk.e(h08Var, 1)));
    }

    public static ne5 b(hrd hrdVar) {
        hrdVar.getClass();
        hrd hrdVarA = ((hrd) m06.t(hrdVar)).a();
        hrdVarA.getClass();
        if (hrdVarA instanceof o16) {
            o16 o16Var = (o16) hrdVarA;
            ctd ctdVarV0 = o16Var.V0();
            t28 t28Var = el9.d;
            t28Var.getClass();
            yk9 yk9Var = (yk9) uik.i(ctdVarV0, t28Var);
            if (yk9Var != null) {
                return new qk9(hrdVarA, ctdVarV0, yk9Var, o16Var.J(), o16Var.C());
            }
        } else if (hrdVarA instanceof je9) {
            neg negVarD = ((je9) hrdVarA).d();
            ize izeVar = negVarD instanceof ize ? (ize) negVarD : null;
            obe obeVarB = izeVar != null ? izeVar.b() : null;
            if (obeVarB instanceof qbe) {
                return new ok9(((qbe) obeVarB).j());
            }
            if (!(obeVarB instanceof tbe)) {
                mr9.l("Incorrect resolution sequence for Java field ", hrdVarA, " (source = ", obeVarB);
                return null;
            }
            Method methodJ = ((tbe) obeVarB).j();
            prd prdVar = ((jrd) hrdVarA).b0;
            neg negVarD2 = prdVar != null ? prdVar.d() : null;
            ize izeVar2 = negVarD2 instanceof ize ? (ize) negVarD2 : null;
            obe obeVarB2 = izeVar2 != null ? izeVar2.b() : null;
            tbe tbeVar = obeVarB2 instanceof tbe ? (tbe) obeVarB2 : null;
            return new pk9(methodJ, tbeVar != null ? tbeVar.j() : null);
        }
        krd krdVarB = hrdVarA.b();
        krdVarB.getClass();
        gk9 gk9VarA = a(krdVarB);
        prd prdVarC = hrdVarA.c();
        return new rk9(gk9VarA, prdVarC != null ? a(prdVarC) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static wb5 c(h08 h08Var) {
        Method methodJ;
        h08Var.getClass();
        h08 h08VarA = ((h08) m06.t(h08Var)).a();
        h08VarA.getClass();
        if (h08VarA instanceof u06) {
            u06 u06Var = (u06) h08VarA;
            b3 b3VarT = u06Var.t();
            if (b3VarT instanceof usd) {
                oc7 oc7Var = fl9.a;
                ik9 ik9VarC = fl9.c((usd) b3VarT, u06Var.J(), u06Var.C());
                if (ik9VarC != null) {
                    return new gk9(ik9VarC);
                }
            }
            if (b3VarT instanceof gsd) {
                oc7 oc7Var2 = fl9.a;
                ik9 ik9VarA = fl9.a((gsd) b3VarT, u06Var.J(), u06Var.C());
                if (ik9VarA != null) {
                    bo5 bo5VarH = h08Var.h();
                    bo5VarH.getClass();
                    return g39.a(bo5VarH) ? new gk9(ik9VarA) : new fk9(ik9VarA);
                }
            }
            return a(h08VarA);
        }
        if (h08VarA instanceof ge9) {
            neg negVarD = ((ge9) h08VarA).d();
            ize izeVar = negVarD instanceof ize ? (ize) negVarD : null;
            obe obeVarB = izeVar != null ? izeVar.b() : null;
            tbe tbeVar = obeVarB instanceof tbe ? (tbe) obeVarB : null;
            if (tbeVar != null && (methodJ = tbeVar.j()) != null) {
                return new ek9(methodJ);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + h08VarA);
        }
        if (h08VarA instanceof wd9) {
            neg negVarD2 = ((wd9) h08VarA).d();
            ize izeVar2 = negVarD2 instanceof ize ? (ize) negVarD2 : null;
            obe obeVarB2 = izeVar2 != null ? izeVar2.b() : null;
            if (obeVarB2 instanceof nbe) {
                return new dk9(((nbe) obeVarB2).j());
            }
            if (obeVarB2 instanceof jbe) {
                jbe jbeVar = (jbe) obeVarB2;
                if (jbeVar.i()) {
                    return new ck9(jbeVar.b());
                }
            }
            mr9.l("Incorrect resolution sequence for Java constructor ", h08VarA, " (", obeVarB2);
            return null;
        }
        if (!xzk.C(h08VarA) && !xzk.D(h08VarA)) {
            sxb name = ((co5) h08VarA).getName();
            sxb sxbVar = yp3.e;
            if (!x44.r(name, ulk.f()) || !h08VarA.I().isEmpty()) {
                StringBuilder sb = new StringBuilder("Unknown origin of ");
                sb.append(h08VarA);
                Object obj = h08VarA.getClass();
                sb.append(" (");
                sb.append(obj);
                sb.append(')');
                throw new KotlinReflectionInternalError(sb.toString());
            }
        }
        return a(h08VarA);
    }
}
