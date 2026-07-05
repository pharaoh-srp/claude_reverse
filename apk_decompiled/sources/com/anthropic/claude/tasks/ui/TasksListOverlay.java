package com.anthropic.claude.tasks.ui;

import com.anthropic.claude.types.strings.TaskId;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kw9;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n7h;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.z5h;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bs\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/anthropic/claude/tasks/ui/TasksListOverlay;", "", "Companion", "None", "BrowserTakeover", "com/anthropic/claude/tasks/ui/t", "Lcom/anthropic/claude/tasks/ui/TasksListOverlay$BrowserTakeover;", "Lcom/anthropic/claude/tasks/ui/TasksListOverlay$None;", "Claude:tasks"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public interface TasksListOverlay {
    public static final t Companion = t.a;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\n\u0010\f\u001a\u00020\rHÖ\u0081\u0004Ê\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000e"}, d2 = {"Lcom/anthropic/claude/tasks/ui/TasksListOverlay$None;", "Lcom/anthropic/claude/tasks/ui/TasksListOverlay;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "Claude:tasks", "Lkotlinx/serialization/Serializable;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class None implements TasksListOverlay {
        public static final int $stable = 0;
        public static final None INSTANCE = new None();
        private static final /* synthetic */ kw9 $cachedSerializer$delegate = yb5.w(w1a.F, new n7h(9));

        private None() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new lq6("com.anthropic.claude.tasks.ui.TasksListOverlay.None", INSTANCE, new Annotation[0]);
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return 473677033;
        }

        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lcom/anthropic/claude/tasks/ui/TasksListOverlay$BrowserTakeover;", "Lcom/anthropic/claude/tasks/ui/TasksListOverlay;", "", "takeoverPath", "Lcom/anthropic/claude/types/strings/TaskId;", "taskId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tasks", "(Lcom/anthropic/claude/tasks/ui/TasksListOverlay$BrowserTakeover;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2-Fx-cw9s", "component2", "copy-gch349w", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/tasks/ui/TasksListOverlay$BrowserTakeover;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTakeoverPath", "getTaskId-Fx-cw9s", "Companion", "com/anthropic/claude/tasks/ui/r", "com/anthropic/claude/tasks/ui/s", "Claude:tasks"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    @onf
    public static final /* data */ class BrowserTakeover implements TasksListOverlay {
        public static final int $stable = 0;
        public static final s Companion = new s();
        private final String takeoverPath;
        private final String taskId;

        private /* synthetic */ BrowserTakeover(int i, String str, String str2, vnf vnfVar) {
            if (3 != (i & 3)) {
                gvj.f(i, 3, r.a.getDescriptor());
                throw null;
            }
            this.takeoverPath = str;
            this.taskId = str2;
        }

        /* JADX INFO: renamed from: copy-gch349w$default, reason: not valid java name */
        public static /* synthetic */ BrowserTakeover m908copygch349w$default(BrowserTakeover browserTakeover, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = browserTakeover.takeoverPath;
            }
            if ((i & 2) != 0) {
                str2 = browserTakeover.taskId;
            }
            return browserTakeover.m910copygch349w(str, str2);
        }

        public static final /* synthetic */ void write$Self$Claude_tasks(BrowserTakeover self, vd4 output, SerialDescriptor serialDesc) {
            output.q(serialDesc, 0, self.takeoverPath);
            output.r(serialDesc, 1, z5h.a, TaskId.m1128boximpl(self.taskId));
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTakeoverPath() {
            return this.takeoverPath;
        }

        /* JADX INFO: renamed from: component2-Fx-cw9s, reason: not valid java name and from getter */
        public final String getTaskId() {
            return this.taskId;
        }

        /* JADX INFO: renamed from: copy-gch349w, reason: not valid java name */
        public final BrowserTakeover m910copygch349w(String takeoverPath, String taskId) {
            takeoverPath.getClass();
            taskId.getClass();
            return new BrowserTakeover(takeoverPath, taskId, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BrowserTakeover)) {
                return false;
            }
            BrowserTakeover browserTakeover = (BrowserTakeover) other;
            return x44.r(this.takeoverPath, browserTakeover.takeoverPath) && TaskId.m1131equalsimpl0(this.taskId, browserTakeover.taskId);
        }

        public final String getTakeoverPath() {
            return this.takeoverPath;
        }

        /* JADX INFO: renamed from: getTaskId-Fx-cw9s, reason: not valid java name */
        public final String m911getTaskIdFxcw9s() {
            return this.taskId;
        }

        public int hashCode() {
            return TaskId.m1132hashCodeimpl(this.taskId) + (this.takeoverPath.hashCode() * 31);
        }

        public String toString() {
            return ij0.l("BrowserTakeover(takeoverPath=", this.takeoverPath, ", taskId=", TaskId.m1133toStringimpl(this.taskId), ")");
        }

        public /* synthetic */ BrowserTakeover(String str, String str2, mq5 mq5Var) {
            this(str, str2);
        }

        public /* synthetic */ BrowserTakeover(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
            this(i, str, str2, vnfVar);
        }

        private BrowserTakeover(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.takeoverPath = str;
            this.taskId = str2;
        }
    }
}
