package defpackage;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class u6g implements c6c {
    public final xe1 a;
    public final Set b;

    public u6g(xe1 xe1Var) {
        this.a = xe1Var;
        d8a d8aVarE = x44.E();
        qok.b(d8aVarE, xe1Var);
        d8a d8aVarV = x44.v(d8aVarE);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = d8aVarV.listIterator(0);
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                break;
            }
            kcc kccVarD = ((oh7) c8aVar.next()).c().d();
            if (kccVarD != null) {
                arrayList.add(kccVarD);
            }
        }
        Set setT1 = w44.t1(arrayList);
        this.b = setT1;
        if (setT1.isEmpty()) {
            sz6.p("Signed format must contain at least one field with a sign");
            throw null;
        }
    }

    @Override // defpackage.kw7
    public final af4 a() {
        this.a.a.a();
        return new af4();
    }

    @Override // defpackage.kw7
    public final auc b() {
        return kud.f(x44.X(new auc(x44.W(new n6g(new ska(27, this), "sign for " + this.b)), lm6.E), this.a.a.b()));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u6g) {
            return this.a.equals(((u6g) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignedFormatStructure(" + this.a + ')';
    }
}
