package com.anthropic.claude.sessions.types;

import defpackage.fhj;
import defpackage.fq6;
import defpackage.ghj;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/anthropic/claude/sessions/types/WorkerStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "fhj", "UNKNOWN", "PROCESSING", "IDLE", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = ghj.class)
public final class WorkerStatus {
    private static final /* synthetic */ fq6 $ENTRIES;
    private static final /* synthetic */ WorkerStatus[] $VALUES;
    private static final kw9 $cachedKeepSerializer$delegate;
    public static final fhj Companion;
    public static final WorkerStatus UNKNOWN = new WorkerStatus("UNKNOWN", 0);
    public static final WorkerStatus PROCESSING = new WorkerStatus("PROCESSING", 1);
    public static final WorkerStatus IDLE = new WorkerStatus("IDLE", 2);

    private static final /* synthetic */ WorkerStatus[] $values() {
        return new WorkerStatus[]{UNKNOWN, PROCESSING, IDLE};
    }

    static {
        WorkerStatus[] workerStatusArr$values = $values();
        $VALUES = workerStatusArr$values;
        $ENTRIES = wd6.n0(workerStatusArr$values);
        Companion = new fhj();
        $cachedKeepSerializer$delegate = yb5.w(w1a.F, new p3j(25));
    }

    private WorkerStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return oq5.w("com.anthropic.claude.sessions.types.WorkerStatus", values(), new String[]{"unknown", "processing", "idle"}, new Annotation[][]{null, null, null});
    }

    public static fq6 getEntries() {
        return $ENTRIES;
    }

    public static WorkerStatus valueOf(String str) {
        return (WorkerStatus) Enum.valueOf(WorkerStatus.class, str);
    }

    public static WorkerStatus[] values() {
        return (WorkerStatus[]) $VALUES.clone();
    }
}
