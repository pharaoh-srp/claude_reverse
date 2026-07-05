package defpackage;

import android.util.Printer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class upa implements Printer {
    public static final upa E = new upa();
    public static final AtomicBoolean F = new AtomicBoolean(false);
    public static final CopyOnWriteArraySet G = new CopyOnWriteArraySet();

    public static CopyOnWriteArraySet a() {
        return G;
    }

    public static AtomicBoolean b() {
        return F;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        Iterator it = G.iterator();
        while (it.hasNext()) {
            ((Printer) it.next()).println(str);
        }
    }
}
