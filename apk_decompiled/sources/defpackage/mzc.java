package defpackage;

import com.anthropic.claude.api.chat.messages.ContentBlock;
import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class mzc extends k3 {
    public final Object[] E;
    public final Object[] F;
    public final int G;
    public final int H;

    public mzc(Object[] objArr, Object[] objArr2, int i, int i2) {
        objArr.getClass();
        objArr2.getClass();
        this.E = objArr;
        this.F = objArr2;
        this.G = i;
        this.H = i2;
        if (size() > 32) {
            size();
            size();
        } else {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
        }
    }

    public static Object[] h(int i, int i2, Object obj, Object[] objArr) {
        int iM = nuj.m(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iM] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iM];
        obj2.getClass();
        objArrCopyOf[iM] = h(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.k3
    public final k3 a(ContentBlock contentBlock) {
        int size = size() - ((size() - 1) & (-32));
        int i = this.H;
        Object[] objArr = this.E;
        Object[] objArr2 = this.F;
        if (size < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[size] = contentBlock;
            return new mzc(objArr, objArrCopyOf, size() + 1, i);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = contentBlock;
        if ((size() >> 5) <= (1 << i)) {
            return new mzc(g(i, objArr, objArr2), objArr3, size() + 1, i);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i2 = i + 5;
        return new mzc(g(i2, objArr4, objArr2), objArr3, size() + 1, i2);
    }

    @Override // defpackage.k3
    public final k3 e(int i, ContentBlock contentBlock) {
        jwj.c(i, size());
        int size = (size() - 1) & (-32);
        Object[] objArr = this.E;
        Object[] objArr2 = this.F;
        int i2 = this.H;
        if (size > i) {
            return new mzc(h(i2, i, contentBlock, objArr), objArr2, size(), i2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = contentBlock;
        return new mzc(objArr, objArrCopyOf, size(), i2);
    }

    public final Object[] g(int i, Object[] objArr, Object[] objArr2) {
        int iM = nuj.m(size() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iM] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iM] = g(i - 5, (Object[]) objArrCopyOf[iM], objArr2);
        return objArrCopyOf;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        jwj.c(i, size());
        if (((size() - 1) & (-32)) <= i) {
            objArr = this.F;
        } else {
            Object[] objArr2 = this.E;
            for (int i2 = this.H; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[nuj.m(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.G;
    }

    @Override // defpackage.i2, java.util.List
    public final ListIterator listIterator(int i) {
        jwj.d(i, size());
        return new qzc(i, size(), (this.H / 5) + 1, this.E, this.F);
    }
}
