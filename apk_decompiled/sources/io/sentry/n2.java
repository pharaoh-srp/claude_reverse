package io.sentry;

import io.sentry.protocol.DebugImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n2 implements n1 {
    public static final Charset c = Charset.forName("UTF-8");
    public final w6 a;
    public final HashMap b;

    public n2(w6 w6Var) {
        this.a = w6Var;
        HashMap map = new HashMap();
        this.b = map;
        map.put(io.sentry.protocol.a.class, new io.sentry.clientreport.a(3));
        map.put(g.class, new f(0));
        map.put(io.sentry.protocol.d.class, new io.sentry.clientreport.a(4));
        map.put(io.sentry.protocol.e.class, new io.sentry.clientreport.a(5));
        map.put(DebugImage.class, new io.sentry.clientreport.a(6));
        map.put(io.sentry.protocol.f.class, new io.sentry.clientreport.a(7));
        map.put(io.sentry.protocol.h.class, new io.sentry.clientreport.a(8));
        map.put(io.sentry.protocol.g.class, new io.sentry.clientreport.a(9));
        map.put(io.sentry.protocol.k.class, new io.sentry.clientreport.a(10));
        map.put(io.sentry.protocol.m.class, new io.sentry.clientreport.a(12));
        map.put(io.sentry.protocol.b0.class, new io.sentry.clientreport.a(26));
        map.put(io.sentry.protocol.n.class, new io.sentry.clientreport.a(13));
        map.put(io.sentry.protocol.o.class, new io.sentry.clientreport.a(14));
        map.put(io.sentry.protocol.p.class, new io.sentry.clientreport.a(15));
        map.put(io.sentry.protocol.q.class, new io.sentry.clientreport.a(16));
        map.put(v3.class, new f(1));
        map.put(w3.class, new f(2));
        map.put(y3.class, new f(3));
        map.put(z3.class, new f(4));
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.clientreport.a(1));
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.clientreport.a(2));
        map.put(io.sentry.protocol.r.class, new io.sentry.clientreport.a(17));
        map.put(d4.class, new f(5));
        map.put(io.sentry.rrweb.a.class, new io.sentry.protocol.j0(2));
        map.put(io.sentry.rrweb.c.class, new io.sentry.protocol.j0(3));
        map.put(io.sentry.rrweb.g.class, new io.sentry.protocol.j0(4));
        map.put(io.sentry.rrweb.i.class, new io.sentry.protocol.j0(5));
        map.put(io.sentry.rrweb.j.class, new io.sentry.protocol.j0(6));
        map.put(io.sentry.rrweb.l.class, new io.sentry.protocol.j0(7));
        map.put(io.sentry.rrweb.m.class, new io.sentry.protocol.j0(8));
        map.put(io.sentry.protocol.t.class, new io.sentry.clientreport.a(18));
        map.put(io.sentry.protocol.u.class, new io.sentry.clientreport.a(19));
        map.put(c5.class, new f(7));
        map.put(i5.class, new f(8));
        map.put(j5.class, new f(9));
        map.put(io.sentry.protocol.v.class, new io.sentry.clientreport.a(20));
        map.put(s5.class, new f(10));
        map.put(t5.class, new f(11));
        map.put(u5.class, new f(12));
        map.put(y5.class, new f(13));
        map.put(c6.class, new f(14));
        map.put(io.sentry.protocol.x.class, new io.sentry.clientreport.a(21));
        map.put(io.sentry.protocol.y.class, new io.sentry.clientreport.a(22));
        map.put(y6.class, new f(15));
        map.put(io.sentry.protocol.z.class, new io.sentry.clientreport.a(23));
        map.put(io.sentry.protocol.a0.class, new io.sentry.clientreport.a(24));
        map.put(io.sentry.protocol.c0.class, new io.sentry.clientreport.a(25));
        map.put(u4.class, new f(6));
        map.put(io.sentry.protocol.d0.class, new io.sentry.clientreport.a(27));
        map.put(io.sentry.protocol.e0.class, new io.sentry.clientreport.a(28));
        map.put(h7.class, new f(16));
        map.put(j7.class, new f(17));
        map.put(m7.class, new f(18));
        map.put(n7.class, new f(19));
        map.put(io.sentry.protocol.i0.class, new io.sentry.clientreport.a(29));
        map.put(io.sentry.protocol.l.class, new io.sentry.clientreport.a(11));
        map.put(v7.class, new f(20));
        map.put(io.sentry.clientreport.b.class, new io.sentry.clientreport.a(0));
        map.put(io.sentry.protocol.l0.class, new io.sentry.protocol.j0(1));
        map.put(io.sentry.protocol.k0.class, new io.sentry.protocol.j0(0));
    }

    @Override // io.sentry.n1
    public final void a(Object obj, Writer writer) throws IOException {
        p.v("The entity is required.", obj);
        w6 w6Var = this.a;
        a1 logger = w6Var.getLogger();
        t5 t5Var = t5.DEBUG;
        if (logger.l(t5Var)) {
            w6Var.getLogger().h(t5Var, "Serializing object: %s", f(obj, w6Var.isEnablePrettySerializationOutput()));
        }
        y yVar = new y(writer, w6Var.getMaxDepth());
        ((d) yVar.G).h(yVar, w6Var.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.n1
    public final String b(ConcurrentHashMap concurrentHashMap) {
        return f(concurrentHashMap, false);
    }

    @Override // io.sentry.n1
    public final Object c(Reader reader, Class cls) {
        Object objV0;
        w6 w6Var = this.a;
        try {
            l2 l2Var = new l2(reader);
            try {
                z1 z1Var = (z1) this.b.get(cls);
                if (z1Var != null) {
                    objV0 = cls.cast(z1Var.a(l2Var, w6Var.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        l2Var.close();
                        return null;
                    }
                    objV0 = l2Var.v0();
                }
                l2Var.close();
                return objV0;
            } finally {
            }
        } catch (Exception e) {
            w6Var.getLogger().d(t5.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // io.sentry.n1
    public final io.sentry.internal.debugmeta.c d(BufferedInputStream bufferedInputStream) {
        w6 w6Var = this.a;
        try {
            return w6Var.getEnvelopeReader().a(bufferedInputStream);
        } catch (IOException e) {
            w6Var.getLogger().d(t5.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.n1
    public final void e(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream) throws IOException {
        w6 w6Var = this.a;
        p.v("The SentryEnvelope object is required.", cVar);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), c));
        try {
            cVar.e().serialize(new y(bufferedWriter, w6Var.getMaxDepth()), w6Var.getLogger());
            bufferedWriter.write("\n");
            for (h5 h5Var : cVar.g()) {
                try {
                    byte[] bArrL = h5Var.l();
                    h5Var.m().serialize(new y(bufferedWriter, w6Var.getMaxDepth()), w6Var.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrL);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    w6Var.getLogger().d(t5.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    public final String f(Object obj, boolean z) throws IOException {
        StringWriter stringWriter = new StringWriter();
        w6 w6Var = this.a;
        y yVar = new y(stringWriter, w6Var.getMaxDepth());
        if (z) {
            yVar.u("\t");
        }
        ((d) yVar.G).h(yVar, w6Var.getLogger(), obj);
        return stringWriter.toString();
    }
}
