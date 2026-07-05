package com.google.crypto.tink.shaded.protobuf;

import defpackage.bib;
import defpackage.e7f;
import defpackage.g28;
import defpackage.xh6;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements bib {
    protected int memoizedHashCode;

    public abstract int b(e7f e7fVar);

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract g28 d();

    public final byte[] e() {
        try {
            int iB = ((f) this).b(null);
            byte[] bArr = new byte[iB];
            e eVar = new e(bArr, iB);
            f(eVar);
            if (iB - eVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            xh6.f(c("byte array"), e);
            return null;
        }
    }

    public abstract void f(e eVar);
}
