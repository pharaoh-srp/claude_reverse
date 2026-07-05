package com.squareup.wire.internal;

import defpackage.bz7;
import defpackage.mdj;
import defpackage.mwa;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aK\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00028\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"C", "R", "Lkotlin/Function1;", "Liei;", "close", "block", "use", "(Ljava/lang/Object;Lbz7;Lbz7;)Ljava/lang/Object;", "wire-grpc-client"}, k = 2, mv = {2, 0, 0}, xi = mdj.f)
public final class UtilKt {
    public static final <C, R> R use(C c, bz7 bz7Var, bz7 bz7Var2) {
        bz7Var.getClass();
        bz7Var2.getClass();
        try {
            R r = (R) bz7Var2.invoke(c);
            bz7Var.invoke(c);
            return r;
        } catch (Throwable th) {
            try {
                bz7Var.invoke(c);
            } catch (Throwable th2) {
                mwa.p(th, th2);
            }
            throw th;
        }
    }
}
