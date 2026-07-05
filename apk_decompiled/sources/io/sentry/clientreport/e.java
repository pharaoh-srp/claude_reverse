package io.sentry.clientreport;

import defpackage.ij0;
import io.sentry.a1;
import io.sentry.p3;
import io.sentry.protocol.i;
import io.sentry.protocol.w;
import io.sentry.rrweb.h;
import io.sentry.t5;
import io.sentry.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements z1 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(boolean z) {
        this.a = 2;
    }

    public static w b(p3 p3Var) {
        return new w(p3Var.nextString());
    }

    public static IllegalStateException c(a1 a1Var, String str) {
        String strJ = ij0.j("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strJ);
        a1Var.d(t5.ERROR, strJ, illegalStateException);
        return illegalStateException;
    }

    @Override // io.sentry.z1
    public final Object a(p3 p3Var, a1 a1Var) {
        String strNextName;
        String strNextName2;
        String strNextName3;
        String strNextName4;
        String strI = null;
        HashMap map = null;
        HashMap map2 = null;
        HashMap map3 = null;
        ConcurrentHashMap concurrentHashMap = null;
        String strI2 = null;
        switch (this.a) {
            case 0:
                p3Var.beginObject();
                String strI3 = null;
                Long lA = null;
                HashMap map4 = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName = p3Var.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "quantity":
                            lA = p3Var.A();
                            break;
                        case "reason":
                            strI = p3Var.I();
                            break;
                        case "category":
                            strI3 = p3Var.I();
                            break;
                        default:
                            if (map4 == null) {
                                map4 = new HashMap();
                            }
                            p3Var.z(a1Var, map4, strNextName);
                            break;
                    }
                }
                p3Var.endObject();
                if (strI == null) {
                    throw c(a1Var, "reason");
                }
                if (strI3 == null) {
                    throw c(a1Var, "category");
                }
                if (lA == null) {
                    throw c(a1Var, "quantity");
                }
                f fVar = new f(strI, strI3, lA);
                fVar.H = map4;
                return fVar;
            case 1:
                p3Var.beginObject();
                Boolean boolD0 = null;
                ConcurrentHashMap concurrentHashMap2 = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName5 = p3Var.nextName();
                    strNextName5.getClass();
                    if (strNextName5.equals("result")) {
                        boolD0 = p3Var.d0();
                    } else if (strNextName5.equals("flag")) {
                        strI2 = p3Var.I();
                    } else {
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        p3Var.z(a1Var, concurrentHashMap2, strNextName5);
                    }
                }
                if (strI2 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                    a1Var.d(t5.ERROR, "Missing required field \"flag\"", illegalStateException);
                    throw illegalStateException;
                }
                if (boolD0 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                    a1Var.d(t5.ERROR, "Missing required field \"result\"", illegalStateException2);
                    throw illegalStateException2;
                }
                i iVar = new i(strI2, boolD0.booleanValue());
                iVar.G = concurrentHashMap2;
                p3Var.endObject();
                return iVar;
            case 2:
                return b(p3Var);
            case 3:
                p3Var.beginObject();
                io.sentry.protocol.profiling.a aVar = new io.sentry.protocol.profiling.a();
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName2 = p3Var.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "frames":
                            ArrayList arrayListE0 = p3Var.E0(a1Var, new a(24));
                            if (arrayListE0 == null) {
                                break;
                            } else {
                                aVar.G = arrayListE0;
                                break;
                            }
                            break;
                        case "stacks":
                            List list = (List) p3Var.o0(a1Var, new e(4));
                            if (list == null) {
                                break;
                            } else {
                                aVar.F = list;
                                break;
                            }
                            break;
                        case "samples":
                            ArrayList arrayListE02 = p3Var.E0(a1Var, new e(5));
                            if (arrayListE02 == null) {
                                break;
                            } else {
                                aVar.E = arrayListE02;
                                break;
                            }
                            break;
                        case "thread_metadata":
                            HashMap mapM = p3Var.M(a1Var, new e(6));
                            if (mapM == null) {
                                break;
                            } else {
                                aVar.H = mapM;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            p3Var.z(a1Var, concurrentHashMap, strNextName2);
                            break;
                    }
                }
                aVar.I = concurrentHashMap;
                p3Var.endObject();
                return aVar;
            case 4:
                ArrayList arrayList = new ArrayList();
                p3Var.beginArray();
                while (p3Var.hasNext()) {
                    ArrayList arrayList2 = new ArrayList();
                    p3Var.beginArray();
                    while (p3Var.hasNext()) {
                        arrayList2.add(Integer.valueOf(p3Var.nextInt()));
                    }
                    p3Var.endArray();
                    arrayList.add(arrayList2);
                }
                p3Var.endArray();
                return arrayList;
            case 5:
                p3Var.beginObject();
                io.sentry.protocol.profiling.b bVar = new io.sentry.protocol.profiling.b();
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName3 = p3Var.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "thread_id":
                            bVar.G = p3Var.I();
                            break;
                        case "timestamp":
                            bVar.E = p3Var.nextDouble();
                            break;
                        case "stack_id":
                            bVar.F = p3Var.nextInt();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            p3Var.z(a1Var, map3, strNextName3);
                            break;
                    }
                }
                bVar.H = map3;
                p3Var.endObject();
                return bVar;
            case 6:
                p3Var.beginObject();
                io.sentry.protocol.profiling.c cVar = new io.sentry.protocol.profiling.c();
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName6 = p3Var.nextName();
                    strNextName6.getClass();
                    if (strNextName6.equals("priority")) {
                        cVar.F = p3Var.nextInt();
                    } else if (strNextName6.equals("name")) {
                        cVar.E = p3Var.I();
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        p3Var.z(a1Var, map2, strNextName6);
                    }
                }
                cVar.G = map2;
                p3Var.endObject();
                return cVar;
            case 7:
                return io.sentry.rrweb.d.values()[p3Var.nextInt()];
            case 8:
                return io.sentry.rrweb.f.values()[p3Var.nextInt()];
            default:
                p3Var.beginObject();
                h hVar = new h();
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName4 = p3Var.nextName();
                    strNextName4.getClass();
                    switch (strNextName4) {
                        case "x":
                            hVar.F = p3Var.nextFloat();
                            break;
                        case "y":
                            hVar.G = p3Var.nextFloat();
                            break;
                        case "id":
                            hVar.E = p3Var.nextInt();
                            break;
                        case "timeOffset":
                            hVar.H = p3Var.nextLong();
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            p3Var.z(a1Var, map, strNextName4);
                            break;
                    }
                }
                hVar.I = map;
                p3Var.endObject();
                return hVar;
        }
    }

    public /* synthetic */ e(int i) {
        this.a = i;
    }
}
