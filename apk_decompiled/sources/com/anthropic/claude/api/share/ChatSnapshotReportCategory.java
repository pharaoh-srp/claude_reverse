package com.anthropic.claude.api.share;

import defpackage.dc3;
import defpackage.ec3;
import defpackage.fq6;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/anthropic/claude/api/share/ChatSnapshotReportCategory;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "dc3", "COPYRIGHT_INFRINGEMENT", "TRADEMARK_INFRINGEMENT", "CHILD_SAFETY", "FRAUD", "ADULT_CONTENT", "VIOLENCE_AND_HATE", "ILLEGAL_GOODS", "COURT_ORDER", "PRIVATE_OR_CONFIDENTIAL_INFORMATION", "OTHER_ILLEGAL", "OTHER", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = ec3.class)
public final class ChatSnapshotReportCategory {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ ChatSnapshotReportCategory[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final dc3 Companion;
    public static final ChatSnapshotReportCategory COPYRIGHT_INFRINGEMENT = new ChatSnapshotReportCategory("COPYRIGHT_INFRINGEMENT", 0);
    public static final ChatSnapshotReportCategory TRADEMARK_INFRINGEMENT = new ChatSnapshotReportCategory("TRADEMARK_INFRINGEMENT", 1);
    public static final ChatSnapshotReportCategory CHILD_SAFETY = new ChatSnapshotReportCategory("CHILD_SAFETY", 2);
    public static final ChatSnapshotReportCategory FRAUD = new ChatSnapshotReportCategory("FRAUD", 3);
    public static final ChatSnapshotReportCategory ADULT_CONTENT = new ChatSnapshotReportCategory("ADULT_CONTENT", 4);
    public static final ChatSnapshotReportCategory VIOLENCE_AND_HATE = new ChatSnapshotReportCategory("VIOLENCE_AND_HATE", 5);
    public static final ChatSnapshotReportCategory ILLEGAL_GOODS = new ChatSnapshotReportCategory("ILLEGAL_GOODS", 6);
    public static final ChatSnapshotReportCategory COURT_ORDER = new ChatSnapshotReportCategory("COURT_ORDER", 7);
    public static final ChatSnapshotReportCategory PRIVATE_OR_CONFIDENTIAL_INFORMATION = new ChatSnapshotReportCategory("PRIVATE_OR_CONFIDENTIAL_INFORMATION", 8);
    public static final ChatSnapshotReportCategory OTHER_ILLEGAL = new ChatSnapshotReportCategory("OTHER_ILLEGAL", 9);
    public static final ChatSnapshotReportCategory OTHER = new ChatSnapshotReportCategory("OTHER", 10);

    private static final /* synthetic */ ChatSnapshotReportCategory[] $values() {
        return new ChatSnapshotReportCategory[]{COPYRIGHT_INFRINGEMENT, TRADEMARK_INFRINGEMENT, CHILD_SAFETY, FRAUD, ADULT_CONTENT, VIOLENCE_AND_HATE, ILLEGAL_GOODS, COURT_ORDER, PRIVATE_OR_CONFIDENTIAL_INFORMATION, OTHER_ILLEGAL, OTHER};
    }

    static {
        ChatSnapshotReportCategory[] chatSnapshotReportCategoryArr$values = $values();
        $VALUES = chatSnapshotReportCategoryArr$values;
        $ENTRIES = wd6.n0(chatSnapshotReportCategoryArr$values);
        Companion = new dc3();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new wy2(18));
    }

    private ChatSnapshotReportCategory(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.api.share.ChatSnapshotReportCategory", values(), new String[]{"COPYRIGHT_INFRINGEMENT", "TRADEMARK_INFRINGEMENT", "CHILD_SAFETY", "FRAUD", "ADULT_CONTENT", "VIOLENCE_AND_HATE", "ILLEGAL_GOODS", "COURT_ORDER", "PRIVATE_OR_CONFIDENTIAL_INFORMATION", "OTHER_ILLEGAL", "OTHER"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static ChatSnapshotReportCategory valueOf(String str) {
        return (ChatSnapshotReportCategory) Enum.valueOf(ChatSnapshotReportCategory.class, str);
    }

    public static ChatSnapshotReportCategory[] values() {
        return (ChatSnapshotReportCategory[]) $VALUES.clone();
    }
}
