package com.anthropic.claude.api.project;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mgd;
import defpackage.mnd;
import defpackage.nnd;
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/anthropic/claude/api/project/ProjectPermission;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "mnd", "UNKNOWN", "VIEW", "CHAT_CREATE", "CHAT_VIEW", "VIEW_KNOWLEDGE", "EDIT_KNOWLEDGE", "EDIT_SETTINGS", "MEMBERS_MANAGE", "OWNER_MANAGE", "DELETE", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = nnd.class)
public final class ProjectPermission {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ProjectPermission[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final mnd Companion;
    public static final ProjectPermission UNKNOWN = new ProjectPermission("UNKNOWN", 0);
    public static final ProjectPermission VIEW = new ProjectPermission("VIEW", 1);
    public static final ProjectPermission CHAT_CREATE = new ProjectPermission("CHAT_CREATE", 2);
    public static final ProjectPermission CHAT_VIEW = new ProjectPermission("CHAT_VIEW", 3);
    public static final ProjectPermission VIEW_KNOWLEDGE = new ProjectPermission("VIEW_KNOWLEDGE", 4);
    public static final ProjectPermission EDIT_KNOWLEDGE = new ProjectPermission("EDIT_KNOWLEDGE", 5);
    public static final ProjectPermission EDIT_SETTINGS = new ProjectPermission("EDIT_SETTINGS", 6);
    public static final ProjectPermission MEMBERS_MANAGE = new ProjectPermission("MEMBERS_MANAGE", 7);
    public static final ProjectPermission OWNER_MANAGE = new ProjectPermission("OWNER_MANAGE", 8);
    public static final ProjectPermission DELETE = new ProjectPermission("DELETE", 9);

    private static final /* synthetic */ ProjectPermission[] $values() {
        return new ProjectPermission[]{UNKNOWN, VIEW, CHAT_CREATE, CHAT_VIEW, VIEW_KNOWLEDGE, EDIT_KNOWLEDGE, EDIT_SETTINGS, MEMBERS_MANAGE, OWNER_MANAGE, DELETE};
    }

    static {
        ProjectPermission[] projectPermissionArr$values = $values();
        $VALUES = projectPermissionArr$values;
        $ENTRIES = wd6.n0(projectPermissionArr$values);
        Companion = new mnd();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new mgd(28));
    }

    private ProjectPermission(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.project.ProjectPermission", values(), new String[]{"unknown", "chat_project:view", "chat_project:chat:create", "chat_project:chat:view", "chat_project:knowledge:view", "chat_project:knowledge:edit", "chat_project:settings:edit", "chat_project:members:manage", "chat_project:owner:manage", "chat_project:delete"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ProjectPermission valueOf(String str) {
        return (ProjectPermission) Enum.valueOf(ProjectPermission.class, str);
    }

    public static ProjectPermission[] values() {
        return (ProjectPermission[]) $VALUES.clone();
    }
}
