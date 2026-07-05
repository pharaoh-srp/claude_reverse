package com.anthropic.claude.sessions.types;

import defpackage.c97;
import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.o58;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/anthropic/claude/sessions/types/GitInfoType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "o58", "GITHUB", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class GitInfoType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ GitInfoType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final o58 Companion;
    public static final GitInfoType GITHUB = new GitInfoType("GITHUB", 0);

    private static final /* synthetic */ GitInfoType[] $values() {
        return new GitInfoType[]{GITHUB};
    }

    static {
        GitInfoType[] gitInfoTypeArr$values = $values();
        $VALUES = gitInfoTypeArr$values;
        $ENTRIES = wd6.n0(gitInfoTypeArr$values);
        Companion = new o58();
        $cachedSerializer$delegate = yb5.w(w1a.F, new c97(20));
    }

    private GitInfoType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.GitInfoType", values(), new String[]{"github"}, new Annotation[][]{null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static GitInfoType valueOf(String str) {
        return (GitInfoType) Enum.valueOf(GitInfoType.class, str);
    }

    public static GitInfoType[] values() {
        return (GitInfoType[]) $VALUES.clone();
    }
}
