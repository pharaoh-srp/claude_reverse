package defpackage;

import com.anthropic.claude.api.tasks.TaskStepStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class z8h implements b9h {
    public final String a;
    public final TaskStepStatus b;

    public z8h(String str, TaskStepStatus taskStepStatus) {
        taskStepStatus.getClass();
        this.a = str;
        this.b = taskStepStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8h)) {
            return false;
        }
        z8h z8hVar = (z8h) obj;
        return this.a.equals(z8hVar.a) && this.b == z8hVar.b;
    }

    @Override // defpackage.b9h
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StepStatus(key=" + this.a + ", status=" + this.b + ")";
    }
}
