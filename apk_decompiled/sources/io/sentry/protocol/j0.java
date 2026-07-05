package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.p3;
import io.sentry.t5;
import io.sentry.z1;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements z1 {
    public final /* synthetic */ int a;

    public /* synthetic */ j0(int i) {
        this.a = i;
    }

    public static io.sentry.rrweb.a b(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        HashMap map = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName2 = p3Var.nextName();
            strNextName2.getClass();
            if (strNextName2.equals("data")) {
                p3Var.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName3 = p3Var.nextName();
                    strNextName3.getClass();
                    if (strNextName3.equals("payload")) {
                        p3Var.beginObject();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            strNextName = p3Var.nextName();
                            strNextName.getClass();
                            switch (strNextName) {
                                case "data":
                                    ConcurrentHashMap concurrentHashMapR = io.sentry.p.r((Map) p3Var.v0());
                                    if (concurrentHashMapR == null) {
                                        break;
                                    } else {
                                        aVar.M = concurrentHashMapR;
                                        break;
                                    }
                                    break;
                                case "type":
                                    aVar.I = p3Var.I();
                                    break;
                                case "category":
                                    aVar.J = p3Var.I();
                                    break;
                                case "timestamp":
                                    aVar.H = p3Var.nextDouble();
                                    break;
                                case "level":
                                    try {
                                        aVar.L = t5.valueOf(p3Var.nextString().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e) {
                                        a1Var.b(t5.DEBUG, e, "Error when deserializing SentryLevel", new Object[0]);
                                        break;
                                    }
                                    break;
                                case "message":
                                    aVar.K = p3Var.I();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    p3Var.z(a1Var, concurrentHashMap2, strNextName);
                                    break;
                            }
                        }
                        aVar.O = concurrentHashMap2;
                        p3Var.endObject();
                    } else if (strNextName3.equals("tag")) {
                        String strI = p3Var.I();
                        if (strI == null) {
                            strI = "";
                        }
                        aVar.G = strI;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        p3Var.z(a1Var, concurrentHashMap, strNextName3);
                    }
                }
                aVar.P = concurrentHashMap;
                p3Var.endObject();
            } else if (!io.sentry.config.a.j(aVar, strNextName2, p3Var, a1Var)) {
                if (map == null) {
                    map = new HashMap();
                }
                p3Var.z(a1Var, map, strNextName2);
            }
        }
        aVar.N = map;
        p3Var.endObject();
        return aVar;
    }

    public static io.sentry.rrweb.g c(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
        HashMap map = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName2 = p3Var.nextName();
            strNextName2.getClass();
            if (strNextName2.equals("data")) {
                p3Var.beginObject();
                HashMap map2 = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName = p3Var.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "x":
                            gVar.J = p3Var.nextFloat();
                            break;
                        case "y":
                            gVar.K = p3Var.nextFloat();
                            break;
                        case "id":
                            gVar.I = p3Var.nextInt();
                            break;
                        case "type":
                            gVar.H = (io.sentry.rrweb.f) p3Var.o0(a1Var, new io.sentry.clientreport.e(8));
                            break;
                        case "pointerType":
                            gVar.L = p3Var.nextInt();
                            break;
                        case "pointerId":
                            gVar.M = p3Var.nextInt();
                            break;
                        default:
                            if (!io.sentry.config.a.k(gVar, strNextName, p3Var, a1Var)) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                p3Var.z(a1Var, map2, strNextName);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                gVar.O = map2;
                p3Var.endObject();
            } else if (!io.sentry.config.a.j(gVar, strNextName2, p3Var, a1Var)) {
                if (map == null) {
                    map = new HashMap();
                }
                p3Var.z(a1Var, map, strNextName2);
            }
        }
        gVar.N = map;
        p3Var.endObject();
        return gVar;
    }

    public static io.sentry.rrweb.i d(p3 p3Var, a1 a1Var) {
        p3Var.beginObject();
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        HashMap map = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName = p3Var.nextName();
            strNextName.getClass();
            if (strNextName.equals("data")) {
                p3Var.beginObject();
                HashMap map2 = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName2 = p3Var.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("pointerId")) {
                        iVar.H = p3Var.nextInt();
                    } else if (strNextName2.equals("positions")) {
                        iVar.I = p3Var.E0(a1Var, new io.sentry.clientreport.e(9));
                    } else if (!io.sentry.config.a.k(iVar, strNextName2, p3Var, a1Var)) {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        p3Var.z(a1Var, map2, strNextName2);
                    }
                }
                iVar.K = map2;
                p3Var.endObject();
            } else if (!io.sentry.config.a.j(iVar, strNextName, p3Var, a1Var)) {
                if (map == null) {
                    map = new HashMap();
                }
                p3Var.z(a1Var, map, strNextName);
            }
        }
        iVar.J = map;
        p3Var.endObject();
        return iVar;
    }

    public static io.sentry.rrweb.j e(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
        HashMap map = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName2 = p3Var.nextName();
            strNextName2.getClass();
            if (strNextName2.equals("data")) {
                p3Var.beginObject();
                AbstractMap concurrentHashMap = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName = p3Var.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "height":
                            Integer numV = p3Var.v();
                            jVar.H = numV != null ? numV.intValue() : 0;
                            break;
                        case "href":
                            String strI = p3Var.I();
                            if (strI == null) {
                                strI = "";
                            }
                            jVar.G = strI;
                            break;
                        case "width":
                            Integer numV2 = p3Var.v();
                            jVar.I = numV2 != null ? numV2.intValue() : 0;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            p3Var.z(a1Var, concurrentHashMap, strNextName);
                            break;
                    }
                }
                p3Var.endObject();
            } else if (!io.sentry.config.a.j(jVar, strNextName2, p3Var, a1Var)) {
                if (map == null) {
                    map = new HashMap();
                }
                p3Var.z(a1Var, map, strNextName2);
            }
        }
        jVar.J = map;
        p3Var.endObject();
        return jVar;
    }

    public static io.sentry.rrweb.l f(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
        HashMap map = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName2 = p3Var.nextName();
            strNextName2.getClass();
            if (strNextName2.equals("data")) {
                p3Var.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName3 = p3Var.nextName();
                    strNextName3.getClass();
                    if (strNextName3.equals("payload")) {
                        p3Var.beginObject();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            strNextName = p3Var.nextName();
                            strNextName.getClass();
                            switch (strNextName) {
                                case "description":
                                    lVar.I = p3Var.I();
                                    break;
                                case "endTimestamp":
                                    lVar.K = p3Var.nextDouble();
                                    break;
                                case "startTimestamp":
                                    lVar.J = p3Var.nextDouble();
                                    break;
                                case "op":
                                    lVar.H = p3Var.I();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapR = io.sentry.p.r((Map) p3Var.v0());
                                    if (concurrentHashMapR == null) {
                                        break;
                                    } else {
                                        lVar.L = concurrentHashMapR;
                                        break;
                                    }
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    p3Var.z(a1Var, concurrentHashMap2, strNextName);
                                    break;
                            }
                        }
                        lVar.N = concurrentHashMap2;
                        p3Var.endObject();
                    } else if (strNextName3.equals("tag")) {
                        String strI = p3Var.I();
                        if (strI == null) {
                            strI = "";
                        }
                        lVar.G = strI;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        p3Var.z(a1Var, concurrentHashMap, strNextName3);
                    }
                }
                lVar.O = concurrentHashMap;
                p3Var.endObject();
            } else if (!io.sentry.config.a.j(lVar, strNextName2, p3Var, a1Var)) {
                if (map == null) {
                    map = new HashMap();
                }
                p3Var.z(a1Var, map, strNextName2);
            }
        }
        lVar.M = map;
        p3Var.endObject();
        return lVar;
    }

    public static io.sentry.rrweb.m g(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        io.sentry.rrweb.m mVar = new io.sentry.rrweb.m();
        HashMap map = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            String strNextName2 = p3Var.nextName();
            strNextName2.getClass();
            if (strNextName2.equals("data")) {
                p3Var.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName3 = p3Var.nextName();
                    strNextName3.getClass();
                    if (strNextName3.equals("payload")) {
                        p3Var.beginObject();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            strNextName = p3Var.nextName();
                            strNextName.getClass();
                            switch (strNextName) {
                                case "duration":
                                    mVar.J = p3Var.nextLong();
                                    break;
                                case "segmentId":
                                    mVar.H = p3Var.nextInt();
                                    break;
                                case "height":
                                    Integer numV = p3Var.v();
                                    mVar.M = numV != null ? numV.intValue() : 0;
                                    break;
                                case "container":
                                    String strI = p3Var.I();
                                    if (strI == null) {
                                        strI = "";
                                    }
                                    mVar.L = strI;
                                    break;
                                case "frameCount":
                                    Integer numV2 = p3Var.v();
                                    mVar.O = numV2 != null ? numV2.intValue() : 0;
                                    break;
                                case "top":
                                    Integer numV3 = p3Var.v();
                                    mVar.S = numV3 != null ? numV3.intValue() : 0;
                                    break;
                                case "left":
                                    Integer numV4 = p3Var.v();
                                    mVar.R = numV4 != null ? numV4.intValue() : 0;
                                    break;
                                case "size":
                                    Long lA = p3Var.A();
                                    mVar.I = lA == null ? 0L : lA.longValue();
                                    break;
                                case "width":
                                    Integer numV5 = p3Var.v();
                                    mVar.N = numV5 != null ? numV5.intValue() : 0;
                                    break;
                                case "frameRate":
                                    Integer numV6 = p3Var.v();
                                    mVar.Q = numV6 != null ? numV6.intValue() : 0;
                                    break;
                                case "encoding":
                                    String strI2 = p3Var.I();
                                    if (strI2 == null) {
                                        strI2 = "";
                                    }
                                    mVar.K = strI2;
                                    break;
                                case "frameRateType":
                                    String strI3 = p3Var.I();
                                    if (strI3 == null) {
                                        strI3 = "";
                                    }
                                    mVar.P = strI3;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    p3Var.z(a1Var, concurrentHashMap2, strNextName);
                                    break;
                            }
                        }
                        mVar.U = concurrentHashMap2;
                        p3Var.endObject();
                    } else if (strNextName3.equals("tag")) {
                        String strI4 = p3Var.I();
                        mVar.G = strI4 != null ? strI4 : "";
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        p3Var.z(a1Var, concurrentHashMap, strNextName3);
                    }
                }
                mVar.V = concurrentHashMap;
                p3Var.endObject();
            } else if (!io.sentry.config.a.j(mVar, strNextName2, p3Var, a1Var)) {
                if (map == null) {
                    map = new HashMap();
                }
                p3Var.z(a1Var, map, strNextName2);
            }
        }
        mVar.T = map;
        p3Var.endObject();
        return mVar;
    }

    @Override // io.sentry.z1
    public final Object a(p3 p3Var, a1 a1Var) {
        String strNextName;
        int i = 1;
        String strI = null;
        HashMap map = null;
        switch (this.a) {
            case 0:
                p3Var.beginObject();
                ArrayList arrayListE0 = null;
                HashMap map2 = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName2 = p3Var.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("rendering_system")) {
                        strI = p3Var.I();
                    } else if (strNextName2.equals("windows")) {
                        arrayListE0 = p3Var.E0(a1Var, new j0(i));
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        p3Var.z(a1Var, map2, strNextName2);
                    }
                }
                p3Var.endObject();
                k0 k0Var = new k0(strI, arrayListE0);
                k0Var.G = map2;
                return k0Var;
            case 1:
                l0 l0Var = new l0();
                p3Var.beginObject();
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName = p3Var.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "rendering_system":
                            l0Var.E = p3Var.I();
                            break;
                        case "identifier":
                            l0Var.G = p3Var.I();
                            break;
                        case "height":
                            l0Var.J = p3Var.U();
                            break;
                        case "x":
                            l0Var.K = p3Var.U();
                            break;
                        case "y":
                            l0Var.L = p3Var.U();
                            break;
                        case "tag":
                            l0Var.H = p3Var.I();
                            break;
                        case "type":
                            l0Var.F = p3Var.I();
                            break;
                        case "alpha":
                            l0Var.N = p3Var.U();
                            break;
                        case "width":
                            l0Var.I = p3Var.U();
                            break;
                        case "children":
                            l0Var.O = p3Var.E0(a1Var, this);
                            break;
                        case "visibility":
                            l0Var.M = p3Var.I();
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
                l0Var.P = map;
                return l0Var;
            case 2:
                return b(p3Var, a1Var);
            case 3:
                return io.sentry.rrweb.c.values()[p3Var.nextInt()];
            case 4:
                return c(p3Var, a1Var);
            case 5:
                return d(p3Var, a1Var);
            case 6:
                return e(p3Var, a1Var);
            case 7:
                return f(p3Var, a1Var);
            default:
                return g(p3Var, a1Var);
        }
    }
}
