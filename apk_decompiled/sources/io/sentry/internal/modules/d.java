package io.sentry.internal.modules;

import io.sentry.a1;
import io.sentry.t5;
import io.sentry.v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements a {
    public static final Charset d = Charset.forName("UTF-8");
    public final a1 a;
    public final io.sentry.util.a b = new io.sentry.util.a();
    public volatile Map c = null;

    public d(a1 a1Var) {
        this.a = a1Var;
    }

    @Override // io.sentry.internal.modules.a
    public final Map a() {
        if (this.c == null) {
            v vVarA = this.b.a();
            try {
                if (this.c == null) {
                    this.c = b();
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
        return this.c;
    }

    public abstract Map b();

    public final TreeMap c(InputStream inputStream) {
        a1 a1Var = this.a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                a1Var.h(t5.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            a1Var.d(t5.ERROR, "Error extracting modules.", e);
            return treeMap;
        } catch (RuntimeException e2) {
            a1Var.b(t5.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
