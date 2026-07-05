package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.ppd;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileSource", "", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectFileSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ppd", "UNSPECIFIED", "PROJECT_FILE_CAMERA", "PROJECT_FILE_FILE_PICKER", "PROJECT_FILE_LIBRARY", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ProjectsEvents$ProjectFileSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ProjectsEvents$ProjectFileSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ppd Companion;
    public static final ProjectsEvents$ProjectFileSource UNSPECIFIED = new ProjectsEvents$ProjectFileSource("UNSPECIFIED", 0);
    public static final ProjectsEvents$ProjectFileSource PROJECT_FILE_CAMERA = new ProjectsEvents$ProjectFileSource("PROJECT_FILE_CAMERA", 1);
    public static final ProjectsEvents$ProjectFileSource PROJECT_FILE_FILE_PICKER = new ProjectsEvents$ProjectFileSource("PROJECT_FILE_FILE_PICKER", 2);
    public static final ProjectsEvents$ProjectFileSource PROJECT_FILE_LIBRARY = new ProjectsEvents$ProjectFileSource("PROJECT_FILE_LIBRARY", 3);

    private static final /* synthetic */ ProjectsEvents$ProjectFileSource[] $values() {
        return new ProjectsEvents$ProjectFileSource[]{UNSPECIFIED, PROJECT_FILE_CAMERA, PROJECT_FILE_FILE_PICKER, PROJECT_FILE_LIBRARY};
    }

    static {
        ProjectsEvents$ProjectFileSource[] projectsEvents$ProjectFileSourceArr$values = $values();
        $VALUES = projectsEvents$ProjectFileSourceArr$values;
        $ENTRIES = wd6.n0(projectsEvents$ProjectFileSourceArr$values);
        Companion = new ppd();
        $cachedSerializer$delegate = yb5.w(w1a.F, new rod(9));
    }

    private ProjectsEvents$ProjectFileSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ProjectsEvents.ProjectFileSource", values(), new String[]{"unknown", "camera", "file_picker", "library"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ProjectsEvents$ProjectFileSource valueOf(String str) {
        return (ProjectsEvents$ProjectFileSource) Enum.valueOf(ProjectsEvents$ProjectFileSource.class, str);
    }

    public static ProjectsEvents$ProjectFileSource[] values() {
        return (ProjectsEvents$ProjectFileSource[]) $VALUES.clone();
    }
}
