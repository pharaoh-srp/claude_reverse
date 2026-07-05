package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rc9 implements Iterator {
    public static final rc9 E;
    public static final /* synthetic */ rc9[] F;

    static {
        rc9 rc9Var = new rc9("INSTANCE", 0);
        E = rc9Var;
        F = new rc9[]{rc9Var};
    }

    public static rc9 valueOf(String str) {
        return (rc9) Enum.valueOf(rc9.class, str);
    }

    public static rc9[] values() {
        return (rc9[]) F.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        fd9.L("no calls to next() since the last call to remove()", false);
    }
}
