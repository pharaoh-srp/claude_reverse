package io.sentry.android.replay;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.b54;
import defpackage.bsg;
import defpackage.c54;
import defpackage.csg;
import defpackage.dae;
import defpackage.dj2;
import defpackage.kl4;
import defpackage.nk7;
import defpackage.u0h;
import defpackage.w44;
import io.sentry.t5;
import io.sentry.w6;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Closeable {
    public final w6 E;
    public final io.sentry.protocol.w F;
    public final AtomicBoolean G;
    public final io.sentry.util.a H;
    public final io.sentry.util.a I;
    public final io.sentry.util.a J;
    public io.sentry.android.replay.video.d K;
    public final u0h L;
    public final ArrayList M;
    public final LinkedHashMap N;
    public final u0h O;

    public l(w6 w6Var, io.sentry.protocol.w wVar) {
        w6Var.getClass();
        wVar.getClass();
        this.E = w6Var;
        this.F = wVar;
        this.G = new AtomicBoolean(false);
        this.H = new io.sentry.util.a();
        this.I = new io.sentry.util.a();
        this.J = new io.sentry.util.a();
        this.L = new u0h(new j(this, 1));
        this.M = new ArrayList();
        this.N = new LinkedHashMap();
        this.O = new u0h(new j(this, 0));
    }

    public final void c(File file, long j, String str) throws Exception {
        m mVar = new m(file, j, str);
        io.sentry.v vVarA = this.J.a();
        try {
            this.M.add(mVar);
            csg.o(vVarA, null);
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.v vVarA = this.H.a();
        try {
            io.sentry.android.replay.video.d dVar = this.K;
            if (dVar != null) {
                dVar.c();
            }
            this.K = null;
            csg.o(vVarA, null);
            this.G.set(true);
        } finally {
        }
    }

    public final void d(File file) {
        w6 w6Var = this.E;
        try {
            if (file.delete()) {
                return;
            }
            w6Var.getLogger().h(t5.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    public final File e() {
        return (File) this.L.getValue();
    }

    public final void f(String str, String str2) {
        File file;
        File file2;
        u0h u0hVar = this.O;
        LinkedHashMap linkedHashMap = this.N;
        io.sentry.v vVarA = this.I.a();
        try {
            if (this.G.get()) {
                csg.o(vVarA, null);
                return;
            }
            File file3 = (File) u0hVar.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) u0hVar.getValue()) != null) {
                file.createNewFile();
            }
            if (linkedHashMap.isEmpty() && (file2 = (File) u0hVar.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), dj2.a), FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
                try {
                    Iterator it = new kl4(new c54(2, bufferedReader)).iterator();
                    while (it.hasNext()) {
                        List listY0 = bsg.Y0((String) it.next(), new String[]{"="}, 2);
                        linkedHashMap.put((String) listY0.get(0), (String) listY0.get(1));
                    }
                    bufferedReader.close();
                } finally {
                }
            }
            if (str2 == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
            File file4 = (File) u0hVar.getValue();
            if (file4 != null) {
                Set setEntrySet = linkedHashMap.entrySet();
                setEntrySet.getClass();
                String strS0 = w44.S0(setEntrySet, "\n", null, null, c.H, 30);
                Charset charset = dj2.a;
                charset.getClass();
                FileOutputStream fileOutputStream = new FileOutputStream(file4);
                try {
                    nk7.s0(fileOutputStream, strS0, charset);
                    fileOutputStream.close();
                } finally {
                }
            }
            csg.o(vVarA, null);
        } finally {
        }
    }

    public final String i(long j) throws Exception {
        dae daeVar = new dae();
        io.sentry.v vVarA = this.J.a();
        try {
            b54.w0(new k(j, this, daeVar, 0), this.M);
            csg.o(vVarA, null);
            return (String) daeVar.E;
        } finally {
        }
    }
}
