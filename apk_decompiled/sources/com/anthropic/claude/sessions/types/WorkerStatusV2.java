package com.anthropic.claude.sessions.types;

import defpackage.fq6;
import defpackage.hhj;
import defpackage.ihj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.onf;
import defpackage.oq5;
import defpackage.p3j;
import defpackage.w1a;
import defpackage.wd6;
import defpackage.yb5;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/anthropic/claude/sessions/types/WorkerStatusV2;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "hhj", "UNKNOWN", "RUNNING", "IDLE", "REQUIRES_ACTION", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = ihj.class)
public final class WorkerStatusV2 {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ WorkerStatusV2[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final hhj Companion;
    public static final WorkerStatusV2 UNKNOWN = new WorkerStatusV2("UNKNOWN", 0);
    public static final WorkerStatusV2 RUNNING = new WorkerStatusV2("RUNNING", 1);
    public static final WorkerStatusV2 IDLE = new WorkerStatusV2("IDLE", 2);
    public static final WorkerStatusV2 REQUIRES_ACTION = new WorkerStatusV2("REQUIRES_ACTION", 3);

    private static final /* synthetic */ WorkerStatusV2[] $values() {
        return new WorkerStatusV2[]{UNKNOWN, RUNNING, IDLE, REQUIRES_ACTION};
    }

    static {
        WorkerStatusV2[] workerStatusV2Arr$values = $values();
        $VALUES = workerStatusV2Arr$values;
        $ENTRIES = wd6.n0(workerStatusV2Arr$values);
        Companion = new hhj();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new p3j(26));
    }

    private WorkerStatusV2(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.WorkerStatusV2", values(), new String[]{"unknown", "running", "idle", "requires_action"}, new Annotation[][]{null, null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static WorkerStatusV2 valueOf(String str) {
        return (WorkerStatusV2) Enum.valueOf(WorkerStatusV2.class, str);
    }

    public static WorkerStatusV2[] values() {
        return (WorkerStatusV2[]) $VALUES.clone();
    }
}
