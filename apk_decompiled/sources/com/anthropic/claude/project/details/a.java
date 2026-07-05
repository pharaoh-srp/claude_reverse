package com.anthropic.claude.project.details;

import com.anthropic.claude.project.details.ProjectDetailsDialogDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.project.details.ProjectDetailsDialogDestination", kceVar.b(ProjectDetailsDialogDestination.class), new pl9[]{kceVar.b(ProjectDetailsDialogDestination.Delete.class), kceVar.b(ProjectDetailsDialogDestination.Dismissed.class), kceVar.b(ProjectDetailsDialogDestination.Rename.class)}, new KSerializer[]{new lq6("com.anthropic.claude.project.details.ProjectDetailsDialogDestination.Delete", ProjectDetailsDialogDestination.Delete.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.project.details.ProjectDetailsDialogDestination.Dismissed", ProjectDetailsDialogDestination.Dismissed.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.project.details.ProjectDetailsDialogDestination.Rename", ProjectDetailsDialogDestination.Rename.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
