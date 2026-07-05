package io.sentry;

import com.anthropic.claude.api.tasks.TaskSessionEvent;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 implements u1 {
    public final /* synthetic */ int a;
    public Object b;

    public p2(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = null;
                break;
            case 5:
                this.b = new io.sentry.util.network.c();
                break;
        }
    }

    public static /* synthetic */ m b(p2 p2Var) {
        return (m) p2Var.b;
    }

    public static Long f(String str) {
        String strTrim = str.trim();
        try {
            if (strTrim.endsWith("GB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1073741824);
            }
            if (strTrim.endsWith("MB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * w6.MAX_EVENT_SIZE_BYTES);
            }
            if (strTrim.endsWith("KB")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1024);
            }
            if (strTrim.endsWith("B")) {
                return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 1)));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double g(String str) {
        String strTrim = str.trim();
        try {
            if (strTrim.equals(TaskSessionEvent.REPLAY_FROM_START)) {
                return Double.valueOf(0.0d);
            }
            if (strTrim.endsWith("ms")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)));
            }
            if (strTrim.endsWith("ns")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000000.0d);
            }
            if (strTrim.endsWith("us")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000.0d);
            }
            if (strTrim.endsWith("s")) {
                return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 1)) * 1000.0d);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // io.sentry.u1
    public boolean a() {
        if (io.sentry.internal.a.c == null) {
            v vVarA = io.sentry.internal.a.d.a();
            try {
                if (io.sentry.internal.a.c == null) {
                    io.sentry.internal.a.c = new io.sentry.internal.a();
                }
                vVarA.close();
            } catch (Throwable th) {
                try {
                    vVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        io.sentry.internal.a aVar = io.sentry.internal.a.c;
        if (!aVar.a) {
            try {
                v vVarA2 = aVar.b.a();
                try {
                    if (!aVar.a) {
                        Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
                        while (resources.hasMoreElements()) {
                            try {
                                Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                                if (mainAttributes != null) {
                                    String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                                    String value2 = mainAttributes.getValue("Implementation-Version");
                                    String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                                    String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                                    if (value != null && value2 != null) {
                                        String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                                        if (value5 != null) {
                                            r5.d().b("maven:io.opentelemetry:opentelemetry-sdk", value5);
                                            r5.d().a("OpenTelemetry");
                                        }
                                        String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                                        if (value6 != null) {
                                            r5.d().b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
                                            r5.d().a("OpenTelemetry-Agent");
                                        }
                                        if (value.equals("sentry.java.opentelemetry.agentless")) {
                                            r5.d().a("OpenTelemetry-Agentless");
                                        }
                                        if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
                                            r5.d().a("OpenTelemetry-Agentless-Spring");
                                        }
                                    }
                                    if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
                                        r5.d().b(value4, value2);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    vVarA2.close();
                } finally {
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                aVar.a = true;
                throw th3;
            }
            aVar.a = true;
        }
        return r5.d().c(((w6) this.b).getFatalLogger());
    }

    public io.sentry.protocol.c d() {
        if (((io.sentry.protocol.c) this.b) == null) {
            this.b = new io.sentry.protocol.c();
        }
        return (io.sentry.protocol.c) this.b;
    }

    public Serializable e(io.sentry.vendor.gson.stream.a aVar, int i) {
        io.sentry.util.network.c cVar = (io.sentry.util.network.c) this.b;
        if (cVar.b) {
            return null;
        }
        if (i >= 100) {
            cVar.a = true;
            return null;
        }
        try {
            switch (io.sentry.util.network.b.a[aVar.peek().ordinal()]) {
                case 1:
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    try {
                        aVar.beginObject();
                        while (aVar.hasNext() && !cVar.b) {
                            linkedHashMap.put(aVar.nextName(), e(aVar, i + 1));
                        }
                        aVar.endObject();
                        return linkedHashMap;
                    } catch (Exception unused) {
                        cVar.b = true;
                        return linkedHashMap;
                    }
                case 2:
                    ArrayList arrayList = new ArrayList();
                    try {
                        aVar.beginArray();
                        while (aVar.hasNext() && !cVar.b) {
                            arrayList.add(e(aVar, i + 1));
                        }
                        aVar.endArray();
                        return arrayList;
                    } catch (Exception unused2) {
                        cVar.b = true;
                        return arrayList;
                    }
                case 3:
                    return aVar.nextString();
                case 4:
                    return Double.valueOf(aVar.nextDouble());
                case 5:
                    return Boolean.valueOf(aVar.j());
                case 6:
                    aVar.x();
                    return null;
                default:
                    cVar.b = true;
                    return null;
            }
        } catch (Exception unused3) {
            cVar.b = true;
            return null;
        }
        cVar.b = true;
        return null;
    }

    public /* synthetic */ p2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
