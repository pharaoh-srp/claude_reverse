package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pw implements c6c {
    public final ze4 a;
    public final ArrayList b;

    public pw(ze4 ze4Var, ArrayList arrayList) {
        this.a = ze4Var;
        this.b = arrayList;
    }

    @Override // defpackage.kw7
    public final af4 a() {
        return this.a.a();
    }

    @Override // defpackage.kw7
    public final auc b() {
        d8a d8aVarE = x44.E();
        d8aVarE.add(this.a.b());
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            d8aVarE.add(((kw7) it.next()).b());
        }
        return new auc(lm6.E, x44.v(d8aVarE));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pw)) {
            return false;
        }
        pw pwVar = (pw) obj;
        return this.a.equals(pwVar.a) && this.b.equals(pwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "AlternativesParsing(" + this.b + ')';
    }
}
