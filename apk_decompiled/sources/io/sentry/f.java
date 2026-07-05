package io.sentry;

import com.anthropic.claude.api.tasks.TaskSessionEvent;
import defpackage.ij0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class f implements z1 {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    public static j7 b(p3 p3Var, a1 a1Var) {
        String strNextName;
        p3Var.beginObject();
        io.sentry.protocol.w wVarB = null;
        m7 m7Var = null;
        String strNextString = null;
        ConcurrentHashMap concurrentHashMap = null;
        m7 m7Var2 = null;
        String strNextString2 = null;
        n7 n7Var = null;
        String strNextString3 = null;
        ConcurrentHashMap concurrentHashMapR = null;
        Map map = null;
        while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
            strNextName = p3Var.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "span_id":
                    m7Var = new m7(p3Var.nextString());
                    break;
                case "parent_span_id":
                    m7Var2 = (m7) p3Var.o0(a1Var, new f(18));
                    break;
                case "description":
                    strNextString2 = p3Var.nextString();
                    break;
                case "origin":
                    strNextString3 = p3Var.nextString();
                    break;
                case "status":
                    n7Var = (n7) p3Var.o0(a1Var, new f(19));
                    break;
                case "op":
                    strNextString = p3Var.nextString();
                    break;
                case "data":
                    map = (Map) p3Var.v0();
                    break;
                case "tags":
                    concurrentHashMapR = p.r((Map) p3Var.v0());
                    break;
                case "trace_id":
                    wVarB = io.sentry.clientreport.e.b(p3Var);
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    p3Var.z(a1Var, concurrentHashMap, strNextName);
                    break;
            }
        }
        if (wVarB == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            a1Var.d(t5.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (m7Var == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            a1Var.d(t5.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        if (strNextString == null) {
            strNextString = "";
        }
        j7 j7Var = new j7(wVarB, m7Var, strNextString, m7Var2);
        j7Var.J = strNextString2;
        j7Var.K = n7Var;
        j7Var.M = strNextString3;
        if (concurrentHashMapR != null) {
            j7Var.L = concurrentHashMapR;
        }
        if (map != null) {
            j7Var.N = map;
        }
        j7Var.O = concurrentHashMap;
        p3Var.endObject();
        return j7Var;
    }

    public static IllegalStateException c(a1 a1Var, String str) {
        String strJ = ij0.j("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strJ);
        a1Var.d(t5.ERROR, strJ, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // io.sentry.z1
    public final Object a(p3 p3Var, a1 a1Var) {
        byte b;
        byte b2;
        String strNextName;
        String strNextName2;
        String strNextName3;
        String strNextName4;
        String strNextName5;
        String strNextName6;
        String strNextName7;
        String strNextName8;
        String strNextName9;
        Date date;
        String str;
        String strNextName10;
        p3 p3Var2 = p3Var;
        int i = 11;
        switch (this.a) {
            case 0:
                char c = 2;
                String strI = null;
                char c2 = 5;
                p3Var2.beginObject();
                Date dateK = p.k();
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                String strI2 = null;
                String strI3 = null;
                String strI4 = null;
                t5 t5VarValueOf = null;
                ConcurrentHashMap concurrentHashMap2 = null;
                Date date2 = dateK;
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName11 = p3Var2.nextName();
                    strNextName11.getClass();
                    switch (strNextName11.hashCode()) {
                        case -1008619738:
                            b = strNextName11.equals("origin") ? (byte) 0 : (byte) -1;
                            break;
                        case 3076010:
                            b = strNextName11.equals("data") ? (byte) 1 : (byte) -1;
                            break;
                        case 3575610:
                            b = strNextName11.equals("type") ? c : (byte) -1;
                            break;
                        case 50511102:
                            b = strNextName11.equals("category") ? (byte) 3 : (byte) -1;
                            break;
                        case 55126294:
                            b = strNextName11.equals("timestamp") ? (byte) 4 : (byte) -1;
                            break;
                        case 102865796:
                            b = strNextName11.equals("level") ? c2 : (byte) -1;
                            break;
                        case 954925063:
                            b = strNextName11.equals("message") ? (byte) 6 : (byte) -1;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            strI4 = p3Var.I();
                            continue;
                            p3Var2 = p3Var;
                            c2 = 5;
                            c = 2;
                            break;
                        case 1:
                            ConcurrentHashMap concurrentHashMapR = p.r((Map) p3Var.v0());
                            if (concurrentHashMapR != null) {
                                concurrentHashMap = concurrentHashMapR;
                            } else {
                                continue;
                            }
                            p3Var2 = p3Var;
                            c2 = 5;
                            c = 2;
                            break;
                        case 2:
                            strI2 = p3Var.I();
                            continue;
                            p3Var2 = p3Var;
                            c2 = 5;
                            c = 2;
                            break;
                        case 3:
                            strI3 = p3Var.I();
                            continue;
                            p3Var2 = p3Var;
                            c2 = 5;
                            c = 2;
                            break;
                        case 4:
                            Date dateA0 = p3Var.a0(a1Var);
                            if (dateA0 != null) {
                                date2 = dateA0;
                            } else {
                                continue;
                            }
                            p3Var2 = p3Var;
                            c2 = 5;
                            c = 2;
                            break;
                        case 5:
                            try {
                                t5VarValueOf = t5.valueOf(p3Var2.nextString().toUpperCase(Locale.ROOT));
                            } catch (Exception e) {
                                a1Var.b(t5.ERROR, e, "Error when deserializing SentryLevel", new Object[0]);
                            }
                            break;
                        case 6:
                            strI = p3Var2.I();
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            p3Var2.z(a1Var, concurrentHashMap2, strNextName11);
                            break;
                    }
                    p3Var2 = p3Var;
                    c2 = 5;
                    c = 2;
                }
                g gVar = new g(date2);
                gVar.H = strI;
                gVar.I = strI2;
                gVar.J = concurrentHashMap;
                gVar.K = strI3;
                gVar.L = strI4;
                gVar.M = t5VarValueOf;
                gVar.N = concurrentHashMap2;
                p3Var.endObject();
                return gVar;
            case 1:
                char c3 = 4;
                char c4 = 11;
                ConcurrentHashMap concurrentHashMap3 = null;
                p3Var2.beginObject();
                io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
                v3 v3Var = new v3(wVar, wVar, null, new HashMap(), Double.valueOf(0.0d), "android", w6.empty());
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName12 = p3Var2.nextName();
                    strNextName12.getClass();
                    switch (strNextName12.hashCode()) {
                        case -1840434063:
                            b2 = strNextName12.equals("debug_meta") ? (byte) 0 : (byte) -1;
                            break;
                        case -362243017:
                            b2 = strNextName12.equals("measurements") ? (byte) 1 : (byte) -1;
                            break;
                        case -309425751:
                            b2 = strNextName12.equals("profile") ? (byte) 2 : (byte) -1;
                            break;
                        case -85904877:
                            b2 = strNextName12.equals("environment") ? (byte) 3 : (byte) -1;
                            break;
                        case 55126294:
                            b2 = strNextName12.equals("timestamp") ? c3 : (byte) -1;
                            break;
                        case 178573617:
                            b2 = strNextName12.equals("profiler_id") ? (byte) 5 : (byte) -1;
                            break;
                        case 351608024:
                            b2 = strNextName12.equals("version") ? (byte) 6 : (byte) -1;
                            break;
                        case 1090594823:
                            b2 = strNextName12.equals(BuildConfig.BUILD_TYPE) ? (byte) 7 : (byte) -1;
                            break;
                        case 1102774726:
                            b2 = strNextName12.equals("client_sdk") ? (byte) 8 : (byte) -1;
                            break;
                        case 1874684019:
                            b2 = strNextName12.equals("platform") ? (byte) 9 : (byte) -1;
                            break;
                        case 1953158756:
                            b2 = strNextName12.equals("sampled_profile") ? (byte) 10 : (byte) -1;
                            break;
                        case 2005113901:
                            b2 = strNextName12.equals("chunk_id") ? c4 : (byte) -1;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            io.sentry.protocol.f fVar = (io.sentry.protocol.f) p3Var2.o0(a1Var, new io.sentry.clientreport.a(7));
                            if (fVar != null) {
                                v3Var.E = fVar;
                            }
                            break;
                        case 1:
                            HashMap mapM = p3Var2.M(a1Var, new io.sentry.clientreport.a(1));
                            if (mapM != null) {
                                v3Var.I.putAll(mapM);
                            }
                            break;
                        case 2:
                            io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) p3Var2.o0(a1Var, new io.sentry.clientreport.e(3));
                            if (aVar != null) {
                                v3Var.Q = aVar;
                            }
                            break;
                        case 3:
                            String strI5 = p3Var2.I();
                            if (strI5 != null) {
                                v3Var.L = strI5;
                            }
                            break;
                        case 4:
                            Double dU = p3Var2.U();
                            if (dU != null) {
                                v3Var.N = dU.doubleValue();
                            }
                            break;
                        case 5:
                            io.sentry.protocol.w wVar2 = (io.sentry.protocol.w) p3Var2.o0(a1Var, new io.sentry.clientreport.e(2));
                            if (wVar2 != null) {
                                v3Var.F = wVar2;
                            }
                            break;
                        case 6:
                            String strI6 = p3Var2.I();
                            if (strI6 != null) {
                                v3Var.M = strI6;
                            }
                            break;
                        case 7:
                            String strI7 = p3Var2.I();
                            if (strI7 != null) {
                                v3Var.K = strI7;
                            }
                            break;
                        case 8:
                            io.sentry.protocol.u uVar = (io.sentry.protocol.u) p3Var2.o0(a1Var, new io.sentry.clientreport.a(19));
                            if (uVar != null) {
                                v3Var.H = uVar;
                            }
                            break;
                        case 9:
                            String strI8 = p3Var2.I();
                            if (strI8 != null) {
                                v3Var.J = strI8;
                            }
                            break;
                        case 10:
                            String strI9 = p3Var2.I();
                            if (strI9 != null) {
                                v3Var.P = strI9;
                            }
                            break;
                        case 11:
                            io.sentry.protocol.w wVar3 = (io.sentry.protocol.w) p3Var2.o0(a1Var, new io.sentry.clientreport.e(2));
                            if (wVar3 != null) {
                                v3Var.G = wVar3;
                            }
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            p3Var2.z(a1Var, concurrentHashMap3, strNextName12);
                            break;
                    }
                    c4 = 11;
                    c3 = 4;
                }
                v3Var.R = concurrentHashMap3;
                p3Var2.endObject();
                return v3Var;
            case 2:
                ConcurrentHashMap concurrentHashMap4 = null;
                p3Var2.beginObject();
                w3 w3Var = new w3(io.sentry.protocol.w.F);
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName13 = p3Var2.nextName();
                    strNextName13.getClass();
                    if (strNextName13.equals("profiler_id")) {
                        io.sentry.protocol.w wVar4 = (io.sentry.protocol.w) p3Var2.o0(a1Var, new io.sentry.clientreport.e(2));
                        if (wVar4 != null) {
                            w3Var.E = wVar4;
                        }
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        p3Var2.z(a1Var, concurrentHashMap4, strNextName13);
                    }
                }
                w3Var.F = concurrentHashMap4;
                p3Var2.endObject();
                return w3Var;
            case 3:
                ConcurrentHashMap concurrentHashMap5 = null;
                p3Var2.beginObject();
                File file = new File("dummy");
                Date dateK2 = p.k();
                ArrayList arrayList = new ArrayList();
                m3 m3Var = m3.a;
                y3 y3Var = new y3(file, dateK2, arrayList, "", m3Var.t().toString(), m3Var.y().E.toString(), TaskSessionEvent.REPLAY_FROM_START, 0, "", new o0(2), null, null, null, null, null, null, null, null, "normal", new HashMap());
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName = p3Var2.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "device_manufacturer":
                            String strI10 = p3Var2.I();
                            if (strI10 == null) {
                                break;
                            } else {
                                y3Var.I = strI10;
                                break;
                            }
                            break;
                        case "android_api_level":
                            Integer numV = p3Var2.v();
                            if (numV == null) {
                                break;
                            } else {
                                y3Var.G = numV.intValue();
                                break;
                            }
                            break;
                        case "build_id":
                            String strI11 = p3Var2.I();
                            if (strI11 == null) {
                                break;
                            } else {
                                y3Var.S = strI11;
                                break;
                            }
                            break;
                        case "device_locale":
                            String strI12 = p3Var2.I();
                            if (strI12 == null) {
                                break;
                            } else {
                                y3Var.H = strI12;
                                break;
                            }
                            break;
                        case "profile_id":
                            String strI13 = p3Var2.I();
                            if (strI13 == null) {
                                break;
                            } else {
                                y3Var.a0 = strI13;
                                break;
                            }
                            break;
                        case "device_os_build_number":
                            String strI14 = p3Var2.I();
                            if (strI14 == null) {
                                break;
                            } else {
                                y3Var.K = strI14;
                                break;
                            }
                            break;
                        case "device_model":
                            String strI15 = p3Var2.I();
                            if (strI15 == null) {
                                break;
                            } else {
                                y3Var.J = strI15;
                                break;
                            }
                            break;
                        case "device_is_emulator":
                            Boolean boolD0 = p3Var2.d0();
                            if (boolD0 == null) {
                                break;
                            } else {
                                y3Var.N = boolD0.booleanValue();
                                break;
                            }
                            break;
                        case "duration_ns":
                            String strI16 = p3Var2.I();
                            if (strI16 == null) {
                                break;
                            } else {
                                y3Var.V = strI16;
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapM2 = p3Var2.M(a1Var, new io.sentry.clientreport.a(1));
                            if (mapM2 == null) {
                                break;
                            } else {
                                y3Var.e0.putAll(mapM2);
                                break;
                            }
                            break;
                        case "device_physical_memory_bytes":
                            String strI17 = p3Var2.I();
                            if (strI17 == null) {
                                break;
                            } else {
                                y3Var.Q = strI17;
                                break;
                            }
                            break;
                        case "device_cpu_frequencies":
                            List list = (List) p3Var2.v0();
                            if (list == null) {
                                break;
                            } else {
                                y3Var.P = list;
                                break;
                            }
                            break;
                        case "version_code":
                            String strI18 = p3Var2.I();
                            if (strI18 == null) {
                                break;
                            } else {
                                y3Var.W = strI18;
                                break;
                            }
                            break;
                        case "version_name":
                            String strI19 = p3Var2.I();
                            if (strI19 == null) {
                                break;
                            } else {
                                y3Var.X = strI19;
                                break;
                            }
                            break;
                        case "environment":
                            String strI20 = p3Var2.I();
                            if (strI20 == null) {
                                break;
                            } else {
                                y3Var.b0 = strI20;
                                break;
                            }
                            break;
                        case "timestamp":
                            Date dateA02 = p3Var.a0(a1Var);
                            if (dateA02 == null) {
                                break;
                            } else {
                                y3Var.d0 = dateA02;
                                break;
                            }
                            break;
                        case "transaction_name":
                            String strI21 = p3Var2.I();
                            if (strI21 == null) {
                                break;
                            } else {
                                y3Var.U = strI21;
                                break;
                            }
                            break;
                        case "device_os_name":
                            String strI22 = p3Var2.I();
                            if (strI22 == null) {
                                break;
                            } else {
                                y3Var.L = strI22;
                                break;
                            }
                            break;
                        case "architecture":
                            String strI23 = p3Var2.I();
                            if (strI23 == null) {
                                break;
                            } else {
                                y3Var.O = strI23;
                                break;
                            }
                            break;
                        case "transaction_id":
                            String strI24 = p3Var2.I();
                            if (strI24 == null) {
                                break;
                            } else {
                                y3Var.Y = strI24;
                                break;
                            }
                            break;
                        case "device_os_version":
                            String strI25 = p3Var2.I();
                            if (strI25 == null) {
                                break;
                            } else {
                                y3Var.M = strI25;
                                break;
                            }
                            break;
                        case "truncation_reason":
                            String strI26 = p3Var2.I();
                            if (strI26 == null) {
                                break;
                            } else {
                                y3Var.c0 = strI26;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strI27 = p3Var2.I();
                            if (strI27 == null) {
                                break;
                            } else {
                                y3Var.Z = strI27;
                                break;
                            }
                            break;
                        case "platform":
                            String strI28 = p3Var2.I();
                            if (strI28 == null) {
                                break;
                            } else {
                                y3Var.R = strI28;
                                break;
                            }
                            break;
                        case "sampled_profile":
                            String strI29 = p3Var2.I();
                            if (strI29 == null) {
                                break;
                            } else {
                                y3Var.f0 = strI29;
                                break;
                            }
                            break;
                        case "transactions":
                            ArrayList arrayListE0 = p3Var2.E0(a1Var, new f(4));
                            if (arrayListE0 == null) {
                                break;
                            } else {
                                y3Var.T.addAll(arrayListE0);
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            p3Var2.z(a1Var, concurrentHashMap5, strNextName);
                            break;
                    }
                }
                y3Var.g0 = concurrentHashMap5;
                p3Var2.endObject();
                return y3Var;
            case 4:
                ConcurrentHashMap concurrentHashMap6 = null;
                p3Var2.beginObject();
                z3 z3Var = new z3(m3.a, 0L, 0L);
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName2 = p3Var2.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "relative_start_ns":
                            Long lA = p3Var2.A();
                            if (lA == null) {
                                break;
                            } else {
                                z3Var.H = lA;
                                break;
                            }
                            break;
                        case "relative_end_ns":
                            Long lA2 = p3Var2.A();
                            if (lA2 == null) {
                                break;
                            } else {
                                z3Var.I = lA2;
                                break;
                            }
                            break;
                        case "id":
                            String strI30 = p3Var2.I();
                            if (strI30 == null) {
                                break;
                            } else {
                                z3Var.E = strI30;
                                break;
                            }
                            break;
                        case "name":
                            String strI31 = p3Var2.I();
                            if (strI31 == null) {
                                break;
                            } else {
                                z3Var.G = strI31;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strI32 = p3Var2.I();
                            if (strI32 == null) {
                                break;
                            } else {
                                z3Var.F = strI32;
                                break;
                            }
                            break;
                        case "relative_cpu_end_ms":
                            Long lA3 = p3Var2.A();
                            if (lA3 == null) {
                                break;
                            } else {
                                z3Var.K = lA3;
                                break;
                            }
                            break;
                        case "relative_cpu_start_ms":
                            Long lA4 = p3Var2.A();
                            if (lA4 == null) {
                                break;
                            } else {
                                z3Var.J = lA4;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            p3Var2.z(a1Var, concurrentHashMap6, strNextName2);
                            break;
                    }
                }
                z3Var.L = concurrentHashMap6;
                p3Var2.endObject();
                return z3Var;
            case 5:
                ArrayList arrayList2 = null;
                d4 d4Var = new d4();
                p3Var2.beginObject();
                HashMap map = null;
                Integer numV2 = null;
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName14 = p3Var2.nextName();
                    strNextName14.getClass();
                    if (strNextName14.equals("segment_id")) {
                        numV2 = p3Var2.v();
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        p3Var2.z(a1Var, map, strNextName14);
                    }
                }
                p3Var2.endObject();
                p3Var2.setLenient(true);
                List list2 = (List) p3Var2.v0();
                p3Var2.setLenient(false);
                if (list2 != null) {
                    arrayList2 = new ArrayList(list2.size());
                    for (Object obj : list2) {
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            io.sentry.util.i iVar = new io.sentry.util.i(map2);
                            for (Map.Entry entry : map2.entrySet()) {
                                String str2 = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str2.equals("type")) {
                                    io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                    int i2 = c4.b[cVar.ordinal()];
                                    if (i2 == 1) {
                                        Map map3 = (Map) map2.get("data");
                                        if (map3 == null) {
                                            map3 = Collections.EMPTY_MAP;
                                        }
                                        Integer num = (Integer) map3.get("source");
                                        if (num != null) {
                                            io.sentry.rrweb.d dVar = io.sentry.rrweb.d.values()[num.intValue()];
                                            int i3 = c4.a[dVar.ordinal()];
                                            if (i3 == 1) {
                                                arrayList2.add(io.sentry.protocol.j0.c(iVar, a1Var));
                                            } else if (i3 != 2) {
                                                a1Var.h(t5.DEBUG, "Unsupported rrweb incremental snapshot type %s", dVar);
                                            } else {
                                                arrayList2.add(io.sentry.protocol.j0.d(iVar, a1Var));
                                            }
                                        }
                                    } else if (i2 == 2) {
                                        arrayList2.add(io.sentry.protocol.j0.e(iVar, a1Var));
                                    } else if (i2 != 3) {
                                        a1Var.h(t5.DEBUG, "Unsupported rrweb event type %s", cVar);
                                    } else {
                                        Map map4 = (Map) map2.get("data");
                                        if (map4 == null) {
                                            map4 = Collections.EMPTY_MAP;
                                        }
                                        String str3 = (String) map4.get("tag");
                                        if (str3 != null) {
                                            switch (str3) {
                                                case "performanceSpan":
                                                    arrayList2.add(io.sentry.protocol.j0.f(iVar, a1Var));
                                                    break;
                                                case "video":
                                                    arrayList2.add(io.sentry.protocol.j0.g(iVar, a1Var));
                                                    break;
                                                case "breadcrumb":
                                                    arrayList2.add(io.sentry.protocol.j0.b(iVar, a1Var));
                                                    break;
                                                default:
                                                    a1Var.h(t5.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                d4Var.E = numV2;
                d4Var.F = arrayList2;
                d4Var.G = map;
                return d4Var;
            case 6:
                p3Var2.beginObject();
                u4 u4Var = new u4();
                u4Var.G = false;
                ConcurrentHashMap concurrentHashMap7 = null;
                u4Var.H = null;
                u4Var.E = false;
                u4Var.F = null;
                u4Var.M = false;
                u4Var.I = null;
                u4Var.J = false;
                u4Var.K = false;
                u4Var.P = x3.MANUAL;
                u4Var.L = 0;
                u4Var.N = true;
                u4Var.O = false;
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName3 = p3Var2.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "is_enable_app_start_profiling":
                            Boolean boolD02 = p3Var2.d0();
                            if (boolD02 == null) {
                                break;
                            } else {
                                u4Var.N = boolD02.booleanValue();
                                break;
                            }
                            break;
                        case "trace_sampled":
                            Boolean boolD03 = p3Var2.d0();
                            if (boolD03 == null) {
                                break;
                            } else {
                                u4Var.G = boolD03.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_dir_path":
                            String strI33 = p3Var2.I();
                            if (strI33 == null) {
                                break;
                            } else {
                                u4Var.I = strI33;
                                break;
                            }
                            break;
                        case "is_continuous_profiling_enabled":
                            Boolean boolD04 = p3Var2.d0();
                            if (boolD04 == null) {
                                break;
                            } else {
                                u4Var.K = boolD04.booleanValue();
                                break;
                            }
                            break;
                        case "is_profiling_enabled":
                            Boolean boolD05 = p3Var2.d0();
                            if (boolD05 == null) {
                                break;
                            } else {
                                u4Var.J = boolD05.booleanValue();
                                break;
                            }
                            break;
                        case "is_start_profiler_on_app_start":
                            Boolean boolD06 = p3Var2.d0();
                            if (boolD06 == null) {
                                break;
                            } else {
                                u4Var.O = boolD06.booleanValue();
                                break;
                            }
                            break;
                        case "profile_sampled":
                            Boolean boolD07 = p3Var2.d0();
                            if (boolD07 == null) {
                                break;
                            } else {
                                u4Var.E = boolD07.booleanValue();
                                break;
                            }
                            break;
                        case "profile_lifecycle":
                            String strI34 = p3Var2.I();
                            if (strI34 == null) {
                                break;
                            } else {
                                try {
                                    u4Var.P = x3.valueOf(strI34);
                                } catch (IllegalArgumentException unused) {
                                    a1Var.h(t5.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strI34), new Object[0]);
                                }
                                break;
                            }
                            break;
                        case "continuous_profile_sampled":
                            Boolean boolD08 = p3Var2.d0();
                            if (boolD08 == null) {
                                break;
                            } else {
                                u4Var.M = boolD08.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_hz":
                            Integer numV3 = p3Var2.v();
                            if (numV3 == null) {
                                break;
                            } else {
                                u4Var.L = numV3.intValue();
                                break;
                            }
                            break;
                        case "trace_sample_rate":
                            Double dU2 = p3Var2.U();
                            if (dU2 == null) {
                                break;
                            } else {
                                u4Var.H = dU2;
                                break;
                            }
                            break;
                        case "profile_sample_rate":
                            Double dU3 = p3Var2.U();
                            if (dU3 == null) {
                                break;
                            } else {
                                u4Var.F = dU3;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            p3Var2.z(a1Var, concurrentHashMap7, strNextName3);
                            break;
                    }
                }
                u4Var.Q = concurrentHashMap7;
                p3Var2.endObject();
                return u4Var;
            case 7:
                p3Var2.beginObject();
                io.sentry.protocol.u uVar2 = null;
                p7 p7Var = null;
                io.sentry.protocol.w wVar5 = null;
                Date dateA03 = null;
                HashMap map5 = null;
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName4 = p3Var2.nextName();
                    strNextName4.getClass();
                    switch (strNextName4) {
                        case "sdk":
                            uVar2 = (io.sentry.protocol.u) p3Var2.o0(a1Var, new io.sentry.clientreport.a(19));
                            continue;
                            break;
                        case "trace":
                            p7Var = (p7) p3Var2.o0(a1Var, new v5(5));
                            continue;
                            break;
                        case "event_id":
                            wVar5 = (io.sentry.protocol.w) p3Var2.o0(a1Var, new io.sentry.clientreport.e(2));
                            break;
                        case "sent_at":
                            dateA03 = p3Var.a0(a1Var);
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            p3Var2.z(a1Var, map5, strNextName4);
                            break;
                    }
                }
                c5 c5Var = new c5(wVar5, uVar2, p7Var);
                c5Var.H = dateA03;
                c5Var.I = map5;
                p3Var2.endObject();
                return c5Var;
            case 8:
                p3Var2.beginObject();
                int iNextInt = 0;
                HashMap map6 = null;
                s5 s5Var = null;
                String strI35 = null;
                String strI36 = null;
                String strI37 = null;
                String strI38 = null;
                Integer numV4 = null;
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName5 = p3Var2.nextName();
                    strNextName5.getClass();
                    switch (strNextName5) {
                        case "item_count":
                            numV4 = p3Var2.v();
                            continue;
                            break;
                        case "length":
                            iNextInt = p3Var2.nextInt();
                            continue;
                            break;
                        case "filename":
                            strI36 = p3Var2.I();
                            continue;
                            break;
                        case "attachment_type":
                            strI37 = p3Var2.I();
                            continue;
                            break;
                        case "type":
                            s5Var = (s5) p3Var2.o0(a1Var, new f(10));
                            continue;
                            break;
                        case "content_type":
                            strI35 = p3Var2.I();
                            break;
                        case "platform":
                            strI38 = p3Var2.I();
                            break;
                        default:
                            if (map6 == null) {
                                map6 = new HashMap();
                            }
                            p3Var2.z(a1Var, map6, strNextName5);
                            break;
                    }
                }
                if (s5Var == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                    a1Var.d(t5.ERROR, "Missing required field \"type\"", illegalStateException);
                    throw illegalStateException;
                }
                i5 i5Var = new i5(s5Var, iNextInt, strI35, strI36, strI37, strI38, numV4);
                i5Var.M = map6;
                p3Var2.endObject();
                return i5Var;
            case 9:
                p3Var2.beginObject();
                j5 j5Var = new j5();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName6 = p3Var2.nextName();
                    strNextName6.getClass();
                    switch (strNextName6) {
                        case "fingerprint":
                            List list3 = (List) p3Var2.v0();
                            if (list3 == null) {
                                break;
                            } else {
                                j5Var.a0 = list3;
                                break;
                            }
                            break;
                        case "threads":
                            p3Var2.beginObject();
                            p3Var2.nextName();
                            j5Var.W = new j2(p3Var2.E0(a1Var, new io.sentry.clientreport.a(27)));
                            p3Var2.endObject();
                            break;
                        case "logger":
                            j5Var.V = p3Var2.I();
                            break;
                        case "timestamp":
                            Date dateA04 = p3Var.a0(a1Var);
                            if (dateA04 == null) {
                                break;
                            } else {
                                j5Var.T = dateA04;
                                break;
                            }
                            break;
                        case "level":
                            j5Var.Y = (t5) p3Var2.o0(a1Var, new f(i));
                            break;
                        case "message":
                            j5Var.U = (io.sentry.protocol.p) p3Var2.o0(a1Var, new io.sentry.clientreport.a(15));
                            break;
                        case "modules":
                            j5Var.c0 = p.r((Map) p3Var2.v0());
                            break;
                        case "exception":
                            p3Var2.beginObject();
                            p3Var2.nextName();
                            j5Var.X = new j2(p3Var2.E0(a1Var, new io.sentry.clientreport.a(20)));
                            p3Var2.endObject();
                            break;
                        case "transaction":
                            j5Var.Z = p3Var2.I();
                            break;
                        default:
                            if (!io.sentry.config.a.i(j5Var, strNextName6, p3Var2, a1Var)) {
                                if (concurrentHashMap8 == null) {
                                    concurrentHashMap8 = new ConcurrentHashMap();
                                }
                                p3Var2.z(a1Var, concurrentHashMap8, strNextName6);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                j5Var.b0 = concurrentHashMap8;
                p3Var2.endObject();
                return j5Var;
            case 10:
                return s5.valueOfLabel(p3Var2.nextString().toLowerCase(Locale.ROOT));
            case 11:
                return t5.valueOf(p3Var2.nextString().toUpperCase(Locale.ROOT));
            case 12:
                u5 u5Var = new u5();
                p3Var2.beginObject();
                ConcurrentHashMap concurrentHashMap9 = null;
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName7 = p3Var2.nextName();
                    strNextName7.getClass();
                    switch (strNextName7) {
                        case "package_name":
                            u5Var.G = p3Var2.I();
                            break;
                        case "thread_id":
                            u5Var.I = p3Var2.A();
                            break;
                        case "address":
                            u5Var.F = p3Var2.I();
                            break;
                        case "class_name":
                            u5Var.H = p3Var2.I();
                            break;
                        case "type":
                            u5Var.E = p3Var2.nextInt();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            p3Var2.z(a1Var, concurrentHashMap9, strNextName7);
                            break;
                    }
                }
                u5Var.J = concurrentHashMap9;
                p3Var2.endObject();
                return u5Var;
            case 13:
                p3Var2.beginObject();
                HashMap map7 = null;
                ArrayList arrayListE02 = null;
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName15 = p3Var2.nextName();
                    strNextName15.getClass();
                    if (strNextName15.equals("items")) {
                        arrayListE02 = p3Var2.E0(a1Var, new v5(0));
                    } else {
                        if (map7 == null) {
                            map7 = new HashMap();
                        }
                        p3Var2.z(a1Var, map7, strNextName15);
                    }
                }
                p3Var2.endObject();
                if (arrayListE02 != null) {
                    y5 y5Var = new y5(arrayListE02);
                    y5Var.F = map7;
                    return y5Var;
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"items\"");
                a1Var.d(t5.ERROR, "Missing required field \"items\"", illegalStateException2);
                throw illegalStateException2;
            case 14:
                p3Var2.beginObject();
                HashMap map8 = null;
                ArrayList arrayListE03 = null;
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName16 = p3Var2.nextName();
                    strNextName16.getClass();
                    if (strNextName16.equals("items")) {
                        arrayListE03 = p3Var2.E0(a1Var, new v5(3));
                    } else {
                        if (map8 == null) {
                            map8 = new HashMap();
                        }
                        p3Var2.z(a1Var, map8, strNextName16);
                    }
                }
                p3Var2.endObject();
                if (arrayListE03 != null) {
                    c6 c6Var = new c6(arrayListE03);
                    c6Var.F = map8;
                    return c6Var;
                }
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"items\"");
                a1Var.d(t5.ERROR, "Missing required field \"items\"", illegalStateException3);
                throw illegalStateException3;
            case androidx.health.platform.client.proto.g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                y6 y6Var = new y6();
                p3Var2.beginObject();
                x6 x6Var = null;
                Date dateA05 = null;
                String strI39 = null;
                HashMap map9 = null;
                io.sentry.protocol.w wVar6 = null;
                Date dateA06 = null;
                List list4 = null;
                List list5 = null;
                List list6 = null;
                Integer numV5 = null;
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName8 = p3Var2.nextName();
                    strNextName8.getClass();
                    switch (strNextName8) {
                        case "replay_id":
                            wVar6 = (io.sentry.protocol.w) p3Var2.o0(a1Var, new io.sentry.clientreport.e(2));
                            continue;
                            break;
                        case "replay_start_timestamp":
                            dateA06 = p3Var.a0(a1Var);
                            break;
                        case "type":
                            strI39 = p3Var2.I();
                            break;
                        case "urls":
                            list4 = (List) p3Var2.v0();
                            break;
                        case "timestamp":
                            dateA05 = p3Var.a0(a1Var);
                            break;
                        case "error_ids":
                            list5 = (List) p3Var2.v0();
                            break;
                        case "trace_ids":
                            list6 = (List) p3Var2.v0();
                            break;
                        case "replay_type":
                            x6Var = (x6) p3Var2.o0(a1Var, new v5(4));
                            break;
                        case "segment_id":
                            numV5 = p3Var2.v();
                            break;
                        default:
                            if (!io.sentry.config.a.i(y6Var, strNextName8, p3Var2, a1Var)) {
                                if (map9 == null) {
                                    map9 = new HashMap();
                                }
                                p3Var2.z(a1Var, map9, strNextName8);
                                break;
                            }
                            break;
                    }
                }
                p3Var2.endObject();
                if (strI39 != null) {
                    y6Var.U = strI39;
                }
                if (x6Var != null) {
                    y6Var.V = x6Var;
                }
                if (numV5 != null) {
                    y6Var.X = numV5.intValue();
                }
                if (dateA05 != null) {
                    y6Var.Y = dateA05;
                }
                y6Var.W = wVar6;
                y6Var.Z = dateA06;
                y6Var.a0 = list4;
                y6Var.b0 = list5;
                y6Var.c0 = list6;
                y6Var.d0 = map9;
                return y6Var;
            case 16:
                p3Var2.beginObject();
                ConcurrentHashMap concurrentHashMap10 = null;
                g7 g7VarValueOf = null;
                Date dateA07 = null;
                Date dateA08 = null;
                String strI40 = null;
                Long lA5 = null;
                Boolean boolD09 = null;
                String strI41 = null;
                String strI42 = null;
                String strI43 = null;
                String strI44 = null;
                Double dU4 = null;
                Integer numV6 = null;
                String strI45 = null;
                String str4 = null;
                while (true) {
                    g7 g7Var = g7VarValueOf;
                    if (p3Var2.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        Date date3 = dateA07;
                        if (g7Var == null) {
                            throw c(a1Var, "status");
                        }
                        if (date3 == null) {
                            throw c(a1Var, "started");
                        }
                        if (numV6 == null) {
                            throw c(a1Var, "errors");
                        }
                        if (strI43 == null) {
                            throw c(a1Var, BuildConfig.BUILD_TYPE);
                        }
                        h7 h7Var = new h7(g7Var, date3, dateA08, numV6.intValue(), strI40, str4, boolD09, lA5, dU4, strI41, strI42, strI45, strI43, strI44);
                        h7Var.T = concurrentHashMap10;
                        p3Var2.endObject();
                        return h7Var;
                    }
                    strNextName9 = p3Var2.nextName();
                    strNextName9.getClass();
                    switch (strNextName9) {
                        case "duration":
                            dU4 = p3Var2.U();
                            g7VarValueOf = g7Var;
                            break;
                        case "started":
                            dateA07 = p3Var.a0(a1Var);
                            g7VarValueOf = g7Var;
                            break;
                        case "errors":
                            numV6 = p3Var2.v();
                            g7VarValueOf = g7Var;
                            break;
                        case "status":
                            date = dateA07;
                            String strA = io.sentry.util.o.a(p3Var2.I());
                            g7VarValueOf = strA != null ? g7.valueOf(strA) : g7Var;
                            dateA07 = date;
                            break;
                        case "did":
                            strI40 = p3Var2.I();
                            g7VarValueOf = g7Var;
                            break;
                        case "seq":
                            lA5 = p3Var2.A();
                            g7VarValueOf = g7Var;
                            break;
                        case "sid":
                            String strI46 = p3Var2.I();
                            if (strI46 != null) {
                                str = strI46;
                                if (strI46.length() == 36 || str.length() == 32) {
                                    g7VarValueOf = g7Var;
                                    str4 = str;
                                    break;
                                }
                            } else {
                                str = strI46;
                            }
                            date = dateA07;
                            a1Var.h(t5.ERROR, "%s sid is not valid.", str);
                            dateA07 = date;
                            break;
                        case "init":
                            boolD09 = p3Var2.d0();
                            g7VarValueOf = g7Var;
                            break;
                        case "timestamp":
                            dateA08 = p3Var.a0(a1Var);
                            g7VarValueOf = g7Var;
                            break;
                        case "attrs":
                            p3Var2.beginObject();
                            while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strNextName17 = p3Var2.nextName();
                                strNextName17.getClass();
                                switch (strNextName17) {
                                    case "environment":
                                        strI45 = p3Var2.I();
                                        break;
                                    case "release":
                                        strI43 = p3Var2.I();
                                        break;
                                    case "ip_address":
                                        strI41 = p3Var2.I();
                                        break;
                                    case "user_agent":
                                        strI42 = p3Var2.I();
                                        break;
                                    default:
                                        p3Var2.skipValue();
                                        break;
                                }
                            }
                            p3Var2.endObject();
                            g7VarValueOf = g7Var;
                            break;
                        case "abnormal_mechanism":
                            strI44 = p3Var2.I();
                            g7VarValueOf = g7Var;
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            p3Var2.z(a1Var, concurrentHashMap10, strNextName9);
                            g7VarValueOf = g7Var;
                            break;
                    }
                }
                break;
            case androidx.health.platform.client.proto.g.MAX_FIELD_NUMBER /* 17 */:
                return b(p3Var, a1Var);
            case androidx.health.platform.client.proto.g.AVG_FIELD_NUMBER /* 18 */:
                return new m7(p3Var2.nextString());
            case androidx.health.platform.client.proto.g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return n7.valueOf(p3Var2.nextString().toUpperCase(Locale.ROOT));
            default:
                p3Var2.beginObject();
                io.sentry.protocol.w wVarB = null;
                String strI47 = null;
                String strI48 = null;
                String strI49 = null;
                HashMap map10 = null;
                while (p3Var2.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName10 = p3Var2.nextName();
                    strNextName10.getClass();
                    switch (strNextName10) {
                        case "comments":
                            strI49 = p3Var2.I();
                            break;
                        case "name":
                            strI47 = p3Var2.I();
                            break;
                        case "email":
                            strI48 = p3Var2.I();
                            break;
                        case "event_id":
                            wVarB = io.sentry.clientreport.e.b(p3Var2);
                            break;
                        default:
                            if (map10 == null) {
                                map10 = new HashMap();
                            }
                            p3Var2.z(a1Var, map10, strNextName10);
                            break;
                    }
                }
                p3Var2.endObject();
                if (wVarB != null) {
                    v7 v7Var = new v7(wVarB, strI47, strI48, strI49);
                    v7Var.I = map10;
                    return v7Var;
                }
                IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"event_id\"");
                a1Var.d(t5.ERROR, "Missing required field \"event_id\"", illegalStateException4);
                throw illegalStateException4;
        }
    }
}
