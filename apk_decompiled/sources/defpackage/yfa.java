package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yfa {
    public static volatile RuntimeException c;
    public static final /* synthetic */ yfa a = new yfa();
    public static final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public static final Object d = new Object();

    public static CopyOnWriteArrayList a() {
        return b;
    }

    public static boolean b() {
        return c != null;
    }
}
