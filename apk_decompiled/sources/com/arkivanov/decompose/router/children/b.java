package com.arkivanov.decompose.router.children;

import com.arkivanov.essenty.statekeeper.SerializableContainer;
import defpackage.a2;
import defpackage.b4a;
import defpackage.bm7;
import defpackage.bu2;
import defpackage.bz7;
import defpackage.cpc;
import defpackage.dch;
import defpackage.dpf;
import defpackage.dse;
import defpackage.ea4;
import defpackage.ese;
import defpackage.fj0;
import defpackage.hf3;
import defpackage.hyb;
import defpackage.i07;
import defpackage.if3;
import defpackage.j5f;
import defpackage.jk5;
import defpackage.jq5;
import defpackage.jyb;
import defpackage.kd4;
import defpackage.knk;
import defpackage.mr9;
import defpackage.n0;
import defpackage.o5;
import defpackage.oe3;
import defpackage.p7;
import defpackage.pe3;
import defpackage.pz7;
import defpackage.qe3;
import defpackage.re3;
import defpackage.rz7;
import defpackage.sta;
import defpackage.swe;
import defpackage.szb;
import defpackage.uwb;
import defpackage.w44;
import defpackage.x44;
import defpackage.x6g;
import defpackage.xa1;
import defpackage.y50;
import defpackage.y59;
import defpackage.yfd;
import defpackage.z3a;
import defpackage.zy7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [oe3] */
    /* JADX WARN: Type inference failed for: r4v16, types: [oe3] */
    /* JADX WARN: Type inference failed for: r4v17, types: [oe3] */
    public static final bm7 a(swe sweVar, szb szbVar, String str, zy7 zy7Var, final bz7 bz7Var, bz7 bz7Var2, pz7 pz7Var, pz7 pz7Var2, pz7 pz7Var3, rz7 rz7Var, bz7 bz7Var3, pz7 pz7Var4) {
        List<ChildrenNavigator$SavedChildState> childState;
        jyb jybVar;
        List<ChildrenNavigator$SavedChildState> list;
        HashMap map;
        j5f j5fVar;
        Collection collectionValues;
        j5f j5fVar2;
        ?? pe3Var;
        qe3 qe3Var;
        qe3 qe3Var2;
        qe3 qe3Var3;
        int i;
        SerializableContainer navState;
        bz7Var3.getClass();
        ea4 ea4Var = sweVar.a;
        jq5 jq5VarR = knk.r(ea4Var.d(), 3);
        y50 y50Var = new y50();
        uwb uwbVarC = szbVar.c(new a2(13, y50Var));
        xa1 xa1VarB = dch.b(new p7(9, y50Var), false, 31);
        y50Var.d(new n0(1, new i07(), i07.class, "process", "process(Lcom/arkivanov/decompose/router/children/NavEvent;)V", 0, 6));
        com.arkivanov.essenty.statekeeper.b bVarC = ea4Var.c();
        j5f j5fVar3 = SavedState.Companion;
        SavedState savedState = (SavedState) bVarC.a(str, j5fVar3.serializer());
        jyb jybVar2 = (savedState == null || (navState = savedState.getNavState()) == null) ? null : (jyb) bz7Var2.invoke(navState);
        b4a b4aVarA = ea4Var.a();
        o5 o5Var = new o5(sweVar, 19, str);
        dpf dpfVar = new dpf(ea4Var.e(), ea4Var.a(), knk.r(ea4Var.d(), 1), pz7Var4);
        jyb jybVar3 = jybVar2 == null ? (jyb) zy7Var.a() : jybVar2;
        if (savedState == null || (childState = savedState.getChildState()) == null || jybVar2 == null) {
            childState = null;
        }
        b4aVarA.getClass();
        jybVar3.getClass();
        final fj0 fj0Var = new fj0();
        fj0Var.E = dpfVar;
        fj0Var.F = jybVar3;
        swe sweVar2 = (swe) o5Var.F;
        String str2 = (String) o5Var.G;
        kd4 kd4VarB = sweVar2.a.b();
        kd4VarB.getClass();
        y59 if3Var = (y59) ((HashMap) kd4VarB.b).get(str2);
        if (if3Var == null) {
            if3Var = new if3();
            kd4VarB.k(str2, if3Var);
        }
        if3 if3Var2 = (if3) if3Var;
        ArrayList arrayList = if3Var2.a;
        fj0Var.G = if3Var2;
        if (childState == null) {
            if3Var2.onDestroy();
            fj0Var.O(jybVar3.a());
            j5fVar = j5fVar3;
        } else {
            ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList(x44.y(arrayList2, 10));
                int i2 = 0;
                for (Object obj : arrayList2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        x44.n0();
                        throw null;
                    }
                    arrayList3.add(new cpc(Integer.valueOf(i2), (qe3) obj));
                    jybVar3 = jybVar3;
                    childState = childState;
                    i2 = i3;
                }
                jybVar = jybVar3;
                list = childState;
                map = new HashMap();
                sta.s0(arrayList3, map);
            } else {
                jybVar = jybVar3;
                list = childState;
                map = null;
            }
            arrayList.clear();
            Iterator it = w44.v1(jybVar.a(), list).iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    x44.n0();
                    throw null;
                }
                cpc cpcVar = (cpc) next;
                Iterator it2 = it;
                x6g x6gVar = (x6g) cpcVar.E;
                ChildrenNavigator$SavedChildState childrenNavigator$SavedChildState = (ChildrenNavigator$SavedChildState) cpcVar.F;
                int i6 = i4;
                re3 re3Var = x6gVar.b;
                Object obj2 = x6gVar.a;
                int iOrdinal = re3Var.ordinal();
                if (iOrdinal != 0) {
                    j5fVar2 = j5fVar3;
                    if (iOrdinal == 1) {
                        pe3Var = dpfVar.O(obj2, childrenNavigator$SavedChildState.getKey(), childrenNavigator$SavedChildState.getSavedState(), (map == null || (qe3Var = (qe3) map.remove(Integer.valueOf(i6))) == null) ? null : qe3Var.b());
                        yfd.u(pe3Var.d);
                    } else if (iOrdinal == 2) {
                        pe3Var = dpfVar.O(obj2, childrenNavigator$SavedChildState.getKey(), childrenNavigator$SavedChildState.getSavedState(), (map == null || (qe3Var2 = (qe3) map.remove(Integer.valueOf(i6))) == null) ? null : qe3Var2.b());
                        pe3Var.g.d();
                        yfd.f0(pe3Var.d);
                    } else {
                        if (iOrdinal != 3) {
                            mr9.b();
                            throw null;
                        }
                        pe3Var = dpfVar.O(obj2, childrenNavigator$SavedChildState.getKey(), childrenNavigator$SavedChildState.getSavedState(), (map == null || (qe3Var3 = (qe3) map.remove(Integer.valueOf(i6))) == null) ? null : qe3Var3.b());
                        pe3Var.g.d();
                        yfd.Z(pe3Var.d);
                    }
                } else {
                    j5fVar2 = j5fVar3;
                    pe3Var = new pe3(obj2, childrenNavigator$SavedChildState.getKey(), childrenNavigator$SavedChildState.getSavedState());
                }
                arrayList.add(pe3Var);
                it = it2;
                i4 = i5;
                j5fVar3 = j5fVar2;
            }
            j5fVar = j5fVar3;
            if (map != null && (collectionValues = map.values()) != null) {
                Iterator it3 = collectionValues.iterator();
                while (it3.hasNext()) {
                    kd4 kd4VarB2 = ((qe3) it3.next()).b();
                    if (kd4VarB2 != null) {
                        kd4VarB2.a();
                    }
                }
            }
        }
        z3a z3aVarA = b4aVarA.a();
        z3a z3aVar = z3a.E;
        if (z3aVarA == z3aVar) {
            ArrayList arrayList4 = ((if3) fj0Var.G).a;
            arrayList4.getClass();
            Iterator it4 = new ese(arrayList4).iterator();
            while (true) {
                dse dseVar = (dse) it4;
                if (!dseVar.hasNext()) {
                    i = 1;
                    break;
                }
                qe3 qe3Var4 = (qe3) dseVar.next();
                if (qe3Var4 instanceof oe3) {
                    oe3 oe3Var = (oe3) qe3Var4;
                    oe3Var.g.e();
                    yfd.v(oe3Var.d);
                } else if (!(qe3Var4 instanceof pe3)) {
                    mr9.b();
                    throw null;
                }
            }
        } else {
            i = 1;
            b4aVarA.l(new hf3(1, fj0Var));
        }
        ea4Var.c().b(str, j5fVar.serializer(), new zy7() { // from class: com.arkivanov.decompose.router.children.a
            @Override // defpackage.zy7
            public final Object a() {
                SerializableContainer serializableContainerC;
                fj0 fj0Var2 = fj0Var;
                SerializableContainer serializableContainer = (SerializableContainer) bz7Var.invoke((jyb) fj0Var2.F);
                if (serializableContainer == null) {
                    return null;
                }
                ArrayList<qe3> arrayList5 = ((if3) fj0Var2.G).a;
                ArrayList arrayList6 = new ArrayList(x44.y(arrayList5, 10));
                for (qe3 qe3Var5 : arrayList5) {
                    String key = qe3Var5.getKey();
                    if (qe3Var5 instanceof oe3) {
                        serializableContainerC = ((oe3) qe3Var5).e.c();
                    } else {
                        if (!(qe3Var5 instanceof pe3)) {
                            mr9.b();
                            return null;
                        }
                        serializableContainerC = ((pe3) qe3Var5).c;
                    }
                    arrayList6.add(new ChildrenNavigator$SavedChildState(key, serializableContainerC));
                }
                return new SavedState(serializableContainer, arrayList6);
            }
        });
        jk5 jk5Var = new jk5(fj0Var, pz7Var2, pz7Var, new bu2(xa1VarB, i, pz7Var3), rz7Var, bz7Var3);
        y50Var.a(new hyb(jk5Var));
        jq5VarR.b.a(xa1VarB);
        b4a b4aVarA2 = ea4Var.a();
        if (b4aVarA2.a() == z3aVar) {
            uwbVarC.a();
        } else {
            b4aVarA2.l(new hf3(0, uwbVarC));
        }
        return (bm7) jk5Var.K;
    }
}
