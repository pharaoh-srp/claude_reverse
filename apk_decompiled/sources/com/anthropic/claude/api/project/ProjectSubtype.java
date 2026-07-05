package com.anthropic.claude.api.project;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mgd;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.xnd;
import defpackage.yb5;
import defpackage.ynd;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/api/project/ProjectSubtype;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "xnd", "UNKNOWN", "STUDY", "CAREER", "RESEARCH", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = ynd.class)
public final class ProjectSubtype {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ProjectSubtype[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final xnd Companion;
    public static final ProjectSubtype UNKNOWN = new ProjectSubtype("UNKNOWN", 0);
    public static final ProjectSubtype STUDY = new ProjectSubtype("STUDY", 1);
    public static final ProjectSubtype CAREER = new ProjectSubtype("CAREER", 2);
    public static final ProjectSubtype RESEARCH = new ProjectSubtype("RESEARCH", 3);

    private static final /* synthetic */ ProjectSubtype[] $values() {
        return new ProjectSubtype[]{UNKNOWN, STUDY, CAREER, RESEARCH};
    }

    static {
        ProjectSubtype[] projectSubtypeArr$values = $values();
        $VALUES = projectSubtypeArr$values;
        $ENTRIES = wd6.n0(projectSubtypeArr$values);
        Companion = new xnd();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new mgd(29));
    }

    private ProjectSubtype(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.project.ProjectSubtype", values(), new String[]{"unknown", "study", "career", "research"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ProjectSubtype valueOf(String str) {
        return (ProjectSubtype) Enum.valueOf(ProjectSubtype.class, str);
    }

    public static ProjectSubtype[] values() {
        return (ProjectSubtype[]) $VALUES.clone();
    }
}
