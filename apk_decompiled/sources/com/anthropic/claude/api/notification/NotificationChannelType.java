package com.anthropic.claude.api.notification;

import defpackage.e2c;
import defpackage.fq6;
import defpackage.h7c;
import defpackage.kw9;
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
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/anthropic/claude/api/notification/NotificationChannelType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "h7c", "FCM", "APNS", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class NotificationChannelType {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ NotificationChannelType[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final h7c Companion;
    public static final NotificationChannelType FCM = new NotificationChannelType("FCM", 0);
    public static final NotificationChannelType APNS = new NotificationChannelType("APNS", 1);

    private static final /* synthetic */ NotificationChannelType[] $values() {
        return new NotificationChannelType[]{FCM, APNS};
    }

    static {
        NotificationChannelType[] notificationChannelTypeArr$values = $values();
        $VALUES = notificationChannelTypeArr$values;
        $ENTRIES = wd6.n0(notificationChannelTypeArr$values);
        Companion = new h7c();
        $cachedSerializer$delegate = yb5.w(w1a.F, new e2c(5));
    }

    private NotificationChannelType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.notification.NotificationChannelType", values(), new String[]{"FCM", "APNS"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static NotificationChannelType valueOf(String str) {
        return (NotificationChannelType) Enum.valueOf(NotificationChannelType.class, str);
    }

    public static NotificationChannelType[] values() {
        return (NotificationChannelType[]) $VALUES.clone();
    }
}
