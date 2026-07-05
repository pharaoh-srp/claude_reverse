package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class jz6 implements Closeable {
    public final File E;
    public final KSerializer F;
    public final bg9 G;
    public final xf7 H;
    public final xp3 I;
    public final e45 J;
    public final String K;
    public final String L;
    public boolean M;
    public OutputStreamWriter N;
    public long O;

    public jz6(File file, String str, KSerializer kSerializer, bg9 bg9Var, xf7 xf7Var, e45 e45Var, xp3 xp3Var) {
        kSerializer.getClass();
        this.E = file;
        this.F = kSerializer;
        this.G = bg9Var;
        this.H = xf7Var;
        this.I = xp3Var;
        d45 d45Var = e45.F;
        this.J = e45Var.R0(1, null);
        this.K = str.concat(".jsonl");
        this.L = str.concat("-");
    }

    public static final OutputStreamWriter c(jz6 jz6Var) {
        OutputStreamWriter outputStreamWriter = jz6Var.N;
        if (outputStreamWriter != null) {
            return outputStreamWriter;
        }
        if (!jz6Var.M) {
            jz6Var.E.mkdirs();
            jz6Var.M = true;
        }
        jz6Var.O = jz6Var.e().exists() ? jz6Var.e().length() : 0L;
        OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(jz6Var.e(), true), StandardCharsets.UTF_8);
        jz6Var.N = outputStreamWriter2;
        return outputStreamWriter2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    public final void d() {
        OutputStreamWriter outputStreamWriter = this.N;
        if (outputStreamWriter != null) {
            outputStreamWriter.close();
        }
        this.N = null;
        this.O = 0L;
    }

    public final File e() {
        return new File(this.E, this.K);
    }

    public final Object f(Object obj, xzg xzgVar) throws Throwable {
        Object objC0 = gb9.c0(this.J, new ab0(this, obj, (tp4) null), xzgVar);
        return objC0 == m45.E ? objC0 : iei.a;
    }
}
