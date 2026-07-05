package com.anthropic.claude.project.knowledge;

import com.anthropic.claude.project.knowledge.ProjectKnowledgeBottomSheetDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static final /* synthetic */ g a = new g();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.project.knowledge.ProjectKnowledgeBottomSheetDestination", kceVar.b(ProjectKnowledgeBottomSheetDestination.class), new pl9[]{kceVar.b(ProjectKnowledgeBottomSheetDestination.AddContent.class), kceVar.b(ProjectKnowledgeBottomSheetDestination.Closed.class), kceVar.b(ProjectKnowledgeBottomSheetDestination.CreateDoc.class)}, new KSerializer[]{new lq6("com.anthropic.claude.project.knowledge.ProjectKnowledgeBottomSheetDestination.AddContent", ProjectKnowledgeBottomSheetDestination.AddContent.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.project.knowledge.ProjectKnowledgeBottomSheetDestination.Closed", ProjectKnowledgeBottomSheetDestination.Closed.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.project.knowledge.ProjectKnowledgeBottomSheetDestination.CreateDoc", ProjectKnowledgeBottomSheetDestination.CreateDoc.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
