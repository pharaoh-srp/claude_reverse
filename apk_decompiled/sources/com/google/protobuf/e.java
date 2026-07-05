package com.google.protobuf;

import defpackage.jlk;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public abstract f a(Object obj);

    public final boolean b(Object obj, c cVar) throws InvalidProtocolBufferException {
        int iC = cVar.c();
        int iL = jlk.l(iC);
        int iM = jlk.m(iC);
        if (iM == 0) {
            ((f) obj).b(jlk.p(iL, 0), Long.valueOf(cVar.z()));
            return true;
        }
        if (iM == 1) {
            ((f) obj).b(jlk.p(iL, 1), Long.valueOf(cVar.s()));
            return true;
        }
        if (iM == 2) {
            ((f) obj).b(jlk.p(iL, 2), cVar.j());
            return true;
        }
        if (iM != 3) {
            if (iM == 4) {
                return false;
            }
            if (iM != 5) {
                throw InvalidProtocolBufferException.b();
            }
            ((f) obj).b(jlk.p(iL, 5), Integer.valueOf(cVar.q()));
            return true;
        }
        f fVar = new f(0, new int[8], new Object[8], true);
        int iP = jlk.p(iL, 4);
        while (cVar.b() != Integer.MAX_VALUE && b(fVar, cVar)) {
        }
        if (iP != cVar.c()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        fVar.d = false;
        ((f) obj).b(jlk.p(iL, 3), fVar);
        return true;
    }
}
