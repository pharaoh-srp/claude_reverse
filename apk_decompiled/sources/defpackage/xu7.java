package defpackage;

import com.segment.analytics.kotlin.core.BaseEvent;

/* JADX INFO: loaded from: classes.dex */
public final class xu7 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof xu7) {
            return this.a == ((xu7) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        return i == 0 ? "None" : i == 1 ? "Weight" : i == 2 ? "Style" : i == 65535 ? BaseEvent.ALL_INTEGRATIONS_KEY : "Invalid";
    }
}
