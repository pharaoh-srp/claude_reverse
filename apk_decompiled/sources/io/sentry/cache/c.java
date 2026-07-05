package io.sentry.cache;

import defpackage.cd;
import io.sentry.h5;
import io.sentry.h7;
import io.sentry.n1;
import io.sentry.p;
import io.sentry.t5;
import io.sentry.util.h;
import io.sentry.v;
import io.sentry.w6;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class c implements d {
    public static final Charset M = Charset.forName("UTF-8");
    public static final /* synthetic */ int N = 0;
    public final w6 E;
    public final h F = new h(new cd(22, this));
    public final File G;
    public final int H;
    public final CountDownLatch I;
    public final WeakHashMap J;
    public final io.sentry.util.a K;
    public final io.sentry.util.a L;

    public c(w6 w6Var, String str, int i) {
        p.v("SentryOptions is required.", w6Var);
        this.E = w6Var;
        this.G = new File(str);
        this.H = i;
        this.J = new WeakHashMap();
        this.K = new io.sentry.util.a();
        this.L = new io.sentry.util.a();
        this.I = new CountDownLatch(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0226 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[PHI: r4 r6 r8
      0x009d: PHI (r4v26 java.io.File[]) = 
      (r4v25 java.io.File[])
      (r4v25 java.io.File[])
      (r4v25 java.io.File[])
      (r4v25 java.io.File[])
      (r4v25 java.io.File[])
      (r4v25 java.io.File[])
      (r4v25 java.io.File[])
      (r4v29 java.io.File[])
     binds: [B:10:0x0047, B:12:0x0055, B:25:0x008f, B:27:0x009b, B:29:0x00a5, B:31:0x00a9, B:33:0x00af, B:286:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r6v25 io.sentry.util.h) = 
      (r6v24 io.sentry.util.h)
      (r6v24 io.sentry.util.h)
      (r6v24 io.sentry.util.h)
      (r6v24 io.sentry.util.h)
      (r6v24 io.sentry.util.h)
      (r6v24 io.sentry.util.h)
      (r6v24 io.sentry.util.h)
      (r6v27 io.sentry.util.h)
     binds: [B:10:0x0047, B:12:0x0055, B:25:0x008f, B:27:0x009b, B:29:0x00a5, B:31:0x00a9, B:33:0x00af, B:286:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x009d: PHI (r8v7 io.sentry.w6) = 
      (r8v6 io.sentry.w6)
      (r8v6 io.sentry.w6)
      (r8v6 io.sentry.w6)
      (r8v6 io.sentry.w6)
      (r8v6 io.sentry.w6)
      (r8v6 io.sentry.w6)
      (r8v6 io.sentry.w6)
      (r8v9 io.sentry.w6)
     binds: [B:10:0x0047, B:12:0x0055, B:25:0x008f, B:27:0x009b, B:29:0x00a5, B:31:0x00a9, B:33:0x00af, B:286:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [io.sentry.z4] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.cache.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean H(io.sentry.internal.debugmeta.c r23, io.sentry.n0 r24) {
        /*
            Method dump skipped, instruction units count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.cache.c.H(io.sentry.internal.debugmeta.c, io.sentry.n0):boolean");
    }

    public final File[] a() {
        File file = this.G;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: io.sentry.cache.b
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return str.endsWith(".envelope");
                }
            });
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.E.getLogger().h(t5.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    public final File b(io.sentry.internal.debugmeta.c cVar) {
        String str;
        WeakHashMap weakHashMap = this.J;
        v vVarA = this.K.a();
        try {
            if (weakHashMap.containsKey(cVar)) {
                str = (String) weakHashMap.get(cVar);
            } else {
                String strConcat = p.i().concat(".envelope");
                weakHashMap.put(cVar, strConcat);
                str = strConcat;
            }
            File file = new File(this.G.getAbsolutePath(), str);
            vVarA.close();
            return file;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(File file, File file2) {
        v vVarA = this.L.a();
        try {
            if (!file.exists()) {
                vVarA.close();
                return;
            }
            boolean zExists = file2.exists();
            w6 w6Var = this.E;
            if (zExists) {
                w6Var.getLogger().h(t5.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    w6Var.getLogger().h(t5.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            w6Var.getLogger().h(t5.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    w6Var.getLogger().h(t5.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th) {
                w6Var.getLogger().d(t5.ERROR, "Error moving current session to previous session.", th);
            }
            vVarA.close();
        } catch (Throwable th2) {
            try {
                vVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final io.sentry.internal.debugmeta.c g(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                io.sentry.internal.debugmeta.c cVarD = ((n1) this.F.a()).d(bufferedInputStream);
                bufferedInputStream.close();
                return cVarD;
            } finally {
            }
        } catch (IOException e) {
            this.E.getLogger().d(t5.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    public final h7 h(h5 h5Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(h5Var.l()), M));
            try {
                h7 h7Var = (h7) ((n1) this.F.a()).c(bufferedReader, h7.class);
                bufferedReader.close();
                return h7Var;
            } finally {
            }
        } catch (Throwable th) {
            this.E.getLogger().d(t5.ERROR, "Failed to deserialize the session.", th);
            return null;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        w6 w6Var = this.E;
        File[] fileArrA = a();
        ArrayList arrayList = new ArrayList(fileArrA.length);
        for (File file : fileArrA) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((n1) this.F.a()).d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                w6Var.getLogger().h(t5.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                w6Var.getLogger().d(t5.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
            }
        }
        return arrayList.iterator();
    }

    public final boolean k() {
        w6 w6Var = this.E;
        try {
            return this.I.await(w6Var.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            w6Var.getLogger().h(t5.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void l(File file, h7 h7Var) {
        String str = h7Var.I;
        w6 w6Var = this.E;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, M));
                try {
                    w6Var.getLogger().h(t5.DEBUG, "Overwriting session to offline storage: %s", str);
                    ((n1) this.F.a()).a(h7Var, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Error writing Session to offline storage: %s", str);
        }
    }

    @Override // io.sentry.cache.d
    public final void r0(io.sentry.internal.debugmeta.c cVar) {
        p.v("Envelope is required.", cVar);
        File fileB = b(cVar);
        boolean zDelete = fileB.delete();
        w6 w6Var = this.E;
        if (zDelete) {
            w6Var.getLogger().h(t5.DEBUG, "Discarding envelope from cache: %s", fileB.getAbsolutePath());
        } else {
            w6Var.getLogger().h(t5.DEBUG, "Envelope was not cached or could not be deleted: %s", fileB.getAbsolutePath());
        }
    }
}
