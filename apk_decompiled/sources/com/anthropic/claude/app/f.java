package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final /* synthetic */ f a = new f();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.app.ClaudeAppDestination.Detail", kceVar.b(ClaudeAppDestination.Detail.class), new pl9[]{kceVar.b(ClaudeAppDestination.Detail.Chat.class), kceVar.b(ClaudeAppDestination.Detail.CodeRemoteSession.class), kceVar.b(ClaudeAppDestination.Detail.CreateTemplateProject.class), kceVar.b(ClaudeAppDestination.Detail.ProjectDetails.class), kceVar.b(ClaudeAppDestination.Detail.ProjectKnowledge.class), kceVar.b(ClaudeAppDestination.Detail.TemplateUploadMaterialScreen.class)}, new KSerializer[]{b.a, d.a, g.a, i.a, k.a, m.a}, new Annotation[0]);
    }
}
