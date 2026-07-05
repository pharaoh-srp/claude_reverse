package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.jb3;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.wy2;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility", "", "Lcom/anthropic/claude/analytics/events/ChatSharingEvents$ChatShareVisibility;", "<init>", "(Ljava/lang/String;I)V", "Companion", "jb3", "UNSPECIFIED", "PRIVATE", "ORGANIZATION", "PUBLIC", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class ChatSharingEvents$ChatShareVisibility {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatSharingEvents$ChatShareVisibility[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final jb3 Companion;
    public static final ChatSharingEvents$ChatShareVisibility UNSPECIFIED = new ChatSharingEvents$ChatShareVisibility("UNSPECIFIED", 0);
    public static final ChatSharingEvents$ChatShareVisibility PRIVATE = new ChatSharingEvents$ChatShareVisibility("PRIVATE", 1);
    public static final ChatSharingEvents$ChatShareVisibility ORGANIZATION = new ChatSharingEvents$ChatShareVisibility("ORGANIZATION", 2);
    public static final ChatSharingEvents$ChatShareVisibility PUBLIC = new ChatSharingEvents$ChatShareVisibility("PUBLIC", 3);

    private static final /* synthetic */ ChatSharingEvents$ChatShareVisibility[] $values() {
        return new ChatSharingEvents$ChatShareVisibility[]{UNSPECIFIED, PRIVATE, ORGANIZATION, PUBLIC};
    }

    static {
        ChatSharingEvents$ChatShareVisibility[] chatSharingEvents$ChatShareVisibilityArr$values = $values();
        $VALUES = chatSharingEvents$ChatShareVisibilityArr$values;
        $ENTRIES = wd6.n0(chatSharingEvents$ChatShareVisibilityArr$values);
        Companion = new jb3();
        $cachedSerializer$delegate = yb5.w(w1a.F, new wy2(13));
    }

    private ChatSharingEvents$ChatShareVisibility(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.ChatSharingEvents.ChatShareVisibility", values(), new String[]{"unspecified", "private", "organization", "public"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatSharingEvents$ChatShareVisibility valueOf(String str) {
        return (ChatSharingEvents$ChatShareVisibility) Enum.valueOf(ChatSharingEvents$ChatShareVisibility.class, str);
    }

    public static ChatSharingEvents$ChatShareVisibility[] values() {
        return (ChatSharingEvents$ChatShareVisibility[]) $VALUES.clone();
    }
}
