package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ds9 {
    public static final ds9 a = new ds9();

    public static j7g b(j7g j7gVar) {
        yr9 yr9VarB;
        u9i u9iVarO = j7gVar.O();
        qa9 qa9Var = null;
        fhiVarK0 = null;
        fhi fhiVarK0 = null;
        if (u9iVarO instanceof jc2) {
            jc2 jc2Var = (jc2) u9iVarO;
            vai vaiVarD = jc2Var.d();
            if (vaiVarD.a() != 2) {
                vaiVarD = null;
            }
            if (vaiVarD != null && (yr9VarB = vaiVarD.b()) != null) {
                fhiVarK0 = yr9VarB.k0();
            }
            fhi fhiVar = fhiVarK0;
            if (jc2Var.e() == null) {
                vai vaiVarD2 = jc2Var.d();
                Collection collectionB = jc2Var.b();
                ArrayList arrayList = new ArrayList(x44.y(collectionB, 10));
                Iterator it = collectionB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((yr9) it.next()).k0());
                }
                jc2Var.g(new l2c(vaiVarD2, arrayList));
            }
            l2c l2cVarE = jc2Var.e();
            l2cVarE.getClass();
            return new i2c(1, l2cVarE, fhiVar, j7gVar.K(), j7gVar.b0(), 32);
        }
        if (!(u9iVarO instanceof qa9) || !j7gVar.b0()) {
            return j7gVar;
        }
        qa9 qa9Var2 = (qa9) u9iVarO;
        LinkedHashSet linkedHashSet = qa9Var2.b;
        ArrayList arrayList2 = new ArrayList(x44.y(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            arrayList2.add(jwk.C((yr9) it2.next()));
            z = true;
        }
        if (z) {
            yr9 yr9Var = qa9Var2.a;
            yr9 yr9VarC = yr9Var != null ? jwk.C(yr9Var) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            qa9 qa9Var3 = new qa9(linkedHashSet2);
            qa9Var3.a = yr9VarC;
            qa9Var = qa9Var3;
        }
        if (qa9Var != null) {
            qa9Var2 = qa9Var;
        }
        return qa9Var2.e();
    }

    public final fhi a(cs9 cs9Var) {
        fhi fhiVarZ;
        cs9Var.getClass();
        if (!(cs9Var instanceof yr9)) {
            sz6.p("Failed requirement.");
            return null;
        }
        fhi fhiVarK0 = ((yr9) cs9Var).k0();
        if (fhiVarK0 instanceof j7g) {
            fhiVarZ = b((j7g) fhiVarK0);
        } else {
            if (!(fhiVarK0 instanceof sn7)) {
                mr9.b();
                return null;
            }
            sn7 sn7Var = (sn7) fhiVarK0;
            j7g j7gVar = sn7Var.G;
            j7g j7gVar2 = sn7Var.F;
            j7g j7gVarB = b(j7gVar2);
            j7g j7gVarB2 = b(j7gVar);
            fhiVarZ = (j7gVarB == j7gVar2 && j7gVarB2 == j7gVar) ? fhiVarK0 : yfd.z(j7gVarB, j7gVarB2);
        }
        return nwk.i(fhiVarZ, fhiVarK0, new b16(2, this));
    }
}
