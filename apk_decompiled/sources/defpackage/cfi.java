package defpackage;

import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.anthropic.claude.api.tasks.f;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class cfi implements TaskSessionEvent {
    public final String a;
    public final JsonObject b;

    public cfi(String str, JsonObject jsonObject) {
        jsonObject.getClass();
        this.a = str;
        this.b = jsonObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfi)) {
            return false;
        }
        cfi cfiVar = (cfi) obj;
        return this.a.equals(cfiVar.a) && x44.r(this.b, cfiVar.b);
    }

    @Override // com.anthropic.claude.api.tasks.TaskSessionEvent
    public final String getId() {
        return f.a("id", this.b);
    }

    @Override // com.anthropic.claude.api.tasks.TaskSessionEvent
    public final String getStep_id() {
        return f.a("step_id", this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UnknownTaskSessionEvent(type=" + this.a + ", body=" + this.b + ")";
    }
}
