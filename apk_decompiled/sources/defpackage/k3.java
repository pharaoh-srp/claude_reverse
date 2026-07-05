package defpackage;

import com.anthropic.claude.api.chat.messages.ContentBlock;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k3 extends i2 implements mz8 {
    public abstract k3 a(ContentBlock contentBlock);

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract k3 e(int i, ContentBlock contentBlock);

    @Override // defpackage.i2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.i2, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.i2, java.util.List
    public final List subList(int i, int i2) {
        return new kz8(this, i, i2);
    }
}
