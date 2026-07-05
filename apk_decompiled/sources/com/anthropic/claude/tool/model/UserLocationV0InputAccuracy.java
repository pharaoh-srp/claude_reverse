package com.anthropic.claude.tool.model;

import defpackage.fq6;
import defpackage.kdi;
import defpackage.kni;
import defpackage.kw9;
import defpackage.lni;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/anthropic/claude/tool/model/UserLocationV0InputAccuracy;", "", "", "loggingName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getLoggingName", "()Ljava/lang/String;", "Companion", "kni", "PRECISE", "APPROXIMATE", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = lni.class)
public final class UserLocationV0InputAccuracy {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ UserLocationV0InputAccuracy[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final kni Companion;
    private final String loggingName;
    public static final UserLocationV0InputAccuracy PRECISE = new UserLocationV0InputAccuracy("PRECISE", 0, "precise");
    public static final UserLocationV0InputAccuracy APPROXIMATE = new UserLocationV0InputAccuracy("APPROXIMATE", 1, "approximate");

    private static final /* synthetic */ UserLocationV0InputAccuracy[] $values() {
        return new UserLocationV0InputAccuracy[]{PRECISE, APPROXIMATE};
    }

    static {
        UserLocationV0InputAccuracy[] userLocationV0InputAccuracyArr$values = $values();
        $VALUES = userLocationV0InputAccuracyArr$values;
        $ENTRIES = wd6.n0(userLocationV0InputAccuracyArr$values);
        Companion = new kni();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new kdi(17));
    }

    private UserLocationV0InputAccuracy(String str, int i, String str2) {
        this.loggingName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.tool.model.UserLocationV0InputAccuracy", values(), new String[]{"precise", "approximate"}, new Annotation[][]{null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static UserLocationV0InputAccuracy valueOf(String str) {
        return (UserLocationV0InputAccuracy) Enum.valueOf(UserLocationV0InputAccuracy.class, str);
    }

    public static UserLocationV0InputAccuracy[] values() {
        return (UserLocationV0InputAccuracy[]) $VALUES.clone();
    }

    public final String getLoggingName() {
        return this.loggingName;
    }
}
