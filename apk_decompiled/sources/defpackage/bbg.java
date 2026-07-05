package defpackage;

import com.anthropic.claude.api.chat.messages.ContentBlock;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class bbg extends k3 {
    public static final bbg F = new bbg(new Object[0]);
    public final Object[] E;

    public bbg(Object[] objArr) {
        this.E = objArr;
    }

    @Override // defpackage.k3
    public final k3 a(ContentBlock contentBlock) {
        int size = size();
        Object[] objArr = this.E;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
            objArrCopyOf[size()] = contentBlock;
            return new bbg(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = contentBlock;
        return new mzc(objArr, objArr2, size() + 1, 0);
    }

    @Override // defpackage.k3
    public final k3 e(int i, ContentBlock contentBlock) {
        jwj.c(i, size());
        Object[] objArr = this.E;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = contentBlock;
        return new bbg(objArrCopyOf);
    }

    public final k3 g(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return this;
        }
        if (collection.size() + size() > 32) {
            ozc ozcVarH = h();
            ozcVarH.addAll(collection);
            return ozcVarH.a();
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.E, collection.size() + size());
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[size] = it.next();
            size++;
        }
        return new bbg(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        jwj.c(i, size());
        return this.E[i];
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.E.length;
    }

    public final ozc h() {
        return new ozc(this, null, this.E, 0);
    }

    @Override // defpackage.i2, java.util.List
    public final int indexOf(Object obj) {
        return mp0.J0(obj, this.E);
    }

    @Override // defpackage.i2, java.util.List
    public final int lastIndexOf(Object obj) {
        return mp0.O0(obj, this.E);
    }

    @Override // defpackage.i2, java.util.List
    public final ListIterator listIterator(int i) {
        jwj.d(i, size());
        return new ny1(this.E, i, size());
    }
}
