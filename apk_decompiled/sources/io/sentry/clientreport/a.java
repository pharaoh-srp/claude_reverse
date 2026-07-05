package io.sentry.clientreport;

import defpackage.ij0;
import io.sentry.a1;
import io.sentry.p;
import io.sentry.p3;
import io.sentry.protocol.h;
import io.sentry.protocol.k;
import io.sentry.protocol.m;
import io.sentry.protocol.q;
import io.sentry.protocol.w;
import io.sentry.protocol.y;
import io.sentry.t5;
import io.sentry.w3;
import io.sentry.z1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a implements z1 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    public static io.sentry.protocol.a b(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        io.sentry.protocol.a aVar = new io.sentry.protocol.a();
        ConcurrentHashMap concurrentHashMap = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            strNextName = p3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "split_names":
                    List list = (List) p3Var.v0();
                    if (list == null) {
                        break;
                    } else {
                        aVar.Q = list;
                        break;
                    }
                    break;
                case "device_app_hash":
                    aVar.G = p3Var.I();
                    break;
                case "start_type":
                    aVar.N = p3Var.I();
                    break;
                case "view_names":
                    List list2 = (List) p3Var.v0();
                    if (list2 == null) {
                        break;
                    } else {
                        aVar.M = list2;
                        break;
                    }
                    break;
                case "app_version":
                    aVar.J = p3Var.I();
                    break;
                case "in_foreground":
                    aVar.O = p3Var.d0();
                    break;
                case "build_type":
                    aVar.H = p3Var.I();
                    break;
                case "app_identifier":
                    aVar.E = p3Var.I();
                    break;
                case "app_start_time":
                    aVar.F = p3Var.a0(a1Var);
                    break;
                case "permissions":
                    aVar.L = p.r((Map) p3Var.v0());
                    break;
                case "app_name":
                    aVar.I = p3Var.I();
                    break;
                case "app_build":
                    aVar.K = p3Var.I();
                    break;
                case "is_split_apks":
                    aVar.P = p3Var.d0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    p3Var.z(a1Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        aVar.R = concurrentHashMap;
        p3Var.endObject();
        return aVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static io.sentry.protocol.e c(p3 p3Var, a1 a1Var) {
        byte b;
        String strNextName;
        io.sentry.protocol.e eVar = new io.sentry.protocol.e();
        p3Var.beginObject();
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName2 = p3Var.nextName();
            strNextName2.getClass();
            int i = 2;
            switch (strNextName2.hashCode()) {
                case -1335157162:
                    b = !strNextName2.equals("device") ? (byte) -1 : (byte) 0;
                    break;
                case -895679987:
                    b = !strNextName2.equals("spring") ? (byte) -1 : (byte) 1;
                    break;
                case -340323263:
                    b = !strNextName2.equals("response") ? (byte) -1 : (byte) 2;
                    break;
                case -309425751:
                    b = !strNextName2.equals("profile") ? (byte) -1 : (byte) 3;
                    break;
                case -191501435:
                    b = !strNextName2.equals("feedback") ? (byte) -1 : (byte) 4;
                    break;
                case 3556:
                    b = !strNextName2.equals("os") ? (byte) -1 : (byte) 5;
                    break;
                case 96801:
                    b = !strNextName2.equals("app") ? (byte) -1 : (byte) 6;
                    break;
                case 96867:
                    b = !strNextName2.equals("art") ? (byte) -1 : (byte) 7;
                    break;
                case 102572:
                    b = !strNextName2.equals("gpu") ? (byte) -1 : (byte) 8;
                    break;
                case 97513095:
                    b = !strNextName2.equals("flags") ? (byte) -1 : (byte) 9;
                    break;
                case 110620997:
                    b = !strNextName2.equals("trace") ? (byte) -1 : (byte) 10;
                    break;
                case 150940456:
                    b = !strNextName2.equals("browser") ? (byte) -1 : (byte) 11;
                    break;
                case 1550962648:
                    b = !strNextName2.equals("runtime") ? (byte) -1 : (byte) 12;
                    break;
                default:
                    b = -1;
                    break;
            }
            ConcurrentHashMap concurrentHashMap = null;
            switch (b) {
                case 0:
                    eVar.o(d(p3Var, a1Var));
                    break;
                case 1:
                    eVar.u(io.sentry.protocol.b.e(p3Var, a1Var));
                    break;
                case 2:
                    eVar.s(io.sentry.protocol.b.d(p3Var, a1Var));
                    break;
                case 3:
                    p3Var.beginObject();
                    w3 w3Var = new w3(w.F);
                    while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strNextName3 = p3Var.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("profiler_id")) {
                            w wVar = (w) p3Var.o0(a1Var, new e(i));
                            if (wVar != null) {
                                w3Var.E = wVar;
                            }
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            p3Var.z(a1Var, concurrentHashMap, strNextName3);
                        }
                    }
                    w3Var.F = concurrentHashMap;
                    p3Var.endObject();
                    eVar.k("profile", w3Var);
                    break;
                case 4:
                    eVar.k("feedback", e(p3Var, a1Var));
                    break;
                case 5:
                    eVar.r(g(p3Var, a1Var));
                    break;
                case 6:
                    eVar.m(b(p3Var, a1Var));
                    break;
                case 7:
                    eVar.k("art", io.sentry.protocol.b.b(p3Var, a1Var));
                    break;
                case 8:
                    eVar.q(f(p3Var, a1Var));
                    break;
                case 9:
                    eVar.p(io.sentry.protocol.b.c(p3Var, a1Var));
                    break;
                case 10:
                    eVar.v(io.sentry.f.b(p3Var, a1Var));
                    break;
                case 11:
                    p3Var.beginObject();
                    io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                    while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strNextName4 = p3Var.nextName();
                        strNextName4.getClass();
                        if (strNextName4.equals("name")) {
                            dVar.E = p3Var.I();
                        } else if (strNextName4.equals("version")) {
                            dVar.F = p3Var.I();
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            p3Var.z(a1Var, concurrentHashMap, strNextName4);
                        }
                    }
                    dVar.G = concurrentHashMap;
                    p3Var.endObject();
                    eVar.n(dVar);
                    break;
                case 12:
                    p3Var.beginObject();
                    y yVar = new y();
                    while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        strNextName = p3Var.nextName();
                        strNextName.getClass();
                        switch (strNextName) {
                            case "raw_description":
                                yVar.G = p3Var.I();
                                break;
                            case "name":
                                yVar.E = p3Var.I();
                                break;
                            case "version":
                                yVar.F = p3Var.I();
                                break;
                            default:
                                if (concurrentHashMap == null) {
                                    concurrentHashMap = new ConcurrentHashMap();
                                }
                                p3Var.z(a1Var, concurrentHashMap, strNextName);
                                break;
                        }
                    }
                    yVar.H = concurrentHashMap;
                    p3Var.endObject();
                    eVar.t(yVar);
                    break;
                default:
                    Object objV0 = p3Var.v0();
                    if (objV0 != null) {
                        eVar.k(strNextName2, objV0);
                    }
                    break;
            }
        }
        p3Var.endObject();
        return eVar;
    }

    public static h d(p3 p3Var, a1 a1Var) {
        String strNextName;
        int i;
        p3Var.beginObject();
        h hVar = new h();
        ConcurrentHashMap concurrentHashMap = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            strNextName = p3Var.nextName();
            strNextName.getClass();
            i = 9;
            switch (strNextName) {
                case "timezone":
                    hVar.d0 = p3Var.G(a1Var);
                    break;
                case "boot_time":
                    if (p3Var.peek() != io.sentry.vendor.gson.stream.b.STRING) {
                        break;
                    } else {
                        hVar.c0 = p3Var.a0(a1Var);
                        break;
                    }
                    break;
                case "simulator":
                    hVar.P = p3Var.d0();
                    break;
                case "manufacturer":
                    hVar.F = p3Var.I();
                    break;
                case "processor_count":
                    hVar.i0 = p3Var.v();
                    break;
                case "orientation":
                    hVar.O = (io.sentry.protocol.g) p3Var.o0(a1Var, new a(i));
                    break;
                case "battery_temperature":
                    hVar.h0 = p3Var.n0();
                    break;
                case "family":
                    hVar.H = p3Var.I();
                    break;
                case "locale":
                    hVar.f0 = p3Var.I();
                    break;
                case "online":
                    hVar.N = p3Var.d0();
                    break;
                case "battery_level":
                    hVar.L = p3Var.n0();
                    break;
                case "model_id":
                    hVar.J = p3Var.I();
                    break;
                case "screen_density":
                    hVar.a0 = p3Var.n0();
                    break;
                case "screen_dpi":
                    hVar.b0 = p3Var.v();
                    break;
                case "free_memory":
                    hVar.R = p3Var.A();
                    break;
                case "id":
                    hVar.e0 = p3Var.I();
                    break;
                case "name":
                    hVar.E = p3Var.I();
                    break;
                case "low_memory":
                    hVar.T = p3Var.d0();
                    break;
                case "archs":
                    List list = (List) p3Var.v0();
                    if (list == null) {
                        break;
                    } else {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        hVar.K = strArr;
                        break;
                    }
                    break;
                case "brand":
                    hVar.G = p3Var.I();
                    break;
                case "model":
                    hVar.I = p3Var.I();
                    break;
                case "cpu_description":
                    hVar.k0 = p3Var.I();
                    break;
                case "processor_frequency":
                    hVar.j0 = p3Var.U();
                    break;
                case "connection_type":
                    hVar.g0 = p3Var.I();
                    break;
                case "chipset":
                    hVar.l0 = p3Var.I();
                    break;
                case "screen_width_pixels":
                    hVar.Y = p3Var.v();
                    break;
                case "external_storage_size":
                    hVar.W = p3Var.A();
                    break;
                case "storage_size":
                    hVar.U = p3Var.A();
                    break;
                case "usable_memory":
                    hVar.S = p3Var.A();
                    break;
                case "memory_size":
                    hVar.Q = p3Var.A();
                    break;
                case "charging":
                    hVar.M = p3Var.d0();
                    break;
                case "external_free_storage":
                    hVar.X = p3Var.A();
                    break;
                case "free_storage":
                    hVar.V = p3Var.A();
                    break;
                case "screen_height_pixels":
                    hVar.Z = p3Var.v();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    p3Var.z(a1Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        hVar.m0 = concurrentHashMap;
        p3Var.endObject();
        return hVar;
    }

    public static k e(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        String strI = null;
        String strI2 = null;
        String strI3 = null;
        w wVarB = null;
        w wVarB2 = null;
        String strI4 = null;
        HashMap map = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            strNextName = p3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "associated_event_id":
                    wVarB = e.b(p3Var);
                    break;
                case "replay_id":
                    wVarB2 = e.b(p3Var);
                    break;
                case "url":
                    strI4 = p3Var.I();
                    break;
                case "name":
                    strI3 = p3Var.I();
                    break;
                case "contact_email":
                    strI2 = p3Var.I();
                    break;
                case "message":
                    strI = p3Var.I();
                    break;
                default:
                    if (map == null) {
                        map = new HashMap();
                    }
                    p3Var.z(a1Var, map, strNextName);
                    break;
            }
        }
        p3Var.endObject();
        if (strI == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
            a1Var.d(t5.ERROR, "Missing required field \"message\"", illegalStateException);
            throw illegalStateException;
        }
        k kVar = new k(strI);
        kVar.F = strI2;
        kVar.G = strI3;
        kVar.H = wVarB;
        kVar.I = wVarB2;
        kVar.J = strI4;
        kVar.K = map;
        return kVar;
    }

    public static m f(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        m mVar = new m();
        ConcurrentHashMap concurrentHashMap = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            strNextName = p3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "npot_support":
                    mVar.M = p3Var.I();
                    break;
                case "vendor_id":
                    mVar.G = p3Var.I();
                    break;
                case "multi_threaded_rendering":
                    mVar.K = p3Var.d0();
                    break;
                case "id":
                    mVar.F = p3Var.v();
                    break;
                case "name":
                    mVar.E = p3Var.I();
                    break;
                case "vendor_name":
                    mVar.H = p3Var.I();
                    break;
                case "version":
                    mVar.L = p3Var.I();
                    break;
                case "api_type":
                    mVar.J = p3Var.I();
                    break;
                case "memory_size":
                    mVar.I = p3Var.v();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    p3Var.z(a1Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        mVar.N = concurrentHashMap;
        p3Var.endObject();
        return mVar;
    }

    public static q g(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        q qVar = new q();
        ConcurrentHashMap concurrentHashMap = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            strNextName = p3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "rooted":
                    qVar.J = p3Var.d0();
                    break;
                case "raw_description":
                    qVar.G = p3Var.I();
                    break;
                case "name":
                    qVar.E = p3Var.I();
                    break;
                case "build":
                    qVar.H = p3Var.I();
                    break;
                case "version":
                    qVar.F = p3Var.I();
                    break;
                case "kernel_version":
                    qVar.I = p3Var.I();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    p3Var.z(a1Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        qVar.K = concurrentHashMap;
        p3Var.endObject();
        return qVar;
    }

    public static IllegalStateException h(a1 a1Var, String str) {
        String strJ = ij0.j("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strJ);
        a1Var.d(t5.ERROR, strJ, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException i(a1 a1Var, String str) {
        String strJ = ij0.j("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strJ);
        a1Var.d(t5.ERROR, strJ, illegalStateException);
        return illegalStateException;
    }

    /*  JADX ERROR: NullPointerException in pass: SwitchBreakVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // io.sentry.z1
    public final java.lang.Object a(io.sentry.p3 r36, io.sentry.a1 r37) {
        /*
            Method dump skipped, instruction units count: 5224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.clientreport.a.a(io.sentry.p3, io.sentry.a1):java.lang.Object");
    }
}
