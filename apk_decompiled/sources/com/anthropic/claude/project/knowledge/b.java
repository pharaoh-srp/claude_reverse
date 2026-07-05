package com.anthropic.claude.project.knowledge;

import com.anthropic.claude.project.knowledge.ProjectDocMenuDialogDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final /* synthetic */ b a = new b();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.project.knowledge.ProjectDocMenuDialogDestination", kceVar.b(ProjectDocMenuDialogDestination.class), new pl9[]{kceVar.b(ProjectDocMenuDialogDestination.Delete.class), kceVar.b(ProjectDocMenuDialogDestination.Dismissed.class)}, new KSerializer[]{new lq6("com.anthropic.claude.project.knowledge.ProjectDocMenuDialogDestination.Delete", ProjectDocMenuDialogDestination.Delete.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.project.knowledge.ProjectDocMenuDialogDestination.Dismissed", ProjectDocMenuDialogDestination.Dismissed.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
