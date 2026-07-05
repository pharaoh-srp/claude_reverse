package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class e3 extends AbstractCollection implements Collection, nm9 {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
