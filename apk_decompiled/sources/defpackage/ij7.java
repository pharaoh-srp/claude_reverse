package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class ij7 implements cq3 {
    public final File a;
    public final cof b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public ij7(File file, cof cofVar) {
        this.a = file;
        this.b = cofVar;
    }

    @Override // defpackage.cq3
    public final void close() {
        this.c.set(true);
    }
}
