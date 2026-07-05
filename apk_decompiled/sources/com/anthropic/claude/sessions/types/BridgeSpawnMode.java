package com.anthropic.claude.sessions.types;

import defpackage.fq6;
import defpackage.gx1;
import defpackage.hx1;
import defpackage.kw9;
import defpackage.ll1;
import defpackage.mdj;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/sessions/types/BridgeSpawnMode;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "gx1", "SingleSession", "Worktree", "SameDir", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = hx1.class)
public final class BridgeSpawnMode {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ BridgeSpawnMode[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final gx1 Companion;
    public static final BridgeSpawnMode SingleSession = new BridgeSpawnMode("SingleSession", 0);
    public static final BridgeSpawnMode Worktree = new BridgeSpawnMode("Worktree", 1);
    public static final BridgeSpawnMode SameDir = new BridgeSpawnMode("SameDir", 2);

    private static final /* synthetic */ BridgeSpawnMode[] $values() {
        return new BridgeSpawnMode[]{SingleSession, Worktree, SameDir};
    }

    static {
        BridgeSpawnMode[] bridgeSpawnModeArr$values = $values();
        $VALUES = bridgeSpawnModeArr$values;
        $ENTRIES = wd6.n0(bridgeSpawnModeArr$values);
        Companion = new gx1();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new ll1(11));
    }

    private BridgeSpawnMode(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.BridgeSpawnMode", values(), new String[]{"single-session", "worktree", "same-dir"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static BridgeSpawnMode valueOf(String str) {
        return (BridgeSpawnMode) Enum.valueOf(BridgeSpawnMode.class, str);
    }

    public static BridgeSpawnMode[] values() {
        return (BridgeSpawnMode[]) $VALUES.clone();
    }
}
