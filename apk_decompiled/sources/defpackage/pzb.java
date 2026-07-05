package defpackage;

import android.app.Notification;
import android.health.connect.datatypes.Metadata;
import android.health.connect.datatypes.MindfulnessSessionRecord;
import java.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class pzb {
    public static /* synthetic */ MindfulnessSessionRecord.Builder e(Metadata metadata, Instant instant, Instant instant2, int i) {
        return new MindfulnessSessionRecord.Builder(metadata, instant, instant2, i);
    }

    public static /* bridge */ /* synthetic */ MindfulnessSessionRecord g(Object obj) {
        return (MindfulnessSessionRecord) obj;
    }

    public static /* bridge */ /* synthetic */ Class i() {
        return Notification.ProgressStyle.class;
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ boolean p(Object obj) {
        return obj instanceof MindfulnessSessionRecord;
    }

    public static /* bridge */ /* synthetic */ Class r() {
        return MindfulnessSessionRecord.class;
    }
}
