package defpackage;

import com.anthropic.claude.api.tasks.TaskResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class l9h implements m9h {
    public final TaskResponse a;

    public l9h(TaskResponse taskResponse) {
        this.a = taskResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9h) && this.a.equals(((l9h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Snapshot(task=" + this.a + ")";
    }
}
