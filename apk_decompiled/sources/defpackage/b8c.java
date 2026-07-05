package defpackage;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b8c {
    public static void a(Notification.ProgressStyle progressStyle, int i) {
        progressStyle.setProgress(i);
    }

    public static void b(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    public static void c(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setProgressIndeterminate(z);
    }

    public static void d(Notification.ProgressStyle progressStyle, List<c8c> list) {
        for (c8c c8cVar : list) {
            progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(c8cVar.a).setColor(c8cVar.c).setId(c8cVar.b));
        }
    }

    public static void e(Notification.ProgressStyle progressStyle, List<d8c> list) {
        for (d8c d8cVar : list) {
            progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(d8cVar.a).setColor(d8cVar.c).setId(d8cVar.b));
        }
    }

    public static void f(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    public static void g(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    public static void h(Notification.ProgressStyle progressStyle, boolean z) {
        progressStyle.setStyledByProgress(z);
    }
}
