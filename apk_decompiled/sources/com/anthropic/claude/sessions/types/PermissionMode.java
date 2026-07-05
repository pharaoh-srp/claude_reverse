package com.anthropic.claude.sessions.types;

import defpackage.blc;
import defpackage.fq6;
import defpackage.ixc;
import defpackage.jxc;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wg6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/anthropic/claude/sessions/types/PermissionMode;", "", "<init>", "(Ljava/lang/String;I)V", "", "toWireFormat", "()Ljava/lang/String;", "Companion", "ixc", "Default", "Plan", "Auto", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class PermissionMode {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ PermissionMode[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ixc Companion;
    public static final PermissionMode Default = new PermissionMode("Default", 0);
    public static final PermissionMode Plan = new PermissionMode("Plan", 1);
    public static final PermissionMode Auto = new PermissionMode("Auto", 2);

    private static final /* synthetic */ PermissionMode[] $values() {
        return new PermissionMode[]{Default, Plan, Auto};
    }

    static {
        PermissionMode[] permissionModeArr$values = $values();
        $VALUES = permissionModeArr$values;
        $ENTRIES = wd6.n0(permissionModeArr$values);
        Companion = new ixc();
        $cachedSerializer$delegate = yb5.w(w1a.F, new blc(10));
    }

    private PermissionMode(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.PermissionMode", values(), new String[]{"default", "plan", "auto"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static PermissionMode valueOf(String str) {
        return (PermissionMode) Enum.valueOf(PermissionMode.class, str);
    }

    public static PermissionMode[] values() {
        return (PermissionMode[]) $VALUES.clone();
    }

    public final String toWireFormat() {
        int i = jxc.a[ordinal()];
        if (i == 1) {
            return "default";
        }
        if (i == 2) {
            return "plan";
        }
        if (i == 3) {
            return "auto";
        }
        wg6.i();
        return null;
    }
}
