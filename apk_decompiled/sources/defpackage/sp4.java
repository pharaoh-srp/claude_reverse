package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class sp4 {
    public final nyj a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final w60 c;

    static {
        int i = vf4.O1.W;
    }

    public sp4(h99 h99Var) {
        new CopyOnWriteArrayList();
        this.a = new nyj(sp4.class.getSimpleName(), h99Var);
        new lz1(1, TimeUnit.SECONDS);
        this.c = new w60(1);
    }
}
