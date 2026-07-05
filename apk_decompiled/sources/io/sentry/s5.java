package io.sentry;

/* JADX INFO: loaded from: classes.dex */
public enum s5 implements m2 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    s5(String str) {
        this.itemType = str;
    }

    public static s5 resolve(Object obj) {
        return obj instanceof j5 ? ((io.sentry.protocol.k) ((j5) obj).F.w(io.sentry.protocol.k.class, "feedback")) == null ? Event : Feedback : obj instanceof io.sentry.protocol.e0 ? Transaction : obj instanceof h7 ? Session : obj instanceof io.sentry.clientreport.b ? ClientReport : Attachment;
    }

    public static s5 valueOfLabel(String str) {
        for (s5 s5Var : values()) {
            if (s5Var.itemType.equals(str)) {
                return s5Var;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // io.sentry.m2
    public void serialize(q3 q3Var, a1 a1Var) {
        ((y) q3Var).A(this.itemType);
    }
}
