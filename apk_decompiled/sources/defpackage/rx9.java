package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class rx9 implements jc0, z9d {
    public static final /* synthetic */ wn9[] h;
    public final el5 a;
    public final zae b;
    public final cfa c;
    public final dfa d;
    public final ize e;
    public final dfa f;
    public final boolean g;

    static {
        kce kceVar = jce.a;
        h = new wn9[]{kceVar.g(new mrd(kceVar.b(rx9.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), kceVar.g(new mrd(kceVar.b(rx9.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), kceVar.g(new mrd(kceVar.b(rx9.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public rx9(el5 el5Var, zae zaeVar, boolean z) {
        el5Var.getClass();
        zaeVar.getClass();
        this.a = el5Var;
        this.b = zaeVar;
        ke9 ke9Var = (ke9) el5Var.E;
        gfa gfaVar = ke9Var.a;
        qx9 qx9Var = new qx9(this, 1);
        gfaVar.getClass();
        this.c = new cfa(gfaVar, qx9Var);
        qx9 qx9Var2 = new qx9(this, 2);
        gfaVar.getClass();
        this.d = new dfa(gfaVar, qx9Var2);
        ke9Var.j.getClass();
        this.e = ql8.x(zaeVar);
        qx9 qx9Var3 = new qx9(this, 0);
        gfaVar.getClass();
        this.f = new dfa(gfaVar, qx9Var3);
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final il4 a(abe abeVar) {
        yr9 yr9VarH;
        if (abeVar instanceof rbe) {
            return pyk.y0(null, ((rbe) abeVar).b);
        }
        if (abeVar instanceof pbe) {
            Enum r6 = ((pbe) abeVar).b;
            Class<?> enclosingClass = r6.getClass();
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            enclosingClass.getClass();
            return new mq6(yae.a(enclosingClass), sxb.e(r6.name()));
        }
        boolean z = abeVar instanceof cbe;
        el5 el5Var = this.a;
        if (z) {
            cbe cbeVar = (cbe) abeVar;
            sxb sxbVar = cbeVar.a;
            if (sxbVar == null) {
                sxbVar = mj9.b;
            }
            sxbVar.getClass();
            ArrayList arrayListA = cbeVar.a();
            j7g j7gVar = (j7g) wd6.s0(this.d, h[1]);
            j7gVar.getClass();
            if (!ttj.j(j7gVar)) {
                qqb qqbVarD = o06.d(this);
                qqbVarD.getClass();
                eri eriVarE = ac1.e(sxbVar, qqbVarD);
                if (eriVarE == null || (yr9VarH = eriVarE.getType()) == null) {
                    yr9VarH = ((ke9) el5Var.E).o.f().h(nu6.c(mu6.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
                }
                ArrayList arrayList = new ArrayList(x44.y(arrayListA, 10));
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    il4 il4VarA = a((abe) it.next());
                    if (il4VarA == null) {
                        il4VarA = new m9c(null);
                    }
                    arrayList.add(il4VarA);
                }
                return new hbi(arrayList, yr9VarH);
            }
        } else {
            if (abeVar instanceof bbe) {
                return new uc0((Object) new rx9(el5Var, new zae(((bbe) abeVar).b), false));
            }
            if (abeVar instanceof lbe) {
                Class cls = ((lbe) abeVar).b;
                yr9 yr9VarQ = ((fj0) el5Var.I).Q(cls.isPrimitive() ? new vbe(cls) : ((cls instanceof GenericArrayType) || cls.isArray()) ? new dbe(cls) : cls instanceof WildcardType ? new ace((WildcardType) cls) : new mbe(cls), oyk.j(2, false, null, 7));
                if (!ttj.j(yr9VarQ)) {
                    yr9 yr9VarB = yr9VarQ;
                    int i = 0;
                    while (or9.x(yr9VarB)) {
                        yr9VarB = ((vai) w44.e1(yr9VarB.H())).b();
                        yr9VarB.getClass();
                        i++;
                    }
                    xh3 xh3VarA = yr9VarB.O().a();
                    if (xh3VarA instanceof qqb) {
                        gh3 gh3VarF = o06.f(xh3VarA);
                        return gh3VarF == null ? new bm9(new yl9(yr9VarQ)) : new bm9(gh3VarF, i);
                    }
                    if (xh3VarA instanceof qai) {
                        return new bm9(gh3.j(okg.a.g()), 0);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.jc0
    public final neg d() {
        return this.e;
    }

    @Override // defpackage.jc0
    public final ww7 e() {
        wn9 wn9Var = h[0];
        cfa cfaVar = this.c;
        cfaVar.getClass();
        wn9Var.getClass();
        return (ww7) cfaVar.a();
    }

    @Override // defpackage.jc0
    public final Map f() {
        return (Map) wd6.s0(this.f, h[2]);
    }

    @Override // defpackage.jc0
    public final yr9 getType() {
        return (j7g) wd6.s0(this.d, h[1]);
    }

    public final String toString() {
        return g06.c.y(this, null);
    }
}
