package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class n6j {
    public final WeakReference a;
    public final int b;

    public n6j(ClassLoader classLoader) {
        this.a = new WeakReference(classLoader);
        this.b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n6j) && this.a.get() == ((n6j) obj).a.get();
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
