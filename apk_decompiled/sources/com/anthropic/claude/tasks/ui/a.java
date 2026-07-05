package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import defpackage.jce;
import defpackage.kce;
import defpackage.lq6;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ a a = new a();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.tasks.ui.TasksBottomSheetDestination", kceVar.b(TasksBottomSheetDestination.class), new pl9[]{kceVar.b(TasksBottomSheetDestination.Closed.class), kceVar.b(TasksBottomSheetDestination.EventInspector.class), kceVar.b(TasksBottomSheetDestination.FormInput.class), kceVar.b(TasksBottomSheetDestination.StepDetail.class), kceVar.b(TasksBottomSheetDestination.TaskDetail.class), kceVar.b(TasksBottomSheetDestination.TaskList.class)}, new KSerializer[]{new lq6("com.anthropic.claude.tasks.ui.TasksBottomSheetDestination.Closed", TasksBottomSheetDestination.Closed.INSTANCE, new Annotation[0]), b.a, d.a, f.a, h.a, new lq6("com.anthropic.claude.tasks.ui.TasksBottomSheetDestination.TaskList", TasksBottomSheetDestination.TaskList.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
