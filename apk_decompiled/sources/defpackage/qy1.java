package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class qy1 {
    public static /* synthetic */ String A(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i == 3) {
            return "DELEGATION";
        }
        if (i == 4) {
            return "SYNTHESIZED";
        }
        throw null;
    }

    public static /* synthetic */ String B(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "SYNTHESIZED" : "DELEGATION" : "FAKE_OVERRIDE" : "DECLARATION";
    }

    public static /* synthetic */ String C(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "DEFAULT" : "JVM_PROP" : "REMOTE" : "ENV";
    }

    public static final boolean a(int i) {
        return i == 6 || i == 4;
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "ANR";
            case 2:
                return "App Hang";
            case 3:
                return "Exception";
            case 4:
                return "Watchdog Termination";
            case 5:
                return "Memory Warning";
            case 6:
                return "Network";
            default:
                throw null;
        }
    }

    public static int c(int i, int i2, int i3) {
        return (sq6.F(i) + i2) * i3;
    }

    public static int d(m54 m54Var, int i, int i2) {
        return (m54Var.hashCode() + i) * i2;
    }

    public static int e(bz7 bz7Var, int i, int i2) {
        return (bz7Var.hashCode() + i) * i2;
    }

    public static zb0 f(e18 e18Var, int i, int i2, e18 e18Var2, boolean z) {
        e18Var.a0(i);
        zb0 zb0VarI = zrk.i(i2, e18Var2);
        e18Var.p(z);
        return zb0VarI;
    }

    public static String g(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static String h(StringBuilder sb, Boolean bool, String str) {
        sb.append(bool);
        sb.append(str);
        return sb.toString();
    }

    public static String i(StringBuilder sb, Map map, String str) {
        sb.append(map);
        sb.append(str);
        return sb.toString();
    }

    public static ArrayList j(int i, HashMap map, ArrayList arrayList, int i2, String str) {
        map.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static void k(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void l(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void m(long j, String str, String str2, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        sb.append(str2);
    }

    public static void n(iw7 iw7Var, y3i y3iVar) {
        y3iVar.g(new jw7(iw7Var));
    }

    public static void o(String str, String str2, String str3) {
        ysj.u(str3, str + str2);
    }

    public static void p(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }

    public static void q(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    public static /* synthetic */ void r(List list) {
        if (list == null) {
            return;
        }
        mr9.o();
    }

    public static void s(List list, List list2) {
        list.getClass();
        list2.getClass();
        list.size();
        list2.size();
    }

    public static void t(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z) {
        pluginGeneratedSerialDescriptor.j(str, z);
        pluginGeneratedSerialDescriptor.k(new pi(16));
    }

    public static void u(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, String str2, boolean z2) {
        pluginGeneratedSerialDescriptor.j(str, z);
        pluginGeneratedSerialDescriptor.j(str2, z2);
        pluginGeneratedSerialDescriptor.k(new pi(10));
    }

    public static /* synthetic */ boolean v(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zy1 zy1Var, lff lffVar, bi2 bi2Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(zy1Var, lffVar, bi2Var)) {
            if (atomicReferenceFieldUpdater.get(zy1Var) != lffVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean w(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, zy1 zy1Var, lff lffVar, lff lffVar2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(zy1Var, lffVar, lffVar2)) {
            if (atomicReferenceFieldUpdater.get(zy1Var) != lffVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean x(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, gf4 gf4Var, Object obj, gf4 gf4Var2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(gf4Var, obj, gf4Var2)) {
            if (atomicReferenceFieldUpdater.get(gf4Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean y(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, concurrentHashMap)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static void z(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z, String str2, boolean z2) {
        pluginGeneratedSerialDescriptor.j(str, z);
        pluginGeneratedSerialDescriptor.j(str2, z2);
        pluginGeneratedSerialDescriptor.k(new pi(16));
    }
}
