package com.anthropic.claude.project.knowledge;

import com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static final /* synthetic */ h a = new h();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination", kceVar.b(ProjectKnowledgePreviewDestination.class), new pl9[]{kceVar.b(ProjectKnowledgePreviewDestination.Dismissed.class), kceVar.b(ProjectKnowledgePreviewDestination.Preview.class)}, new KSerializer[]{new lq6("com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination.Dismissed", ProjectKnowledgePreviewDestination.Dismissed.INSTANCE, new Annotation[0]), i.a}, new Annotation[0]);
    }
}
