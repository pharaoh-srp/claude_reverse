package io.sentry.internal.debugmeta;

import io.sentry.a1;
import io.sentry.c5;
import io.sentry.h5;
import io.sentry.h7;
import io.sentry.n1;
import io.sentry.p;
import io.sentry.protocol.u;
import io.sentry.protocol.w;
import io.sentry.t5;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {
    public final /* synthetic */ int E;
    public Object F;
    public final Object G;

    public c(w wVar, u uVar, h5 h5Var) {
        this.E = 2;
        this.F = new c5(wVar, uVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(h5Var);
        this.G = arrayList;
    }

    public static c a(n1 n1Var, h7 h7Var, u uVar) {
        p.v("Serializer is required.", n1Var);
        p.v("session is required.", h7Var);
        return new c((w) null, uVar, h5.j(n1Var, h7Var));
    }

    public Object b() {
        return this.F;
    }

    public byte[] c() {
        if (((byte[]) this.F) == null) {
            this.F = (byte[]) ((Callable) this.G).call();
        }
        byte[] bArr = (byte[]) this.F;
        return bArr != null ? bArr : new byte[0];
    }

    public h7 d() {
        return (h7) this.G;
    }

    public c5 e() {
        return (c5) this.F;
    }

    @Override // io.sentry.internal.debugmeta.a
    public List f() {
        a1 a1Var = (a1) this.F;
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = ((ClassLoader) this.G).getResources("sentry-debug-meta.properties");
            while (resources.hasMoreElements()) {
                URL urlNextElement = resources.nextElement();
                try {
                    InputStream inputStreamOpenStream = urlNextElement.openStream();
                    try {
                        Properties properties = new Properties();
                        properties.load(inputStreamOpenStream);
                        arrayList.add(properties);
                        a1Var.h(t5.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                        if (inputStreamOpenStream != null) {
                            inputStreamOpenStream.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpenStream != null) {
                            try {
                                inputStreamOpenStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RuntimeException e) {
                    a1Var.b(t5.ERROR, e, "%s file is malformed.", urlNextElement);
                }
            }
        } catch (IOException e2) {
            a1Var.b(t5.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        a1Var.h(t5.INFO, "No %s file was found.", "sentry-debug-meta.properties");
        return null;
    }

    public Iterable g() {
        return (Iterable) this.G;
    }

    public h7 h() {
        return (h7) this.F;
    }

    public List i() {
        return (List) this.G;
    }

    public String toString() {
        switch (this.E) {
            case 5:
                return "NetworkBody{body=" + this.F + ", warnings=" + ((List) this.G) + '}';
            default:
                return super.toString();
        }
    }

    public c(a1 a1Var) {
        this.E = 0;
        ClassLoader classLoader = c.class.getClassLoader();
        this.F = a1Var;
        this.G = io.sentry.config.a.e(classLoader);
    }

    public c(c5 c5Var, List list) {
        this.E = 2;
        p.v("SentryEnvelopeHeader is required.", c5Var);
        this.F = c5Var;
        p.v("SentryEnvelope items are required.", list);
        this.G = list;
    }

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public c(Callable callable) {
        this.E = 3;
        this.G = callable;
    }

    public c(h7 h7Var, h7 h7Var2) {
        this.E = 1;
        this.G = h7Var;
        this.F = h7Var2;
    }
}
