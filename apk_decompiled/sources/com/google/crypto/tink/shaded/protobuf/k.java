package com.google.crypto.tink.shaded.protobuf;

import defpackage.r34;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    public abstract l a(Object obj);

    public final boolean b(Object obj, d dVar) throws InvalidProtocolBufferException {
        int i = dVar.b;
        r34 r34Var = dVar.a;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            dVar.v(0);
            ((l) obj).d(i2 << 3, Long.valueOf(r34Var.v()));
            return true;
        }
        if (i3 == 1) {
            dVar.v(1);
            ((l) obj).d((i2 << 3) | 1, Long.valueOf(r34Var.s()));
            return true;
        }
        if (i3 == 2) {
            ((l) obj).d((i2 << 3) | 2, dVar.e());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            dVar.v(5);
            ((l) obj).d(5 | (i2 << 3), Integer.valueOf(r34Var.r()));
            return true;
        }
        l lVarC = l.c();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        while (dVar.a() != Integer.MAX_VALUE && b(lVarC, dVar)) {
        }
        if (i5 != dVar.b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        lVarC.e = false;
        ((l) obj).d(i4 | 3, lVarC);
        return true;
    }
}
