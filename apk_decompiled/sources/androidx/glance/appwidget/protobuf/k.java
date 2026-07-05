package androidx.glance.appwidget.protobuf;

import defpackage.r34;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public abstract l a(Object obj);

    public final boolean b(int i, d dVar, Object obj) throws InvalidProtocolBufferException {
        int i2 = dVar.b;
        r34 r34Var = dVar.a;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            dVar.v(0);
            ((l) obj).c(i3 << 3, Long.valueOf(r34Var.v()));
            return true;
        }
        if (i4 == 1) {
            dVar.v(1);
            ((l) obj).c((i3 << 3) | 1, Long.valueOf(r34Var.s()));
            return true;
        }
        if (i4 == 2) {
            ((l) obj).c((i3 << 3) | 2, dVar.e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            dVar.v(5);
            ((l) obj).c(5 | (i3 << 3), Integer.valueOf(r34Var.r()));
            return true;
        }
        l lVar = new l(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (dVar.a() != Integer.MAX_VALUE && b(i7, dVar, lVar)) {
        }
        if (i6 != dVar.b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (lVar.e) {
            lVar.e = false;
        }
        ((l) obj).c(i5 | 3, lVar);
        return true;
    }
}
