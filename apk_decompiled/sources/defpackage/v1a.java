package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public final class v1a extends qqb {
    public final qqb E;
    public final a F;
    public a G;
    public ArrayList H;
    public ArrayList I;
    public ph3 J;

    public v1a(qqb qqbVar, a aVar) {
        this.E = qqbVar;
        this.F = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void t0(int r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v1a.t0(int):void");
    }

    @Override // defpackage.bo5
    public final Object E(fo5 fo5Var, Object obj) {
        return fo5Var.y(this, obj);
    }

    @Override // defpackage.qqb
    public final fab H(bbi bbiVar, es9 es9Var) {
        fab fabVarH = this.E.H(bbiVar, es9Var);
        if (!this.F.a.f()) {
            return new wwg(fabVarH, u0());
        }
        if (fabVarH != null) {
            return fabVarH;
        }
        t0(7);
        throw null;
    }

    @Override // defpackage.qqb
    /* JADX INFO: renamed from: K */
    public final qqb a() {
        qqb qqbVarA = this.E.a();
        if (qqbVarA != null) {
            return qqbVarA;
        }
        t0(21);
        throw null;
    }

    @Override // defpackage.qqb
    public final Collection O() {
        Collection collectionO = this.E.O();
        if (collectionO != null) {
            return collectionO;
        }
        t0(31);
        throw null;
    }

    @Override // defpackage.qqb, defpackage.xh3
    public final j7g W() {
        r9i r9iVarB;
        List listD = fbi.d(p().getParameters());
        wc0 annotations = getAnnotations();
        if (annotations.isEmpty()) {
            r9i.F.getClass();
            r9iVarB = r9i.G;
        } else {
            cbf cbfVar = r9i.F;
            List listW = x44.W(new yc0(annotations));
            cbfVar.getClass();
            r9iVarB = cbf.b(listW);
        }
        return yfd.d0(l0(), r9iVarB, p(), listD, false);
    }

    @Override // defpackage.qqb
    public final fab b0() {
        fab fabVarB0 = this.E.b0();
        if (fabVarB0 != null) {
            return fabVarB0;
        }
        t0(15);
        throw null;
    }

    @Override // defpackage.do5
    public final neg d() {
        return neg.n;
    }

    @Override // defpackage.vwg
    public final do5 e(a aVar) {
        if (aVar != null) {
            bbi bbiVar = aVar.a;
            return bbiVar.f() ? this : new v1a(this, a.f(bbiVar, u0().a));
        }
        t0(23);
        throw null;
    }

    @Override // defpackage.w9b
    public final boolean g0() {
        return this.E.g0();
    }

    @Override // defpackage.ub0
    public final wc0 getAnnotations() {
        wc0 annotations = this.E.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        t0(19);
        throw null;
    }

    @Override // defpackage.bo5
    public final sxb getName() {
        sxb name = this.E.getName();
        if (name != null) {
            return name;
        }
        t0(20);
        throw null;
    }

    @Override // defpackage.qqb, defpackage.go5, defpackage.w9b
    public final ow5 getVisibility() {
        ow5 visibility = this.E.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        t0(27);
        throw null;
    }

    @Override // defpackage.bo5
    public final bo5 h() {
        bo5 bo5VarH = this.E.h();
        if (bo5VarH != null) {
            return bo5VarH;
        }
        t0(22);
        throw null;
    }

    @Override // defpackage.qqb, defpackage.yh3
    public final List i0() {
        u0();
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            return arrayList;
        }
        t0(30);
        throw null;
    }

    @Override // defpackage.w9b
    public final boolean isExternal() {
        return this.E.isExternal();
    }

    @Override // defpackage.qqb
    public final boolean isInline() {
        return this.E.isInline();
    }

    @Override // defpackage.qqb
    public final Collection j() {
        Collection<tg3> collectionJ = this.E.j();
        ArrayList arrayList = new ArrayList(collectionJ.size());
        for (tg3 tg3Var : collectionJ) {
            tg3Var.getClass();
            i08 i08VarT0 = tg3Var.T0(a.b);
            i08VarT0.I = tg3Var.a();
            i08VarT0.v(tg3Var.q());
            i08VarT0.b(tg3Var.getVisibility());
            i08VarT0.c(tg3Var.getKind());
            i08VarT0.Q = false;
            arrayList.add(((tg3) i08VarT0.b0.Q0(i08VarT0)).e(u0()));
        }
        return arrayList;
    }

    @Override // defpackage.qqb
    public final l6e j0() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qqb
    public final List k() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        t0(17);
        throw null;
    }

    @Override // defpackage.qqb
    public final fab k0() {
        fab fabVarK0 = this.E.k0();
        if (fabVarK0 != null) {
            return fabVarK0;
        }
        t0(28);
        throw null;
    }

    @Override // defpackage.qqb
    public final fab l0() {
        o06.h(m06.d(this.E));
        return m0(es9.a);
    }

    @Override // defpackage.qqb
    public final int m() {
        int iM = this.E.m();
        if (iM != 0) {
            return iM;
        }
        t0(25);
        throw null;
    }

    @Override // defpackage.qqb
    public final fab m0(es9 es9Var) {
        fab fabVarM0 = this.E.m0(es9Var);
        if (!this.F.a.f()) {
            return new wwg(fabVarM0, u0());
        }
        if (fabVarM0 != null) {
            return fabVarM0;
        }
        t0(14);
        throw null;
    }

    @Override // defpackage.qqb
    public final tg3 n0() {
        return this.E.n0();
    }

    @Override // defpackage.qqb
    public final fab o(bbi bbiVar) {
        o06.h(m06.d(this));
        return H(bbiVar, es9.a);
    }

    @Override // defpackage.qqb
    public final sqi o0() {
        sqi sqiVarO0 = this.E.o0();
        if (sqiVarO0 == null) {
            return null;
        }
        boolean z = sqiVarO0 instanceof f39;
        a aVar = this.F;
        if (z) {
            f39 f39Var = (f39) sqiVarO0;
            sxb sxbVar = f39Var.a;
            j7g j7gVar = (j7g) f39Var.b;
            if (j7gVar != null && !aVar.a.f()) {
                j7gVar = (j7g) u0().k(1, j7gVar);
            }
            return new f39(sxbVar, j7gVar);
        }
        if (!(sqiVarO0 instanceof ntb)) {
            wg6.i();
            return null;
        }
        ArrayList<cpc> arrayList = ((ntb) sqiVarO0).a;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        for (cpc cpcVar : arrayList) {
            sxb sxbVar2 = (sxb) cpcVar.E;
            j7g j7gVar2 = (j7g) ((l7g) cpcVar.F);
            if (j7gVar2 != null && !aVar.a.f()) {
                j7gVar2 = (j7g) u0().k(1, j7gVar2);
            }
            arrayList2.add(new cpc(sxbVar2, j7gVar2));
        }
        return new ntb(arrayList2);
    }

    @Override // defpackage.xh3
    public final u9i p() {
        u9i u9iVarP = this.E.p();
        if (this.F.a.f()) {
            if (u9iVarP != null) {
                return u9iVarP;
            }
            t0(0);
            throw null;
        }
        if (this.J == null) {
            a aVarU0 = u0();
            Collection collectionB = u9iVarP.b();
            ArrayList arrayList = new ArrayList(collectionB.size());
            Iterator it = collectionB.iterator();
            while (it.hasNext()) {
                arrayList.add(aVarU0.k(1, (yr9) it.next()));
            }
            this.J = new ph3(this, this.H, arrayList, gfa.e);
        }
        ph3 ph3Var = this.J;
        if (ph3Var != null) {
            return ph3Var;
        }
        t0(1);
        throw null;
    }

    @Override // defpackage.qqb
    public final boolean p0() {
        return this.E.p0();
    }

    @Override // defpackage.qqb, defpackage.w9b
    public final int q() {
        int iQ = this.E.q();
        if (iQ != 0) {
            return iQ;
        }
        t0(26);
        throw null;
    }

    @Override // defpackage.qqb
    public final boolean q0() {
        return this.E.q0();
    }

    @Override // defpackage.qqb
    public final boolean r0() {
        return this.E.r0();
    }

    @Override // defpackage.qqb
    public final boolean s0() {
        return this.E.s0();
    }

    public final a u0() {
        if (this.G == null) {
            a aVar = this.F;
            if (aVar.a.f()) {
                this.G = aVar;
            } else {
                List parameters = this.E.p().getParameters();
                ArrayList arrayList = new ArrayList(parameters.size());
                this.H = arrayList;
                this.G = nv1.i(parameters, aVar.a, this, arrayList);
                ArrayList arrayList2 = this.H;
                arrayList2.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!((qai) obj).U()) {
                        arrayList3.add(obj);
                    }
                }
                this.I = arrayList3;
            }
        }
        return this.G;
    }

    @Override // defpackage.w9b
    public final boolean x() {
        return this.E.x();
    }

    @Override // defpackage.yh3
    public final boolean y() {
        return this.E.y();
    }
}
