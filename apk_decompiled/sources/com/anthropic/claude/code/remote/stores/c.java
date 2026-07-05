package com.anthropic.claude.code.remote.stores;

import com.anthropic.claude.code.remote.stores.SessionTarget;
import defpackage.jce;
import defpackage.kce;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final /* synthetic */ c a = new c();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.code.remote.stores.SessionTarget", kceVar.b(SessionTarget.class), new pl9[]{kceVar.b(SessionTarget.Environment.class), kceVar.b(SessionTarget.SelfHostedPool.class)}, new KSerializer[]{d.a, f.a}, new Annotation[0]);
    }
}
