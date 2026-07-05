package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes.dex */
public final class wj9 implements bf, x4d {
    public static final /* synthetic */ wn9[] K;
    public final uqb E;
    public final dfa F;
    public final j7g G;
    public final dfa H;
    public final afa I;
    public final dfa J;

    static {
        kce kceVar = jce.a;
        K = new wn9[]{kceVar.g(new mrd(kceVar.b(wj9.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), kceVar.g(new mrd(kceVar.b(wj9.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), kceVar.g(new mrd(kceVar.b(wj9.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public wj9(uqb uqbVar, gfa gfaVar, l4 l4Var) {
        this.E = uqbVar;
        this.F = new dfa(gfaVar, l4Var);
        zg3 zg3Var = new zg3(new tj9(uqbVar, new ww7("java.io")), sxb.e("Serializable"), 4, 2, x44.W(new z1a(gfaVar, new uj9(this, 0))), gfaVar);
        zg3Var.v0(eab.b, um6.E, null);
        this.G = zg3Var.W();
        this.H = new dfa(gfaVar, new mx1(this, 8, gfaVar));
        this.I = new afa(gfaVar, new ConcurrentHashMap(3, 1.0f, 2), new wl0(13), 0);
        this.J = new dfa(gfaVar, new uj9(this, 1));
    }

    public final vx9 a(qqb qqbVar) {
        if (qqbVar == null) {
            or9.a(108);
            throw null;
        }
        sxb sxbVar = or9.e;
        if (!or9.b(qqbVar, okg.a) && or9.H(qqbVar)) {
            int i = o06.a;
            xw7 xw7VarG = m06.g(qqbVar);
            xw7VarG.getClass();
            if (xw7VarG.d()) {
                String str = ue9.a;
                gh3 gh3VarG = ue9.g(xw7VarG);
                if (gh3VarG != null) {
                    qqb qqbVarO = wb5.o(b().a(), gh3VarG.b());
                    if (qqbVarO instanceof vx9) {
                        return (vx9) qqbVarO;
                    }
                }
            }
        }
        return null;
    }

    public final pj9 b() {
        return (pj9) wd6.s0(this.F, K[0]);
    }

    @Override // defpackage.x4d
    public final boolean c(qqb qqbVar, p16 p16Var) {
        qqbVar.getClass();
        vx9 vx9VarA = a(qqbVar);
        if (vx9VarA == null || !p16Var.getAnnotations().x(y4d.a())) {
            return true;
        }
        b().getClass();
        String strE = csk.e(p16Var, 3);
        zx9 zx9VarX0 = vx9VarA.x0();
        sxb name = p16Var.getName();
        name.getClass();
        Collection collectionG = zx9VarX0.g(name, 4);
        if ((collectionG instanceof Collection) && collectionG.isEmpty()) {
            return false;
        }
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            if (csk.e((c7g) it.next(), 3).equals(strE)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bf
    public final Collection f(qqb qqbVar) {
        xw7 xw7VarG;
        if (qqbVar.m() == 1) {
            b().getClass();
            vx9 vx9VarA = a(qqbVar);
            if (vx9VarA != null) {
                ww7 ww7VarG = o06.g(vx9VarA);
                qe7 qe7Var = qe7.f;
                qe7 qe7VarJ = ykk.j();
                qe7VarJ.getClass();
                String str = ue9.a;
                gh3 gh3VarF = ue9.f(ww7VarG);
                qqb qqbVarI = gh3VarF != null ? qe7VarJ.i(gh3VarF.b()) : null;
                if (qqbVarI != null) {
                    a aVarC = blk.e(qqbVarI, vx9VarA).c();
                    List listJ = vx9VarA.j();
                    ArrayList<tg3> arrayList = new ArrayList();
                    for (Object obj : listJ) {
                        tg3 tg3Var = (tg3) obj;
                        if (tg3Var.getVisibility().a.b) {
                            Collection collectionJ = qqbVarI.j();
                            collectionJ.getClass();
                            Collection<tg3> collection = collectionJ;
                            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                                for (tg3 tg3Var2 : collection) {
                                    tg3Var2.getClass();
                                    if (gmc.j(tg3Var2, tg3Var.e(aVarC)) == 1) {
                                        break;
                                    }
                                }
                            }
                            if (tg3Var.I().size() == 1) {
                                List listI = tg3Var.I();
                                listI.getClass();
                                xh3 xh3VarA = ((eri) w44.e1(listI)).getType().O().a();
                                if (xh3VarA != null) {
                                    int i = o06.a;
                                    xw7VarG = m06.g(xh3VarA);
                                    xw7VarG.getClass();
                                } else {
                                    xw7VarG = null;
                                }
                                xw7 xw7VarG2 = m06.g(qqbVar);
                                xw7VarG2.getClass();
                                if (x44.r(xw7VarG, xw7VarG2)) {
                                }
                            }
                            if (!or9.B(tg3Var)) {
                                LinkedHashSet linkedHashSet = yj9.a;
                                if (!yj9.a().contains(bsk.g(vx9VarA, csk.e(tg3Var, 3)))) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                    for (tg3 tg3Var3 : arrayList) {
                        tg3Var3.getClass();
                        i08 i08VarT0 = tg3Var3.T0(a.b);
                        i08VarT0.r(qqbVar);
                        i08VarT0.n(qqbVar.W());
                        i08VarT0.d();
                        i08VarT0.A(aVarC.g());
                        LinkedHashSet linkedHashSet2 = yj9.a;
                        if (!yj9.c().contains(bsk.g(vx9VarA, csk.e(tg3Var3, 3)))) {
                            i08VarT0.i((wc0) wd6.s0(this.J, K[2]));
                        }
                        h08 h08VarBuild = i08VarT0.build();
                        h08VarBuild.getClass();
                        arrayList2.add((tg3) h08VarBuild);
                    }
                    return arrayList2;
                }
            }
        }
        return lm6.E;
    }

    @Override // defpackage.bf
    public final Collection i(qqb qqbVar) {
        Set setA;
        qqbVar.getClass();
        b().getClass();
        vx9 vx9VarA = a(qqbVar);
        if (vx9VarA == null || (setA = vx9VarA.x0().a()) == null) {
            setA = um6.E;
        }
        return setA;
    }

    @Override // defpackage.bf
    public final Collection t(qqb qqbVar) {
        int i = o06.a;
        xw7 xw7VarG = m06.g(qqbVar);
        xw7VarG.getClass();
        LinkedHashSet linkedHashSet = yj9.a;
        boolean zD = yj9.d(xw7VarG);
        j7g j7gVar = this.G;
        if (!zD) {
            return yj9.e(xw7VarG) ? x44.W(j7gVar) : lm6.E;
        }
        j7g j7gVar2 = (j7g) wd6.s0(this.H, K[1]);
        j7gVar2.getClass();
        return x44.X(j7gVar2, j7gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f  */
    @Override // defpackage.bf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection w(defpackage.sxb r13, defpackage.qqb r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj9.w(sxb, qqb):java.util.Collection");
    }
}
