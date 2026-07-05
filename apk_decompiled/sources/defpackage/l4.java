package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.health.platform.client.proto.g;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class l4 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(int i, Object obj) {
        super(0);
        this.F = i;
        this.G = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        ?? r3 = 0;
        iei ieiVar = iei.a;
        String string = null;
        Object obj = this.G;
        switch (i) {
            case 0:
                return new k4(((m4) obj).e());
            case 1:
                return ((gd) obj).c().m("rum-activity-tracking");
            case 2:
                k30 k30Var = (k30) obj;
                p4a p4aVar = k30Var.N;
                if (p4aVar != null) {
                    p4aVar.a(k30Var);
                    return ieiVar;
                }
                x44.o0("lifecycle");
                throw null;
            case 3:
                fd9.z(((k40) obj).G, null);
                return ieiVar;
            case 4:
                ((t60) obj).b = null;
                return ieiVar;
            case 5:
                a6i a6iVar = (a6i) obj;
                Object objQ0 = a6iVar.a.q0();
                zo6 zo6Var = zo6.G;
                return Boolean.valueOf(objQ0 == zo6Var && a6iVar.d.getValue() == zo6Var);
            case 6:
                return (bv2) ((yg2) obj).b.getValue();
            case 7:
                boolean zB = g79.b(0L, 0L);
                View view = ((hd4) obj).a;
                return zB ? fd9.w(view) : new sz5(0L, d4c.s(view.getContext()).s(csg.T(0L)));
            case 8:
                bg5 bg5Var = (bg5) obj;
                String property = System.getProperty("http.agent");
                if (property != null) {
                    StringBuilder sb = new StringBuilder();
                    int length = property.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = property.charAt(i2);
                        if (cCharAt == '\t' || (' ' <= cCharAt && cCharAt < 127)) {
                            sb.append(cCharAt);
                        }
                    }
                    string = sb.toString();
                }
                if (string == null) {
                    string = "";
                }
                if (!bsg.I0(string)) {
                    return string;
                }
                String str = bg5Var.H;
                t20 t20Var = bg5Var.I;
                return vb7.t(kgh.r("Datadog/", str, " (Linux; U; Android ", t20Var.x(), "; "), t20Var.u(), " Build/", t20Var.p(), ")");
            case 9:
                return ((qj5) obj).C().l;
            case 10:
                ex exVar = ex.i0;
                k06 k06Var = ((g06) obj).a;
                k06 k06Var2 = new k06();
                Field[] declaredFields = k06.class.getDeclaredFields();
                declaredFields.getClass();
                int length2 = declaredFields.length;
                int i3 = 0;
                while (i3 < length2) {
                    Field field = declaredFields[i3];
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj2 = field.get(k06Var);
                        va1 va1Var = obj2 instanceof va1 ? (va1) obj2 : null;
                        if (va1Var != null) {
                            String name = field.getName();
                            name.getClass();
                            isg.q0(name, "is", r3);
                            pl9 pl9VarB = jce.a.b(k06.class);
                            String name2 = field.getName();
                            String name3 = field.getName();
                            name3.getClass();
                            int length3 = name3.length();
                            String str2 = name3;
                            if (length3 > 0) {
                                str2 = Character.toUpperCase(name3.charAt(r3)) + name3.substring(1);
                            }
                            new mrd(pl9VarB, name2, "get".concat(str2));
                            field.set(k06Var2, new va1(va1Var.a, 2, k06Var2));
                        }
                    }
                    i3++;
                    r3 = 0;
                }
                exVar.invoke(k06Var2);
                k06Var2.a = true;
                return new g06(k06Var2);
            case 11:
                return (ArrayList) obj;
            case 12:
                m16 m16Var = (m16) obj;
                Set setN = m16Var.n();
                if (setN == null) {
                    return null;
                }
                return dxf.p0(dxf.p0(m16Var.m(), m16Var.c.c.keySet()), setN);
            case 13:
                Set setKeySet = ((LinkedHashMap) ((vz1) obj).M.I).keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : setKeySet) {
                    gh3 gh3Var = (gh3) obj3;
                    if (gh3Var.b.e().d() && !bh3.c.contains(gh3Var)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((gh3) it.next()).i());
                }
                return arrayList2;
            case 14:
                return ((ki7) obj).a.c();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((jt7) obj).r1();
                return ieiVar;
            case 16:
                return "Starting jankStats for window " + ((Window) obj);
            case g.MAX_FIELD_NUMBER /* 17 */:
                Object systemService = ((View) ((fj0) obj).E).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case g.AVG_FIELD_NUMBER /* 18 */:
                kj9 kj9Var = (kj9) obj;
                d8a d8aVarE = x44.E();
                d8aVarE.add(kj9Var.a.E);
                iie iieVar = kj9Var.b;
                if (iieVar != null) {
                    d8aVarE.add("under-migration:".concat(iieVar.E));
                }
                for (Map.Entry entry : kj9Var.c.entrySet()) {
                    d8aVarE.add("@" + entry.getKey() + ':' + ((iie) entry.getValue()).E);
                }
                return (String[]) x44.v(d8aVarE).toArray(new String[0]);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                rj9 rj9Var = (rj9) obj;
                qj9 qj9Var = rj9Var.f;
                if (qj9Var == null) {
                    sz6.h("JvmBuiltins instance has not been initialized properly");
                    return null;
                }
                pj9 pj9Var = (pj9) qj9Var.a();
                rj9Var.f = null;
                return pj9Var;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                mk9 mk9Var = (mk9) obj;
                by9 by9Var = mk9Var.c;
                Collection collectionValues = ((Map) wd6.s0(by9Var.M, by9.Q[0])).values();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    n16 n16VarA = ((ke9) mk9Var.b.E).d.a(by9Var, (bce) it2.next());
                    if (n16VarA != null) {
                        arrayList3.add(n16VarA);
                    }
                }
                return (fab[]) huk.m(arrayList3).toArray(new fab[0]);
            case 21:
                return rqb.a(((im9) obj).a());
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new vm9((wm9) obj);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new dn9((fn9) obj);
            case 24:
                fo9 fo9Var = (fo9) obj;
                return fo9Var.a(fo9Var.E);
            case BuildConfig.VERSION_CODE /* 25 */:
                return ((b0c) obj).d;
            case 26:
                return ((f0c) obj).p1();
            case 27:
                n9e n9eVar = (n9e) obj;
                n9eVar.h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    n9eVar.a();
                    return ieiVar;
                } finally {
                    Trace.endSection();
                }
            case 28:
                return new fcc(((fcc) ((nwb) obj).getValue()).a);
            default:
                return (h0j) obj;
        }
    }
}
