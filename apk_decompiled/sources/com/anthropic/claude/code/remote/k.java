package com.anthropic.claude.code.remote;

import com.anthropic.claude.code.remote.CodeSessionListScope;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class k {
    public static final /* synthetic */ k a = new k();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.code.remote.CodeSessionListScope", kceVar.b(CodeSessionListScope.class), new pl9[]{kceVar.b(CodeSessionListScope.Code.class), kceVar.b(CodeSessionListScope.DramaticShrimp.class), kceVar.b(CodeSessionListScope.Project.class), kceVar.b(CodeSessionListScope.Scheduled.class)}, new KSerializer[]{new lq6("com.anthropic.claude.code.remote.CodeSessionListScope.Code", CodeSessionListScope.Code.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.code.remote.CodeSessionListScope.DramaticShrimp", CodeSessionListScope.DramaticShrimp.INSTANCE, new Annotation[0]), l.a, new lq6("com.anthropic.claude.code.remote.CodeSessionListScope.Scheduled", CodeSessionListScope.Scheduled.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
