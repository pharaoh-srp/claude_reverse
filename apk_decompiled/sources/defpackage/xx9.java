package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xx9 extends ts9 implements zy7 {
    public final /* synthetic */ int F = 1;
    public final /* synthetic */ el5 G;
    public final /* synthetic */ zx9 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx9(el5 el5Var, zx9 zx9Var) {
        super(0);
        this.G = el5Var;
        this.H = zx9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [j08, tg3, wd9] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [zx9] */
    /* JADX WARN: Type inference failed for: r8v6, types: [zx9] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6 */
    @Override // defpackage.zy7
    public final Object a() throws IllegalAccessException, InvocationTargetException {
        vd9 vd9Var;
        qqb qqbVar;
        ArrayList arrayList;
        el5 el5Var;
        int i;
        List listY;
        boolean z;
        ?? arrayList2;
        ?? r9;
        ?? r8;
        cpc cpcVar;
        List listE;
        int i2 = this.F;
        el5 el5Var2 = this.G;
        switch (i2) {
            case 0:
                vc0 vc0Var = dd8.F;
                zx9 zx9Var = this.H;
                vd9 vd9Var2 = zx9Var.o;
                el5 el5Var3 = zx9Var.b;
                qqb qqbVar2 = zx9Var.n;
                Constructor<?>[] declaredConstructors = ((jbe) vd9Var2).a.getDeclaredConstructors();
                declaredConstructors.getClass();
                boolean z2 = false;
                List<nbe> listE0 = bnf.e0(bnf.b0(new bl7(mp0.m0(declaredConstructors), false, ebe.E), fbe.E));
                ArrayList arrayList3 = new ArrayList(listE0.size());
                for (nbe nbeVar : listE0) {
                    sx9 sx9VarA0 = mpk.a0(el5Var3, nbeVar);
                    ke9 ke9Var = (ke9) el5Var3.E;
                    ke9Var.j.getClass();
                    wd9 wd9VarE1 = wd9.e1(qqbVar2, sx9VarA0, z2, ql8.x(nbeVar));
                    el5 el5Var4 = new el5(ke9Var, new f4i(el5Var3, wd9VarE1, nbeVar, qqbVar2.i0().size()), (kw9) el5Var3.G);
                    Constructor constructor = nbeVar.a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    if (genericParameterTypes.length == 0) {
                        listE = lm6.E;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) mp0.y0(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            xh6.m("Illegal generic signature: ", constructor);
                            return null;
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            parameterAnnotations = (Annotation[][]) mp0.y0(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        listE = nbeVar.e(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    z5l z5lVarU = ly9.u(el5Var4, wd9VarE1, listE);
                    List listI0 = qqbVar2.i0();
                    listI0.getClass();
                    List list = listI0;
                    ArrayList typeParameters = nbeVar.getTypeParameters();
                    ArrayList arrayList4 = new ArrayList(x44.y(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        zx9 zx9Var2 = zx9Var;
                        qai qaiVarJ = ((tai) el5Var4.F).j((ybe) it.next());
                        qaiVarJ.getClass();
                        arrayList4.add(qaiVarJ);
                        zx9Var = zx9Var2;
                    }
                    wd9VarE1.c1((List) z5lVarU.G, ztj.j(nbeVar.f()), w44.a1(list, arrayList4));
                    wd9VarE1.V0(false);
                    wd9VarE1.W0(z5lVarU.F);
                    wd9VarE1.X0(qqbVar2.W());
                    ((ke9) el5Var4.E).g.getClass();
                    arrayList3.add(wd9VarE1);
                    zx9Var = zx9Var;
                    z2 = false;
                }
                zx9 zx9Var3 = zx9Var;
                jbe jbeVar = (jbe) vd9Var2;
                int i3 = 2;
                if (jbeVar.j()) {
                    ((ke9) el5Var3.E).j.getClass();
                    wd9 wd9VarE12 = wd9.e1(qqbVar2, vc0Var, true, ql8.x(vd9Var2));
                    ArrayList<wbe> arrayListH = ((jbe) vd9Var2).h();
                    ArrayList arrayList5 = new ArrayList(arrayListH.size());
                    boolean z3 = false;
                    Object obj = null;
                    ze9 ze9VarJ = oyk.j(2, false, null, 6);
                    int i4 = 0;
                    for (wbe wbeVar : arrayListH) {
                        yr9 yr9VarQ = ((fj0) el5Var3.I).Q(wbeVar.j(), ze9VarJ);
                        sxb sxbVarD = wbeVar.d();
                        ((ke9) el5Var3.E).j.getClass();
                        ArrayList arrayList6 = arrayList5;
                        arrayList6.add(new eri(wd9VarE12, null, i4, vc0Var, sxbVarD, yr9VarQ, false, false, false, null, ql8.x(wbeVar)));
                        arrayList5 = arrayList6;
                        i3 = 2;
                        i4++;
                        vd9Var2 = vd9Var2;
                        el5Var3 = el5Var3;
                        qqbVar2 = qqbVar2;
                        ze9VarJ = ze9VarJ;
                        arrayList3 = arrayList3;
                        z3 = false;
                        obj = null;
                    }
                    vd9Var = vd9Var2;
                    qqbVar = qqbVar2;
                    ArrayList arrayList7 = arrayList3;
                    ArrayList arrayList8 = arrayList5;
                    el5Var = el5Var3;
                    i = i3;
                    wd9VarE12.W0(z3);
                    ow5 visibility = qqbVar.getVisibility();
                    visibility.getClass();
                    if (visibility.equals(ce9.b)) {
                        visibility = ce9.c;
                        visibility.getClass();
                    }
                    wd9VarE12.b1(arrayList8, visibility);
                    wd9VarE12.V0(z3);
                    wd9VarE12.X0(qqbVar.W());
                    String strE = csk.e(wd9VarE12, i);
                    if (arrayList7.isEmpty()) {
                        arrayList = arrayList7;
                        arrayList.add(wd9VarE12);
                        ((ke9) el5Var2.E).g.getClass();
                    } else {
                        Iterator it2 = arrayList7.iterator();
                        while (it2.hasNext()) {
                            if (csk.e((tg3) it2.next(), i).equals(strE)) {
                                arrayList = arrayList7;
                            }
                        }
                        arrayList = arrayList7;
                        arrayList.add(wd9VarE12);
                        ((ke9) el5Var2.E).g.getClass();
                    }
                } else {
                    vd9Var = vd9Var2;
                    qqbVar = qqbVar2;
                    arrayList = arrayList3;
                    el5Var = el5Var3;
                    i = 2;
                }
                ((lja) ((ke9) el5Var2.E).x).getClass();
                qqbVar.getClass();
                a5 a5Var = ((ke9) el5Var2.E).r;
                if (arrayList.isEmpty()) {
                    boolean zIsAnnotation = jbeVar.a.isAnnotation();
                    if (!jbeVar.a.isInterface()) {
                        vd9Var.getClass();
                    }
                    if (zIsAnnotation) {
                        el5 el5Var5 = el5Var;
                        ke9 ke9Var2 = (ke9) el5Var5.E;
                        fj0 fj0Var = (fj0) el5Var5.I;
                        ke9Var2.j.getClass();
                        qqb qqbVar3 = qqbVar;
                        ?? E1 = wd9.e1(qqbVar3, vc0Var, true, ql8.x(vd9Var));
                        if (zIsAnnotation) {
                            Collection collectionE = ((jbe) vd9Var).e();
                            arrayList2 = new ArrayList(collectionE.size());
                            ze9 ze9VarJ2 = oyk.j(i, true, null, 6);
                            ArrayList arrayList9 = new ArrayList();
                            ArrayList<tbe> arrayList10 = new ArrayList();
                            for (Object obj2 : collectionE) {
                                if (x44.r(((tbe) obj2).d(), mj9.b)) {
                                    arrayList9.add(obj2);
                                } else {
                                    arrayList10.add(obj2);
                                }
                            }
                            arrayList9.size();
                            tbe tbeVar = (tbe) w44.N0(arrayList9);
                            if (tbeVar != null) {
                                xbe xbeVarK = tbeVar.k();
                                if (xbeVarK instanceof dbe) {
                                    dbe dbeVar = (dbe) xbeVarK;
                                    cpcVar = new cpc(fj0Var.P(dbeVar, ze9VarJ2, true), fj0Var.Q(dbeVar.b, ze9VarJ2));
                                } else {
                                    cpcVar = new cpc(fj0Var.Q(xbeVarK, ze9VarJ2), null);
                                }
                                z = true;
                                ?? r82 = zx9Var3;
                                r82.x(arrayList2, E1, 0, tbeVar, (yr9) cpcVar.E, (yr9) cpcVar.F);
                                r8 = r82;
                            } else {
                                z = true;
                                r8 = zx9Var3;
                            }
                            ?? r7 = tbeVar != null ? z : 0;
                            int i5 = 0;
                            for (tbe tbeVar2 : arrayList10) {
                                r8.x(arrayList2, E1, i5 + r7, tbeVar2, fj0Var.Q(tbeVar2.k(), ze9VarJ2), null);
                                i5++;
                            }
                        } else {
                            z = true;
                            arrayList2 = Collections.EMPTY_LIST;
                        }
                        E1.W0(false);
                        ow5 visibility2 = qqbVar3.getVisibility();
                        visibility2.getClass();
                        if (visibility2.equals(ce9.b)) {
                            visibility2 = ce9.c;
                            visibility2.getClass();
                        }
                        E1.b1(arrayList2, visibility2);
                        E1.V0(z);
                        E1.X0(qqbVar3.W());
                        ((ke9) el5Var5.E).g.getClass();
                        r9 = E1;
                    } else {
                        r9 = 0;
                    }
                    listY = x44.Y(r9);
                } else {
                    listY = arrayList;
                }
                return w44.p1(a5Var.i(el5Var2, listY));
            default:
                x0h x0hVar = ((ke9) el5Var2.E).x;
                qqb qqbVar4 = this.H.n;
                ((lja) x0hVar).getClass();
                el5Var2.getClass();
                qqbVar4.getClass();
                return w44.t1(new ArrayList());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx9(zx9 zx9Var, el5 el5Var) {
        super(0);
        this.H = zx9Var;
        this.G = el5Var;
    }
}
