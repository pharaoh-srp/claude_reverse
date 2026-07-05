package io.sentry;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 implements y0, a1 {
    public static final x2 E = new x2();

    @Override // io.sentry.y0
    public io.sentry.protocol.w a(io.sentry.protocol.k kVar) {
        return io.sentry.protocol.w.F;
    }

    @Override // io.sentry.a1
    public void b(t5 t5Var, Throwable th, String str, Object... objArr) {
        PrintStream printStream = System.out;
        String str2 = String.format(str, objArr);
        String string = th.toString();
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(t5Var + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.w c(io.sentry.protocol.k kVar) {
        return io.sentry.protocol.w.F;
    }

    @Override // io.sentry.a1
    public void d(t5 t5Var, String str, Throwable th) {
        if (th == null) {
            h(t5Var, str, new Object[0]);
            return;
        }
        PrintStream printStream = System.out;
        String str2 = String.format(str, th.toString());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        printStream.println(t5Var + ": " + str2 + "\n" + stringWriter.toString());
    }

    @Override // io.sentry.y0
    public io.sentry.protocol.w e(io.sentry.protocol.k kVar) {
        return io.sentry.protocol.w.F;
    }

    @Override // io.sentry.a1
    public void h(t5 t5Var, String str, Object... objArr) {
        System.out.println(t5Var + ": " + String.format(str, objArr));
    }

    @Override // io.sentry.a1
    public boolean l(t5 t5Var) {
        return true;
    }
}
