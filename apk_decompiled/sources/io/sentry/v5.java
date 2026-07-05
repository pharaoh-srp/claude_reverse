package io.sentry;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.ij0;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class v5 implements z1 {
    public final /* synthetic */ int a;

    public /* synthetic */ v5(int i) {
        this.a = i;
    }

    public static IllegalStateException b(a1 a1Var, String str) {
        String strJ = ij0.j("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strJ);
        a1Var.d(t5.ERROR, strJ, illegalStateException);
        return illegalStateException;
    }

    @Override // io.sentry.z1
    public final Object a(p3 p3Var, a1 a1Var) {
        String strNextName;
        m7 m7Var;
        String strNextName2;
        String strNextName3;
        String str = "Missing required field \"timestamp\"";
        switch (this.a) {
            case 0:
                p3Var.beginObject();
                io.sentry.protocol.w wVar = null;
                Double dU = null;
                String strI = null;
                HashMap map = null;
                z5 z5Var = null;
                HashMap mapM = null;
                Integer numV = null;
                m7 m7Var2 = null;
                while (true) {
                    String str2 = str;
                    if (p3Var.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        p3Var.endObject();
                        if (wVar == null) {
                            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
                            a1Var.d(t5.ERROR, "Missing required field \"trace_id\"", illegalStateException);
                            throw illegalStateException;
                        }
                        if (dU == null) {
                            IllegalStateException illegalStateException2 = new IllegalStateException(str2);
                            a1Var.d(t5.ERROR, str2, illegalStateException2);
                            throw illegalStateException2;
                        }
                        if (strI == null) {
                            IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"body\"");
                            a1Var.d(t5.ERROR, "Missing required field \"body\"", illegalStateException3);
                            throw illegalStateException3;
                        }
                        if (z5Var == null) {
                            IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"level\"");
                            a1Var.d(t5.ERROR, "Missing required field \"level\"", illegalStateException4);
                            throw illegalStateException4;
                        }
                        w5 w5Var = new w5();
                        w5Var.E = wVar;
                        w5Var.G = dU;
                        w5Var.H = strI;
                        w5Var.I = z5Var;
                        w5Var.K = mapM;
                        w5Var.J = numV;
                        w5Var.F = m7Var2;
                        w5Var.L = map;
                        return w5Var;
                    }
                    strNextName = p3Var.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "span_id":
                            m7Var = (m7) p3Var.o0(a1Var, new f(18));
                            break;
                        case "severity_number":
                            numV = p3Var.v();
                            m7Var = m7Var2;
                            break;
                        case "body":
                            strI = p3Var.I();
                            m7Var = m7Var2;
                            break;
                        case "timestamp":
                            dU = p3Var.U();
                            m7Var = m7Var2;
                            break;
                        case "level":
                            z5Var = (z5) p3Var.o0(a1Var, new v5(2));
                            m7Var = m7Var2;
                            break;
                        case "attributes":
                            mapM = p3Var.M(a1Var, new v5(1));
                            m7Var = m7Var2;
                            break;
                        case "trace_id":
                            wVar = (io.sentry.protocol.w) p3Var.o0(a1Var, new io.sentry.clientreport.e(false));
                            m7Var = m7Var2;
                            break;
                        default:
                            if (map == null) {
                                map = new HashMap();
                            }
                            p3Var.z(a1Var, map, strNextName);
                            m7Var = m7Var2;
                            break;
                    }
                    m7Var2 = m7Var;
                    str = str2;
                }
                break;
            case 1:
                p3Var.beginObject();
                String strI2 = null;
                Object objV0 = null;
                HashMap map2 = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strNextName4 = p3Var.nextName();
                    strNextName4.getClass();
                    if (strNextName4.equals("type")) {
                        strI2 = p3Var.I();
                    } else if (strNextName4.equals(ExperienceToggle.DEFAULT_PARAM_KEY)) {
                        objV0 = p3Var.v0();
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        p3Var.z(a1Var, map2, strNextName4);
                    }
                }
                p3Var.endObject();
                if (strI2 == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"type\"");
                    a1Var.d(t5.ERROR, "Missing required field \"type\"", illegalStateException5);
                    throw illegalStateException5;
                }
                x5 x5Var = new x5();
                x5Var.E = strI2;
                if (objV0 == null || !strI2.equals("string")) {
                    x5Var.F = objV0;
                } else {
                    x5Var.F = objV0.toString();
                }
                x5Var.G = map2;
                return x5Var;
            case 2:
                return z5.valueOf(p3Var.nextString().toUpperCase(Locale.ROOT));
            case 3:
                p3Var.beginObject();
                io.sentry.protocol.w wVar2 = null;
                HashMap map3 = null;
                Double dU2 = null;
                String strI3 = null;
                String strI4 = null;
                Double dU3 = null;
                HashMap mapM2 = null;
                m7 m7Var3 = null;
                String strI5 = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName2 = p3Var.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "span_id":
                            m7Var3 = (m7) p3Var.o0(a1Var, new f(18));
                            break;
                        case "name":
                            strI4 = p3Var.I();
                            break;
                        case "type":
                            strI3 = p3Var.I();
                            break;
                        case "unit":
                            strI5 = p3Var.I();
                            break;
                        case "timestamp":
                            dU2 = p3Var.U();
                            break;
                        case "value":
                            dU3 = p3Var.U();
                            break;
                        case "attributes":
                            mapM2 = p3Var.M(a1Var, new v5(1));
                            break;
                        case "trace_id":
                            wVar2 = (io.sentry.protocol.w) p3Var.o0(a1Var, new io.sentry.clientreport.e(false));
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            p3Var.z(a1Var, map3, strNextName2);
                            break;
                    }
                }
                p3Var.endObject();
                if (wVar2 == null) {
                    IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"trace_id\"");
                    a1Var.d(t5.ERROR, "Missing required field \"trace_id\"", illegalStateException6);
                    throw illegalStateException6;
                }
                if (dU2 == null) {
                    IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"timestamp\"");
                    a1Var.d(t5.ERROR, "Missing required field \"timestamp\"", illegalStateException7);
                    throw illegalStateException7;
                }
                String str3 = strI3;
                if (str3 == null) {
                    IllegalStateException illegalStateException8 = new IllegalStateException("Missing required field \"type\"");
                    a1Var.d(t5.ERROR, "Missing required field \"type\"", illegalStateException8);
                    throw illegalStateException8;
                }
                String str4 = strI4;
                if (str4 == null) {
                    IllegalStateException illegalStateException9 = new IllegalStateException("Missing required field \"name\"");
                    a1Var.d(t5.ERROR, "Missing required field \"name\"", illegalStateException9);
                    throw illegalStateException9;
                }
                Double d = dU3;
                if (d == null) {
                    IllegalStateException illegalStateException10 = new IllegalStateException("Missing required field \"value\"");
                    a1Var.d(t5.ERROR, "Missing required field \"value\"", illegalStateException10);
                    throw illegalStateException10;
                }
                b6 b6Var = new b6();
                b6Var.E = wVar2;
                b6Var.G = dU2;
                b6Var.H = str4;
                b6Var.J = str3;
                b6Var.K = d;
                b6Var.L = mapM2;
                b6Var.F = m7Var3;
                b6Var.I = strI5;
                b6Var.M = map3;
                return b6Var;
            case 4:
                return x6.valueOf(p3Var.nextString().toUpperCase(Locale.ROOT));
            default:
                p3Var.beginObject();
                ConcurrentHashMap concurrentHashMap = null;
                io.sentry.protocol.w wVar3 = null;
                String strNextString = null;
                String strI6 = null;
                String strI7 = null;
                String strI8 = null;
                String strI9 = null;
                String strI10 = null;
                String strI11 = null;
                io.sentry.protocol.w wVar4 = null;
                String strI12 = null;
                while (p3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    strNextName3 = p3Var.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "replay_id":
                            wVar4 = new io.sentry.protocol.w(p3Var.nextString());
                            break;
                        case "user_id":
                            strI8 = p3Var.I();
                            break;
                        case "environment":
                            strI7 = p3Var.I();
                            break;
                        case "sample_rand":
                            strI12 = p3Var.I();
                            break;
                        case "sample_rate":
                            strI10 = p3Var.I();
                            break;
                        case "release":
                            strI6 = p3Var.I();
                            break;
                        case "trace_id":
                            wVar3 = new io.sentry.protocol.w(p3Var.nextString());
                            break;
                        case "sampled":
                            strI11 = p3Var.I();
                            break;
                        case "public_key":
                            strNextString = p3Var.nextString();
                            break;
                        case "transaction":
                            strI9 = p3Var.I();
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            p3Var.z(a1Var, concurrentHashMap, strNextName3);
                            break;
                    }
                }
                if (wVar3 == null) {
                    throw b(a1Var, "trace_id");
                }
                if (strNextString == null) {
                    throw b(a1Var, "public_key");
                }
                p7 p7Var = new p7(wVar3, strNextString, strI6, strI7, strI8, strI9, strI10, strI11, wVar4, strI12);
                p7Var.O = concurrentHashMap;
                p3Var.endObject();
                return p7Var;
        }
    }
}
