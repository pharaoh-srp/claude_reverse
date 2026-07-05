package com.anthropic.claude.artifact.details;

import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import defpackage.jce;
import defpackage.kce;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public static ArtifactFullScreenParams a(String str, boolean z) {
        str.getClass();
        return z ? new ArtifactFullScreenParams.PublishedArtifactFullScreenParams(PublishedArtifactId.m1087constructorimpl(str), null) : new ArtifactFullScreenParams.SharedArtifactFullScreenParams(ArtifactId.m958constructorimpl(str), null);
    }

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.artifact.details.ArtifactFullScreenParams", kceVar.b(ArtifactFullScreenParams.class), new pl9[]{kceVar.b(ArtifactFullScreenParams.LoadedArtifactFullScreenParams.class), kceVar.b(ArtifactFullScreenParams.PublishedArtifactFullScreenParams.class), kceVar.b(ArtifactFullScreenParams.SharedArtifactFullScreenParams.class)}, new KSerializer[]{b.a, d.a, f.a}, new Annotation[0]);
    }
}
