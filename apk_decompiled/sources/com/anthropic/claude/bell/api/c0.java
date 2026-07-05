package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiServerMessage;
import defpackage.jce;
import defpackage.kce;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 {
    public static final /* synthetic */ c0 a = new c0();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.bell.api.BellApiServerMessage.BellError", kceVar.b(BellApiServerMessage.BellError.class), new pl9[]{kceVar.b(BellApiServerMessage.BellError.Fatal.class), kceVar.b(BellApiServerMessage.BellError.Temporary.class)}, new KSerializer[]{d0.a, f0.a}, new Annotation[]{new j()});
    }
}
