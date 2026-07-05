package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.rk3;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import defpackage.ye6;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"com/anthropic/claude/analytics/events/DrawerEvents$DrawerItem", "", "Lcom/anthropic/claude/analytics/events/DrawerEvents$DrawerItem;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ye6", "UNSPECIFIED", "NEW_CHAT", "CHATS", "CHAT", "PROJECTS", "PROJECT", "ARTIFACTS", "CODE", "COWORK", "CONWAY", "TASKS", "SETTINGS", "RESTRICTED", "WORDMARK", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class DrawerEvents$DrawerItem {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ DrawerEvents$DrawerItem[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ye6 Companion;
    public static final DrawerEvents$DrawerItem UNSPECIFIED = new DrawerEvents$DrawerItem("UNSPECIFIED", 0);
    public static final DrawerEvents$DrawerItem NEW_CHAT = new DrawerEvents$DrawerItem("NEW_CHAT", 1);
    public static final DrawerEvents$DrawerItem CHATS = new DrawerEvents$DrawerItem("CHATS", 2);
    public static final DrawerEvents$DrawerItem CHAT = new DrawerEvents$DrawerItem("CHAT", 3);
    public static final DrawerEvents$DrawerItem PROJECTS = new DrawerEvents$DrawerItem("PROJECTS", 4);
    public static final DrawerEvents$DrawerItem PROJECT = new DrawerEvents$DrawerItem("PROJECT", 5);
    public static final DrawerEvents$DrawerItem ARTIFACTS = new DrawerEvents$DrawerItem("ARTIFACTS", 6);
    public static final DrawerEvents$DrawerItem CODE = new DrawerEvents$DrawerItem("CODE", 7);
    public static final DrawerEvents$DrawerItem COWORK = new DrawerEvents$DrawerItem("COWORK", 8);
    public static final DrawerEvents$DrawerItem CONWAY = new DrawerEvents$DrawerItem("CONWAY", 9);
    public static final DrawerEvents$DrawerItem TASKS = new DrawerEvents$DrawerItem("TASKS", 10);
    public static final DrawerEvents$DrawerItem SETTINGS = new DrawerEvents$DrawerItem("SETTINGS", 11);
    public static final DrawerEvents$DrawerItem RESTRICTED = new DrawerEvents$DrawerItem("RESTRICTED", 12);
    public static final DrawerEvents$DrawerItem WORDMARK = new DrawerEvents$DrawerItem("WORDMARK", 13);

    private static final /* synthetic */ DrawerEvents$DrawerItem[] $values() {
        return new DrawerEvents$DrawerItem[]{UNSPECIFIED, NEW_CHAT, CHATS, CHAT, PROJECTS, PROJECT, ARTIFACTS, CODE, COWORK, CONWAY, TASKS, SETTINGS, RESTRICTED, WORDMARK};
    }

    static {
        DrawerEvents$DrawerItem[] drawerEvents$DrawerItemArr$values = $values();
        $VALUES = drawerEvents$DrawerItemArr$values;
        $ENTRIES = wd6.n0(drawerEvents$DrawerItemArr$values);
        Companion = new ye6();
        $cachedSerializer$delegate = yb5.w(w1a.F, new rk3(23));
    }

    private DrawerEvents$DrawerItem(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.DrawerEvents.DrawerItem", values(), new String[]{"unknown", "new_chat", "chats", "chat", "projects", "project", "artifacts", "code", "cowork", "conway", "tasks", "settings", "restricted", "wordmark"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static DrawerEvents$DrawerItem valueOf(String str) {
        return (DrawerEvents$DrawerItem) Enum.valueOf(DrawerEvents$DrawerItem.class, str);
    }

    public static DrawerEvents$DrawerItem[] values() {
        return (DrawerEvents$DrawerItem[]) $VALUES.clone();
    }
}
