package com.anthropic.claude.analytics.events;

import defpackage.fq6;
import defpackage.g9b;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.ngb;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource", "", "Lcom/anthropic/claude/analytics/events/MessageFileEvents$DownloadSource;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ngb", "UNSPECIFIED", "DOCUMENT_PREVIEW", "WIGGLE_PRESENT_FILES", "WIGGLE_ARTIFACTS_SHEET", "IMAGE_PREVIEW", "WIGGLE_ARTIFACT_VIEWER", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class MessageFileEvents$DownloadSource {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ MessageFileEvents$DownloadSource[] $VALUES;
    private static final kw9 $cachedSerializer$delegate;
    public static final ngb Companion;
    public static final MessageFileEvents$DownloadSource UNSPECIFIED = new MessageFileEvents$DownloadSource("UNSPECIFIED", 0);
    public static final MessageFileEvents$DownloadSource DOCUMENT_PREVIEW = new MessageFileEvents$DownloadSource("DOCUMENT_PREVIEW", 1);
    public static final MessageFileEvents$DownloadSource WIGGLE_PRESENT_FILES = new MessageFileEvents$DownloadSource("WIGGLE_PRESENT_FILES", 2);
    public static final MessageFileEvents$DownloadSource WIGGLE_ARTIFACTS_SHEET = new MessageFileEvents$DownloadSource("WIGGLE_ARTIFACTS_SHEET", 3);
    public static final MessageFileEvents$DownloadSource IMAGE_PREVIEW = new MessageFileEvents$DownloadSource("IMAGE_PREVIEW", 4);
    public static final MessageFileEvents$DownloadSource WIGGLE_ARTIFACT_VIEWER = new MessageFileEvents$DownloadSource("WIGGLE_ARTIFACT_VIEWER", 5);

    private static final /* synthetic */ MessageFileEvents$DownloadSource[] $values() {
        return new MessageFileEvents$DownloadSource[]{UNSPECIFIED, DOCUMENT_PREVIEW, WIGGLE_PRESENT_FILES, WIGGLE_ARTIFACTS_SHEET, IMAGE_PREVIEW, WIGGLE_ARTIFACT_VIEWER};
    }

    static {
        MessageFileEvents$DownloadSource[] messageFileEvents$DownloadSourceArr$values = $values();
        $VALUES = messageFileEvents$DownloadSourceArr$values;
        $ENTRIES = wd6.n0(messageFileEvents$DownloadSourceArr$values);
        Companion = new ngb();
        $cachedSerializer$delegate = yb5.w(w1a.F, new g9b(10));
    }

    private MessageFileEvents$DownloadSource(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.analytics.events.MessageFileEvents.DownloadSource", values(), new String[]{"unspecified", "document_preview", "wiggle_present_files", "wiggle_artifacts_sheet", "image_preview", "wiggle_artifact_viewer"}, new Annotation[][]{null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static MessageFileEvents$DownloadSource valueOf(String str) {
        return (MessageFileEvents$DownloadSource) Enum.valueOf(MessageFileEvents$DownloadSource.class, str);
    }

    public static MessageFileEvents$DownloadSource[] values() {
        return (MessageFileEvents$DownloadSource[]) $VALUES.clone();
    }
}
