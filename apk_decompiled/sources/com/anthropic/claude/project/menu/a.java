package com.anthropic.claude.project.menu;

import com.anthropic.claude.project.menu.ProjectItemMenuDialogDestination;
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
        return new odf("com.anthropic.claude.project.menu.ProjectItemMenuDialogDestination", kceVar.b(ProjectItemMenuDialogDestination.class), new pl9[]{kceVar.b(ProjectItemMenuDialogDestination.Delete.class), kceVar.b(ProjectItemMenuDialogDestination.Dismissed.class), kceVar.b(ProjectItemMenuDialogDestination.Rename.class)}, new KSerializer[]{new lq6("com.anthropic.claude.project.menu.ProjectItemMenuDialogDestination.Delete", ProjectItemMenuDialogDestination.Delete.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.project.menu.ProjectItemMenuDialogDestination.Dismissed", ProjectItemMenuDialogDestination.Dismissed.INSTANCE, new Annotation[0]), new lq6("com.anthropic.claude.project.menu.ProjectItemMenuDialogDestination.Rename", ProjectItemMenuDialogDestination.Rename.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
