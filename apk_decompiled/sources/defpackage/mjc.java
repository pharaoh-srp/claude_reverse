package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class mjc implements c6c {
    public final String a;
    public final ze4 b;
    public final ArrayList c;

    public mjc(String str, ze4 ze4Var) {
        this.a = str;
        this.b = ze4Var;
        d8a d8aVarE = x44.E();
        qok.b(d8aVarE, ze4Var);
        d8a d8aVarV = x44.v(d8aVarE);
        ArrayList arrayList = new ArrayList(x44.y(d8aVarV, 10));
        ListIterator listIterator = d8aVarV.listIterator(0);
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                break;
            } else {
                arrayList.add(((oh7) c8aVar.next()).c());
            }
        }
        List<h1> listP1 = w44.p1(w44.s1(arrayList));
        ArrayList arrayList2 = new ArrayList(x44.y(listP1, 10));
        for (h1 h1Var : listP1) {
            h1Var.getClass();
            Object objB = h1Var.b();
            if (objB == null) {
                xh6.l(h1Var.c(), "' does not define a default value", "The field '");
                throw null;
            }
            arrayList2.add(new ljc(h1Var.a(), objB));
        }
        this.c = arrayList2;
    }

    @Override // defpackage.kw7
    public final af4 a() {
        af4 af4VarA = this.b.a();
        ArrayList<ljc> arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        for (ljc ljcVar : arrayList) {
            arrayList2.add(new t84(ljcVar.b, new pac(1, ljcVar.a, drd.class, "getter", "getter(Ljava/lang/Object;)Ljava/lang/Object;", 0, 9)));
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        n8i n8iVar = n8i.a;
        Object ig4Var = zIsEmpty ? n8iVar : arrayList2.size() == 1 ? (gbd) w44.e1(arrayList2) : new ig4(arrayList2);
        if (ig4Var instanceof n8i) {
            return new af4();
        }
        x44.X(new cpc(new pac(1, ig4Var, gbd.class, "test", "test(Ljava/lang/Object;)Z", 0, 10), new af4()), new cpc(new pac(1, n8iVar, n8i.class, "test", "test(Ljava/lang/Object;)Z", 0, 11), af4VarA));
        return new af4();
    }

    @Override // defpackage.kw7
    public final auc b() {
        auc aucVarB = this.b.b();
        auc aucVarB2 = new gl4(this.a).b();
        boolean zIsEmpty = this.c.isEmpty();
        lm6 lm6Var = lm6.E;
        return new auc(lm6Var, x44.X(aucVarB, kud.f(x44.X(aucVarB2, new auc(zIsEmpty ? lm6Var : x44.W(new vdi(new tl8(25, this))), lm6Var)))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mjc)) {
            return false;
        }
        mjc mjcVar = (mjc) obj;
        return this.a.equals(mjcVar.a) && this.b.equals(mjcVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Optional(" + this.a + ", " + this.b + ')';
    }
}
