package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kpd;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rod;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentSource", "", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "kpd", "UNSPECIFIED", "MANUAL_ENTRY", "FILE_PICKER", "DRAG_AND_DROP_IN_DOCUMENT_LIST", "DRAG_AND_DROP_IN_PROJECT_DETAIL", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ProjectsEvents$ProjectDocumentSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ProjectsEvents$ProjectDocumentSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final kpd Companion;
    public static final ProjectsEvents$ProjectDocumentSource UNSPECIFIED = new ProjectsEvents$ProjectDocumentSource("UNSPECIFIED", 0);
    public static final ProjectsEvents$ProjectDocumentSource MANUAL_ENTRY = new ProjectsEvents$ProjectDocumentSource("MANUAL_ENTRY", 1);
    public static final ProjectsEvents$ProjectDocumentSource FILE_PICKER = new ProjectsEvents$ProjectDocumentSource("FILE_PICKER", 2);
    public static final ProjectsEvents$ProjectDocumentSource DRAG_AND_DROP_IN_DOCUMENT_LIST = new ProjectsEvents$ProjectDocumentSource("DRAG_AND_DROP_IN_DOCUMENT_LIST", 3);
    public static final ProjectsEvents$ProjectDocumentSource DRAG_AND_DROP_IN_PROJECT_DETAIL = new ProjectsEvents$ProjectDocumentSource("DRAG_AND_DROP_IN_PROJECT_DETAIL", 4);

    private static final /* synthetic */ ProjectsEvents$ProjectDocumentSource[] $values() {
        return new ProjectsEvents$ProjectDocumentSource[]{UNSPECIFIED, MANUAL_ENTRY, FILE_PICKER, DRAG_AND_DROP_IN_DOCUMENT_LIST, DRAG_AND_DROP_IN_PROJECT_DETAIL};
    }

    static {
        ProjectsEvents$ProjectDocumentSource[] projectsEvents$ProjectDocumentSourceArr$values = $values();
        $VALUES = projectsEvents$ProjectDocumentSourceArr$values;
        $ENTRIES = wd6.n0(projectsEvents$ProjectDocumentSourceArr$values);
        Companion = new kpd();
        $cachedSerializer$delegate = yb5.w(w1a.F, new rod(5));
    }

    private ProjectsEvents$ProjectDocumentSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ProjectsEvents.ProjectDocumentSource", values(), new String[]{"unknown", "manual_entry", "file_picker", "drag_and_drop_in_document_list", "drag_and_drop_in_project_detail"}, new Annotation[][]{null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ProjectsEvents$ProjectDocumentSource valueOf(String str) {
        return (ProjectsEvents$ProjectDocumentSource) Enum.valueOf(ProjectsEvents$ProjectDocumentSource.class, str);
    }

    public static ProjectsEvents$ProjectDocumentSource[] values() {
        return (ProjectsEvents$ProjectDocumentSource[]) $VALUES.clone();
    }
}
