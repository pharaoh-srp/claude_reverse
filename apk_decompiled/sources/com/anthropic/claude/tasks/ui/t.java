package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.tasks.ui.TasksListOverlay;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class t {
    public static final /* synthetic */ t a = new t();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tasks.ui.TasksListOverlay", kceVar.b(TasksListOverlay.class), new pl9[]{kceVar.b(TasksListOverlay.BrowserTakeover.class), kceVar.b(TasksListOverlay.None.class)}, new KSerializer[]{r.a, new lq6("com.anthropic.claude.tasks.ui.TasksListOverlay.None", TasksListOverlay.None.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
