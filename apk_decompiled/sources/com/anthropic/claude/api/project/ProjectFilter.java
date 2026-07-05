package com.anthropic.claude.api.project;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.bmd;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mgd;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/api/project/ProjectFilter;", "", "", ExperienceToggle.DEFAULT_PARAM_KEY, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "bmd", "IS_CREATOR", "IS_SHARED_WITH_ORG", "IS_SHARED_WITH_ME", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ProjectFilter {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ProjectFilter[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final bmd Companion;
    private final String value;
    public static final ProjectFilter IS_CREATOR = new ProjectFilter("IS_CREATOR", 0, "is_creator");
    public static final ProjectFilter IS_SHARED_WITH_ORG = new ProjectFilter("IS_SHARED_WITH_ORG", 1, "is_shared_with_org");
    public static final ProjectFilter IS_SHARED_WITH_ME = new ProjectFilter("IS_SHARED_WITH_ME", 2, "is_shared_with_me");

    private static final /* synthetic */ ProjectFilter[] $values() {
        return new ProjectFilter[]{IS_CREATOR, IS_SHARED_WITH_ORG, IS_SHARED_WITH_ME};
    }

    static {
        ProjectFilter[] projectFilterArr$values = $values();
        $VALUES = projectFilterArr$values;
        $ENTRIES = wd6.n0(projectFilterArr$values);
        Companion = new bmd();
        $cachedSerializer$delegate = yb5.w(w1a.F, new mgd(12));
    }

    private ProjectFilter(String str, int i, String str2) {
        this.value = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.project.ProjectFilter", values(), new String[]{"is_creator", "is_shared_with_org", "is_shared_with_me"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ProjectFilter valueOf(String str) {
        return (ProjectFilter) Enum.valueOf(ProjectFilter.class, str);
    }

    public static ProjectFilter[] values() {
        return (ProjectFilter[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
