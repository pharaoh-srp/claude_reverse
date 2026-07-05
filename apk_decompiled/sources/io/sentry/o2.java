package io.sentry;

import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class o2 implements i0, Closeable {
    public final w6 E;
    public final k5 F;
    public final k5 G;
    public volatile q0 H = null;

    public o2(w6 w6Var) {
        this.E = w6Var;
        x xVar = new x(w6Var);
        this.G = new k5(xVar);
        this.F = new k5(xVar);
    }

    @Override // io.sentry.i0
    public final y6 c(y6 y6Var, n0 n0Var) {
        if (y6Var.L == null) {
            y6Var.L = "java";
        }
        if (i(y6Var, n0Var)) {
            f(y6Var);
            io.sentry.protocol.u uVar = this.E.getSessionReplay().l;
            if (uVar != null) {
                y6Var.G = uVar;
            }
        }
        return y6Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.H != null) {
            this.H.a();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.i0
    public final j5 d(j5 j5Var, n0 n0Var) {
        ArrayList arrayList;
        if (j5Var.L == null) {
            j5Var.L = "java";
        }
        Throwable th = j5Var.N;
        if (th != null) {
            AtomicInteger atomicInteger = new AtomicInteger(-1);
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            this.G.a(th, atomicInteger, hashSet, arrayDeque, null);
            j5Var.X = new j2(new ArrayList(arrayDeque));
        }
        io.sentry.protocol.f fVar = j5Var.R;
        w6 w6Var = this.E;
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(fVar, w6Var);
        if (fVarA != null) {
            j5Var.R = fVarA;
        }
        Map mapA = w6Var.getModulesLoader().a();
        if (mapA != null) {
            AbstractMap abstractMap = j5Var.c0;
            if (abstractMap == null) {
                j5Var.c0 = new HashMap(mapA);
            } else {
                abstractMap.putAll(mapA);
            }
        }
        if (i(j5Var, n0Var)) {
            f(j5Var);
            if (j5Var.f() == null) {
                ArrayList<io.sentry.protocol.v> arrayListE = j5Var.e();
                if (arrayListE == null || arrayListE.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = null;
                    for (io.sentry.protocol.v vVar : arrayListE) {
                        if (vVar.J != null && vVar.H != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(vVar.H);
                        }
                    }
                }
                boolean zIsAttachThreads = w6Var.isAttachThreads();
                boolean zC = false;
                k5 k5Var = this.F;
                if (zIsAttachThreads || io.sentry.util.c.e(n0Var, io.sentry.hints.a.class)) {
                    Object objD = io.sentry.util.c.d(n0Var);
                    boolean zIsAttachStacktrace = w6Var.isAttachStacktrace();
                    if (objD instanceof io.sentry.hints.a) {
                        zC = ((io.sentry.hints.a) objD).c();
                        zIsAttachStacktrace = true;
                    }
                    j5Var.W = new j2(k5Var.b(Thread.getAllStackTraces(), arrayList, zC, zIsAttachStacktrace));
                } else if (w6Var.isAttachStacktrace() && ((arrayListE == null || arrayListE.isEmpty()) && !io.sentry.util.c.e(n0Var, io.sentry.hints.d.class))) {
                    boolean zIsAttachStacktrace2 = w6Var.isAttachStacktrace();
                    HashMap map = new HashMap();
                    Thread threadCurrentThread = Thread.currentThread();
                    map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                    j5Var.W = new j2(k5Var.b(map, null, false, zIsAttachStacktrace2));
                    return j5Var;
                }
            }
        }
        return j5Var;
    }

    @Override // io.sentry.i0
    public final io.sentry.protocol.e0 e(io.sentry.protocol.e0 e0Var, n0 n0Var) {
        if (e0Var.L == null) {
            e0Var.L = "java";
        }
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(e0Var.R, this.E);
        if (fVarA != null) {
            e0Var.R = fVarA;
        }
        if (i(e0Var, n0Var)) {
            f(e0Var);
        }
        return e0Var;
    }

    public final void f(w4 w4Var) {
        if (w4Var.J == null) {
            w4Var.J = this.E.getRelease();
        }
        if (w4Var.K == null) {
            w4Var.K = this.E.getEnvironment();
        }
        if (w4Var.O == null) {
            w4Var.O = this.E.getServerName();
        }
        if (this.E.isAttachServerName() && w4Var.O == null) {
            if (this.H == null) {
                this.H = q0.c();
            }
            if (this.H != null) {
                w4Var.O = this.H.b();
            }
        }
        if (w4Var.P == null) {
            w4Var.P = this.E.getDist();
        }
        if (w4Var.G == null) {
            w4Var.G = this.E.getSdkVersion();
        }
        w6 w6Var = this.E;
        if (w4Var.I == null) {
            w4Var.d(new HashMap(w6Var.getTags()));
        } else {
            for (Map.Entry<String, String> entry : w6Var.getTags().entrySet()) {
                if (!w4Var.I.containsKey(entry.getKey())) {
                    w4Var.c(entry.getKey(), entry.getValue());
                }
            }
        }
        io.sentry.protocol.i0 i0Var = w4Var.M;
        if (i0Var == null) {
            i0Var = new io.sentry.protocol.i0();
            w4Var.M = i0Var;
        }
        if (i0Var.H == null && this.E.isSendDefaultPii()) {
            i0Var.H = "{{auto}}";
        }
    }

    public final boolean i(w4 w4Var, n0 n0Var) {
        if (io.sentry.util.c.m(n0Var)) {
            return true;
        }
        this.E.getLogger().h(t5.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", w4Var.E);
        return false;
    }
}
