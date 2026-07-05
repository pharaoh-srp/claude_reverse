package io.sentry.okhttp;

import defpackage.bz7;
import defpackage.iei;
import defpackage.ts9;
import io.sentry.p1;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends ts9 implements bz7 {
    public final /* synthetic */ long F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j) {
        super(1);
        this.F = j;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        p1 p1Var = (p1) obj;
        p1Var.getClass();
        long j = this.F;
        if (j > 0) {
            p1Var.f("http.request_content_length", Long.valueOf(j));
        }
        return iei.a;
    }
}
