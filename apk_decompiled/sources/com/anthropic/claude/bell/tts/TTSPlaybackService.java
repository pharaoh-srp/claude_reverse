package com.anthropic.claude.bell.tts;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.IBinder;
import com.anthropic.claude.R;
import defpackage.d4c;
import defpackage.o7c;
import defpackage.ozf;
import defpackage.xah;
import defpackage.zh7;
import defpackage.zy7;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class TTSPlaybackService extends Service {
    public static volatile zy7 F;
    public MediaSession E;

    public final Notification a() {
        ComponentName componentName = new ComponentName(getPackageName(), "com.anthropic.claude.deeplink.DeepLinkActivity");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setComponent(componentName);
        intent.setFlags(805306368);
        PendingIntent activity = PendingIntent.getActivity(this, 501, intent, 201326592);
        Intent intent2 = new Intent(this, (Class<?>) TTSPlaybackService.class);
        intent2.setAction("com.anthropic.claude.tts.STOP");
        PendingIntent service = PendingIntent.getService(this, 502, intent2, 201326592);
        o7c o7cVar = new o7c(this, "tts_playback_notification_channel");
        o7cVar.e = o7c.d(getString(R.string.tts_notification_title));
        o7cVar.z.icon = R.drawable.claude_spark;
        o7cVar.s = d4c.n0(zh7.a);
        o7cVar.j(2, true);
        o7cVar.j(16, false);
        o7cVar.g = activity;
        o7cVar.a(0, service, getString(R.string.button_stop));
        o7cVar.j = -1;
        o7cVar.A = true;
        Notification notificationC = o7cVar.c();
        notificationC.getClass();
        return notificationC;
    }

    public final void b(boolean z) {
        PlaybackState playbackStateBuild = new PlaybackState.Builder().setState(z ? 3 : 2, -1L, 1.0f).setActions(0L).build();
        MediaSession mediaSession = this.E;
        if (mediaSession != null) {
            mediaSession.setPlaybackState(playbackStateBuild);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        MediaSession mediaSession = this.E;
        if (mediaSession != null) {
            mediaSession.setActive(false);
        }
        MediaSession mediaSession2 = this.E;
        if (mediaSession2 != null) {
            mediaSession2.release();
        }
        this.E = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 294864574) {
                if (iHashCode == 455322679 && action.equals("com.anthropic.claude.tts.UPDATE_STATE")) {
                    b(intent.getBooleanExtra("is_playing", true));
                    return 2;
                }
            } else if (action.equals("com.anthropic.claude.tts.STOP")) {
                zy7 zy7Var = F;
                if (zy7Var != null) {
                    zy7Var.a();
                    return 2;
                }
                stopSelf();
                return 2;
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            try {
                startForeground(501, a(), 2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                List list = xah.a;
                ozf ozfVar = ozf.F;
                Map mapSingletonMap = Collections.singletonMap("category", "tts");
                mapSingletonMap.getClass();
                xah.f(e, "TTSPlaybackService: startForeground() not allowed. Stopping service.", ozfVar, mapSingletonMap, 16);
                stopSelf();
                return 2;
            }
        } else if (i3 >= 30) {
            startForeground(501, a(), 2);
        } else {
            startForeground(501, a());
        }
        MediaSession mediaSession = this.E;
        if (mediaSession != null) {
            mediaSession.setActive(false);
        }
        MediaSession mediaSession2 = this.E;
        if (mediaSession2 != null) {
            mediaSession2.release();
        }
        this.E = null;
        MediaSession mediaSession3 = new MediaSession(this, "TTSPlayback");
        mediaSession3.setActive(true);
        this.E = mediaSession3;
        b(true);
        return 2;
    }
}
