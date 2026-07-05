package com.anthropic.claude.api.project;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rod;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wod;
import defpackage.xod;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/api/project/ProjectType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "wod", "UNKNOWN", "STUDENT", "HAYSTACK", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = xod.class)
public final class ProjectType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ProjectType[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final wod Companion;
    public static final ProjectType UNKNOWN = new ProjectType("UNKNOWN", 0);
    public static final ProjectType STUDENT = new ProjectType("STUDENT", 1);
    public static final ProjectType HAYSTACK = new ProjectType("HAYSTACK", 2);

    private static final /* synthetic */ ProjectType[] $values() {
        return new ProjectType[]{UNKNOWN, STUDENT, HAYSTACK};
    }

    static {
        ProjectType[] projectTypeArr$values = $values();
        $VALUES = projectTypeArr$values;
        $ENTRIES = wd6.n0(projectTypeArr$values);
        Companion = new wod();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new rod(1));
    }

    private ProjectType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.project.ProjectType", values(), new String[]{"unknown", "student", "haystack"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ProjectType valueOf(String str) {
        return (ProjectType) Enum.valueOf(ProjectType.class, str);
    }

    public static ProjectType[] values() {
        return (ProjectType[]) $VALUES.clone();
    }
}
