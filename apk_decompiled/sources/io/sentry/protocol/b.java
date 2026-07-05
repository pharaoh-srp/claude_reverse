package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.p3;
import io.sentry.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements z1 {
    public static c b(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        c cVar = new c();
        ConcurrentHashMap concurrentHashMap = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            strNextName = p3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "gc.total_time":
                    cVar.F = p3Var.U();
                    break;
                case "memory.free_until_gc":
                    cVar.L = p3Var.A();
                    break;
                case "gc.blocking_time":
                    cVar.H = p3Var.U();
                    break;
                case "gc.waiting_time":
                    cVar.J = p3Var.U();
                    break;
                case "memory.free_until_oome":
                    cVar.M = p3Var.A();
                    break;
                case "memory.total":
                    cVar.N = p3Var.A();
                    break;
                case "gc.pre_oome_count":
                    cVar.I = p3Var.A();
                    break;
                case "memory.free":
                    cVar.K = p3Var.A();
                    break;
                case "gc.blocking_count":
                    cVar.G = p3Var.A();
                    break;
                case "gc.total_count":
                    cVar.E = p3Var.A();
                    break;
                case "memory.max":
                    cVar.O = p3Var.A();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    p3Var.z(a1Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        cVar.P = concurrentHashMap;
        p3Var.endObject();
        return cVar;
    }

    public static j c(p3 p3Var, a1 a1Var) {
        p3Var.beginObject();
        ArrayList arrayList = null;
        ConcurrentHashMap concurrentHashMap = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = p3Var.nextName();
            strNextName.getClass();
            if (strNextName.equals("values")) {
                arrayList = p3Var.E0(a1Var, new io.sentry.clientreport.e(1));
            } else {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                p3Var.z(a1Var, concurrentHashMap, strNextName);
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        j jVar = new j(arrayList);
        jVar.F = concurrentHashMap;
        p3Var.endObject();
        return jVar;
    }

    public static s d(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        s sVar = new s();
        ConcurrentHashMap concurrentHashMap = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            strNextName = p3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "status_code":
                    sVar.G = p3Var.v();
                    break;
                case "data":
                    sVar.I = p3Var.v0();
                    break;
                case "headers":
                    Map map = (Map) p3Var.v0();
                    if (map == null) {
                        break;
                    } else {
                        sVar.F = io.sentry.p.r(map);
                        break;
                    }
                    break;
                case "cookies":
                    sVar.E = p3Var.I();
                    break;
                case "body_size":
                    sVar.H = p3Var.A();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    p3Var.z(a1Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        sVar.J = concurrentHashMap;
        p3Var.endObject();
        return sVar;
    }

    public static f0 e(p3 p3Var, a1 a1Var) {
        p3Var.beginObject();
        f0 f0Var = new f0();
        ConcurrentHashMap concurrentHashMap = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = p3Var.nextName();
            strNextName.getClass();
            if (strNextName.equals("active_profiles")) {
                List list = (List) p3Var.v0();
                if (list != null) {
                    String[] strArr = new String[list.size()];
                    list.toArray(strArr);
                    f0Var.E = strArr;
                }
            } else {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                p3Var.z(a1Var, concurrentHashMap, strNextName);
            }
        }
        f0Var.F = concurrentHashMap;
        p3Var.endObject();
        return f0Var;
    }

    public static g0 f(p3 p3Var, a1 a1Var) {
        p3Var.beginObject();
        String strI = null;
        ConcurrentHashMap concurrentHashMap = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = p3Var.nextName();
            strNextName.getClass();
            if (strNextName.equals("source")) {
                strI = p3Var.I();
            } else {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                p3Var.z(a1Var, concurrentHashMap, strNextName);
            }
        }
        g0 g0Var = new g0(strI);
        g0Var.F = concurrentHashMap;
        p3Var.endObject();
        return g0Var;
    }
}
