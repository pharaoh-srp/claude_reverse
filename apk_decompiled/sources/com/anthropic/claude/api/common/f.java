package com.anthropic.claude.api.common;

import com.anthropic.claude.api.common.RateLimit;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final /* synthetic */ f a = new f();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.common.RateLimit", kceVar.b(RateLimit.class), new pl9[]{kceVar.b(RateLimit.ApproachingLimit.class), kceVar.b(RateLimit.ExceedsLimit.class), kceVar.b(RateLimit.WithinLimit.class)}, new KSerializer[]{d.a, g.a, new lq6("within_limit", RateLimit.WithinLimit.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
